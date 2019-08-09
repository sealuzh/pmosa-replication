/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 24 00:01:01 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/27_math"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.analysis.function.Tan",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.ode.EquationsMapper",
      "org.apache.commons.math3.ode.AbstractIntegrator",
      "org.apache.commons.math3.analysis.solvers.BisectionSolver",
      "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler",
      "org.apache.commons.math3.ode.events.EventFilter",
      "org.apache.commons.math3.analysis.function.Constant",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.ode.SecondaryEquations",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math3.analysis.differentiation.DSCompiler",
      "org.apache.commons.math3.RealFieldElement",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$Method",
      "org.apache.commons.math3.ode.events.EventHandler",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.analysis.solvers.SecantSolver",
      "org.apache.commons.math3.FieldElement",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math3.ode.sampling.StepInterpolator",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.MullerSolver",
      "org.apache.commons.math3.analysis.function.HarmonicOscillator",
      "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator",
      "org.apache.commons.math3.analysis.solvers.PegasusSolver",
      "org.apache.commons.math3.ode.sampling.StepNormalizer",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math3.ode.events.Transformer$4",
      "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator",
      "org.apache.commons.math3.ode.events.Transformer$3",
      "org.apache.commons.math3.ode.events.Transformer$5",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.ode.events.Transformer$2",
      "org.apache.commons.math3.ode.events.Transformer$1",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler$1",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math3.ode.sampling.StepHandler",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.ode.events.EventHandler$Action",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.analysis.function.Abs",
      "org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.linear.RealVectorChangingVisitor",
      "org.apache.commons.math3.linear.RealVectorPreservingVisitor",
      "org.apache.commons.math3.ode.nonstiff.LutherStepInterpolator",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.analysis.solvers.RiddersSolver",
      "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver",
      "org.apache.commons.math3.ode.ExpandableStatefulODE",
      "org.apache.commons.math3.analysis.solvers.BrentSolver",
      "org.apache.commons.math3.analysis.differentiation.DerivativeStructure",
      "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.analysis.function.Minus",
      "org.apache.commons.math3.analysis.function.Ceil",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.ode.sampling.StepNormalizerMode",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.ode.events.EventState",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolver",
      "org.apache.commons.math3.analysis.function.Logistic",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.analysis.solvers.MullerSolver2",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.ode.SecondOrderDifferentialEquations",
      "org.apache.commons.math3.ode.events.FilterType",
      "org.apache.commons.math3.analysis.function.Sin",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler$LazyHolder",
      "org.apache.commons.math3.analysis.solvers.AllowedSolution",
      "org.apache.commons.math3.ode.events.Transformer",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.ode.events.EventState$1",
      "org.apache.commons.math3.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.ode.FirstOrderIntegrator",
      "org.apache.commons.math3.ode.events.EventState$LocalMaxCountExceededException",
      "org.apache.commons.math3.analysis.solvers.IllinoisSolver",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.ode.ODEIntegrator",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.ode.FirstOrderConverter",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$1",
      "org.apache.commons.math3.ode.events.FilterType$1",
      "org.apache.commons.math3.ode.AbstractIntegrator$1",
      "org.apache.commons.math3.ode.events.FilterType$3",
      "org.apache.commons.math3.Field",
      "org.apache.commons.math3.ode.events.FilterType$2",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.exception.NoBracketingException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math3.ode.SecondOrderDifferentialEquations", false, EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EmbeddedRungeKuttaIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.ode.AbstractIntegrator",
      "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math3.ode.FirstOrderConverter",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.ode.ExpandableStatefulODE",
      "org.apache.commons.math3.ode.EquationsMapper",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.ode.events.EventFilter",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math3.analysis.solvers.AllowedSolution",
      "org.apache.commons.math3.ode.events.EventState",
      "org.apache.commons.math3.ode.events.EventHandler$Action",
      "org.apache.commons.math3.ode.sampling.StepNormalizer",
      "org.apache.commons.math3.ode.sampling.StepNormalizerMode",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math3.analysis.solvers.BisectionSolver",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler$LazyHolder",
      "org.apache.commons.math3.analysis.solvers.RiddersSolver",
      "org.apache.commons.math3.ode.AbstractIntegrator$1",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.analysis.function.Minus",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math3.analysis.solvers.IllinoisSolver",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$Method",
      "org.apache.commons.math3.analysis.function.Tan",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.ode.events.Transformer",
      "org.apache.commons.math3.ode.events.EventState$1",
      "org.apache.commons.math3.ode.events.FilterType$3",
      "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.analysis.solvers.MullerSolver2",
      "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.LutherStepInterpolator",
      "org.apache.commons.math3.analysis.solvers.MullerSolver",
      "org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.exception.NoBracketingException",
      "org.apache.commons.math3.analysis.function.Logistic",
      "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.solvers.SecantSolver",
      "org.apache.commons.math3.analysis.solvers.PegasusSolver",
      "org.apache.commons.math3.analysis.solvers.BrentSolver",
      "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver",
      "org.apache.commons.math3.analysis.function.HarmonicOscillator",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.analysis.function.Ceil",
      "org.apache.commons.math3.analysis.function.Sin",
      "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator",
      "org.apache.commons.math3.analysis.function.Abs",
      "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator",
      "org.apache.commons.math3.analysis.function.Constant"
    );
  }
}
