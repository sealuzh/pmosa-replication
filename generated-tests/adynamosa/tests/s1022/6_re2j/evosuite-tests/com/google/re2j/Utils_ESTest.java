/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 10:56:56 GMT 2019
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
      int int0 = Utils.emptyOpContext(1132, 57);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(90, 184);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.emptyOpContext(933, 65);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)80;
      byteArray0[2] = (byte) (-25);
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1062));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      byte[] byteArray1 = new byte[9];
      int int0 = Utils.indexOf(byteArray1, byteArray0, (byte) (-11));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[5];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3177));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-3099), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3099
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte)43);
      assertEquals("\\+", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Utils.unhex((byte)97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
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
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, 1);
      assertEquals(1, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = Utils.unhex((byte) (-119));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = Utils.subarray(intArray0, 0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("Lu");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-2), (-1560));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = Utils.subarray((int[]) null, (byte)102, 102);
      assertNotNull(intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = Utils.subarray((byte[]) null, 0, 0);
      assertNotNull(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = Utils.runeToString((-2528));
      assertEquals("\uF620", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-59));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-347));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, 70, 70);
      // Undeclared exception!
      try { 
        Utils.subarray(intArray1, 0, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, (-347), 16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, 1980, (-2932));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
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
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, 2176);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-433), (-433));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = Utils.emptyOpContext(374, 95);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = Utils.emptyOpContext(48, (-2318));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Utils.emptyOpContext(1312, 97);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-49);
      byteArray0[1] = (byte)80;
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1062));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-119);
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1062));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-1902));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[1];
      int int0 = Utils.indexOf(byteArray1, byteArray0, 32);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-2786), 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2786
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 32, 32);
      assertEquals(0, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = Utils.runeToString(8);
      assertEquals("\b", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = Utils.runeToString(120512);
      assertEquals("\uD6C0", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("8KXZ6&");
      int[] intArray1 = Utils.subarray(intArray0, 0, 1);
      assertArrayEquals(new int[] {56}, intArray1);
      assertEquals(1, intArray1.length);
      assertArrayEquals(new int[] {56, 75, 88, 90, 54, 38}, intArray0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("=i(");
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("=i(\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 2473);
      assertEquals("\\x{9a9}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(1312);
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(1312);
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 9);
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
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 92);
      assertEquals("\\\\", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(49);
      Utils.escapeRune(stringBuilder0, 49);
      assertEquals("1", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(49);
      Utils.escapeRune(stringBuilder0, (-923));
      assertEquals("\\xfffffc65", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = Utils.unhex((byte)102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = Utils.unhex((byte)127);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(404);
      assertFalse(boolean0);
  }
}
