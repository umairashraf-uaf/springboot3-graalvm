package de.heide.springboot_graalvm.controller;

import de.heide.springboot_graalvm.service.AsyncRestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AsynchronousController {

    @Autowired
    private final AsyncRestClientService asyncRestClientService;

    public AsynchronousController(AsyncRestClientService asyncRestClientService) {
        this.asyncRestClientService = asyncRestClientService;
    }

    @GetMapping("/async-post")
    public Mono<String> getPostAsynchronously() {
        return asyncRestClientService.getFirstPost();
    }

    @GetMapping("/async-posts")
    public Flux<String> getPostsAsynchronously() {
        return asyncRestClientService.getPosts();
    }
}
