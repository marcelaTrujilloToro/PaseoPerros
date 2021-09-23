package com.umanizales.paseo_perros.infrastructure.repository;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "walk_dog", schema = "public", catalog = "paseo_perros")
public class WalkDogEntity {
    private int id;
    private Date date;
    private DogEntity dog;
    private UserEntity walker;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WalkDogEntity that = (WalkDogEntity) o;

        if (id != that.id) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "dog", referencedColumnName = "code", nullable = false)
    public DogEntity getDog() {
        return dog;
    }

    public void setDog(DogEntity dog) {
        this.dog = dog;
    }

    @ManyToOne
    @JoinColumn(name = "walker", referencedColumnName = "id", nullable = false)
    public UserEntity getWalker() {
        return walker;
    }

    public void setWalker(UserEntity walker) {
        this.walker = walker;
    }
}
