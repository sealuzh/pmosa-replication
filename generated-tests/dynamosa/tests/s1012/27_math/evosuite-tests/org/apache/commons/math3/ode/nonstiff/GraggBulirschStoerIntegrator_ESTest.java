/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:03:45 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-925.089702), 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 7);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-7.019891063126053E-9), 0.9999, (-3177.559), 0.9999);
      graggBulirschStoerIntegrator0.setOrderControl(2146443638, (-1333.642728), 0.9999);
      assertEquals(0.9999, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1772.243728607, 1377.535199, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(6, 6, (-116.1943));
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.94, (-356), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors((-356), 0.94, 0.94, 999.9);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-896.1915952291657), (-1204), (-1204), 1.0E-4);
      graggBulirschStoerIntegrator0.setControlFactors(1.0E-4, (-1305.0), (-3776.03342695908), 1.0001);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3160.56791667701, (-2744.15629258995), 3160.56791667701, 3160.56791667701);
      graggBulirschStoerIntegrator0.setControlFactors((-1042.8699772), (-1305.0), 0.9999, 3010);
      assertEquals(2945.01143235593, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2744.15629258995), (-2744.15629258995), 9.85967600992008E-305, 3160.56791667701);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 0.16666666666745392, 1.0E-4, (-2744.15629258995));
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2569.821889), (-1387.875401), 1633.692966557908);
      graggBulirschStoerIntegrator0.setControlFactors((-1180.99989836557), 0.9999, 4, 1772.243728607);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-896.1915952291657), (-1204), (-1204), 1.0E-4);
      graggBulirschStoerIntegrator0.setControlFactors((-896.1915952291657), 1.0E-4, (-1204), (-438.478731999));
      assertEquals(1204.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.02, 0.8, (-1.0440854056870505E-160), 0.8);
      graggBulirschStoerIntegrator0.setControlFactors(0.9999, 1893.058570809, 1735.2347529112, 0.01);
      assertEquals(0.02, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3160.56791667701, (-2744.15629258995), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-385), (-4186), 0.9999);
      assertEquals(2744.15629258995, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-4.135185828158998E96), (-2979.31089), (-572.597877726));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 590, (-1857), 1.0E-4);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3160.56791667701, (-2744.15629258995), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-470), (-470), (-470));
      assertEquals(2945.01143235593, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-557.950573), (-557.950573), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-3035), 0, 10.0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1053.608, 0.0, (-4.135185828158998E96), 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 0, (-1641), 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2569.821889), (-1387.875401), 1633.692966557908);
      graggBulirschStoerIntegrator0.setOrderControl((-2145334869), 1633.692966557908, 0.0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3160.56791667701, (-2744.15629258995), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(3010, 0.0, (-2744.15629258995));
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1053.608, 0.0, (-4.135185828158998E96), 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(0, (-4.135185828158998E96), 1.0E-10);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2757.218808156, 0.0, 0.0, 2757.218808156);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 0);
      assertEquals(2757.218808156, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1772.243728607, 1377.535199, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 380);
      assertEquals(1562.4749973561643, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2569.821889), (-1387.875401), 1633.692966557908);
      graggBulirschStoerIntegrator0.setControlFactors(4372.608709880135, 0.0, 0.0, (-4.820065619207094E-9));
      assertEquals(2569.821889, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(937.356436969668, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 1.681239366531372, 0.0, 1660.9091079);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-193.37538), (-10));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-2299.427906), (-10), (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-557.950573), (-876.3594), (-557.950573), (-557.950573));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-5.87834), (-557.950573));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 549.99373495, (double) 2145981395, (-1204), (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getMin(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2757.218808156, 0.0, 0.0, 2757.218808156);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) 0, 0.0, 0, (UnivariateSolver) mullerSolver2_0);
      assertEquals(1.0E-15, mullerSolver2_0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2569.821889), (-1387.875401), 1633.692966557908);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4372.608709880135, 4372.608709880135);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) (-1204), 4372.608709880135, (-1204), (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.8089985847473145, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 1.8089985847473145, 1.8089985847473145, 23, (UnivariateSolver) null);
      assertEquals(1.8089985847473145, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(245).when(secondOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1070.7944830153167), (-1070.7944830153167), doubleArray0, doubleArray0);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1070.7944830153167));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 490 != 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1204), 0.01, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, 0.01);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = null;
      try {
        graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1299.4636), (-1299.4636), (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2569.821889), (-1387.875401), 1633.692966557908);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-1204));
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2.9988278531841556E-102), (-1204), 2051.33939425856, 10.0);
      graggBulirschStoerIntegrator0.setOrderControl((-1204), 3010, 799.224568314308);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.94, 0.94, (-2985.39), 0.0);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 0.94, 0.0, 0.0);
      assertEquals(0.94, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.94, 0.94, (-2985.39), 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 404, 404, 1.0E-15);
      assertEquals(0.94, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3160.56791667701, (-2744.15629258995), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepSizeControl(139.8, 0.9999, (-1513.444783219), 433.289);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.01, doubleArray0, 1.130435759928337E-140, doubleArray0);
      assertEquals(21, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3160.56791667701, (-2744.15629258995), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepSizeControl(1291.0, 1291.0, (-168.738), 0.9999);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 433.289, doubleArray0, 1291.0, doubleArray0);
      assertEquals(21, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1204), 0.01, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStepSizeControl(2.6683101654052734, 2.6683101654052734, 2374.38967189, (-1881.13));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1780.70859838277), doubleArray0, 139.8, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1204), 0.01, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1780.70859838277), doubleArray0, 139.8, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.94, 0.94, (-2985.39), 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1), (-1), 0.6);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0E-4);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-896.1915952291657), (-1204), (-1204), 1.0E-4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(18).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-896.1915952291657));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1021.9941118, 1021.9941118, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1021.9941118);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1819.1143731640943, 0.65, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1);
      assertEquals(0.65, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.10818853974342346, 1.0001, (-3917.204704208361), 0.10818853974342346);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 254);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.5352771282196045);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2744.15629258995), (-2744.15629258995), 9.85967600992008E-305, 3160.56791667701);
      graggBulirschStoerIntegrator0.setOrderControl(3010, (-4001.989), 1.0E-4);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-896.1915952291657), (-1204), (-1204), 1.0E-4);
      graggBulirschStoerIntegrator0.setOrderControl(314, 1.0E-4, (-2252.2727435));
      assertEquals(1204.0, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0, 2.0, doubleArray0, doubleArray1);
      graggBulirschStoerIntegrator0.setOrderControl(351, 2.0, 2.0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1053.608, 0.0, (-4.135185828158998E96), 0.0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }
}