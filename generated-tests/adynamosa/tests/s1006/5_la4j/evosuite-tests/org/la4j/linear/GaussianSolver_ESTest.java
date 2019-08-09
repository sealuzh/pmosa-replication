/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 06:04:31 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(1, 3239);
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(1, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(0, 2.0, (Random) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      CompressedVector compressedVector0 = (CompressedVector)gaussianSolver0.solve(sparseVector0);
      assertNotSame(compressedVector0, sparseVector0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(0, 2.0, (Random) null);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(3239, (-2056.352393712409));
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      gaussianSolver0.solve(denseVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.unit(0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(0, 3511.014019);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(8, 2425);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(0, 3511.014019);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      SparseVector sparseVector0 = SparseVector.random(2, (double) 0L, (Random) mockRandom0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      DenseVector denseVector0 = DenseVector.random(2, mockRandom0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
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
  public void test10()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1);
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(15, mockRandom0);
      SparseVector sparseVector0 = SparseVector.zero(15);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      assertTrue(vector0.equals((Object)sparseVector0));
  }
}