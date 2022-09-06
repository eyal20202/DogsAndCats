package com.eyal.exam.DogAndCat.Controller;

import com.eyal.exam.DogAndCat.models.Animals;
import com.eyal.exam.DogAndCat.service.ServiceInternalApi;
import com.google.gson.Gson;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CharacteristicsAnimal {
    ServiceInternalApi serviceInternalApi = new ServiceInternalApi();// BaseURL
    @GetMapping("/type/{type}")
    @ResponseBody
    public ResponseEntity<Animals> getAnimalByAge(@PathVariable String type, @RequestParam(required = false) String age) {
        System.out.println("getAnimalByAge age= " + age);
        String result = serviceInternalApi.runService(type,age);
        System.out.println("CharacteristicsCat java getAnimalByAge result = "+ result);
        Gson gson = new Gson();
        Animals animals = gson.fromJson(result, Animals.class);
        System.out.println("animal = "+ gson.toJson(animals));
        HttpHeaders httpHeaders = new HttpHeaders();
        // Call for all Cats with Age
        //baby, young, adult, senior Accepts multiple values, e.g. age=baby,senior
        return ResponseEntity.ok().headers(httpHeaders).body(animals);
    }
}
