/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 21:17:00 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Asin;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
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
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
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
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1870);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 1870, doubleArray0, 3893.053402956694, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      lutherIntegrator0.integrate(expandableStatefulODE0, 5027.308203564694);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(519);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1281).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = new double[7];
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 247.459799, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 2,562
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-15.4039), 3317.966, 2.675424484351598, 2865.5684239462016);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 3068.666045, doubleArray0, (-1.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-2.5309995887229526E-146));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2.5309995887229526E-146), (-2.5309995887229526E-146), (double)0, (double)0, (double)0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, (-2.5309995887229526E-146), (-2.5309995887229526E-146), 0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      lutherIntegrator0.integrate(expandableStatefulODE0, (-2.5309995887229526E-146));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(2702.0954029566938);
      lutherIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-332.9798304232));
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2738.58396), doubleArray0, (double) 0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-332.9798304232));
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      double double0 = lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray1, (-59.9882), doubleArray0);
      assertEquals((-59.988200000000006), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(427.43);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 797.834442701, doubleArray0);
      assertEquals(797.834442701, double0, 0.01);
      
      lutherIntegrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(422.0, 395.1244096858, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(408.34115747424676, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(0.0);
      // Undeclared exception!
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) null, (-2585.8218903), (double[]) null, 0.0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(4315.061681, 0.0, 0.0, 0.0);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.computeDerivatives(0.0, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(5241.0, (-545.0), 1281.469674, 5241.0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives((-545.0), doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1.1368683772161603E-10);
      lutherIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(0.0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0);
      lutherIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(452.021);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(0.0, (-1369.61));
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-1369.61), 71, (UnivariateSolver) bisectionSolver0);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1882.72587);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver((-3830.97223), 2110.51152924286, 1882.72587);
      eulerIntegrator0.addEventHandler((EventHandler) eventFilter0, 2244.5019533711056, 2110.51152924286, 5, (UnivariateSolver) pegasusSolver0);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(Double.NaN, Double.NaN, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Asin asin0 = new Asin();
      bisectionSolver0.solve(182, (UnivariateFunction) asin0, 1872.219748015079, 2007.68123163, Double.NaN);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 1872.219748015079, 797.834442701, 182, (UnivariateSolver) bisectionSolver0);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1.0), (-140.505150746517), (-1.0));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1462.11, 3228.0, (-436.7187570836683));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 1462.11, (-2143), (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1870);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.0, 0.0, 1870, (UnivariateSolver) null);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 1.1368683772161603E-10, 536, (UnivariateSolver) riddersSolver0);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(4315.061681, 0.0, 0.0, 0.0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(1000.0, 91.57);
      highamHall54Integrator0.addEventHandler((EventHandler) null, (-2038.31938275316), 4315.061681, 666, (UnivariateSolver) mullerSolver2_0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(Double.NaN, Double.NaN, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 794);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1.0), (-140.505150746517), (-1.0));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 3228.0, (-2143));
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-25.23567737982028));
      lutherIntegrator0.addEventHandler((EventHandler) null, (-861.0), (-25.23567737982028), 1217);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(0.0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 519, doubleArray0, 1.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-1533.2663433713715));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1533.2663433713715), (-1533.2663433713715), (double)0, (double)0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1533.2663433713715), (-1533.2663433713715), 0);
      double[] doubleArray0 = new double[0];
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 9267.062043795475, doubleArray0, (-4.734187609526424E-8), doubleArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-332.9798304232));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      lutherIntegrator0.setMaxEvaluations(0);
      double[] doubleArray0 = new double[0];
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.1368683772161603E-10, doubleArray0, 1.0, doubleArray0);
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
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(5108.777041003);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(5108.777041003, (-303.36330113518767), (double)0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(3912.3441716495436, (-1231.02));
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 2654.0, (-1486.41245), 0, (UnivariateSolver) bisectionSolver0);
      // Undeclared exception!
      lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2281.6455637), doubleArray0, 2.9479464287605006E-8, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(2702.0954029566938);
      // Undeclared exception!
      try { 
        lutherIntegrator0.integrate((ExpandableStatefulODE) null, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(519);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        lutherIntegrator0.computeDerivatives(519, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1000.0, 355.1170673, 1000.0, 355.1170673);
      graggBulirschStoerIntegrator0.setMaxEvaluations((-1));
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-2.5309995887229526E-146));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2.5309995887229526E-146));
      try { 
        lutherIntegrator0.integrate(expandableStatefulODE0, (-2.5309995887229526E-146));
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
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-2.5309995887229526E-146));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      lutherIntegrator0.integrate(expandableStatefulODE0, 894.576850174473);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1851);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[17];
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2.2737367544323206E-10, doubleArray0, 1051.11, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 17 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMaxEvaluations(519);
      assertEquals(519, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1.1368683772161603E-10);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.1368683772161603E-10, 455.8562319, 1, (UnivariateSolver) null);
      lutherIntegrator0.getEventHandlers();
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-332.9798304232));
      lutherIntegrator0.getName();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(4, 4, 4, 4, 4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-1296.648));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-25.23567737982028));
      lutherIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(2702.0954029566938);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.0, 2702.0954029566938, 0);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-39.72796353));
      double double0 = lutherIntegrator0.getCurrentStepStart();
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(797.834442701);
      int int0 = gillIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(427.43);
      lutherIntegrator0.getEvaluations();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-332.9798304232));
      lutherIntegrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }
}
