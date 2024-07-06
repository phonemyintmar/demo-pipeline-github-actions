package com.pm.demo_pipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("ping")
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok("pong");
    }
}
