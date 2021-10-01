package com.umanizales.paseo_perros.infrastructure.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class ResponseDto {
    private String message;
    private Object data;
    private List<ErrorDto> errors;
}
