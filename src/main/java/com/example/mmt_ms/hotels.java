package com.example.mmt_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotels {

    @GetMapping("/hotels")
    public String getData() {return "please plan your hotels with mmt at 45% discount";
    }
}