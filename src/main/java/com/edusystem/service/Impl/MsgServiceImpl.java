package com.edusystem.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.edusystem.dto.UserDto;
import com.edusystem.entity.*;
import com.edusystem.mapper.MsgMapper;
import com.edusystem.mapper.StudentMapper;
import com.edusystem.service.MsgService;
import com.edusystem.service.TipService;
import com.edusystem.util.DateUtil;
import com.edusystem.util.JWTUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 花菜
 * @date 2021/5/16 14:15
 */
@Service
@Slf4j
public class MsgServiceImpl implements MsgService {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    MsgMapper msgMapper;

    @Autowired
    TipServiceImpl tipService;

    @Override
    public HashMap createMsgInfo(Map datamap, String token) {
        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        Msg msg = new Msg();
        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        String msgid = UUID.randomUUID().toString().substring(0,8);
        msg.setMsgId(msgid);
        msg.setStudentId(username);
        Student s = studentMapper.selectByPrimaryKey(username);
        msg.setStudentName(s.getStudentName());
        msg.setMsgTitle((String)data.get("xzxx_title"));
        msg.setMsgContent((String)data.get("xxzx_content"));

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNow = df.format(new Date());
        try {
            msg.setMsgCreatetime(DateUtil.getDateWithStr(dateNow));
        } catch (ParseException e) {
            log.error("方法：创建校长信箱的提问记录。获取系统当前时间错误~");
            e.printStackTrace();
        }

        msg.setMsgIsreply("0");

        try{
            int ress = msgMapper.insertSelective(msg);
            if(ress >= 1){
                res.put(20000,"创建校长信箱的提问记录成功！");

                HashMap h = new HashMap();
                h.put("msg_id" , msgid  );
                h.put("msg_title" , (String)data.get("xzxx_title")  );
                h.put("msg_time" ,  (dateNow) );
                //校长信箱-您已成功完成提问 （提问编号：XXX，时间：XXX）
                tipService.createTip( username , 15 , h);
            }
            else
                res.put(18000,"创建校长信箱的提问记录失败！服务器内部错误！");
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：创建校长信箱的提问记录。插入数据错误！");
            res.put(18000,"创建校长信箱的提问记录失败！服务器内部错误！");
            return res;
        }
    }

    @Override
    public HashMap getMsgList( String token) {
        HashMap<Integer,Object> res = new HashMap<>();

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();

        MsgExample msgExample = new MsgExample();
        MsgExample.Criteria criteria  = msgExample.createCriteria();
        msgExample.setOrderByClause("msg_createTime DESC");

        criteria.andMsgIdIsNotNull();

        if(loginrole.equals("student"))
            //为1则是已回复
            criteria.andMsgIsreplyEqualTo("1");

        try{
            List<Msg> msgList = msgMapper.selectByExample(msgExample);
            res.put(20000,msgList);
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：获取校长信箱的提问记录。获取数据错误！");
            res.put(18000,"获取校长信箱的提问记录失败！服务器内部错误！");
            return res;
        }
    }

    @Override
    public HashMap huifuMsg(Map datamap, String token) {

        HashMap<Integer,String> res = new HashMap<>();
        JSONObject data = JSONObject.parseObject((String) datamap.get("data"));

        DecodedJWT verify = JWTUtils.verify(token);
        String username = verify.getClaim("username").asString();
        String loginrole = verify.getClaim("loginrole").asString();


        Msg msg = msgMapper.selectByPrimaryKey((String)data.get("id"));
        msg.setMsgReplycontent((String)data.get("huifutext"));
        msg.setMsgIsreply("1");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNow = df.format(new Date());
        try {
            msg.setMsgReplytime(DateUtil.getDateWithStr(dateNow));
        } catch (ParseException e) {
            log.error("方法：回复校长信箱的提问。获取系统当前时间错误~");
            e.printStackTrace();
        }



        try{
            int ress = msgMapper.updateByPrimaryKey(msg);
            if(ress >= 1){
                res.put(20000,"回复校长信箱的提问成功！");

                HashMap h = new HashMap();
                h.put("msg_id" ,  (String)data.get("id")   );
                h.put("msg_fromid" , (String)data.get("fromid")  );
                h.put("msg_title" , msg.getMsgTitle().split("---")[0]  );
                h.put("msg_time" ,  (dateNow) );
                //校长信箱-您的提问已被回复 （提问编号：XXX，主题：XXX；时间：XXX）
                tipService.createTip( username , 16 , h);
            }
            else
                res.put(18000,"回复校长信箱的提问失败！服务器内部错误！");
            return res;
        }catch(Exception e){
            e.printStackTrace();
            log.error("方法：回复校长信箱的提问。插入数据错误！");
            res.put(18000,"回复校长信箱的提问失败！服务器内部错误！");
            return res;
        }
    }

}
