/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 23:21:56 GMT 2019
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
      double[] doubleArray0 = new double[10];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-311.1501016273), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.getOrder();
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2.5238394737243652, 2.5238394737243652, 2.5238394737243652, 2.5238394737243652);
      dormandPrince54Integrator0.setMaxGrowth((-35.0));
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals((-35.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1078.996997, 1078.996997, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setSafety(4069.28238891);
      assertEquals(4069.28238891, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1404.86116), doubleArray0, doubleArray0);
      highamHall54Integrator0.setSafety((-3384.07));
      assertEquals((-3384.07), highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction(0.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.982919692993164, 1.982919692993164, 1.982919692993164, 2.8332008343480686E-9);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.setMinReduction(1.982919692993164);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-311.1501016273), doubleArray0, doubleArray0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(0.0);
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-311.1501016273), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1295.87869065), 1.0, (-1295.87869065), 1.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1404.86116));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 10.0, 10.0, 10.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      dormandPrince853Integrator0.setMaxEvaluations(0);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 10.0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 10.0, 10.0, 10.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(10.0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 10.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.52828095221751, 10.52828095221751, 10.52828095221751, 10.52828095221751);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, 10.52828095221751);
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.982919692993164, 1.982919692993164, 1.982919692993164, 2.8332008343480686E-9);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(0.0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2.5238394737243652, 2.5238394737243652, 2.5238394737243652, 2.5238394737243652);
      dormandPrince54Integrator0.setMaxGrowth(0.9);
      assertEquals(0.9, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1950.820650798, 997.064984698863, (-2783.4063345), 4035.957760180091);
      dormandPrince853Integrator0.setMinReduction((-1496.291495));
      assertEquals((-1496.291495), dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-900.465161), (-900.465161), (-900.465161), (-25.819));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(35).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-900.465161));
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-25.819));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-900.465161), (-900.465161), (-900.465161), (-25.819));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-900.465161));
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-25.819));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1054.371, 1054.371, 1054.371, 1054.371);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 1054.371);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-311.1501016273), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1950.820650798, 997.064984698863, (-2783.4063345), 4035.957760180091);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1404.86116), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }
}
