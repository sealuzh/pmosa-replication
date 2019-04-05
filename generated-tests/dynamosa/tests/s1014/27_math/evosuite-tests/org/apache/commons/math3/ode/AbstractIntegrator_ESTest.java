/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:29:32 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
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
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[0];
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-49.86840843831867), doubleArray0, (-1776.770596), doubleArray1);
      assertEquals((-1776.770596), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[8];
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2.2737367544323206E-10, doubleArray0, 1000.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(334.0467, 334.0467, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2.2695999828608633E-201, doubleArray0, 334.0467, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(72.06505, 72.06505, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 72.06505, doubleArray0, 696.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 10
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1238.048757716955);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(818).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(1238.048757716955, 1.0, 1.0, 1.0, 1.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      midpointIntegrator0.addEventHandler(eventHandler0, 1.0, 1.0, 818);
      // Undeclared exception!
      midpointIntegrator0.integrate(expandableStatefulODE0, 1.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5635819068923884);
      midpointIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      dormandPrince54Integrator0.clearEventHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1594.5941), doubleArray0, 0.0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      eulerIntegrator0.setMaxEvaluations(0);
      assertEquals(0, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1000.0, 0.0, 1000.0, 0.0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(457.22678401);
      // Undeclared exception!
      try { 
        midpointIntegrator0.computeDerivatives(457.22678401, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1323.76255));
      eulerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-102.049520992835));
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-102.049520992835), fixedStepHandler0);
      midpointIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 437, (UnivariateSolver) null);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-581.225414));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      SecantSolver secantSolver0 = new SecantSolver(0.0, 8.165114384910189E-116);
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1448.6891934999999, 1.0, 779, (UnivariateSolver) secantSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.5635819068923884);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-528.20761), (-1573.649311441824), (-528.20761));
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, 867.50009081, (double) Integer.MAX_VALUE, 367, (UnivariateSolver) illinoisSolver0);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RiddersSolver riddersSolver0 = new RiddersSolver();
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, (-699), (UnivariateSolver) riddersSolver0);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, (-3132.7926671), (-722.0395), 0, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      SecantSolver secantSolver0 = new SecantSolver();
      eulerIntegrator0.addEventHandler((EventHandler) null, 1000.0, 0.0, 1903, (UnivariateSolver) secantSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 3178.89424944, doubleArray0, doubleArray0);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 2730.0, 2730.0, 0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(587.19, (-460.1), doubleArray0, doubleArray0);
      highamHall54Integrator0.addEventHandler((EventHandler) null, 2.2737367544323206E-10, 0.0, (-398));
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 3178.89424944, doubleArray0, doubleArray0);
      highamHall54Integrator0.addEventHandler((EventHandler) null, 0.0, 4163.286470113326, (-277));
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.addEventHandler((EventHandler) null, (double) (-277), (-1.0), (-277));
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
      // Undeclared exception!
      eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 1253.04781532685, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1253.04781532685);
      // Undeclared exception!
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) null, (-1.0), (double[]) null, (-1.0), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1381.914776);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, (-2602.39813784785));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-0.28882907565129784), (-0.28882907565129784), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-0.28882907565129784));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        midpointIntegrator0.computeDerivatives((-2495.9884153), (double[]) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, (-5849.02457450972));
      dormandPrince54Integrator0.setMaxEvaluations((-1515));
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1253.04781532685);
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 319.361758475638, doubleArray0, 319.361758475638, doubleArray0);
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
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      midpointIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(818).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double[] doubleArray0 = expandableStatefulODE0.getCompleteState();
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1896));
      double[] doubleArray1 = new double[1];
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2897.65977, doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 1,636
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1000.0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RiddersSolver riddersSolver0 = new RiddersSolver((-1424.5448), 0.0);
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-3409.616937), 645, (UnivariateSolver) riddersSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 789.8587103268501, doubleArray0, 1000.0, doubleArray0);
      assertEquals(1000.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-4346.0));
      midpointIntegrator0.setMaxEvaluations(1464);
      assertEquals(1464, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1.0085373835899469E-8);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.0085373835899469E-8, 1.0085373835899469E-8, 486);
      classicalRungeKuttaIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-102.049520992835));
      midpointIntegrator0.getName();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1000.0, 1000.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1381.914776);
      double double0 = threeEighthesIntegrator0.getCurrentStepStart();
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1000.0, 1000.0, doubleArray0, doubleArray0);
      int int0 = highamHall54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1000.0, 1000.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.0), 2588.8316542, (-1.0), (-1.0));
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(50.880562636433176, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 1598.176490566, 1835.613589232085, 1384.890216254, (-366.945209));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 1384.890216254);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }
}