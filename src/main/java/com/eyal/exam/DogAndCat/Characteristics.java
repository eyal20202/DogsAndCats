package com.eyal.exam.DogAndCat;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
