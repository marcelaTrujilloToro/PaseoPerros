package com.umanizales.paseo_perros.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DogDTO {
    private String code;
    private String name;
    private short age;
}
