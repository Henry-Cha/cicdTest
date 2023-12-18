package com.example.cicdtest;

import org.springframework.web.bind.annotation.GetMapping;
@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("")
    public String joinMember() {
        return "index.html";
    }
}
