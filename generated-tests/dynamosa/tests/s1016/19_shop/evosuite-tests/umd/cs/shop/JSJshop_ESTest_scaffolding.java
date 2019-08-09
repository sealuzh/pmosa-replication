/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jul 04 00:00:27 GMT 2019
 */

package umd.cs.shop;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JSJshop_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "umd.cs.shop.JSJshop"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/19_shop"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JSJshop_ESTest_scaffolding.class.getClassLoader() ,
      "umd.cs.shop.JSListLogicalAtoms",
      "umd.cs.shop.JSJshop",
      "umd.cs.shop.JSParserError",
      "umd.cs.shop.JSListIfThenElse",
      "umd.cs.shop.JSPlanningProblem",
      "umd.cs.shop.JSPredicateForm",
      "umd.cs.shop.JSJshopNode",
      "umd.cs.shop.JSPlanningDomain",
      "umd.cs.shop.JSUtil",
      "umd.cs.shop.JSJshopVars",
      "umd.cs.shop.JSTState",
      "umd.cs.shop.JSState",
      "umd.cs.shop.JSOperator",
      "umd.cs.shop.JSListSubstitution",
      "umd.cs.shop.JSPairPlanTState",
      "umd.cs.shop.JSAllReduction",
      "umd.cs.shop.JSListMethods",
      "umd.cs.shop.JSListPairPlanTStateNodes",
      "umd.cs.shop.JSTaskAtom",
      "umd.cs.shop.JSTerm",
      "umd.cs.shop.JSReduction",
      "umd.cs.shop.JSTasks",
      "umd.cs.shop.JSListPlanningProblem",
      "umd.cs.shop.JSMethod",
      "umd.cs.shop.JSPlan",
      "umd.cs.shop.JSSubstitution",
      "umd.cs.shop.JSListAxioms",
      "umd.cs.shop.JSPairPlanTSListNodes",
      "umd.cs.shop.JSListOperators"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JSJshop_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "umd.cs.shop.JSJshop",
      "umd.cs.shop.JSJshopVars",
      "umd.cs.shop.JSListPlanningProblem",
      "umd.cs.shop.JSPredicateForm",
      "umd.cs.shop.JSTaskAtom",
      "umd.cs.shop.JSUtil",
      "umd.cs.shop.JSParserError",
      "umd.cs.shop.JSMethod",
      "umd.cs.shop.JSOperator",
      "umd.cs.shop.JSListLogicalAtoms",
      "umd.cs.shop.JSJshopNode",
      "umd.cs.shop.JSPlanningDomain",
      "umd.cs.shop.JSListAxioms",
      "umd.cs.shop.JSListOperators",
      "umd.cs.shop.JSListMethods",
      "umd.cs.shop.JSSubstitution",
      "umd.cs.shop.JSTasks",
      "umd.cs.shop.JSPlan",
      "umd.cs.shop.JSState"
    );
  }
}
