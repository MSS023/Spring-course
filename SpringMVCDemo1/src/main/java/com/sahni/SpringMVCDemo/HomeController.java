package com.sahni.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @ModelAttribute("course")
    public String courseName() {
        return "java";
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien) {
        return "result";
    }
}
