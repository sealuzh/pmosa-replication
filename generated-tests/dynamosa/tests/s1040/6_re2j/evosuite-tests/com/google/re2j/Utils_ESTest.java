/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 17:32:31 GMT 2019
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
      int int0 = Utils.emptyOpContext(122, 2985);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(97, (byte)34);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.emptyOpContext(11, 65);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[6];
      byteArray1[2] = (byte) (-118);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)63;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1516));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 5);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 4);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 94);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 2436);
      assertEquals("\\x{984}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("%K0 )|Q pyUs]9`");
      Utils.escapeRune(stringBuilder0, 2433);
      assertEquals("%K0 )|Q pyUs]9`\u0981", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.unhex((byte)48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Utils.unhex((-5112));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = Utils.EMPTY_INTS;
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-2315), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2315
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 14, (byte)0);
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
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 57, 57);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = Utils.runeToString((byte)0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = Utils.runeToString((-2314));
      assertEquals("\uF6F6", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-1042));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-1594));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 8216);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-613), 0);
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 10);
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-1331), 440);
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
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, 32, (-2713));
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
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 0, 2868);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, (-1392), 943);
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
        Utils.subarray((byte[]) null, 0, (-2613));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-2314), (-228));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2314
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, (-1349));
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
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-331), (-331));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Utils.emptyOpContext(95, 95);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = Utils.emptyOpContext(90, 128066);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)92;
      byteArray0[1] = (byte) (-1);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)92;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-116);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-116);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-116));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-83);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-83));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[7];
      int int0 = Utils.indexOf(byteArray1, byteArray0, (byte) (-6));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, 5);
      assertEquals(5, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = Utils.subarray(intArray0, (byte)0, 5);
      assertNotSame(intArray1, intArray0);
      assertEquals(5, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = Utils.subarray(intArray0, 0, 0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = Utils.runeToString(2436);
      assertEquals("\u0984", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = Utils.runeToString(120128);
      assertEquals("\uD540", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("\t");
      assertEquals(1, intArray0.length);
      assertArrayEquals(new int[] {9}, intArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(289);
      Utils.escapeRune(stringBuilder0, (-1573));
      assertEquals("\\xfffff9db", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
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
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
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
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (byte)92);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "\uD540");
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\uD540\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      int int0 = Utils.unhex(128066);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(300);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }
}
