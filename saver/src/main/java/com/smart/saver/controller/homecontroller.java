package com.smart.saver.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class homecontroller {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("Name","Dhanrajshakya");
        model.addAttribute("googlelink","www.google.com.in");
        System.out.println("welcome to the home page");
        return "home";
    }

    //about page
    @RequestMapping("/about")
    public String about(){
        System.out.println("about page loading ");
        return "about";
    }

    //services page\
    @RequestMapping("/services")
    public String services(){
        System.out.println("services page loading ");
        return "services";
    }

    //contact page//
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }

    @GetMapping("/login")
    public String login() {
        return new String("login");
    }

    @GetMapping("register")
    public String register() {
        return new String("register");
    }
    

    
}
