package com.example.mmt_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData() {return "Pleas ebook hotels at 50% discount"; }
}