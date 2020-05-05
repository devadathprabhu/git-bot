package com.dprabhu.committer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

import com.dprabhu.helpers.FileHelper;
import com.dprabhu.helpers.GitHelper;

public abstract class BaseCommitter {

  GitHelper gitHelper = new GitHelper();
  FileHelper fileHelper = new FileHelper();

  protected void commit(LocalDate startDate, long weeksToAdd, long daysToAdd) {
    try {
      LocalDate commitLocalDate = startDate.plusWeeks(weeksToAdd).plusDays(daysToAdd);
      if(commitLocalDate.isAfter(LocalDate.now())){
        System.out.println("Commit date " + commitLocalDate.toString() + " is future date!");
        System.out.print("Commit skipped for startDate: " + startDate);
        System.out.println(" week: " + weeksToAdd + " day: " + daysToAdd);
      }
      else {
        Date commitDate = Date.from(commitLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        fileHelper.createFileForCommit(commitDate);

        gitHelper.gitCommit(commitDate);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }

  }

  protected void push(){
    gitHelper.gitPush();
  }

  protected int getRandomInt(int upperBound) {
    Random random = new Random();
    return random.nextInt(upperBound);
  }

  protected LocalDate drawA(LocalDate localDate){
    commit(localDate, 1, 2);
    commit(localDate, 1, 3);
    commit(localDate, 1, 4);
    commit(localDate, 1, 5);
    commit(localDate, 2, 1);
    commit(localDate, 2, 3);
    commit(localDate, 3, 1);
    commit(localDate, 3, 3);
    commit(localDate, 4, 1);
    commit(localDate, 4, 3);
    commit(localDate, 5, 2);
    commit(localDate, 5, 3);
    commit(localDate, 5, 4);
    commit(localDate, 5, 5);

    return localDate.plusWeeks(6);
  }

  protected LocalDate drawD(LocalDate localDate){
    commit(localDate, 1, 1);
    commit(localDate, 1, 2);
    commit(localDate, 1, 3);
    commit(localDate, 1, 4);
    commit(localDate, 1, 5);
    commit(localDate, 2, 1);
    commit(localDate, 2, 5);
    commit(localDate, 3, 1);
    commit(localDate, 3, 5);
    commit(localDate, 4, 2);
    commit(localDate, 4, 3);
    commit(localDate, 4, 4);

    return localDate.plusWeeks(5);
  }

  protected LocalDate drawE(LocalDate localDate){
    commit(localDate, 1, 1);
    commit(localDate, 1, 2);
    commit(localDate, 1, 3);
    commit(localDate, 1, 4);
    commit(localDate, 1, 5);
    commit(localDate, 2, 1);
    commit(localDate, 2, 3);
    commit(localDate, 2, 5);
    commit(localDate, 3, 1);
    commit(localDate, 3, 3);
    commit(localDate, 3, 5);
    commit(localDate, 4, 1);
    commit(localDate, 4, 5);

    return localDate.plusWeeks(5);
  }

  protected LocalDate drawV(LocalDate localDate){
    commit(localDate, 1, 1);
    commit(localDate, 1, 2);
    commit(localDate, 2, 3);
    commit(localDate, 2, 4);
    commit(localDate, 3, 5);
    commit(localDate, 4, 3);
    commit(localDate, 4, 4);
    commit(localDate, 5, 1);
    commit(localDate, 5, 2);

    return localDate.plusWeeks(6);
  }

  protected LocalDate drawT(LocalDate localDate){
    commit(localDate, 1, 1);
    commit(localDate, 2, 1);
    commit(localDate, 3, 1);
    commit(localDate, 3, 2);
    commit(localDate, 3, 3);
    commit(localDate, 3, 4);
    commit(localDate, 3, 5);
    commit(localDate, 4, 1);
    commit(localDate, 5, 1);

    return localDate.plusWeeks(6);
  }

  protected LocalDate drawH(LocalDate localDate){
    commit(localDate, 1, 1);
    commit(localDate, 1, 2);
    commit(localDate, 1, 3);
    commit(localDate, 1, 4);
    commit(localDate, 1, 5);
    commit(localDate, 2, 3);
    commit(localDate, 3, 3);
    commit(localDate, 4, 3);
    commit(localDate, 5, 1);
    commit(localDate, 5, 2);
    commit(localDate, 5, 3);
    commit(localDate, 5, 4);
    commit(localDate, 5, 5);

    return localDate.plusWeeks(6);
  }
}
