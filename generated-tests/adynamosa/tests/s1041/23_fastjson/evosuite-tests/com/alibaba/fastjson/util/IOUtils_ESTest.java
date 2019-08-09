/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 18:54:00 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("read string from reader error");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("x{>lv5gn8aWj");
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 2994, charArray0);
      assertEquals((-1), int0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 118, 118, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("E=A1Lr\"", 2, 2);
      assertArrayEquals(new byte[] {(byte)3}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("]_?URe&AU=CP", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("GqT=P9,MEI`CN=", 3, 2994);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = IOUtils.stringSize(999999999);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[12];
      // Undeclared exception!
      try { 
        IOUtils.getChars(52429, 240, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 239
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, 240, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 239
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = IOUtils.stringSize(10L);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2146694413, 4, charArray0);
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
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 244);
      IOUtils.close(bufferedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("sMpC.4(>l?y81+", "Pog$0DKV||r!lE9IqZy");
      File file0 = MockFile.createTempFile("sMpC.4(>l?y81+", "Pog$0DKV||r!lE9IqZy", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      InputStreamReader inputStreamReader0 = new InputStreamReader(mockFileInputStream0, "UTF-8");
      String string0 = IOUtils.readAll(inputStreamReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[3];
      int int0 = IOUtils.encodeUTF8(charArray0, 3, 3, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = IOUtils.stringSize((long) (byte) (-128));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1847));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('0');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('a');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(539L, (-1167), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1168
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, 0, iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(260, 18, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1108), (-2146775840), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2146775841
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[8];
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
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)126, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[9];
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
  public void test29()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('6');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('A');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.CA, 0, 0, iOUtils0.specicalFlags_singleQuotes);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 692, 692, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 692
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("UTF-8");
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, 25, (-2570), charArray0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (-1710), 'T', charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1710
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-32), (-396));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -429
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", (-3752), 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(8064);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) ";E");
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
  public void test39()  throws Throwable  {
      Charset charset0 = IOUtils.UTF8;
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = charset0.encode("WNEk`cx'");
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer0, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockFile mockFile0 = new MockFile("fastjson.compatibleWithFieldName", "fastjson.compatibleWithJavaBean");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      IOUtils.close(mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2016L), 486, (char[]) null);
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
      // Undeclared exception!
      try { 
        IOUtils.getChars((-452), 83, (char[]) null);
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
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-115), (-2092), (char[]) null);
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
        IOUtils.encodeUTF8((char[]) null, (-1282), 141, (byte[]) null);
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
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8((byte[]) null, 92, 6, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 1, 8064);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect('\u00BE');
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "");
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
  public void test51()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharBuffer charBuffer0 = CharBuffer.allocate(106);
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
  public void test52()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.compatibleWithJavaBean");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("H]K:$zoG%%::E=");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("H]K:$zoG%%::E=", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      char[] charArray0 = new char[8];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 5, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0084', '\u0004', '\u0004', '\u0004', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      //  // Unstable assertion: assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-112);
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 687, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 'x', 865, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("c(}2?");
      char[] charArray0 = new char[6];
      charArray0[2] = '\u0084';
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, 2425, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("sZ582jvXYUm)=(;");
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("@i)p_&BHC");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-4), (byte)17, (byte) (-62)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("zz`}_c^,Q]b>!(L=");
      assertEquals(11, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 1, 963, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("w");
      char[] charArray0 = new char[4];
      int int0 = IOUtils.encodeUTF8(charArray0, (-12), (-12), byteArray0);
      assertEquals(0, int0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 12, 2);
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)125}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("E=A1Lr\"", 1, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("zz`}_c^,Q]b>!(L=", 2, 3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("WhDs#0", (-1226), (-1226));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64((String) null, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 4, 4);
      assertArrayEquals(new byte[] {(byte)106, (byte)88, (byte) (-101)}, byteArray0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[5] = '=';
      charArray0[7] = 'l';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[4] = 'd';
      charArray0[7] = 'Y';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[7] = 'l';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 4, 4);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      char[] charArray0 = new char[8];
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
  public void test75()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      char[] charArray0 = new char[8];
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
  public void test77()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u0084');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u0109');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u0084');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u010F');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharBuffer charBuffer0 = CharBuffer.allocate(103);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-116);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
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
  public void test82()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(44);
      CharBuffer charBuffer0 = CharBuffer.allocate(149);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(1.0F, uTF8Decoder0.maxCharsPerByte(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-64), 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      char[] charArray0 = new char[12];
      IOUtils.getChars((byte)12, (int) (byte)12, charArray0);
      assertEquals(12, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-670), 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars(4, 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '4', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      char[] charArray0 = new char[2];
      IOUtils.getChars(1L, 2, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '7'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((-913L), 7, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '-', '9', '7', '3', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(100000000000L, 1, charArray0);
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
      int int0 = IOUtils.stringSize(1613L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("A0");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }
}