/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:03:11 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("E,yhh_.Wt(7j.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-128);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)1, 1073741824, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'A';
      charArray0[1] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize((-225));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('2');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(85, (-972), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -973
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-126), (-622), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -623
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('&');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1953, 1953, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1953
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)39, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("=", (-1492), (-1492));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedWriter0, false);
      IOUtils.close(mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 0, (-1), (char[]) null);
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
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 92, 3052);
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
  public void test18()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(" {V");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.util.UTF8Decoder");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_6vJg&gq:I:;J4{*5_");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("_6vJg&gq:I:;J4{*5_", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte) (-18);
      byteArray0[7] = (byte) (-78);
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)4, 999999999, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte) (-18);
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)4, 999999999, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 39, 39, charArray0);
      assertEquals(48, byteArray0.length);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("Jt6Oc;L");
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertEquals((-1), int0);
      assertEquals(5, byteArray0.length);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-8), (-2132), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 33, 33, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (byte)4, 4515, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[3];
      int int0 = IOUtils.encodeUTF8(charArray0, (-8), (-8), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("zD;h~=");
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("k%Fa1.+rB6HdKA+(");
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 2, charArray0);
      assertEquals(11, byteArray0.length);
      assertArrayEquals(new char[] {'Z', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("?");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("read string from reader error", 4, 4);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("BKH(hD{U_iMQ!", 6, 6);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("${jP.q6-3lF\"V", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("", (-1690), 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[4] = 'L';
      charArray0[5] = 'J';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 1);
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
      char[] charArray0 = new char[11];
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
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 4, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 36, 36);
      assertEquals(27, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 46, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, (-720));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -720
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('%');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('2');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('g');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[0];
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
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
  public void test50()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.properties");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertFalse(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = IOUtils.stringSize(104);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte)7, (int) (byte)7, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '7', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((byte) (-16), 6, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '-', '4', '6'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[2];
      IOUtils.getChars((-1), 2, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'-', '4'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars(1043, 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2146150635, 48, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 47
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-640), (-1474), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars(1, 1, charArray0);
      assertArrayEquals(new char[] {'1', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 624, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 623
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000000L, 103, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 102
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars(0L, 3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '0', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = IOUtils.stringSize(4992L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = IOUtils.stringSize((-3095L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("G GA[zXNU");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-214L), 49, iOUtils0.replaceChars);
  }
}
