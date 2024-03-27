package com.yoga.yoga;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

@RestController
public class Routes {

    @GetMapping("/")
    public String Home() throws IOException {
        Resource resource = new ClassPathResource("static/index.html");

        String htmlContent = StreamUtils.copyToString(resource.getInputStream(),StandardCharsets.UTF_8);

        return htmlContent;
    }
    

}