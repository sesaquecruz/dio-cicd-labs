package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Welcome");
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> greeting(@PathVariable String name) {
        var msg = String.format("Hello %s!", name);
        return ResponseEntity.ok(msg);
    }
}
