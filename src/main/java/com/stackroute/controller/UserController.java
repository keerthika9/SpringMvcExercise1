package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  @RequestMapping("/")
public String display(ModelMap map){
    User user=new User();
    user.setName("keer");
    map.addAttribute("name",user);
    return "index";

  }

}
