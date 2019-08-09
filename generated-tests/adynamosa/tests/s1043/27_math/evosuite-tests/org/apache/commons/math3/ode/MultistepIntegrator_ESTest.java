/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:15:35 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.ODEIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(4125.3681284);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, (-1239.22383746), 1954.20659, 4211.1381167, 726.988758505);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 726.988758505);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 0.0, 0.0, doubleArray0, doubleArray0);
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.0, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(4125.3681284);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, 6.0, 1954.20659, 4211.1381167, 6.0);
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 6.0);
      adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(87, adamsMoultonIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, 6, (-1087.85398817), doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setSafety((-1087.85398817));
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals((-1087.85398817), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction((-1.0));
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2.5786490440368652, 0.9, doubleArray0, doubleArray0);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      
      adamsMoultonIntegrator0.setMaxGrowth(0.0);
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, (-1087.85398817), 0.0, 869.93, (-1.0));
      adamsMoultonIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.1040895136738123, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, (-3201.082889), 0.36426329612731934, doubleArray0, doubleArray0);
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(6);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, (-3201.082889), doubleArray0);
      adamsBashforthIntegrator0.setStarterIntegrator(midpointIntegrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.122462048309373, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 0.0, 1.0, doubleArray0, doubleArray0);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1.0, 0.9, doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setStarterIntegrator(adamsMoultonIntegrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, 6, (-1087.85398817), doubleArray0, doubleArray0);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      
      adamsMoultonIntegrator0.setSafety(0.0);
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1.0, 0.9, doubleArray0, doubleArray0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction(0.0);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 0.0, 1.0, doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMinReduction(774.74307);
      assertEquals(774.74307, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 3335.884137707, doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMaxGrowth(3335.884137707);
      assertEquals(3335.884137707, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, 6, (-1087.85398817), doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMaxGrowth((-1087.85398817));
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals((-1087.85398817), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 3335.884137707, doubleArray0, doubleArray0);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      
      adamsMoultonIntegrator0.setSafety(1);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(6, 6, (-1087.85398817), doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1087.85398817), (-1087.85398817), 0.0, 6);
      adamsMoultonIntegrator0.setStarterIntegrator(graggBulirschStoerIntegrator0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      adamsMoultonIntegrator0.setStepSizeControl((-1239.22383746), 2187.1414, 2187.1414, (-1452.5068521));
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-1087.85398817));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = null;
      try {
        adamsBashforthIntegrator0 = new AdamsBashforthIntegrator((-2128), (-3639.2012462301), 6, (-3639.2012462301), 0.36426329612731934);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least -2,128 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1.0, 0.9, doubleArray0, doubleArray0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1.0, 0.9, doubleArray0, doubleArray0);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(9, 0.0, (-600.439390038464), (-600.439390038464), 1130.29);
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(1.0717734625362931, double0, 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, (-1087.85398817), (-956.257127), (-1087.85398817), 0.0);
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1019.935355462755, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.122462048309373, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }
}
