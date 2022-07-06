package com.example.SpringBootApp.controller;

import com.example.SpringBootApp.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/getdata")
    public ResponseEntity getData(){
       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PostMapping("/postData")
    public String postData(@RequestBody Employee employee){
        return "success";
    }


    /*
    1. write a rest api which will take a request with user details and save it to
    db.
    2. what is request param, query param, path variable, request body?
    3. Write rest call to update the resource?
    4. validate the request parameters and handle exceptions? for this, use @ExceptionHandler
    and @RestControllerAdvice.
    5. Return correct http statuses as per your response...
    6. Write a controller, service, and connect to third party api and get the response?
    7. handle all crud operations..
    8. write a code to use autowiring annotation..
    9. write a code to use @Component, @Service, @Repository annotations..
    10. Show me JPA code which will fetch records and sort them..
    11. write a code to show @OneToOne, @OneToMany annotations?
    12. java 8 features? stream?
     */



}
