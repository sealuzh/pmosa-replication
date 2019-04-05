/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:50:10 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.PushbackReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-38);
      byteArray0[3] = (byte) (-111);
      byteArray0[4] = (byte)69;
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 0, (byte)54, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)118;
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 0, (byte)54, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = IOUtils.stringSize((long) 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1615L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(1L, 0, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 263, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 262
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)83, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)83, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)95, (-1968), iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1969
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('4');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.CA, (-2958), (-2958), iOUtils0.specicalFlags_singleQuotes);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (-1902), (byte)65, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1902
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(6457, 6457, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-6), (-6));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -13
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('=');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[2];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0);
      PushbackReader pushbackReader0 = new PushbackReader(bufferedReader0);
      String string0 = IOUtils.readAll(pushbackReader0);
      assertEquals("\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-18);
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, (byte)73, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[6] = (byte) (-112);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 5, 76, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-32);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 76, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = new char[8];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1073741824, (byte) (-31), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-38);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, (byte)54, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, (byte)6, (byte)115, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("{fC=*");
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(";#");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.CA, 73, 73, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 73
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("jjz/q8L}");
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("\"pv_~<Z[YT!M58:^|5", 2, 2);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("-<Nc0-kR0=Q [Mu\"_^Z", 5, 104);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("-}A[A_}", (-902), (-902));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("cf{jg*!;", 0, 0);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, (-3960), byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.IOUtils", 14, 14);
      assertEquals(10, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-78), (byte) (-40), (byte) (-20), (byte) (-1), (byte) (-1), (byte) (-18), (byte) (-1), (byte) (-1), (byte) (-1), (byte)32}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 3, 3);
       //  fail("Expecting exception: NegativeArraySizeException");
       // Unstable assertion
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[4] = 'v';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 3, 3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("H3%^k`n=e[%`~iq;%W");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('*');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('c');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(191);
      CharBuffer charBuffer0 = CharBuffer.allocate(191);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      charBuffer0.put(charBuffer1);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(92);
      Charset charset0 = Charset.defaultCharset();
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(0, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = IOUtils.stringSize(6062);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte) (-57), 43, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[3];
      IOUtils.getChars((byte)3, 1, charArray0);
      assertArrayEquals(new char[] {'3', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars(99, 3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '9', '9', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2144475967, 2144475967, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2144475966
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-952), 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(1000000000L, (-1694), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000000L, 47, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 46
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-3377L), 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[4];
      IOUtils.getChars(92L, 3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '9', '2', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      int int0 = IOUtils.stringSize(2147483647L);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("com.alibaba.fastjson.JSONException", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      IOUtils.close(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("fastjson.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((int) (byte)3, (-2), iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }
}