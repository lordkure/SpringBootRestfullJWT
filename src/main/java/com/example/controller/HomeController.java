package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cleber
 */
@RestController
@RequestMapping("/api/teste")
public class HomeController {

    @GetMapping(value = "/{nome}")
    public String home(@PathVariable("nome") String nome) {
        return "{\"users\":[{\"name\":\""+ nome +"\", \"country\":\"Brazil\"},{\"name\":\"Jackie\",\"country\":\"China\"}]}";
    }

//    @PostMapping(value = "/auth/{nome}")
//    public String auth(@PathVariable("nome") String nome) {
//        return "Esse foi o nome digitado: " + nome;
//    }

}
