package com.example.main.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

 /* @RequestMapping("/")*/
  /*public String home(@RequestParam(required = false) String color,
                     @RequestParam(required = false) String username,  Model page) {
    *//*page.addAttribute("username", "Boris");*//*
    page.addAttribute("username", username);
    *//*page.addAttribute("color", "blue");*//*
    page.addAttribute("color", color);
    return "home.html";
  }*/

  @RequestMapping("/{color}")
  public String home(@PathVariable String color, Model page) {
    page.addAttribute("username", "Boris");
    page.addAttribute("color", color);
    return "home.html";
  }
}
