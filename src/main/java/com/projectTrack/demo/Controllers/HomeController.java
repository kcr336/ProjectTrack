package com.projectTrack.demo.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {
    @RequestMapping(value = "")
    public String returnAppSummary() {
        return "index";


    }
}

