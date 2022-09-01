package com.eyal.exam.DogAndCat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigInternalApi {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
