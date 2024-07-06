package com.strava.stravaapi;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/users")
public class UserController {

    @PostMapping("/users/import")
    public String importUser(@RequestBody User user) {
        // Logic to process the imported user
        return "User imported: " + user.getName();
    }

//    @GetMapping("/hello/{name}")
//    public String sayHello(@PathVariable String name) {
//        return String.format("Hello, %s!", name);
//    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }
}
