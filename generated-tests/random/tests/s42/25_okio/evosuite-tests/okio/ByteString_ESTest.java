/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:10:21 GMT 2019
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
import okio.Buffer;
import okio.ByteString;
import okio.HashingSource;
import okio.Pipe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("HmacSHA256", charset0);
      ByteString byteString1 = ByteString.decodeBase64("HmacSHA256");
      boolean boolean0 = byteString0.endsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.Buffer$2");
      byte[] byteArray0 = byteString0.toByteArray();
      assertEquals(13, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.lastIndexOf(byteArray0);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("We", charset0);
      ByteString byteString1 = ByteString.encodeUtf8("");
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[5];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(32);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString1.indexOf(byteString0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("mzw3p)Fqb+6={'\"P");
      String string0 = byteString0.base64Url();
      assertEquals("bXp3M3ApRnFiKzY9eyciUA==", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.sha1();
      String string0 = byteString1.base64();
      assertEquals("2jmj7l5rSw0yVb/vlWAYkK/YBwk=", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Pipe pipe0 = new Pipe(13);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      byteString0.write(buffer0);
      assertEquals(20, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.Buffer$2");
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertFalse(boolean0);
      assertEquals(13, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = byteString0.rangeEquals(1594, byteArray0, (int) (byte)1, (int) (byte) (-3));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.rangeEquals((int) (byte) (-117), byteString0, 111, (-164));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(32);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = byteString0.rangeEquals(54, byteString0, 2753, 87);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, (-4403));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = ByteString.decodeBase64("");
      int int0 = byteString0.lastIndexOf(byteString1, (int) (byte)101);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.lastIndexOf(byteString1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteArray0, 1173);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = ByteString.decodeBase64("");
      assertNotNull(byteString1);
      
      int int0 = byteString0.indexOf(byteString1, 111);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(32);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      int int0 = byteString0.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString0.hmacSha256(byteString1);
      assertNotSame(byteString0, byteString2);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("T4", charset0);
      ByteString byteString2 = byteString0.hmacSha1(byteString1);
      assertNotSame(byteString0, byteString2);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("SHA-256", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("-9223372036854775808", (-977));
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("", 2009);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, 36);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.md5();
      byte[] byteArray0 = new byte[6];
      int int0 = byteString1.lastIndexOf(byteArray0, 102);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.hex();
      assertEquals("0000000000", string0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(32);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      int int0 = byteString0.size();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.sha1();
      String string0 = byteString1.toString();
      //  // Unstable assertion: assertEquals("[hex=0a00a0ee0e60400002000fef0060a800af080000]", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=0a000000000000]", string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("-9223372036854775808");
      String string0 = byteString0.toString();
      assertEquals("[text=-9223372036854775808]", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("mzw3p)Fqb+6={'\"P");
      String string0 = byteString0.EMPTY.toString();
      assertEquals("[size=0]", string0);
      assertEquals(16, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = ByteString.encodeUtf8("[hex=209b000000]");
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      ByteString byteString1 = ByteString.encodeUtf8("");
      boolean boolean0 = byteString0.equals(byteString1);
      assertNotSame(byteString1, byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(32);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[5];
      ByteString byteString1 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.equals(byteString1);
      assertFalse(byteString1.equals((Object)byteString0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      boolean boolean0 = byteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("mzw3p)Fqb+6={'\"P");
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
      assertEquals(16, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(98);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)69;
      int int0 = byteString0.indexOf(byteArray0, (-1439));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha256();
      boolean boolean0 = byteString0.startsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.sha512();
      boolean boolean0 = byteString0.endsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals(49, byteArray0, 64, 202);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("kdO[~4D}@RgAuobA;_", charset0);
      boolean boolean0 = byteString0.rangeEquals((-1102), byteString0, (-1102), (-1977));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        byteString0.write(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("We", charset0);
      ByteString byteString1 = byteString0.substring(2, 2);
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("G5%#g4p");
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring((int) (byte)39);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring(0, 556);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(0)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.substring(0, 0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      int int0 = byteString1.lastIndexOf(byteString2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("kdO[~4D}@RgAuobA;_", charset0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 117);
      try { 
        ByteString.read(pushbackInputStream0, (byte)122);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteString byteString0 = ByteString.read(pipedInputStream0, 0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2992);
      // Undeclared exception!
      try { 
        ByteString.read(pipedInputStream0, (-1515));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1515
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        ByteString.read(pipedInputStream0, 5);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("qV");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: q
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("f6Q^bHy_bW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: Q
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("*0R,tF:3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: *
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("EQ)HzE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: Q
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("]Vk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: ]Vk
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
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
  public void test074()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
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
  public void test075()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.utf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("|;", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
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
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      ByteString byteString1 = ByteString.of(byteBuffer0);
      String string0 = byteString1.toString();
      assertEquals("[hex=0000000000]", string0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, (-793), 71);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 65, 622);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=9 offset=65 byteCount=622
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      boolean boolean0 = byteString0.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.EMPTY.indexOf(byteString0, 9);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.hmacSha512(byteString0);
      assertEquals(64, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      Pipe pipe0 = new Pipe(13);
      Buffer buffer0 = pipe0.buffer;
      byteString0.write(buffer0);
      assertEquals(0L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("mzw3p)Fqb+6={'\"P");
      // Undeclared exception!
      try { 
        byteString0.substring((-976));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.sha256();
      byte[] byteArray1 = byteString1.internalArray();
      assertNotSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
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
  public void test095()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString0, (int) (byte)101);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
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
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.sha1();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiLowercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.EMPTY.indexOf(byteString0);
      assertEquals(0, int0);
  }
}
