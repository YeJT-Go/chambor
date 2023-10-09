package com.yejt.servicebase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author : YeJT
 * @date : 2023-03-12 16:31
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                //  定义是否开启swagger，false为关闭，可以通过变量控制,默认为true
                .enable(true)
                .select()
                //RequestHandlerSelectors 配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.yejt"))
                //paths() 过滤什么路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {

        //作者信息
        Contact contact = new Contact("Y1JT", "", "");
        return new ApiInfo(
                "Y1JT的Swagger Api Documentation",
                "SprigBoot",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }


}
