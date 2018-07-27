package com.ys.response;

/**
 * Author: dingran
 * Date: 2015/10/21
 * Description:返回状态码
 */
public enum ResponseCode {

    SUCCESS("Success", "200", "Success"),
    SERVICE_ERROR("Service.Error", "500", "服务器出现异常"),
    PARAMETER_MISS("Parameter.Miss", "40002","参数丢失"),
    PARAMETER_INVALID("Parameter.Invalid", "40003", "无效的参数" ),
    RESOURCE_NOTFOUND("Resource.NotFound", "40005", "请求资源不存在"),
    RESOURCE_INUSE("Resource.InUse", "40006", "资源已经使用."),
    RESOURCE_DUPLICATE("Resource.Duplicate", "40007", "资源重复"),
    RESOURCE_LIMITEXCEEDED("Resource.LimitExceeded", "40008", "请求资源不匹配"),
    FORBIDDEN_AUTHFAILURE("Forbidden.AuthFailure", "40301", "请求认证失败"),

    NOT_LOGIN("Not.Login", "709", "请重新登录"),
    RESPONSE_FAIL("Response.Fail","907","业务处理失败"),
    FILL_USER_REGISTER_INFO("User.info.base","409","用户信息不完善"),
    //用户模块错误，100打头
    USER_REGISTER_FAIL("User.Register.Fail","10001","用户注册失败");



    public final String code;
    public final String httpCode;
    public final String message;
    ResponseCode(String code, String httpCode, String message) {
        this.code = code;
        this.httpCode = httpCode;
        this.message = message;
    }

    @Override
    public String toString() {
        return  code;
    }

    public static ResponseCode toEnum(String name) {
        for (ResponseCode res : ResponseCode.values()) {
            if (res.toString().equalsIgnoreCase(name)) {
                return res;
            }
        }
        return null;
    }
}
