/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 15:33:23 GMT 2019
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
      RE2 rE2_0 = RE2.compilePOSIX("|!@Pq`T");
      String string0 = rE2_0.toString();
      assertEquals("|!@Pq`T", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = RE2.match("zlu}9;qFpiEPaAS", ".0&V+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".Tq8&rj");
      String string0 = rE2_0.find(".Tq8&rj");
      assertEquals(".Tq8&rj", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      String string0 = rE2_0.replaceFirst("Georgian", "Georgian");
      assertEquals("Georgian", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      Machine machine0 = rE2_0.get();
      rE2_0.put(machine0);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("wRC>aiP?e!AY15C");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("wRC>aiP?e!AY15C");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[4];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("4&B9vwCfprH4/", 9, false);
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-117));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[7];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 1649);
      assertNotNull(list0);
      assertEquals(8, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 122, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 122);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("H|Au#ZApu_i<?*H|Au#ZApu_i<?FH|Au#ZApu_i<?OH|Au#ZApu_i<?JH|Au#ZApu_i<?mH|Au#ZApu_i<?zH|Au#ZApu_i<? H|Au#ZApu_i<??H|Au#ZApu_i<?#H|Au#ZApu_i<?BH|Au#ZApu_i<?;H|Au#ZApu_i<?rH|Au#ZApu_i<?=H|Au#ZApu_i<?~H|Au#ZApu_i<?xH|Au#ZApu_i<?lH|Au#ZApu_i<?PH|Au#ZApu_i<?*H|Au#ZApu_i<?", (byte) (-55));
      assertNotNull(list0);
      assertEquals(266, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllIndex("", 10426);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String> list0 = rE2_0.findAll("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc(";kz", (RE2.ReplaceFunc) null, (-6));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("_<CadvL", (-941), true);
      // Undeclared exception!
      try { 
        rE2_0.findUTF8Submatch((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
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
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findSubmatchIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("v#_");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, (-840));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$5");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, (byte)55);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compilePOSIX((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        RE2.compile("v_Nc_1HRn(Db|cR}%$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `v_Nc_1HRn(Db|cR}%$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("#{ xV>1)i:Zs");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("Georgian", 67);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      List<String[]> list0 = rE2_0.findAllSubmatch("com.google.re2j.RE2", 2);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".Tq8&rj");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 140);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("wRC>aiP?e!AY15C");
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 729);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      List<int[]> list0 = rE2_0.findAllIndex("4j6W#RPP", 21);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      List<String> list0 = rE2_0.findAll("#w", 212);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      String[] stringArray0 = rE2_0.findSubmatch("$NY");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = new RE2("6|");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("wRC>aiP?e!AY15C");
      byte[] byteArray0 = new byte[5];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$5");
      int[] intArray0 = rE2_0.findIndex("com.google.re2j.RE2$5");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      int[] intArray0 = rE2_0.findIndex("");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("wRC>aiP?e!AY15C");
      String string0 = rE2_0.find("com.google.re2j.RE2$5");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = new RE2("6|");
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("v#_");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = new RE2("6|");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("6|", (-239));
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = RE2.quoteMeta("R(pDC'(<r=");
      assertEquals("R\\(pDC'\\(<r=", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("|!@Pq`T");
      String string0 = rE2_0.replaceAll("|!@Pq`T", "");
      assertEquals("|", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("*FOJmz ?#B;r=~xlP*", "H|Au#ZApu_i<?");
      assertEquals("H|Au#ZApu_i<?*H|Au#ZApu_i<?FH|Au#ZApu_i<?OH|Au#ZApu_i<?JH|Au#ZApu_i<?mH|Au#ZApu_i<?zH|Au#ZApu_i<? H|Au#ZApu_i<??H|Au#ZApu_i<?#H|Au#ZApu_i<?BH|Au#ZApu_i<?;H|Au#ZApu_i<?rH|Au#ZApu_i<?=H|Au#ZApu_i<?~H|Au#ZApu_i<?xH|Au#ZApu_i<?lH|Au#ZApu_i<?PH|Au#ZApu_i<?*H|Au#ZApu_i<?", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("[Bb^UPwl_nc", 0, (byte)66, 127744, (int[]) null, 127744);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2690, true);
      boolean boolean0 = rE2_0.match("", (-3749), (-3749), (-3749), (int[]) null, 2690);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        rE2_0.match("=_J9:Gj7", 0, 8497, 1675, intArray0, 468);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 122, false);
      int[] intArray0 = new int[1];
      boolean boolean0 = rE2_0.match("", (-7), (-1302), 122, intArray0, 120015);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      boolean boolean0 = rE2_0.match("Georgian");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray1, (-4358));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 64);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      byte[] byteArray0 = new byte[2];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 21);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 2, true);
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-1470));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$NY");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-3));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String> list0 = rE2_0.findAll("", (-11));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[4];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)19);
      assertNotNull(list0);
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$10");
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$5");
      rE2_0.reset();
      assertEquals("com.google.re2j.RE2$5", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RE2 rE2_0 = new RE2("6|");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$10");
      int[] intArray0 = rE2_0.findSubmatchIndex("Y|%Wnd5N@X1|CU");
      assertNull(intArray0);
  }
}