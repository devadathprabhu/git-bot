package com.dprabhu.committer;

import java.time.LocalDate;

public class CoolSpecsCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    System.out.println("Commits will be done in specs pattern from date:" + localDate.toString());

    for(int i=0; i<noOfCommits; i++){
      commit(localDate, 1, 1);
      commit(localDate, 2, 1);
      commit(localDate, 2, 2);
      commit(localDate, 2, 3);
      commit(localDate, 2, 4);
      commit(localDate, 3, 1);
      commit(localDate, 3, 2);
      commit(localDate, 3, 3);
      commit(localDate, 3, 4);
      commit(localDate, 3, 5);
      commit(localDate, 4, 1);
      commit(localDate, 4, 2);
      commit(localDate, 4, 3);
      commit(localDate, 4, 4);
      commit(localDate, 4, 5);
      commit(localDate, 5, 1);
      commit(localDate, 5, 2);
      commit(localDate, 5, 3);
      commit(localDate, 5, 4);
      commit(localDate, 5, 5);
      commit(localDate, 6, 1);
      commit(localDate, 6, 2);
      commit(localDate, 6, 3);
      commit(localDate, 6, 4);
      commit(localDate, 6, 5);
      commit(localDate, 7, 1);
      commit(localDate, 7, 2);
      commit(localDate, 7, 3);
      commit(localDate, 7, 4);
      commit(localDate, 8, 1);
      commit(localDate, 8, 2);
      commit(localDate, 9, 2);
      commit(localDate, 10, 2);
      commit(localDate, 11, 1);
      commit(localDate, 11, 2);
      commit(localDate, 12, 1);
      commit(localDate, 12, 2);
      commit(localDate, 12, 3);
      commit(localDate, 12, 4);
      commit(localDate, 13, 1);
      commit(localDate, 13, 2);
      commit(localDate, 13, 3);
      commit(localDate, 13, 4);
      commit(localDate, 13, 5);
      commit(localDate, 14, 1);
      commit(localDate, 14, 2);
      commit(localDate, 14, 3);
      commit(localDate, 14, 4);
      commit(localDate, 14, 5);
      commit(localDate, 15, 1);
      commit(localDate, 15, 2);
      commit(localDate, 15, 3);
      commit(localDate, 15, 4);
      commit(localDate, 15, 5);
      commit(localDate, 16, 1);
      commit(localDate, 16, 2);
      commit(localDate, 16, 3);
      commit(localDate, 16, 4);
      commit(localDate, 16, 5);
      commit(localDate, 17, 1);
      commit(localDate, 17, 2);
      commit(localDate, 17, 3);
      commit(localDate, 17, 4);
      commit(localDate, 18, 1);

    }

    push();
  }

}
