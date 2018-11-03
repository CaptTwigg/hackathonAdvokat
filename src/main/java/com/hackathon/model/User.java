package com.hackathon.model;

import java.io.Serializable;

public class User implements Serializable {

  String username;
  String password;
  int niveau;

  public User(String username, String password, int niveau) {
    this.username = username;
    this.password = password;
    this.niveau = niveau;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getNiveau() {
    return niveau;
  }

  public void setNiveau(int niveau) {
    this.niveau = niveau;
  }
}
