/**
 * @author dprabhu
 */
package com.dprabhu;

import java.io.IOException;

import com.dprabhu.committer.BaseCommitter;
import com.dprabhu.committer.RandomCommitter;
import com.dprabhu.helpers.FileHelper;

public class GitBotMain {

  public static void main(String args[]) throws IOException {

    System.out.println("Git tricks!");

    FileHelper fileHelper = new FileHelper();
    BaseCommitter baseCommitter = new RandomCommitter();
    fileHelper.createFileForCommit();
    baseCommitter.commit();

  }

}
