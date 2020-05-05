package com.dprabhu.committer;

import java.time.LocalDate;

public class CrabCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    for(int i=0; i<noOfCommits; i++){
      commit(localDate, 1, 3);
      commit(localDate, 1, 4);
      commit(localDate, 1, 5);

      commit(localDate, 2, 2);
      commit(localDate, 2, 3);

      commit(localDate, 3, 1);
      commit(localDate, 3, 2);
      commit(localDate, 3, 3);
      commit(localDate, 3, 4);
      commit(localDate, 3, 5);

      commit(localDate, 4, 0);
      commit(localDate, 4, 1);
      commit(localDate, 4, 3);
      commit(localDate, 4, 4);
      commit(localDate, 4, 6);

      commit(localDate, 5, 1);
      commit(localDate, 5, 2);
      commit(localDate, 5, 3);
      commit(localDate, 5, 4);
      commit(localDate, 6, 1);
      commit(localDate, 6, 2);
      commit(localDate, 6, 3);
      commit(localDate, 6, 4);
      commit(localDate, 7, 1);
      commit(localDate, 7, 2);
      commit(localDate, 7, 3);
      commit(localDate, 7, 4);

      commit(localDate, 8, 0);
      commit(localDate, 8, 1);
      commit(localDate, 8, 3);
      commit(localDate, 8, 4);
      commit(localDate, 8, 6);

      commit(localDate, 9, 1);
      commit(localDate, 9, 2);
      commit(localDate, 9, 3);
      commit(localDate, 9, 4);
      commit(localDate, 9, 5);

      commit(localDate, 10, 2);
      commit(localDate, 10, 3);

      commit(localDate, 11, 3);
      commit(localDate, 11, 4);
      commit(localDate, 11, 5);
    }

    push();
  }
}
