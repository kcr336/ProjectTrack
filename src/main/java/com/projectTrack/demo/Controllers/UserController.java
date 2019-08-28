package com.projectTrack.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
@RequestMapping (value="user")
public class UserController {

    static ArrayList<String> users = new ArrayList<>();
    @RequestMapping(value = "")
    public String returnAppSummary() {
        return "index.html";


}
    @RequestMapping(value="makeUser")
    public String makeUser(Model model){
        model.addAttribute("users", users);
        model.addAttribute("title", "Create a User");
        return "index.html";

        }

}
