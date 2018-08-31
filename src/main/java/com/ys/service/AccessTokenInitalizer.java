package com.ys.service;

import com.ys.entity.AccessToken;
import com.ys.util.WeixinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AccessTokenInitalizer {

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valueOperations;

    /**
     * 每隔2小时获取一次最新的access_token，存取到redis里
     */
    @Scheduled(cron = "0 0 0/2 * * ? ")
    public void autorefreshAccessToken() {
        valueOperations.set("access_token", WeixinUtil.getAccessToken());
    }

    /**
     * 手动触发获取新的accessToken
     */
    public AccessToken manualFreshAcessToken() {
        autorefreshAccessToken();
        return getAccessToken();
    }

    /**
     * 从redis中获取最新的access_token
     */
    public AccessToken getAccessToken() {
        AccessToken token = (AccessToken) valueOperations.get("access_token");
        if(token == null) {
            return manualFreshAcessToken();
        }else {
            return token;
        }
    }



}
