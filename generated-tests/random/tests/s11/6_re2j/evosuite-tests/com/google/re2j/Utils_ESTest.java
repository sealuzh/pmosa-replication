/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:21:52 GMT 2019
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
      boolean boolean0 = Utils.isWordRune(102);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[8];
      byteArray1[1] = (byte)48;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1357));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte)27;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1357));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 1, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-370), 90);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -370
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 5, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-73));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-3253));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, (-747));
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, 4, 57);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("KZcw!,~<d*aL3'Q]w");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 1178, 5);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 1021, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Utils.emptyOpContext(37, (-1));
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-1), 1060);
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Utils.emptyOpContext(95, 42891);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = Utils.emptyOpContext(57, 7392);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)48;
      byteArray0[1] = (byte)4;
      byte[] byteArray1 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1357));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)4;
      byte[] byteArray1 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1357));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)48;
      byte[] byteArray1 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1357));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 32);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 4125);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-742), 3059);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -742
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, (byte)0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("\u0010");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-2612), (-1289));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2612
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("KZcw!,~<d*aL3'Q]w");
      int[] intArray1 = Utils.subarray(intArray0, (-2230), (-2230));
      assertEquals(17, intArray0.length);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = Utils.runeToString(67);
      assertEquals("C", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = Utils.runeToString((-4385));
      assertEquals("\uEEDF", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("nd\"\"A/PYI[<pRnRrxQ");
      Utils.escapeRune(stringBuilder0, 6);
      assertEquals("nd\"\"A/PYI[<pRnRrxQ\\x06", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 1518);
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
      StringBuilder stringBuilder0 = new StringBuilder("\"");
      Utils.escapeRune(stringBuilder0, (-3253));
      assertEquals("\"\\xfffff34b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 125);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\"");
      Utils.escapeRune(stringBuilder0, 1673);
      assertEquals("\"\u0689", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      int int0 = Utils.unhex(68);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = Utils.unhex(122);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = Utils.unhex((-1306));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(67);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(280);
      assertFalse(boolean0);
  }
}