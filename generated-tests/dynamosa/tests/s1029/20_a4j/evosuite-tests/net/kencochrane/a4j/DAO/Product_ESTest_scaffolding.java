/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jul 04 21:44:00 GMT 2019
 */

package net.kencochrane.a4j.DAO;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Product_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.kencochrane.a4j.DAO.Product"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/20_a4j"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Product_ESTest_scaffolding.class.getClassLoader() ,
      "net.kencochrane.a4j.beans.Authors",
      "net.kencochrane.a4j.beans.ThirdPartyProductDetails",
      "net.kencochrane.a4j.beans.BrowseList",
      "net.kencochrane.a4j.beans.Directors",
      "net.kencochrane.a4j.util.LoadProperties",
      "net.kencochrane.a4j.beans.SimilarProducts",
      "net.kencochrane.a4j.util.a4jUtil",
      "com.wutka.jox.JOXBeanInputStream",
      "net.kencochrane.a4j.DAO.Search",
      "net.kencochrane.a4j.beans.Reviews",
      "net.kencochrane.a4j.beans.MiniProduct",
      "net.kencochrane.a4j.file.FileUtil",
      "net.kencochrane.a4j.beans.FullProduct",
      "net.kencochrane.a4j.beans.Lists",
      "net.kencochrane.a4j.data.Query",
      "net.kencochrane.a4j.beans.BrowseNode",
      "net.kencochrane.a4j.beans.ListingProductInfo",
      "net.kencochrane.a4j.beans.ProductDetails",
      "net.kencochrane.a4j.beans.Tracks",
      "net.kencochrane.a4j.beans.Artists",
      "net.kencochrane.a4j.beans.CustomerReview",
      "net.kencochrane.a4j.beans.SellerSearch",
      "net.kencochrane.a4j.beans.Starring",
      "net.kencochrane.a4j.DAO.Product",
      "net.kencochrane.a4j.beans.Platforms",
      "net.kencochrane.a4j.beans.ProductLine",
      "net.kencochrane.a4j.beans.BlendedSearch",
      "net.kencochrane.a4j.beans.Features",
      "net.kencochrane.a4j.beans.SellerSearchDetails",
      "com.wutka.jox.JOXSAXBeanInput$ObjectInfo",
      "net.kencochrane.a4j.beans.ListingProductDetails",
      "net.kencochrane.a4j.beans.Accessories",
      "net.kencochrane.a4j.beans.ProductInfo",
      "net.kencochrane.a4j.beans.ThirdPartyProductInfo",
      "com.wutka.jox.JOXSAXBeanInput"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Product_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.kencochrane.a4j.DAO.Product",
      "net.kencochrane.a4j.file.FileUtil",
      "net.kencochrane.a4j.util.LoadProperties",
      "net.kencochrane.a4j.beans.FullProduct",
      "net.kencochrane.a4j.beans.ProductDetails",
      "net.kencochrane.a4j.beans.Tracks",
      "net.kencochrane.a4j.beans.Lists",
      "net.kencochrane.a4j.beans.Artists",
      "net.kencochrane.a4j.beans.Features",
      "net.kencochrane.a4j.beans.SimilarProducts",
      "net.kencochrane.a4j.beans.Reviews",
      "net.kencochrane.a4j.beans.CustomerReview",
      "net.kencochrane.a4j.util.a4jUtil",
      "net.kencochrane.a4j.beans.BrowseList",
      "net.kencochrane.a4j.beans.Accessories",
      "net.kencochrane.a4j.beans.Directors",
      "net.kencochrane.a4j.beans.Starring",
      "net.kencochrane.a4j.beans.Authors",
      "net.kencochrane.a4j.beans.Platforms",
      "net.kencochrane.a4j.beans.ThirdPartyProductInfo",
      "net.kencochrane.a4j.beans.MiniProduct",
      "net.kencochrane.a4j.DAO.Search",
      "net.kencochrane.a4j.data.Query",
      "com.wutka.jox.JOXBeanInputStream",
      "net.kencochrane.a4j.beans.ProductInfo",
      "com.wutka.jox.JOXSAXBeanInput"
    );
  }
}
