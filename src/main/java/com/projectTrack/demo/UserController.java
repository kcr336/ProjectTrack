package com.projectTrack.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping (value="User")

public class UserController {


    @RequestMapping(value = "")
        public String returnHomePage() {
        return "index.html";
}

}
