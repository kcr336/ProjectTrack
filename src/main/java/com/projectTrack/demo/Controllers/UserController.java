package com.projectTrack.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
@RequestMapping (value="user")
public class UserController {

    static ArrayList<String> users = new ArrayList<>();
    @GetMapping(value = "home")
    public String returnAppSummary() {
        System.out.println("hello");
        return "index";


}
    @GetMapping(value="")
    public String makeUser(Model model){
        model.addAttribute("users", users);
        users.add("Karen Beisel");
        model.addAttribute("title", "Create a User");
        return "user";

        }

    @RequestMapping (value="add")
    public String displayAddUserForm(Model model){
        model.addAttribute("title", "Add a User");
        return "add";
    }
}
