/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:06:34 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(1701, 1701);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(columnMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      Random.setNextRandom(16);
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(7, 7, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(7, 7, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.decompose();
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[7][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-0.35615528128088303);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (-0.41231056256176607);
      doubleArray0[2] = doubleArray2;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[7][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-0.35615528128088303);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.1268465843842649, matrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(534, 0, mockRandom0);
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
  public void test7()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[7][2];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      double[][] doubleArray0 = new double[4][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = 0.3;
      doubleArray0[0] = doubleArray1;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      MockRandom mockRandom0 = new MockRandom();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(10, 1.0, (java.util.Random) mockRandom0);
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.apply(rowMajorSparseMatrix0, columnMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.decompose();
      assertEquals(10, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.1, columnMajorSparseMatrix0.density(), 0.01);
  }
}
