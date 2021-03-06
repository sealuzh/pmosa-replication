/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 22:44:07 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.functor.MatrixFunction;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      boolean boolean0 = singularValueDecompositor0.applicableTo((Matrix) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(10);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.SingularValueDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.fromCSV("");
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-1' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(281, 10);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(10);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(6, 6);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, 2.0, (double)6, (double)6, 2.0).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      sparseMatrix0.update(matrixFunction0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(842);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }
}
