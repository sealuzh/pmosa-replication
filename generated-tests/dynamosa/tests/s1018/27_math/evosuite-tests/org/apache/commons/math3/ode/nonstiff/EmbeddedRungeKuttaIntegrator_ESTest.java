/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 03:53:04 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedRungeKuttaIntegrator_ESTest extends EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1548.85), (-1548.85), (-1548.85), (-1548.85));
      dormandPrince853Integrator0.setSafety((-1061.14));
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals((-1061.14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1477.8), (-1477.8), (-1477.8), (-1477.8));
      dormandPrince54Integrator0.getOrder();
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-243.25365552800034), (-243.25365552800034), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMaxGrowth((-243.25365552800034));
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals((-243.25365552800034), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-164.9640152176), 1950.6933839, 0.0, 911.75);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(0.0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1477.8233587873), 463.44884, (-338.26), (-1477.8233587873));
      dormandPrince853Integrator0.setSafety(0.03643739968538284);
      assertEquals(0.03643739968538284, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 1201.0376067683, 0.0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction(0.0);
      assertEquals(0.0, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1443.2745460715), 986.46374841158, 0.0);
      highamHall54Integrator0.setMinReduction(2536.4280474292586);
      assertEquals(2536.4280474292586, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      highamHall54Integrator0.setMaxGrowth(0.0);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1443.2745460715), 986.46374841158, 0.0);
      highamHall54Integrator0.setMaxGrowth(5);
      assertEquals(5.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1477.8233587873), 463.44884, (-338.26), (-1477.8233587873));
      dormandPrince853Integrator0.setMaxEvaluations(2572);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, (double) 2572);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (2,572) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-226.83480534551825), (-226.83480534551825), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1376).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-226.83480534551825));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,752 != 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1477.8), (-1477.8), (-1477.8), (-1477.8));
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((ExpandableStatefulODE) null, (-1477.8));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-228.06021981), (-228.06021981), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMinReduction((-2133));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals((-2133.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(190).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1477.7676008300969));
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1477.7676008300969), 2615.54159, (-1918.9458830915646), (-3.015709444206057E-226));
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-3.015709444206057E-226));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-228.06021981), (-353.28587987), 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.670170240686275E-5);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
      assertEquals(8, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(574.7211, 0.0, 574.7211, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(574.7211);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 2615.54159);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-659.5347862987404), (-659.5347862987404), (-659.5347862987404), (-659.5347862987404));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-285.8));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-228.06021981), (-228.06021981), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-228.06021981));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-228.06021981), (-228.06021981), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(6.23514943204966E27, 6.23514943204966E27, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-228.06021981), (-353.28587987), 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }
}
