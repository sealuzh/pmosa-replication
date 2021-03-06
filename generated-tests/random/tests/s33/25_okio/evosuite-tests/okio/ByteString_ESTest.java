/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:14:35 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = byteString0.toByteArray();
      assertEquals(1214, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("v", charset0);
      ByteString byteString1 = ByteString.encodeString("[text=v]", charset0);
      int int0 = byteString1.lastIndexOf(byteString0, 1347);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString0.lastIndexOf(byteString1, (int) (byte)50);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString1.lastIndexOf(byteString0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4746);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[9];
      int int0 = byteString0.EMPTY.indexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("|C$3+i6", charset0);
      Buffer buffer0 = new Buffer();
      byteString0.write(buffer0);
      assertEquals(7L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("v", charset0);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring(6, (int) (byte) (-44));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("already attached to a buffer");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      boolean boolean0 = byteString0.rangeEquals((int) (byte)48, byteString0, (int) (byte)72, (int) (byte) (-121));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals((-2153), byteString0, 56, (-679));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 1261, 29);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=4 offset=1261 byteCount=29
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      ByteString byteString1 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      byte[] byteArray0 = new byte[3];
      ByteString byteString1 = new ByteString(byteArray0);
      ByteString byteString2 = byteString0.hmacSha512(byteString1);
      assertNotSame(byteString1, byteString2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      ByteString byteString1 = ByteString.of(byteArray0);
      ByteString byteString2 = byteString0.hmacSha256(byteString1);
      assertNotSame(byteString1, byteString2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Object object0 = new Object();
      boolean boolean0 = byteString0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("", 942);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.substring((-4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("!4  ");
      // Undeclared exception!
      try { 
        byteString0.EMPTY.rangeEquals(42, (ByteString) null, 42, 42);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte)11);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.EMPTY.indexOf(byteArray0, (int) (byte)28);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[2];
      boolean boolean0 = byteString0.rangeEquals(1214, byteArray0, 580, (int) (byte)90);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.utf8();
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4746);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = byteString0.rangeEquals((int) (byte)38, byteString0, (-1234), (int) (byte) (-44));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(942);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=d41d8cd98f00b204e9800998ecf8427e]", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("\n", 28);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("CU6E#u\"\"7dzx", 9);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=0000000000]", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.EMPTY.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteString byteString1 = realBufferedSource0.readByteString();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(52);
      ByteString.of(byteBuffer0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("[size=", charset0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(4746);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.hmacSha1(byteString0);
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.EMPTY.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.sha256();
      boolean boolean0 = byteString0.equals(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.Pipe$PipeSink");
      byte[] byteArray0 = new byte[6];
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte)62);
      assertEquals(18, byteString0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString0.indexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.sha1();
      boolean boolean0 = byteString0.startsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      MockPrintStream mockPrintStream0 = new MockPrintStream("p");
      byteString0.write(mockPrintStream0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("already attached to a buffer");
      ByteString byteString1 = byteString0.substring(5);
      assertEquals(13, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.Pipe$PipeSink");
      // Undeclared exception!
      try { 
        byteString0.substring(81, 13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString(0L);
      // Undeclared exception!
      try { 
        byteString0.substring(150, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(0)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.substring((-1), 1413);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("already attached to a buffer");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)127;
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("!]Z%4jF<lF&Y");
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)75;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
      assertArrayEquals(new byte[] {(byte)0, (byte)75, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiLowercase();
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, 1966);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        ByteString.read(pipedInputStream0, 1763);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteString byteString0 = ByteString.read(byteArrayInputStream0, (byte)0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, (-4481));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        ByteString.read(pushbackInputStream0, (-1355));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1355
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("84C:4-|=4Y6pPSsr0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: :
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("data == null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: t
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("7%k'+ W}|gQa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: %
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("s == null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hex == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("Z3b", charset0);
      String string0 = byteString0.hex();
      assertEquals("5a3362", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.Pipe$PipeSink");
      String string0 = byteString0.EMPTY.hex();
      assertEquals(18, byteString0.size());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeBase64((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // base64 == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.string((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = ByteString.of(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.string(charset0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("v", charset0);
      String string0 = byteString0.toString();
      assertEquals("[text=v]", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("CRC", charset0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)56;
      byteArray0[1] = (byte)9;
      byte byte0 = (byte) (-124);
      byteString0.EMPTY.utf8();
      byteArray0[2] = (byte) (-124);
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.hmacSha1(buffer0, byteString0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      HashingSource hashingSource1 = HashingSource.sha256(inflaterSource0);
      ByteString byteString1 = hashingSource1.hash();
      byteString0.EMPTY.endsWith(byteString1);
      byteString0.startsWith(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.getByte((byte) (-124));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("Y@G{F=8LF/*", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        ByteString.encodeString((String) null, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeUtf8((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 71, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=71 byteCount=2
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.EMPTY.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      int int0 = byteString0.EMPTY.indexOf(byteString0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      // Undeclared exception!
      try { 
        byteString0.hmacSha512(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byteString0.write(realBufferedSink0.buffer);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.substring(0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.sha512();
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      assertFalse(byteBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.EMPTY.md5();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.EMPTY.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.hmacSha1(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.EMPTY.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.lastIndexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1214);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      int int0 = byteString0.lastIndexOf(byteString0, (int) (byte)50);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.hmacSha256(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha256();
      String string0 = byteString1.base64();
      assertEquals("47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=", string0);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      byte[] byteArray1 = byteString0.internalArray();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      assertNotNull(byteString0);
      
      byte[] byteArray0 = new byte[3];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }
}
