/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jul 25 08:42:27 GMT 2019
 */

package okio;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Buffer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "okio.Buffer"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/25_okio"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Buffer_ESTest_scaffolding.class.getClassLoader() ,
      "okio.RealBufferedSource$1",
      "okio.Okio",
      "okio.Pipe$PipeSink",
      "okio.Base64",
      "okio.RealBufferedSource",
      "okio.Source",
      "okio.HashingSink",
      "okio.Timeout$1",
      "okio.Options",
      "okio.Okio$4",
      "okio.Sink",
      "okio.Buffer$UnsafeCursor",
      "okio.Timeout",
      "okio.BufferedSink",
      "okio.AsyncTimeout",
      "okio.ByteString",
      "okio.ForwardingSource",
      "okio.GzipSource",
      "okio.Segment",
      "okio.Util",
      "okio.SegmentPool",
      "okio.Buffer",
      "okio.RealBufferedSink$1",
      "okio.Pipe",
      "okio.DeflaterSink",
      "okio.RealBufferedSink",
      "okio.SegmentedByteString",
      "okio.BufferedSource",
      "okio.GzipSink",
      "okio.HashingSource",
      "okio.ForwardingSink",
      "okio.Pipe$PipeSource",
      "okio.Buffer$2",
      "okio.Buffer$1",
      "okio.InflaterSource"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Buffer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "okio.Buffer",
      "okio.Buffer$1",
      "okio.Buffer$2",
      "okio.Buffer$UnsafeCursor",
      "okio.SegmentPool",
      "okio.ByteString",
      "okio.Util",
      "okio.Timeout$1",
      "okio.Timeout",
      "okio.RealBufferedSource",
      "okio.Segment",
      "okio.SegmentedByteString",
      "okio.Pipe",
      "okio.Pipe$PipeSink",
      "okio.Pipe$PipeSource",
      "okio.GzipSource",
      "okio.ForwardingSource",
      "okio.HashingSource",
      "okio.Okio",
      "okio.InflaterSource",
      "okio.Base64",
      "okio.RealBufferedSink",
      "okio.RealBufferedSink$1",
      "okio.ForwardingSink",
      "okio.HashingSink",
      "okio.GzipSink",
      "okio.DeflaterSink",
      "okio.Options",
      "okio.RealBufferedSource$1"
    );
  }
}
