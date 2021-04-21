package com.edusystem.entity.Response;

/**
 * 统一返回值格式
 * 由于viue-element-admin有自己的格式 因此按照其格式进行返回值格式定义
 * @author 花菜
 * @date 2021/3/31 16:10
 */
public class ResponseResult<T> {
    private StatusCode statusCode;
    private String Info;
    private T data;

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public String getInfo() {
        return Info;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setInfo(String info) {
        Info = info;
    }


    public ResponseResult(StatusCode statusCode, String info, T data) {
        this.statusCode = statusCode;
        Info = info;
        this.data = data;
    }

    public ResponseResult(StatusCode statusCode, String info) {
        this.statusCode = statusCode;
        Info = info;
    }


    public ResponseResult() {
    }

    @Override
    public String toString() {
        return "Restful{" +
                "statusCode=" + statusCode +
                ", Info='" + Info + '\'' +
                ", data=" + data +
                '}';
    }
}
