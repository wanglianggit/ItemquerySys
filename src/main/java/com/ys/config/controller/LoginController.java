package com.ys.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value = "/index")
    public String renderLogin() {
        return "index";
    }

    /**
     * 用户注册
     * @return
     */
    @RequestMapping(value = "/reg")
    public String renderReg() {
        return "reg";
    }

    /**
     * 找回密码
     * @return
     */
    @RequestMapping(value = "/getpass")
    public String renderGetPass() {
        return "getpass";
    }
}
