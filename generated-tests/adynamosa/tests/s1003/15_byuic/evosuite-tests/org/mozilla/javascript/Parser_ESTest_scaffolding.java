/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 22 02:27:02 GMT 2019
 */

package org.mozilla.javascript;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Parser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mozilla.javascript.Parser"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/15_byuic"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Parser_ESTest_scaffolding.class.getClassLoader() ,
      "org.mozilla.javascript.ContextListener",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.NativeBoolean",
      "org.mozilla.javascript.NativeDate",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.DefiningClassLoader",
      "org.mozilla.javascript.UniqueTag",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.ScriptOrFnNode",
      "org.mozilla.javascript.tools.shell.Environment",
      "org.mozilla.javascript.NativeError",
      "org.mozilla.javascript.ContextFactory$Listener",
      "org.mozilla.javascript.IdScriptableObject$PrototypeValues",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.Node$Symbol",
      "org.mozilla.javascript.GeneratedClassLoader",
      "org.mozilla.javascript.Script",
      "org.mozilla.javascript.debug.Debugger",
      "org.mozilla.javascript.optimizer.OptTransformer",
      "org.mozilla.classfile.ConstantPool",
      "org.mozilla.javascript.RegExpProxy",
      "org.mozilla.javascript.ScriptRuntime$MessageProvider",
      "org.mozilla.javascript.NativeWith",
      "org.mozilla.javascript.jdk13.VMBridge_jdk13",
      "org.mozilla.javascript.Undefined",
      "org.mozilla.javascript.Wrapper",
      "org.mozilla.javascript.serialize.ScriptableInputStream",
      "org.mozilla.javascript.ScriptRuntime$NoSuchMethodShim",
      "org.mozilla.javascript.NativeGenerator",
      "org.mozilla.javascript.JavaAdapter$2",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.InterpretedFunction",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.JavaMembers",
      "org.mozilla.javascript.Ref",
      "org.mozilla.javascript.Callable",
      "org.mozilla.javascript.NativeJavaPackage",
      "org.mozilla.javascript.NativeFunction",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.IdFunctionCall",
      "org.mozilla.javascript.tools.shell.Global",
      "org.mozilla.javascript.IdFunctionObject",
      "org.mozilla.javascript.NativeString",
      "org.mozilla.javascript.NodeTransformer",
      "org.mozilla.javascript.optimizer.BodyCodegen",
      "org.mozilla.javascript.NativeContinuation",
      "org.mozilla.javascript.SecurityUtilities$2",
      "org.mozilla.javascript.Context$1",
      "org.mozilla.javascript.Node$StringNode",
      "org.mozilla.javascript.Function",
      "org.mozilla.javascript.NativeGenerator$CloseGeneratorAction",
      "org.mozilla.javascript.NativeMath",
      "org.mozilla.javascript.Interpreter$CallFrame",
      "org.mozilla.javascript.NativeJavaObject",
      "org.mozilla.javascript.optimizer.OptFunctionNode",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.JavaMembers$MethodSignature",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.JavaScriptException",
      "org.mozilla.javascript.ContinuationPending",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.NativeJavaClass",
      "org.mozilla.javascript.UintMap",
      "org.mozilla.javascript.InterfaceAdapter",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.Node$1",
      "org.mozilla.javascript.debug.DebuggableObject",
      "org.mozilla.javascript.FunctionNode",
      "org.mozilla.javascript.IRFactory",
      "org.mozilla.javascript.debug.DebugFrame",
      "org.mozilla.javascript.NativeIterator$WrappedJavaIterator",
      "org.mozilla.javascript.regexp.SubString",
      "org.mozilla.javascript.Node$Jump",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.Evaluator",
      "org.mozilla.javascript.ClassShutter",
      "org.mozilla.javascript.Node$Scope",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.classfile.FieldOrMethodRef",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.classfile.ClassFileMethod",
      "org.mozilla.javascript.debug.DebuggableScript",
      "org.mozilla.javascript.ClassCache",
      "org.mozilla.javascript.Arguments",
      "org.mozilla.javascript.Synchronizer",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.ScriptRuntime$1",
      "org.mozilla.classfile.ClassFileWriter",
      "org.mozilla.javascript.LazilyLoadedCtor",
      "org.mozilla.javascript.JavaAdapter",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.NativeJavaArray",
      "org.mozilla.javascript.Parser",
      "org.mozilla.javascript.NativeIterator$StopIteration",
      "org.mozilla.javascript.NativeJavaConstructor",
      "org.mozilla.javascript.regexp.GlobData",
      "org.mozilla.javascript.MemberBox",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.Interpreter$GeneratorState",
      "org.mozilla.javascript.Delegator",
      "org.mozilla.javascript.ScriptRuntime$IdEnumeration",
      "org.mozilla.javascript.NativeJavaMethod",
      "org.mozilla.javascript.Decompiler",
      "org.mozilla.javascript.WrappedException",
      "org.mozilla.javascript.regexp.RegExpImpl",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.NativeCall",
      "org.mozilla.javascript.InterpreterData",
      "org.mozilla.javascript.BeanProperty",
      "org.mozilla.javascript.xml.XMLLib$Factory",
      "org.mozilla.javascript.NativeScript",
      "org.mozilla.javascript.Node$PropListItem",
      "org.mozilla.javascript.xml.XMLLib",
      "org.mozilla.javascript.TokenStream",
      "org.mozilla.javascript.SecurityController",
      "org.mozilla.javascript.NativeJavaTopPackage",
      "org.mozilla.javascript.Parser$ParserException",
      "org.mozilla.javascript.ConstProperties",
      "org.mozilla.javascript.tools.shell.QuitAction",
      "org.mozilla.javascript.NativeGenerator$GeneratorClosedException",
      "org.mozilla.javascript.WrapFactory",
      "org.mozilla.javascript.Parser$1",
      "org.mozilla.javascript.NativeIterator",
      "org.mozilla.javascript.NativeNumber",
      "org.mozilla.javascript.ObjToIntMap$Iterator",
      "org.mozilla.javascript.ErrorReporter",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.DToA",
      "org.mozilla.javascript.NativeGlobal",
      "org.mozilla.javascript.CompilerEnvirons",
      "org.mozilla.javascript.ContextAction",
      "org.mozilla.javascript.SecurityUtilities",
      "org.mozilla.javascript.Node$NumberNode",
      "org.mozilla.javascript.xml.XMLLib$Factory$1",
      "org.mozilla.classfile.ClassFileField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Parser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mozilla.javascript.Parser",
      "org.mozilla.javascript.Parser$ParserException",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.jdk13.VMBridge_jdk13",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.DToA",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.CompilerEnvirons",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.xml.XMLLib$Factory",
      "org.mozilla.javascript.xml.XMLLib$Factory$1",
      "org.mozilla.javascript.Decompiler",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.Node$Jump",
      "org.mozilla.javascript.Node$Scope",
      "org.mozilla.javascript.ScriptOrFnNode",
      "org.mozilla.javascript.FunctionNode",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.UniqueTag",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.javascript.ClassCache",
      "org.mozilla.javascript.IdScriptableObject$PrototypeValues",
      "org.mozilla.javascript.IdFunctionObject",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.NativeError",
      "org.mozilla.javascript.NativeGlobal",
      "org.mozilla.javascript.Undefined",
      "org.mozilla.javascript.NativeString",
      "org.mozilla.javascript.NativeBoolean",
      "org.mozilla.javascript.NativeNumber",
      "org.mozilla.javascript.NativeDate",
      "org.mozilla.javascript.NativeMath",
      "org.mozilla.javascript.NativeWith",
      "org.mozilla.javascript.NativeCall",
      "org.mozilla.javascript.NativeScript",
      "org.mozilla.javascript.NativeIterator",
      "org.mozilla.javascript.NativeGenerator",
      "org.mozilla.javascript.NativeIterator$StopIteration",
      "org.mozilla.javascript.LazilyLoadedCtor",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.TokenStream",
      "org.mozilla.javascript.IRFactory",
      "org.mozilla.javascript.InterpreterData",
      "org.mozilla.javascript.ContinuationPending",
      "org.mozilla.javascript.NativeFunction",
      "org.mozilla.javascript.InterpretedFunction",
      "org.mozilla.javascript.SecurityController",
      "org.mozilla.javascript.Node$StringNode",
      "org.mozilla.javascript.Arguments",
      "org.mozilla.javascript.WrapFactory",
      "org.mozilla.javascript.NativeJavaPackage",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.Node$Symbol",
      "org.mozilla.javascript.Node$NumberNode",
      "org.mozilla.javascript.NativeContinuation",
      "org.mozilla.javascript.JavaAdapter",
      "org.mozilla.javascript.NativeJavaObject",
      "org.mozilla.javascript.JavaMembers",
      "org.mozilla.javascript.Node$PropListItem",
      "org.mozilla.javascript.DefiningClassLoader",
      "org.mozilla.javascript.NativeJavaClass",
      "org.mozilla.javascript.xml.XMLLib",
      "org.mozilla.javascript.regexp.RegExpImpl",
      "org.mozilla.javascript.NativeJavaTopPackage",
      "org.mozilla.javascript.JavaMembers$MethodSignature",
      "org.mozilla.javascript.MemberBox",
      "org.mozilla.javascript.NativeJavaMethod",
      "org.mozilla.javascript.BeanProperty",
      "org.mozilla.javascript.Delegator",
      "org.mozilla.javascript.NativeJavaArray",
      "org.mozilla.javascript.Context$1",
      "org.mozilla.javascript.Synchronizer",
      "org.mozilla.javascript.NativeJavaConstructor",
      "org.mozilla.javascript.ObjToIntMap$Iterator",
      "org.mozilla.javascript.NodeTransformer",
      "org.mozilla.javascript.optimizer.OptTransformer",
      "org.mozilla.classfile.ClassFileWriter",
      "org.mozilla.classfile.ConstantPool",
      "org.mozilla.javascript.UintMap",
      "org.mozilla.classfile.ClassFileField",
      "org.mozilla.classfile.ClassFileMethod",
      "org.mozilla.classfile.FieldOrMethodRef",
      "org.mozilla.javascript.optimizer.BodyCodegen",
      "org.mozilla.javascript.SecurityUtilities",
      "org.mozilla.javascript.SecurityUtilities$2",
      "org.mozilla.javascript.NativeGenerator$CloseGeneratorAction",
      "org.mozilla.javascript.JavaAdapter$2",
      "org.mozilla.javascript.tools.shell.Global",
      "org.mozilla.javascript.tools.shell.Environment"
    );
  }
}
