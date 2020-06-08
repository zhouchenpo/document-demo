package com.document.demo.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nexus
 * @title: MyBatisConfig
 * @projectName demo
 * @description:
 * @date 2020/6/6 16:41
 */
@Configuration
@MapperScan(basePackages = {"com.document.demo.mapper"})
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return new ConfigurationCustomizer() {

            @Override
            public void customize(
                    org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);

            }
        };
    }
}
