/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 22 14:50:43 GMT 2019
 */

package wheel.asm;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ClassWriter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "wheel.asm.ClassWriter"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/21_wheelwebtool"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClassWriter_ESTest_scaffolding.class.getClassLoader() ,
      "wheel.asm.FieldVisitor",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "wheel.asm.ClassVisitor",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "wheel.asm.Attribute",
      "wheel.asm.MethodWriter",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "wheel.asm.ClassReader",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "wheel.asm.Label",
      "wheel.asm.Item",
      "wheel.asm.AnnotationWriter",
      "wheel.asm.Edge",
      "wheel.asm.ByteVector",
      "wheel.asm.AnnotationVisitor",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "wheel.asm.ClassWriter",
      "wheel.asm.FieldWriter",
      "wheel.asm.Type",
      "wheel.asm.MethodVisitor",
      "wheel.asm.Frame"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClassWriter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "wheel.asm.ClassWriter",
      "wheel.asm.ClassReader",
      "wheel.asm.ByteVector",
      "wheel.asm.Item",
      "wheel.asm.Attribute",
      "wheel.asm.MethodWriter",
      "wheel.asm.AnnotationWriter",
      "wheel.asm.FieldWriter",
      "wheel.asm.Label",
      "wheel.asm.Type",
      "wheel.asm.Edge",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "wheel.asm.Frame",
      "org.apache.commons.io.filefilter.WildcardFileFilter"
    );
  }
}
