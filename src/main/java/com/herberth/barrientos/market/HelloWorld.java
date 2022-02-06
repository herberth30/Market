package com.herberth.barrientos.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
@RequestMapping("/saludar") //Para indicar el path al cual va a responder

public class HelloWorld {

    @GetMapping("/hola")
    public String sayHello(){
        return "Hello World";
    }
}
