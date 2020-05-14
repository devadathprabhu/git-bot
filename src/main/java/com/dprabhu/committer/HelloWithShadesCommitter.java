package com.dprabhu.committer;

import java.time.LocalDate;

public class HelloWithShadesCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape(LocalDate localDate, int noOfCommits) {

    System.out.println("Starting dark shades!!");
    for(int i=0; i<80; i++){
      // Part of h
      commit(localDate, 1, 2);
      commit(localDate, 1, 3);
      commit(localDate, 1, 4);
      commit(localDate, 2, 2);
      commit(localDate, 3, 2);
      commit(localDate, 3, 3);
      commit(localDate, 3, 4);

      // Part of e
      commit(localDate, 5, 3);
      commit(localDate, 5, 4);
      commit(localDate, 6, 2);
      commit(localDate, 6, 4);
      commit(localDate, 7, 2);
      commit(localDate, 7, 3);
      commit(localDate, 7, 4);

      // Part of l
      commit(localDate, 9, 2);
      commit(localDate, 9, 3);
      commit(localDate, 9, 4);

      // Part of l
      commit(localDate, 11, 2);
      commit(localDate, 11, 3);
      commit(localDate, 11, 4);

      // Part of o
      commit(localDate, 13, 3);
      commit(localDate, 13, 4);
      commit(localDate, 15, 3);
      commit(localDate, 15, 4);

      // Part of !
      commit(localDate, 17, 0);
      commit(localDate, 17, 1);
      commit(localDate, 17, 2);
      commit(localDate, 17, 6);

      push();

    }


    System.out.println("Starting medium shades!!");

    for(int i=0; i<45; i++){

      // Part of h
      commit(localDate, 1, 1);
      commit(localDate, 1, 5);
      commit(localDate, 3, 5);

      // Part of e
      commit(localDate, 5, 2);
      commit(localDate, 5, 5);

      // Part of l
      commit(localDate, 9, 1);
      commit(localDate, 9, 5);

      // Part of l
      commit(localDate, 11, 1);
      commit(localDate, 11, 5);

      // Part of o
      commit(localDate, 13, 5);
      commit(localDate, 14, 2);
      commit(localDate, 15, 5);

      // Part of !
      commit(localDate, 17, 3);

      push();

    }


    System.out.println("Starting light shades!!");

    for(int i=0; i<20; i++){
      // Part of h
      commit(localDate, 1, 0);
      commit(localDate, 1, 6);
      commit(localDate, 3, 6);

      // Part of e
      commit(localDate, 5, 6);
      commit(localDate, 6, 6);
      commit(localDate, 7, 6);

      // Part of l
      commit(localDate, 9, 0);
      commit(localDate, 9, 6);

      // Part of l
      commit(localDate, 11, 0);
      commit(localDate, 11, 6);

      // Part of o
      commit(localDate, 13, 2);
      commit(localDate, 15, 2);

      commit(localDate, 13, 6);
      commit(localDate, 14, 6);
      commit(localDate, 15, 6);

      // Part of !
      commit(localDate, 17, 4);

      push();

    }
  }

}
