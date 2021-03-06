/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:55:00 GMT 2019
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
      List<String[]> list0 = rE2_0.findAllSubmatch("com.google.re2j.RE2$5", (-622));
      assertNotNull(list0);
      assertEquals(22, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("^|6anN`=_");
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte)10;
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 15);
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("9h");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("9h", 300);
      assertNotNull(list0);
      assertEquals(1, list0.size());
      
      RE2 rE2_1 = RE2.compileImpl("9h", 256, false);
      Machine machine0 = rE2_1.get();
      rE2_0.put(machine0);
      String string0 = rE2_0.find("9h");
      assertEquals("9h", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Pc");
      boolean boolean0 = rE2_0.match("Pc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("", (String) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceFirst("l2|1|j(.m", "");
      assertEquals("l2|1|j(.m", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceFirst("", "?yH:C");
      assertEquals("?yH:C", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(".~`,'^Q/");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Oy`Oim-R`#K");
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        rE2_0.match("", (-15), 128, (-15), intArray0, 4);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("lE-}\nSolfM$a", 1072, false);
      boolean boolean0 = rE2_0.match("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("U|e}L,(D2)", (-947), true);
      boolean boolean0 = rE2_0.match("GlL ]F-7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(".~`,'^Q/");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(".~`,'^Q/");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("9h");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(".~`,'^Q/");
      byte[] byteArray0 = new byte[3];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-93));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 0);
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
      RE2 rE2_0 = RE2.compile("Y\"nHO$ZN7!gMB;A:-V?");
      List<String> list0 = rE2_0.findAll("B?S VKc4\"UXw6%y+", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("]u`|0.d", (-3846), false);
      List<String> list0 = rE2_0.findAll("com.google.re2j.RE2$5", (-1959));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.quoteMeta((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        RE2.match("l2|1|j(.m", "com.google.re2j.RE2$6");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `l2|1|j(.m`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        rE2_0.match("", 134, 134, (-1831), intArray0, (-4));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test23()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$6");
      // Undeclared exception!
      try { 
        rE2_0.findUTF8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("'gZ*.'");
      // Undeclared exception!
      try { 
        rE2_0.findIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Y\"nHO$ZN7!gMB;A:-V?");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 177);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 859);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("YZ\"d4MGry*1jzp");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, (byte)43);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        RE2.compilePOSIX("*h0'Uso//*dE");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("[IecX?Hak`/199c?^5");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[IecX?Hak`/199c?^5`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Y\"nHO$ZN7!gMB;A:-V?");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("com.google.re2j.RE2$1", 177);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      rE2_0.prefix = "&l@=j8PEJ/";
      List<String[]> list0 = rE2_0.findAllSubmatch("", (-21));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-21));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("lE-}\nSolfM$a", 1072, false);
      List<int[]> list0 = rE2_0.findAllIndex("lE-}\nSolfM$a", (-319));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      List<String> list0 = rE2_0.findAll("z", 256);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("9h");
      byte[] byteArray0 = new byte[3];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)101);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("9h");
      String[] stringArray0 = rE2_0.findSubmatch("wP69<&$2:F$o*m#I");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("U|e}L,(D2)", (-947), true);
      String[] stringArray0 = rE2_0.findSubmatch("U|e}L,(D2)");
      assertEquals(2, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      byte[] byteArray0 = new byte[4];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Y\"nHO$ZN7!gMB;A:-V?");
      int[] intArray0 = rE2_0.findIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex(".+*?()|[]{}^$");
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("'gZ*.'");
      String string0 = rE2_0.find("D(F:P");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      byte[] byteArray0 = new byte[4];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$6");
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("^|6anN`=_");
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte)10;
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)10);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("U|e}L,(D2)", (-947), true);
      List<String[]> list0 = rE2_0.findAllSubmatch("U|e}L,(D2)", 1067);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Y\"nHO$ZN7!gMB;A:-V?");
      int[] intArray0 = rE2_0.findSubmatchIndex("B?S VKc4\"UXw6%y+");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = RE2.quoteMeta("k+A");
      assertEquals("k\\+A", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("R*S*");
      String string0 = rE2_0.replaceAll("R*S*", "R*S*");
      assertEquals("R*S**R*S**R*S*", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, 0, 6, intArray0, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("^|6anN`=_");
      int[] intArray0 = new int[1];
      boolean boolean0 = rE2_0.match("^|6anN`=_", 405, 405, 2, intArray0, 405);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Pc");
      int[] intArray0 = new int[1];
      boolean boolean0 = rE2_0.match("Pc", 8, (-735), 120074, intArray0, (-735));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      // Undeclared exception!
      try { 
        rE2_0.match("can't happen", 0, (byte)16, 3170, (int[]) null, (byte)0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 849);
      assertEquals(3, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (byte) (-118));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      String string0 = rE2_0.replaceAll("&l@=j8PEJ/", "");
      assertEquals("&l@=j8PEJ/", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-21));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1572), true);
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-1572));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)109);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String> list0 = rE2_0.findAll("", 4);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", (-329));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$6");
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)75);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$6");
      String string0 = rE2_0.replaceAll("com.google.re2j.RE2$6", (String) null);
      assertEquals("com.google.re2j.RE2$6", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("9h");
      String string0 = rE2_0.replaceFirst("9h", "9h");
      assertEquals("9h", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      rE2_0.reset();
      assertEquals("can't happen", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("can't happen");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findSubmatchIndex("MK6xCc");
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("[:cntrl:]");
      boolean boolean0 = rE2_0.match("can't happen", 0, (byte)16, 3170, (int[]) null, (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      boolean boolean0 = RE2.match("~>a^;U,m3!<", "6R#g?9VbQT");
      assertFalse(boolean0);
  }
}
