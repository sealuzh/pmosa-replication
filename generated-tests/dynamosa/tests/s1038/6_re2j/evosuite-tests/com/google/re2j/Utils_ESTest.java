/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 12:56:00 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Utils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.emptyOpContext(65378, 48);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(97, 97);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.emptyOpContext(90, 90);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-647), 65);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[8];
      byteArray1[3] = (byte) (-107);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-68);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-68));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)9);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 0, 472);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 125);
      assertEquals("\\}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Utils.unhex(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes(")C_+)Y.;ERA~MK");
      int[] intArray1 = Utils.subarray(intArray0, 10, 12);
      assertArrayEquals(new int[] {65, 126}, intArray1);
      assertEquals(14, intArray0.length);
      assertEquals(2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 4, 4);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 760, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Utils.runeToString((-528));
      assertEquals("\uFDF0", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte) (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((byte) (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte)0);
      assertEquals("\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)0, 10);
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-1943), 7394);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 0, (-1948));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, 2, 2221);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte)111, (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte) (-1), (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.stringToRunes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, (-32));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = Utils.emptyOpContext(31, (-5359));
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.emptyOpContext(95, 95);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = Utils.emptyOpContext(892, 122);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)92;
      byteArray0[1] = (byte) (-111);
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)92;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-111));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-111);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-111);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-68));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Utils.subarray(byteArray0, (-1), (-1));
      int int0 = Utils.indexOf(byteArray0, byteArray1, 55);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, 8);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = Utils.subarray((byte[]) null, 10102, 10102);
      assertNotNull(byteArray0);
      
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-1));
      assertEquals(0, int0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-2881), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2881
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = Utils.subarray(intArray0, 0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = Utils.runeToString(1283);
      assertEquals("\u0503", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = Utils.runeToString(262142);
      assertEquals("\uFFFE", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (-241));
      assertEquals("\\xffffff0f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(2532);
      Utils.escapeRune(stringBuilder0, 2532);
      assertEquals("\\x{9e4}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 5167);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("]ja3|F$-<b");
      Utils.escapeRune(stringBuilder0, 92);
      assertEquals("]ja3|F$-<b\\\\", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = Utils.unhex(10102);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = Utils.unhex((-1240));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(139);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)0);
      assertFalse(boolean0);
  }
}
