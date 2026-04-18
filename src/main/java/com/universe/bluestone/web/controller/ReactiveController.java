package com.universe.bluestone.web.controller;

import com.universe.bluestone.web.service.ReactiveService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class ReactiveController {

    private final ReactiveService reactiveService;
    @GetMapping("/messages")
    public Flux<String> getMessages() {
        return reactiveService.getMessages();
    }
}