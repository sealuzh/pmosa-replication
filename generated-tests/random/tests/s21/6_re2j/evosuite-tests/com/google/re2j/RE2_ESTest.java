/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:16:53 GMT 2019
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
      RE2 rE2_0 = RE2.compile("<A");
      String string0 = rE2_0.toString();
      assertEquals("<A", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("'<z@`,Co'ny1c");
      boolean boolean0 = rE2_0.match("'<z@`,Co'ny1c");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("(?-m:$)");
      String string0 = rE2_0.replaceAll("", "(?-m:$)");
      assertEquals("(?-m:$)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Tai_Le");
      Machine machine0 = rE2_0.get();
      rE2_0.put(machine0);
      assertEquals("Tai_Le", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = RE2.match("UTF-8", "UTF-8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = new RE2("E#HeU_c!uaW\"Ic62-BJ");
      // Undeclared exception!
      try { 
        rE2_0.match("", (byte) (-63), (byte)15, (byte) (-63), (int[]) null, 9983);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = new RE2("E#HeU_c!uaW\"Ic62-BJ");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = new RE2("0&*/P}Oq._38`kM");
      byte[] byteArray0 = new byte[7];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-47));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("'<z@`,Co'ny1c");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-74));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("'<z@`,Co'ny1c");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 2520);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-2607), false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("com.google.re2j.RE2$9", (-2607));
      assertEquals(22, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = new RE2("UTF-8");
      List<int[]> list0 = rE2_0.findAllIndex("CsYbx@*R{^5~", (-1029));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String> list0 = rE2_0.findAll("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("tO", 12, true);
      assertEquals("tO", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("67MH^");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, "67MH^");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        rE2_0.match("com.google.re2j.RE2$6", (-1002), 8, (-1624), intArray0, 8);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-2607), false);
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, (-2607));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        RE2.compilePOSIX("[B^s");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[B^s`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("(F;$2p>b6_@IC=)|");
      List<String[]> list0 = rE2_0.findAllSubmatch("UTF-8", 15);
      assertNotNull(list0);
      assertEquals(6, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      List<String[]> list0 = rE2_0.findAllSubmatch("np4:JV9H>17Kg12]y>", 1082);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 8);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("(F;$2p>b6_@IC=)|");
      byte[] byteArray0 = new byte[8];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 897);
      assertEquals(9, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 492);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = new RE2("0&*/P}Oq._38`kM");
      String[] stringArray0 = rE2_0.findSubmatch("0&*/P}Oq._38`kM");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("(F;$2p>b6_@IC=)|");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNotNull(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("(F;$2p>b6_@IC=)|");
      byte[] byteArray0 = new byte[8];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("'<z@`,Co'ny1c");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = new RE2("E#HeU_c!uaW\"Ic62-BJ");
      int[] intArray0 = rE2_0.findIndex("com.google.re2j.RE2$3");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("67MH^");
      String string0 = rE2_0.find("yDOu`V>'&W1= .=bzJ`");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      String string0 = rE2_0.find("np4:JV9H>17Kg12]y>");
      assertEquals("np4:JV9H>17Kg12]y>", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("(?-m:$)");
      byte[] byteArray0 = new byte[7];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 2);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      List<String> list0 = rE2_0.findAll("com.google.re2j.RE2$6", (-1002));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = RE2.quoteMeta("KNoE\u0000OL5}pmK");
      assertEquals("KNoE\u0000OL5\\}pmK", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("VU1RF|");
      String string0 = rE2_0.replaceAll("VU1RF|", "VU1RF|");
      assertEquals("VU1RF||VU1RF|", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      String string0 = rE2_0.replaceAll("KNoE\u0000OL5}pmK", "gEM%^dnxy");
      assertEquals("KNoE\u0000OL5}pmK", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[3];
      boolean boolean0 = rE2_0.match("", 0, 0, 0, intArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[5];
      boolean boolean0 = rE2_0.match("", 8, (-19), 8, intArray0, (-1950));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      int[] intArray0 = rE2_0.findSubmatchIndex("np4:JV9H>17Kg12]y>");
      assertNotNull(intArray0);
      
      rE2_0.match("np4:JV9H>17Kg12]y>", 15, 15, (-1), intArray0, (byte)21);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 18}, intArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("<A");
      rE2_0.prefix = "rp<|*vr72#~h\fI";
      boolean boolean0 = rE2_0.match("<A");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("VU1RF|");
      byte[] byteArray0 = new byte[9];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 365);
      assertEquals(10, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("com.google.re2j.Inst", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("VU1RF|");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex(">i':z", 1515);
      assertEquals(6, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("Thaana", 838);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 1428);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("VU1RF|");
      List<int[]> list0 = rE2_0.findAllUTF8Index(rE2_0.prefixUTF8, (byte)78);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RE2 rE2_0 = new RE2("E#HeU_c!uaW\"Ic62-BJ");
      List<String> list0 = rE2_0.findAll("E#HeU_c!uaW\"Ic62-BJ", 9720);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      List<int[]> list0 = rE2_0.findAllIndex(" }F@cN|z,\"e]$vX|ZU", 8);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("np4:JV9H>17Kg12]y>");
      byte[] byteArray0 = new byte[1];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 1082);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("Y<6QX:\"h=1X<-PfXIGC", "");
      assertEquals("Y<6QX:\"h=1X<-PfXIGC", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      String string0 = rE2_0.replaceFirst(" }F@cN|z,\"e]$vX|ZU", "Pattern_White_Space");
      assertEquals("Pattern_White_Space|z,\"e]$vX|ZU", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      RE2 rE2_0 = new RE2(" }F@cN|z,\"e]$vX|ZU");
      rE2_0.reset();
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }
}
