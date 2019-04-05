/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:07:08 GMT 2019
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-100);
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
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(13, 13, 13);
      basic1DMatrix0.setAll((-1006.0));
      assertEquals(13, basic1DMatrix0.columns());
      assertEquals(13, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(6, 10);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(0, 1318, 1318);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '1318' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 2213, mockRandom0);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(2213, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 0, mockRandom0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(6, 10);
      Vector vector0 = basic1DMatrix0.getRow(0);
      assertEquals(10, vector0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(10, 10, doubleArray0);
      assertEquals(10, basic1DMatrix0.rows());
      assertEquals(10, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        Basic1DMatrix.from1DArray((-3199), 0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -3199x0
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.blankOfShape(37, 8);
      assertEquals(37, matrix0.rows());
      assertEquals(8, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(654, 0, doubleArray0);
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
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      MatrixFactory<Basic1DMatrix> matrixFactory0 = (MatrixFactory<Basic1DMatrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Matrix) null).when(matrixFactory0).apply(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        basic1DMatrix0.to(matrixFactory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.DenseMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(28, (-1394.4615430996953));
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns((-1615), 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1615
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(8, 1058, 0.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '8' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
      double[][] doubleArray0 = new double[7][8];
      double[] doubleArray1 = new double[3];
      doubleArray0[2] = doubleArray1;
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
        Basic1DMatrix.diagonal((-874), 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -874x-874
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.zero(3, (-100));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(256, 1);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(256, doubleArray0.length);
      assertEquals(256, basic1DMatrix0.rows());
      assertEquals(1, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(13, 13, 13);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(2, 2);
      assertEquals(2, matrix0.rows());
      assertEquals(13, basic1DMatrix0.columns());
      assertEquals(2, matrix0.columns());
      assertEquals(13, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(207, 207);
      Matrix matrix0 = basic1DMatrix0.copyOfRows(228);
      assertEquals(228, matrix0.rows());
      assertEquals(207, basic1DMatrix0.columns());
      assertEquals(207, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(3, 3);
      Matrix matrix0 = basic1DMatrix0.shuffle();
      assertTrue(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(6, 10);
      basic1DMatrix0.swapColumns(6, 0);
      assertEquals(10, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      basic1DMatrix0.swapColumns(8, 8);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(551, 551);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(7, 551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 303601
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows((-1507), (-3658));
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows((-100), (-100));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)100;
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
  public void test28()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(3, 3);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(81, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.random(1, 1, (double) 1, (Random) mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0);
      assertEquals(2, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      SparseVector sparseVector0 = SparseVector.zero(5);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, denseVector0);
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(518, 0.0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, matrix0, sparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfShape(8, 9992);
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
  public void test33()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(9, 3);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = basic1DMatrix0.toColumnMajorSparseMatrix();
      SparseVector sparseVector0 = SparseVector.fromCSV("");
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(columnMajorSparseMatrix0, matrix0, matrix0, basic1DMatrix0);
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
      double[][] doubleArray0 = new double[1][9];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(9, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-758L));
      // Undeclared exception!
      Basic1DMatrix.randomSymmetric(256, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-215));
      // Undeclared exception!
      try { 
        Basic1DMatrix.randomSymmetric((-215), mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -215x-215
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(538L);
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
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(1, 0, mockRandom0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(219);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '220' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(246, 253);
      Vector vector0 = basic1DMatrix0.getRow(235);
      assertEquals(253, vector0.length());
      assertEquals(246, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("Sides of blocks are incompatible!");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.setAll(1599.65);
      assertEquals(0, basic1DMatrix0.rows());
  }
}