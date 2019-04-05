/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:55:43 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.436036590244714E-8, 7.436036590244714E-8, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 7);
      assertEquals(7.436036590244714E-8, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.436036590244714E-8, 7.436036590244714E-8, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(2958, 191.3155733, 1.0E-4);
      assertEquals(7.436036590244714E-8, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1027.7862, (-748.2), 1027.7862, 4690.077327665393);
      graggBulirschStoerIntegrator0.setOrderControl(0, 0.9999, 0.0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-939.576471), 341.1033, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(6, (-8.137269363160008E-8), 341.1033);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2222.6443, (-1.1603376405901542E-7), 2222.6443, (-1921.8838175385804));
      graggBulirschStoerIntegrator0.setControlFactors((-59.7117), (-59.7117), (-4298.28359466789), 999.9);
      assertEquals(0.016059320791780563, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setControlFactors(1583.2365777, 1292.6010498568, 0.9999, 0.9999);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(7.200489472E10, 0.9999, 2022.106539537683, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3413.225, 3413.225, 1.0E-4, 1.0E-4);
      graggBulirschStoerIntegrator0.setControlFactors(1.0E-4, 3413.225, 2.2352467822017166E37, 2022.106539537683);
      assertEquals(3413.225, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-983), (-1073795508), 0.9999);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 3276, 705, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2971.04037399331, (-898.08593409), 2971.04037399331, 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 0, 0, 2971.04037399331);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1471.4263203186), 2868.856911286553, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(4, 0.0, 1665.605379);
      assertEquals(2868.856911286553, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, 1.0E-4, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(668.5153431896754, (-3.295268490032475E179), (-3.295268490032475E179), 0.8);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 0);
      assertEquals(668.5153431896754, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 1.7976931348623157E308);
      graggBulirschStoerIntegrator0.setControlFactors(1193.0557645646143, 0.0, 0.02, 0.0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-2963.7610670538), 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 49.1217466);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(925.027090384, 925.027090384, 997.096294, 1.0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.0, fixedStepHandler0, stepNormalizerMode0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3964.8998049, 1472.0, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1951.3330576529, 196.3789512472108, 0, (UnivariateSolver) null);
      assertEquals(1472.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2868.856911286553, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 27, 0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.4349733591079712, 7.436036590244714E-8, 27, (UnivariateSolver) illinoisSolver0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2834.5), 0.0, 2341.1146748, 2341.1146748);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(0.0, 0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-296.0), 926.9, 0, (UnivariateSolver) bisectionSolver0);
      assertEquals(0.0, bisectionSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3749.79, 2249.555, 2249.555, (-2533.0));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(3.107837179570674E180, 3.107837179570674E180);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 2249.555, (double) 0, 0, (UnivariateSolver) pegasusSolver0);
      assertEquals(0, pegasusSolver0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(251.215, 1.0001, 0.9999, 251.215);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1584.62616, 251.215, (-558), (UnivariateSolver) pegasusSolver0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 0.0, 1370.63692443, 749, (UnivariateSolver) mullerSolver2_0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8);
      graggBulirschStoerIntegrator0.setMaxEvaluations(33);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2571.647382168487));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (33) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-5999.43085673336), (-5999.43085673336), (-5999.43085673336), 1.4259627797225802E-292);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.4259627797225802E-292);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.4259627797225802E-292);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, (double) 835);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = null;
      try {
        graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-15, 1.0E-15, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-281.546418831182), 3413.225, (-281.546418831182), (-281.546418831182));
      graggBulirschStoerIntegrator0.setOrderControl((-1866), (-1866), (-281.546418831182));
      assertEquals(3413.225, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1027.7862, (-748.2), 1027.7862, 4690.077327665393);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-3438));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2909.11538));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-2963.7610670538), 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(131).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1519.7423615));
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3413.225, 3413.225, 1.0E-4, 1.0E-4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(454).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1985.2340238427344);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-3681.97544));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2340.595268415178), (-2340.595268415178), 1.0E-4, (-1.3796964318444627));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(104);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-241.577346749));
      assertEquals(131, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-5999.43085673336), (-5999.43085673336), (-5999.43085673336), 1.4259627797225802E-292);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.511474847793579);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1985.2);
      assertEquals(131, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-5.002774317612589E-8));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-281.546418831182), 3413.225, (-281.546418831182), (-281.546418831182));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1866), (-1580), (-1866));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-939.576471), 341.1033, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-939.576471));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E15, 1.0E-4, 0.0, 1356.1);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 2);
      assertEquals(1.0E15, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-939.576471), 341.1033, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 27);
      assertEquals(566.1206893061358, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-939.576471), 341.1033, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(120, 3317.2, 0.9999);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8, 7.436036590244714E-8);
      graggBulirschStoerIntegrator0.setOrderControl(33, 179.745854544146, 4158.75417754);
      assertEquals(7.436036590244714E-8, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), 7.436036590244714E-8, 0.0, 4.0E-15);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 4266.3, 4266.3, 4266.3);
      assertEquals(1.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 1.0, 5.211277349928963, 1.0);
      graggBulirschStoerIntegrator0.setControlFactors(1.0, 2.7569686255975333E304, 0.0, 5.211277349928963);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-396.1497022), 1049.179262575077, 7.436036590244714E-8, 1.0);
      graggBulirschStoerIntegrator0.setControlFactors((-396.1497022), 1.0E-4, 1.0E-4, 0.0);
      assertEquals(1049.179262575077, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2222.6443, (-1.1603376405901542E-7), 2222.6443, (-1921.8838175385804));
      graggBulirschStoerIntegrator0.setControlFactors(0.9, 3008.08371856, 1.0001, (-4490.94));
      assertEquals(2222.6443, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3114.707727735302, 3114.707727735302, (-1393.6991998599249), (-1393.6991998599249));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2146757656, 2146757656, 1.0E-4);
      assertEquals(3114.707727735302, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2868.856911286553, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3114.707727735302, 3114.707727735302, (-1393.6991998599249), (-1393.6991998599249));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      BrentSolver brentSolver0 = new BrentSolver((-1393.6991998599249), (-7257.27094840617), (-356.83409201718));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1393.6991998599249), (-1471.4263203186), 2146757656, (UnivariateSolver) brentSolver0);
      assertEquals(0, brentSolver0.getEvaluations());
  }
}