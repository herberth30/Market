package com.herberth.barrientos.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
@RequestMapping("/saludar") //Para indicar el path al cual va a responder

public class HelloWorldController {

    @GetMapping("/hola")
    public String sayHello(){
        return "Hello World";
    }
}
