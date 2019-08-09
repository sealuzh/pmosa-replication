/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:02:33 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(2);
      Matrix matrix0 = columnMajorSparseMatrix0.add(1.0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(2, vector0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(4);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      assertTrue(vector0.equals((Object)sparseVector0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.unit(0);
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(0, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 150;
      doubleArray0[7] = Double.POSITIVE_INFINITY;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(124, 124, 124.0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      DenseVector denseVector0 = DenseVector.unit(0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(4);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(sparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(0, 124, doubleArray0);
      Matrix matrix0 = columnMajorSparseMatrix0.add(0.0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(columnMajorSparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1389.1717;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(4);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      gaussianSolver0.unknowns = 0;
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1389.1717;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }
}
