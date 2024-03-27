package com.yoga.yoga;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Routes {

    @GetMapping("/")
    public String Home() {
        Resource resource = new ClassPathResource("static/index.html");



        return resource;
    }
    

}