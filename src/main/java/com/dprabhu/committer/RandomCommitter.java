package com.dprabhu.committer;

import java.io.IOException;

public class RandomCommitter extends BaseCommitter implements Committer {

  @Override
  public void commitInShape() {
    try {
      commit();
    }
    catch (IOException ioException){

    }
  }
}