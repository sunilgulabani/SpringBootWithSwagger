package com.demo.swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import com.wordnik.swagger.model.ApiInfo;

@Configuration
@EnableSwagger
public class SwaggerConfiguration {
    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin getSwaggerSpringMvcPlugin() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(createApiInfo())
                .includePatterns("/.*");
    }

    private ApiInfo createApiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Swagger Demo API",
                "API for Swagger Demo",
                "Swagger Demo terms of service",
                "sunil.gulabani1@gmail.com",
                "Swagger Demo Licence Type",
                "Swagger Demo License URL"
        );
        return apiInfo;
    }
}
