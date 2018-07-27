package com.ys.response;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.UUID;

/**
 * 响应
 * Created by dingr on 14-2-13.
 */
@ApiModel(value = "",description = "响应信息")
public class BaseResponse<T>  implements Serializable{

    private String requestId;

    @ApiModelProperty(value = "响应编码：如 NOT.LOGIN")
    private String code;
    @ApiModelProperty(value = "响应信息 如success,server-error,not-login")
    private String message;
    @ApiModelProperty(value = "响应状态码 如200:success,500:server-error,709:not-login")
    private String httpCode;

    @ApiModelProperty(value = "业务数据")
    private T result;

    public BaseResponse(){
        ResponseCode responseCode = ResponseCode.toEnum(ResponseCode.SUCCESS.toString());
        this.code = responseCode.toString();
        this.message = responseCode.message;
        this.httpCode = responseCode.httpCode;
        this.requestId = UUID.randomUUID().toString();
    }
    public BaseResponse(String requestId){
        if (StringUtils.isBlank(requestId)) {
            requestId = UUID.randomUUID().toString();
        }
        ResponseCode responseCode = ResponseCode.toEnum(ResponseCode.SUCCESS.toString());
        this.code = responseCode.toString();
        this.message = responseCode.message;
        this.httpCode = responseCode.httpCode;
        this.requestId = requestId;
    }
    /**
     * 根据错误代码设置异常
     * @param code
     * @return
     */
    public static <T> T setResponse(String code){
        BaseResponse response = new BaseResponse();
        return (T)setResponse(response,code);
    }

    /**
     * 根据错误代码获取异常响应
     * @param code
     * @return
     */
    public static  <T> T setResponse(BaseResponse response,String code){
        ResponseCode error = ResponseCode.toEnum(code);
        response.setCode(error.code);
        response.setHttpCode(error.httpCode);
        response.setMessage(error.message);
        response.setRequestId(response.getRequestId());
        return (T)response;
    }
    /**
     * 根据错误代码设置异常 并自定义消息
     * @param code
     * @param message
     * @return
     */
    public static <T> T setResponse(String code,String message){
        BaseResponse response = new BaseResponse();
        return (T)setResponse(response,code,message);
    }

    public void  isFail(ResponseCode responseCode,String message){
        this.setCode(responseCode.code);
        if(org.springframework.util.StringUtils.isEmpty(message)){
            this.setMessage(responseCode.message);
        }else{
            this.setMessage(message);
        }
        this.setHttpCode(responseCode.httpCode);
    }

    public void  isError(){
        this.setCode(ResponseCode.SERVICE_ERROR.code);
        this.setHttpCode(ResponseCode.SERVICE_ERROR.httpCode);
        this.setMessage("服务器错误");
    }


    /**
     * 根据错误代码设置异常 并自定义消息
     * @param code
     * @param message
     * @return
     */
    public static <T> T setResponse(BaseResponse response,String code,String message){
        ResponseCode error = ResponseCode.toEnum(code);
        response.setCode(error.code);
        response.setHttpCode(error.httpCode);
        response.setMessage(error.message.concat( message));
        response.setRequestId(response.getRequestId());
        return (T)response;
    }
    public  static <T> T  responseWithName(BaseResponse response,String code, Object msg){
        ResponseCode error = ResponseCode.toEnum(code);
        response.setCode(error.code);
        response.setHttpCode(error.httpCode);
        response.setMessage(msg.toString());
        response.setRequestId(response.getRequestId());
        return (T)response;
    }
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpCode() {
        return httpCode;
    }
    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }

    public  String returnBaseInfo(){
        return "code ="+this.getCode()+" ,httpCode ="+this.getHttpCode()+" , message ="+this.getMessage();
    }
}
