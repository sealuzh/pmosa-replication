/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:49:22 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[5];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1131.6), (-0.05), 0.0);
      try { 
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-11.595793324188385), doubleArray1, (-1069.42718), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1375.8381972764316), (-1375.8381972764316), (-1375.8381972764316), 1374.2077952028824);
      dormandPrince853Integrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1375.8381972764316), (-1375.8381972764316), (-1375.8381972764316), 1374.2077952028824);
      dormandPrince853Integrator0.clearEventHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, 9.094947017729282E-10, doubleArray0);
      double double0 = midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 4.111645931319645E-8, doubleArray0, 1.0, doubleArray0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-17.075219308063364));
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 4.111645931319645E-8, doubleArray0, (-17.075219308063364), doubleArray0);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 2134.406, 2134.406, (-3194.5696918));
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 0.0, 0.0, 0.0, 1668.9589662191);
      double double0 = adamsBashforthIntegrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, adamsBashforthIntegrator0.getMaxEvaluations());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 1.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(5.74952254077566E-19);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, (double[]) null, 1378.0101593655843, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1378.0101593655843);
      // Undeclared exception!
      try { 
        midpointIntegrator0.computeDerivatives(1378.0101593655843, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1378.0101593655843);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        midpointIntegrator0.computeDerivatives(1378.0101593655843, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-345.5), 572.4990920241911, (-345.5), (-345.5));
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(572.4990920241911, doubleArray0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(563.042, (-470.882), 817.44357, 817.44357);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.computeDerivatives((-340.6760157), doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-0.1275278893606981), (-0.1275278893606981), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.addStepHandler((StepHandler) null);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-202.66666666666666), fixedStepHandler0, stepNormalizerMode0);
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1830.134);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 2.147483647E9, 1000.0, 7, (UnivariateSolver) null);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver(1.0);
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(2611.99999999795);
      Rint rint0 = new Rint();
      mullerSolver0.solve(2976, (UnivariateFunction) rint0, (-1.76097684E-316), 1222.9265325);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-836.21), 674, (UnivariateSolver) mullerSolver0);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 3852.13, 0.0, 0, (UnivariateSolver) mullerSolver2_0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-2466.3483830432));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver(0.0);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) 302, 0.0, Integer.MAX_VALUE, (UnivariateSolver) mullerSolver0);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1378.0101593655843);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, (-1658), (-1.0), 5224);
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.955993890762329, (double) 2612, 2612, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(2612);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-378.944), 2612, (-1139.00877894), Integer.MAX_VALUE);
      threeEighthesIntegrator0.addEventHandler((EventHandler) null, (-1261.985), 1.0, 2700, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1374.2077952028824, (-1375.8381972764316), 6193.953264417704, (-1375.8381972764316));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 6193.953264417704, 0.0, 558);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4007.10123334982, 946.707333, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1000.0, 946.707333, 0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1000.0, 0.0, 0.075, 1000.0);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.075, (-1367.625), (-3372));
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(4.94E-321, 5.059959203156465E-8, 5.059959203156465E-8, 5.059959203156465E-8);
      dormandPrince54Integrator0.addEventHandler((EventHandler) null, 0.0, 0.0, (-3666));
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0, 3810.953064903487, doubleArray0, doubleArray1);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1492.33, doubleArray1, 181.206, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      midpointIntegrator0.setMaxEvaluations(0);
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, 9.094947017729282E-10, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-344.35063604748), (-344.35063604748), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, 0.0, doubleArray0, (-344.35063604748), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 2134.406, 2134.406, (-3194.5696918));
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      double[] doubleArray0 = new double[2];
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(0, doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-344.35063604748), (-344.35063604748), 0.0, (-344.35063604748));
      dormandPrince853Integrator0.setMaxEvaluations((-3235));
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1375.8381972764316), (-1375.8381972764316), (-1375.8381972764316), 1374.2077952028824);
      dormandPrince853Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-238.91477626), (-1.0), 0.3540347218513489, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1.0), doubleArray0, (-1.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(765.877902958, 765.877902958, 3010.4855217817776, 3010.4855217817776);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(3025.481460315883);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 7.630546413718035E-10);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(765.877902958, 765.877902958, 3010.4855217817776, 3010.4855217817776);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 7.630546413718035E-10);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1378.0101593655843);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-932.0), doubleArray0, 0.0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1378.0101593655843, (-4683.155893951757), 2612, 4.547473508864641E-10);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[5];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-238.91477626), doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(302).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(302.0, 1031.65138114937, doubleArray0, doubleArray0);
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 604
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1222.9265325, 1.0, (-1.0), 5277.979279148725).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver(1.0);
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(2611.99999999795);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-836.21), 674, (UnivariateSolver) mullerSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(674).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, 1433.78564897);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.0);
      midpointIntegrator0.setMaxEvaluations(77);
      assertEquals(77, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-382.8317516154879));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-382.8317516154879));
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, (-2473.6), (-382.8317516154879), (-606), (UnivariateSolver) mullerSolver2_0);
      midpointIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.1275278893606981), (-0.1275278893606981), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.getName();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1378.0101593655843);
      midpointIntegrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1637.1138793152388), 0.0, (-1582.5), (-1582.5));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, (-1637.1138793152388), (-1637.1138793152388), (-1545));
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(4594.305037519341, 146.10405, 0, 2);
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-705.0151021208608));
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, (-9.194632392478356), 1.0, 1278, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.0);
      double double0 = midpointIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 2134.406, 2134.406, (-3194.5696918));
      int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, (-1582.5), 1579.95816, 1261.65, 941.488);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (-1300.9207779));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1.0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, (double) 0, doubleArray0);
      midpointIntegrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }
}
