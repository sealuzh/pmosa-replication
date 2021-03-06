/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:59:31 GMT 2019
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
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch(",mc_.`/wf6G|Q'", 11);
      assertEquals(11, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1116, false);
      Machine machine0 = rE2_0.get();
      rE2_0.put(machine0);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("end is greater than length: ", 11808, false);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("tJT+qdTT");
      boolean boolean0 = rE2_0.match("tJT+qdTT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("tJT+qdTT");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("_4|vc\"~)U\t@7", 671, false);
      byte[] byteArray0 = new byte[5];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("NO_MATCH");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-63));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.prefixUTF8 = null;
      int int0 = rE2_0.numberOfCapturingGroups();
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8(rE2_0.prefixUTF8, int0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1116, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (byte)14);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("y@Ugj,@3/diR!O1D");
      List<int[]> list0 = rE2_0.findAllIndex("", (-81));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", (byte)1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Zj44", (byte) (-65), false);
      assertEquals("Zj44", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = new RE2("1TTG'A|$");
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
  public void test17()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("G|@#ASD`U;Oh'95Vl");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, (-8));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      try { 
        RE2.compilePOSIX("(pNL2'Eh`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(pNL2'Eh``
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        RE2.compileImpl("_4|vc\"~)U\t@7", (byte)0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1116, false);
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)76);
      assertEquals(7, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("_4|vc\"~)U\t@7", 671, false);
      List<int[]> list0 = rE2_0.findAllIndex("_4|vc\"~)U\t@7", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("tJT+qdTT");
      List<String> list0 = rE2_0.findAll("com.google.re2j.RE2$8", 2141);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("`glBsY&|ie6l", 301, false);
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String[] stringArray0 = rE2_0.findSubmatch("q@1yv^3 OR;N");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("_4|vc\"~)U\t@7", 671, false);
      byte[] byteArray0 = new byte[5];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:alnum:]");
      int[] intArray0 = rE2_0.findIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("tJT+qdTT");
      String string0 = rE2_0.find("UTF-8");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:alnum:]");
      String string0 = rE2_0.find("[[:alnum:]alnum:]");
      assertEquals(":", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("tJT+qdTT");
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, 119552, (byte)22, intArray0, (byte)22);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("NO_MATCH");
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1116, false);
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray1, (byte)35);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = RE2.quoteMeta("com.google.re2j.RE2$8");
      assertEquals("com\\.google\\.re2j\\.RE2\\$8", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("H+|");
      String string0 = rE2_0.replaceAll("H+|", "H+|");
      assertEquals("H+|+H+||H+|", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        rE2_0.match("Pz*xH ", 0, 0, 0, intArray0, 9675);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("tJT+qdTT");
      boolean boolean0 = rE2_0.match("tJT+qdTT", (byte) (-44), (byte) (-44), (-3008), (int[]) null, 64015);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = new RE2("3Q/{");
      int[] intArray0 = new int[4];
      boolean boolean0 = rE2_0.match("3Q/{", 1089, (-2084), (byte) (-61), intArray0, 4368);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("`oP]~ju35W}*F.0I", 0, 11, 478, (int[]) null, 32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = new RE2("1TTG'A|$");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-6));
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:alnum:]");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 1794);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("NO_MATCH");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("NO_MATCH", (byte)83);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("y@Ugj,@3/diR!O1D");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex(";*${@JGs(4M52T(G", (byte) (-96));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:alnum:]");
      String string0 = rE2_0.replaceFirst("[:alnum:]", "[:alnum:]");
      assertEquals("[[:alnum:]alnum:]", string0);
      
      RE2 rE2_1 = RE2.compileImpl("[:alnum:]", 4, false);
      Machine machine0 = rE2_1.get();
      rE2_0.put(machine0);
      String string1 = rE2_0.find("[[:alnum:]alnum:]");
      assertEquals(":", string1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-1004));
      assertEquals(4, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("y@Ugj,@3/diR!O1D");
      byte[] byteArray0 = new byte[5];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 42182);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RE2 rE2_0 = new RE2("1TTG'A|$");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)12);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("NO_MATCH");
      byte[] byteArray0 = new byte[6];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-19));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("y@Ugj,@3/diR!O1D");
      List<String> list0 = rE2_0.findAll("y@Ugj,@3/diR!O1D", (-1401));
      assertTrue(list0.contains("y@Ugj,@3/diR!O1D"));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:alnum:]");
      byte[] byteArray0 = new byte[2];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-141));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = new RE2("FN@a");
      String string0 = rE2_0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceAll("Rc}VY3<?{ X", "");
      assertEquals("Rc}VY3<?{ X", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = new RE2("[:alnum:]");
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = new RE2("FN@a");
      String string0 = rE2_0.replaceFirst("", "trA?o?`2;9g^7fO`O,C");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RE2 rE2_0 = new RE2("FN@a");
      rE2_0.reset();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("NO_MATCH");
      int[] intArray0 = rE2_0.findSubmatchIndex("NO_MATCH");
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 8}, intArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = RE2.match("`oP]~ju35W}*F.0II`oP]~ju35W}*F.0In`oP]~ju35W}*F.0Is`oP]~ju35W}*F.0Ic`oP]~ju35W}*F.0Ir`oP]~ju35W}*F.0Ii`oP]~ju35W}*F.0Ip`oP]~ju35W}*F.0It`oP]~ju35W}*F.0Ii`oP]~ju35W}*F.0Io`oP]~ju35W}*F.0In`oP]~ju35W}*F.0Ia`oP]~ju35W}*F.0Il`oP]~ju35W}*F.0I_`oP]~ju35W}*F.0IP`oP]~ju35W}*F.0Ia`oP]~ju35W}*F.0Ir`oP]~ju35W}*F.0It`oP]~ju35W}*F.0Ih`oP]~ju35W}*F.0Ii`oP]~ju35W}*F.0Ia`oP]~ju35W}*F.0In`oP]~ju35W}*F.0I", "`oP]~ju35W}*F.0II`oP]~ju35W}*F.0In`oP]~ju35W}*F.0Is`oP]~ju35W}*F.0Ic`oP]~ju35W}*F.0Ir`oP]~ju35W}*F.0Ii`oP]~ju35W}*F.0Ip`oP]~ju35W}*F.0It`oP]~ju35W}*F.0Ii`oP]~ju35W}*F.0Io`oP]~ju35W}*F.0In`oP]~ju35W}*F.0Ia`oP]~ju35W}*F.0Il`oP]~ju35W}*F.0I_`oP]~ju35W}*F.0IP`oP]~ju35W}*F.0Ia`oP]~ju35W}*F.0Ir`oP]~ju35W}*F.0It`oP]~ju35W}*F.0Ih`oP]~ju35W}*F.0Ii`oP]~ju35W}*F.0Ia`oP]~ju35W}*F.0In`oP]~ju35W}*F.0I");
      assertFalse(boolean0);
  }
}
