package com.removeattribute.attribute.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/home")
public class homeController {
    
    @RequestMapping("/homepage")
    public String home(Model model,HttpSession session){
        session.setAttribute("message", "This is a session message how are you");
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/services")
    public String services(){
        return "services";
    }

    
}
