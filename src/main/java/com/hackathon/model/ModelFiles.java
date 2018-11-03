package com.hackathon.model;

import java.io.*;
import java.util.ArrayList;

public abstract class ModelFiles {

  public static ArrayList load(String file) throws IOException, ClassNotFoundException {
    ArrayList array = new ArrayList();
    try {
      FileInputStream fileIn = new FileInputStream(file);
      ObjectInputStream in = new ObjectInputStream(fileIn);
      array = (ArrayList) in.readObject();
      in.close();
      fileIn.close();
      System.out.println("Data loaded.");
    } catch (EOFException E) {
      System.out.println("File may be empty -" + E);
    }
    return array;
  }

  public static void save(String file, java.lang.Object object) throws IOException {
    FileOutputStream fileOut = new FileOutputStream(file);
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(object);
    out.close();
    fileOut.close();
  }
}