package com.eyal.exam.DogAndCat;

import java.util.List;
//animal
public interface Characteristics {
    //
    //GET Age
    // //animal/getByAge
    // /getByAge
    List<Animal> getAnimalByAge(String age);
    //Get Type
    List<Animal> getAnimalByType(String type);
}
