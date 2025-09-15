package com.apipoc.demo.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiRequestDto {
    private String name;
    private String url;
    private String method;
}

