package spring.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityHomeController {

    @GetMapping("/public")
    @ResponseBody
    public String publicPage() {
        System.out.println("Public page");
        return "This is a public page from hub";
    }

    @GetMapping("/kamal")
    @ResponseBody
    public String privatePage() {
        System.out.println("Private page");
        return "this needed to work";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}



