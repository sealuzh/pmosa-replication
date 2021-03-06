/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 09:08:50 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(3, 3);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      DenseVector denseVector0 = DenseVector.constant(3, Double.POSITIVE_INFINITY);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(3, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(1, 1.1102230246251565E-14);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      SparseVector sparseVector0 = SparseVector.zero(1, (-1983));
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      assertNotSame(vector0, sparseVector0);
      assertTrue(vector0.equals((Object)sparseVector0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      assertNotSame(vector0, sparseVector0);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(8, 8);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      DenseVector denseVector0 = DenseVector.unit(0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong length of RHS vector: 0.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[] doubleArray0 = new double[1];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(columnMajorSparseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Matrix matrix1 = Matrix.from2DArray(doubleArray0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(8, 8);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(1120, 1.1102230246251565E-14);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      SparseVector sparseVector0 = SparseVector.zero(1120, (-1983));
      // Undeclared exception!
      gaussianSolver0.solve(sparseVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.fromCSV("");
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
  public void test09()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
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
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(20L);
      Matrix matrix0 = Matrix.random(1, 275, mockRandom0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      SparseVector sparseVector0 = SparseVector.zero(583, 583);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
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
  public void test12()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(8, (-1961));
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(8, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      assertTrue(vector0.equals((Object)sparseVector0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(8, 1.1102230246251565E-14);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      SparseVector sparseVector0 = SparseVector.zero(8, (-1983));
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}
