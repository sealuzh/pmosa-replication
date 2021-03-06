/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 06:22:20 GMT 2019
 */

package org.la4j.vector.sparse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Vector;
import org.la4j.iterator.VectorIterator;
import org.la4j.operation.VectorOperation;
import org.la4j.operation.ooplace.OoPlaceInnerProduct;
import org.la4j.vector.SparseVector;
import org.la4j.vector.VectorFactory;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorPredicate;
import org.la4j.vector.functor.VectorProcedure;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompressedVector_ESTest extends CompressedVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(2);
      hashMap0.put(integer0, integer0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2693);
      assertEquals(1, compressedVector0.cardinality());
      
      compressedVector0.set(1728, (-4163.6));
      assertEquals(7.426661715558856E-4, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(1000);
      assertEquals(1000, compressedVector1.length());
      assertEquals(0, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      Integer integer0 = new Integer(0);
      Byte byte0 = new Byte((byte)32);
      hashMap0.put(integer0, byte0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, (byte)32);
      assertEquals(0.03125, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)80;
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
      CompressedVector compressedVector0 = new CompressedVector(502);
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      VectorIterator vectorIterator0 = compressedVector0.nonZeroIterator();
      assertNotNull(vectorIterator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double((-1462.01817));
      linkedList0.add(double0);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)16, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(Double.NaN, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFactory<CompressedVector> vectorFactory0 = (VectorFactory<CompressedVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Vector) null).when(vectorFactory0).apply(anyInt());
      compressedVector0.to(vectorFactory0);
      assertEquals(7, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, (byte)32);
      // Undeclared exception!
      try { 
        compressedVector0.swapElements((byte)32, (-838));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(1678);
      // Undeclared exception!
      try { 
        compressedVector0.set((-3022), 1678);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '-3022' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.random(420, 955.0, (Random) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(0, 0);
      boolean boolean0 = compressedVector0.nonZeroAt(0);
      assertFalse(boolean0);
      assertEquals(0, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      boolean boolean0 = compressedVector0.nonZeroAt((-1478));
      assertEquals(8, compressedVector0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      Vector vector0 = compressedVector0.blankOfLength(8);
      assertEquals(8, vector0.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      // Undeclared exception!
      try { 
        compressedVector0.to((VectorFactory<CompressedVector>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2693);
      // Undeclared exception!
      try { 
        compressedVector0.swapElements(32, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromCollection((Collection<? extends Number>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 840);
      // Undeclared exception!
      try { 
        compressedVector0.blankOfLength((-129));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -129
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[5] = 2095.9279649796;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorPredicate vectorPredicate0 = mock(VectorPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(vectorPredicate0).test(anyInt() , anyDouble());
      boolean boolean0 = compressedVector0.is(vectorPredicate0);
      assertFalse(boolean0);
      assertEquals(0.14285714285714285, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 426.709485212;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      OoPlaceInnerProduct ooPlaceInnerProduct0 = new OoPlaceInnerProduct();
      VectorOperation<Double> vectorOperation0 = ooPlaceInnerProduct0.partiallyApply((SparseVector) compressedVector0);
      Double double0 = compressedVector0.apply(vectorOperation0);
      assertEquals(182080.98476989006, (double)double0, 0.01);
      assertEquals(0.2, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(3, 3469);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be less then or equal to capacity: 3469.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(28, (-3800));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -3800.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2693);
      compressedVector0.set(1728, (-4163.6));
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 453.3818716;
      doubleArray0[1] = 767.1396;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(0.2857142857142857, compressedVector0.density(), 0.01);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(0.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2460.41140262047;
      doubleArray0[1] = (-1068.3486);
      doubleArray0[5] = 360.618458999;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(2340, 5);
      assertEquals(0.375, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(2);
      hashMap0.put(integer0, integer0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2693);
      boolean boolean0 = compressedVector0.nonZeroAt(2);
      assertEquals(3.713330857779428E-4, compressedVector0.density(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(1519);
      hashMap0.put(integer0, integer0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2693);
      boolean boolean0 = compressedVector0.nonZeroAt(32);
      assertFalse(boolean0);
      assertEquals(3.713330857779428E-4, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(247);
      compressedVector0.set(1, 1);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)247).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(1, vectorFunction0);
      assertEquals(0.004048582995951417, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(247);
      compressedVector0.set(1, 1);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-4803.5471375875)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt((-2642), vectorFunction0);
      assertEquals(0.008097165991902834, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 3002.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(1, compressedVector0.cardinality());
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(1, vectorFunction0);
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      CompressedVector compressedVector0 = CompressedVector.random(1, (double) 1, (Random) mockRandom0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      // Undeclared exception!
      try { 
        compressedVector0.updateAt(1, vectorFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This vector can't grow up.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2455);
      compressedVector0.max();
      assertEquals(2455, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      doubleArray0[5] = 1248.482853399795;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      double double0 = compressedVector0.sum();
      assertEquals(1248.482853399795, double0, 0.01);
      assertEquals(0.1, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.each(vectorProcedure0);
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2627, 2627);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(613);
      assertEquals(2627, compressedVector0.length());
      assertEquals(613, compressedVector1.length());
      assertEquals(0.0, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 4645.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(0, 2877);
      assertEquals(0.14285714285714285, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2455);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.shuffle();
      assertEquals(2455, compressedVector1.length());
      assertEquals(0, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2455);
      compressedVector0.swapElements(2455, 1750);
      assertEquals(2455, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 840);
      assertEquals(0, compressedVector0.cardinality());
      
      compressedVector0.setAll(2.0);
      assertEquals(840, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.setAll((-3652.53));
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = 2.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.set(1, 1872.352);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (-1249.79);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.sliceLeft(1000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '7' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      Integer integer0 = new Integer(1434);
      hashMap0.put(integer0, (Byte) null);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, (-1512));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      HashMap<Integer, Long> hashMap0 = new HashMap<Integer, Long>();
      Integer integer0 = new Integer((-1));
      Long long0 = new Long((-1));
      hashMap0.putIfAbsent(integer0, long0);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, 48);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(1519);
      hashMap0.put(integer0, integer0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2693);
      compressedVector0.swapElements(32, 2);
      assertEquals(3.713330857779428E-4, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 0);
      compressedVector0.setAll(0.0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 2599.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertTrue(compressedVector1.equals((Object)compressedVector0));
      assertEquals(25, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test50()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(0.0, compressedVector1.density(), 0.01);
      assertArrayEquals(new byte[] {(byte)16, (byte)0, (byte)0, (byte)0, (byte)8, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = 3002.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.eachNonZero(vectorProcedure0);
      assertEquals(0.1111111111111111, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        CompressedVector.random((-1264), 0.0, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -1264
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-93));
      // Undeclared exception!
      try { 
        CompressedVector.random((-93), (-2312.3418), (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromCSV("zR");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromMatrixMarket("VH8PN}k(m kjKe");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(0, 0);
      // Undeclared exception!
      try { 
        compressedVector0.updateAt(1238, (VectorFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      SparseVector sparseVector0 = compressedVector0.toSparseVector();
      assertSame(sparseVector0, compressedVector0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HashMap<Byte, Double> hashMap0 = new HashMap<Byte, Double>();
      Set<Byte> set0 = hashMap0.keySet();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(set0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.iterator();
      assertEquals(5, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[5];
      CompressedVector compressedVector0 = new CompressedVector(37, 37, doubleArray0, intArray0);
      // Undeclared exception!
      try { 
        compressedVector0.multiply(227.8425280731564);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.la4j.vector.sparse.CompressedVector$1", e);
      }
  }
}
