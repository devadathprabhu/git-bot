package com.dprabhu.committer;

import java.time.LocalDate;

public class ECGCommitter extends BaseCommitter implements Committer {
  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    for(int i=0; i<noOfCommits; i++){
      commit(localDate, 0, 3);
      commit(localDate, 1, 3);
      commit(localDate, 2, 3);
      commit(localDate, 3, 3);
      commit(localDate, 4, 3);
      commit(localDate, 5, 3);
      commit(localDate, 6, 3);
      commit(localDate, 7, 3);
      commit(localDate, 8, 4);
      commit(localDate, 9, 3);
      commit(localDate, 10, 4);
      commit(localDate, 11, 5);
      commit(localDate, 11, 6);
      commit(localDate, 12, 3);
      commit(localDate, 12, 4);
      commit(localDate, 12, 5);

      commit(localDate, 13, 0);
      commit(localDate, 13, 1);
      commit(localDate, 13, 2);
      commit(localDate, 13, 3);

      commit(localDate, 14, 1);
      commit(localDate, 14, 2);

      commit(localDate, 15, 3);
      commit(localDate, 16, 3);

      commit(localDate, 17, 4);
      commit(localDate, 18, 3);
      commit(localDate, 19, 2);

      // End of one wave!

      commit(localDate, 20, 3);
      commit(localDate, 21, 3);
      commit(localDate, 22, 3);
      commit(localDate, 23, 3);
      commit(localDate, 24, 3);
      commit(localDate, 25, 3);
      commit(localDate, 26, 3);
      commit(localDate, 27, 3);
      commit(localDate, 28, 4);
      commit(localDate, 29, 3);
      commit(localDate, 30, 4);
      commit(localDate, 31, 5);
      commit(localDate, 31, 6);
      commit(localDate, 32, 3);
      commit(localDate, 32, 4);
      commit(localDate, 32, 5);

      commit(localDate, 33, 0);
      commit(localDate, 33, 1);
      commit(localDate, 33, 2);
      commit(localDate, 33, 3);

      commit(localDate, 34, 1);
      commit(localDate, 34, 2);

      commit(localDate, 35, 3);
      commit(localDate, 36, 3);

      commit(localDate, 37, 4);
      commit(localDate, 38, 3);
      commit(localDate, 39, 2);

      // End of another wave

      commit(localDate, 40, 3);
      commit(localDate, 41, 3);
      commit(localDate, 42, 3);
      commit(localDate, 43, 3);
      commit(localDate, 44, 4);
      commit(localDate, 45, 3);
      commit(localDate, 46, 3);
      commit(localDate, 47, 3);

      commit(localDate, 48, 4);
      commit(localDate, 49, 3);
      commit(localDate, 50, 2);
      commit(localDate, 51, 1);
    }

    push();
  }
}
