/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:53:57 GMT 2019
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
      int int0 = Utils.emptyOpContext(48, 32);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-1), 122);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(97, 0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.emptyOpContext(65, 65);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[43];
      byte[] byteArray1 = new byte[2];
      byteArray1[1] = (byte)32;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte)32);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-49);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 9);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Utils.runeToString(68154);
      assertEquals("\u0A3A", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 92);
      assertEquals("\\\\", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Utils.unhex((byte)102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Utils.unhex(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, 4);
      assertEquals(4, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(115);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.unhex((-662));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 47, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, 1812, 1812);
      assertNotSame(intArray1, intArray0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = Utils.subarray(byteArray0, (byte)0, 0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte)0, 95);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-2574), (-4401));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Utils.runeToString(16);
      assertEquals("\u0010", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(256);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-3941));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "Cb{)qOu_+V3be$d");
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("Cb{)qOu_+V3be$d\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (-626));
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
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-432), 15);
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
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 19, 0);
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
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-890), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -890
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, 8, 1770);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, 790);
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
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)95, (byte)95);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = Utils.emptyOpContext(42, 57);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 90);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-1), (-1));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byteArray0[0] = (byte) (-4);
      byteArray0[1] = (byte) (-116);
      byte[] byteArray1 = new byte[7];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-116));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)113;
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-16));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-662));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 8159);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int[] intArray0 = new int[7];
      int[] intArray1 = Utils.subarray(intArray0, 0, 2);
      assertEquals(2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = Utils.runeToString((-1825));
      assertEquals("\uF8DF", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("kI*a)w");
      assertArrayEquals(new int[] {107, 73, 42, 97, 41, 119}, intArray0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte)30);
      assertEquals("\\x1e", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 2678);
      assertEquals("\\x{a76}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 8159);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 124);
      assertEquals("\\|", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = Utils.unhex((byte)57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = Utils.unhex(1113);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(528);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-687));
      assertFalse(boolean0);
  }
}