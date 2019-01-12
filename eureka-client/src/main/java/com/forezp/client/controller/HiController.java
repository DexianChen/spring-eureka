package com.forezp.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    String port = "8762";

    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi! " + name + ",I am from port: " + port;
    }
}
