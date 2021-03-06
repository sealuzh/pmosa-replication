/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 17:51:52 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
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
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(3);
      Matrix matrix0 = columnMajorSparseMatrix0.add((double) 3);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 3;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      CompressedVector compressedVector0 = (CompressedVector)gaussianSolver0.solve(sparseVector0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(1, 1.1102230246251565E-14);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(1, 1.1102230246251565E-14);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(1, vector0.length());
      assertNotSame(vector0, denseVector0);
      assertFalse(vector0.equals((Object)denseVector0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      DenseVector denseVector0 = DenseVector.constant(0, 0.0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(0, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[0][6];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(1092, 1092, (-299.997));
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.constant(1092, (-299.997));
      // Undeclared exception!
      gaussianSolver0.solve(vector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(3);
      SparseVector sparseVector0 = SparseVector.zero(3);
      sparseMatrix0.setAll(Double.NEGATIVE_INFINITY);
      Matrix matrix0 = ((RowMajorSparseMatrix) sparseMatrix0).transpose();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(17);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      DenseVector denseVector0 = DenseVector.constant(0, 0.0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
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
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][9];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
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
  public void test09()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(184, 2.0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 184);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Matrix matrix1 = sparseVector0.toColumnMatrix();
      boolean boolean0 = gaussianSolver0.applicableTo(matrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(3);
      SparseVector sparseVector0 = SparseVector.zero(3);
      sparseMatrix0.setAll(3);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(6, 6, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(6, 6);
      Vector vector0 = columnMajorSparseMatrix0.getRow(6);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}
