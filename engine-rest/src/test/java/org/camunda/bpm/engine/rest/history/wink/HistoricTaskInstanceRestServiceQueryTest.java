package org.camunda.bpm.engine.rest.history.wink;

import org.camunda.bpm.engine.rest.history.AbstractHistoricTaskInstanceRestServiceQueryTest;
import org.camunda.bpm.engine.rest.wink.util.WinkTomcatServerBootstrap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.rules.TemporaryFolder;

public class HistoricTaskInstanceRestServiceQueryTest extends AbstractHistoricTaskInstanceRestServiceQueryTest {

  protected static WinkTomcatServerBootstrap serverBootstrap;

  @ClassRule
  public static TemporaryFolder temporaryFolder = new TemporaryFolder();

  @BeforeClass
  public static void setUpEmbeddedRuntime() {
    serverBootstrap = new WinkTomcatServerBootstrap();
    serverBootstrap.setWorkingDir(temporaryFolder.getRoot().getAbsolutePath());
    serverBootstrap.start();
  }

  @AfterClass
  public static void tearDownEmbeddedRuntime() {
    serverBootstrap.stop();
  }

}
