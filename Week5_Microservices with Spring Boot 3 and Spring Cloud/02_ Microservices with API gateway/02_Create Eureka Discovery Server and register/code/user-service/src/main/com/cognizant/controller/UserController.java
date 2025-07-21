Skip to content
Navigation Menu
Sign in
divyadharshinidevarajan
/
Cognizant-DeepSkilling
Public
Code
Issues
Pull requests
Actions
Projects
Cognizant-DeepSkilling/Week5_Microservices with Spring Boot 3 and Spring Cloud/02_ Microservices with API gateway/02_Create Eureka Discovery Server and register/code/user-service/src/main/com/cognizant/controller
/UserController.java
divyadharshinidevarajan
divyadharshinidevarajan
Adding week 5 hands-on
479a74c
 · 
yesterday
13 lines (10 loc) · 348 Bytes

Code

Blame
package com.cognizant.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/data")
    public String getUserData() {
        return "User data from user-service";
    }
}
Cognizant-DeepSkilling/Week5_Microservices with Spring Boot 3 and Spring Cloud/02_ Microservices with API gateway/02_Create Eureka Discovery Server and register/code/user-service/src/main/com/cognizant/controller/UserController.java at main · divyadharshinidevarajan/Cognizant-DeepSkilling · GitHub 
‎springframework‎
2 ReferencesSearch

‎In this file‎
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
