package com.eyal.exam.DogAndCat;

import com.eyal.exam.DogAndCat.service.ServiceInternalApi;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
@RestController
@RequestMapping("cat")
public class CharacteristicsCat implements Characteristics{
    final String myAnimal = "cat";
    ServiceInternalApi serviceInternalApi = new ServiceInternalApi();// BaseURL
    // /cat?age=1
    // /cat/age/1
    @GetMapping("/age/{age}")
    @ResponseBody
    @Override
    public List<Animal> getAnimalByAge(@PathVariable String age) {
        System.out.println("getAnimalByAge age= " + age);
        String result = serviceInternalApi.runService(myAnimal,age);
        System.out.println("CharacteristicsCat java getAnimalByAge result = "+ result);
        Gson gson = new Gson();
        Animals animals = gson.fromJson(result, Animals.class);
        System.out.println("animal = "+ gson.toJson(animals));
        // Call for all Cats with Age
        //baby, young, adult, senior Accepts multiple values, e.g. age=baby,senior
        return null;
    }
    // /dog
    @GetMapping("/type/{type}")
    @ResponseBody
    @Override
    public List<Animal> getAnimalByType(@PathVariable String type) {
        System.out.println("getAnimalByType type= " + type);
        String result = serviceInternalApi.runService(type);
        System.out.println("CharacteristicsCat java getAnimalByAge result = "+ result);
        Gson gson = new Gson();
        Animals animals = gson.fromJson(result, Animals.class);
        System.out.println("animal = "+ gson.toJson(animals));
        return null;
    }

}
