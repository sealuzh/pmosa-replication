/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:24:07 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.vector.SparseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 6;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(4, 6, mockRandom0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(denseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      CompressedVector compressedVector0 = (CompressedVector)gaussianSolver0.solve(sparseVector0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 33);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      assertNotSame(vector0, sparseVector0);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(505, 1, 505);
      boolean boolean0 = gaussianSolver0.applicableTo(rowMajorSparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(0, 33);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -1
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 6;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(4, 6, mockRandom0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}