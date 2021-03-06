/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 10:03:51 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(4, (-42.8217761571553));
      MockRandom mockRandom0 = new MockRandom(2537L);
      Vector vector0 = Vector.random(4, mockRandom0);
      sparseMatrix0.swapRows(1, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertNotSame(vector0, vector1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(7, 7);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 7);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      forwardBackSubstitutionSolver0.unknowns = 1;
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertEquals(1, vector0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(4, (-42.8217761571553));
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 4);
      forwardBackSubstitutionSolver0.unknowns = 0;
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.fromCSV("");
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(7, 0.0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.fromCSV("");
      Vector vector0 = denseMatrix0.toColumnVector();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      forwardBackSubstitutionSolver0.unknowns = (-2559);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(7, (-931.86114));
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.ForwardBackSubstitutionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(0, (-525.2890061369178));
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      double[][] doubleArray0 = new double[3][0];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(8, (-1.0));
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 8);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      Matrix matrix0 = ooPlaceMatricesSubtraction0.applySimple(sparseMatrix0, sparseMatrix0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can not be solved: coefficient matrix is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(7, 7);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(columnMajorSparseMatrix0);
      assertTrue(boolean0);
  }
}
