/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 03:07:11 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Machine;
import com.google.re2j.RE2;
import java.nio.CharBuffer;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RE2_ESTest extends RE2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("{");
      String[] stringArray0 = rE2_0.findSubmatch("{");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = RE2.quoteMeta(".+*?()|[]{}^$");
      assertEquals("\\.\\+\\*\\?\\(\\)\\|\\[\\]\\{\\}\\^\\$", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 34, true);
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 34, true);
      boolean boolean0 = rE2_0.match("t1MXDR-V/y<%RHyme:");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("^aL-g{D=/w'>7*r");
      int[] intArray0 = rE2_0.findSubmatchIndex("^aL-g{D=/w'>7*r");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$2");
      String string0 = rE2_0.replaceFirst("DS^jmE+?e 9", (String) null);
      assertEquals("DS^jmE+?e 9", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$9");
      String string0 = rE2_0.replaceFirst("com.google.re2j.RE2$9", "com.google.re2j.RE2$9");
      assertEquals("com.google.re2j.RE2$9", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("B{xJT", 0, false);
      String string0 = rE2_0.replaceAllFunc("com.google.re2j.RE2$5", (RE2.ReplaceFunc) null, 0);
      assertEquals("com.google.re2j.RE2$5", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("}Z");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (byte) (-35));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", (String) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("^aL-g{D=/w'>7*r");
      Machine machine0 = new Machine(rE2_0);
      rE2_0.put(machine0);
      assertEquals("^aL-g{D=/w'>7*r", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = RE2.match("!^", "!^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "Kx:?r*do=");
      boolean boolean0 = RE2.match("Kx:?r*do=", charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, (-520), 4, 409, intArray0, (-652));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$9");
      rE2_0.match("com.google.re2j.RE2$9");
      byte[] byteArray0 = new byte[5];
      Machine machine0 = new Machine(rE2_0);
      rE2_0.put(machine0);
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RE2 rE2_0 = new RE2("x");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "x", 0, 0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotNull(byteArray1);
      
      byte[][] byteArray2 = rE2_0.findUTF8Submatch(byteArray1);
      assertEquals(1, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      byte[] byteArray2 = rE2_0.findUTF8(byteArray1);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 6, true);
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 34, true);
      int[] intArray0 = rE2_0.findIndex("");
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 34, true);
      byte[] byteArray0 = new byte[6];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte) (-123));
      assertEquals(7, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)111);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("l6>");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 12);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 34, true);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 34);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("<NhA 0", (-877), true);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("<NhA 0", (-2369));
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("<NhA 0", (-877), true);
      List<int[]> list0 = rE2_0.findAllIndex("<NhA 0", (-877));
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$9");
      List<int[]> list0 = rE2_0.findAllIndex("com.google.re2j.RE2$9", 1124);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String> list0 = rE2_0.findAll("", (byte) (-54));
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 1599);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, "com.google.re2j.RE2$10");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.matchUTF8((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.match((String) null, (CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      RE2 rE2_0 = new RE2("ANY_CHAR_NOT_NL");
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        rE2_0.match("ANY_CHAR_NOT_NL", 0, 3390, 0, intArray0, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Ll");
      rE2_0.put((Machine) null);
      // Undeclared exception!
      try { 
        rE2_0.match("Ll", 7, 7, 7, (int[]) null, (-1059));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        rE2_0.match("", (byte) (-114), (byte) (-114), (byte) (-71), intArray0, (-996));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findUTF8SubmatchIndex((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test046()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-1249), false);
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
  public void test047()  throws Throwable  {
      RE2 rE2_0 = new RE2("|I?k3lhc");
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
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findSubmatch((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test051()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, (byte)13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("O");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, (-903));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, (byte)112);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, (-2680));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, (-1383));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.find((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      try { 
        RE2.compilePOSIX("^)osS7^cQ%#D");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      try { 
        RE2.compile(".+*?()|[]{}^$");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
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
  public void test065()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("c`cfT0wVz+[zx-~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[zx-~`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
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
  public void test067()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 34, true);
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-16));
      assertNotNull(list0);
      assertEquals(6, list0.size());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("l6>");
      List<String> list0 = rE2_0.findAll("(~(o:(Bd#He;4r", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      RE2 rE2_0 = new RE2("iHx>CcgH'6Q{hE\"f|w");
      String[] stringArray0 = rE2_0.findSubmatch("Samaritan");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("}Z");
      byte[] byteArray0 = new byte[1];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("\f");
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)12;
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Kx:?r*do=");
      int[] intArray0 = rE2_0.findIndex("KK`WZS6l");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("l6>");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".");
      String string0 = rE2_0.find("bT");
      assertEquals("b", string0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("l6>");
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte) (-8));
      assertNotNull(list0);
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      List<String[]> list0 = rE2_0.findAllSubmatch("$", (-5687));
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("}Z");
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      String string0 = RE2.quoteMeta("xiq&#");
      assertEquals("xiq&#", string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceAll("7J4T^GTVhP", "7J4T^GTVhP");
      assertEquals("7J4T^GTVhP77J4T^GTVhPJ7J4T^GTVhP47J4T^GTVhPT7J4T^GTVhP^7J4T^GTVhPG7J4T^GTVhPT7J4T^GTVhPV7J4T^GTVhPh7J4T^GTVhPP7J4T^GTVhP", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("fW8~P\"d]%&;%I&TT@", 1, true);
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("z,r,Z+eNQ,M==`p", (byte)0, 6459, (byte)0, (int[]) null, 4835);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("B{xJT", 0, false);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "B{xJT");
      int[] intArray0 = new int[5];
      boolean boolean0 = rE2_0.match(charBuffer0, 0, 0, 7, intArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("", 1142, 681, 1142, intArray0, 1142);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, 0, 1172, intArray0, 449);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".");
      boolean boolean0 = rE2_0.match("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", 378);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      String string0 = rE2_0.replaceAll("Carian", "Ix/,q~Z|UEqE^zD+");
      assertEquals("CarianIx/,q~Z|UEqE^zD+", string0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-1924));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 1);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      byte[] byteArray0 = new byte[4];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".");
      List<String> list0 = rE2_0.findAll("`kNk]yRTp\"m", 256);
      assertEquals(11, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      String string0 = rE2_0.toString();
      assertNotNull(string0);
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("\f");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }
}
