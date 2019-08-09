/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 02:22:05 GMT 2019
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
      RE2 rE2_0 = new RE2("iHx>CcgH'6Q{hE\"f|w");
      List<String[]> list0 = rE2_0.findAllSubmatch("iHx>CcgH'6Q{hE\"f|w", 2203);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      RE2 rE2_0 = new RE2("I");
      String[] stringArray0 = rE2_0.findSubmatch("]%2{YsD}sA.9PGrF3I");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      byte[] byteArray0 = new byte[9];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      RE2 rE2_1 = new RE2("|7(omp,)~x&");
      List<int[]> list0 = rE2_1.findAllUTF8Index(byteArray0, 128);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      String string0 = RE2.quoteMeta("IC@|%Mm$~Yjh_On");
      assertEquals("IC@\\|%Mm\\$~Yjh_On", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      rE2_0.findAllUTF8Index(byteArray0, 2565);
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      RE2 rE2_0 = new RE2("LH7pH~v");
      String string0 = rE2_0.toString();
      assertEquals("LH7pH~v", string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("g%\"os(U/kXv/')3R$");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("DX");
      boolean boolean0 = rE2_0.match("NO_MATCH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      Machine machine0 = rE2_0.get();
      assertNotNull(machine0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$9");
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("ms");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(2, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("DX");
      String string0 = rE2_0.find("DX");
      assertEquals("DX", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("`.ou");
      String string0 = rE2_0.replaceFirst("`.ou", "`.ou");
      assertEquals("`.ou", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("K~=Z", 31, false);
      String string0 = rE2_0.replaceAllFunc("o,f0PEX;b>", (RE2.ReplaceFunc) null, (byte)0);
      assertEquals("o,f0PEX;b>", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("S,<lb");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 6);
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
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("vQ#di-pJ8cU*>g ");
      Machine machine0 = new Machine(rE2_0);
      rE2_0.put(machine0);
      assertEquals("vQ#di-pJ8cU*>g ", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = RE2.match("x", charBuffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("T");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("T", 7, (-1), (-1502), intArray0, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      RE2 rE2_0 = new RE2("V`$&_");
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 204, false);
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray1, 2380);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("\"*o", 5, true);
      byte[] byteArray0 = new byte[5];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = new RE2("I");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-1285));
      assertEquals(3, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("DX");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-47));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<String[]> list0 = rE2_0.findAllSubmatch("com.google.re2j.RE2$1", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("com.google.re2j.RE2$9");
      List<int[]> list0 = rE2_0.findAllIndex("com.google.re2j.RE2$9", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("Ve:W5u+vC*0ASke@#&");
      List<int[]> list0 = rE2_0.findAllIndex("Ve:W5u+vC*0ASke@#&", 52);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, (-1223));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
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
  public void test040()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("DxjB!Dm,|u");
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
  public void test041()  throws Throwable  {
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
  public void test042()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
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
  public void test043()  throws Throwable  {
      try { 
        RE2.match("))d?s", "))d?s");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
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
  public void test045()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      // Undeclared exception!
      try { 
        rE2_0.match("", (byte)27, (byte)27, (byte)27, intArray0, (byte)27);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("gHo]3fM/Sf");
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, 917631, 917631, (byte)0, intArray0, (byte)0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("");
      // Undeclared exception!
      try { 
        rE2_0.match("", (byte) (-24), (byte) (-24), (byte) (-24), intArray0, (byte) (-24));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findIndex("");
      StringBuilder stringBuilder0 = new StringBuilder("");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuilder0);
      // Undeclared exception!
      try { 
        rE2_0.match(charBuffer0, 2772, 2772, (byte)0, intArray0, 2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
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
  public void test050()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("3");
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
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
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
  public void test053()  throws Throwable  {
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
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
      RE2 rE2_0 = RE2.compile(";");
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
  public void test056()  throws Throwable  {
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
  public void test057()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("3<");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, (-647));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("c}u<p");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, (-384));
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 628);
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
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, 2846);
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
      RE2 rE2_0 = RE2.compilePOSIX("B");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatchIndex((String) null, 1589);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      RE2 rE2_0 = new RE2("Pi");
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, 6);
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
      RE2 rE2_0 = RE2.compilePOSIX("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, 1174);
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
      RE2 rE2_0 = new RE2("o}jR86zfdKcWP");
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, 688);
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
  public void test066()  throws Throwable  {
      try { 
        RE2.compilePOSIX("8}9/3uw|E[aqbd}U");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[aqbd}U`
         //
         verifyException("com.google.re2j.Parser", e);
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
        RE2.compileImpl("{N-Xrz+t#)T2 t_", (-1011), false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, (-7), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
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
  public void test071()  throws Throwable  {
      RE2 rE2_0 = null;
      try {
        rE2_0 = new RE2("?_");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("wOr1", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("uzf/uaNmiQl");
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte) (-13));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("\"]fJn7E_zO{v", 0, true);
      List<int[]> list0 = rE2_0.findAllIndex("", (-1));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String> list0 = rE2_0.findAll("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("l6>");
      byte[] byteArray0 = new byte[4];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)66);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = new RE2("V`$&_");
      String[] stringArray0 = rE2_0.findSubmatch("V`$&_");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("#yM]k");
      byte[] byteArray0 = new byte[7];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("$JeS>fPWs");
      int[] intArray0 = rE2_0.findIndex("$JeS>fPWs");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("QZ6fie<FL?dGfQ");
      String string0 = rE2_0.find("dWa;$W1kZ8| ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 468, false);
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      RE2 rE2_0 = RE2.compileImpl("\"]fJn7E_zO{v", 0, true);
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      RE2 rE2_0 = new RE2("x");
      int[] intArray0 = rE2_0.findSubmatchIndex("MBB_+[YUPDi/$[BY(:");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("4gU93:|");
      String string0 = rE2_0.replaceAll("4gU93:|", "4gU93:|");
      assertEquals("4gU93:||4gU93:|", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX(".VqIBe");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, (byte) (-27));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("T");
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      boolean boolean0 = rE2_0.match("CB;JAw}rqmRBP01m{i", (byte)0, 212, (byte)0, (int[]) null, (byte)0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("B{xJT", 0, false);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "B{xJT");
      int[] intArray0 = new int[5];
      boolean boolean0 = rE2_0.match(charBuffer0, 0, 0, 7, intArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte) (-13));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", (-1));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = new RE2("I");
      List<String> list0 = rE2_0.findAll("]%2{YsD}sA.9PGrF3I", 2);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      List<int[]> list0 = rE2_0.findAllIndex("", 761);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[2];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-903));
      assertNotNull(list0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = new RE2("|I?k&lhc");
      String string0 = rE2_0.replaceAll("|I?k&lhc", (String) null);
      assertEquals("null|nullInull?nullknull&nulllnullhnullcnull", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      // Undeclared exception!
      try { 
        rE2_0.match("", 0, (byte)0, (byte)0, intArray0, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = new RE2("$");
      byte[] byteArray0 = new byte[9];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-2));
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }
}