/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:23:59 GMT 2019
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
      int int0 = Utils.emptyOpContext(57, 57);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.emptyOpContext(48, 102);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(122, 122);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)90, (byte) (-26));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[2];
      byteArray1[1] = (byte)72;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3570));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)125;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3570));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-52);
      byte[] byteArray1 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-52));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 4);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Utils.runeToString(68177);
      assertEquals("\u0A51", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 46);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.unhex((byte)65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.unhex((byte)48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("/XGxlXYw_FBf,M");
      int[] intArray1 = Utils.subarray(intArray0, 0, 9);
      assertArrayEquals(new int[] {47, 88, 71, 120, 108, 88, 89, 119, 95}, intArray1);
      assertEquals(14, intArray0.length);
      assertEquals(9, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, (-3653), (-3653));
      assertEquals(0, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 2943, 396);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Utils.runeToString(936);
      assertEquals("\u03A8", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(95);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-207));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(2675);
      Utils.escapeRune(stringBuilder0, (-819));
      assertEquals("\\xfffffccd", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Utils.emptyOpContext(4, 0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 2980);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, 1, 62);
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
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 0, (-5499));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
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
        Utils.subarray((byte[]) null, 34, 1426);
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
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, 70, (-100));
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
      byte[] byteArray0 = new byte[11];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte) (-104), (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -104
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, 74);
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
      int int0 = Utils.emptyOpContext((-3653), (-3));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-3314), 97);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)72;
      byteArray0[1] = (byte)72;
      byte[] byteArray1 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3570));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)72;
      byteArray0[2] = (byte)125;
      byte[] byteArray1 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3570));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-3314));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 1674);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, (byte)5);
      assertEquals(5, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-453), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -453
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = Utils.subarray(intArray0, 0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = Utils.runeToString((-207));
      assertEquals("\uFF31", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 2208);
      assertEquals("\\x{8a0}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 12);
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
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 8);
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
      Utils.escapeRune(stringBuilder0, 43312);
      assertEquals("\uA930", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 92);
      assertEquals("\\\\", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(97);
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = Utils.unhex(65421);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = Utils.unhex((-199));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(192);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-207));
      assertFalse(boolean0);
  }
}