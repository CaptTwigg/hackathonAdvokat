package com.hackathon.controller;

import com.hackathon.auth.Session;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {
  static boolean loginFailed = false;
  @GetMapping("/")
  public String index(){

    return "index";
  }

  @GetMapping("/cases")
  public String cases(){
    return "cases";
  }

  @GetMapping("/login")
  public String viewLogin(Model model){
    model.addAttribute("loginFailed", loginFailed);
    return "login";
  }

  @PostMapping("/login")
  public String login(
          @RequestParam("username") String username,
          @RequestParam("password") String password,
          @RequestParam("action") String action,
          HttpSession session) throws IOException, ClassNotFoundException
  {
    if(action.equals("Log Ind"))
      if (Session.login(username, password, session)) {
        loginFailed = true;
      } else {
        loginFailed = false;
        return "redirect:/";
      }
    return "redirect:/";
  }
}
