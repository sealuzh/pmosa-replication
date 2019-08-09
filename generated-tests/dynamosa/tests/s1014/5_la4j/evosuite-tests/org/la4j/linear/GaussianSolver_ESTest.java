/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 19:54:26 GMT 2019
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
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector vector0 = Vector.unit(10);
      MockRandom mockRandom0 = new MockRandom((-1058L));
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertEquals(10, vector1.length());
      assertNotSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(1, 1.1102230246251565E-14);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.zero(1);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
      assertTrue(vector1.equals((Object)vector0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      Matrix matrix0 = rowMajorSparseMatrix0.transpose();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Vector vector0 = Vector.fromCollection(linkedList0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
      assertEquals(0, vector1.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(1983, 0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(1, 1);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(columnMajorSparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      Matrix matrix0 = rowMajorSparseMatrix0.transpose();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(772, 772);
      Matrix matrix0 = Matrix.identity(772);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      gaussianSolver0.solve(sparseVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(803, 803);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
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
  public void test07()  throws Throwable  {
      Matrix matrix0 = Matrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.zero(0);
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
  public void test08()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(13, 13);
      Matrix matrix0 = Matrix.identity(13);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      gaussianSolver0.unknowns = 1230;
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '1230' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Matrix matrix0 = Matrix.zero(9, 9);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      gaussianSolver0.unknowns = (-135611009);
      DenseVector denseVector0 = DenseVector.unit(9);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      Matrix matrix0 = rowMajorSparseMatrix0.transpose();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(826, 3843);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(1463, 1463, doubleArray0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      Matrix matrix0 = rowMajorSparseMatrix0.transpose();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      double[][] doubleArray1 = new double[3][2];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      Matrix matrix1 = ooPlaceMatricesMultiplication0.apply(rowMajorSparseMatrix0, denseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(765, 765);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      Vector vector0 = Vector.zero(765);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1, 1);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
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
}
