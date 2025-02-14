package com.abhi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {

    @GetMapping
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok("Hello World");
    }
}
