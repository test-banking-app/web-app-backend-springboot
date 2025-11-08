package com.dondon.web_app_backend_springboot.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestResponse {
    
    private Long id;
    private String name;
    private String email;
    private String address;
    private LocalDate birthDate;

}
