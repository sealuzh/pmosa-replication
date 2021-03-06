/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 05 00:22:17 GMT 2019
 */

package org.firebirdsql.encodings;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EncodingFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.firebirdsql.encodings.EncodingFactory"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/22_firebird"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EncodingFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.firebirdsql.encodings.Encoding_Cp850",
      "org.firebirdsql.encodings.Encoding_Cp775",
      "org.firebirdsql.encodings.Encoding_Cp852",
      "org.firebirdsql.encodings.Encoding",
      "org.firebirdsql.encodings.Encoding_OneByte",
      "org.firebirdsql.encodings.Encoding_Cp437",
      "org.firebirdsql.encodings.Encoding_Cp858",
      "org.firebirdsql.encodings.Encoding_Cp737",
      "org.firebirdsql.encodings.Encoding_Cp857",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.encodings.Encoding_ISO8859_13",
      "org.firebirdsql.encodings.CharacterTranslator",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.encodings.EncodingFactory",
      "org.firebirdsql.encodings.Encoding_Cp1253",
      "org.firebirdsql.encodings.Encoding_Cp861",
      "org.firebirdsql.encodings.Encoding_NotOneByte",
      "org.firebirdsql.encodings.Encoding_Cp1252",
      "org.firebirdsql.encodings.Encoding_Cp860",
      "org.firebirdsql.encodings.Encoding_Cp863",
      "org.firebirdsql.encodings.Encoding_Cp1255",
      "org.firebirdsql.encodings.Encoding_Cp1254",
      "org.firebirdsql.encodings.Encoding_Cp862",
      "org.firebirdsql.encodings.Encoding_Cp865",
      "org.firebirdsql.encodings.Encoding_Cp1257",
      "org.firebirdsql.encodings.Encoding_Cp1256",
      "org.firebirdsql.encodings.Encoding_Cp864",
      "org.firebirdsql.encodings.Encoding_ISO8859_2",
      "org.firebirdsql.encodings.Encoding_Cp866",
      "org.firebirdsql.encodings.Encoding_ISO8859_1",
      "org.firebirdsql.encodings.Encoding_Cp869",
      "org.firebirdsql.encodings.Encoding_ISO8859_4",
      "org.firebirdsql.encodings.Encoding_ISO8859_3",
      "org.firebirdsql.encodings.Encoding_ISO8859_6",
      "org.firebirdsql.encodings.Encoding_ISO8859_5",
      "org.firebirdsql.encodings.Encoding_ISO8859_8",
      "org.firebirdsql.encodings.Encoding_ISO8859_7",
      "org.firebirdsql.encodings.Encoding_ISO8859_9",
      "org.firebirdsql.encodings.Encoding_Cp1251",
      "org.firebirdsql.encodings.Encoding_Cp1250"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EncodingFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.firebirdsql.encodings.EncodingFactory",
      "org.firebirdsql.encodings.CharacterTranslator",
      "org.firebirdsql.encodings.Encoding_NotOneByte",
      "org.firebirdsql.encodings.Encoding_OneByte",
      "org.firebirdsql.encodings.Encoding_Cp1255",
      "org.firebirdsql.encodings.Encoding_ISO8859_4",
      "org.firebirdsql.encodings.Encoding_Cp866",
      "org.firebirdsql.encodings.Encoding_Cp861",
      "org.firebirdsql.encodings.Encoding_Cp865",
      "org.firebirdsql.encodings.Encoding_ISO8859_8",
      "org.firebirdsql.encodings.Encoding_Cp863",
      "org.firebirdsql.encodings.Encoding_ISO8859_6",
      "org.firebirdsql.encodings.Encoding_ISO8859_2",
      "org.firebirdsql.encodings.Encoding_Cp1250",
      "org.firebirdsql.encodings.Encoding_ISO8859_13",
      "org.firebirdsql.encodings.Encoding_Cp860",
      "org.firebirdsql.encodings.Encoding_Cp1254",
      "org.firebirdsql.encodings.Encoding_Cp858",
      "org.firebirdsql.encodings.Encoding_ISO8859_5",
      "org.firebirdsql.encodings.Encoding_Cp1256",
      "org.firebirdsql.encodings.Encoding_Cp1251",
      "org.firebirdsql.encodings.Encoding_ISO8859_1",
      "org.firebirdsql.encodings.Encoding_ISO8859_7",
      "org.firebirdsql.encodings.Encoding_Cp1257",
      "org.firebirdsql.encodings.Encoding_Cp737",
      "org.firebirdsql.encodings.Encoding_ISO8859_9",
      "org.firebirdsql.encodings.Encoding_Cp437",
      "org.firebirdsql.encodings.Encoding_Cp1253",
      "org.firebirdsql.encodings.Encoding_Cp775",
      "org.firebirdsql.encodings.Encoding_Cp852",
      "org.firebirdsql.encodings.Encoding_Cp862",
      "org.firebirdsql.encodings.Encoding_ISO8859_3",
      "org.firebirdsql.encodings.Encoding_Cp850",
      "org.firebirdsql.encodings.Encoding_Cp864",
      "org.firebirdsql.encodings.Encoding_Cp1252",
      "org.firebirdsql.encodings.Encoding_Cp857",
      "org.firebirdsql.encodings.Encoding_Cp869"
    );
  }
}
