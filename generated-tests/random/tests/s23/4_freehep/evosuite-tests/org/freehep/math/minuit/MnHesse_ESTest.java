/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:21:43 GMT 2019
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
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnHesse;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserCovariance;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnHesse_ESTest extends MnHesse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-3020));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-3020));
      int int0 = mnHesse0.ncycles();
      assertEquals((-3020), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-3020));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-3020));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.3861227892077947E-10;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.add("", 4498.84621, 4498.84621, 1.3861227892077947E-10, 0.001);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-3020));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(Double.NaN, mnUserParameterState0.edm(), 0.01);
      assertEquals(15, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[7];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-1395));
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, (MnUserCovariance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(71);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      // Undeclared exception!
      try { 
        mnHesse0.calculate((MnFcn) null, (MinimumState) null, mnUserTransformation0, 71);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnHesse", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      double[] doubleArray0 = new double[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-7.2142569649777775E9), 373.216).when(fCNBase0).valueOf(any(double[].class));
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, 133);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumState minimumState0 = new MinimumState(3);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.add((String) null, 47.5, 47.5, (-7.2142569649777775E9), 963.00934);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-1999));
      assertEquals(16, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianNCycles((-1045));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2017.68646;
      doubleArray0[1] = (double) (-1045);
      doubleArray0[2] = (double) (-1045);
      doubleArray0[3] = (double) (-1045);
      doubleArray0[4] = (double) (-1045);
      doubleArray0[5] = 2017.68646;
      doubleArray0[6] = (double) (-1045);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, mnUserParameterState0.edm(), 0.01);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-3020));
      mnStrategy0.setLowStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-3020));
      double[] doubleArray0 = new double[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-3020));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertFalse(mnUserParameterState0.hasCovariance());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientStepTolerance(2017.68646);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2017.68646, (double)(-1054), (-1.0), 0.14142135623731064, (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2017.68646;
      doubleArray0[1] = (double) (-1054);
      doubleArray0[2] = (double) (-1054);
      doubleArray0[3] = (double) (-1054);
      doubleArray0[4] = (double) (-1054);
      doubleArray0[5] = 2017.68646;
      doubleArray0[6] = (double) (-1054);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(2017.68646, mnUserParameterState0.fval(), 0.01);
      assertEquals(107, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3046.67478), (-3046.67478), (-5190.0), (-1987.19), (-844.3)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.add((String) null, 47.5, 47.5, (-7.2142569649777775E9), 963.00934);
      mnUserParameters0.setLowerLimit(0, 0.001);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-1999));
      assertEquals(14, mnUserParameterState0.nfcn());
      assertEquals((-3046.67478), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(899);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 374.1);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(899);
      MinimumError.MnHesseFailed minimumError_MnHesseFailed0 = new MinimumError.MnHesseFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnHesseFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, (-1.0), 899);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 1833);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(1302);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-5662));
      // Undeclared exception!
      mnHesse0.calculate((FCNBase) null, (MnUserParameters) null, mnUserCovariance0, (-1729));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[6];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.51, 0.05, (-110.86830272686), 0.05, 2.3841886331865682E-8).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
      assertEquals(0.51, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, mnUserParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.05, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((MnStrategy) null);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-2765));
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(1321);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 1321);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3046.67478), (-3046.67478), (-5190.0), (-1987.19), (-844.3)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.add((String) null, 47.5, 47.5, (-7.2142569649777775E9), 963.00934);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-1999));
      assertEquals((-3046.67478), mnUserParameterState0.fval(), 0.01);
      assertEquals(6, mnUserParameterState0.nfcn());
  }
}