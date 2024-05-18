package com.example.controllerGetPost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }
    @PostMapping("/name")
    public String revName(@RequestBody String name){
        return new StringBuilder(name).reverse().toString();
    }
}