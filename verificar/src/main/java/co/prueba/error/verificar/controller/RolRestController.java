package co.prueba.error.verificar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rol")
public class RolRestController {

    @GetMapping("/")
    public String prueba(){
        return "Hola mundo";
    }
}
