/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 03:20:38 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
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
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-646.07076166), 2566.34, doubleArray0, doubleArray0);
      highamHall54Integrator0.setSafety((-207.542));
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals((-207.542), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.3057724436551892E-9, 1.3057724436551892E-9, 1.3057724436551892E-9, 1.3057724436551892E-9);
      highamHall54Integrator0.getOrder();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-222.89165750273983), (-222.89165750273983), 56.8926694213, 56.8926694213);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      
      highamHall54Integrator0.setSafety(0.0);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      
      dormandPrince54Integrator0.setMinReduction(0.0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.setMinReduction(2148.667845933);
      assertEquals(2148.667845933, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(0.0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.3057724436551892E-9, 1.3057724436551892E-9, 1.3057724436551892E-9, 1.3057724436551892E-9);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      highamHall54Integrator0.setMaxGrowth(1.3057724436551892E-9);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1685.327683251277, (-1.2479264502054702E-8), doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxEvaluations(686);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, (-2235.4552));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (686) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(754).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(754, 754, doubleArray0, doubleArray0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, 6.999732437141968E-10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1,508 != 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.3057724436551892E-9, 1.3057724436551892E-9, 1.3057724436551892E-9, 1.3057724436551892E-9);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate((ExpandableStatefulODE) null, (-1235.65));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-222.89165750273983), (-222.89165750273983), 56.8926694213, 56.8926694213);
      highamHall54Integrator0.setSafety(25.1);
      assertEquals(25.1, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.7645702540162507), (-1.7645702540162507), (-1.7645702540162507), (-1.7645702540162507));
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      highamHall54Integrator0.setMaxGrowth((-1.7645702540162507));
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals((-1.7645702540162507), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-3452.176691), (-2117.1957568), (-3452.176691), (-2117.1957568));
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction((-2117.1957568));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals((-2117.1957568), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1469.0), (-1469.0), (-1469.0), (-1469.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1469.0));
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-2610.114));
      assertEquals(8, highamHall54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1469.0), (-1469.0), (-1469.0), (-1469.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1469.0));
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-379.82770945));
      assertEquals(8, highamHall54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.7645702540162507), (-1.7645702540162507), (-1.7645702540162507), (-1.7645702540162507));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(124).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1.7645702540162507));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1257.24798602), (-1257.24798602), 1647.3748880056075, (-1235.65));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-1257.24798602));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-730.382462296871), 1685.327683251277, doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-730.382462296871), doubleArray0, 1685.327683251277, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(967.02980428404, 2590.884, 10.0, 3345.209822950048);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1369.34, 1369.34, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1469.0), (-1469.0), (-1469.0), (-1469.0));
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }
}
