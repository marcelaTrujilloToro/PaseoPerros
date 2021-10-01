package com.umanizales.paseo_perros.infrastructure.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDto {
    private  int code;
    private String message;
}
