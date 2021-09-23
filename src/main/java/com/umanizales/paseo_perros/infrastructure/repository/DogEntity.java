package com.umanizales.paseo_perros.infrastructure.repository;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "dog", schema = "public", catalog = "paseo_perros")
public class DogEntity {
    private String code;
    private String name;
    private short age;
    private Collection<WalkDogEntity> walkDogsByCode;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DogEntity dogEntity = (DogEntity) o;

        if (age != dogEntity.age) return false;
        if (code != null ? !code.equals(dogEntity.code) : dogEntity.code != null) return false;
        if (name != null ? !name.equals(dogEntity.name) : dogEntity.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) age;
        return result;
    }

    @OneToMany(mappedBy = "dog")
    public Collection<WalkDogEntity> getWalkDogsByCode() {
        return walkDogsByCode;
    }

    public void setWalkDogsByCode(Collection<WalkDogEntity> walkDogsByCode) {
        this.walkDogsByCode = walkDogsByCode;
    }
}
