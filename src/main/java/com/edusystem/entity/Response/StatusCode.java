package com.edusystem.entity.Response;

public class StatusCode {
    public static StatusCode OK = new StatusCode(20000,"OK");
    public static StatusCode CREATED=new StatusCode(201,"CREATED");
    public static StatusCode ACCEPTED=new StatusCode(202,"Accepted");
    public static StatusCode NO_CONTENT=new StatusCode(204,"NO CONTENT");
    public static StatusCode INVALID_REQUEST=new StatusCode(400,"INVALID REQUEST");
    public static StatusCode UNAUTHORIZED=new StatusCode(401,"Unauthorized");
    public static StatusCode FORBIDDEN=new StatusCode(403,"Forbidden");
    public static StatusCode NOT_FOUND=new StatusCode(404,"NOT FOUND");
    public static StatusCode NOT_ACCEPTABLE=new StatusCode(406,"Not Acceptable");
    public static StatusCode GONE=new StatusCode(410,"Gone");
    public static StatusCode UNPROCESABLE_ENTITY=new StatusCode(422,"Unprocesable entity");
    public static StatusCode INTERNALSERVER_ERROR=new StatusCode(500,"INTERNAL SERVER ERROR");
    public static StatusCode GATE_ERROR=new StatusCode(502,"Gate Error");
    public static StatusCode SERVICE_UNAVAILABLE=new StatusCode(503,"service Unavailable");
    public static StatusCode GATE_TIME_OUT=new StatusCode(422,"Gate Time Out");
    public Integer code;
    public String status;

    public StatusCode(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusCode{" +
                "code=" + code +
                ", status='" + status + '\'' +
                '}';
    }
}
