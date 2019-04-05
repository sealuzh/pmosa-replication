/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:47:55 GMT 2019
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)117;
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(1, 896);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(0, (-4765));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4269440
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.blankOfShape(0, 43);
      assertEquals(0, matrix0.rows());
      assertEquals(43, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.zero((-365), (-365));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -365x-365
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1653, 1653, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.toArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(1953, 1929, 1929);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '1953' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(92L);
      // Undeclared exception!
      Basic1DMatrix.random(173, 173, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.random(32, 1654, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Basic1DMatrix.random(9990, (-1581), mockRandom0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
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
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[6][5];
      double[] doubleArray1 = new double[2];
      doubleArray0[2] = doubleArray1;
      // Undeclared exception!
      try { 
        Basic1DMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(1, 1);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape((-44), (-44));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -44x-44
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.constant(443, (-708), (-708));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1, 8);
      SparseMatrix sparseMatrix0 = basic1DMatrix0.toSparseMatrix();
      assertEquals(0.0, sparseMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1, 8);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(978);
      Matrix matrix0 = basic1DMatrix0.copyOfColumns(146);
      assertEquals(146, matrix0.columns());
      assertEquals(978, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(2, Double.NEGATIVE_INFINITY);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(3442, 2);
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(2, matrix0.columns());
      assertEquals(3442, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfShape(22, 314);
      assertEquals(22, matrix0.rows());
      assertEquals(314, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(0, 784);
      assertEquals(0, basic1DMatrix0.rows());
      
      basic1DMatrix0.swapColumns((-2313), 0);
      assertEquals(784, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(47);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(47, (-92));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -92
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(47);
      basic1DMatrix0.swapColumns(47, 47);
      assertEquals(47, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[][] doubleArray0 = new double[7][1];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(0, basic1DMatrix0.columns());
      
      basic1DMatrix0.swapRows(9, 2057);
      assertEquals(7, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[7][1];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(9, 2057);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[3][3];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      basic1DMatrix0.swapRows(17, 17);
      assertEquals(3, basic1DMatrix0.rows());
      assertEquals(3, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-68);
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
  public void test25()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      SparseMatrix sparseMatrix0 = SparseMatrix.block(matrix0, matrix0, matrix0, matrix0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '3' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1475, 32, 32);
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(36, 3753);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(columnMajorSparseMatrix0);
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
  public void test28()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.blankOfShape(305, 305);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, matrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.unit(43, 43);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix1, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(37, mockRandom0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(37, basic1DMatrix0.columns());
      assertEquals(10961, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(47);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(47, 47, mockRandom0);
      assertEquals(47, basic1DMatrix0.columns());
      assertEquals(47, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(1);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertEquals(2, basic1DMatrix1.columns());
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(2, basic1DMatrix1.rows());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("Given vector should have the same length as number of rows in the given matrix: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1, 8);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow(2199);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(1, 1);
      int int0 = basic1DMatrix0.rank();
      assertEquals(1, int0);
      assertEquals(1, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(7, 9, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.toColumnMajorSparseMatrix();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("sz");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.setAll(0.0);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(608, 13);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(13, 13);
      assertEquals(13, basic1DMatrix0.columns());
      assertEquals(608, basic1DMatrix0.rows());
      assertEquals(13, matrix0.columns());
      assertEquals(13, matrix0.rows());
  }
}