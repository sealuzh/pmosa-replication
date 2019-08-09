/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 03:31:42 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.ODEIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(2.0, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, (-523.64), 1946.5269, 1.0, 0.0);
      adamsMoultonIntegrator0.setSafety((-1086.0));
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals((-1086.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, 6, 2.427152633666992, doubleArray0, doubleArray0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction(0.0);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, 0.0, (-1015.9656148), doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setMinReduction((-1015.9656148));
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals((-1015.9656148), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      adamsBashforthIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      adamsBashforthIntegrator0.setMaxEvaluations(0);
      adamsBashforthIntegrator0.setStarterIntegrator(adamsBashforthIntegrator0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      AdamsBashforthIntegrator adamsBashforthIntegrator1 = new AdamsBashforthIntegrator(2, 0, 0.0, 1753.450622228, 812.84671937327);
      adamsBashforthIntegrator0.setStarterIntegrator(adamsBashforthIntegrator1);
      assertEquals(0.2, adamsBashforthIntegrator1.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator1.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator1.getSafety(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      
      adamsBashforthIntegrator0.setSafety(0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      
      adamsBashforthIntegrator0.setSafety(2);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      adamsBashforthIntegrator0.setMinReduction(1561.34752418);
      assertEquals(1561.34752418, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      
      adamsBashforthIntegrator0.setMaxGrowth(0.0);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, 6, 2.427152633666992, doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setMaxGrowth(1.4635417461395264);
      assertEquals(1.4635417461395264, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      adamsBashforthIntegrator0.setMaxGrowth((-523.64));
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals((-523.64), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(9, (-300.5), (-408.36), 1179.0, (-408.36));
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = null;
      try {
        adamsMoultonIntegrator0 = new AdamsMoultonIntegrator((-3442), 6.0, 2.427152633666992, 2.427152633666992, (-3442));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least -3,442 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-523.64), 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2.0, 0.0, 0.5261374711990356, 1288.26821915427);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(2.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }
}
