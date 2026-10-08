/*

How to Setup Maven Project in Intellij IDEA and add Dependencies  -->
https://www.youtube.com/watch?v=LyKGbbKgRoQ

*/

package com.example.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        // Print statement when method is called
        System.out.println("Running SpringApplication");
        SpringApplication.run(Application.class, args);
        System.out.println("Done SpringApplication");
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}