/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:53:08 GMT 2019
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
      doReturn(0.0, 4998.0, 0.0, 569.2137665404, 4998.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2528.2547723676);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(3592);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 10.0);
      MinimumError minimumError0 = new MinimumError(3592);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0, mnAlgebraicVector0, mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 2528.2547723676, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 3625, 0.0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-274), (-274));
      assertEquals(6, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.02);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2151);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2151);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2151);
      MinimumError.MnHesseFailed minimumError_MnHesseFailed0 = new MinimumError.MnHesseFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnHesseFailed0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, (FunctionGradient) null, 0.0, 2151);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(2151);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 0, 8.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator((MnFcn) null, (MnUserTransformation) null, (MnStrategy) null);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum((MnFcn) null, hessianGradientCalculator0, (MinimumSeed) null, (MnStrategy) null, (-2300), (-1437.848));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.SimplexBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-202.21));
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, (MnUserTransformation) null, mnStrategy0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, (MnUserTransformation) null);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 0, 0);
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
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2232.6190836411));
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-2232.6190836411));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2232.6190836411), 100);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 2169, (-173.11069135083));
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2528.2547723676);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(3592);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 10.0);
      MinimumError minimumError0 = new MinimumError(3592);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0, mnAlgebraicVector0, mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 2528.2547723676, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1760.0), (double)0, (double)3625, (-1182.6274735), (-1760.0)).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 1087.01);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 3592, 2528.2547723676);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
      
      FunctionMinimum functionMinimum1 = simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-476.83476));
      assertEquals(7, functionMinimum1.nfcn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3562.265574642669), (-902.864038685006), (-555.33), (-2897.0), (-902.864038685006)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3562.265574642669));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1, 430.168744);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 170, (-2232.6190836411));
      assertEquals(173, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 703.3);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-44.8749938667), 2.0, 1362.0, 1426.73, (double)1).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 1);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(6);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 6);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      MinimumError.MnMadePosDef minimumError_MnMadePosDef0 = new MinimumError.MnMadePosDef();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnMadePosDef0);
      FunctionGradient functionGradient0 = new FunctionGradient(100);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, (-3345.290986), 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-900), 2293.3);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 8.0, 8.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1, 430.168744);
      assertEquals(0.5, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-115.999488), 1300.234694127, 1300.234694127, (-340.14), 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1, 430.168744);
      FunctionMinimum functionMinimum1 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 170, (-2232.6190836411));
      assertNotSame(functionMinimum1, functionMinimum0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2415.21786));
      double[] doubleArray0 = new double[6];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(390);
      mnUserTransformation0.setPrecision((-951.848266592593));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 390, (-3007.667631));
  }
}
