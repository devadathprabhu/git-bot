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

  public void commit(LocalDate startDate, long weeksToAdd, long daysToAdd) {
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

  public void push(){
    gitHelper.gitPush();
  }

  protected int getRandomInteger(int upperBound) {
    Random random = new Random();
    return random.nextInt(upperBound);
  }
}
