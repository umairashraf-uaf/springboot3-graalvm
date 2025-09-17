package de.heide.springboot_graalvm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class AsyncRestClientService {

    private final WebClient webClient;

    public AsyncRestClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getFirstPost() {
        return webClient
                .get()
                .uri("/posts/1")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Flux<String> getPosts() {
        return webClient
                .get()
                .uri("/posts")
                .retrieve()
                .bodyToFlux(String.class);
    }

}
