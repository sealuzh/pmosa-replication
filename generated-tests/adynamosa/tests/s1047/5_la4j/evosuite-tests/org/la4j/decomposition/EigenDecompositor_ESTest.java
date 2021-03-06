/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:09:40 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(2291, 2291);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(columnMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 2, 0);
      Matrix matrix0 = Matrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(2291, 2291);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(17, 1.1102230246251565E-14, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
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
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(36);
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(4, 4, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(32, (-1888.5));
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 2, 0);
      Matrix matrix0 = Matrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(sparseMatrix0);
      assertFalse(boolean0);
  }
}
