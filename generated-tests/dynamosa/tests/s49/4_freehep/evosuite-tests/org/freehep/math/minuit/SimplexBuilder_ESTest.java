/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 17:31:48 GMT 2019
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
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 872.7773506141986);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1);
      mnFcn0.theNumCall = (-1241);
      MinimumError.MnMadePosDef minimumError_MnMadePosDef0 = new MinimumError.MnMadePosDef();
      MinimumError minimumError0 = new MinimumError((MnAlgebraicSymMatrix) null, minimumError_MnMadePosDef0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 10000.0, 830);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 830, 830);
      assertEquals((-1237), functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.05, 0.05, (-2297.14596791318), (-2297.14596791318), 0.1).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3120.102570804714);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 3120.102570804714);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(6);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 10.0, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1508, 10.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-263.29525764742));
      assertEquals(12, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, (-2001.7), (-2795.0), (-1029.0260233633082), (-397.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-962.5));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, (MnStrategy) null);
      MinimumState minimumState0 = new MinimumState(93);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, (MnStrategy) null, 93, 93);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1186.44647), (-1734.0), (-1734.0), 6.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 6.0E-7);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianStepTolerance(0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-1.0));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2085.613638));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(1094);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianStepTolerance((-2085.613638));
      MinimumState minimumState0 = new MinimumState(1094);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 85, 2.4999999999999996);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1194.0120012516068), (-1734.0), (-1734.0), 4.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setHessianNCycles(0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, 4.0);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(278.467, 278.467, 278.467, 278.467, 278.467).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.336130295205968);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianNCycles((-1103));
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(2555);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-1103), 2555);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1187.4970197116186), (-1734.0), (-1734.0), 4.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianGradientNCycles(0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, 4.0);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1.0));
      double[] doubleArray0 = new double[6];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianGradientNCycles((-1));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, (MinimumSeed) null, mnStrategy0, (-304), (-1.0));
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
      doReturn(0.0, 0.0, 0.0, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2367.0);
      double[] doubleArray0 = new double[6];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(1);
      mnStrategy0.setHessianG2Tolerance(0.0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianG2Tolerance((-118.0191));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-2070), 0.0);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, (-5107.5), 90.9).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1.0));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(56);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1890.310844237, (-3752));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setGradientTolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, (-3752), 1050.4908010639565);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2046.0, 2046.0, 716.5165877, (-812.0545108447808), 2046.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3120.102570804714);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 3120.102570804714);
      MinimumError minimumError0 = new MinimumError(0);
      mnStrategy0.setGradientTolerance((-2.0931962));
      FunctionGradient functionGradient0 = new FunctionGradient(6);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 10.0, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1508, 10.0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      mnStrategy0.setGradientStepTolerance(0.0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1, 0.0);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1334.7747, 1334.7747, 1334.7747, 1334.7747, (-1148.265088832291)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0E-35);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setGradientStepTolerance((-2440.09302));
      MinimumParameters minimumParameters0 = new MinimumParameters(56);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1.0E-35, 56);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 56, 56);
      assertEquals(59, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1186.44647), (-1734.0), (-1734.0), 6.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 6.0E-7);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setGradientNCycles(0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, 6.0E-7);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2367.0);
      MinimumState minimumState0 = new MinimumState(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-2779));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1, 2367.0);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnStrategy mnStrategy0 = new MnStrategy();
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, (GradientCalculator) null, (MinimumSeed) null, mnStrategy0, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(27);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(1375);
      MinimumError minimumError0 = new MinimumError(100);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(27);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0, mnAlgebraicVector0, mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 1375, 1375);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 100, 612.38442025122);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (-534.3165247)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, 8.0);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (-726.5176426018277), (-726.5176426018277)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, 0);
      assertEquals((-726.5176426018277), functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-865.325038742108), (-865.325038742108), (-865.325038742108), (-1.0), (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0E-35);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(56);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1.0E-35, 56);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 56, 56);
      assertEquals(864.325038742108, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator((MnFcn) null, mnUserTransformation0, mnStrategy0);
      mnUserTransformation0.setPrecision(0);
      MinimumState minimumState0 = new MinimumState(375);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }
}