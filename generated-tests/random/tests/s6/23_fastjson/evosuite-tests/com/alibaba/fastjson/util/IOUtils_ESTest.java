/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:54:25 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-124);
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)4, 1519, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)24;
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 0, (byte)24, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)96;
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)47, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1840));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('4');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 95, 95, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 95
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.DIGITS, 0, 6, iOUtils0.specicalFlags_singleQuotes);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-4247), (-4247));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -8495
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", (-370), (-904));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(843L, (-2526), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)79, (-1322), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-777), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -777
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1408);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer1 = ByteBuffer.wrap(iOUtils0.specicalFlags_doubleQuotes);
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer1);
      // Undeclared exception!
      try { 
        IOUtils.decode((CharsetDecoder) null, byteBuffer0, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('/');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.util.UTF8Decoder");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("H&Thvr)N");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("H&Thvr)N", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-12);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 76, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte) (-64);
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)5, 7, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-19);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)11, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-45);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)47, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[9];
      int int0 = IOUtils.encodeUTF8(charArray0, (-32), (-32), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 9, 647, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("qB_=(");
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("SHOMY |#)%");
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("z");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("^N}(/X\"YM:[ X3");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-10), (byte)12, (byte) (-1), (byte) (-1), (byte) (-41)}, byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("^N}(/X\"YM:[ X3", 4, 4);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-40)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("<kuf}up@S7KK/9>2s", 4, 4);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 8064, (-767));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("F-Wpv7b0$!Fjmo!B", (-468), 0);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-187), (-468), charArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[4] = 'R';
      charArray0[6] = 'X';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[4] = 's';
      charArray0[7] = 'v';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[4] = 'R';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 244, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 4, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("encodeUTF8 error");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('O');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('>');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1);
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 1, 1);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertFalse(charBuffer0.isDirect());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = IOUtils.stringSize(2920);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars((byte)9, 3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '9', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-81), 101, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 100
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)27, 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[2];
      IOUtils.getChars(2, 2, charArray0);
      assertArrayEquals(new char[] {'\u0000', '2'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars((-2564), 6, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '2', '5', '6', '4', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2147483646), (-2147483646), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483647
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(701, 701, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000L, 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (-996), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -997
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483662L, (-996), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -997
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1L), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[5];
      IOUtils.getChars((long) 4, 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '4', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = IOUtils.stringSize(4017L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 2414);
      IOUtils.close(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("utf8 decode error, ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte) (-58), 33, iOUtils0.CA);
  }
}
