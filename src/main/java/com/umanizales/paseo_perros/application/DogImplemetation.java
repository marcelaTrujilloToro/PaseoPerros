package com.umanizales.paseo_perros.application;

import com.umanizales.paseo_perros.domain.DogDTO;
import com.umanizales.paseo_perros.infrastructure.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogImplemetation implements DogAble{

    @Autowired
    @Qualifier("PostgresDogRepository")
    private DogAble dogPersistence;


    @Override
    public DogDTO save(DogDTO dogDTO) {
        return dogPersistence.save(dogDTO);
    }

    @Override
    public DogDTO update(DogDTO dogDTO) {
        return null;
    }

    @Override
    public boolean delete(String code) {
        return false;
    }

    @Override
    public List<DogDTO> list() {
        return null;
    }

    @Override
    public List<DogDTO> getDogsByAge(short age) {
        return null;
    }
}
