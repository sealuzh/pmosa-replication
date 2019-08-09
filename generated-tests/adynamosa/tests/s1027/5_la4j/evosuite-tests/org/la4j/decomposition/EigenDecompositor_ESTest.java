/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:12:16 GMT 2019
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
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-570L));
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(0, (double) 0, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
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
  public void test02()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.fromCSV("");
      Matrix matrix0 = sparseVector0.toRowMatrix();
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
  public void test03()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(17);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(17, 2.0);
      Matrix matrix0 = columnMajorSparseMatrix0.shuffle();
      Matrix matrix1 = matrix0.rotate();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix1);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(12);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(12, (-1.1772920993687452));
      Matrix matrix0 = columnMajorSparseMatrix0.shuffle();
      CCSMatrix cCSMatrix0 = (CCSMatrix)matrix0.shuffle();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(cCSMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(12, cCSMatrix0.cardinality());
      assertEquals(0.0, cCSMatrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(12);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(12, 4.7558616332371205E-14);
      Matrix matrix0 = columnMajorSparseMatrix0.shuffle();
      Matrix matrix1 = matrix0.rotate();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix1);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(5);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(5, 2.0);
      Matrix matrix0 = columnMajorSparseMatrix0.shuffle();
      Matrix matrix1 = matrix0.shuffle();
      CRSMatrix cRSMatrix0 = (CRSMatrix)matrix1.rotate();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(cRSMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(2.0, cRSMatrix0.max(), 0.01);
      assertEquals(5, cRSMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.unit(6);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(13, (-52.0));
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = ColumnMajorSparseMatrix.zero(1018, 13);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      eigenDecompositor0.matrix = (Matrix) columnMajorSparseMatrix1;
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
  public void test09()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(13, (-52.0));
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(5, 2.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(30, 602);
      boolean boolean0 = eigenDecompositor0.applicableTo(sparseMatrix0);
      assertFalse(boolean0);
  }
}
