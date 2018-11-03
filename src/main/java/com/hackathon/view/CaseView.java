package com.hackathon.view;

import com.hackathon.model.Case;
import com.hackathon.model.ModelFiles;

import java.io.IOException;
import java.util.ArrayList;

public class CaseView {


  public static void main(String[] args) throws IOException {
    ArrayList arrayList = new ArrayList();
    arrayList.add(new Case(generateCaseNumber(arrayList), "Ole Hansen", "plaintiff", "Rasmus Jacobsen", "plainttiffRep", "Casetype", "juristiction", 10000000, "Hans Hansen", "Christion Jensen"));
    arrayList.add(new Case(generateCaseNumber(arrayList), "Ole Hansen", "plaintiff", "Rasmus Jacobsen", "plainttiffRep", "Casetype", "juristiction", 10000000, "Hans Hansen", "Christion Jensen"));
    arrayList.add(new Case(generateCaseNumber(arrayList), "Ole Hansen", "plaintiff", "Rasmus Jacobsen", "plainttiffRep", "Casetype", "juristiction", 10000000, "Hans Hansen", "Christion Jensen"));
    arrayList.add(new Case(generateCaseNumber(arrayList), "Ole Hansen", "plaintiff", "Rasmus Jacobsen", "plainttiffRep", "Casetype", "juristiction", 10000000, "Hans Hansen", "Christion Jensen"));
    arrayList.add(new Case(generateCaseNumber(arrayList), "Ole Hansen", "plaintiff", "Rasmus Jacobsen", "plainttiffRep", "Casetype", "juristiction", 10000000, "Hans Hansen", "Christion Jensen"));


    ModelFiles.save("/Users/bob/Dropbox/github/hackathonAdvokat/src/main/resources/files/cases.txt", arrayList);
  }

  private static int generateCaseNumber(ArrayList<Case> arrayList) {
    Integer caseNumber = 1;

    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i).getCasenumber() >= caseNumber)
        caseNumber = arrayList.get(i).getCasenumber() +1;
    }

    return caseNumber;
  }

  public static ArrayList getCases() throws IOException, ClassNotFoundException {
    return ModelFiles.load("src/main/resources/files/cases.txt");
  }
}
