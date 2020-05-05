package com.dprabhu.helpers;

import static com.dprabhu.constants.GitBotConstants.COMMIT_MSG;
import static com.dprabhu.constants.GitBotConstants.GIT_PASSWORD;
import static com.dprabhu.constants.GitBotConstants.GIT_USER_NAME;
import static com.dprabhu.constants.GitBotConstants.PATH_TO_RESOURCE;

import java.util.Date;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import com.dprabhu.model.GitRepo;

public class GitHelper {

  Git git = GitRepo.getGitRepo().getRepo();

  public void gitCommit(Date date){

    try {
      PersonIdent defaultCommitter = new PersonIdent(git.getRepository());
      PersonIdent committer = new PersonIdent(defaultCommitter, date);
      git.add().addFilepattern(PATH_TO_RESOURCE).call();
      git.commit().setMessage(COMMIT_MSG).setCommitter(committer).call();
    } catch(GitAPIException gitAPIException){
      System.out.println("Git commit failed for date: " + date);
    }

  }

  public void gitPush(){
    try {
      CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider(GIT_USER_NAME, GIT_PASSWORD);
      git.push().setCredentialsProvider(credentialsProvider).call();
    } catch(GitAPIException gitAPIException){
      System.out.println("Git push failed!!!");
    }

  }
}
