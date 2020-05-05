package com.dprabhu.committer;

import java.time.LocalDate;

public class DevadathCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    for(int i=0; i<noOfCommits; i++){
      LocalDate tempDate = localDate;
      tempDate = drawD(tempDate);
      System.out.println("Date before E: " + tempDate.toString());
      tempDate = drawE(tempDate);
      System.out.println("Date after E: " + tempDate.toString());
      tempDate = drawV(tempDate);
      System.out.println("Date after V: " + tempDate.toString());
//      tempDate = drawA(tempDate);
//      tempDate = drawD(tempDate);
//      tempDate = drawA(tempDate);
//      tempDate = drawT(tempDate);
//      tempDate = drawH(tempDate);
    }

    push();
  }
}
