package com.umanizales.paseo_perros.infrastructure.adapters;

import com.umanizales.paseo_perros.application.DogAble;
import com.umanizales.paseo_perros.domain.DogDTO;
import com.umanizales.paseo_perros.infrastructure.repository.DogEntity;
import com.umanizales.paseo_perros.infrastructure.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

//para poder trabajar con varias BD, en el qualifer se pone la conexion que se escoge
@Qualifier("PostgresDogRepository")
@Repository("dogPersistence")
public class PostgresDogRepository  implements DogAble {

    //inyeccion de dependencias, solo crea la conexion cuando se mande a guardar un perro, luego desaparece
    @Autowired
    private DogRepository dogRepository;

    @Override
    public DogDTO save(DogDTO dogDTO) {

         return dogRepository.save(new DogEntity(dogDTO)).toDogDTO();

    }

    @Override
    public DogDTO update(DogDTO dogDTO) {
        //pendiente recibir codigo
        return dogRepository.save(new DogEntity(dogDTO)).toDogDTO();
    }

    @Override
    public boolean delete(String code) {
        dogRepository.deleteById(code);
        return  true;
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
