package com.fabiankevin.commonutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonUtilsApplication.class, args);
    }

}
//    @Bean
//    public Docket swaggerApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("pl.piomin.services.employee.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(new ApiInfoBuilder().version("1.0").title("Employee API").description("Documentation Employee API v1.0").build());
//    }