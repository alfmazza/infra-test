package com.example.helloinfra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloInfraApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloInfraApplication.class, args);
    }

}

@RestController
class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Holangas!";
    }
}
