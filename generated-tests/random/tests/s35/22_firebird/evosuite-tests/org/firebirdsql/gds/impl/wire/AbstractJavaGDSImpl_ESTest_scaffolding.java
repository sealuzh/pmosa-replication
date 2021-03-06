/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 19:48:05 GMT 2019
 */

package org.firebirdsql.gds.impl.wire;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractJavaGDSImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl"; 
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
    java.lang.System.setProperty("user.name", "apaniche"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/22_firebird"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractJavaGDSImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.firebirdsql.gds.impl.jni.BlobParameterBufferImp",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.GDSExceptionHelper",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.encodings.Encoding",
      "org.firebirdsql.gds.impl.wire.EventCoordinator",
      "org.firebirdsql.gds.impl.GDSServerVersion",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$SingleItem",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp",
      "org.firebirdsql.gds.impl.GDSServerVersionException",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$Argument",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.EventHandleImp",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$StringArgument",
      "org.firebirdsql.logging.Logger",
      "org.firebirdsql.gds.ServiceRequestBuffer",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$ByteArrayArgument",
      "org.firebirdsql.gds.impl.wire.XdrInputStream",
      "org.firebirdsql.gds.GDS",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.firebirdsql.encodings.EncodingFactory",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.gds.IscSvcHandle",
      "org.firebirdsql.gds.impl.wire.XdrOutputStream",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$1",
      "org.firebirdsql.gds.impl.wire.BlobParameterBufferImp",
      "org.firebirdsql.gds.EventHandle",
      "org.firebirdsql.gds.impl.GDSFactory$1",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.IscTrHandle",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.gds.impl.DbAttachInfo",
      "org.firebirdsql.gds.impl.BaseGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$EventCoordinatorImp",
      "org.firebirdsql.gds.impl.wire.isc_svc_handle_impl",
      "org.firebirdsql.gds.GDSExceptionHelper$GDSMessage",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin$GDSHolder",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.firebirdsql.gds.impl.wire.EventHandleImp",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$NumericArgument",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$ByteArrayArgument",
      "org.firebirdsql.gds.ServiceParameterBuffer",
      "org.firebirdsql.gds.IscDbHandle",
      "org.firebirdsql.gds.impl.wire.Xdrable",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.IscBlobHandle",
      "org.firebirdsql.gds.impl.GDSFactoryPlugin",
      "org.firebirdsql.gds.EventHandler",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.firebirdsql.gds.impl.wire.TransactionParameterBufferImpl",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.gds.impl.wire.ServiceParameterBufferImp",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.encodings.CharacterTranslator",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$SingleItem",
      "org.firebirdsql.gds.impl.jni.BlobParameterBufferImp$1",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp$1",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$StringArgument",
      "org.firebirdsql.logging.Log4jLogger",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp$2",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp$3",
      "org.firebirdsql.gds.impl.oo.OOGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$Argument",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$EventGlob",
      "org.firebirdsql.gds.impl.wire.WireXdrInputStream",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$NumericArgument",
      "org.firebirdsql.gds.impl.jni.TransactionParameterBufferImpl",
      "org.firebirdsql.gds.BlobParameterBuffer",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.wire.isc_blob_handle_impl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractJavaGDSImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$1",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$EventCoordinatorImp",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.BaseGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.oo.OOGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.encodings.EncodingFactory",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.isc_blob_handle_impl",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.ServiceParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.impl.DbAttachInfo",
      "org.firebirdsql.gds.impl.wire.isc_svc_handle_impl",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.wire.BlobParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$Argument",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$NumericArgument",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$ByteArrayArgument",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$StringArgument",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.BlobParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.TransactionParameterBufferImpl",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.gds.impl.wire.EventHandleImp",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl$EventGlob",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$Argument",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$NumericArgument",
      "org.firebirdsql.gds.impl.jni.BlobParameterBufferImp$1",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.firebirdsql.gds.impl.jni.TransactionParameterBufferImpl",
      "org.firebirdsql.gds.impl.wire.XdrInputStream",
      "org.firebirdsql.gds.impl.wire.WireXdrInputStream",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.jni.EventHandleImp",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.wire.XdrOutputStream",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$SingleItem",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$ByteArrayArgument",
      "org.firebirdsql.gds.impl.GDSServerVersion",
      "org.firebirdsql.gds.impl.GDSServerVersionException",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp$2",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp$3",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin$GDSHolder",
      "org.firebirdsql.gds.impl.wire.ServiceRequestBufferImp$1",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$StringArgument",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase$SingleItem",
      "org.firebirdsql.encodings.CharacterTranslator",
      "org.firebirdsql.gds.GDSExceptionHelper",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.firebirdsql.gds.GDSExceptionHelper$GDSMessage"
    );
  }
}
