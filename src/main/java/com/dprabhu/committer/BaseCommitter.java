package com.dprabhu.committer;

import static com.dprabhu.constants.GitBotConstants.PATH_TO_RESOURCE;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import com.dprabhu.helpers.GitHelper;
import com.dprabhu.model.GitRepo;

public abstract class BaseCommitter {

  GitHelper gitHelper = new GitHelper();

  public void commit(LocalDate startDate, long weeksToAdd, long daysToAdd) throws IOException {
    try {
      Git git = GitRepo.getGitRepo().getRepo();
      LocalDate commitDate = startDate.plusWeeks(weeksToAdd).plusDays(daysToAdd);
      if(commitDate.isAfter(LocalDate.now())){
        System.out.println("Commit date " + commitDate.toString() + " is future date!");
        System.out.print("Commit skipped for startDate: " + startDate);
        System.out.println(" week: " + weeksToAdd + " day: " + daysToAdd);
      }
      else {
        Date date = Date.from(commitDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

//        gitHelper.gitCommit(date);
        PersonIdent defaultCommitter = new PersonIdent(git.getRepository());
        PersonIdent committer = new PersonIdent(defaultCommitter, date);
        git.add().addFilepattern(PATH_TO_RESOURCE).call();
        git.commit().setMessage("Test commit from code!").setCommitter(committer).call();
        CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider("", "");
        git.push().setCredentialsProvider(credentialsProvider).call();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
