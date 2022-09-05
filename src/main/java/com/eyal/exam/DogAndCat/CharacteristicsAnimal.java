package com.eyal.exam.DogAndCat;

import com.eyal.exam.DogAndCat.service.ServiceInternalApi;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacteristicsAnimal {
    ServiceInternalApi serviceInternalApi = new ServiceInternalApi();// BaseURL
    @GetMapping("/type/{type}")
    @ResponseBody
    public Animals getAnimalByType(@PathVariable String type) {
        System.out.println("getAnimalByType type= " + type);
        String result = serviceInternalApi.runService(type);
        System.out.println("CharacteristicsCat java getAnimalByAge result = "+ result);
        Gson gson = new Gson();
        Animals animals = gson.fromJson(result, Animals.class);
        System.out.println("animal = "+ gson.toJson(animals));
        return animals;
    }
}
