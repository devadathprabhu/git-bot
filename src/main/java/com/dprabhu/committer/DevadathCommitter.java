package com.dprabhu.committer;

import java.time.LocalDate;

public class DevadathCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    for(int i=0; i<noOfCommits; i++){
      LocalDate tempDate = localDate;
      tempDate = drawD(tempDate);
      tempDate = drawE(tempDate);
      tempDate = drawV(tempDate);
      tempDate = drawA(tempDate);
      tempDate = drawD(tempDate);
      tempDate = drawA(tempDate);
      tempDate = drawT(tempDate);
      tempDate = drawH(tempDate);
    }

    push();
  }
}
