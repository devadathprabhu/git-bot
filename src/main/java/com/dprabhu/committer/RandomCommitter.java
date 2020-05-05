package com.dprabhu.committer;

import java.io.IOException;
import java.time.LocalDate;

public class RandomCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape() {
    try {
      LocalDate localDate = LocalDate.now();
      commit(localDate, 3, 4);
    }
    catch (IOException ioException){

    }
  }
}