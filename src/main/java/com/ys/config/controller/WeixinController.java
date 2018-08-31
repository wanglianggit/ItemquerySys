package com.ys.config.controller;

import com.ys.response.BaseResponse;
import com.ys.util.CheckUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/weixinController")
@Api(description = "微信认证", tags = "WeixinController")
public class WeixinController {

    private final Logger logger = LoggerFactory.getLogger(WeixinController.class);

    @RequestMapping(value = "/checkSignature",method = RequestMethod.GET)
    @ResponseBody
    public String checkSignature(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String signature = req.getParameter("signature");
        String timestamp = req.getParameter("timestamp");
        String nonce = req.getParameter("nonce");
        String echostr = req.getParameter("echostr");
        if (CheckUtil.checkSignture(signature, timestamp, nonce)) {
            return echostr;
        }
    /*    PrintWriter out = resp.getWriter();
        if (CheckUtil.checkSignture(signature, timestamp, nonce)) {
            out.println(echostr);
        }*/
        return "";//接入失败
    }

}
