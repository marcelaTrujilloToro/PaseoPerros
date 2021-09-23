package com.umanizales.paseo_perros.infrastructure.repository;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user", schema = "public", catalog = "paseo_perros")
public class UserEntity {
    private int id;
    private String email;
    private String password;
    private UserTypeEntity userType;
    private Collection<WalkDogEntity> walkDogsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_type", referencedColumnName = "code", nullable = false)
    public UserTypeEntity getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEntity userType) {
        this.userType = userType;
    }

    @OneToMany(mappedBy = "walker")
    public Collection<WalkDogEntity> getWalkDogsById() {
        return walkDogsById;
    }

    public void setWalkDogsById(Collection<WalkDogEntity> walkDogsById) {
        this.walkDogsById = walkDogsById;
    }
}
