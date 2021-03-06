/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 09:33:49 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
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
  public void test01()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(1, (-1855.5452));
      Vector vector0 = columnMajorSparseMatrix0.getRow(1);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertNotSame(vector0, vector1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(0, 0);
      forwardBackSubstitutionSolver0.unknowns = (-1158);
      Vector vector0 = columnMajorSparseMatrix0.getRow(6);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -1158
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(0, 0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      Vector vector0 = matrix0.getColumn(2);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 0, doubleArray0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(rowMajorSparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(1);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
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
  public void test07()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(0, 0);
      forwardBackSubstitutionSolver0.unknowns = (-1158);
      forwardBackSubstitutionSolver0.unknowns = 37;
      Vector vector0 = columnMajorSparseMatrix0.getRow(0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '0' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(0, 0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
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
  public void test09()  throws Throwable  {
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.ForwardBackSubstitutionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0, 0);
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
  public void test11()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(0, 0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(37, 0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(columnMajorSparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(7, 5);
      Matrix matrix0 = rowMajorSparseMatrix0.rotate();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 2805);
      forwardBackSubstitutionSolver0.unknowns = 5;
      Vector vector0 = ooPlaceMatrixByVectorMultiplication0.apply(rowMajorSparseMatrix0, sparseVector0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertEquals(5, vector1.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(4, 4, 4);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      Vector vector0 = matrix0.getColumn(2);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can not be solved: coefficient matrix is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}
