package com.umanizales.paseo_perros.infrastructure.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "walk_dog", schema = "public", catalog = "paseo_perros")
public class WalkDogEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "date")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "dog", referencedColumnName = "code", nullable = false)
    private DogEntity dog;
    @ManyToOne
    @JoinColumn(name = "walker", referencedColumnName = "id", nullable = false)
    private UserEntity walker;
}
