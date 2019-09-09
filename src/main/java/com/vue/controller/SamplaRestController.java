package com.vue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class SamplaRestController {

    @GetMapping("/greeting")
    public String greeting() {
        return "api repsonse !!";
    }
}
