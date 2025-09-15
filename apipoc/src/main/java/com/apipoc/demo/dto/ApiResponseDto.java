package com.apipoc.demo.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponseDto {
    private Long id;
    private String name;
    private String url;
    private String method;
    private Object response; // dynamic 3rd party response
}

