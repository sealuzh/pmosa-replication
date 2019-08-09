/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 11:31:57 GMT 2019
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
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("M", (byte) (-92));
      assertEquals(2, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$");
      String[] stringArray0 = rE2_0.findSubmatch("(");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("b");
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)98;
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      String string0 = RE2.quoteMeta("D9Qd)\"[m~Z");
      assertEquals("D9Qd\\)\"\\[m~Z", string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(">");
      Machine machine0 = rE2_0.get();
      rE2_0.replaceAll("", "");
      rE2_0.put(machine0);
      List<String> list0 = rE2_0.findAll("Ch15;-e\"lTp Ae<:", 795);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("U$1A/ oLmup5+=L=&%I", 668, false);
      String string0 = rE2_0.replaceAllFunc("Rlk4,+*T%]hs-", (RE2.ReplaceFunc) null, 8);
      assertEquals("Rlk4,+*T%]hs-", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = new RE2("k87bJstsg}*p");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 929);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = new RE2("$G_mxD(GhR'd)");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("D9Qd)\"[m~Z", 1758, false);
      boolean boolean0 = rE2_0.match("com.google.re2j.RE2$3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = new RE2("y");
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)121;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertArrayEquals(new byte[] {(byte)121}, byteArray1);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$6");
      String string0 = rE2_0.replaceFirst("com.google.re2j.RE2$6", "com.google.re2j.RE2$6");
      assertEquals("com.google.re2j.RE2$6", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("Q1ErT+", (RE2.ReplaceFunc) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("4");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 2596);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (-40));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      RE2 rE2_0 = new RE2("84$CC:w7");
      String string0 = rE2_0.replaceAll("any -> ", (String) null);
      assertEquals("any -> ", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", "P?Pe1kB");
      assertEquals("P?Pe1kB", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(69807);
      boolean boolean0 = RE2.match("", charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = new RE2("a#~8}4Rj_xQ1_VMOb");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = new RE2("com.google.re2j.RE2$1");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = rE2_0.findIndex("");
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$10");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[8];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-2399));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = new RE2("z7!8 DLa:ky");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 1689);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = new RE2("A");
      byte[] byteArray0 = new byte[1];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("END_TEXT");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-156));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("/<NM ");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("/<NM ", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (byte) (-92));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 0, true);
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      RE2 rE2_0 = new RE2("aRjeM?c`d-.");
      // Undeclared exception!
      try { 
        rE2_0.replaceFirst((String) null, (String) null);
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
      RE2 rE2_0 = RE2.compile("");
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
  public void test042()  throws Throwable  {
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
  public void test043()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test044()  throws Throwable  {
      try { 
        RE2.match("hi)yi", "hi)yi");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.match("", 13, 13, 13, (int[]) null, 13);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, 1, 1, (-1), (int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.match("", (-20), (-20), (-20), (int[]) null, (-20));
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
      RE2 rE2_0 = new RE2("");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        rE2_0.match(charBuffer0, 32, 2120, 0, intArray0, 9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        rE2_0.match("", (-3187), (-3187), 0, intArray0, 64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("|");
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
  public void test052()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("A");
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
  public void test053()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
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
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test056()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("|");
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
      RE2 rE2_0 = new RE2("");
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, 1689);
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
        rE2_0.findAllUTF8Submatch((byte[]) null, 515);
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
      RE2 rE2_0 = new RE2("$7.ZW]J");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, (-3751));
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, 7);
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, (-577));
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 1489);
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
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, 0);
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, 14);
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
      RE2 rE2_0 = new RE2("#<|");
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
  public void test068()  throws Throwable  {
      try { 
        RE2.compileImpl("+&g]jN`4|V}p}", (-31), true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 128, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
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
  public void test072()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("?L");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("3#.~n");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("'O0|w]=!U]", 3112);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("QltLia+", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = new RE2("y");
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)121;
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-19));
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = new RE2("k87bJstsg}*p");
      List<int[]> list0 = rE2_0.findAllIndex("k87bJstsg}*p", (byte)23);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String> list0 = rE2_0.findAll("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("cuFj0{,B? y");
      String[] stringArray0 = rE2_0.findSubmatch("cuFj0{,B? y");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("cuFj0{,B? y");
      byte[] byteArray0 = new byte[5];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("cuFj0{,B? y");
      int[] intArray0 = rE2_0.findIndex("com.google.re2j.Machine$1");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      RE2 rE2_0 = new RE2("84$CC:w7");
      String string0 = rE2_0.find("84$CC:w7");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("error parsing regexp: ");
      String string0 = rE2_0.find("error parsing regexp: ");
      assertEquals("error parsing regexp: ", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      RE2 rE2_0 = new RE2("k87bJstsg}*p");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = new RE2("y");
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)121;
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {4, 5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("D9Qd)\"[m~Z", 1758, false);
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      RE2 rE2_0 = new RE2("84$CC:w7");
      int[] intArray0 = rE2_0.findSubmatchIndex("(%PVB/]v:-3%l");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("mOLnXfz2a>3G?|");
      String string0 = rE2_0.replaceAll("mOLnXfz2a>3G?|", "at#J");
      assertEquals("at#J?at#J|at#J", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = new RE2("TA/|");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = new RE2("84$CC:w7");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("P?Pe1kB", 0, 0, 0, (int[]) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      boolean boolean0 = rE2_0.match("", 1, 1, 1, (int[]) null, 1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("", 256, 210, 256, intArray0, 256);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (-608));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte) (-16));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[2];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte) (-92));
      assertNotNull(list0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 199);
      assertEquals(3, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("mOLnXfz2a>3G?|");
      List<String> list0 = rE2_0.findAll("mOLnXfz2a>3G?|", (-435));
      assertEquals(3, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllIndex("", (byte) (-92));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("D9Qd)\"[m~Z", 1758, false);
      String string0 = rE2_0.toString();
      assertEquals("D9Qd)\"[m~Z", string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("3fUW~{");
      rE2_0.reset();
      assertEquals("3fUW~{", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      RE2 rE2_0 = new RE2("z>");
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
  public void test106()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(2, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      boolean boolean0 = RE2.match("}:?!~~vp", "}:?!~~vp");
      assertFalse(boolean0);
  }
}
