/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:23:56 GMT 2019
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(7, 1);
      Vector vector0 = basic1DMatrix0.getRow(1);
      assertEquals(1, vector0.length());
      assertEquals(7, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.setAll(0.0);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Vector vector0 = basic1DMatrix0.getRow((-1818));
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        Basic1DMatrix.from1DArray((-1689), (-1689), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1689x-1689
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(328, 0.0);
      assertEquals(328, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(0, 0, 0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(0, 9990, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.toBinary();
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(7, 1);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(1, 2304, 7);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '2304' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Basic1DMatrix.random(441, 441, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.identity((-527));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -527x-527
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(9981, 9997, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow(638);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(31);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(31, mockRandom0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(31, 31);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '31' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("?vY _VuA/V\"zuzD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromBinary(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[3][5];
      double[] doubleArray1 = new double[8];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        Basic1DMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.from1DArray((-2645), 9, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -2645x9
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[2][6];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(6, basic1DMatrix0.columns());
      assertEquals(105, byteArray0.length);
      assertEquals(2, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      DenseMatrix denseMatrix0 = basic1DMatrix0.toDenseMatrix();
      assertEquals(0, denseMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(32);
      Matrix matrix0 = basic1DMatrix0.copyOfRows(8);
      assertEquals(8, matrix0.rows());
      assertEquals(32, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(20, 1097);
      Matrix matrix0 = basic1DMatrix0.copyOfColumns(43);
      assertEquals(1097, basic1DMatrix0.columns());
      assertEquals(43, matrix0.columns());
      assertEquals(20, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(39, 39, 0.0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(217, 1360);
      assertEquals(39, basic1DMatrix0.rows());
      assertEquals(39, basic1DMatrix0.columns());
      assertEquals(1360, matrix0.columns());
      assertEquals(217, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(0, (double) 0, (Random) mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      assertEquals(0, basic1DMatrix0.columns());
      
      Matrix matrix0 = basic1DMatrix0.subtract((Matrix) columnMajorSparseMatrix0);
      assertTrue(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(9958, 9986, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(9958, 9979);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9958
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(9973, 9971);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(45, (-792.0));
      basic1DMatrix0.swapColumns(45, 45);
      assertEquals(45, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(288, 288);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(317, 288);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 91296
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows(9973, 376);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      basic1DMatrix0.swapRows(51, 51);
      assertEquals(5, basic1DMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)42;
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode Basic1DMatrix from the given byte array.
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(0, 3174.72395981222);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(48);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '49' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(1, 1);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(0, (double) 0, (Random) mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      double[] doubleArray0 = new double[3];
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.from1DArray(0, 2150, doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(columnMajorSparseMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = Matrix.unit(1867, 1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.diagonal(6, 6);
      Matrix matrix0 = basic1DMatrix1.removeLastRow();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = basic1DMatrix0.removeLastRow();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, matrix0, basic1DMatrix0, matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(5, mockRandom0);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(5, basic1DMatrix0.columns());
      assertEquals(5, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1));
      // Undeclared exception!
      try { 
        Basic1DMatrix.random((-1), (-1), mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1x-1
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("ME%&h");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(45, (-792.0));
      Matrix matrix0 = basic1DMatrix0.rotate();
      assertEquals(45, basic1DMatrix0.columns());
      assertEquals(45, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(45, (-792.0));
      basic1DMatrix0.setAll(45);
      assertEquals(45, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(7, 1);
      Matrix matrix0 = basic1DMatrix0.copyOfRows(1346);
      assertEquals(1, matrix0.columns());
      assertEquals(7, basic1DMatrix0.rows());
      assertEquals(1346, matrix0.rows());
      assertEquals(1, basic1DMatrix0.columns());
  }
}