package com.ys.config.controller;

import com.ys.entity.ItemUser;
import com.ys.response.BaseResponse;
import com.ys.response.ResponseCode;
import com.ys.response.ValiResult;
import com.ys.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/logginController")
@Api(description = "用户", tags = "LoginController")
public class LoginController extends ABaseController {

    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;
//    /**
//     * 用户登录
//     * @return
//     */
//    @RequestMapping(value = "/index")
//    public String renderLogin() {
//        return "index";
//    }
//
//    /**
//     * 用户注册
//     * @return
//     */
//    @RequestMapping(value = "/reg")
//    public String renderReg() {
//        return "reg";
//    }
//
//    /**
//     * 找回密码
//     * @return
//     */
//    @RequestMapping(value = "/getpass")
//    public String renderGetPass() {
//        return "getpass";
//    }

    @RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    @ApiImplicitParam(value = "{\"userName\":\"acTkoum0\",\"password\":\"1222\"}", name = "params", paramType = "form")

    @ResponseBody
    public BaseResponse login() {
        BaseResponse baseResponse = new BaseResponse();
        Map<String, Object> paramMap = super.getParamMap();
        ValiResult result = validataParams("userName", "password");
        if (result.isSuccess()) {
            ItemUser user = new ItemUser();
            user.setUsername(String.valueOf(paramMap.get("userName")));
            user.setPassword(String.valueOf(paramMap.get("password")));
            List<ItemUser> itemUsers = null;
            try {
                itemUsers = userService.selectUserByParams(user);
                if (null == itemUsers || itemUsers.size() == 0) {
                    BaseResponse.setResponse(baseResponse, ResponseCode.FILL_USER_REGISTER_INFO.code, "");
                } else {
                    baseResponse.setResult(itemUsers);
                    baseResponse.setMessage("SUCCESS");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    return baseResponse;
    }
}
