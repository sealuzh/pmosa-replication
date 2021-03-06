/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:23:55 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Machine;
import com.google.re2j.RE2;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RE2_ESTest extends RE2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String[]> list0 = rE2_0.findAllSubmatch(": `", (-841));
      assertEquals(4, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|g");
      byte[] byteArray0 = new byte[3];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 1193);
      assertEquals(4, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      String string0 = rE2_0.replaceFirst("-`lX2|!", "4<q09&E(8)^#J6{|");
      assertEquals("4<q09&E(8)^#J6{|-`lX2|!", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      String string0 = rE2_0.replaceFirst("", "UTF-8");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Ni", 767, false);
      Machine machine0 = rE2_0.get();
      rE2_0.put(machine0);
      rE2_0.put(machine0);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("Ni", 767);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 243, true);
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("U%`N'-IlI9qPMG");
      boolean boolean0 = rE2_0.match("U%`N'-IlI9qPMG");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Ni", 767, false);
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("");
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("OZnI");
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)33);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 401);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[7];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 1633);
      assertNotNull(list0);
      assertEquals(8, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (-20));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-6883), false);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      // Undeclared exception!
      try { 
        rE2_0.findUTF8Index((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, (-1608));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        RE2.compilePOSIX("+1,i+[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("A1yCxj+~4ynL%nz[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("&");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("com.google.re2j.RE2$7", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      List<String[]> list0 = rE2_0.findAllSubmatch("KXY] G6#rx", (byte)1);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 962);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      List<int[]> list0 = rE2_0.findAllIndex("", (-1608));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      List<String> list0 = rE2_0.findAll("-]", 7);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      String[] stringArray0 = rE2_0.findSubmatch("KXY] G6#rx");
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4<q09&E(8)^#J6{|");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(2, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = RE2.compile("KXY] G6#rx");
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|g");
      byte[] byteArray0 = new byte[3];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("&");
      int[] intArray0 = rE2_0.findIndex("ySjM");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("&");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("U%`N'-IlI9qPMG");
      String string0 = rE2_0.find("U%`N'-IlI9qPMG");
      assertEquals("U%`N'-IlI9qPMG", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("OZnI");
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|/P,~wYIp/;]a]K");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("|/P,~wYIp/;]a]K", (-194));
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = RE2.quoteMeta("com.google.re2j.RE2$2|com.google.re2j.RE2$2");
      assertEquals("com\\.google\\.re2j\\.RE2\\$2\\|com\\.google\\.re2j\\.RE2\\$2", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("OZnI");
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "EI-|n,^H6n )O");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        rE2_0.match(stringBuilder0, (byte)0, (byte)0, (-427), intArray0, 8993);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 243, true);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      rE2_0.match("", 1260, 0, (-3467), intArray0, 8);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("U%`N'-IlI9qPMG");
      int[] intArray0 = new int[9];
      boolean boolean0 = rE2_0.match("U%`N'-IlI9qPMG", (-1492), (-1492), 16, intArray0, 16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = RE2.match("|g", "|g");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 42508);
      assertEquals(3, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-186));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      List<String[]> list0 = rE2_0.findAllSubmatch("com.google.re2j.Machine$Queue", 537);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|g");
      String string0 = rE2_0.replaceAll("|g", "com.google.re2j.RE2$2");
      assertEquals("com.google.re2j.RE2$2|com.google.re2j.RE2$2", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Ni", 767, false);
      String string0 = rE2_0.replaceFirst("Ni", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|g");
      byte[] byteArray0 = new byte[3];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-3055));
      assertNotNull(list0);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-186));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-186));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String> list0 = rE2_0.findAll("", 7);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllIndex("com.google.re2j.RE2$6", (byte) (-58));
      assertEquals(22, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-186));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      String string0 = rE2_0.toString();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      String string0 = rE2_0.replaceAll("4VF&@", "~qjp>[-,w$");
      assertEquals("4VF&@", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      rE2_0.reset();
      assertEquals("com.google.re2j.Machine$Queue", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("UTF-8");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.Machine$Queue", 537, true);
      int[] intArray0 = rE2_0.findSubmatchIndex("com.google.re2j.Machine$Queue");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|g");
      byte[] byteArray0 = new byte[3];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-44));
      assertNotNull(list0);
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = RE2.match("com.google.re2j.RE2$6", "com.google.re2j.RE2$6");
      assertFalse(boolean0);
  }
}
