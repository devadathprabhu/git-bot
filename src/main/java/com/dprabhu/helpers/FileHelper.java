package com.dprabhu.helpers;

import static com.dprabhu.constants.GitBotConstants.PATH_TO_RESOURCE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class FileHelper {

  public void createFileForCommit(Date date) {
    long milliseconds = date.getTime();
    String fileName = milliseconds + ".txt";
    System.out.println("FileName: " + fileName);
    String file = PATH_TO_RESOURCE + fileName;

    try {
      FileUtils.touch(new File(file));
      FileWriter myWriter = new FileWriter(file);
      String fileContent = date.toString();
      System.out.println(fileContent);
      myWriter.write(fileContent);
      myWriter.close();
    } catch (IOException ioException) {
      System.out.println(ioException.getMessage());
      ioException.getStackTrace();
    }

  }

}
