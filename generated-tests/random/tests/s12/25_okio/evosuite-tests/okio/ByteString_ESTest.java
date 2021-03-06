/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:49:16 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      boolean boolean0 = byteString0.equals(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      byte[] byteArray1 = byteString0.toByteArray();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("1f");
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.string(charset0);
      assertEquals("\u001F", string0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("1f");
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString0.lastIndexOf(byteString1, 65280);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      String string0 = byteString0.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)121;
      ByteString byteString0 = new ByteString(byteArray0);
      byte byte0 = byteString0.getByte(0);
      assertEquals((byte)121, byte0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("Nvpd)", charset0);
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      String string0 = byteString0.base64Url();
      assertEquals("AAAAAAAAAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(3594);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = byteString0.rangeEquals(3594, byteArray0, 21, 3594);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha512();
      boolean boolean0 = byteString1.EMPTY.rangeEquals((-39), byteString1, 7, (int) (byte) (-90));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals(0, byteString0, 47, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.rangeEquals((int) (byte)111, byteString0, 85, 60);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 97, (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=8 offset=97 byteCount=0
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 8192, 108);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=9 offset=8192 byteCount=108
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.lastIndexOf(byteArray0, 122);
      assertEquals(122, int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString0, 47);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.EMPTY.lastIndexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("\\");
      byte[] byteArray0 = new byte[7];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals((-1), int0);
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("1f");
      int int0 = byteString0.indexOf(byteString0, 4);
      assertEquals((-1), int0);
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.hmacSha512(byteString1);
      assertEquals(64, byteString2.size());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2749);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte byte0 = byteString0.getByte(0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      // Undeclared exception!
      try { 
        byteString0.getByte(2148);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      boolean boolean0 = byteString0.EMPTY.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
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
  public void test028()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[3];
      int int0 = byteString0.EMPTY.lastIndexOf(byteArray0, (int) (byte) (-90));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2749);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[6];
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString1.indexOf(byteArray0, (int) (byte) (-16));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      int int0 = byteString0.EMPTY.indexOf(byteArray0, 108);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.indexOf(byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      byte[] byteArray0 = new byte[2];
      ByteString byteString1 = byteString0.sha512();
      boolean boolean0 = byteString1.rangeEquals((int) (byte)53, byteArray0, (int) (byte) (-55), (int) (byte)4);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.rangeEquals(2148, byteArray0, (int) (byte) (-69), (-1145));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.hex();
      assertEquals("0000", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.utf8();
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.utf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)87;
      byteArray0[1] = (byte) (-16);
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=57f0000000]", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)13;
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[text=\\r]", string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)10;
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=0a00]", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("byteString == null", (byte)10);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      String string0 = byteString0.EMPTY.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = ByteString.encodeUtf8("");
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)97;
      ByteString byteString1 = new ByteString(byteArray0);
      ByteString byteString2 = byteString0.hmacSha256(byteString1);
      int int0 = byteString2.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("1f");
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, byteString0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("1f");
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("Nvpd)", charset0);
      boolean boolean0 = byteString0.equals(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("Nvpd)", charset0);
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)109;
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.toAsciiUppercase();
      int int0 = byteString0.indexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString0.indexOf(byteString1, (-39));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha1();
      boolean boolean0 = byteString1.endsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("", charset0);
      boolean boolean0 = byteString1.startsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.rangeEquals((-2981), byteArray0, (-1731), (-2981));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("2B");
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
  public void test058()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      MockPrintStream mockPrintStream0 = new MockPrintStream("h1h");
      byteString0.EMPTY.write(mockPrintStream0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(2749);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      String string0 = byteString0.toString();
      assertEquals("[size=2749 hex=00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\u2026]", string0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha1();
      ByteString byteString2 = byteString1.substring((int) (byte)14);
      assertEquals(6, byteString2.size());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(17);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      // Undeclared exception!
      try { 
        byteString0.substring(1331);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.substring(31, 31);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(0)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ByteString byteString0 = new ByteString((byte[]) null);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring((-488), 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.EMPTY.sha256();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("HmacSHA256", charset0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        ByteString.read(pipedInputStream0, (-1607));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1607
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, 49);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, (byte)47);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("Expected leading [0-9] or '-' character but was 0x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: x
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("&f0at%H eQyw*-nJ#I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: &
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("PkEP66 ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: PkEP66 
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
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
  public void test076()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("knJ@");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
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
  public void test080()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      String string0 = byteString0.EMPTY.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("~yz&k1/N>Mq.?", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
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
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, (-4005), (-9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
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
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.getByte((-3716));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
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
  public void test089()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.write((Buffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.substring(0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3516);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      assertEquals(2, byteBuffer0.limit());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.EMPTY.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.hmacSha1(byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      boolean boolean0 = byteString0.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
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
  public void test098()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha1();
      String string0 = byteString1.base64();
      assertEquals("2jmj7l5rSw0yVb/vlWAYkK/YBwk=", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiLowercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.EMPTY.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      int int0 = byteString0.EMPTY.indexOf(byteString0, (-2458));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      byte[] byteArray0 = new byte[3];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }
}
