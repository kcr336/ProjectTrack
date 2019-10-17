package com.projectTrack.demo.Controllers;

import com.projectTrack.demo.User;
import com.projectTrack.demo.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping (value="user")
public class UserController {

@Autowired
UserDAO dao;

    public UserController(UserDAO dao) {
        this.dao = dao;
    }

    @GetMapping(value = "home")
    public String returnAppSummary() {
        System.out.println("hello");
        return "index";


}
    @GetMapping(value="")
    public String makeUser(Model model, User user){
        model.addAttribute("users", dao);
        model.addAttribute("title", "Create a User");
        return "user";

        }

    @RequestMapping (value="add", method= RequestMethod.GET)
    public String displayAddUserForm(Model model){
        model.addAttribute("users", dao);
        model.addAttribute("title", "Add a User");
        return "add";
    }
    @RequestMapping (value="add", method= RequestMethod.POST)
    public String processAddUserForm(@RequestParam String fullName, @RequestParam String userName, @RequestParam String email){
        User user = new User(userName,fullName , email);
        dao.addUser(user);
        return "redirect:";
    }
}
