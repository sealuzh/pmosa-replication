/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 23:23:01 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(0, 0, (double[]) null);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(columnMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(2061584302, 2061584302, (double[]) null);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Matrix matrix0 = Matrix.from1DArray(40, 40, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 40
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(21, 2);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 2.0;
      doubleArray0[3] = 1196.68768299677;
      SparseMatrix sparseMatrix0 = SparseMatrix.from1DArray(2, 2, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.0, sparseMatrix0.min(), 0.01);
      assertEquals(1196.68768299677, sparseMatrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-948.53134);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(32, 32);
      double[][] doubleArray1 = new double[3][6];
      doubleArray1[1] = doubleArray0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray1);
      Matrix matrix0 = ooPlaceMatricesSubtraction0.apply(rowMajorSparseMatrix0, columnMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(5, 5);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(32, 32);
      double[][] doubleArray0 = new double[3][6];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(columnMajorSparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(32, 32);
      double[][] doubleArray0 = new double[3][6];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      eigenDecompositor0.matrix = (Matrix) columnMajorSparseMatrix0;
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't decompose rectangle matrix
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(32, 32);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = 2.0;
      SparseMatrix sparseMatrix0 = SparseMatrix.from1DArray(2, 2, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.25, sparseMatrix0.density(), 0.01);
      assertEquals(2.0, sparseMatrix0.max(), 0.01);
  }
}
