/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 04:14:50 GMT 2019
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
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("(b2*vu*;wKFRN!6", (-10));
      assertNotNull(list0);
      assertEquals(16, list0.size());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[8];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-74));
      assertEquals(9, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("AVn/()");
      String[] stringArray0 = rE2_0.findSubmatch("AVn/()");
      assertEquals(2, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      RE2 rE2_0 = RE2.compile("$");
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = RE2.quoteMeta("1fjUO@g>");
      assertEquals("1fjUO@g>", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Fy]%#?yn{edn>4 S");
      byte[] byteArray0 = new byte[2];
      Machine machine0 = rE2_0.get();
      rE2_0.findUTF8(byteArray0);
      rE2_0.put(machine0);
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Mongolian", 1312, false);
      String string0 = rE2_0.toString();
      assertEquals("Mongolian", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("%JN$>7vW p(9j)o");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Ua<");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(3, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(" gby0Rjosj;VM");
      String string0 = rE2_0.find(" gby0Rjosj;VM");
      assertEquals(" gby0Rjosj;VM", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 528, false);
      String string0 = rE2_0.replaceFirst("com.google.re2j.RE2$1", (String) null);
      assertEquals("nullcom.google.re2j.RE2$1", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = new RE2("K4_");
      String string0 = rE2_0.replaceFirst("K4_", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceFirst("", "t@2dC9hI");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = new RE2("anynotnl -> ");
      String string0 = rE2_0.replaceAllFunc("o", (RE2.ReplaceFunc) null, (byte)0);
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("com.google.re2j.RE2$6", (RE2.ReplaceFunc) null, 16);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = new RE2("anynotnl -> ");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (-3));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceAll("]p", (String) null);
      assertEquals("null]nullpnull", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "xs3?TN kukj");
      boolean boolean0 = RE2.match("rune1 ", charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match((CharSequence) null, 256, (-3429), (-3429), intArray0, 16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match(charBuffer0, 777, 0, 1614, intArray0, 1407);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
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
  public void test023()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Mongolian", 1312, false);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Ua<");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(",ZD6pIIvW)Z& g", 2794, false);
      int[] intArray0 = rE2_0.findIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      byte[] byteArray0 = new byte[9];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[8];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-922));
      assertEquals(9, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[9];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-1101));
      assertEquals(10, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray1, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("d} TwgI", (-1183));
      assertEquals(8, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(" gby0Rjosj;VM");
      List<int[]> list0 = rE2_0.findAllIndex("", (-2461));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
      List<String> list0 = rE2_0.findAll("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String> list0 = rE2_0.findAll("match", (byte) (-6));
      assertNotNull(list0);
      assertEquals(6, list0.size());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, "+");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("<@ahy");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 295);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      RE2 rE2_0 = new RE2("CAPTURE");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      // Undeclared exception!
      try { 
        rE2_0.matchUTF8(byteArray1);
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
      try { 
        RE2.match("(b2*vu*;wKFRN!6", "3o");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(b2*vu*;wKFRN!6`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
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
  public void test047()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.match("", (-3388), (-3251), 321, (int[]) null, 92);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      RE2 rE2_0 = new RE2("CAPTURE");
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        rE2_0.match("CAPTURE", (-1), (-1), 0, intArray0, (-185));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, 0, 0, intArray0, 256);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.put((Machine) null);
      // Undeclared exception!
      try { 
        rE2_0.match("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 1204, true);
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
  public void test052()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, false);
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
  public void test053()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test054()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
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
  public void test055()  throws Throwable  {
      RE2 rE2_0 = new RE2("[^x00-x{10FFFF}]");
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
  public void test056()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test057()  throws Throwable  {
      RE2 rE2_0 = new RE2("K4_");
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
  public void test058()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Carian");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 1727);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, 793);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Fy]%#?yn{edn>4 S");
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
  public void test061()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("dglRd");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, (-406));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      RE2 rE2_0 = new RE2("CAPTURE");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, (byte)127);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(" gby0Rjosj;VM");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, 18);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$2", 2, false);
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
  public void test067()  throws Throwable  {
      try { 
        RE2.compilePOSIX("F)?");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
      try { 
        RE2.compileImpl("QfC@D`J#@o};)3P", (-3388), false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 281, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      try { 
        RE2.compile("G~zz.*+fW");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `*+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("Other_Grapheme_Extend");
      List<String[]> list0 = rE2_0.findAllSubmatch("o", 1623);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 523, false);
      byte[] byteArray0 = new byte[6];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("<@ahy");
      List<int[]> list0 = rE2_0.findAllIndex("I?", (-1543));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 523, false);
      byte[] byteArray0 = new byte[6];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("WglRd");
      byte[] byteArray0 = new byte[9];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 807);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("<@ahy");
      String[] stringArray0 = rE2_0.findSubmatch("I?");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertNotNull(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("AVn/()");
      byte[] byteArray0 = new byte[5];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$2");
      int[] intArray0 = rE2_0.findIndex("com.google.re2j.Simplify");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("AVn/()");
      int[] intArray0 = rE2_0.findIndex("AVn/()");
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 4}, intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$2", 0, false);
      String string0 = rE2_0.find("com.google.re2j.RE2$3");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = RE2.compileImpl("^z", (-3388), true);
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Mongolian", 1312, false);
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = RE2.quoteMeta("IAn}Xur0v:IM@{we");
      assertEquals("IAn\\}Xur0v:IM@\\{we", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("I?");
      String string0 = rE2_0.replaceAll("I?", "`r-<DZcV.g:ZVKe");
      assertEquals("`r-<DZcV.g:ZVKe?`r-<DZcV.g:ZVKe", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 523, false);
      String string0 = rE2_0.replaceAll("IAn}Xur0v:IM@{we", "");
      assertEquals("IAn}Xur0v:IM@{we", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = new RE2("d");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = new int[3];
      boolean boolean0 = rE2_0.match("", 0, 0, 0, intArray0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$2", 2, false);
      boolean boolean0 = rE2_0.match("com.google.re2j.RE2$2", 2, (byte)98, (-443), (int[]) null, 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      boolean boolean0 = rE2_0.match("", 0, 0, 2, (int[]) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = new RE2("CAPTURE");
      boolean boolean0 = rE2_0.match("com.google.re2j.RE2$7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 65129);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("AVn/()");
      List<String[]> list0 = rE2_0.findAllSubmatch("AVn/()", (-58));
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("|", 1623);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      RE2 rE2_0 = RE2.compile("$");
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 2233);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 65129);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("<@ahy");
      List<int[]> list0 = rE2_0.findAllIndex("<@ahy", 295);
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-715));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 523, false);
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 523, false);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("<@ahy");
      int[] intArray0 = rE2_0.findSubmatchIndex("`r-<DZcV.g:ZVKe");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }
}
