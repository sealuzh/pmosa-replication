/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 11:43:35 GMT 2019
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
import org.freehep.math.minuit.FunctionGradient;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.GradientCalculator;
import org.freehep.math.minuit.HessianGradientCalculator;
import org.freehep.math.minuit.MinimumError;
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1297.23147));
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, (MnStrategy) null);
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnFcn0.theNumCall = (-216);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, (MnStrategy) null, (-456), 0.2);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, true);
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 1148, 0.02);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5000000000000004);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1330.7752800933574, 503);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 503, 0);
      assertTrue(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 10.0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, (MinimumSeed) null, mnStrategy0, 3282, 10.0);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5000000000000004);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1330.7752800933574, 503);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setHessianStepTolerance(0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 519, 2.5000000000000004);
      assertEquals(2.5000000000000004, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-262.22270557));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianStepTolerance((-262.22270557));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, (MinimumSeed) null, mnStrategy0, 5, 3364.51);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1925.71));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      mnStrategy0.setHessianNCycles(0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, (-494), (-2469.6042));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3076.656214137, 3076.656214137, (-925.804059), (-2911.6126145223748), (-2911.6126145223748)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2911.6126145223748));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianNCycles((-993));
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1477, (-2911.6126145223748));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1925.71));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      mnStrategy0.setHessianGradientNCycles(0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 3, 0.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3076.656214137, 3076.656214137, (-925.80405892), (-2911.6126145223748), (-2911.6126145223748)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2911.6126145223748));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, false);
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      mnStrategy0.setHessianGradientNCycles((-1298));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 2, (-1907.7940256));
      assertEquals(6, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3566.92848416049), (-2612.0), (-3566.92848416049), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 884.2681561544);
      double[] doubleArray0 = new double[11];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-4251.2), 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianG2Tolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 530, (-385.853091187));
      assertEquals(7, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1925.71));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      mnStrategy0.setHessianG2Tolerance((-494));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, (-494), (-2469.6042));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-108.88173224981145), (-108.88173224981145), (-5224.88519414), (-108.88173224981145), (-108.88173224981145)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1909.64);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator((FCNGradientBase) null, mnUserTransformation0, true);
      MinimumState minimumState0 = new MinimumState(3);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientTolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, (-776), 2);
      assertEquals(6, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-108.88173224981145), (-108.88173224981145), (-5224.88519414), (-108.88173224981145), (-108.88173224981145)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1909.64);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator((FCNGradientBase) null, mnUserTransformation0, true);
      MinimumState minimumState0 = new MinimumState(3);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientTolerance((-1938.763408034));
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 4411, 4009.38);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1925.71));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      mnStrategy0.setGradientStepTolerance(0.0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 232, 2220.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1925.71));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      mnStrategy0.setGradientStepTolerance((-1925.71));
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, (-494), (-2469.6042));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MinimumSeed", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2911.6126145223748));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator((FCNGradientBase) null, mnUserTransformation0, false);
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      mnStrategy0.setGradientNCycles(0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 72, 2);
      assertEquals((-2911.6126145223748), functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2911.6126145223748));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator((FCNGradientBase) null, mnUserTransformation0, false);
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      mnStrategy0.setGradientNCycles((-1));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 72, 2);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator((MnFcn) null, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(803);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 180, 180);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-98.892137337), (-98.892137337), (-5224.88519414), (-98.892137337), (-98.892137337)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1909.64);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator((FCNGradientBase) null, mnUserTransformation0, true);
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 2721, 2721);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 884.2681561544);
      double[] doubleArray0 = new double[6];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 611.8617246312361, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-3566.92848416049), (-3464.8403112636283)).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, (-2612.0));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 884.2681561544);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2052.15742059716, 0.5, 5100.5814168, 662.2013950699, 662.2013950699).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3076.656214137);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(7);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(7);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 3076.656214137);
      MinimumError minimumError0 = new MinimumError(7);
      FunctionGradient functionGradient0 = new FunctionGradient(7);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, (-678.874), 7);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(9, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, (-42.71050909), (-42.71050909), 3593.143013958, 3593.143013958).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1.0));
      double[] doubleArray0 = new double[6];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnUserTransformation0.setPrecision((-1.0));
      MnStrategy mnStrategy0 = new MnStrategy(5486);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(5486);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-1.0), 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-1), 2468.2418456);
  }
}
