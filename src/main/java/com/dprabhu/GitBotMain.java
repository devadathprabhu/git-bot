/**
 * @author dprabhu
 */
package com.dprabhu;

import com.dprabhu.committer.Committer;
import com.dprabhu.committer.RandomCommitter;

public class GitBotMain {

  public static void main(String args[]) {

    Committer committer = new RandomCommitter();
    committer.commitInShape();

  }

}
