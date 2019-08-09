/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 05:23:34 GMT 2019
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
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1629.1615), 0.0, 2237.02, 2237.02);
      dormandPrince54Integrator0.setSafety((-84.7917));
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals((-84.7917), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 2048.85641643, doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxGrowth((-983.02068));
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals((-983.02068), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      dormandPrince54Integrator0.setSafety(0.0);
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0, 5, (-687.65), 924.5414237);
      dormandPrince54Integrator0.setSafety(762.0);
      assertEquals(762.0, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      
      highamHall54Integrator0.setMinReduction(0.0);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.9, 609.0016604, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setMinReduction(609.0016604);
      assertEquals(609.0016604, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 3.5346080979652066E-295, 3.5346080979652066E-295, 0.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth(0.0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 4.8955889659397494E-8, 4.8955889659397494E-8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 2048.85641643, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, 924.5414237);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, (-12.214588), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, 0.01312004499419488);
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
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.06447391366379), (-1.06447391366379), doubleArray0, doubleArray0);
      highamHall54Integrator0.setMaxGrowth(7.241626420445137E-206);
      assertEquals(7.241626420445137E-206, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.06447391366379), (-1.06447391366379), doubleArray0, doubleArray0);
      highamHall54Integrator0.setMinReduction((-1.06447391366379));
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals((-1.06447391366379), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2.3848605155944824, 1290.96812010209, 1.5640296936035156, 1290.96812010209);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1660.57869);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-269.6870846566616));
      assertEquals((-269.6870846566616), expandableStatefulODE0.getTime(), 0.01);
      assertEquals(32, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-239.35811028981365), (-1096.2343486), 1549.9489561478629, 10.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1281.1357744417));
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 10.0);
      assertEquals(10.0, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1549.9489561478629, 1549.9489561478629, 1549.9489561478629, 1458.38945);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 1.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1629.1615), (-70.37631), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1660.57869);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.06447391366379), (-1.06447391366379), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1629.1615), 0.0, 2237.02, 2237.02);
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1041.7776641518865), (-1041.7776641518865), 0.9, (-1422.4648739));
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }
}
