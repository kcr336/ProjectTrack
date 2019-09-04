package com.projectTrack.demo.Controllers;

import com.projectTrack.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping (value="user")
public class UserController {
    static HashMap<Integer, User> users;

    public UserController() {
        users = new HashMap<>();
        users.put(1, new User ("kcr336","kcr336@gmail.com","Karen" ,"Beisel"));
    }

    @GetMapping(value = "home")
    public String returnAppSummary() {
        System.out.println("hello");
        return "index";


}
    @GetMapping(value="")
    public String makeUser(Model model){
        model.addAttribute("users", users);
        model.addAttribute("title", "Create a User");
        return "user";

        }

    @RequestMapping (value="add", method= RequestMethod.GET)
    public String displayAddUserForm(Model model){
        model.addAttribute("title", "Add a User");
        return "add";
    }
    @RequestMapping (value="add", method= RequestMethod.POST)
    public String processAddUserForm(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String userName, @RequestParam String email){
       int id= users.size()+1;
       users.put(id, new User (firstName, lastName, userName, email));
        return "redirect:";
    }
}
