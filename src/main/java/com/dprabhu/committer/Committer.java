package com.dprabhu.committer;

import java.time.LocalDate;

public interface Committer {
  public void commitInShape(LocalDate localDate, int noOfCommits);
}
