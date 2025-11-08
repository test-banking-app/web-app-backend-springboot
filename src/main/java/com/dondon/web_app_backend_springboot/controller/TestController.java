package com.dondon.web_app_backend_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dondon.web_app_backend_springboot.dto.response.TestResponse;
import com.dondon.web_app_backend_springboot.service.TestService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/v1/test")
@AllArgsConstructor
public class TestController {

    private TestService testService;

    @GetMapping("/getSampleData/{id}")
    public ResponseEntity<TestResponse> getTestResponseById(@PathVariable Long id) {
        return new ResponseEntity<>(testService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/getSampleData")
    public ResponseEntity<List<TestResponse>> getAllTestResponse() {
        return new ResponseEntity<>(testService.getAll(), HttpStatus.OK);
    }
    

}
