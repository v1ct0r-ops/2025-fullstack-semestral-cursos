package com.holamundo.ejemplo2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaMundoController2 {


    @GetMapping("/hello/victot_hacker")
    public String holaMundo(){
        return "Hola a todos, mi nombre es victor_hacker";
    }

    @GetMapping("/pedro_hacker")
    public String holaMundo2(){
        return "prueba 2";
    }

    @GetMapping("/suma/{x}/{y}")
    public String suma(@PathVariable int x, @PathVariable int y){
        int resultado = x + y ;

        return "El resultado es: " + resultado;
    }

    @GetMapping("/resta/{x}/{y}")
    public String resta(@PathVariable int x, @PathVariable int y){
        int resultado2 = x - y ;

        return "El resultado es: " + resultado2;
    }

    @GetMapping("/division/{x}/{y}")
    public String division(@PathVariable int x, @PathVariable int y){
        int resultado3 = x / y ;

        return "El resultado es: " + resultado3;
    }

    @GetMapping("/multiplicacion/{x}/{y}")
    public String multiplicacion(@PathVariable int x, @PathVariable int y){
        int resultado4 = x * y;

        return "El resultado es: " + resultado4 + " Finalización.";
    }
}
