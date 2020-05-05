package com.dprabhu.model;

import static com.dprabhu.constants.GitBotConstants.PROJECT_PATH;

import java.io.File;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public class GitRepo {
  private static GitRepo gitRepository = null;

  private Git repo = null;

  private GitRepo(){
    try {
      FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
      Repository repository = repositoryBuilder
          .setGitDir(new File(PROJECT_PATH + "/.git"))
          .readEnvironment()
          .findGitDir()
          .setMustExist(true)
          .build();
      repo = new Git(repository);
    }
    catch (Exception e){
      System.out.println("--GitRepo() Exception while creating git repository");
    }
  }

  public static GitRepo getGitRepo(){
    if (gitRepository == null) {
      gitRepository = new GitRepo();
    }

    return gitRepository;
  }

  public Git getRepo() {
    return repo;
  }
}
