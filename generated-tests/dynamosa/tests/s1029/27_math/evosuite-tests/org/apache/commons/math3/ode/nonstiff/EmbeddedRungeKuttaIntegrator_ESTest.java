/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 22:44:24 GMT 2019
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
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-1272.42112), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setSafety((-1272.42112));
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals((-1272.42112), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-881.8059147453598), 1358.0824177, 1358.0824177, (-881.8059147453598));
      dormandPrince54Integrator0.getOrder();
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2794.552, 836.8433800842142, (-2833.0), 10.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth((-2833.0));
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals((-2833.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2738.52), (-2738.52), 0.0, 0.0);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      
      highamHall54Integrator0.setSafety(0.0);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1465.028428), (-1465.028428), (-1465.028428), 0.0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction(0.0);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1.0), 2.2979817390441895, (-1.0), 2.2979817390441895);
      dormandPrince853Integrator0.setMinReduction(1146.428753710437);
      assertEquals(1146.428753710437, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1465.028428), (-1465.028428), (-1465.028428), 0.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth(0.0);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-1272.42112), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-573.9));
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
      double[] doubleArray0 = new double[1];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1893.053624514, 1893.053624514, doubleArray0, doubleArray0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1893.053624514);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 1
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2929.7820281656172), (-3053.893065598651), (-3053.893065598651), (-2929.7820281656172));
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((ExpandableStatefulODE) null, (-3053.893065598651));
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
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.742885956093543E-8), (-1.742885956093543E-8), (-1.742885956093543E-8), (-1.742885956093543E-8));
      dormandPrince54Integrator0.setSafety(5);
      assertEquals(5.0, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.742885956093543E-8), (-1.742885956093543E-8), (-1.742885956093543E-8), (-1.742885956093543E-8));
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(2317.0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1464.8910140828086), (-1464.8910140828086), (-1464.8910140828086), (-1464.8910140828086));
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction((-1464.8910140828086));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals((-1464.8910140828086), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1894.15991), doubleArray0, 2794.6412344734, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 2830.7001023650723, (-1713.144073902), (-1.0E-6));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1713.144073902));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1464.8910140828086), (-1464.8910140828086), (-1464.8910140828086), (-1464.8910140828086));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1464.8910140828086));
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1.0);
      assertEquals(1.0, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(32, dormandPrince853Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1464.8910140828086), (-1464.8910140828086), (-1464.8910140828086), (-1464.8910140828086));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-1272.42112), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-3.0498741599744685E-9), (-3.0498741599744685E-9), (-3.0498741599744685E-9), (-3.0498741599744685E-9));
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }
}
