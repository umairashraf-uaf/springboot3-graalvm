package de.heide.springboot_graalvm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    private static final String URL = "https://jsonplaceholder.typicode.com";
    @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl(URL).build();
    }
}
