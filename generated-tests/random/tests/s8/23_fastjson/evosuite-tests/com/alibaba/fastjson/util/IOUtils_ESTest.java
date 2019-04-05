/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:09:59 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.PushbackReader;
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
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("qe&m*qV");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-58);
      byteArray0[2] = (byte) (-1);
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, (byte)79, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)93;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)20, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)25;
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)4, 2151, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IOUtils.stringSize(100L);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      String string0 = IOUtils.readAll(pushbackReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = IOUtils.stringSize((-213L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(41, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)67, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, (int) (byte)0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 10, 10, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("i{d:{3lE>-/>Pj6~<");
      char[] charArray0 = new char[5];
      int int0 = IOUtils.encodeUTF8(charArray0, (-1407), (-1407), byteArray0);
      assertEquals(0, int0);
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-2506), (-1), charArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("gCC9`pu8y_", (-949), (-949));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, (ByteBuffer) null, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 6, (-333));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -328
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 65536, (-801));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[5];
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)79);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.compatibleWithFieldName");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      String string0 = IOUtils.readAll(charArrayReader0);
      assertEquals("\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-15);
      byteArray0[3] = (byte) (-95);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, 4304, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-15);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, 4304, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte) (-125);
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 8064, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-47);
      byteArray0[3] = (byte) (-125);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 2, 8064, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-47);
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 8064, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte) (-18);
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)4, 2151, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8((byte[]) null, 3, (-737), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, 6, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[4];
      int int0 = IOUtils.encodeUTF8(charArray0, 2, 2, byteArray0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("XP^+6k<!1q&]tBWa=");
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("]'");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("c|';\".74oI", 2, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 177, (-377));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.IOUtils", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O", 7, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(",P~AOs;L/ny8%#Z", 6, 6);
      assertArrayEquals(new byte[] {(byte)47, (byte) (-7), (byte) (-14)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[3] = 'M';
      charArray0[4] = 'h';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[3] = 'Y';
      charArray0[6] = 'Y';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 4);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-40)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[3] = 'Y';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 4);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 112, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 2, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('<');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('8');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('o');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2772);
      CharBuffer charBuffer0 = CharBuffer.allocate(4);
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
  public void test51()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteBuffer0.limit());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = IOUtils.stringSize(144);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[4];
      IOUtils.getChars((byte) (-122), 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'-', '1', '0', '0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((byte)10, 3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '1', '0', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-114), (int) (byte) (-114), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -115
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars(4, 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '4', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[8];
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
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((-3388), 5, charArray0);
      assertArrayEquals(new char[] {'-', '3', '3', '8', '8', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(192, 48, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 47
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((-2360L), 6, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '2', '3', '6', '0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      char[] charArray0 = new char[1];
      IOUtils.getChars(0L, 1, charArray0);
      assertArrayEquals(new char[] {'0'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.getChars(1094L, 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 745, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 744
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-148L), (-45), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -46
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000000L, (-182), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*Q2}_`</Z");
      IOUtils.close(stringReader0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("aZ$~,5");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }
}