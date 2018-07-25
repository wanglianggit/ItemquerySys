package com.ys.config;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration

@EnableWebMvc // 支持springmvc
@EnableSwagger2
@ComponentScan(basePackages ={"com.ys.controller"})
//@Profile(value = {"dev"})
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).host("127.0.0.1:8080").groupName("通用API 文档").apiInfo(apiInfo()).
                produces(Sets.newHashSet("http"))
                .select().
                paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("物品查询—活动中心API在线文档-Development").termsOfServiceUrl("http://127.0.0.1:8080")
                .contact(new Contact("wl", "http://www.e-edusunshine.com", "www.baidu.com")).version("1.0.0").description(
                        "活动中心服务接口说明,   接口基础  path:  http://127.0.0.1:8080")
                .build();
    }

}
