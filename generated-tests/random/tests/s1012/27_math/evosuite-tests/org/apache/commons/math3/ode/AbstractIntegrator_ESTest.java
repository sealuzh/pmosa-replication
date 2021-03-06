/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 11:41:19 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(2.46537446975708);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[1];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2.46537446975708, doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-2505.6484414));
      eulerIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2979.22198122, 2979.22198122, 2979.22198122, 2979.22198122);
      double[] doubleArray0 = new double[0];
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer(2836.0, fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      dormandPrince853Integrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 694.0, doubleArray0, (-1022.1850235251), doubleArray0);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals((-1022.1850235251), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1000.0);
      // Undeclared exception!
      try { 
        gillIntegrator0.computeDerivatives(1000.0, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2167.13908, 2167.13908, (-1.0), (-1.0));
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives((-3355.5075040214924), doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1.0), 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, (-1.0), 1.1368683772161603E-10, 2499, (UnivariateSolver) pegasusSolver0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(572.4037961875638, 572.4037961875638, doubleArray0, doubleArray0);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 572.4037961875638, 658.9817111, 500);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3210.6935557295897), (-3210.6935557295897), (-3210.6935557295897), (-3210.6935557295897));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, (-1007));
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(5.6843418860808015E-11);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1026.0752998), doubleArray0, 2836.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2979.22198122, 2979.22198122, 2979.22198122, 2979.22198122);
      double[] doubleArray0 = new double[0];
      dormandPrince853Integrator0.setStepSizeControl(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMaxEvaluations(2021);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 694.0, doubleArray0, (-1022.1850235251), doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,021) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(572.4037961875638, 572.4037961875638, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, 824.512404144847, doubleArray0, 572.4037961875638, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1.0), 0.0, 0.0);
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-1.0));
      classicalRungeKuttaIntegrator0.getEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-663.73978));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, 1.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2167.13908, 2167.13908, (-1.0), (-1.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(491.076541715264, (-1102.1495721113)).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-768.673), 2836.0, 2836.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 2836.0, (-768.673), 802, (UnivariateSolver) illinoisSolver0);
      expandableStatefulODE0.setTime(0.0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 445.8775200555637);
      assertEquals(445.8775200555637, expandableStatefulODE0.getTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-2505.6484414));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      eulerIntegrator0.integrate(expandableStatefulODE0, 1000.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(614.5983, 614.5983, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 34.05547392479, doubleArray0, 614.5983, doubleArray0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.5318912267684937, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-3224.956623780481), doubleArray1, (-1.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) 271, Double.NaN, 271);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(877.3888775);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      lutherIntegrator0.addEventHandler((EventHandler) null, (-1891.63), (-1891.63), 16, (UnivariateSolver) regulaFalsiSolver0);
      lutherIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(0.0);
      threeEighthesIntegrator0.getName();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2167.13908, 2167.13908, (-1.0), (-1.0));
      graggBulirschStoerIntegrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1108.1);
      double double0 = eulerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2214.0), (-756.0), doubleArray0, doubleArray0);
      int int0 = dormandPrince54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, (-932.494950776114), (-932.494950776114), 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(416.8431351345357);
      double double0 = eulerIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(5.6843418860808015E-11);
      lutherIntegrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }
}
