package com.ys.config;
import com.ys.ItemqueryApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 初始化WEB工程
 *
 * @author tbc on 2016/11/21 10:19:44.
 */
@Slf4j
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ItemqueryApplication.class);
    }

}