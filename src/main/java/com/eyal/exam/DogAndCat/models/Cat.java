package com.eyal.exam.DogAndCat.models;

public class Cat extends Animal {

    @Override
    public String getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }
    public Breeds getBreed() {
        return breeds;
    }

    public void setBreed(Breeds breeds) {
        this.breeds = breeds;
    }
}
