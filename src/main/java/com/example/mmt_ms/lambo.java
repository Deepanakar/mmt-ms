package com.example.mmt_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lambo {
    @GetMapping("/lambo")
    public String getData() {
        return "please plan your lambo with mmt at 15% discount";
    }
}