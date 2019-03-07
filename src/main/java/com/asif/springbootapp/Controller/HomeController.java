package com.asif.springbootapp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        String object="This is the new Begining";
        model.addAttribute("object",object);
        return "index";
    }
}
