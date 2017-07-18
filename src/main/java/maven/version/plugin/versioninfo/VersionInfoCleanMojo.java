package maven.version.plugin.versioninfo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "clean")
public class VersionInfoCleanMojo extends AbstractMojo {

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {
    // TODO Auto-generated method stub
    System.out.println("Cleaning .....");
  }

}
