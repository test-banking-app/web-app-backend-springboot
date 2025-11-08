package com.dondon.web_app_backend_springboot.service;

import java.util.List;

import com.dondon.web_app_backend_springboot.dto.response.TestResponse;

public interface TestService {

    List<TestResponse> getAll();

    TestResponse findById(Long id);
    
}
