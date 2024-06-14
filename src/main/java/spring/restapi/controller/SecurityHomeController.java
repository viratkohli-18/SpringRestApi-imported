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
        return "This is a public page";
    }

    @GetMapping("/kamal")
    @ResponseBody
    public String privatePage() {
        System.out.println("Private page");
        return "This is a private page. You need to be authenticated to see this.";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}



