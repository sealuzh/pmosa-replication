/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 22:27:25 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
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
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnMinos;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnMinos_ESTest extends MnMinos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[9];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, (-2148.01133558));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(100, 3286.776410449, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null);
      // Undeclared exception!
      try { 
        mnMinos0.lower(1065, 0.05, 1004);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 1);
      // Undeclared exception!
      try { 
        mnMinos0.minos(81, 0.0, (-360));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 857.5);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, (-645));
      // Undeclared exception!
      try { 
        mnMinos0.lower(0, 454.6850778);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(6);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 2.0, functionMinimum_MnReachedCallLimit0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(696, 0.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters((MnAlgebraicVector) null, (MnAlgebraicVector) null, 0.1);
      MinimumError minimumError0 = new MinimumError(1369);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, (FunctionGradient) null, (-892.86129607627), 1369);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1834.1777);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.range(0, (double) 0, 1369);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-4023.4510946705), 100);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(0, 0.0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnAboveMaxEdm functionMinimum_MnAboveMaxEdm0 = new FunctionMinimum.MnAboveMaxEdm();
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1995);
      MinimumError.MnMadePosDef minimumError_MnMadePosDef0 = new MinimumError.MnMadePosDef();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnMadePosDef0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 1.0, 0);
      linkedList0.add(minimumState0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum((MinimumSeed) null, linkedList0, (-1904.1040167355), functionMinimum_MnAboveMaxEdm0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, (-209));
      // Undeclared exception!
      try { 
        mnMinos0.loval((-209));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-4023.4510946705), 100);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(0, (-4023.4510946705), 9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(9);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 492.77800055042655);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, (MnStrategy) null);
      // Undeclared exception!
      try { 
        mnMinos0.upval(2272);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(100);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 100, functionMinimum_MnReachedCallLimit0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.minos((-1296), (double) 100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(1028);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1797.230943, 0);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 1028);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(1850);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2531.98), 1850);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum.MnAboveMaxEdm functionMinimum_MnAboveMaxEdm0 = new FunctionMinimum.MnAboveMaxEdm();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (List<MinimumState>) null, 1850, functionMinimum_MnAboveMaxEdm0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upper((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.FunctionMinimum", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-4023.4510946705), 100);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.range(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}