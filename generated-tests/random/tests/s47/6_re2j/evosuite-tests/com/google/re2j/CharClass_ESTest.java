/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:22:37 GMT 2019
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
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = (-1469);
      intArray0[2] = 1;
      intArray0[3] = (-2);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      int[][] intArray1 = new int[5][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      CharClass charClass2 = charClass1.appendTableWithSign(intArray1, (-5598));
      CharClass charClass3 = charClass2.appendTable(intArray1);
      CharClass charClass4 = charClass3.appendFoldedRange(0, 0);
      CharClass charClass5 = charClass4.negateClass();
      charClass5.appendFoldedRange(8096, 4176);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1008;
      intArray0[1] = (-964);
      intArray0[2] = 602;
      intArray0[3] = 17;
      intArray0[4] = (-21);
      intArray0[5] = (-67);
      intArray0[6] = (-1760);
      intArray0[7] = 3241;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass1.appendFoldedClass(intArray0);
      int[][] intArray1 = new int[9][7];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      intArray1[8] = intArray0;
      CharClass charClass3 = charClass2.appendNegatedTable(intArray1);
      CharClass charClass4 = charClass3.appendRange(3258, 387);
      charClass4.cleanClass();
      charClass1.toArray();
      charClass4.cleanClass();
      charClass4.toArray();
      assertArrayEquals(new int[] {(-1760), 3241, 8490, 8491, 7838, 7838, 224, 224}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 1349;
      CharClass charClass1 = charClass0.appendFoldedRange(1349, 1349);
      int[] intArray0 = new int[9];
      int int1 = 1114111;
      intArray0[0] = 1114111;
      intArray0[1] = 1349;
      intArray0[2] = 1349;
      intArray0[3] = 1349;
      intArray0[4] = 1349;
      int int2 = 12290;
      intArray0[5] = 12290;
      intArray0[6] = 1349;
      intArray0[7] = 1349;
      intArray0[8] = 1349;
      // Undeclared exception!
      charClass1.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[3];
      int int0 = 6210;
      intArray0[0] = 6210;
      int int1 = 1114111;
      intArray0[1] = 1114111;
      int int2 = 1114111;
      intArray0[2] = 1114111;
      CharClass charClass0 = new CharClass(intArray0);
      // Undeclared exception!
      charClass0.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1589);
      intArray0[1] = 619;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.appendFoldedClass(intArray0);
      charClass2.appendNegatedClass(intArray0);
      charClass0.appendFoldedClass(intArray0);
      int[][] intArray1 = new int[6][1];
      // Undeclared exception!
      try { 
        charClass1.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(4103, (-1589));
      CharClass charClass2 = charClass1.negateClass();
      int[][] intArray0 = new int[7][6];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      int[] intArray2 = new int[9];
      intArray2[0] = 616;
      intArray2[1] = 4103;
      intArray2[2] = 4103;
      intArray2[3] = 4103;
      intArray2[4] = 4103;
      intArray2[5] = (-1589);
      intArray2[6] = (-1589);
      intArray2[7] = (-1589);
      intArray2[8] = 393;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[5];
      intArray3[0] = 167;
      intArray3[1] = 1221;
      intArray3[2] = 1624;
      intArray3[3] = 393;
      intArray3[4] = (-1589);
      intArray0[2] = intArray3;
      int[] intArray4 = new int[4];
      intArray4[0] = 4103;
      intArray4[1] = 393;
      intArray4[2] = 4103;
      intArray4[3] = 1221;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[5];
      intArray5[0] = 1624;
      intArray5[1] = 1221;
      intArray5[2] = 1221;
      intArray5[3] = 1221;
      intArray5[4] = 4103;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[2];
      intArray6[0] = 167;
      intArray6[1] = 167;
      intArray0[5] = intArray6;
      int[] intArray7 = new int[2];
      intArray7[0] = 119638;
      intArray7[1] = 616;
      intArray0[6] = intArray7;
      // Undeclared exception!
      try { 
        charClass2.appendTableWithSign(intArray0, 393);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][2];
      CharClass charClass1 = charClass0.appendNegatedTable(intArray0);
      charClass1.toString();
      int[][] intArray1 = new int[0][4];
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      charClass2.negateClass();
      charClass2.cleanClass();
      charClass2.toString();
      int int0 = (-172);
      charClass0.appendTableWithSign(intArray1, (-172));
      CharClass charClass3 = charClass1.cleanClass();
      int[] intArray2 = new int[9];
      intArray2[0] = (-172);
      intArray2[1] = (-172);
      intArray2[2] = (-172);
      intArray2[3] = (-172);
      intArray2[4] = (-172);
      intArray2[5] = (-172);
      intArray2[6] = (-172);
      intArray2[7] = (-172);
      intArray2[8] = (-172);
      // Undeclared exception!
      try { 
        charClass3.appendNegatedClass(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 127278;
      CharClass charClass1 = charClass0.appendFoldedRange((-2198), 127278);
      int[] intArray0 = new int[6];
      intArray0[0] = 127278;
      intArray0[1] = (-2198);
      intArray0[2] = (-2198);
      intArray0[3] = 127278;
      intArray0[4] = (-2198);
      intArray0[5] = 127278;
      CharClass charClass2 = charClass1.appendClass(intArray0);
      CharClass charClass3 = charClass2.appendClassWithSign(intArray0, (-2198));
      CharClass charClass4 = charClass3.appendLiteral(127278, 127278);
      int[][] intArrayArray0 = null;
      // Undeclared exception!
      try { 
        charClass4.appendTable((int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 0;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign((int[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      int[] intArray0 = new int[0];
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      CharClass charClass3 = charClass2.appendClassWithSign(intArray0, 0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass3.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1593);
      intArray0[1] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendClassWithSign(intArray0, 0);
      charClass0.appendClassWithSign(intArray0, 0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-1593));
      int[][] intArray1 = new int[2][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass1.appendTableWithSign(intArray1, (-1593));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      int[][] intArray0 = new int[9][6];
      int[] intArray1 = new int[5];
      intArray1[0] = 2316;
      intArray1[1] = (-261);
      intArray1[2] = 0;
      intArray1[3] = 451;
      intArray1[4] = 2714;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[1];
      intArray2[0] = (-261);
      intArray0[1] = intArray2;
      int[] intArray3 = new int[3];
      intArray3[0] = 0;
      intArray3[1] = 2714;
      intArray3[2] = (-261);
      intArray0[2] = intArray3;
      int[] intArray4 = new int[0];
      intArray0[3] = intArray4;
      int[] intArray5 = new int[3];
      intArray5[0] = 2714;
      intArray5[1] = 0;
      intArray5[2] = 0;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[9];
      intArray6[0] = 0;
      intArray6[1] = 0;
      intArray6[2] = 0;
      intArray6[3] = 0;
      intArray6[4] = 2316;
      intArray6[5] = (-261);
      intArray6[6] = 2714;
      intArray6[7] = (-261);
      intArray6[8] = 451;
      intArray0[5] = intArray6;
      int[] intArray7 = new int[9];
      intArray7[0] = 921;
      intArray7[1] = (-261);
      intArray7[2] = 0;
      intArray7[3] = (-937);
      intArray7[4] = 0;
      intArray7[5] = 2316;
      intArray7[6] = (-261);
      intArray7[7] = 451;
      intArray7[8] = 2714;
      intArray0[6] = intArray7;
      int[] intArray8 = new int[8];
      intArray8[0] = 2316;
      intArray8[1] = 921;
      intArray8[2] = (-261);
      intArray8[3] = (-261);
      intArray8[4] = (-937);
      intArray8[5] = 0;
      intArray8[6] = 2714;
      intArray8[7] = 451;
      intArray0[7] = intArray8;
      int[] intArray9 = new int[7];
      intArray9[0] = 0;
      intArray9[1] = (-261);
      intArray9[2] = 2316;
      intArray9[3] = 0;
      intArray9[4] = 451;
      intArray9[5] = (-937);
      intArray9[6] = (-261);
      intArray0[8] = intArray9;
      // Undeclared exception!
      try { 
        charClass1.appendTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      // Undeclared exception!
      try { 
        charClass1.appendGroup((CharGroup) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[1];
      int int0 = 1214;
      intArray0[0] = 1214;
      // Undeclared exception!
      try { 
        charClass0.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = 0;
      intArray0[0] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[4][8];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-62);
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 1759;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-62));
      CharClass charClass2 = charClass1.appendLiteral((-1047), 0);
      int[][] intArray1 = new int[0][7];
      CharClass charClass3 = charClass2.appendTable(intArray1);
      charClass3.appendClassWithSign(intArray0, 0);
      assertArrayEquals(new int[] {(-62), 0, 0, 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[0];
      CharClass charClass1 = charClass0.appendFoldedRange(1050, 1050);
      CharClass charClass2 = charClass0.appendFoldedClass(intArray0);
      CharClass charClass3 = charClass2.negateClass();
      CharClass charClass4 = charClass1.appendRange((-2), (-2));
      charClass4.toArray();
      String string0 = charClass3.toString();
      assertEquals("[0x0-0x419 0x41b-0x439 0x43b-0x10ffff 0xfffffffe]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[4][2];
      int[] intArray1 = new int[6];
      intArray1[0] = (-2607);
      intArray1[1] = 0;
      intArray1[2] = 399;
      intArray1[3] = 614;
      intArray1[4] = 418;
      intArray1[5] = 42894;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[8];
      intArray2[0] = (-2884);
      intArray2[1] = 614;
      intArray2[2] = (-2607);
      intArray2[3] = 0;
      intArray2[4] = (-2607);
      intArray2[5] = 399;
      intArray2[6] = 418;
      intArray2[7] = 614;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[5];
      intArray3[0] = 418;
      intArray3[1] = 42894;
      intArray3[2] = 399;
      intArray3[3] = (-2607);
      intArray3[4] = 42894;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[6];
      intArray4[0] = 614;
      intArray4[1] = 42894;
      intArray4[2] = 614;
      intArray4[3] = (-2884);
      intArray4[4] = 399;
      intArray4[5] = 399;
      intArray0[3] = intArray4;
      // Undeclared exception!
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = (-620);
      intArray0[0] = (-620);
      CharClass charClass0 = new CharClass(intArray0);
      int[] intArray1 = new int[0];
      CharClass charClass1 = charClass0.appendFoldedClass(intArray1);
      int[][] intArray2 = new int[5][2];
      intArray2[0] = intArray1;
      intArray2[1] = intArray0;
      intArray2[2] = intArray0;
      intArray2[3] = intArray0;
      intArray2[4] = intArray0;
      // Undeclared exception!
      try { 
        charClass1.appendTable(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral(1324, 15);
      int[] intArray0 = new int[2];
      intArray0[0] = 2293;
      intArray0[1] = 1324;
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      charClass0.appendFoldedRange(660, 660);
      CharClass charClass3 = charClass2.cleanClass();
      charClass3.cleanClass();
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 371);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-2);
      intArray0[2] = (-253);
      intArray0[3] = (-1377);
      intArray0[4] = 93;
      intArray0[5] = 449;
      intArray0[6] = (-569);
      intArray0[7] = 615;
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      CharClass charClass2 = charClass1.cleanClass();
      int[][] intArray1 = new int[3][9];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, (-253));
      CharClass charClass4 = charClass3.appendNegatedClass(intArray0);
      int[] intArray2 = new int[7];
      intArray2[0] = (-1377);
      intArray2[1] = 93;
      intArray2[2] = 93;
      intArray2[3] = 93;
      intArray2[4] = 724;
      intArray2[5] = (-1);
      intArray2[6] = (-253);
      // Undeclared exception!
      try { 
        charClass4.appendClassWithSign(intArray2, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = null;
      int int0 = 0;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign((int[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-348);
      intArray0[1] = (-984);
      intArray0[2] = 64;
      intArray0[3] = 66640;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedRange(66640, (-984));
      int[][] intArray1 = new int[5][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      CharClass charClass2 = charClass1.appendTableWithSign(intArray1, (-229));
      CharClass charClass3 = charClass2.appendNegatedClass(intArray0);
      int[][] intArray2 = new int[0][4];
      CharClass charClass4 = charClass3.appendNegatedTable(intArray2);
      CharClass charClass5 = charClass4.negateClass();
      charClass5.appendFoldedRange(334, 613);
      assertArrayEquals(new int[] {(-348), (-984), 64, 66640}, intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = null;
      int int0 = 615;
      // Undeclared exception!
      try { 
        CharClass.charClassToString((int[]) null, 615);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = null;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedClass((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1972;
      intArray0[1] = 2921;
      intArray0[2] = 502;
      intArray0[3] = 8096;
      intArray0[4] = 78;
      intArray0[5] = 688;
      intArray0[6] = 3458;
      intArray0[7] = 1;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendRange((-2528), 688);
      int[][] intArray1 = new int[7][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      CharClass charClass2 = charClass1.appendTable(intArray1);
      CharClass charClass3 = charClass2.appendClassWithSign(intArray0, 78);
      CharClass charClass4 = charClass3.appendFoldedRange(502, 1);
      charClass4.appendLiteral(3458, 2921);
      assertArrayEquals(new int[] {1972, 2921, 502, 8096, (-2528), 688, 3458, 1}, intArray0);
  }
}
