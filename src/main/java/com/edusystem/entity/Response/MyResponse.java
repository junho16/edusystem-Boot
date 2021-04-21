package com.edusystem.entity.Response;

/**
 * ResponseResult里面有三个参数 此返回值是只有两个参数
 * @author 花菜
 * @date 2021/4/1 1:48
 */
public class MyResponse<T> {
    public static final Integer SUCCESS_CODE = 20000;
    public static final Integer Fail_CODE = 18000;// 一般错误
    public static final Integer  Fail_Illegal_Token = 50008;//非法令牌
    public static final Integer  Fail_Other_Clients_loggedIn = 50012;//其他客户端登录
    public static final Integer  Fail_Token_Expired = 50014;//令牌已过期
    public static final String SUCCESS_MSG = "请求成功";

    private Integer code;
    private String message;
    private T data;

    public MyResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public MyResponse(Integer code , T data) {
        this.code = code;
        this.data = data;
    }
    public MyResponse() {
    }

    public static Integer getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getSuccessMsg() {
        return SUCCESS_MSG;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
