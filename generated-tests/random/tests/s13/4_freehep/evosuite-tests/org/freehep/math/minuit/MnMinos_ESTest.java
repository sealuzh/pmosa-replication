/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:59:10 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FunctionGradient;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnApplication;
import org.freehep.math.minuit.MnMinos;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnMinos_ESTest extends MnMinos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1623);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1623);
      MinimumError minimumError0 = new MinimumError(27);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, (-261));
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-645.2835));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      MnApplication.DEFAULT_MAXFCN = (-261);
      // Undeclared exception!
      try { 
        mnMinos0.upval(2, 0.1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1623);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1623);
      MinimumError minimumError0 = new MinimumError(2);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, (-261));
      double[] doubleArray0 = new double[23];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-645.2835));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(2, 0.1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumParameters minimumParameters0 = new MinimumParameters(181);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1.0, 181);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 181.0);
      MnStrategy mnStrategy0 = new MnStrategy(181);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(0, 2846.016197102, (-5039));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(767);
      double[] doubleArray0 = new double[8];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 0.2);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 767);
      // Undeclared exception!
      try { 
        mnMinos0.lower(767, 0.2, 767);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1623);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1623);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, (-261));
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-261.0));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(1623);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1623, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, (-1791.140109), functionMinimum_MnReachedCallLimit0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, (-1334));
      // Undeclared exception!
      try { 
        mnMinos0.upval((-1334), (double) (-1334), 100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 0.02, functionMinimum_MnReachedCallLimit0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(0, (double) 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1623);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1623);
      MinimumError minimumError0 = new MinimumError(2);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, (-261));
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-645.2835));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      MnApplication.DEFAULT_MAXFCN = (-261);
      // Undeclared exception!
      try { 
        mnMinos0.lower(2, 0.1);
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
      MinimumState minimumState0 = new MinimumState(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, 7);
      // Undeclared exception!
      try { 
        mnMinos0.loval(0, (double) 7, 200);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(536.6809735, 536.6809735, 536.6809735, 0.0, 536.6809735).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1623);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1623);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, (-261));
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-261.0));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      double double0 = mnMinos0.lower(0, 0.1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1623);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1623);
      MinimumError minimumError0 = new MinimumError(2);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, (-261));
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-645.2835));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(2, 0.0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-1.0));
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, 0);
      // Undeclared exception!
      try { 
        mnMinos0.range(0, (-1.0));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0, (-252));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.range(2, 0.0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, (FunctionMinimum) null, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.loval((-877));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(4);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, (FunctionMinimum) null, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(100);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 100, functionMinimum_MnReachedCallLimit0);
      MnStrategy mnStrategy0 = new MnStrategy(100);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(5);
      double[] doubleArray0 = new double[8];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 6);
      // Undeclared exception!
      try { 
        mnMinos0.lower(6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 0.3, functionMinimum_MnReachedCallLimit0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.range(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(1991);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1991, 1);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy(461);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.range(461, 3720.230205);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }
}
