package com.imbharatteja.firstwebapp.controller;

import com.imbharatteja.firstwebapp.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/*
    Spring MVC Controller

    https://www.baeldung.com/spring-controller-vs-restcontroller
 */

@Controller
public class FirstMVCController {

    @GetMapping("/home")
    public String home() {
        System.out.println("hi");
        return "home";
    }

    @GetMapping("/mvname")
    public ModelAndView homeWithName(@RequestParam(defaultValue = "Bharat") String name) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.setViewName("home");
        return mv;
    }

    @GetMapping("/home/alien")
    public ModelAndView getAliens(Alien alien){
        ModelAndView mv = new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("alien");
        return mv;

    }
}
