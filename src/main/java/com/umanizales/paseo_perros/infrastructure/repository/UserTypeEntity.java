package com.umanizales.paseo_perros.infrastructure.repository;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user_type", schema = "public", catalog = "paseo_perros")
public class UserTypeEntity {
    private short code;
    private String description;
    private Collection<UserEntity> usersByCode;

    @Id
    @Column(name = "code")
    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTypeEntity that = (UserTypeEntity) o;

        if (code != that.code) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) code;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userType")
    public Collection<UserEntity> getUsersByCode() {
        return usersByCode;
    }

    public void setUsersByCode(Collection<UserEntity> usersByCode) {
        this.usersByCode = usersByCode;
    }
}
