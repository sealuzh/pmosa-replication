/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 12:28:24 GMT 2019
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
      doReturn(854.3139409473921, 2.0, 2.0, 2.0, 2.0).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2822.6);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 2869.205186007448);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 2822.6, 2147102883);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnFcn0.theNumCall = (-2592);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-2588), (-2276.580365001));
      assertEquals((-2585), functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2822.6);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, (MnUserTransformation) null, false);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, (MnStrategy) null, 1245, 3790.12722388);
      assertTrue(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1147.9);
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, false);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2375);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1147.9);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 4.0, 2375);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 2375, 0.0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumParameters minimumParameters0 = new MinimumParameters(880);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianStepTolerance(0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-610.0), 880);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, 115.73151);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-657.70518178), (-657.70518178), 2.0, 2868.2976963812107).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 309.53);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianStepTolerance((-657.70518178));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2286.07666), 2110);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, (-657.70518178));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1408.96533);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2051.67));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, (MnStrategy) null);
      mnStrategy0.setHessianNCycles(0);
      MinimumError.MnNotPosDef minimumError_MnNotPosDef0 = new MinimumError.MnNotPosDef();
      MinimumError minimumError0 = new MinimumError((MnAlgebraicSymMatrix) null, minimumError_MnNotPosDef0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0, mnAlgebraicVector0, mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 1408.96533, (-2925));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1326, (-2925.0));
      assertEquals(1329, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-660.8431994300099), (-1831.0), 10.0, (-660.8431994300099), (-660.8431994300099)).when(fCNBase0).valueOf(any(double[].class));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-660.8431994300099));
      mnStrategy0.setHessianNCycles((-9));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1326, (-502.0));
      assertEquals(1170.15680056999, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2822.6);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      mnStrategy0.setHessianGradientNCycles(0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, (MinimumSeed) null, mnStrategy0, 100, 1245);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-660.8431994300099), (-1831.0), 10.0, (-660.8431994300099)).when(fCNBase0).valueOf(any(double[].class));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianGradientNCycles((-9));
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-660.8431994300099));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(1170.15680056999, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1166.833259), (-1166.833259), (-1166.833259), 854.00727168, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy((-153));
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setHessianG2Tolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 49, (-1166.833259));
      assertEquals(7, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-37.3976985577), (-2905.695394938911), (-2905.695394938911), (-37.3976985577)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 8.141087652682296);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MnStrategy mnStrategy0 = new MnStrategy(4);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnStrategy0.setHessianG2Tolerance((-3078.618983));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1, (-2634));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 309.53);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientTolerance(0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2286.07666), 2110);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, (-657.70518178));
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-657.70518178), (-657.70518178), 2.0, 2868.2976963812107).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 309.53);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientTolerance((-657.70518178));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2286.07666), 2110);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, (-657.70518178));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.0, 4.0, 4.0, (-2277.1413530553323)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, (MnStrategy) null);
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.5, 7);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientStepTolerance(0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-720), 8);
      assertEquals(2277.1413530553323, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-37.3976985577), (-2905.695394938911), (-2905.695394938911), (-37.3976985577)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 8.141087652682296);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientStepTolerance((-795.12934));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2286.07666), 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 8.141087652682296);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 1294.528438, (-5160.20359378), (-3480.549721588817)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1294.528438);
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, true);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1306.755431);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles(0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-1));
      assertEquals(1294.528438, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-37.3976985577), (-2905.695394938911), (-2905.695394938911), (-37.3976985577)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 8.141087652682296);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-393));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2286.07666), 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 8.141087652682296);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(1);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator((MnFcn) null, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-253.7897950535709));
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      MinimumError.MnHesseFailed minimumError_MnHesseFailed0 = new MinimumError.MnHesseFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnHesseFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 1, 1684);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-457), 0);
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2822.6);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 2869.205186007448);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 2822.6, 2147102901);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, (-1290.0), (-4131.969), (-632.328662067815)).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, (-1724.2155133));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 3, (-1724.2155133));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(8.0, 829.952444, 8.0, 8.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(11);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(11);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1706.59676));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1678.76771669, 1786);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 11, 2127.1);
      assertEquals(13, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-660.8431994300099), (-1831.0), 10.0, (-660.8431994300099)).when(fCNBase0).valueOf(any(double[].class));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserTransformation0.setPrecision((-1831.0));
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-660.8431994300099));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(1170.15680056999, functionMinimum0.edm(), 0.01);
  }
}
