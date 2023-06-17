package com.isil.isilnet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v2/")

public class Api {

    @GetMapping("ep3")
    public String prueba(){
        return "Probando api";
    }
}
