package com.umanizales.paseo_perros.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String>
{
}
