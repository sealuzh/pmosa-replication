/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 10:08:21 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("UTF-8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-61);
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1669, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)119, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("T%:-(y%_r$%G5xsZ=~=");
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[4] = 'A';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize(99);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, 224, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 223
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = IOUtils.stringSize(10000L);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2146245905, 5, charArray0);
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(",tnJxMH\"7jnP\"f^EI", false);
      IOUtils.close(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      InputStreamReader inputStreamReader0 = new InputStreamReader(sequenceInputStream0, "UTF-8");
      String string0 = IOUtils.readAll(inputStreamReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = IOUtils.stringSize((-2035));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('4');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('A');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 240, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 239
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483651L, (int) '\u0000', charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, (-367), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -368
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(1745, 1745, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1744
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1412), (-3384), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3385
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)8, 2628, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2627
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('4');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = IOUtils.encodeUTF8((char[]) null, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 0, 855, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = IOUtils.encodeUTF8((char[]) null, (-128), (-128), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3171, 3171, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3171
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)31, 65536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 31
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8((byte[]) null, (-538), 0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8((byte[]) null, (-1), (-1), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-52), (-52));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -105
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 0, (-296));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
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
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(99961L, (-1752), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((int) (byte)4, 66, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-104), (-128), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (-2147483646), (-2147483646), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)65, 41, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 56320, 1548);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-430), 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -430
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 44, (-40));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 122, (-2));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[5];
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = IOUtils.UTF8;
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 2);
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
  public void test52()  throws Throwable  {
      Charset charset0 = IOUtils.UTF8;
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = charset0.encode("a");
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer0, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("Q4#dhqTAk*#bs+C", 7, 7);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.util.UTF8Decoder");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(charArrayReader0, 1189);
      String string0 = IOUtils.readAll(bufferedReader0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-13);
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, 3968, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte) (-83);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 242, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte) (-111);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 242, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-32);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 242, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-28);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 160, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-19);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 2, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("JgnKTh#GaVs.ty");
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)1, 43, charArray0);
      assertEquals((-1), int0);
      assertEquals(10, byteArray0.length);
      assertArrayEquals(new char[] {'\t', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("JgnKTh#GaVs.ty");
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, (byte)1, charArray0);
      assertEquals(10, byteArray0.length);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = new byte[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)1, (byte)1, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+8");
      char[] charArray0 = new char[12];
      int int0 = IOUtils.decodeUTF8(byteArray0, 9, 9, charArray0);
      assertEquals((-1), int0);
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      char[] charArray0 = new char[4];
      int int0 = IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[2] = '\u00B4';
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, 27, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("<0d**T1f~;Z].6>11=");
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(")8x5$`mS1b]5oG2V==~");
      assertEquals(10, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("F");
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 3, 94, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("&F*m)8\u0003.*M.x_XW>$", 3, 14);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-11), (byte) (-42)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("&F**)8\u0003.dQx6_XW>$", 2, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("y],Y8J0ZBN;5", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("", (-427), 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[2] = 'o';
      charArray0[3] = 'D';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 2, 2);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[9];
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
  public void test80()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u00B4');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u00A2');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-2);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1376);
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
  public void test84()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-1), (int) (byte)1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars((byte)10, 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '\u0000', '0', '-', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      char[] charArray0 = new char[5];
      IOUtils.getChars(1112, 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'0', '0', '0', '0', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((-2), 2, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'-', '0', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      char[] charArray0 = new char[6];
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
  public void test89()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars(653L, 6, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '6', '5', '3', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1L), (int) (byte)1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000000L, 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(",tnJxMH\"7jnP\"f^EI", false);
      IOUtils.close(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("4IRh1|ga<hNt))@Q");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharsetDecoder charsetDecoder0 = iOUtils0.UTF8.newDecoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("");
      CharBuffer charBuffer0 = CharBuffer.wrap(iOUtils0.replaceChars);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertEquals(1.0F, charsetDecoder0.maxCharsPerByte(), 0.01F);
  }
}