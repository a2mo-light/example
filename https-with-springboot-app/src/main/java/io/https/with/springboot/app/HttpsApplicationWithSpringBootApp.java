package io.https.with.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpsApplicationWithSpringBootApp {

    public static void main(String[] args) {
        SpringApplication.run(HttpsApplicationWithSpringBootApp.class, args);
    }

    @GetMapping("/demo")
    public String getDemo(){
        return "I am GET";
    }

    @PostMapping("/demo")
    public String postDemo(){
        return "I am POST";
    }

}
