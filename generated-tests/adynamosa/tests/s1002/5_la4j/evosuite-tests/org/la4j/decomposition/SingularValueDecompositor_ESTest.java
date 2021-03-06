/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 00:14:40 GMT 2019
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
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
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
      Matrix matrix0 = Matrix.identity(4);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(16, (-0.1655828545366281));
      singularValueDecompositor0.matrix = (Matrix) columnMajorSparseMatrix0;
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
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
      double[][] doubleArray0 = new double[7][6];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-3559.137312667);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[7];
      doubleArray2[1] = (-3559.137312667);
      doubleArray2[2] = (-3559.137312667);
      doubleArray0[1] = doubleArray2;
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      int int0 = matrix0.rank();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = 0.6568112440759161;
      double[][] doubleArray1 = new double[2][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      Matrix matrix0 = Matrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[1][6];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1498L);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(17, mockRandom0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }
}
