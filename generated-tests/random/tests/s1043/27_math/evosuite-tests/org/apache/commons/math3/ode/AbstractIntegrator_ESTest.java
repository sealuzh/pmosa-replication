/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:52:17 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
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
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-923.19204570545), (-923.19204570545), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(5532.408244288142, 5532.408244288142, (-274.6), 443.5);
      highamHall54Integrator0.clearEventHandlers();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(6.097534318207731E113);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      classicalRungeKuttaIntegrator0.addStepHandler(dummyStepHandler0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(479.750006);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1.0), 479.750006, (-1738), (UnivariateSolver) bisectionSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(2937500.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, (-680.38196271), 784.094847695448, (-1418));
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(452.3153565331, 452.3153565331, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) null, 2292.366, 1656.2974, (-3));
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-3.275360514112964E-9), 1486.9715309461, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2292.366, doubleArray0, 0.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.26820653676986694, 1741.22, 0.26820653676986694, 0.26820653676986694);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (double) Integer.MAX_VALUE, (double) 185, Integer.MAX_VALUE, (UnivariateSolver) regulaFalsiSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(185).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1859.26));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1263.51104246, 1263.51104246, doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxEvaluations((-1));
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0239791185239086E-7, 1.0239791185239086E-7, doubleArray0, doubleArray0);
      highamHall54Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(598.5104);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((-2668), (-192.744));
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 598.5104, 598.5104, (-2668), (UnivariateSolver) bisectionSolver0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-86.3406271946));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(5532.408244288142, 5532.408244288142, (-274.6), 443.5);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-962.68795));
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-358.82088275));
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(603.86706725, (-3185.8669), 2075.7336415761074, 603.86706725);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 603.86706725, doubleArray0, 2.9387358770557188E-36, doubleArray0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(6.097534318207731E113);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, 2426.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, 5, (-2589.504), 5, 5);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-3513.2), doubleArray0, 1474.281797565841, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(4227.5907787657, 4227.5907787657, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-537.2139), doubleArray0, 4227.5907787657, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(148.88, 148.88, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[5];
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 5, doubleArray0, (double) 5, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(598.5104);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, Double.NaN, (-317.48), 366);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, (-192.744));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0239791185239086E-7, 1.0239791185239086E-7, doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxEvaluations(6);
      assertEquals(6, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(598.5104);
      classicalRungeKuttaIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1263.51104246, 1263.51104246, doubleArray0, doubleArray0);
      highamHall54Integrator0.getName();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(598.5104);
      classicalRungeKuttaIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(598.5104);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, Double.NaN, (-317.48), 366);
      classicalRungeKuttaIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(598.5104);
      double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.26820653676986694, 1741.22, 0.26820653676986694, 0.26820653676986694);
      int int0 = graggBulirschStoerIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-3420.44089311641));
      double double0 = threeEighthesIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, (-0.020331201708508627), Double.NaN, (-3897.37606279), 5);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }
}
