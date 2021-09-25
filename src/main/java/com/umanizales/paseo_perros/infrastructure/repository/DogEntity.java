package com.umanizales.paseo_perros.infrastructure.repository;

import com.umanizales.paseo_perros.domain.DogDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "dog", schema = "public", catalog = "paseo_perros")
public class DogEntity {
    @Id
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "age")
    private short age;

    public DogEntity(DogDTO dogDTO) {
        //copiar propiedades de DogDTO
        //generar el codigo del perro
        //si hay 50 propiedades el las copia de una BeanUtils
        BeanUtils.copyProperties(dogDTO, this);
        //como generar un UID tipo string
        this.code = "P_" + this.name;
    }

    public DogDTO toDogDTO(){
        DogDTO dogDTO = new DogDTO();
        BeanUtils.copyProperties(this, dogDTO);
        return dogDTO;
    }
}
