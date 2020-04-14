package com.ihrm.common.entity;

import lombok.Data;
/**
 * 公共的返回码
 *    返回码code：
 *      成功：10000
 *      失败：10001
 *      未登录：10002
 *      未授权：10003
 *      抛出异常：99999
 */

public enum ResultCode {
    SUCCESS(true,10000,"操作成功"),
    //---系统错误返回码-----
    FAIL(false,10001,"操作失败"),
    UNAUTHENTICATED(false,10002,"您还未登录"),
    UNAUTHORISE(false,10003,"权限不足"),
    SERVER_ERROR(false,99999,"抱歉，系统繁忙，请稍后重试！");

    boolean success;//是否成功
     Integer code;//返回码
     String message;//返回信息

    public boolean success() {
        return success;
    }
    private Integer code(){
        return code;
    }
    public String message(){
        return message;
    }
    ResultCode (boolean success,Integer code,String message){
        this.message=message;
        this.code=code;
        this.success=success;
    }
}
