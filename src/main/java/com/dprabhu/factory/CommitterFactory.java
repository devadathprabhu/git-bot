package com.dprabhu.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.dprabhu.committer.Committer;
import com.dprabhu.committer.CoolSpecsCommitter;
import com.dprabhu.committer.CrabCommitter;
import com.dprabhu.committer.DevadathCommitter;
import com.dprabhu.committer.ECGCommitter;
import com.dprabhu.committer.RandomCommitter;

public class CommitterFactory {
  static Map<String, Committer> committerMap = new HashMap<>();

  static {
    committerMap.put("random", new RandomCommitter());
    committerMap.put("cool", new CoolSpecsCommitter());
    committerMap.put("devadath", new DevadathCommitter());
    committerMap.put("crab", new CrabCommitter());
    committerMap.put("ecg", new ECGCommitter());
  }

  public static Optional<Committer> getCommitter(String committerType) {
    return Optional.ofNullable(committerMap.get(committerType.toLowerCase()));
  }

}
