package com.mgunawardhana.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubActionsApplication {

    @GetMapping("/")
    public String getHello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApplication.class, args);
    }

}
