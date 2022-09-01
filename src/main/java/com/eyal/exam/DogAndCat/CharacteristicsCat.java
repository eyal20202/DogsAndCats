package com.eyal.exam.DogAndCat;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("cat")
public class CharacteristicsCat implements Characteristics{
    // /cat?age=1
    // /cat/age/1
    @GetMapping("/age/{age}")
    @ResponseBody
    @Override
    public List<Animal> getAnimalByAge(@PathVariable String age) {
        System.out.println("getAnimalByAge Any Hi");
        // Call for all Cats with Age
        //baby, young, adult, senior Accepts multiple values, e.g. age=baby,senior
        return null;
    }
    // /dog
    @GetMapping("/type/{type}")

    @ResponseBody
    @Override
    public List<Animal> getAnimalByType(@PathVariable String type) {
        return null;
    }
}
