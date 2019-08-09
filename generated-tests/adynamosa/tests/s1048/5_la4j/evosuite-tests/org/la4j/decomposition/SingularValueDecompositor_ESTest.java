/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:04:34 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      boolean boolean0 = singularValueDecompositor0.applicableTo((Matrix) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      MockRandom mockRandom0 = new MockRandom((-1L));
      DenseVector denseVector0 = DenseVector.random(11, mockRandom0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1184);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (-1064.158388424);
      doubleArray0[3] = (double) 1;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(14);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 133);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (-1064.158388424);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      MockRandom mockRandom0 = new MockRandom((-1L));
      DenseVector denseVector0 = DenseVector.random(11, mockRandom0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }
}