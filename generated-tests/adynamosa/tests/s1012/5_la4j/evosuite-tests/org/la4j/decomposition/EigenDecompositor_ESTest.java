/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:07:04 GMT 2019
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
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(0);
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(10, 2379, (-985.128));
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
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(14, 14, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(20, 20, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(9);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = denseMatrix0.toRowMajorSparseMatrix();
      DenseMatrix denseMatrix1 = DenseMatrix.constant(9, 3, 9);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(3, 3, 3);
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix1 = DenseMatrix.random(14, 3, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.matrix = (Matrix) denseMatrix1;
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
      DenseMatrix denseMatrix0 = DenseMatrix.constant(3, 3, 3);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }
}