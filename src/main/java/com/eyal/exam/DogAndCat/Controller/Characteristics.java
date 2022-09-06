package com.eyal.exam.DogAndCat.Controller;

import com.eyal.exam.DogAndCat.models.Animals;
import org.springframework.web.bind.annotation.RestController;

//https://api.petfinder.com/v2/animals
@RestController
public interface Characteristics {
    //
    //GET Age
    // //animal/getByAge
    // /getByAge
    Animals getAnimalByAge(String age);
    //Get Type
    Animals getAnimalByType(String type);
}
