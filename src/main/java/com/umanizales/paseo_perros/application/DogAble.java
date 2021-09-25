package com.umanizales.paseo_perros.application;

import com.umanizales.paseo_perros.domain.DogDTO;

import java.util.List;

public interface DogAble {
    //declarar acciones que va a hacer el microservicio sobre el perro

    DogDTO save(DogDTO dogDTO);
    DogDTO update(DogDTO dogDTO);
    boolean delete(String code);
    List<DogDTO> list();
    List<DogDTO> getDogsByAge(short age);
}
