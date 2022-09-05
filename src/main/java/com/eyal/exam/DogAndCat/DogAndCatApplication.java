package com.eyal.exam.DogAndCat;

import com.eyal.exam.DogAndCat.config.ConfigInternalApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DogAndCatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogAndCatApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ConfigInternalApi.class);
		ctx.refresh();

	}

}
