/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:09:46 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toColumnMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toColumnMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.ForwardBackSubstitutionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toColumnMatrix();
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix1 = Matrix.random(6, 2, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(matrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(6);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      DenseVector denseVector0 = DenseVector.unit(6);
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertTrue(vector0.equals((Object)denseVector0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(17, 17);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      MockRandom mockRandom0 = new MockRandom();
      Vector vector0 = Vector.random(17, mockRandom0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can not be solved: coefficient matrix is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}
