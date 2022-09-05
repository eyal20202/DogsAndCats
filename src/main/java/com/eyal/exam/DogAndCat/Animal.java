package com.eyal.exam.DogAndCat;

public class Animal{
    MyImage	primary_photo_cropped = null;
    String	name="";
    String	primaryBreed="";
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

    public String getPrimaryBreed() {
        return primaryBreed;
    }

    public void setPrimaryBreed(String primaryBreed) {
        this.primaryBreed = primaryBreed;
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
