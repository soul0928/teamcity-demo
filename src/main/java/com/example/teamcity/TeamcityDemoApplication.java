package com.example.teamcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TeamcityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamcityDemoApplication.class, args);
    }

    @GetMapping("/info")
    public Object info() {
        return "SUCCESS...";
    }
}
