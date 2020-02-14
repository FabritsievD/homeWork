package com.example.demo.configuration;

import com.example.demo.model.DemoResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {
    @Bean
    public DemoResponse getDemoResponse () {
        return new DemoResponse();
    }
}
