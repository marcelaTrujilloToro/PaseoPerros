package com.umanizales.paseo_perros.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DogDTO {
    private String code;
    @NotNull
    @NotEmpty
    @Size(min = 2, max=20)
    private String name;
    @NotNull
    @Positive
    private short age;
}
