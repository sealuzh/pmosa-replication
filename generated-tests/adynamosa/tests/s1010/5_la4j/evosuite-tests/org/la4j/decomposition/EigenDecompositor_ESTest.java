/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 13:25:22 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(10);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
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
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
      Matrix matrix1 = matrix0.add(0.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix1);
      eigenDecompositor0.matrix = matrix0;
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
  public void test03()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      SparseVector sparseVector0 = SparseVector.zero(1);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(3, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      boolean boolean0 = eigenDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
      Matrix matrix1 = matrix0.add(0.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix1);
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
  public void test07()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
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
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 3;
      doubleArray0[8] = (double) 3;
      doubleArray0[4] = (double) 3;
      doubleArray0[7] = (double) 3;
      doubleArray0[6] = (-1.1381356666555988);
      doubleArray0[3] = (double) 3;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) 3;
      doubleArray0[2] = 48.0;
      doubleArray0[3] = (double) 3;
      doubleArray0[4] = 48.0;
      doubleArray0[7] = (double) 3;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) 3;
      doubleArray0[4] = 48.0;
      doubleArray0[5] = 48.0;
      doubleArray0[6] = 0.026261478139145228;
      doubleArray0[7] = (double) 3;
      doubleArray0[8] = 48.0;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.7777777777777778, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(7, rowMajorSparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 3;
      doubleArray0[1] = (double) 3;
      doubleArray0[2] = 48.0;
      doubleArray0[4] = 48.0;
      doubleArray0[6] = (-1.3958589713443366);
      doubleArray0[7] = (double) 3;
      doubleArray0[3] = 48.0;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals((-1.3958589713443366), rowMajorSparseMatrix0.min(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 0.026261478139145228;
      doubleArray0[8] = 48.0;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[6] = 0.026261478139145228;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[8] = (double) 3;
      doubleArray0[4] = (double) 3;
      doubleArray0[7] = (double) 3;
      doubleArray0[3] = (double) 3;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.4444444444444444, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(4, rowMajorSparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
      Matrix matrix1 = matrix0.add(0.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix1);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(3, 3, 3);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[7] = (double) 3;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      double[][] doubleArray1 = new double[7][1];
      Matrix matrix0 = Matrix.from2DArray(doubleArray1);
      eigenDecompositor0.matrix = matrix0;
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
}
