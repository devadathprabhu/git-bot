package com.dprabhu.committer;

import static com.dprabhu.constants.GitBotConstants.PATH_TO_RESOURCE;
import static com.dprabhu.constants.GitBotConstants.PROJECT_PATH;

import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

public abstract class BaseCommitter {

  public void commit() throws IOException {
    try {
      FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
      Repository repository = repositoryBuilder.setGitDir(new File(PROJECT_PATH + "/.git")).readEnvironment() // scan environment GIT_* variables
          .findGitDir() // scan up the file system tree
          .setMustExist(true).build();
      Git git = new Git(repository);
      git.add().addFilepattern(PATH_TO_RESOURCE+'*').call();
      git.commit().setMessage("Test commit from code!").call();
      git.push();
    }catch (Exception e){

    }
  }
}
