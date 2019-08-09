/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 06:35:27 GMT 2019
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
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, 3038.26718158, 3038.26718158, 6, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(6);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      adamsBashforthIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 2);
      assertEquals(2.0, expandableStatefulODE0.getTime(), 0.01);
      
      adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-0.9980804203270616));
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 2);
      adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(19, adamsBashforthIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 0.0, 257.61115476312, (-1645));
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(2.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2);
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(2.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(6.65184625324672, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(2);
      eulerIntegrator0.setMaxEvaluations(0);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(3, 0.255429208278656, (-1645), 0, 0.255429208278656);
      adamsMoultonIntegrator0.setStarterIntegrator(eulerIntegrator0);
      adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(1.189207115002721, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 2.0);
      assertEquals(2.0, expandableStatefulODE0.getTime(), 0.01);
      
      adamsBashforthIntegrator0.setStarterIntegrator(dormandPrince853Integrator0);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1.0));
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (-0.33482908658653676));
      adamsBashforthIntegrator0.setStarterIntegrator(dormandPrince853Integrator0);
      assertEquals(0.6651709134134632, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 0.0, 257.61115476312, (-1645));
      adamsBashforthIntegrator0.setStarterIntegrator(adamsBashforthIntegrator0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(3.6474227211132852, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2);
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.0);
      adamsBashforthIntegrator0.setStarterIntegrator(dormandPrince853Integrator0);
      assertEquals(2.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      
      adamsBashforthIntegrator0.setSafety(0.0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 0.0, 257.61115476312, (-1645));
      adamsBashforthIntegrator0.setSafety((-1392.394309366301));
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals((-1392.394309366301), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      adamsBashforthIntegrator0.setMinReduction(691.3337587852);
      assertEquals(691.3337587852, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      adamsBashforthIntegrator0.setMinReduction((-129.6500274));
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals((-129.6500274), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(9, (-6.65184625324672), 9, 9, (-6.65184625324672));
      adamsBashforthIntegrator0.setMaxGrowth(213.26607286);
      assertEquals(213.26607286, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(3, 0.0, 2.0, doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMaxGrowth((-4964.2156));
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals((-4964.2156), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      adamsBashforthIntegrator0.setSafety(0.3297532796859741);
      assertEquals(0.3297532796859741, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction(0.0);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 0.0, 257.61115476312, (-1645));
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      
      adamsBashforthIntegrator0.setMaxGrowth(0.0);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 2.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(7, 7, 7, 7, 2.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = null;
      try {
        adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 0.9, 1.3004305362701416, 0.0, 1.3157594203948975);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least 1 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-6.65184625324672), 2, 2, (-6.65184625324672));
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 0.0, 257.61115476312, (-1645));
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, double0, 0.01);
  }
}
