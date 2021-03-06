/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:53:56 GMT 2019
 */

package org.la4j.vector.sparse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.HashMap;
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
import org.la4j.iterator.VectorIterator;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication;
import org.la4j.vector.SparseVector;
import org.la4j.vector.VectorFactory;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorProcedure;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompressedVector_ESTest extends CompressedVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) (-174);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1432.4246390458768), 706.3955, 0.0, (-1.0), (-416.0)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(4, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (double) (-174);
      doubleArray0[3] = (double) (-174);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1432.4246390458768), 706.3955, 0.0, (-1.0), (-416.0)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(4, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(3);
      assertEquals(0, compressedVector1.cardinality());
      assertEquals(3, compressedVector1.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)122;
      // Undeclared exception!
      try { 
        CompressedVector.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode CompressedVector from the given byte array.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      compressedVector0.nonZeroIterator();
      assertEquals(0, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      VectorIterator vectorIterator0 = compressedVector0.iterator();
      assertNotNull(vectorIterator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(0, 1214);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be less then or equal to capacity: 1214.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(8, vectorFunction0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(1113, 1113);
      VectorFactory<CompressedVector> vectorFactory0 = (VectorFactory<CompressedVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Vector) null).when(vectorFactory0).apply(anyInt());
      CompressedVector compressedVector1 = compressedVector0.to(vectorFactory0);
      assertNull(compressedVector1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      compressedVector0.setAll((-1817.0388825287023));
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.set((-2094), 1.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '-2094' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(1797, 1797);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.each(vectorProcedure0);
      assertEquals(1797, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.blankOfLength(0);
      assertEquals(Double.NaN, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      Vector vector0 = compressedVector0.blankOfLength(8);
      assertEquals(8, vector0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -1
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 100.0;
      doubleArray0[1] = (-1518.59);
      doubleArray0[2] = (-1025.9785689);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.swapElements(4998, 1077);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      // Undeclared exception!
      try { 
        compressedVector0.set(980, 0.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '980' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1));
      // Undeclared exception!
      try { 
        CompressedVector.random((-1), 1.0, (Random) mockRandom0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromMatrixMarket("tP?2qpZ(54s%h.^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)16;
      // Undeclared exception!
      try { 
        CompressedVector.fromBinary(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromArray((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.each((VectorProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.copyOfLength((-1165));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -1165
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CompressedVector compressedVector0 = null;
      try {
        compressedVector0 = new CompressedVector(5678, (-1950));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -1950.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompressedVector compressedVector0 = null;
      try {
        compressedVector0 = new CompressedVector((-2221));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -2221
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (double) (-174);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1432.4246390458768), 706.3955, 0.0, (-1.0), (-416.0)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(0.8, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(788, (-1025));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -1025.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 356);
      assertEquals(0.0, compressedVector0.density(), 0.01);
      
      compressedVector0.set(18, 356);
      assertEquals(0.0028089887640449437, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      Long long0 = new Long((-1L));
      linkedList0.add(long0);
      linkedList0.add(long0);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      assertEquals(2, compressedVector0.cardinality());
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(0, vectorFunction0);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-3473.9559573);
      doubleArray0[3] = Double.POSITIVE_INFINITY;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      double[][] doubleArray1 = new double[4][7];
      doubleArray1[1] = doubleArray0;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray1);
      CompressedVector compressedVector1 = (CompressedVector)ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) compressedVector0, rowMajorSparseMatrix0);
      assertEquals(1.0, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<Short> linkedList0 = new LinkedList<Short>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      SparseVector sparseVector0 = compressedVector0.toSparseVector();
      assertSame(sparseVector0, compressedVector0);
      assertEquals(Double.NaN, sparseVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-775.2865519476);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.nonZeroAt((-255));
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(85, 85);
      compressedVector0.setAll(85);
      boolean boolean0 = compressedVector0.nonZeroAt(9);
      assertEquals(85, compressedVector0.cardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(809);
      boolean boolean0 = compressedVector0.nonZeroAt(809);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (-174);
      doubleArray0[1] = (double) (-174);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      Matrix matrix0 = compressedVector0.toDiagonalMatrix();
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.multiply(matrix0);
      assertFalse(compressedVector1.equals((Object)compressedVector0));
      assertEquals((-174.0), matrix0.min(), 0.01);
      assertEquals(2, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<Short> linkedList0 = new LinkedList<Short>();
      Short short0 = new Short((short) (-25698));
      linkedList0.add(short0);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1251.8716)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      // Undeclared exception!
      try { 
        compressedVector0.updateAt((-1), vectorFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This vector can't grow up.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1.0);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      double double0 = compressedVector0.infinityNorm();
      assertEquals(1.0, double0, 0.01);
      assertEquals(4, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) 2144431489;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      double double0 = compressedVector0.sum();
      assertEquals(7, compressedVector0.length());
      assertEquals(2.144431489E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(6274);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(2201);
      assertEquals(2201, compressedVector1.length());
      assertEquals(0, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[0] = 362.9721906;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(3017, 0);
      assertEquals(0.058823529411764705, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      CompressedVector compressedVector0 = new CompressedVector(1, 1, doubleArray0, intArray0);
      compressedVector0.swapElements(1, 2047);
      assertArrayEquals(new int[] {2047, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-3473.9559573);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements((-1252), (-1010));
      assertEquals(0.125, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.shuffle();
      assertEquals(0.0, compressedVector1.density(), 0.01);
      assertEquals(1, compressedVector1.length());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2638);
      assertEquals(0.0, compressedVector0.density(), 0.01);
      
      compressedVector0.setAll((byte)80);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(4182, 4182);
      compressedVector0.setAll(4182);
      compressedVector0.set(981, 1376.0);
      assertEquals(4182, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-586.84108156896);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.set(0, 0);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-871.62715);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(0.2, compressedVector0.density(), 0.01);
      
      compressedVector0.set(0, 0);
      assertEquals(0.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) 2144431489;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      CompressedVector compressedVector1 = CompressedVector.fromArray(doubleArray0);
      compressedVector1.equals((Object) compressedVector0);
      assertEquals(0.14285714285714285, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(8);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.sliceLeft(8);
      assertEquals(0, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      Integer integer0 = new Integer(390);
      Byte byte0 = new Byte((byte)9);
      hashMap0.put(integer0, byte0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2638);
      assertEquals(3.790750568612585E-4, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      Integer integer0 = new Integer((-1308));
      hashMap0.put(integer0, (Float) null);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, 37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      Integer integer0 = new Integer(771);
      hashMap0.put(integer0, (Double) doubleArray0[0]);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, 771);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<Short> linkedList0 = new LinkedList<Short>();
      Short short0 = new Short((short)2605);
      linkedList0.offer(short0);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(1.0, compressedVector1.density(), 0.01);
      assertEquals(1.0, compressedVector0.density(), 0.01);
      assertTrue(compressedVector1.equals((Object)compressedVector0));
      assertEquals(25, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        CompressedVector.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode CompressedVector from the given byte array.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      CompressedVector compressedVector0 = CompressedVector.random(1, (double) 1, (Random) mockRandom0);
      assertEquals(1, compressedVector0.cardinality());
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.random(0, (double) (short)2601, (Random) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        CompressedVector.random(1881, (-1.0), (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromCSV((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromMatrixMarket("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      compressedVector0.setAll(0.0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(788, 788);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)16, (byte)0, (byte)0, (byte)3, (byte)20, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0.0, compressedVector1.density(), 0.01);
      assertEquals(788, compressedVector1.length());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 323.154;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.add((Vector) compressedVector0);
      assertEquals(1.0, compressedVector1.density(), 0.01);
      assertFalse(compressedVector1.equals((Object)compressedVector0));
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }
}
