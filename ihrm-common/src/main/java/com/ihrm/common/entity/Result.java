package com.ihrm.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 数据响应对象
 *    {
 *      success ：是否成功
 *      code    ：返回码
 *      message ：返回信息
 *      //返回数据
 *      data：  ：{
 *
 *      }
 *    }
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private boolean success;  //请求是否成功
    private Integer code; //返回码
    private String message; //返回信息
    private Object data; //返回数据



    public Result(ResultCode resultCode){
        this.success=resultCode.success;
        this.code=resultCode.code;
        this.message=resultCode.message;
    }
    public Result(ResultCode resultCode,Object data){
        this.success=resultCode.success;
        this.code=resultCode.code;
        this.message=resultCode.message;
        this.data=data;
    }
    public Result(boolean success,Integer code,String message){
        this.success=success;
        this.message=message;
        this.code=code;
    }

    public static Result SUCCESS(){
      return  new Result(ResultCode.SUCCESS);
    }
    public static Result ERROR(){
        return new Result(ResultCode.SERVER_ERROR);
    }

    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }
    public static Result UNAUTHENTICATED(){
        return new Result(ResultCode.UNAUTHENTICATED);
    }
    public static Result UNAUTHORISE(){
        return new Result(ResultCode.UNAUTHORISE);
    }
}
