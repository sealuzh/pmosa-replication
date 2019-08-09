/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 04:23:33 GMT 2019
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
      RE2 rE2_0 = RE2.compilePOSIX("[:^xdigit:]");
      String[] stringArray0 = rE2_0.findSubmatch("[:^xdigit:]");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      String string0 = RE2.quoteMeta("nH^'8KIG{.ts");
      assertEquals("nH\\^'8KIG\\{\\.ts", string0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      byte[] byteArray0 = new byte[6];
      rE2_0.matchUTF8(byteArray0);
      RE2 rE2_1 = RE2.compile("com.google.re2j.RE2$3");
      Machine machine0 = rE2_1.get();
      rE2_0.put(machine0);
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("}|t]s0@TIa8(/-j7v)");
      String string0 = rE2_0.toString();
      assertEquals("}|t]s0@TIa8(/-j7v)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceFirst("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("}|t]s0@TIa8(/-j7v)");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = RE2.match("com.google.re2j.RE2$9", "com.google.re2j.RE2$9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      RE2 rE2_0 = new RE2("RUNE_ANY_NOT_NL");
      byte[] byteArray0 = rE2_0.prefixUTF8;
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertEquals(15, byteArray1.length);
      assertNotNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(">&V8waU", (-55), true);
      String string0 = rE2_0.find(">&V8waU");
      assertEquals(">&V8waU", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("RUNE_ANY", 3769, false);
      String string0 = rE2_0.replaceFirst("RUNE_ANY", (String) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("F\bk@Y[O]z=MGP");
      String string0 = rE2_0.replaceFirst("F\bk@Y[O]z=MGP", "?&}GYKSOS4");
      assertEquals("F\bk@Y[O]z=MGP", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.RE2", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(">&V8waU", (-1848), true);
      String string0 = rE2_0.replaceAllFunc("{Zqq6_7|Y[u8Ec$IN", (RE2.ReplaceFunc) null, (-1848));
      assertEquals("{Zqq6_7|Y[u8Ec$IN", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("C,-05uK");
      String string0 = rE2_0.replaceAllFunc("", (RE2.ReplaceFunc) null, 421);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", (String) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("<iG;HA;T8");
      rE2_0.put((Machine) null);
      Machine machine0 = rE2_0.get();
      assertNull(machine0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("eY");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = RE2.match("", "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      // Undeclared exception!
      try { 
        rE2_0.match("<", (-1981), (byte) (-87), (byte)0, (int[]) null, (byte)0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("'Ss@4@4:DgH");
      boolean boolean0 = rE2_0.match("|s[c]kB3DW{J");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("^");
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = rE2_0.match(charBuffer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RE2 rE2_0 = new RE2("RUNE_ANY_NOT_NL");
      byte[] byteArray0 = new byte[0];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("'Ss@4@4:DgH");
      int[] intArray0 = rE2_0.findSubmatchIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("F\bk@Y[O]z=MGP");
      int[] intArray0 = rE2_0.findIndex("F\bk@Y[O]z=MGP");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("'Ss@4@4:DgH");
      byte[] byteArray0 = new byte[1];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("Linear_B", 14, false);
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 14);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/2wcpem1!P5FZ-", 0, true);
      byte[] byteArray0 = new byte[1];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("oKx3oUHQ", (-2232), false);
      byte[] byteArray0 = new byte[0];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (-2232));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("com.google.re2j.RE2$3");
      byte[] byteArray0 = new byte[6];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl(">&V8waU", (-55), true);
      byte[] byteArray0 = new byte[0];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, (-55));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[0];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (-2458));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("RUNE_ANY", 3769, false);
      List<String[]> list0 = rE2_0.findAllSubmatch("RUNE_ANY", 0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("F\bk@Y[O]z=MGP");
      List<int[]> list0 = rE2_0.findAllIndex("", (-624));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("^");
      List<String> list0 = rE2_0.findAll("com.google.re2j.Compiler$Frag", (byte)64);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("F\bk@Y[O]z=MGP");
      String string0 = rE2_0.find("xs");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", (-614), false);
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
  public void test039()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("dd!fls/", 1872, false);
      // Undeclared exception!
      try { 
        rE2_0.replaceAllFunc((String) null, (RE2.ReplaceFunc) null, 2482);
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
      RE2 rE2_0 = RE2.compileImpl(">&V8waU", (-55), true);
      // Undeclared exception!
      try { 
        rE2_0.replaceAll((String) null, ">&V8waU");
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
      RE2 rE2_0 = RE2.compile("F\bk@Y[O]z=MGP");
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
  public void test044()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("", 7, false);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        rE2_0.match("", 7, 1018, 1018, intArray0, 66640);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("U:W+:njQ|0?", (-2232), true);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        rE2_0.match("U:W+:njQ|0?", (-2232), (-510), (byte)32, intArray0, (byte) (-69));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Machine", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("");
      CharBuffer charBuffer0 = CharBuffer.allocate(961);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        rE2_0.match(charBuffer0, (byte) (-125), 10, (byte)105, intArray0, 2497);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("bkx0ets<G<<mTh;3\"", (byte) (-70), false);
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
  public void test049()  throws Throwable  {
      RE2 rE2_0 = new RE2("&'aU2<SDA");
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
  public void test050()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("'J;gt{%IpRZ%%");
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
  public void test051()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("c1Fv%uT05z,CQ-96");
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
  public void test052()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
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
  public void test053()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
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
  public void test054()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("19`1^&");
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
  public void test055()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("I.");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8SubmatchIndex((byte[]) null, (byte) (-119));
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
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Submatch((byte[]) null, 1600);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput$UTF8Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("oQYJ^ZEozr4 vO");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8Index((byte[]) null, 8333);
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
      RE2 rE2_0 = RE2.compile("");
      // Undeclared exception!
      try { 
        rE2_0.findAllUTF8((byte[]) null, 3058);
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
        rE2_0.findAllSubmatchIndex((String) null, (-1229));
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
      RE2 rE2_0 = RE2.compileImpl("U:W+:njQ|0?", 1018, false);
      // Undeclared exception!
      try { 
        rE2_0.findAllSubmatch((String) null, (-4122));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.MachineInput", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      // Undeclared exception!
      try { 
        rE2_0.findAllIndex((String) null, (byte)113);
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
      RE2 rE2_0 = RE2.compileImpl("", 1, false);
      // Undeclared exception!
      try { 
        rE2_0.findAll((String) null, (-1));
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
      RE2 rE2_0 = RE2.compileImpl("com.google.re2j.RE2$10", 42896, true);
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
  public void test064()  throws Throwable  {
      try { 
        RE2.compilePOSIX("0r>diH*$uIO[>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[>`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
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
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        RE2.compileImpl((String) null, 0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
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
  public void test068()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("U:W+:njQ|0?", (-2232), true);
      List<int[]> list0 = rE2_0.findAllIndex("U:W+:njQ|0?", (byte)32);
      assertEquals(11, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("z");
      List<int[]> list0 = rE2_0.findAllSubmatchIndex("z", 5);
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[7];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 14);
      assertNotNull(list0);
      assertEquals(8, list0.size());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("C,-05uK");
      List<String[]> list0 = rE2_0.findAllSubmatch("", (byte) (-3));
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<int[]> list0 = rE2_0.findAllIndex("", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String> list0 = rE2_0.findAll("tJ4pbSp", (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("z");
      byte[] byteArray0 = new byte[3];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, 2573);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("oKx3oUHQ", (-2232), false);
      String[] stringArray0 = rE2_0.findSubmatch("{z");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String[] stringArray0 = rE2_0.findSubmatch("");
      assertEquals(1, stringArray0.length);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("z");
      byte[] byteArray0 = new byte[3];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[7];
      byte[][] byteArray1 = rE2_0.findUTF8Submatch(byteArray0);
      assertNotNull(byteArray1);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("oKx3oUHQ", (-2232), false);
      int[] intArray0 = rE2_0.findIndex("");
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = rE2_0.findIndex("");
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("C,-05uK");
      String string0 = rE2_0.find("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("/2wcpem1!P5FZ-", 0, true);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = rE2_0.findUTF8Index(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("C,-05uK");
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = rE2_0.findUTF8(byteArray0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("oKx3oUHQ", (-2232), false);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      String string0 = RE2.quoteMeta("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.replaceAll(".+*?()|[]{}^$", "Llz(xRs j@bH#I0V>");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = rE2_0.matchUTF8(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        rE2_0.match((CharSequence) null, (byte) (-119), (byte) (-119), 0, intArray0, 120603);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      RE2 rE2_0 = RE2.compilePOSIX("oQYJ^ZEozr4 vO");
      int[] intArray0 = new int[5];
      boolean boolean0 = rE2_0.match("oQYJ^ZEozr4 vO", (byte) (-1), (byte) (-1), (byte) (-1), intArray0, 120603);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int[] intArray0 = new int[0];
      boolean boolean0 = rE2_0.match("", (byte) (-55), (-1017), (byte) (-33), intArray0, (-1017));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      boolean boolean0 = rE2_0.match("bh-W", 0, 212, (byte) (-1), (int[]) null, 928);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RE2 rE2_0 = RE2.compileImpl("oKx3oUHQ", (-2232), false);
      boolean boolean0 = rE2_0.match("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[7];
      List<int[]> list0 = rE2_0.findAllUTF8SubmatchIndex(byteArray0, 3432);
      assertEquals(8, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String[]> list0 = rE2_0.findAllSubmatch("__#~  IyPYi", 43471);
      assertEquals(12, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      byte[] byteArray0 = new byte[7];
      List<byte[]> list0 = rE2_0.findAllUTF8(byteArray0, (byte)0);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[7];
      List<int[]> list0 = rE2_0.findAllUTF8Index(byteArray0, 846);
      assertNotNull(list0);
      assertEquals(8, list0.size());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      List<String> list0 = rE2_0.findAll("", (byte) (-39));
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[7];
      List<byte[][]> list0 = rE2_0.findAllUTF8Submatch(byteArray0, (byte)77);
      assertEquals(8, list0.size());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      String string0 = rE2_0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      String string0 = rE2_0.replaceAll("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = rE2_0.findUTF8SubmatchIndex(byteArray0);
      assertNotNull(intArray0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      rE2_0.reset();
      assertEquals("", rE2_0.toString());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      RE2 rE2_0 = RE2.compile("");
      int[] intArray0 = rE2_0.findSubmatchIndex("[`YWJ2hJ");
      assertNotNull(intArray0);
      
      rE2_0.match("[`YWJ2hJ", (byte)2, 0, 0, intArray0, 1386);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      RE2 rE2_0 = new RE2("");
      int int0 = rE2_0.numberOfCapturingGroups();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuilder0);
      boolean boolean0 = RE2.match("", charBuffer0);
      assertTrue(boolean0);
  }
}
