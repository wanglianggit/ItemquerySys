package com.ys.config.controller;

import com.ys.entity.AccessToken;
import com.ys.service.AccessTokenInitalizer;
import com.ys.util.WeixinUtil;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 本Controller作用为自定义菜单接口
 */
@RequestMapping("/customMenuController")
@RestController
@Api(description = "自定义菜单接口",tags = "customMenu")
public class CustomMenuController {

    @Autowired
    AccessTokenInitalizer accessTokenInitalizer;

    private final Logger logger = LoggerFactory.getLogger(CustomMenuController.class);

    @RequestMapping("/deleteAllCustomMenu")
    public void deleteAllCustomMenu() {
        String access_token = accessTokenInitalizer.getAccessToken().getAccess_token();
        logger.info(WeixinUtil.doGetStr("https://api.weixin.qq.com/cgi-bin/menu/delete?access_token="+access_token).toString());
    }

    @RequestMapping("/createCustomMenu")
    public void createCustomMenu() {
        String access_token = accessTokenInitalizer.getAccessToken().getAccess_token();
        String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+access_token;
        /**
         * 此处先默认写死创建一个固定的点餐view。调转的url为本url里的点餐页面
         */
        String paramter = "{\"button\":[{\"type\":\"view\",\"name\":\"搜索\",\"url\":\"http://qu5ywy.natappfree.cc/item/static/pages/orderFood.html/\"}]}";
        logger.info(WeixinUtil.doPostStr(url,paramter).toString());;

    }


}
