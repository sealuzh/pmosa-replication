/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 16:38:56 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo((Matrix) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0, 0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(7, 913);
      Matrix matrix1 = rowMajorSparseMatrix0.rotate();
      boolean boolean0 = singularValueDecompositor0.applicableTo(matrix1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(606);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.fromCSV("");
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
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
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-3035.560322407278);
      doubleArray0[2] = (double) (-2);
      doubleArray0[3] = (double) (-2);
      doubleArray0[4] = (-217.274936319493);
      doubleArray0[5] = (double) (-2);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) 10;
      doubleArray0[4] = (-217.274936319493);
      doubleArray0[6] = (double) 10;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toColumnMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-3035.560322407278);
      doubleArray0[1] = (-3035.560322407278);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-3035.560322407278);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }
}
