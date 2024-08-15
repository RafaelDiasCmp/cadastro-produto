package com.abutua.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Criando o primeiro Endpoint ---- Pode responder a Endpoints
public class HelloController {
    
    @GetMapping("hello") // Endpoint que retorna uma STRING == HELLO
    public String getHello(){  // Classe sempre criada com MAIÚSCULO
        return "Hello Spring Boot";
    }
}
