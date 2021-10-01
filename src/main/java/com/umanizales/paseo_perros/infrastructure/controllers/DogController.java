package com.umanizales.paseo_perros.infrastructure.controllers;

import com.umanizales.paseo_perros.application.DogAble;
import com.umanizales.paseo_perros.application.DogImplemetation;
import com.umanizales.paseo_perros.domain.DogDTO;
import com.umanizales.paseo_perros.infrastructure.controllers.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path="dog")
public class DogController {

    @Autowired
    private DogImplemetation dogImplemetation;

    @PostMapping
    public @ResponseBody
    ResponseEntity<ResponseDto> save(@RequestBody @Valid DogDTO dogDTO){
        return  new ResponseEntity<>(new ResponseDto("Success",
        dogImplemetation.save(dogDTO), null), HttpStatus.OK);
    }
}
