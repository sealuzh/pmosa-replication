/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 17:44:27 GMT 2019
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
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("+c:?K&V!Tn");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-53);
      byteArray0[2] = (byte) (-49);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 43, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder");
      char[] charArray0 = new char[10];
      int int0 = IOUtils.decodeUTF8(byteArray0, 11, 11, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'-', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(27, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[10];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 43, 43, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      char[] charArray0 = new char[1];
      byte[] byteArray0 = new byte[5];
      int int0 = IOUtils.encodeUTF8(charArray0, 1543, (-4501), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("LDcGC@IPm+R=");
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("AMQ7OgA>6`k");
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("BZ!`%lt&)qy=e,v", 11, 11);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '\u00AE';
      charArray0[1] = '=';
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
  public void test009()  throws Throwable  {
      int int0 = IOUtils.stringSize(9);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65512, 21, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, 65536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      char[] charArray0 = new char[1];
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
  public void test013()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 78, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 77
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = IOUtils.stringSize(1000000L);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(9999999997L, 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileWriter mockFileWriter0 = new MockFileWriter(";?up/3]K");
      IOUtils.close(mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int int0 = IOUtils.stringSize((-872L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      int int0 = IOUtils.stringSize((-5));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('5');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('a');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) (-2), (-2), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[6];
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
  public void test026()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2279, (int) (byte)32, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-3865), 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 1, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-1), 1029, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1028
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-12), 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, 2313, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2312
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('6');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[4];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 1432, 1759, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (-232), 471, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -232
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 26, (-32), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 13, 13, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 6, (byte)0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      char[] charArray0 = new char[10];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-446), (-446), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 159, (-3067));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2909
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharBuffer charBuffer0 = CharBuffer.allocate(4);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, (ByteBuffer) null, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(99999);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
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
        IOUtils.getChars((long) 30, 30, (char[]) null);
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
        IOUtils.getChars((-355), (-355), (char[]) null);
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
        IOUtils.getChars((byte)46, (int) (byte)46, (char[]) null);
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
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (-1955), (-1955), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8((byte[]) null, 3678102, 3678102, charArray0);
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
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-2656), (-2656));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5313
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", (-1622), (-1622));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 6, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
        IOUtils.decodeBase64("=");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
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
  public void test057()  throws Throwable  {
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3);
      CharBuffer charBuffer0 = CharBuffer.allocate(2);
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
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
  public void test058()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1339);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, (CharBuffer) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("Y");
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
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
  public void test060()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      StringReader stringReader0 = new StringReader("w#");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("w#", string0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-16);
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 1, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[5] = (byte) (-16);
      char[] charArray0 = new char[17];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 5, (byte)103, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-53);
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 821, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-53);
      byteArray0[2] = (byte) (-120);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 1, 821, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, 3, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '\u0096';
      byte[] byteArray0 = new byte[2];
      int int0 = IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
      assertEquals(2, int0);
      assertArrayEquals(new byte[] {(byte) (-62), (byte) (-106)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("LDcGC@IPm+:=");
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertArrayEquals(new char[] {'7', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(8, byteArray0.length);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("._->");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("{&6");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3869, 1810, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3869
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("\"?mK.e8=dM,UM", 6, 6);
      assertArrayEquals(new byte[] {(byte) (-16), (byte)7, (byte)76}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("n=OdtK", 1, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("|{\"zt", 1, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("uf8 decode rJr, ", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("utf8 decode error, ", 2, 2);
      assertArrayEquals(new byte[] {(byte)127}, byteArray0);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[1] = '2';
      charArray0[2] = 'x';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 4);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 0, 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'Z';
      charArray0[4] = '6';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 6);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[4] = '=';
      charArray0[5] = '=';
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
  public void test081()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = '=';
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
  public void test082()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'Z';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 6);
      int int0 = IOUtils.decodeUTF8(byteArray0, 8, (-1235), charArray0);
      assertEquals(0, int0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 685, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 6);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('|');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("\uFFFD\u06DE\uFFFD*\uFFFD\t\r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier(';');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjsRn.util0UTF8Decoeer");
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[1];
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
  public void test091()  throws Throwable  {
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertEquals("", charBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int int0 = IOUtils.stringSize((int) '\\');
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      char[] charArray0 = new char[34];
      IOUtils.getChars((byte) (-111), 21, charArray0);
      assertEquals(34, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-101), (int) (byte) (-101), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -102
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte)7, (int) (byte)7, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '7', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      char[] charArray0 = new char[4];
      IOUtils.getChars((-157), 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'-', '1', '0', '7'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      char[] charArray0 = new char[15];
      IOUtils.getChars(3678080, 7, charArray0);
      assertEquals(15, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      char[] charArray0 = new char[10];
      IOUtils.getChars(100000L, 6, charArray0);
      assertArrayEquals(new char[] {'1', '0', '0', '0', '0', '0', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000043L, 30, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((-1528L), 6, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '1', '5', '2', '8'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter(";?up/3]K");
      IOUtils.close(mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("t");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }
}
