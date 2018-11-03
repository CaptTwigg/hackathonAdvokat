package com.hackathon.auth;

import com.hackathon.model.ModelFiles;
import com.hackathon.model.User;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class Session {
  public static boolean isLoggedIn(HttpSession session) {
    return session.getAttribute("NIVEAU") != null;
  }

  public static boolean login(String username, String password, HttpSession session) throws IOException, ClassNotFoundException {
    ArrayList<User> users = ModelFiles.load("users.txt");
    for (User user : users){
      if(user.getPassword().equals(password) & user.getUsername().equals(username)) {
        session.setAttribute("NIVEAU", user.getNiveau());
        return true;
      }
    }
    return false;
  }

  public static void logout(HttpSession session) {
    session.removeAttribute("ID");
    session.removeAttribute("REALNAME");
    session.removeAttribute("NIVEAU");
  }

  public static boolean isChef(HttpSession session) {
    return (int) session.getAttribute("NIVEAU") == 1;
  }
}
