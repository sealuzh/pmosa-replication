/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:18:51 GMT 2019
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.6149279479975042E-9), 1.7534012237555307E-252, 0.0, 1.7534012237555307E-252);
      highamHall54Integrator0.getOrder();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(0.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-297.98056612197), (-297.98056612197), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setSafety((-297.98056612197));
      assertEquals((-297.98056612197), dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-4394.952), (-4394.952), doubleArray0, doubleArray0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction(0.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 1911.87, 0.0, 1.0);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      
      highamHall54Integrator0.setMinReduction(1.0);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 10.0, 2638.883319598592, 3039.62);
      dormandPrince853Integrator0.setMaxGrowth(0.0);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 1911.87, 0.0, 1.0);
      highamHall54Integrator0.setMaxGrowth(1911.87);
      assertEquals(1911.87, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 3013.653636);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(602).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-310.211111));
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3013.653636);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
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
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((ExpandableStatefulODE) null, 1.0);
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
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.2, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setSafety(0.2);
      assertEquals(0.2, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.2, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setMaxGrowth((-63.49269097));
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals((-63.49269097), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 10.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMinReduction((-1347.0));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals((-1347.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1190).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1190);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1190, 1190, (-310.211111), 1060.86635);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 1060.86635);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[0];
      dormandPrince853Integrator0.setStepSizeControl(0.0, 3.7734658676841284E20, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-4845.1138747718), (-4845.1138747718), (-963.6528601), (-2079.24954));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-4845.1138747718));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 4.455504920700703E157);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 2541.72285313, (-638.523967), 2541.72285313);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (double) 1);
      assertEquals(1.0, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 10.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.2, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.2, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }
}