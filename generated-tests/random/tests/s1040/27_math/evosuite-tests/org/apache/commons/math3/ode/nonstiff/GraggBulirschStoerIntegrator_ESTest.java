/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:35:20 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

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
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-5.5299180508885456E281), (-5.5299180508885456E281), 3832.0, 1.7976931348623157E308);
      graggBulirschStoerIntegrator0.getEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2365.53115322), doubleArray0, 0.01, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors((-2544.13), (-2544.13), (-5.5299180508885456E281), 1067.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-923));
      graggBulirschStoerIntegrator0.setControlFactors((-923), (-5.5299180508885456E281), 3832.0, 1067.0);
      assertEquals(21, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2187.78966995591, 2187.78966995591, 879.793, 879.793);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2797, (-458), 2187.78966995591);
      graggBulirschStoerIntegrator0.setOrderControl((-458), (-3212.7), (-445.4116704045977));
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-597.0), fixedStepHandler0, stepNormalizerBounds0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2187.78966995591;
      doubleArray0[1] = (-3212.7);
      doubleArray0[2] = (-3212.7);
      doubleArray0[3] = (-2776.1879637322);
      doubleArray0[4] = 879.793;
      doubleArray0[5] = (double) 2797;
      doubleArray0[6] = (-445.4116704045977);
      stepNormalizer0.init(2187.78966995591, doubleArray0, 2644.0267);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-458));
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-1617));
      graggBulirschStoerIntegrator0.setControlFactors(0.9999, 1.6903781197123503E-8, (-1617), 0.2786078453063965);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1573.637350082);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2639.42064622334), (-240.0), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2639.42064622334));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = 2187.78966995591;
      double double1 = (-1258.31486355);
      double double2 = 879.793;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2187.78966995591, (-1258.31486355), 879.793, 879.793);
      boolean boolean0 = false;
      int int0 = 2797;
      int int1 = (-458);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2797, (-458), 2187.78966995591);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double3 = (-3212.7);
      expandableStatefulODE0.setTime((-3212.7));
      double double4 = (-445.4116704045977);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-445.4116704045977));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.6525617499662284E-233, 1.6525617499662284E-233, 8.750367485925089E-8, 8.750367485925089E-8);
      graggBulirschStoerIntegrator0.setInitialStepSize((-3778.8884459308692));
      graggBulirschStoerIntegrator0.setOrderControl(2128, 2128, 8.750367485925089E-8);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2128, 1, (-486.7546185092239));
      graggBulirschStoerIntegrator0.scalRelativeTolerance = 1497.978809889;
      graggBulirschStoerIntegrator0.scalAbsoluteTolerance = 4.116164446561962E-8;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 2128);
      graggBulirschStoerIntegrator0.setControlFactors(8.750367485925089E-8, 2128, 1105.4, 4.604606371472047E299);
      graggBulirschStoerIntegrator0.setControlFactors(4.604606371472047E299, 8.750367485925089E-8, 6.51813137650059E-8, 1105.4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 8.750367485925089E-8);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2494.9535408075), (-916.719816634888), (-1.0), (-916.719816634888));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 2);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1258.8617870451444;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1258.8617870451444, 1258.8617870451444, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      double double0 = 1383.202641089;
      graggBulirschStoerIntegrator0.setControlFactors((-1056.46), 1383.202641089, (-1056.46), 1383.202641089);
      int int0 = (-2416);
      graggBulirschStoerIntegrator0.setOrderControl((-2416), (-1056.46), 1383.202641089);
      graggBulirschStoerIntegrator0.setOrderControl((-2416), 0.34508460760116577, 1258.8617870451444);
      ExpandableStatefulODE expandableStatefulODE0 = null;
      try {
        expandableStatefulODE0 = new ExpandableStatefulODE((FirstOrderDifferentialEquations) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.ExpandableStatefulODE", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2523.239719020688;
      doubleArray0[1] = 2523.239719020688;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2523.239719020688, 2523.239719020688, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, (-1650.88274542), 2523.239719020688);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1650.88274542), 0.0, (-2779), (UnivariateSolver) pegasusSolver0);
      graggBulirschStoerIntegrator0.setInitialStepSize(2523.239719020688);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(2523.239719020688, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double double0 = 657.708324633;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 657.708324633;
      doubleArray0[1] = 657.708324633;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(657.708324633, 657.708324633, doubleArray0, doubleArray0);
      boolean boolean0 = false;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-2572));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) (-2572);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.initializeStep(false, 0, doubleArray0, 657.708324633, doubleArray1, doubleArray1, doubleArray1, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = (-2191.950496172);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2191.950496172), 2.0, (-2191.950496172), 2.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1207.004746), 0.0, 0.8);
      graggBulirschStoerIntegrator0.setOrderControl((-1392), 1062.4783164, (-1233.293314793183));
      graggBulirschStoerIntegrator0.filterStep((-1207.004746), false, false);
      graggBulirschStoerIntegrator0.setControlFactors((-549.47), 4.0, 4.0, (-1207.004746));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 3194, 0, (-1207.004746));
      graggBulirschStoerIntegrator0.getStepHandlers();
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1), 0, 4.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 0, 0, 1.0E-4);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) (-1392);
      doubleArray0[2] = 1062.4783164;
      doubleArray0[3] = (-1233.293314793183);
      doubleArray0[4] = 0.8;
      doubleArray0[5] = 9.453598391231829E-8;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = (-549.47);
      doubleArray0[8] = 1062.4783164;
      eventFilter0.init(2535.918678740798, doubleArray0, 1177.606935203);
      PegasusSolver pegasusSolver0 = new PegasusSolver((-783.0), (-1), 3194);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1207.004746), 0.0, 1449, (UnivariateSolver) pegasusSolver0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1712), 710, 0.0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-865.0);
      doubleArray0[1] = (-865.0);
      doubleArray0[2] = 4.3750396394525074E48;
      doubleArray0[3] = 4.3750396394525074E48;
      doubleArray0[4] = (-865.0);
      doubleArray0[5] = 4.3750396394525074E48;
      doubleArray0[6] = 4.3750396394525074E48;
      doubleArray0[7] = 4.3750396394525074E48;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-865.0);
      doubleArray1[1] = (-865.0);
      doubleArray1[2] = (-865.0);
      doubleArray1[3] = 4.3750396394525074E48;
      doubleArray1[4] = 4.3750396394525074E48;
      doubleArray1[5] = 4.3750396394525074E48;
      doubleArray1[6] = 4.3750396394525074E48;
      doubleArray1[7] = 4.3750396394525074E48;
      doubleArray1[8] = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.3750396394525074E48, (-865.0), doubleArray0, doubleArray1);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setControlFactors(4.3750396394525074E48, (-2348.017098358), 4.3750396394525074E48, (-249.0));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 413, 413, (-2348.017098358));
      graggBulirschStoerIntegrator0.setControlFactors(4.3750396394525074E48, 0.0, 1699.045938744, (-3052.45622599));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-2348.017098358), 4.3750396394525074E48, 4.3750396394525074E48);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-3052.45622599), 413, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(0.0, regulaFalsiSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.1364731788635254;
      doubleArray0[1] = 256.4;
      doubleArray0[2] = 0.9999;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(256.4, 1.1364731788635254, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-5495.1561027436));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 3
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.6903781197123503E-8, 761.0137994114406, (-5.056512677995137E101), 296.2);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setControlFactors((-5.056512677995137E101), 1.6903781197123503E-8, 4708.5482469, (-6.447877375049486E-9));
      graggBulirschStoerIntegrator0.resetInternalState();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setOrderControl(19, 761.0137994114406, 1.0E-4);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1910), 19, 1.0E-4);
      assertEquals(761.0137994114406, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-71.05085), (-1769.006448240637), (-71.05085), (-71.05085));
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E15, 0.6, (-2345.4870459), 1193.659859);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.6, (-4719.54892));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1241.47044017, 1.0E15, (-66), (UnivariateSolver) illinoisSolver0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = (-2191.950496172);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2191.950496172), 2.0, (-2191.950496172), 2.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2.0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = 0.65;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.65;
      doubleArray0[1] = 0.65;
      doubleArray0[2] = 0.65;
      doubleArray0[3] = 0.65;
      doubleArray0[4] = 0.65;
      doubleArray0[5] = 564.54613026219;
      doubleArray0[6] = 0.65;
      doubleArray0[7] = 0.65;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.65, 0.65, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInitialStepSize(0.65);
      boolean boolean0 = false;
      graggBulirschStoerIntegrator0.filterStep(0.65, false, false);
      double double1 = (-2.933016992001806E-10);
      graggBulirschStoerIntegrator0.setControlFactors(0.65, 0.65, 0.65, (-2.933016992001806E-10));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getSecondaryMappers();
      try { 
        expandableStatefulODE0.setPrimaryState(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 8 != 0
         //
         verifyException("org.apache.commons.math3.ode.ExpandableStatefulODE", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.5;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = 954.3933829244701;
      doubleArray0[3] = 0.5;
      doubleArray0[4] = 954.3933829244701;
      doubleArray0[5] = 954.3933829244701;
      doubleArray0[6] = (-2240.6432726);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(954.3933829244701, 0.5, doubleArray0, doubleArray0);
      double double0 = 0.0;
      graggBulirschStoerIntegrator0.setStepSizeControl(0.0, (-2114.797760549), (-2114.797760549), (-2240.6432726));
      graggBulirschStoerIntegrator0.setStepSizeControl((-2240.6432726), 0.5, 954.3933829244701, (-2114.797760549));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        expandableStatefulODE0.setCompleteState(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 != 0
         //
         verifyException("org.apache.commons.math3.ode.ExpandableStatefulODE", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-568.0914262889247), 1.0, 1322.983407132, 4147.640237054);
      int int0 = (-2146311024);
      double double0 = 557.54;
      graggBulirschStoerIntegrator0.setOrderControl((-2146311024), 1.0E-15, 557.54);
      int int1 = 1012;
      graggBulirschStoerIntegrator0.setOrderControl(1012, 1012, 1.0E-15);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-2146311024));
      int int2 = 525;
      int int3 = (-1506);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 525, (-1506), 1599.557886);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 1317);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 213.500145436);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = (-2191.950496172);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2191.950496172), 2.0, (-2191.950496172), 2.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2469).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1383.202641089;
      doubleArray0[1] = (-1633.2180485583);
      doubleArray0[2] = (-1633.2180485583);
      doubleArray0[3] = (-1633.2180485583);
      doubleArray0[4] = (-1633.2180485583);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1633.2180485583), (-1633.2180485583), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(1.7482123374938965, (-888.7), (-3172.88254879259), 1844.8785730104);
      graggBulirschStoerIntegrator0.setInitialStepSize(1383.202641089);
      graggBulirschStoerIntegrator0.setOrderControl(2145777755, (-350.0), (-1689.830353));
      graggBulirschStoerIntegrator0.setControlFactors((-1633.2180485583), 1383.202641089, 2.3250694274902344, 536);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 536, 3, (-4352.8606126));
      graggBulirschStoerIntegrator0.setOrderControl((-2146405849), (-2146405849), 536);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        expandableStatefulODE0.addSecondaryEquations((SecondaryEquations) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1112.496686565, 1112.496686565, 1112.496686565, 0.94);
      graggBulirschStoerIntegrator0.setControlFactors((-1365.09175599), 2097.6819771023897, 1112.496686565, 0.94);
      assertEquals(1112.496686565, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, 4.0430160253378594E-275);
      int int0 = 0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 0);
  }
}