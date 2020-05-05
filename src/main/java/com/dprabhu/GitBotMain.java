/**
 * @author dprabhu
 */
package com.dprabhu;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

import com.dprabhu.committer.Committer;
import com.dprabhu.factory.CommitterFactory;

public class GitBotMain {

  public static void main(String args[]) {

    System.out.println("Starting git-bot...");

    System.out.println("Select the pattern to be drawn on your git contribution graph:");
    System.out.println("1. Random");
    System.out.println("2. Cool specs");
    System.out.println("3. Devadath");
    System.out.print("Your selection: ");

    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();

    System.out.print("Enter the start date from where the pattern has to be drawn on git"
        + "contribution graph in the format (year month day):"
        + "(Example: 2020 01 01) : ");

    int year = scanner.nextInt();
    int month = scanner.nextInt();
    int day = scanner.nextInt();

    LocalDate localDate = LocalDate.of(year, month, day);

    System.out.println("Enter the number of commits to be made for each pixel: "
        + "NOTE: Higher the commits, darker the pixel!");
    System.out.print("Your input: ");

    int noOfCommits = scanner.nextInt();

    String committerType = getCommitterType(option);
    Optional<Committer> committerOptional = CommitterFactory.getCommitter(committerType);

    if(committerOptional.isPresent()){
      committerOptional.get().commitInShape(localDate, noOfCommits);
    } else {
      System.out.println("Invalid committer type OR committer type not supported");
    }

  }

  private static String getCommitterType(int option) {
    String type = null;
    switch (option){
      case 1 : type = "random"; break;
      case 2 : type = "cool"; break;
      case 3 : type = "devadath"; break;
      default: break;
    }

    return type;
  }

}
