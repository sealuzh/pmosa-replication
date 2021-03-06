/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:10:43 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.CharClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharClass_ESTest extends CharClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1114112;
      intArray0[1] = 1610;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.toString();
      charClass0.appendFoldedClass(intArray0);
      charClass0.appendRange(18, 32);
      int[][] intArray1 = new int[1][3];
      intArray1[0] = intArray0;
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign(intArray1, 1114112);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = 969;
      intArray0[2] = (-664);
      intArray0[3] = (-1780);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      intArray0[4] = (-6133);
      charClass0.negateClass();
      intArray0[5] = (-2);
      charClass0.cleanClass();
      intArray0[6] = 1062;
      intArray0[7] = 66640;
      CharClass charClass2 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass3 = charClass2.appendNegatedClass(intArray0);
      charClass0.toString();
      charClass3.toString();
      charClass2.appendRange((-6133), (-2));
      charClass3.negateClass();
      int[] intArray1 = charClass1.toArray();
      // Undeclared exception!
      charClass1.appendFoldedClass(intArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1600;
      intArray0[1] = 1577;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-487));
      CharClass charClass2 = charClass1.appendClass(intArray0);
      CharClass charClass3 = charClass2.appendFoldedClass(intArray0);
      CharClass charClass4 = charClass3.appendLiteral(120015, 0);
      CharClass charClass5 = charClass4.appendNegatedClass(intArray0);
      charClass5.cleanClass();
      assertArrayEquals(new int[] {0, 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][4];
      int[] intArray1 = new int[5];
      charClass0.appendRange(91, 91);
      intArray1[0] = (-776);
      intArray1[1] = 2575;
      intArray1[2] = 188;
      intArray1[3] = 180;
      intArray1[4] = 73728;
      intArray0[0] = intArray1;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, 393);
      CharClass charClass2 = charClass1.appendNegatedTable(intArray0);
      CharClass.charClassToString(intArray1, (-103));
      CharClass charClass3 = charClass2.negateClass();
      charClass3.appendTableWithSign(intArray0, 759);
      CharClass charClass4 = charClass2.cleanClass();
      CharClass charClass5 = charClass4.negateClass();
      charClass5.appendLiteral(1057, 188);
      charClass0.appendTable(intArray0);
      int[] intArray2 = new int[7];
      intArray2[0] = 73728;
      intArray2[1] = 188;
      intArray2[2] = 180;
      intArray2[3] = 2575;
      intArray2[4] = 91;
      intArray2[5] = 1057;
      intArray2[6] = 91;
      // Undeclared exception!
      try { 
        charClass3.appendNegatedClass(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[6];
      intArray0[0] = (-712);
      intArray0[1] = (-1524);
      intArray0[2] = 572;
      intArray0[3] = 408;
      intArray0[4] = 4844;
      intArray0[5] = 120629;
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.appendClassWithSign(intArray0, 4844);
      int[][] intArray1 = new int[8][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      int[] intArray2 = new int[3];
      intArray2[0] = (-712);
      intArray2[1] = 120629;
      intArray2[2] = 120629;
      intArray1[3] = intArray2;
      int[] intArray3 = new int[7];
      intArray3[0] = 408;
      intArray3[1] = 572;
      intArray3[2] = 120629;
      intArray3[3] = 572;
      intArray3[4] = 572;
      intArray3[5] = 572;
      intArray3[6] = 408;
      intArray1[4] = intArray3;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      CharClass charClass3 = charClass2.appendNegatedTable(intArray1);
      CharClass charClass4 = charClass3.appendTable(intArray1);
      CharClass charClass5 = charClass4.appendRange(572, 937);
      int[] intArray4 = charClass5.toArray();
      assertEquals(4, intArray4.length);
      assertArrayEquals(new int[] {(-1523), 4843, (-712), 1114111}, intArray4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      // Undeclared exception!
      try { 
        charClass0.appendTable((int[][]) null);
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
      charClass0.negateClass();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 144);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-1119);
      intArray0[1] = 0;
      intArray0[2] = (-153);
      int int0 = 0;
      intArray0[3] = 0;
      int int1 = 7144;
      intArray0[4] = 7144;
      CharClass charClass0 = new CharClass(intArray0);
      // Undeclared exception!
      try { 
        charClass0.appendFoldedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 598;
      CharClass charClass1 = charClass0.appendFoldedRange(2724, 598);
      CharClass charClass2 = charClass1.negateClass();
      int[] intArray0 = new int[6];
      intArray0[0] = 2724;
      intArray0[1] = 598;
      intArray0[2] = 598;
      intArray0[3] = 2724;
      charClass2.appendRange(598, 2724);
      intArray0[4] = 598;
      intArray0[5] = 598;
      CharClass charClass3 = charClass2.appendClass(intArray0);
      int[] intArray1 = new int[0];
      CharClass charClass4 = charClass3.appendFoldedClass(intArray1);
      int[][] intArray2 = new int[5][2];
      intArray2[0] = intArray1;
      intArray2[1] = intArray0;
      intArray2[2] = intArray0;
      intArray2[3] = intArray0;
      intArray2[4] = intArray0;
      // Undeclared exception!
      try { 
        charClass4.appendNegatedTable(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[8][7];
      int[] intArray1 = new int[1];
      intArray1[0] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[1];
      intArray2[0] = 0;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[1];
      intArray3[0] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[1];
      intArray4[0] = 0;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[9];
      intArray5[0] = 0;
      intArray5[1] = 0;
      intArray5[2] = 0;
      intArray5[3] = 0;
      intArray5[4] = 0;
      intArray5[5] = 0;
      intArray5[6] = 0;
      intArray5[7] = 0;
      intArray5[8] = 0;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[4];
      intArray6[0] = 0;
      intArray6[1] = 0;
      intArray6[2] = (-2326);
      intArray6[3] = 0;
      intArray0[5] = intArray6;
      int[] intArray7 = new int[4];
      intArray7[0] = (-2326);
      intArray7[1] = 0;
      intArray7[2] = (-2326);
      intArray7[3] = (-2326);
      intArray0[6] = intArray7;
      int[] intArray8 = new int[7];
      intArray8[0] = 0;
      intArray8[1] = (-2326);
      intArray8[2] = 0;
      intArray8[3] = (-1346);
      intArray8[4] = (-2326);
      intArray8[5] = (-2326);
      intArray8[6] = 0;
      intArray0[7] = intArray8;
      // Undeclared exception!
      try { 
        charClass0.appendTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][1];
      CharClass charClass1 = charClass0.appendNegatedTable(intArray0);
      int[] intArray1 = new int[4];
      intArray1[0] = 0;
      int int0 = 43225;
      intArray1[1] = 43225;
      int int1 = (-543);
      intArray1[2] = (-543);
      int int2 = 1493;
      intArray1[3] = 1493;
      CharClass charClass2 = charClass1.appendClassWithSign(intArray1, 0);
      CharClass charClass3 = charClass2.appendTable(intArray0);
      int int3 = 0;
      charClass3.appendLiteral(0, 1493);
      // Undeclared exception!
      charClass3.appendFoldedClass(intArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 11556;
      intArray0[1] = (-1427);
      intArray0[2] = 4298;
      intArray0[3] = 4;
      intArray0[4] = (-243);
      intArray0[5] = (-836);
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 4298);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[8][0];
      int[] intArray1 = new int[7];
      intArray1[0] = (-2);
      intArray1[1] = (-1426);
      intArray1[2] = 1;
      intArray1[3] = 2170;
      intArray1[4] = 12446;
      intArray1[5] = 66640;
      intArray1[6] = 8489;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[8];
      intArray2[0] = 2170;
      intArray2[1] = 1;
      intArray2[2] = 12446;
      intArray2[3] = (-1426);
      intArray2[4] = 2170;
      intArray2[5] = 2170;
      intArray2[6] = (-1426);
      intArray2[7] = 790;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[4];
      intArray3[0] = 1;
      intArray3[1] = (-1612);
      intArray3[2] = 12446;
      intArray3[3] = (-1426);
      intArray0[2] = intArray3;
      int[] intArray4 = new int[7];
      intArray4[0] = 790;
      intArray4[1] = 42892;
      intArray4[2] = (-2);
      intArray4[3] = (-2);
      intArray4[4] = 1567;
      intArray4[5] = 2170;
      intArray4[6] = 2170;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[9];
      intArray5[0] = (-1612);
      intArray5[1] = (-2);
      intArray5[2] = 66640;
      intArray5[3] = (-1612);
      intArray5[4] = 66640;
      intArray5[5] = (-2);
      intArray5[6] = 2170;
      intArray5[7] = (-2);
      intArray5[8] = 2170;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[4];
      intArray6[0] = (-1612);
      intArray6[1] = 42892;
      intArray6[2] = 3123;
      intArray6[3] = (-2);
      intArray0[5] = intArray6;
      int[] intArray7 = new int[7];
      intArray7[0] = 66640;
      intArray7[1] = 42892;
      intArray7[2] = 12446;
      intArray7[3] = 1;
      intArray7[4] = (-2);
      intArray7[5] = 12446;
      intArray7[6] = 8489;
      intArray0[6] = intArray7;
      int[] intArray8 = new int[9];
      intArray8[0] = 790;
      intArray8[1] = 2170;
      intArray8[2] = 1567;
      intArray8[3] = 66640;
      intArray8[4] = 2170;
      intArray8[5] = 790;
      intArray8[6] = (-2);
      intArray8[7] = (-1426);
      intArray8[8] = 1567;
      intArray0[7] = intArray8;
      // Undeclared exception!
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange(938, 938);
      int[] intArray0 = new int[3];
      intArray0[0] = 938;
      int[][] intArray1 = new int[8][7];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      charClass0.appendTableWithSign(intArray1, 938);
      intArray0[1] = 938;
      intArray0[2] = 938;
      CharClass charClass1 = charClass0.cleanClass();
      int int0 = 0;
      charClass0.toString();
      CharClass charClass2 = charClass1.negateClass();
      // Undeclared exception!
      try { 
        charClass2.appendClassWithSign(intArray0, 938);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral((-642), (-642));
      int[] intArray0 = new int[0];
      CharClass charClass2 = charClass1.appendClassWithSign(intArray0, (-29));
      CharClass charClass3 = charClass2.negateClass();
      CharClass charClass4 = charClass3.negateClass();
      charClass3.appendLiteral((-642), (-642));
      CharClass charClass5 = charClass4.negateClass();
      int[] intArray1 = new int[5];
      intArray1[0] = (-29);
      charClass1.appendClass(intArray0);
      intArray1[1] = (-642);
      intArray1[2] = (-29);
      intArray1[3] = (-29);
      charClass2.appendRange(400, (-29));
      intArray1[4] = (-642);
      String string0 = CharClass.charClassToString(intArray1, (-156));
      charClass3.toString();
      CharClass.charClassToString((int[]) null, (-642));
      CharClass charClass6 = charClass5.appendRange((-642), 66);
      int[] intArray2 = charClass6.toArray();
      charClass5.appendFoldedClass(intArray2);
      charClass0.appendRange((-524), 385);
      String string1 = CharClass.charClassToString((int[]) null, (-1079));
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange((-2551), (-2551));
      CharClass charClass2 = charClass1.cleanClass();
      CharClass charClass3 = charClass2.appendRange(11553, 0);
      charClass3.toString();
      int[] intArray0 = new int[5];
      intArray0[0] = 655359;
      intArray0[1] = (-2551);
      intArray0[2] = (-2551);
      intArray0[3] = (-2551);
      intArray0[4] = (-2551);
      // Undeclared exception!
      try { 
        charClass2.appendFoldedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1101);
      intArray0[2] = (-4072530);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendRange(0, (-1101));
      int[][] intArray1 = new int[9][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      int[] intArray2 = new int[1];
      intArray2[0] = (-2);
      intArray1[8] = intArray2;
      // Undeclared exception!
      try { 
        charClass1.appendTableWithSign(intArray1, (-189));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 4298;
      intArray0[1] = 4041;
      intArray0[2] = 1491;
      intArray0[3] = 1694;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass0.appendClass(intArray0);
      int[][] intArray1 = new int[0][9];
      charClass2.appendTableWithSign(intArray1, (-1707));
      charClass2.cleanClass();
      int[][] intArray2 = new int[3][9];
      intArray2[0] = intArray0;
      intArray2[1] = intArray0;
      intArray2[2] = intArray0;
      CharClass charClass3 = charClass1.appendNegatedTable(intArray2);
      charClass1.toString();
      CharClass charClass4 = charClass3.appendFoldedClass(intArray0);
      charClass1.toString();
      charClass2.appendFoldedClass(intArray0);
      charClass2.appendClass(intArray0);
      charClass4.appendNegatedClass(intArray0);
      // Undeclared exception!
      charClass1.appendFoldedRange((-2419), 4280);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(11547, 11547);
      int[] intArray0 = new int[5];
      intArray0[0] = 11547;
      intArray0[1] = 11547;
      intArray0[2] = 9;
      intArray0[3] = 11547;
      intArray0[4] = 11547;
      // Undeclared exception!
      try { 
        charClass1.appendClassWithSign(intArray0, 11547);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-126);
      intArray0[1] = (-1);
      intArray0[2] = 32;
      intArray0[3] = (-2327);
      intArray0[4] = 11547;
      intArray0[5] = 953;
      intArray0[6] = 1808;
      String string0 = CharClass.charClassToString(intArray0, (-825));
      assertEquals("[]", string0);
  }
}
