/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 02:03:12 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Sin;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GillIntegrator gillIntegrator0 = new GillIntegrator(2012.372843356597);
      double[] doubleArray1 = new double[1];
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.431009021985696E-216, doubleArray0, (double) 0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = gillIntegrator0.singleStep(firstOrderConverter0, 1849.9832927286, doubleArray0, 0);
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1648.0342504421, doubleArray0, 1000.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1142).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1995.0, 945.1, 945.1, (-2482.279051268));
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 68.2767001, doubleArray0, 945.1, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 2,284
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GillIntegrator gillIntegrator0 = new GillIntegrator(2012.372843356597);
      double[] doubleArray1 = gillIntegrator0.singleStep(firstOrderConverter0, (-0.35555555555555557), doubleArray0, (-597.8));
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      
      double double0 = gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 217.648740334, doubleArray1, (-1876.963405767319), doubleArray0);
      assertEquals((-1876.963405767319), double0, 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.03643739968538284, 332.0, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(3.4781053312898824, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-2188.3));
      threeEighthesIntegrator0.setMaxEvaluations(0);
      assertEquals(0, threeEighthesIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray1);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) null, Double.NaN, doubleArray0, (-114.0143164174208), doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1201.8751200000002, 1300.26320568536, 1517.6246861144111, 1517.6246861144111);
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.computeDerivatives(303.0, (double[]) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1723.081063796623));
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        eulerIntegrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.0), (-1.0), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.computeDerivatives((-1.0), doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.63957027915428E-66, 1.7976931348623157E308, 0.0, 0.0);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1795.105971177504), 708, (-1795.105971177504));
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1795.105971177504), (-1795.105971177504), 708, (UnivariateSolver) illinoisSolver0);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-3036.32743490684), 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BrentSolver brentSolver0 = new BrentSolver(149, 0.0, (-3036.32743490684));
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 448.109232, 544.0, 149, (UnivariateSolver) brentSolver0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.6218161582946777);
      Sin sin0 = new Sin();
      illinoisSolver0.solve(1779, (UnivariateFunction) sin0, (-369.24204323), (-0.35555555555555557), 2.6218161582946777);
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1.0));
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, 3320.3437085858895, 2.6218161582946777, 1779, (UnivariateSolver) illinoisSolver0);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1.0));
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1737.207), (-1737.207), 1779, (UnivariateSolver) illinoisSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.8888888888888888);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(2.5213756561279297, 0.8888888888888888, 2416.60841);
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.8888888888888888, (-1736.22), (-212), (UnivariateSolver) pegasusSolver0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(4.4266130556431266E-266);
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1723.081063796623));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1723.081063796623), 0.0, 2060, (UnivariateSolver) illinoisSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 1057.025622194, (-798.2797295912), 0, (UnivariateSolver) riddersSolver0);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-463.1468275730223));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.049863815307617);
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 155.95, 1779, (UnivariateSolver) illinoisSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1.0087056692827474E-7);
      eulerIntegrator0.addEventHandler((EventHandler) null, (-0.35555555555555557), 1.0, 1320, (UnivariateSolver) null);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1107.6106, 0.0, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-456.24852153), 0.0, 246);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-2265.17713671934), 0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 3462.4062794688925, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 1435.5592376, 5);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-2440.7545024181295));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.0, 1.0, (-2641));
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2012.372843356597);
      gillIntegrator0.addEventHandler((EventHandler) null, (-0.35555555555555557), 217.648740334, 0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GillIntegrator gillIntegrator0 = new GillIntegrator(2012.372843356597);
      double[] doubleArray1 = gillIntegrator0.singleStep(firstOrderConverter0, (-0.35555555555555557), doubleArray0, 0);
      // Undeclared exception!
      gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 217.648740334, doubleArray1, 1.2924697071141057E-23, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2190.9674906636), (double[]) null, (-2190.9674906636), (double[]) null);
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
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5);
      eulerIntegrator0.addEventHandler(eventHandler0, (double) 1779, (double) 1779, 1, (UnivariateSolver) illinoisSolver0);
      // Undeclared exception!
      eulerIntegrator0.integrate(expandableStatefulODE0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1795.105971177504), (-1795.105971177504), (-1795.105971177504), (double)5, (-1795.105971177504)).when(eventHandler0).g(anyDouble() , any(double[].class));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1446.51278);
      eulerIntegrator0.addEventHandler(eventHandler0, 1257.14442009762, 1257.14442009762, 8, (UnivariateSolver) illinoisSolver0);
      try { 
        eulerIntegrator0.integrate(expandableStatefulODE0, 2203.9898);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [\uFFFD, \uFFFD], values: [-1,795.106, -1,795.106]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(4.94E-321, 4.94E-321, 4.94E-321, 1.372187614440918);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, 1.372187614440918);
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
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(3360.15);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        classicalRungeKuttaIntegrator0.computeDerivatives(3360.15, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1431.46607492), 1960.0, (-1431.46607492), (-92.29));
      graggBulirschStoerIntegrator0.setMaxEvaluations((-3360));
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1795.105971177504));
      try { 
        eulerIntegrator0.integrate(expandableStatefulODE0, (-1795.105971177504));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      eulerIntegrator0.integrate(expandableStatefulODE0, (-1795.105971177504));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GillIntegrator gillIntegrator0 = new GillIntegrator(2012.372843356597);
      double[] doubleArray1 = gillIntegrator0.singleStep(firstOrderConverter0, (-0.35555555555555557), doubleArray0, 0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      
      double double0 = gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray1, 1.1368683772161603E-10, doubleArray0);
      assertEquals(1.1368683772161603E-10, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(761).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      GillIntegrator gillIntegrator0 = new GillIntegrator(1435.5592376);
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = expandableStatefulODE0.getPrimaryState();
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 788.24, doubleArray1, 604.59458719245, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 1,522
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GillIntegrator gillIntegrator0 = new GillIntegrator(2010.553000966622);
      double[] doubleArray1 = gillIntegrator0.singleStep(firstOrderConverter0, (-0.35555555555555557), doubleArray0, 0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 217.648740334, doubleArray1, (double) 0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(934.0991829972755);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.0, fixedStepHandler0, stepNormalizerBounds0);
      eulerIntegrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      eulerIntegrator0.integrate(expandableStatefulODE0, 934.0991829972755);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      eulerIntegrator0.setMaxEvaluations(1904);
      assertEquals(1904, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2010.553000966622);
      gillIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-463.1468275730223));
      eulerIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(770.667528840754);
      eulerIntegrator0.getName();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-1795.105971177504));
      eulerIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2010.553000966622);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, (-0.35555555555555557), 1.1368683772161603E-10, 0);
      gillIntegrator0.getEventHandlers();
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2010.553000966622);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-329.2));
      int int0 = gillIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2010.553000966622);
      gillIntegrator0.getEvaluations();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2010.553000966622);
      gillIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }
}
