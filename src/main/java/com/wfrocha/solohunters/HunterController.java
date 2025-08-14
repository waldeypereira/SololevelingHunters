package com.wfrocha.solohunters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hunters")
public class HunterController {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Bem-vindo ao Solo Leveling Hunters!";
    }

}
