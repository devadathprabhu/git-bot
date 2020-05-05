package com.dprabhu.committer;

import java.time.LocalDate;

public class RandomCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape() {

    LocalDate localDate = LocalDate.of(2014, 01, 02);

    for(int i=0; i<500; i++){
      commit(localDate, getRandomInteger(52), getRandomInteger(7));
    }
    push();
  }
}