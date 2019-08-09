/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 06 07:06:05 GMT 2019
 */

package wheel.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Component_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "wheel.components.Component"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/21_wheelwebtool"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Component_ESTest_scaffolding.class.getClassLoader() ,
      "wheel.components.Image",
      "wheel.components.ComponentCreator",
      "org.mvel.integration.VariableResolver",
      "wheel.util.AbstractDateConversionHandler",
      "org.mvel.ast.LineLabel",
      "org.mvel.asm.Item",
      "org.xmlpull.v1.XmlSerializer",
      "org.mvel.util.Stack",
      "wheel.util.CalendarConversionHandler",
      "org.mvel.util.ArrayTools",
      "org.mvel.PropertyAccessor",
      "wheel.components.ActionExpression",
      "wheel.components.IContainer",
      "wheel.Asset",
      "org.mvel.conversion.StringCH",
      "org.mvel.asm.Label",
      "org.xmlpull.v1.XmlPullParser",
      "wheel.components.Table",
      "org.xmlpull.v1.wrapper.XmlPullWrapperFactory",
      "wheel.components.Radio",
      "wheel.components.Text",
      "org.mvel.Accessor",
      "org.mvel.conversion.ShortCH$10",
      "org.mvel.integration.impl.BaseVariableResolverFactory",
      "org.mvel.conversion.StringArrayCH$1",
      "org.xmlpull.v1.XmlPullParserFactory",
      "org.mvel.ast.OperatorNode",
      "wheel.components.TableRow",
      "org.mvel.ast.WithNode",
      "org.mvel.conversion.DoubleCH$10",
      "wheel.components.Any",
      "org.mvel.asm.ClassWriter",
      "org.mvel.util.PropertyTools",
      "org.mvel.ast.PreFixIncNode",
      "org.mvel.ast.IfNode",
      "org.mvel.ast.Union",
      "org.mvel.ast.LiteralNode",
      "wheel.components.TableBlock",
      "org.xmlpull.mxp1_serializer.MXSerializer",
      "wheel.components.Form$Method",
      "org.mvel.conversion.FloatCH$10",
      "org.mvel.optimizers.impl.refl.ConstructorAccessor",
      "org.mvel.optimizers.impl.asm.ASMAccessorOptimizer",
      "wheel.IResourceManager",
      "org.mvel.asm.MethodWriter",
      "org.mvel.ast.AssertNode",
      "org.mvel.ast.PreFixDecNode",
      "org.mvel.util.ParseTools",
      "org.mvel.AccessorNode",
      "org.mvel.asm.ClassReader",
      "org.mvel.conversion.ShortCH",
      "wheel.util.Entry",
      "org.mvel.ast.AssignmentNode",
      "org.xmlpull.v1.wrapper.XmlSerializerWrapper",
      "org.xmlpull.v1.wrapper.XmlPullParserWrapper",
      "org.mvel.conversion.CharArrayCH$1",
      "org.mvel.BlankLiteral",
      "org.mvel.ast.ThisValDeepPropertyNode",
      "org.mvel.UnresolveablePropertyException",
      "org.mvel.ast.PostFixIncNode",
      "org.xmlpull.mxp1.MXParser",
      "org.mvel.ast.ForEachNode",
      "org.mvel.ast.StaticImportNode",
      "org.mvel.conversion.IntegerCH$5",
      "org.mvel.conversion.IntegerCH$6",
      "org.mvel.ast.Assignment",
      "org.mvel.ast.AssignMult",
      "org.mvel.conversion.IntegerCH$7",
      "org.mvel.conversion.CharArrayCH",
      "org.mvel.conversion.IntegerCH$8",
      "org.mvel.conversion.IntegerCH$9",
      "org.mvel.ASTNode",
      "wheel.components.NumberInput",
      "org.mvel.ast.ImportNode",
      "wheel.components.Form",
      "org.mvel.OptimizationFailure",
      "org.mvel.util.MethodStub",
      "wheel.components.Label",
      "org.mvel.conversion.BigDecimalCH$10",
      "org.mvel.ast.WhileNode",
      "org.mvel.conversion.BigDecimalCH$11",
      "org.mvel.ExecutableStatement",
      "wheel.components.TextInput",
      "wheel.components.RenderableComponentConfiguration",
      "wheel.util.AbstractDateConversionHandler$1",
      "org.mvel.conversion.IntegerCH$1",
      "wheel.components.ValidationError",
      "org.mvel.conversion.IntegerCH$2",
      "org.mvel.conversion.IntegerCH$3",
      "org.mvel.conversion.IntegerCH$4",
      "wheel.Messages",
      "wheel.components.SelectModelFormElement",
      "org.mvel.MVELInterpretedRuntime",
      "org.mvel.PropertyAccessException",
      "wheel.components.FormElement",
      "org.xmlpull.v1.XmlPullParserException",
      "org.mvel.CompiledExpression",
      "org.mvel.ErrorDetail",
      "org.mvel.optimizers.OptimizationNotSupported",
      "org.mvel.ast.TypeCast",
      "org.mvel.ast.VarPropertyNode",
      "wheel.persistence.Scope",
      "wheel.util.InitialFieldValue",
      "org.mvel.conversion.BigIntegerCH$2",
      "org.mvel.conversion.CharCH",
      "org.mvel.conversion.BigIntegerCH$1",
      "org.mvel.conversion.DoubleCH$1",
      "org.mvel.conversion.BigIntegerCH$4",
      "org.mvel.conversion.BigIntegerCH$3",
      "org.mvel.conversion.IntegerCH$10",
      "org.mvel.integration.impl.ClassImportResolverFactory",
      "org.mvel.DataConversion",
      "org.mvel.conversion.IntegerCH$11",
      "org.mvel.conversion.DoubleCH$7",
      "org.mvel.CompileException",
      "org.mvel.conversion.DoubleCH$6",
      "org.mvel.conversion.BigIntegerCH$9",
      "wheel.components.Component",
      "org.mvel.conversion.DoubleCH$9",
      "org.mvel.ast.TypedVarNode",
      "org.mvel.asm.Type",
      "org.mvel.conversion.DoubleCH$8",
      "org.mvel.conversion.DoubleCH$3",
      "org.mvel.conversion.BigIntegerCH$6",
      "org.mvel.conversion.DoubleCH$2",
      "org.mvel.conversion.BigIntegerCH$5",
      "org.mvel.conversion.DoubleCH$5",
      "org.mvel.conversion.BigIntegerCH$8",
      "org.mvel.conversion.DoubleCH$4",
      "org.mvel.conversion.BigIntegerCH$7",
      "org.mvel.integration.VariableResolverFactory",
      "wheel.WheelException",
      "wheel.components.ValidationRule",
      "org.mvel.conversion.FloatCH$5",
      "org.mvel.conversion.FloatCH$6",
      "org.mvel.conversion.FloatCH$3",
      "org.mvel.conversion.FloatCH$4",
      "org.mvel.conversion.FloatCH$1",
      "org.mvel.math.MathProcessor",
      "org.mvel.conversion.FloatCH$2",
      "org.mvel.asm.FieldVisitor",
      "org.mvel.conversion.FloatCH$9",
      "org.mvel.conversion.FloatCH$7",
      "org.mvel.conversion.FloatCH$8",
      "org.mvel.conversion.PrimArrayHandler",
      "org.mvel.ConversionException",
      "org.mvel.optimizers.OptimizerFactory",
      "org.mvel.PreProcessor",
      "wheel.persistence.IObjectStore",
      "wheel.IMessagesSource",
      "org.xmlpull.v1.wrapper.classic.StaticXmlSerializerWrapper",
      "org.mvel.conversion.ByteCH$3",
      "org.mvel.conversion.BigIntegerCH",
      "org.mvel.optimizers.AccessorOptimizer",
      "wheel.components.StandaloneComponent",
      "wheel.util.DateConversionHandler",
      "wheel.components.RenderableComponent",
      "wheel.IEngine",
      "org.mvel.ast.EndOfStatement",
      "org.mvel.conversion.ByteCH$2",
      "org.mvel.conversion.ByteCH$1",
      "org.mvel.ast.DeepAssignmentNode",
      "org.mvel.asm.ClassVisitor",
      "wheel.components.IBuildableComponent",
      "wheel.components.CheckboxGroup",
      "org.mvel.ASTIterator",
      "org.mvel.conversion.IntegerCH",
      "org.mvel.conversion.ByteCH",
      "org.mvel.asm.Frame",
      "org.mvel.conversion.LongCH$7",
      "org.mvel.conversion.LongCH$8",
      "org.mvel.conversion.BooleanCH$10",
      "org.xmlpull.v1.wrapper.classic.XmlSerializerDelegate",
      "org.mvel.conversion.LongCH$3",
      "org.mvel.conversion.LongCH$4",
      "org.mvel.conversion.LongCH$5",
      "org.mvel.conversion.LongCH$6",
      "org.mvel.ast.AssignSub",
      "wheel.components.FileInput",
      "org.mvel.conversion.LongCH$1",
      "org.mvel.conversion.LongCH$2",
      "wheel.util.WrappedException",
      "org.mvel.asm.AnnotationVisitor",
      "wheel.Asset$AssetType",
      "org.mvel.ast.NestedStatement",
      "org.mvel.conversion.LongCH",
      "org.mvel.ConversionHandler",
      "wheel.util.WheelURL",
      "org.mvel.conversion.CharCH$5",
      "org.mvel.conversion.BooleanCH$1",
      "org.mvel.ast.BlockNode",
      "org.mvel.conversion.FloatCH",
      "org.mvel.conversion.BooleanCH$2",
      "org.mvel.ast.VariableDeepPropertyNode",
      "wheel.ErrorPage",
      "org.mvel.conversion.BooleanCH$5",
      "org.mvel.optimizers.AbstractOptimizer",
      "org.mvel.conversion.BooleanCH$6",
      "org.mvel.conversion.BooleanCH$3",
      "org.mvel.ParseException",
      "org.mvel.conversion.BooleanCH$4",
      "org.mvel.conversion.BooleanCH$9",
      "org.mvel.conversion.BooleanCH$7",
      "org.mvel.conversion.BooleanCH$8",
      "org.mvel.ast.PropertyASTNode",
      "org.mvel.ast.RegExMatch",
      "org.mvel.conversion.Converter",
      "org.mvel.MVEL",
      "org.mvel.conversion.CharCH$3",
      "org.mvel.conversion.CharCH$4",
      "org.mvel.conversion.CharCH$1",
      "org.mvel.conversion.CharCH$2",
      "org.mvel.ast.ReturnNode",
      "wheel.components.ISelectModel",
      "org.mvel.ast.ContextDeepPropertyNode",
      "wheel.util.DynamicSelectModel",
      "wheel.components.ElExpression",
      "org.mvel.ast.NewObjectNode",
      "wheel.components.Checkbox",
      "org.mvel.math.IEEEFloatingPointMath",
      "wheel.components.TextArea",
      "org.mvel.asm.MethodVisitor",
      "wheel.components.Hidden",
      "org.mvel.ast.LiteralDeepPropertyNode",
      "org.mvel.util.ExecutionStack",
      "wheel.util.StringSelectModel",
      "org.mvel.conversion.IntArrayCH",
      "wheel.components.XmlEntityRef",
      "org.mvel.conversion.ObjectCH",
      "org.mvel.ast.InlineCollectionNode",
      "org.mvel.util.ReflectionUtil",
      "org.mvel.util.ThisLiteral",
      "org.mvel.optimizers.impl.refl.BaseAccessor",
      "org.mvel.ast.ThisValNode",
      "wheel.components.Expression",
      "wheel.util.ComponentStore",
      "wheel.components.DateInput",
      "org.mvel.ast.PostFixDecNode",
      "org.mvel.ast.Substatement",
      "wheel.components.StandaloneComponentConfiguration",
      "org.mvel.conversion.BigDecimalCH",
      "org.mvel.conversion.BigDecimalCH$9",
      "org.mvel.conversion.BigDecimalCH$8",
      "org.mvel.asm.Attribute",
      "org.mvel.conversion.BigDecimalCH$7",
      "org.mvel.ast.InterceptorWrapper",
      "org.mvel.conversion.BigDecimalCH$6",
      "org.mvel.conversion.BigDecimalCH$5",
      "org.mvel.conversion.BigDecimalCH$4",
      "org.mvel.asm.ByteVector",
      "org.mvel.conversion.BigDecimalCH$3",
      "org.mvel.conversion.BigDecimalCH$2",
      "org.mvel.integration.impl.StaticMethodImportResolverFactory",
      "org.mvel.conversion.BigDecimalCH$1",
      "wheel.components.RadioGroup",
      "wheel.components.Select",
      "org.mvel.conversion.DoubleCH",
      "wheel.util.LabelValue",
      "org.mvel.SetAccessor",
      "org.mvel.ast.WithNode$ParmValuePair",
      "org.mvel.conversion.PrimArrayHandler$1",
      "org.mvel.conversion.PrimArrayHandler$2",
      "org.mvel.ParserContext",
      "wheel.components.Link",
      "org.mvel.conversion.IntArrayCH$2",
      "org.mvel.conversion.IntArrayCH$1",
      "wheel.AbstractEngine$1",
      "org.mvel.AbstractParser",
      "org.mvel.EndWithValue",
      "org.mvel.ast.AssignAdd",
      "org.mvel.conversion.ShortCH$9",
      "wheel.util.ActionRegistry",
      "org.mvel.conversion.ShortCH$7",
      "org.mvel.conversion.ShortCH$8",
      "org.mvel.conversion.ShortCH$5",
      "org.mvel.conversion.ShortCH$6",
      "org.mvel.conversion.BooleanCH",
      "org.mvel.optimizers.impl.refl.ReflectiveAccessorOptimizer",
      "org.mvel.conversion.ShortCH$3",
      "org.mvel.util.StackElement",
      "org.mvel.conversion.ShortCH$4",
      "org.mvel.conversion.ShortCH$1",
      "wheel.components.Submit",
      "org.mvel.conversion.ShortCH$2",
      "org.mvel.ast.AssignDiv",
      "org.mvel.conversion.StringArrayCH",
      "wheel.components.Block",
      "wheel.AbstractEngine"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Component_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "wheel.components.RenderableComponent",
      "wheel.components.XmlEntityRef",
      "wheel.components.Component",
      "org.mvel.conversion.IntegerCH$1",
      "org.mvel.conversion.IntegerCH$2",
      "org.mvel.conversion.IntegerCH$3",
      "org.mvel.conversion.IntegerCH$4",
      "org.mvel.conversion.IntegerCH$5",
      "org.mvel.conversion.IntegerCH$6",
      "org.mvel.conversion.IntegerCH$7",
      "org.mvel.conversion.IntegerCH$8",
      "org.mvel.conversion.IntegerCH$9",
      "org.mvel.conversion.IntegerCH$10",
      "org.mvel.conversion.IntegerCH$11",
      "org.mvel.conversion.IntegerCH",
      "org.mvel.conversion.ShortCH$1",
      "org.mvel.conversion.ShortCH$2",
      "org.mvel.conversion.ShortCH$3",
      "org.mvel.conversion.ShortCH$4",
      "org.mvel.conversion.ShortCH$5",
      "org.mvel.conversion.ShortCH$6",
      "org.mvel.conversion.ShortCH$7",
      "org.mvel.conversion.ShortCH$8",
      "org.mvel.conversion.ShortCH$9",
      "org.mvel.conversion.ShortCH$10",
      "org.mvel.conversion.ShortCH",
      "org.mvel.conversion.LongCH$1",
      "org.mvel.conversion.LongCH$2",
      "org.mvel.conversion.LongCH$3",
      "org.mvel.conversion.LongCH$4",
      "org.mvel.conversion.LongCH$5",
      "org.mvel.conversion.LongCH$6",
      "org.mvel.conversion.LongCH$7",
      "org.mvel.conversion.LongCH$8",
      "org.mvel.conversion.LongCH",
      "org.mvel.conversion.CharCH$1",
      "org.mvel.conversion.CharCH$2",
      "org.mvel.conversion.CharCH$3",
      "org.mvel.conversion.CharCH$4",
      "org.mvel.conversion.CharCH$5",
      "org.mvel.conversion.CharCH",
      "org.mvel.conversion.ByteCH$1",
      "org.mvel.conversion.ByteCH$2",
      "org.mvel.conversion.ByteCH$3",
      "org.mvel.conversion.ByteCH",
      "org.mvel.conversion.FloatCH$1",
      "org.mvel.conversion.FloatCH$2",
      "org.mvel.conversion.FloatCH$3",
      "org.mvel.conversion.FloatCH$4",
      "org.mvel.conversion.FloatCH$5",
      "org.mvel.conversion.FloatCH$6",
      "org.mvel.conversion.FloatCH$7",
      "org.mvel.conversion.FloatCH$8",
      "org.mvel.conversion.FloatCH$9",
      "org.mvel.conversion.FloatCH$10",
      "org.mvel.conversion.FloatCH",
      "org.mvel.conversion.DoubleCH$1",
      "org.mvel.conversion.DoubleCH$2",
      "org.mvel.conversion.DoubleCH$3",
      "org.mvel.conversion.DoubleCH$4",
      "org.mvel.conversion.DoubleCH$5",
      "org.mvel.conversion.DoubleCH$6",
      "org.mvel.conversion.DoubleCH$7",
      "org.mvel.conversion.DoubleCH$8",
      "org.mvel.conversion.DoubleCH$9",
      "org.mvel.conversion.DoubleCH$10",
      "org.mvel.conversion.DoubleCH",
      "org.mvel.conversion.BooleanCH$1",
      "org.mvel.conversion.BooleanCH$2",
      "org.mvel.conversion.BooleanCH$3",
      "org.mvel.conversion.BooleanCH$4",
      "org.mvel.conversion.BooleanCH$5",
      "org.mvel.conversion.BooleanCH$6",
      "org.mvel.conversion.BooleanCH$7",
      "org.mvel.conversion.BooleanCH$8",
      "org.mvel.conversion.BooleanCH$9",
      "org.mvel.conversion.BooleanCH$10",
      "org.mvel.conversion.BooleanCH",
      "org.mvel.conversion.StringCH",
      "org.mvel.conversion.ObjectCH",
      "org.mvel.conversion.CharArrayCH$1",
      "org.mvel.conversion.CharArrayCH",
      "org.mvel.conversion.StringArrayCH$1",
      "org.mvel.conversion.StringArrayCH",
      "org.mvel.conversion.IntArrayCH$1",
      "org.mvel.conversion.IntArrayCH$2",
      "org.mvel.conversion.IntArrayCH",
      "org.mvel.conversion.PrimArrayHandler",
      "org.mvel.conversion.PrimArrayHandler$1",
      "org.mvel.conversion.PrimArrayHandler$2",
      "org.mvel.conversion.BigDecimalCH$1",
      "org.mvel.conversion.BigDecimalCH$2",
      "org.mvel.conversion.BigDecimalCH$3",
      "org.mvel.conversion.BigDecimalCH$4",
      "org.mvel.conversion.BigDecimalCH$5",
      "org.mvel.conversion.BigDecimalCH$6",
      "org.mvel.conversion.BigDecimalCH$7",
      "org.mvel.conversion.BigDecimalCH$8",
      "org.mvel.conversion.BigDecimalCH$9",
      "org.mvel.conversion.BigDecimalCH$10",
      "org.mvel.conversion.BigDecimalCH$11",
      "org.mvel.conversion.BigDecimalCH",
      "org.mvel.conversion.BigIntegerCH$1",
      "org.mvel.conversion.BigIntegerCH$2",
      "org.mvel.conversion.BigIntegerCH$3",
      "org.mvel.conversion.BigIntegerCH$4",
      "org.mvel.conversion.BigIntegerCH$5",
      "org.mvel.conversion.BigIntegerCH$6",
      "org.mvel.conversion.BigIntegerCH$7",
      "org.mvel.conversion.BigIntegerCH$8",
      "org.mvel.conversion.BigIntegerCH$9",
      "org.mvel.conversion.BigIntegerCH",
      "org.mvel.DataConversion",
      "wheel.AbstractEngine$1",
      "wheel.util.AbstractDateConversionHandler$1",
      "wheel.util.AbstractDateConversionHandler",
      "wheel.util.CalendarConversionHandler",
      "wheel.util.DateConversionHandler",
      "wheel.AbstractEngine",
      "wheel.components.Table",
      "wheel.WheelException",
      "wheel.components.FormElement",
      "wheel.components.TextInput",
      "wheel.components.Block",
      "wheel.components.StandaloneComponent",
      "wheel.ErrorPage",
      "wheel.Messages",
      "wheel.components.TableRow",
      "wheel.components.Form",
      "wheel.components.Form$Method",
      "wheel.components.Checkbox",
      "wheel.components.Text",
      "wheel.components.NumberInput",
      "wheel.components.TableBlock",
      "wheel.components.Hidden",
      "wheel.components.Expression",
      "wheel.components.ElExpression",
      "wheel.components.SelectModelFormElement",
      "wheel.components.CheckboxGroup",
      "wheel.util.DynamicSelectModel",
      "wheel.components.Select",
      "wheel.components.Label",
      "wheel.components.ActionExpression",
      "wheel.components.Image",
      "wheel.components.TextArea",
      "org.xmlpull.mxp1_serializer.MXSerializer",
      "wheel.components.Any",
      "wheel.components.Radio",
      "wheel.components.FileInput",
      "wheel.components.RenderableComponentConfiguration",
      "wheel.components.ValidationError",
      "wheel.components.ValidationRule",
      "org.xmlpull.v1.XmlPullParserFactory",
      "org.xmlpull.mxp1.MXParser",
      "org.xmlpull.v1.wrapper.classic.XmlSerializerDelegate",
      "org.xmlpull.v1.wrapper.XmlPullWrapperFactory",
      "org.xmlpull.v1.wrapper.classic.StaticXmlSerializerWrapper",
      "wheel.components.ComponentCreator",
      "wheel.components.Submit",
      "wheel.components.DateInput",
      "wheel.util.StringSelectModel",
      "wheel.util.LabelValue",
      "wheel.components.RadioGroup",
      "wheel.util.InitialFieldValue",
      "wheel.util.ComponentStore",
      "wheel.components.Link",
      "org.mvel.MVEL",
      "org.mvel.BlankLiteral",
      "org.mvel.AbstractParser",
      "org.mvel.MVELInterpretedRuntime",
      "org.mvel.util.ExecutionStack",
      "org.mvel.optimizers.AbstractOptimizer",
      "org.mvel.optimizers.impl.refl.ReflectiveAccessorOptimizer",
      "org.mvel.optimizers.impl.asm.ASMAccessorOptimizer",
      "org.mvel.asm.ClassWriter",
      "org.mvel.asm.ByteVector",
      "org.mvel.asm.Item",
      "org.mvel.optimizers.OptimizerFactory",
      "org.mvel.util.PropertyTools",
      "org.mvel.ASTNode",
      "org.mvel.ast.PropertyASTNode",
      "org.mvel.util.ArrayTools",
      "org.mvel.PropertyAccessor",
      "org.mvel.util.ReflectionUtil",
      "org.mvel.PropertyAccessException",
      "org.mvel.UnresolveablePropertyException",
      "org.mvel.math.IEEEFloatingPointMath",
      "org.mvel.util.ParseTools",
      "org.xmlpull.v1.XmlPullParserException",
      "org.mvel.CompileException",
      "org.mvel.ast.AssignDiv",
      "org.mvel.ast.LiteralNode",
      "wheel.components.StandaloneComponentConfiguration",
      "org.mvel.ParseException",
      "wheel.Asset",
      "wheel.Asset$AssetType",
      "org.mvel.ast.OperatorNode",
      "org.mvel.util.StackElement",
      "org.mvel.ParserContext"
    );
  }
}
