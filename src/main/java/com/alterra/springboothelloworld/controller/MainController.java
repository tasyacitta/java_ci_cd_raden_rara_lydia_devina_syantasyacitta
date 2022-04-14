package com.alterra.springboothelloworld.controller;

import com.alterra.springboothelloworld.util.ResponseUtil;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<Object> hello() {
        return ResponseUtil.build("Hello, docker is amazing!!", null, HttpStatus.OK);
    }
    
}
