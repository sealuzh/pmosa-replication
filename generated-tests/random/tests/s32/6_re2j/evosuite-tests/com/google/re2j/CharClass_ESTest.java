/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:09:16 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.CharClass;
import com.google.re2j.CharGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharClass_ESTest extends CharClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = 65;
      intArray0[0] = 65;
      intArray0[1] = 256;
      CharClass charClass0 = new CharClass(intArray0);
      int int1 = 0;
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      charClass1.appendFoldedClass(intArray0);
      CharClass charClass2 = charClass0.appendRange(0, 256);
      charClass2.appendNegatedClass(intArray0);
      charClass0.appendFoldedClass(intArray0);
      CharClass charClass3 = charClass0.appendNegatedClass(intArray0);
      charClass3.appendFoldedRange((-783), 65);
      int[][] intArray1 = new int[6][2];
      int[] intArray2 = new int[0];
      intArray1[0] = intArray2;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      int[] intArray3 = new int[0];
      intArray1[5] = intArray3;
      // Undeclared exception!
      try { 
        charClass2.appendTableWithSign(intArray1, 1114111);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = 3805;
      intArray0[1] = (-420);
      intArray0[2] = (-288);
      charClass0.appendFoldedClass(intArray0);
      intArray0[3] = 32;
      intArray0[4] = 3805;
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      intArray0[5] = 9;
      intArray0[6] = (-1095);
      intArray0[7] = 69709;
      charClass0.appendClass(intArray0);
      CharClass charClass3 = charClass0.appendFoldedClass(intArray0);
      int[][] intArray1 = new int[9][9];
      charClass2.negateClass();
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      intArray1[8] = intArray0;
      charClass3.appendTable(intArray1);
      charClass3.cleanClass();
      int[] intArray2 = charClass2.toArray();
      assertArrayEquals(new int[] {69710, 1114111}, intArray2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-397);
      intArray0[1] = 608;
      intArray0[2] = (-241);
      intArray0[3] = (-1767);
      intArray0[4] = (-836);
      intArray0[5] = 2;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, 608);
      CharClass charClass2 = charClass1.appendRange((-836), 595);
      CharClass charClass3 = charClass2.appendFoldedClass(intArray0);
      CharClass charClass4 = charClass3.cleanClass();
      CharClass charClass5 = charClass4.appendFoldedRange(595, (-1767));
      charClass5.appendClass(intArray0);
      assertArrayEquals(new int[] {(-397), 608, (-241), (-1767), (-836), 608}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      int[][] intArray0 = new int[2][9];
      int[] intArray1 = new int[5];
      int int0 = 3169;
      intArray1[0] = 3169;
      intArray1[1] = 862;
      intArray1[2] = (-1040);
      intArray1[3] = 68154;
      intArray1[4] = 2;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[3];
      intArray2[0] = 2;
      intArray2[1] = 862;
      intArray2[2] = 2;
      intArray0[1] = intArray2;
      CharClass charClass2 = charClass1.appendTableWithSign(intArray0, (-1451));
      // Undeclared exception!
      try { 
        charClass2.appendNegatedClass(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      intArray0[1] = 66640;
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-1));
      CharClass charClass2 = charClass1.appendClass(intArray0);
      CharClass charClass3 = charClass2.negateClass();
      CharClass charClass4 = charClass3.appendLiteral((-2241), (-1));
      charClass4.appendClass(intArray0);
      CharClass charClass5 = charClass4.cleanClass();
      int[] intArray1 = new int[8];
      intArray1[0] = (-1);
      intArray1[1] = 66640;
      intArray1[2] = (-2241);
      intArray1[3] = (-1);
      intArray1[4] = 66640;
      intArray1[5] = 66640;
      intArray1[6] = (-1);
      intArray1[7] = (-2241);
      charClass5.appendClassWithSign(intArray1, 3212);
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 66640);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = (-1368);
      int int1 = 66;
      CharClass charClass1 = charClass0.appendFoldedRange((-1368), 66);
      int[] intArray0 = null;
      // Undeclared exception!
      try { 
        charClass1.appendFoldedClass((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange((-456), (-456));
      int[] intArray0 = new int[8];
      intArray0[0] = 66640;
      intArray0[1] = (-456);
      intArray0[2] = (-456);
      intArray0[3] = (-456);
      intArray0[4] = 1445;
      intArray0[5] = (-456);
      intArray0[6] = (-456);
      intArray0[7] = (-456);
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      CharClass charClass3 = charClass2.appendFoldedClass(intArray0);
      CharClass charClass4 = charClass3.appendClass(intArray0);
      CharClass charClass5 = charClass4.appendLiteral(66640, (-905));
      assertSame(charClass3, charClass5);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1140;
      intArray0[1] = (-49);
      intArray0[2] = (-1583);
      intArray0[3] = 120379;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendFoldedClass(intArray0);
      CharClass charClass1 = charClass0.appendRange(1140, 3110);
      int[][] intArray1 = new int[1][2];
      int[] intArray2 = new int[0];
      charClass1.cleanClass();
      CharClass charClass2 = charClass1.appendClass(intArray0);
      charClass2.toString();
      intArray1[0] = intArray2;
      // Undeclared exception!
      try { 
        charClass1.appendTableWithSign(intArray1, 1429);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 11358;
      intArray0[0] = 11358;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.toArray();
      int[][] intArray1 = new int[5][4];
      // Undeclared exception!
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = (-1);
      CharClass charClass1 = charClass0.appendFoldedRange((-1), (-1));
      // Undeclared exception!
      try { 
        charClass1.appendGroup((CharGroup) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = charClass0.toArray();
      int[][] intArray1 = new int[0][1];
      charClass0.appendNegatedTable(intArray1);
      int[][] intArray2 = new int[3][8];
      intArray2[0] = intArray0;
      intArray2[1] = intArray0;
      int[] intArray3 = new int[3];
      int int0 = 10089;
      intArray3[0] = 10089;
      intArray3[1] = 2426;
      int int1 = 2444;
      intArray3[2] = 2444;
      int[] intArray4 = new int[2];
      intArray4[0] = 2444;
      intArray4[1] = 10089;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray4, 10089);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 8;
      intArray0[0] = 8;
      intArray0[1] = 0;
      intArray0[2] = (-331);
      intArray0[3] = 1882;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass1.appendClass(intArray0);
      charClass1.cleanClass();
      charClass2.appendClass(intArray0);
      // Undeclared exception!
      charClass2.appendFoldedRange(1882, 1114111);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[8][9];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      int[] intArray2 = new int[1];
      intArray2[0] = 0;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[8];
      intArray3[0] = 0;
      intArray3[1] = 0;
      intArray3[2] = 0;
      intArray3[3] = 0;
      intArray3[4] = 0;
      intArray3[5] = 4786;
      intArray3[6] = 0;
      intArray3[7] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[7];
      intArray4[0] = 0;
      intArray4[1] = 4786;
      intArray4[2] = 0;
      intArray4[3] = 4786;
      intArray4[4] = 66639;
      intArray4[5] = 4786;
      intArray4[6] = 0;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[0];
      intArray0[4] = intArray5;
      int[] intArray6 = new int[5];
      intArray6[0] = 0;
      intArray6[1] = 0;
      intArray6[2] = 66639;
      intArray6[3] = 0;
      intArray6[4] = 4786;
      intArray0[5] = intArray6;
      int[] intArray7 = new int[4];
      intArray7[0] = 66639;
      intArray7[1] = 4786;
      intArray7[2] = 0;
      intArray7[3] = 4786;
      intArray0[6] = intArray7;
      int[] intArray8 = new int[5];
      intArray8[0] = 66639;
      intArray8[1] = 0;
      intArray8[2] = 66639;
      intArray8[3] = 66639;
      intArray8[4] = 66639;
      intArray0[7] = intArray8;
      // Undeclared exception!
      try { 
        charClass0.appendTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = null;
      CharClass charClass0 = null;
      try {
        charClass0 = new CharClass((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral(2402, 2402);
      CharClass charClass2 = charClass1.appendLiteral(2418, 847);
      int[] intArray0 = new int[6];
      intArray0[0] = 2402;
      intArray0[1] = 2402;
      intArray0[2] = 2402;
      intArray0[3] = 2402;
      intArray0[4] = 2402;
      charClass0.appendFoldedClass(intArray0);
      intArray0[5] = 2402;
      CharClass charClass3 = charClass1.appendClass(intArray0);
      int[][] intArray1 = new int[6][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      charClass3.appendTableWithSign(intArray1, 2411);
      charClass0.toString();
      CharClass charClass4 = charClass2.appendNegatedClass(intArray0);
      assertSame(charClass4, charClass0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = 590;
      intArray0[1] = 531;
      intArray0[2] = 423;
      intArray0[3] = 2066;
      intArray0[4] = 2390;
      intArray0[5] = 2407;
      intArray0[6] = 66639;
      intArray0[7] = 2413;
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      int[][] intArray1 = new int[0][5];
      CharClass charClass2 = charClass1.appendTableWithSign(intArray1, 590);
      CharClass charClass3 = charClass2.appendFoldedRange(65123, 2411);
      int[] intArray2 = new int[1];
      intArray2[0] = 2413;
      // Undeclared exception!
      try { 
        charClass3.appendClassWithSign(intArray2, 590);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1781);
      intArray0[1] = 621;
      intArray0[2] = 10181;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 93);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[0];
      int int0 = 3264;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 3264);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[9];
      intArray0[0] = 1140;
      int int0 = 851;
      intArray0[1] = 851;
      intArray0[2] = (-2929);
      int int1 = 21;
      intArray0[3] = 21;
      int int2 = (-2186);
      intArray0[4] = (-2186);
      int int3 = 65091;
      intArray0[5] = 65091;
      int int4 = 6678;
      intArray0[6] = 6678;
      intArray0[7] = 541;
      intArray0[8] = 2400;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, (-2929));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[4][0];
      int[] intArray1 = new int[6];
      intArray1[0] = 2429;
      int int0 = 1425;
      // Undeclared exception!
      try { 
        charClass0.appendTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 3018;
      intArray0[1] = 1121;
      intArray0[2] = (-1);
      CharClass.charClassToString(intArray0, (-1));
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      int[][] intArray1 = new int[0][9];
      CharClass charClass2 = charClass1.appendTable(intArray1);
      charClass1.cleanClass();
      int[][] intArray2 = new int[1][5];
      intArray2[0] = intArray0;
      CharClass charClass3 = charClass2.appendTableWithSign(intArray2, (-1));
      // Undeclared exception!
      try { 
        charClass3.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[0] = 1764;
      intArray0[1] = 2412;
      intArray0[2] = 2431;
      intArray0[3] = (-2370);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      CharClass charClass2 = charClass1.appendClassWithSign(intArray0, 2431);
      CharClass charClass3 = charClass2.cleanClass();
      int[][] intArray1 = new int[9][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      int[] intArray2 = new int[9];
      intArray2[0] = (-2370);
      intArray2[1] = 1764;
      intArray2[2] = 1764;
      intArray2[3] = (-2370);
      intArray2[4] = (-922);
      intArray2[5] = 2412;
      intArray2[6] = 2412;
      intArray2[7] = 2412;
      intArray2[8] = (-2370);
      intArray1[6] = intArray2;
      intArray1[7] = intArray0;
      intArray1[8] = intArray0;
      CharClass charClass4 = charClass3.appendTableWithSign(intArray1, 1304);
      int[][] intArray3 = new int[6][0];
      intArray3[0] = intArray2;
      intArray3[1] = intArray2;
      intArray3[2] = intArray0;
      intArray3[3] = intArray0;
      intArray3[4] = intArray2;
      intArray3[5] = intArray2;
      CharClass charClass5 = charClass4.appendTable(intArray3);
      CharClass charClass6 = charClass5.appendTable(intArray3);
      assertSame(charClass0, charClass6);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 1114111;
      intArray0[1] = 1;
      intArray0[2] = (-968);
      intArray0[3] = 2427;
      intArray0[4] = 2073;
      intArray0[5] = 3632;
      intArray0[6] = (-598);
      intArray0[7] = (-4615);
      intArray0[8] = 671;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedRange(2403, 671);
      int[][] intArray1 = new int[3][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      CharClass charClass2 = charClass1.appendTable(intArray1);
      // Undeclared exception!
      try { 
        charClass2.appendClassWithSign(intArray0, (-3312));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }
}
