package com.eyal.exam.DogAndCat.models;

import com.eyal.exam.DogAndCat.models.Animal;

import java.io.Serializable;
import java.util.List;

public class Animals implements Serializable {
    public List<Animal> animals;

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
