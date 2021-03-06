/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:18:34 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-61);
      byteArray0[6] = (byte) (-52);
      char[] charArray0 = new char[13];
      int int0 = IOUtils.decodeUTF8(byteArray0, 5, (byte)125, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-115);
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, (byte)61, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 70, 70, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[6];
      int int0 = IOUtils.encodeUTF8(charArray0, (-180), (-180), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[5] = '\u0080';
      byte[] byteArray0 = new byte[5];
      int int0 = IOUtils.encodeUTF8(charArray0, 5, 1, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-62), (byte) (-128), (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("D8c,R]=");
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("UTF18", 3, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = IOUtils.stringSize(9);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.getChars(56320, 56320, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 56319
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, (int) (byte) (-128), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -129
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (int) '\u0000', charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = IOUtils.stringSize(10L);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(1000000000L, 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("UTF-8", true);
      IOUtils.close(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONException");
      stringReader0.skip('\u00F6');
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 0, 1, iOUtils0.DIGITS);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      int int0 = IOUtils.stringSize((-687L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int int0 = IOUtils.stringSize((-180));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('~');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('A');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 1, 689, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 688
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      char[] charArray0 = new char[3];
      IOUtils.getChars(0L, 1, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'-', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(6, 6, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-32), 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 84, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 83
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)43, 117, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 116
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      char[] charArray0 = new char[5];
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
  public void test029()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier(':');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('4');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2844, 131, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[8];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[8];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 5, byteArray0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, 569, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (-117), (byte) (-37), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-2001), (-495));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2497
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 663, (-748));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -86
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("com.alibaba.fastjson.util.IOUtils$1", (-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("4GAmHbXxc-T");
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      // Undeclared exception!
      try { 
        IOUtils.decode((CharsetDecoder) null, (ByteBuffer) null, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, 0, 0);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertFalse(byteBuffer0.isDirect());
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
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
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-221L), 0, (char[]) null);
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
        IOUtils.getChars((-2137810297), (-66), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
        IOUtils.getChars((byte)0, (-781), (char[]) null);
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
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)125, 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("' +0jnWs*");
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, (-2137810297), (-2137810297), byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[4] = 'a';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 4, 47, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8((byte[]) null, (-6699), 1, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 791, 2146600999);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-37);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
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
  public void test057()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('5');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("Il&R>Sz@m2m6x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_zkmS{MUJv2mY^al");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("_zkmS{MUJv2mY^al", string0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte) (-11);
      byteArray0[3] = (byte) (-77);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, (byte)15, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[2] = (byte) (-11);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, (byte)15, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-27);
      char[] charArray0 = new char[13];
      int int0 = IOUtils.decodeUTF8(byteArray0, 5, (byte)125, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-17);
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, (byte)3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-61);
      char[] charArray0 = new char[13];
      int int0 = IOUtils.decodeUTF8(byteArray0, 5, (byte)125, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-52);
      byteArray0[3] = (byte) (-77);
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 2, (byte)15, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-389), (-389), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(" xDmc':sbI]x#(9=-");
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 1, charArray0);
      assertEquals(11, byteArray0.length);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("~:");
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1580, (-3), charArray0);
      assertEquals(0, int0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      char[] charArray0 = new char[8];
      charArray0[4] = '\u00E5';
      int int0 = IOUtils.encodeUTF8(charArray0, 1, 5, byteArray0);
      assertEquals(24, byteArray0.length);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("UTF-8", 1, 3);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 0, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("5[~Phs}", 1, 256);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64((String) null, 12, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("E]*:A*ZNbuZj2UNs", 4, 4);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-10), (byte)77}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'i';
      charArray0[6] = 'i';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 7);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.compatibleWithJavaBean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u0102');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('a');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u0102');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[3];
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
  public void test085()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      ByteBuffer byteBuffer0 = charset0.encode("");
      CharBuffer charBuffer0 = CharBuffer.allocate(3253);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Current state = FLUSHED, new state = CODING_END
         //
         verifyException("java.nio.charset.CharsetDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      int int0 = IOUtils.stringSize(28);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte) (-16), 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '1', '6', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte)121, 28, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-518), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-123008), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      char[] charArray0 = new char[1];
      IOUtils.getChars(4, 1, charArray0);
      assertArrayEquals(new char[] {'4'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 65536, 65536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000000L, (-32), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -33
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-3181L), 4, charArray0);
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
      int int0 = IOUtils.stringSize((long) 'i');
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("UTF-8", true);
      IOUtils.close(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("UTF-8");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-2), 4, iOUtils0.DIGITS);
  }
}
