package com.dprabhu.committer;

import java.time.LocalDate;

public class RandomCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    System.out.println("Random commits will be done from date" +
        localDate.toString() + "to one year!");

    for(int i=0; i<noOfCommits; i++){
      commit(localDate, getRandomInt(52), getRandomInt(7));
    }

    push();
  }
}