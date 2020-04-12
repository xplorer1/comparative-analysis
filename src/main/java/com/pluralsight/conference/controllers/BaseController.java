package com.pluralsight.conference.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseController {
    @GetMapping
    public String welcome () {
        return "You are welcome to my new api.";
    }
}
