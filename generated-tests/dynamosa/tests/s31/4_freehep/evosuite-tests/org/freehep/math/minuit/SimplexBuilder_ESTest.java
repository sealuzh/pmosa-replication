/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:57:24 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FunctionGradient;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.GradientCalculator;
import org.freehep.math.minuit.HessianGradientCalculator;
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
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
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.05);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy((-1200));
      mnFcn0.theNumCall = (-1200);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-1200), 0.05);
      assertEquals((-1196), functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(8.0, 8.0, 8.0, 8.0, 0.2).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 139.112488);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(1444);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 139.112488);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(5);
      MinimumError.MnInvertFailed minimumError_MnInvertFailed0 = new MinimumError.MnInvertFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnInvertFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0, mnAlgebraicVector0, mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 699.13963971, 5);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-718), 0.5);
      assertEquals(8, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1449.117095446));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 612.42);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 436.38937, 1519);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 2, 0.0);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianStepTolerance(0);
      MinimumState minimumState0 = new MinimumState(83);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, (-1773.810244));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-475.51523243));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(873);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(873);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-475.51523243));
      mnStrategy0.setHessianStepTolerance((-475.51523243));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-475.51523243), (-26));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 873, 804.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.05);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy((-1200));
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianNCycles(0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-1200), 0.05);
      assertEquals(0.05, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-804.8162210533693), 3093.7069364258, 1430.7415).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.05);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy((-1200));
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianNCycles((-1200));
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-1200), 0.05);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianGradientNCycles(0);
      MinimumState minimumState0 = new MinimumState(83);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, (-1773.810244));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.05);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy((-1200));
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setHessianGradientNCycles((-1200));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-1200), 0.05);
      assertEquals(0.05, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1832.6478691764), 0.0, 1703.4013128623922, (-1832.6478691764)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2789.0044));
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianG2Tolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(1832.6478691764, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-475.51523243));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(873);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianG2Tolerance((-475.51523243));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(873);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-475.51523243));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-475.51523243), (-26));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 873, 804.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-978.49072));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setGradientTolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1, (-603.0));
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(441);
      mnStrategy0.setGradientTolerance((-1111.0026959764364));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(292);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-481), (-1535.959418627));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumState minimumState0 = new MinimumState(19);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(19);
      mnStrategy0.setGradientStepTolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 19, 19);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy((-870));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setGradientStepTolerance((-870));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, (MinimumSeed) null, mnStrategy0, (-870), 774.2042140995);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2604.10899306));
      MnStrategy mnStrategy0 = new MnStrategy(788);
      mnStrategy0.setGradientNCycles((-3530));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, (MinimumSeed) null, mnStrategy0, (-1), 134.265606659807);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnStrategy mnStrategy0 = new MnStrategy((-968));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, (GradientCalculator) null, (MinimumSeed) null, mnStrategy0, 3, (-968));
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
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, 103.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(7);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(4);
      MinimumError.MnInvertFailed minimumError_MnInvertFailed0 = new MinimumError.MnInvertFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnInvertFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 4, 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-1251.8));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(113.51092242656, 827.02, 827.02, 113.51092242656).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2032.62954);
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 6, 6);
      assertEquals(113.51092242656, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2032.62954);
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 6, 1);
      assertTrue(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(192.5221, 192.5221, 192.5221, 192.5221, 192.5221).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2032.62954);
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 6, 1);
      assertEquals(192.5221, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, (-9.639466979490507), (-9.639466979490507)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 0.0);
      assertEquals(0.0, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-864.580507145961), (-864.580507145961), (-1228.2372061207718), (-1228.2372061207718), (-864.580507145961)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1228.2372061207718));
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(5, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(19);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)19, (double)19, 1301.7552054121, 1.0, 1.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1920.5897928105946);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, (MnStrategy) null);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, (MnStrategy) null, 19, 19);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)1, 0.1, 737.6835801477354, (-978.49072), (-978.49072)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2781.55));
      simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 15.0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1, 0.0);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.setPrecision((-1597.34478914551));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 0.0);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }
}