package com.eyal.exam.DogAndCat;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//https://api.petfinder.com/v2/animals
@RestController
public interface Characteristics {
    //
    //GET Age
    // //animal/getByAge
    // /getByAge
    List<Animal> getAnimalByAge(String age);
    //Get Type
    List<Animal> getAnimalByType(String type);
}
