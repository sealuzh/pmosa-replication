/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:37:16 GMT 2019
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.05, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-522));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[5];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1990.8992, 1843.284, 2635.587010577, 1843.284, (-522.0)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-522));
      assertEquals(1990.8992, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(60, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(2262);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 2262);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
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
      MnHesse mnHesse0 = new MnHesse(0);
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, (-1159.7777957861));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-2028.6183985339));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0, 378);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(698);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(69);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, mnUserParameters0, (-994));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(472);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[7];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
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
  public void test09()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-522));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)(-522), 0.0, (double)(-522), (-2632.849655)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2563.48987612424;
      doubleArray0[1] = 10.0;
      doubleArray0[2] = (double) (-522);
      doubleArray0[3] = (double) (-522);
      doubleArray0[4] = (double) (-522);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnStrategy0.setHessianNCycles((-3978));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(46, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-522));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 2563.48987612424;
      doubleArray0[1] = 10.0;
      doubleArray0[2] = (double) (-522);
      doubleArray0[3] = (double) (-522);
      doubleArray0[4] = (double) (-522);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnStrategy0.setHessianNCycles((-3978));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null);
      assertEquals(42, mnUserParameterState0.nfcn());
      assertTrue(mnUserParameterState0.hasGlobalCC());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      double[] doubleArray0 = new double[9];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2875);
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2875);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0, mnAlgebraicVector0, mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 1296.264, (-929));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2875);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(10683978);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.02, (double)10683978, 4.0, 4.0483474734287483E-4, 0.02).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 10683978);
      MinimumState minimumState0 = new MinimumState(100);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 570);
      assertFalse(minimumState1.equals((Object)minimumState0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-566.0), 4.0E-7, (-566.0), (-566.0), (-566.0)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("MnHesse: matrix inversion fails!", (-566.0), 2946.6378190016308, (double) (-994), (-592.68));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-994));
      assertEquals(14, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(2126);
      double[] doubleArray0 = new double[8];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-1259));
      // Undeclared exception!
      mnHesse0.calculate((FCNBase) null, mnUserParameters0, mnUserCovariance0, 150);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 10000.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(100);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(100);
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, (-160.2667));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, 100);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 1610);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters are invalid
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(952);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserTransformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(10683978);
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
  public void test18()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1091.7174), (-1091.7174), (-1091.7174), 0.025634898761242406, 1436.686796275801).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnStrategy0.setGradientStepTolerance(2946.6378190016308);
      mnUserParameters0.add("MnHesse: matrix inversion fails!", (-566.0), 2946.6378190016308, (double) (-994), (-592.68));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-994));
      assertEquals((-1091.7174), mnUserParameterState0.fval(), 0.01);
      assertEquals(12, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-522));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[5];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 2563.48987612424, (-674.61546825), (-44.81911472407), (-705.6580771769)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(5);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
      assertEquals(10.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1186));
      double[] doubleArray0 = new double[2];
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(3223);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, doubleArray0, mnUserCovariance0);
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
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-1014));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase1, mnUserParameterState0, 0);
      assertEquals(0.0, mnUserParameterState1.fval(), 0.01);
      assertEquals(96, mnUserParameterState1.nfcn());
  }
}
