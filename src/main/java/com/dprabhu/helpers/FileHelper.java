package com.dprabhu.helpers;

import static com.dprabhu.constants.GitBotConstants.PATH_TO_RESOURCE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class FileHelper {

  public void createFileForCommit(Date date) {
    String timeStamp = LocalDateTime.now()
                        .toString()
                        .replace('-', 'X')
                        .replace('.', 'X')
                        .replace(':', 'X');
    String fileName = timeStamp + ".txt";
    String file = PATH_TO_RESOURCE + fileName;

    try {
      FileUtils.touch(new File(file));
      System.out.println("File generated: " + file);
      FileWriter myWriter = new FileWriter(file);
      String fileContent = date.toString();
      myWriter.write(fileContent);
      myWriter.close();
    } catch (IOException ioException) {
      System.out.println(ioException.getMessage());
      ioException.getStackTrace();
    }

  }

}
