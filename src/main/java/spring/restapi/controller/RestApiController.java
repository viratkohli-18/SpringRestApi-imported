package spring.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/hello")
    public String hello() {
        return "Spring Rest API Controller Class";
    }
}

