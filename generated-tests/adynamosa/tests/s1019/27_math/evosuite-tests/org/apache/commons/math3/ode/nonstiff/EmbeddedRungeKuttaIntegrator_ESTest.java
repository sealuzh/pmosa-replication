/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 04:37:14 GMT 2019
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2.4439696075216986E-307, 2.4439696075216986E-307, 2.4439696075216986E-307, 0.875);
      highamHall54Integrator0.getOrder();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      
      dormandPrince54Integrator0.setMinReduction(0.0);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-3758.0451), (-3758.0451), doubleArray0, doubleArray0);
      highamHall54Integrator0.setMinReduction((-3758.0451));
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals((-3758.0451), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2.2950686306677644E-244, 2.2950686306677644E-244, 2.2950686306677644E-244, 2400.11446);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(2400.11446);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-404.5486005), 0.03266380727291107, 0.03266380727291107, 280.85231181);
      highamHall54Integrator0.setSafety((-404.5486005));
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals((-404.5486005), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 10.0, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setMaxGrowth(187.52765);
      assertEquals(187.52765, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2.2950686306677644E-244, 2.2950686306677644E-244, 2.2950686306677644E-244, 2400.11446);
      dormandPrince853Integrator0.setMaxGrowth((-1445.01471492177));
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals((-1445.01471492177), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 2557.5430461833, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(583).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.5830993332061267E-10, (-0.3266380727291107), (-0.3266380727291107), 1.5830993332061267E-10);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((ExpandableStatefulODE) null, (-0.3266380727291107));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      dormandPrince54Integrator0.setSafety(0.0);
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.0), 0.0, 0.0, 0.0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(0.0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2.10770182066344E-8), (-2.10770182066344E-8), 481.40981, (-2.10770182066344E-8));
      highamHall54Integrator0.setMinReduction(2877.7);
      assertEquals(2877.7, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.17431432008743286, (-1.0), (-1090.9), 0.2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-270.7927394086731));
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-404.5486005), 12.159623735575172, 12.159623735575172, 280.85231181);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(130).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-404.5486005));
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, 5.911);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (4.05E02) reached, integration needs 1.22E02
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-270.6184250885857));
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-392.38897676442485), 10.0, 0.0, (-151.81032129));
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-270.7927394086731));
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-286.728), (-737.51), 10.0, 4.363736368635843E-9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(81).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-270.7927394086731));
      highamHall54Integrator0.integrate(expandableStatefulODE0, 112.00882458);
      assertEquals(112.00882458, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.17431432008743286, (-1.0), (-1090.9), 0.2);
      double[] doubleArray0 = new double[0];
      highamHall54Integrator0.vecAbsoluteTolerance = doubleArray0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-326.7520978258));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(481.40981, 0.0, 481.40981, 47.571);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.17431432008743286, (-1.0), (-1090.9), 0.2);
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2.10770182066344E-8), (-2.10770182066344E-8), 481.40981, (-2.10770182066344E-8));
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }
}
