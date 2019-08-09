/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 01:48:46 GMT 2019
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
      int int0 = Utils.emptyOpContext(92, 97);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.emptyOpContext(65, 122);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)5;
      byte[] byteArray1 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-94));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)62;
      byte[] byteArray1 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-757));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Utils.runeToString(119173);
      assertEquals("\uD185", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 92);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Utils.unhex((-2950));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = Utils.subarray(intArray0, 0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte) (-80), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -80
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = Utils.subarray(byteArray0, (-2091), (-2091));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 6102, 637);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      int[] intArray1 = Utils.subarray(intArray0, 637, 637);
      assertEquals(0, intArray0.length);
      assertEquals(0, intArray1.length);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-3399));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "\u054F");
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\u054F\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-158), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-268), (-5654));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes(",v^a5xHHrdDyOre p");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, 0, 449);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-1), 10);
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, (-1542));
      assertEquals(43, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = Utils.emptyOpContext(95, (byte)0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = Utils.emptyOpContext(434, (byte)57);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 90);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte) (-94);
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-71);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-94));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-74);
      byteArray0[1] = (byte) (-59);
      byteArray0[2] = (byte)54;
      byteArray0[3] = (byte) (-108);
      byteArray0[4] = (byte)57;
      byteArray0[5] = (byte) (-26);
      byteArray0[6] = (byte)104;
      byteArray0[7] = (byte)8;
      byteArray0[8] = (byte)8;
      byte[] byteArray1 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-26));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Utils.subarray(byteArray0, 535, 535);
      int int0 = Utils.indexOf(byteArray1, byteArray1, (-1));
      assertEquals(0, int0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 871);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 4);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = Utils.subarray(byteArray0, 2, 4);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int[] intArray0 = new int[6];
      int[] intArray1 = Utils.subarray(intArray0, 1, 5);
      assertEquals(4, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = Utils.runeToString((-2767));
      assertEquals("\uF531", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\n");
      Utils.escapeRune(stringBuilder0, (-828));
      assertEquals("\n\\xfffffcc4", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      Utils.escapeRune(stringBuilder0, 2196);
      assertEquals("\\x{894}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "a");
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("a\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "a");
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("a\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "a");
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("a\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (byte)94);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "a");
      Utils.escapeRune(stringBuilder0, 64737);
      assertEquals("a\uFCE1", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = Utils.unhex(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = Utils.unhex(465);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(1031);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-2767));
      assertFalse(boolean0);
  }
}
