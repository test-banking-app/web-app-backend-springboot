package com.dondon.web_app_backend_springboot.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dondon.web_app_backend_springboot.dto.response.TestResponse;

@Service
public class TestServiceImpl implements TestService {

    private List<TestResponse> data;

    @Override
    public List<TestResponse> getAll() {
        populateData();
        return data;
    }

    @Override
    public TestResponse findById(Long id) {
        data = new ArrayList<>();
        populateData();
        return data.stream()
            .filter(d -> d.getId().equals(id))
            .findFirst()
            .get();
    }

    private void populateData() {
        data = new ArrayList<>();
        data.add(TestResponse.builder()
            .id(1l)
            .name("Dondon")
            .email("dondon1@mail.com")
            .birthDate(LocalDate.of(1996, 1, 19))
            .address("Ausmolo1")
            .build());
        data.add(TestResponse.builder()
            .id(2l)
            .name("Jeric")
            .email("dondon2@mail.com")
            .birthDate(LocalDate.of(1996, 1, 20))
            .address("Ausmolo2")
            .build());
        data.add(TestResponse.builder()
            .id(3l)
            .name("De Vera")
            .email("dondon3@mail.com")
            .birthDate(LocalDate.of(1996, 1, 21))
            .address("Ausmolo3")
            .build());
        data.add(TestResponse.builder()
            .id(4l)
            .name("Co")
            .email("dondon4@mail.com")
            .birthDate(LocalDate.of(1996, 1, 22))
            .address("Ausmolo4")
            .build());
    }

    
}
