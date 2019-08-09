/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 01:24:58 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, 2, (-985.67608359331), (-985.67608359331), 0.0);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 142.9549111, 2316.37253, (-728.23), 0.0);
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-236.272244));
      adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(21, adamsMoultonIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2054.86264248, 0.0, 2054.86264248, (-1675.0));
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      
      adamsMoultonIntegrator0.setMinReduction(0.0);
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2054.86264248, 0.0, (-48.464508186881), (-1675.0));
      adamsMoultonIntegrator0.setMaxGrowth((-2215.62963));
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals((-2215.62963), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2.0, 2.6869297963554945E-8, 0.9, 844.407628609015);
      adamsMoultonIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-353.0), 2.0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2527.43387, 0.0, doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setStarterIntegrator(graggBulirschStoerIntegrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, (-985.67608359331), (-985.67608359331), 0.0);
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 0.0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsMoultonIntegrator0.getStarterIntegrator();
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-985.67608359331));
      adamsMoultonIntegrator0.setStarterIntegrator(dormandPrince853Integrator0);
      assertEquals(61, adamsMoultonIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, (-985.67608359331), (-985.67608359331), 0.0);
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-2902.37060552787));
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 0.0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsMoultonIntegrator0.getStarterIntegrator();
      adamsMoultonIntegrator0.setStarterIntegrator(dormandPrince853Integrator0);
      assertEquals(69, adamsMoultonIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 630.0, (-1247.25234), (-1247.25234));
      adamsMoultonIntegrator0.setSafety(630.0);
      assertEquals(630.0, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 0.0, 612.64, (-0.43871048990761286), 0.0);
      adamsBashforthIntegrator0.setSafety((-0.43871048990761286));
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals((-0.43871048990761286), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 630.0, (-1247.25234), (-1247.25234));
      adamsMoultonIntegrator0.setMinReduction((-1247.25234));
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals((-1247.25234), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 0.0, 0.0, (-48.464508186881), (-48.464508186881));
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      
      adamsMoultonIntegrator0.setMaxGrowth(0.0);
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 0.0, (-1247.25234), (-1247.25234));
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      
      adamsMoultonIntegrator0.setSafety(0.0);
      assertEquals(0.0, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 0.0, (-1247.25234), (-1247.25234));
      adamsMoultonIntegrator0.setMinReduction(2.161656025361765E166);
      assertEquals(2.161656025361765E166, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2054.86264248, 0.0, 2054.86264248, (-1675.0));
      adamsMoultonIntegrator0.setMaxGrowth(220.336695942108);
      assertEquals(220.336695942108, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2054.86264248, 0.0, (-48.464508186881), (-1675.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 2054.86264248);
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
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(3, 3, 630.0, (-1247.25234), (-1247.25234));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 2861.8153);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = null;
      try {
        adamsBashforthIntegrator0 = new AdamsBashforthIntegrator((-218), 0.0, 0.9, 12.234773183206, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least -218 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-4.983281844744412E-8), (-1379.8), doubleArray0, doubleArray0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      
      adamsBashforthIntegrator0.setSafety(0.0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 0.0, 612.64, (-0.43871048990761286), 0.0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-1247.25234), 2, 2053.0, 2);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2054.86264248, 0.0, (-48.464508186881), (-1675.0));
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals(1.2599210498948732, double0, 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2054.86264248, 0.0, (-48.464508186881), (-1675.0));
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(2054.86264248, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }
}
