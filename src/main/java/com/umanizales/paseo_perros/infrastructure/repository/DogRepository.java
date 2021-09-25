package com.umanizales.paseo_perros.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//para poder guardar se le da jpaRepository.save
//entre <> va el tipo de dato que el va a guardar en este caso la clase perro y el tipo de dato de la PK
public interface DogRepository  extends JpaRepository<DogEntity, String> {
}
