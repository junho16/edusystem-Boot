package com.edusystem.Interceptor;


import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.edusystem.entity.Response.MyResponse;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * jwt拦截器
 */
@Slf4j
public class JWTInterceptor implements HandlerInterceptor {
//    @Autowired
//    private HttpServletRequest requestt;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
/**
 * TODO-这是未解决的问题==》在登录时 获取info时可以获取到头部的信息 但是在其他的请求中却无法get到请求头中的token信息 只能通过参数获取
 * ===》一般的请求String token = request.getHeader("token"); 此获取的是null 、但是info可以获取到
 */
//        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest requestt = servletRequestAttributes.getRequest();
//        log.info("当前token为从头部信息”token“中获取 ！！！！！值为==》{}", requestt.getHeader("token"));==》这种方式获取的一直是null；

        //获取请求头中的令牌
        String token = request.getHeader("token");
        if(token == null || token.equals("")){
            token = request.getParameter("token");
            if(token == null || token.equals("")){
                token = request.getHeader("X-Token");
                if(token == null || token.equals("")){
                    token = request.getHeader("Token");
                    if(token == null || token.equals("")){
                        log.info("未获取到token");
                    }else{
                        log.info("当前token为从头部信息”Token“中获取 值为：{}", token);
                    }
                }else{
                    log.info("当前token为从头部信息”X-Token“中获取 值为：{}", token);
                }
            }else{
                log.info("当前token为从参数“token”中获取 值为：{}", token);
            }
        }else{
            log.info("当前token为从头部信息”token“中获取 值为：{}", token);
        }

        MyResponse res;
        try {
            JWTUtils.verify(token);
            return true;
        } catch (SignatureVerificationException e) {
            e.printStackTrace();
            res = new MyResponse(MyResponse.Fail_Illegal_Token,"签名不一致","");
        } catch (TokenExpiredException e) {
            e.printStackTrace();
            res = new MyResponse(MyResponse.Fail_Token_Expired,"令牌过期","");
        } catch (AlgorithmMismatchException e) {
            e.printStackTrace();
            res = new MyResponse(MyResponse.Fail_CODE,"算法不匹配","");
        } catch (InvalidClaimException e) {
            e.printStackTrace();
            res = new MyResponse(MyResponse.Fail_CODE,"失效的payload","");
        } catch (Exception e) {
            e.printStackTrace();
            res = new MyResponse(MyResponse.Fail_Illegal_Token,"token无效","");
        }
        //响应到前台: 将res转为json字符串再转json对象
        String s = JSONObject.toJSONString(res);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println( JSONObject.parse(s));
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
