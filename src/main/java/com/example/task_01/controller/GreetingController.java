package com.example.task_01.controller;


import com.example.task_01.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Greeting")
public class GreetingController {

    @GetMapping
    public Greeting getGreetingResponse(String timeOfDay, String name){
        return new Greeting("Good Afternoon", "Salma" );
        
    }
}
