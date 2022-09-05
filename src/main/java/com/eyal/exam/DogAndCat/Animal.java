package com.eyal.exam.DogAndCat;

import java.io.Serializable;

public class Animal implements Serializable {
    MyImage	primary_photo_cropped;
    String	name="";
    Breeds	breeds;
    String	gender="";
    String	age=""; //not doing any math actions

    public MyImage getPrimary_photo_cropped() {
        return primary_photo_cropped;
    }

    public void setPrimary_photo_cropped(MyImage primary_photo_cropped) {
        this.primary_photo_cropped = primary_photo_cropped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breeds getBreeds() {
        return breeds;
    }

    public void setBreeds(Breeds breeds) {
        this.breeds = breeds;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
