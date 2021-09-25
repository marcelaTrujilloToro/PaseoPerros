package com.umanizales.paseo_perros.infrastructure.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

//@Entity: que esto esta relacionado en un tabla de BD
//@Table: el nombre de la tabla difiere de la clase
@Entity
@Table(name = "user_type", schema = "public", catalog = "paseo_perros")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserTypeEntity {
    @Id
    @Column(name = "code")
    private short code;
    @Basic
    @Column(name = "description")
    private String description;
}
