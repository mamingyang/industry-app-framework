package com.cosmoplat.swagger.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 27279
 */
@Configuration
@PropertySource(value = { "classpath:application-swagger.yml",
}, encoding = "utf-8",factory = YamlConfigFactory.class)
public class SwaggerConfig {


}
