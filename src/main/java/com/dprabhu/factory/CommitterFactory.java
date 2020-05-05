package com.dprabhu.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.dprabhu.committer.Committer;
import com.dprabhu.committer.CoolSpecsCommitter;
import com.dprabhu.committer.DevadathCommitter;
import com.dprabhu.committer.RandomCommitter;

public class CommitterFactory {
  static Map<String, Committer> committerMap = new HashMap<>();

  static {
    committerMap.put("random", new RandomCommitter());
    committerMap.put("cool", new CoolSpecsCommitter());
    committerMap.put("devadath", new DevadathCommitter());
  }

  public static Optional<Committer> getCommitter(String committerType) {
    return Optional.ofNullable(committerMap.get(committerType.toLowerCase()));
  }

}
