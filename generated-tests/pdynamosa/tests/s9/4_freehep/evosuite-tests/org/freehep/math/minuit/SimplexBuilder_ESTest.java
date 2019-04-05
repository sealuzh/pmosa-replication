/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:14:29 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.AnalyticalGradientCalculator;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FCNGradientBase;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.GradientCalculator;
import org.freehep.math.minuit.HessianGradientCalculator;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.freehep.math.minuit.Numerical2PGradientCalculator;
import org.freehep.math.minuit.SimplexBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexBuilder_ESTest extends SimplexBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1171.95409246463, 1171.95409246463, 1171.95409246463).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1171.95409246463);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnFcn0.theNumCall = (-3174);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 1171.95409246463);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1120.58468, (-1820.07005), 8.0, (-1820.07005), 3579.01872847).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2168.630951709656), 0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(1);
      simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 0.0);
      simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, 880.64496033);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 405, (-2168.630951709656));
      assertEquals(9, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-857.5902688424393));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, (MnStrategy) null);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 10000.0, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, (MnStrategy) null, 7, 4084.994180109846);
      assertTrue(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MinimumState minimumState0 = new MinimumState(3);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator((MnFcn) null, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianStepTolerance(0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-3142), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      MinimumState minimumState0 = new MinimumState(0);
      mnStrategy0.setHessianStepTolerance((-645.06370957631));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator((MnFcn) null, mnUserTransformation0, mnStrategy0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1, (-3273.80926));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 1744.2426204785502, 2712.067695).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianNCycles(0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 1814.65778965667);
      assertEquals(1814.65778965667, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-681.848), 1915.0, 1915.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianNCycles((-947));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 1814.65778965667);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 3175.042033244153, 3175.042033244153).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianGradientNCycles(0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 1814.65778965667);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1.0));
      MnStrategy mnStrategy0 = new MnStrategy(335);
      mnStrategy0.setHessianGradientNCycles((-3274));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, (MinimumSeed) null, mnStrategy0, (-2146757901), 335);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 1122.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setHessianG2Tolerance(0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 2651, 4243.0);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1269.08389290391), 1814.65778965667, (-1269.08389290391)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianG2Tolerance((-2790.51947503));
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 1814.65778965667);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 2.4999999999999996, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(3);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setGradientTolerance(0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 263, 0.02);
      assertEquals(6, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2195.274876);
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, (MnUserTransformation) null, true);
      MinimumParameters minimumParameters0 = new MinimumParameters(6);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 6, 6);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      MnStrategy mnStrategy0 = new MnStrategy(2);
      mnStrategy0.setGradientTolerance((-3757.6));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, (-3904), 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 3175.042033244153, 3175.042033244153).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setGradientStepTolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 0.5);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-556.98789855));
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, true);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2043);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-556.98789855));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-556.98789855), 2043);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(2043);
      mnStrategy0.setGradientStepTolerance((-556.98789855));
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 2043, (-556.98789855));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1081.12313009412);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, (MnUserTransformation) null, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(2892);
      double[] doubleArray0 = new double[3];
      mnStrategy0.setGradientNCycles(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 2892, 1479.455123429);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(5);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator((MnFcn) null, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      mnStrategy0.setGradientNCycles((-3866));
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1107.4679197));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-1107.4679197), 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-1), 1917.2287779);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1128.7725122574), (-1128.7725122574), (-2364.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2879.96));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-2879.96));
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-853.293362907), (-1122.0529), (-2228.52629574), (-2228.52629574)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-2228.52629574));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-853.293362907), (-1122.0529), (-1122.0529), (-1122.0529)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1814.65778965667);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-1122.0529));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.8421709430404007E-14, (-800.577258074), (-2920.50153662), (-539.1), 1.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 338.90998);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(3);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 443, 338.90998);
      assertEquals(2920.50153662, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1743.2426204785502), (-1743.2426204785502), 801.077258074, 1.0, 1.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 338.90998);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(3);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1853, 338.90998);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, false);
      mnUserTransformation0.setPrecision((-125.01));
      MinimumState minimumState0 = new MinimumState(5);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 5, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }
}