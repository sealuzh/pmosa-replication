/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 24 00:26:20 GMT 2019
 */

package org.apache.bcel.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Class2HTML_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.bcel.util.Class2HTML"; 
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
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.161-0.b14.el7_4.x86_64/jre/classes"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/1_bcel"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Class2HTML_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.classfile.Signature$MyByteArrayInputStream",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.classfile.Node",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.util.BCELComparator",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.util.ClassPath$PathEntry",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.util.Class2HTML",
      "org.apache.bcel.classfile.SourceFile",
      "org.apache.bcel.classfile.MethodParameters",
      "org.apache.bcel.classfile.Visitor",
      "org.apache.bcel.classfile.ParameterAnnotations",
      "org.apache.bcel.util.ByteSequence",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.generic.BasicType",
      "org.apache.bcel.classfile.MethodParameter",
      "org.apache.bcel.classfile.Unknown",
      "org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations",
      "org.apache.bcel.classfile.Synthetic",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.classfile.EnumElementValue",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.classfile.StackMapEntry",
      "org.apache.bcel.util.ClassPath$Zip",
      "org.apache.bcel.classfile.InnerClasses",
      "org.apache.bcel.classfile.StackMap",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.util.AttributeHTML",
      "org.apache.bcel.classfile.Field$1",
      "org.apache.bcel.generic.ClassGenException",
      "org.apache.bcel.generic.ObjectType",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.classfile.ParameterAnnotationEntry",
      "org.apache.bcel.classfile.Utility$1",
      "org.apache.bcel.util.ClassQueue",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.util.ClassPathRepository",
      "org.apache.bcel.classfile.ConstantValue",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.LineNumber",
      "org.apache.bcel.classfile.ArrayElementValue",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.util.CodeHTML",
      "org.apache.bcel.util.ClassPath$ClassFile",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.classfile.PMGClass",
      "org.apache.bcel.generic.ReferenceType",
      "org.apache.bcel.Constants",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.classfile.StackMapType",
      "org.apache.bcel.classfile.AnnotationElementValue",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.classfile.BootstrapMethod",
      "org.apache.bcel.classfile.Annotations",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.util.MemorySensitiveClassPathRepository",
      "org.apache.bcel.classfile.ConstantUtf8$1",
      "org.apache.bcel.classfile.BootstrapMethods",
      "org.apache.bcel.generic.ArrayType",
      "org.apache.bcel.generic.Type$2",
      "org.apache.bcel.generic.Type$1",
      "org.apache.bcel.util.Repository",
      "org.apache.bcel.classfile.RuntimeInvisibleAnnotations",
      "org.apache.bcel.classfile.SimpleElementValue",
      "org.apache.bcel.classfile.Signature",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.classfile.AnnotationDefault",
      "org.apache.bcel.generic.Type$3",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.util.MethodHTML",
      "org.apache.bcel.util.ConstantHTML",
      "org.apache.bcel.util.ClassPath$1",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.util.ClassPath$Dir",
      "org.apache.bcel.util.ByteSequence$ByteArrayStream",
      "org.apache.bcel.classfile.ClassParser",
      "org.apache.bcel.classfile.ConstantObject",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Method$1",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.classfile.Deprecated",
      "org.apache.bcel.classfile.ElementValuePair",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations",
      "org.apache.bcel.classfile.EnclosingMethod",
      "org.apache.bcel.classfile.AttributeReader",
      "org.apache.bcel.classfile.UnknownAttributeReader",
      "org.apache.bcel.classfile.ClassElementValue",
      "org.apache.bcel.classfile.LocalVariable",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.classfile.RuntimeVisibleAnnotations",
      "org.apache.bcel.classfile.LocalVariableTypeTable",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.classfile.InnerClass",
      "org.apache.bcel.classfile.ExceptionTable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Class2HTML_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.bcel.util.Class2HTML",
      "org.apache.bcel.Constants",
      "org.apache.bcel.classfile.Utility$1",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.util.ClassPath$1",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.util.ClassPathRepository",
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.util.MemorySensitiveClassPathRepository",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.classfile.ClassParser",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.classfile.Field$1",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.ConstantValue",
      "org.apache.bcel.classfile.Signature",
      "org.apache.bcel.classfile.Method$1",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.classfile.LineNumber",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.classfile.LocalVariable",
      "org.apache.bcel.classfile.StackMap",
      "org.apache.bcel.classfile.StackMapEntry",
      "org.apache.bcel.classfile.StackMapType",
      "org.apache.bcel.classfile.ExceptionTable",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.classfile.SourceFile",
      "org.apache.bcel.classfile.InnerClasses",
      "org.apache.bcel.classfile.InnerClass",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.util.ConstantHTML",
      "org.apache.bcel.util.AttributeHTML",
      "org.apache.bcel.util.MethodHTML",
      "org.apache.bcel.util.CodeHTML",
      "org.apache.bcel.util.ByteSequence",
      "org.apache.bcel.util.ByteSequence$ByteArrayStream",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.classfile.Deprecated",
      "org.apache.bcel.classfile.Annotations",
      "org.apache.bcel.classfile.RuntimeVisibleAnnotations",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.classfile.LocalVariableTypeTable",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.classfile.ElementValuePair",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.util.ClassQueue",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.classfile.BootstrapMethods",
      "org.apache.bcel.classfile.BootstrapMethod",
      "org.apache.bcel.util.ClassPath$PathEntry",
      "org.apache.bcel.util.ClassPath$Zip",
      "org.apache.bcel.util.ClassPath$Dir",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.classfile.EnumElementValue"
    );
  }
}
