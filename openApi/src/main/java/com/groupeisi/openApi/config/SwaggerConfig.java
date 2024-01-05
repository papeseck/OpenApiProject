package com.groupeisi.openApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.groupeisi.taskmanagerbackend"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .extensions(Collections.singletonList(openApiExtensionResolver -> {
                    return List.of(
                            new YamlOpenApiExtension("global-api.yml"),
                            new YamlOpenApiExtension("task-api.yml"),
                            new YamlOpenApiExtension("task-model.yml")
                    );
                }));
    }

    private ApiInfo apiInfo() {
        // Informations supplémentaires sur votre API
        return new ApiInfoBuilder()
                .title("Gestion de Tâches API")
                .version("1.0.0")
                .build();
    }
}
