package com.example.mmt_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trains {
    @GetMapping("/trains")
    public String getData() {
        return "please plan your trains with mmt at 15% discount";
    }
}
