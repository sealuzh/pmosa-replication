/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 08:44:48 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.Reader;
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
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-40);
      byteArray0[1] = (byte) (-3);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)111, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-104);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 7, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("F~c\"8#UjC[= ");
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghijklmnopqrstuvwxyz012356789+/");
      assertEquals(46, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = IOUtils.stringSize(Integer.MAX_VALUE);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(55296, (int) (byte)1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, (-1270), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1271
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = IOUtils.stringSize(10L);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2147483645), 7, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      IOUtils.close(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = IOUtils.stringSize((-493L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1400));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('5');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(530L, 1314, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1313
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (-3044), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3045
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1306), 558, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 557
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-24), 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 5372, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5371
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, (int) (byte)0, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('9');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[5];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.CA, 0, (-1618), iOUtils0.specicalFlags_singleQuotes);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, 224, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-2645), (byte)0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 3961, 3961, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3961
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 7, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("r$n~JP", (-2275), (-2275));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 53, 53);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("W'Gd");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "W'Gd");
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
  public void test034()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2152);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertEquals(2152, charBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.readAll((Reader) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read string from reader error
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) (-2510), 1, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(18, (-1649), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)14, (int) (byte)14, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-118), (int) (byte) (-118), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -119
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 2, (-2154), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8((byte[]) null, (-63), 7, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, (-1988), (-1988));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 6071, 6071);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6071
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 7, (-1438));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("$>#E/<|/J", 7, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
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
  public void test050()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(84);
      CharBuffer charBuffer0 = CharBuffer.allocate(255);
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
  public void test051()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, (ByteBuffer) null, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-47);
      byteArray0[6] = (byte) (-128);
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 4, (byte)30, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 4, 2128, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("wK-VsGjKo8sF6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.compatibleWithJavaBean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v8\"O~:M0E>GBY");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("v8\"O~:M0E>GBY", string0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("k8Dgs?cDbUXT82kEQ");
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 1023, charArray0);
      assertEquals((-1), int0);
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-30);
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, (byte)30, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-31);
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 3, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-40);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)111, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = IOUtils.decodeBase64("k8Ds?cDbUXT82kEQ");
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 668, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(12, byteArray0.length);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-15);
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 3, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 4, charArray0);
      assertArrayEquals(new char[] {'\u0004', '\u0004', '\u0004', '\u0004', '\u0000'}, charArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.properties");
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 1, charArray0);
      assertEquals(14, byteArray0.length);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("k8Dgs?cDbUXT82kEQ");
      char[] charArray0 = new char[5];
      IOUtils.decodeUTF8(byteArray0, (-659), (-659), charArray0);
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      char[] charArray0 = new char[14];
      byte[] byteArray0 = new byte[6];
      int int0 = IOUtils.encodeUTF8(charArray0, 2, 2, byteArray0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[4] = '\u008F';
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 4, 4, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.properties");
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (-160), 2795, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -160
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("F~c\"8#Uj2C[\"= ");
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(";2>&");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("=");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("k8Ds?cDbUXT82kVGEQ");
      char[] charArray0 = new char[0];
      int int0 = IOUtils.encodeUTF8(charArray0, (-1638), (-1638), byteArray0);
      assertEquals(14, byteArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("/1WV4*4Oi1\"J.Pu[~Z", 7, 7);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-13)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("nzG0pmF!jl)[)", 7, 4);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("`'jcC+)-.>osM:[", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONEcep8ion", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("xsa>&=xyo", 3, 192);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'V';
      charArray0[2] = 'O';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, (int) (byte)2);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 41, 41);
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
  public void test083()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'V';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, (int) (byte)2);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 0, 0);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 0, 90, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, (int) (byte)2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u008B');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('!');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate((byte)19);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // utf8 decode error, Input length = 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte) (-128), (int) (byte)36, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      char[] charArray0 = new char[5];
      IOUtils.getChars((byte)34, 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '\u0000', '2', '4', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-882), 4, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      char[] charArray0 = new char[5];
      IOUtils.getChars(1023, 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'6', '0', '2', '3', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars(7L, 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '7', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      char[] charArray0 = new char[14];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483660L, 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      int int0 = IOUtils.stringSize(20L);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      IOUtils.close(bufferedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("k8Ds?cDbUXT82kVGEQ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-5108L), 10, iOUtils0.CA);
  }
}
