package com.example.SIA5.others;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Kontroller {

    @RequestMapping("/")
    public String a(){
        return "Aaa";
    }

    @RequestMapping("/a")
    public String b() {
        return "b";
    }

}
