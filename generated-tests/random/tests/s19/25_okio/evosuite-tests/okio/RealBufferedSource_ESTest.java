/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:07:12 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Options;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSource_ESTest extends RealBufferedSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000000000L);
      Buffer buffer0 = pipe0.buffer;
      Charset charset0 = Charset.defaultCharset();
      buffer0.writeString("Expected leading [0-9a-fA-F] character but was %#x", charset0);
      Charset charset1 = Charset.defaultCharset();
      buffer0.writeString("Expected leading [0-9a-fA-F] character but was %#x", charset1);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteString(10000000000000000L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      long long0 = 416L;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Expected leading [0-9] or '-' character but was %#x");
      Pipe pipe0 = new Pipe(416L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = false;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long1 = 1647L;
      realBufferedSource0.closed = false;
      pipe0.sourceClosed = false;
      try { 
        realBufferedSource0.skip(9223372036854775807L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte)30;
      byteArray0[3] = (byte)110;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[4] = (byte) (-10);
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte) (-77);
      buffer0.writeLongLe(8180L);
      byteArray0[7] = (byte)1;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byteArray0[8] = (byte)19;
      ByteString byteString0 = ByteString.of(byteArray0, (int) (byte)1, (int) (byte)4);
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      HashingSource hashingSource1 = HashingSource.hmacSha1(hashingSource0, byteString0);
      HashingSource.hmacSha256(buffer0, byteString0);
      Charset charset0 = Charset.defaultCharset();
      ByteString.encodeString("QCq~2OtY:+F*'/jQ*\"y", charset0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource1);
      long long0 = realBufferedSource0.read(buffer0, (long) (byte)1);
      assertFalse(buffer0.exhausted());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      Pipe pipe0 = new Pipe(10000000000000000L);
      Buffer buffer0 = pipe0.buffer;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)102;
      byteArray0[1] = (byte) (-33);
      byteArray0[2] = (byte) (-84);
      byteArray0[3] = (byte) (-62);
      byteArray0[4] = (byte) (-28);
      ByteString byteString0 = new ByteString(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha1(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.indexOf(byteString0);
      long long0 = (-1L);
      // Undeclared exception!
      try { 
        Charset.forName("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      long long0 = (-804L);
      realBufferedSource0.skip((-804L));
      Charset.defaultCharset();
      // Undeclared exception!
      try { 
        hashingSource0.read(buffer0, (-1284L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1284
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      Source source0 = hashingSource0.delegate();
      FileSystemHandling.shouldAllThrowIOExceptions();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.readByteString();
      realBufferedSource0.readByteString();
      hashingSource0.hash();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(3332);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = realBufferedSource0.rangeEquals(4294967295L, byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer1);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-52);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.rangeEquals(893L, (ByteString) null, (int) (byte) (-52), (-2145081540));
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict((-2906L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // limit < 0: -2906
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pipe pipe0 = new Pipe(445L);
      pipe0.sinkClosed = true;
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readByteString();
      try { 
        realBufferedSource0.readShort();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long long0 = 2L;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Pipe pipe0 = new Pipe(2L);
      Source source0 = pipe0.source();
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readHexadecimalUnsignedLong();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(2744L);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteString byteString0 = ByteString.encodeUtf8("[GSY=");
      realBufferedSource0.rangeEquals(2744L, byteString0, 49, 49);
      String string0 = realBufferedSource0.readUtf8Line();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      String string0 = realBufferedSource0.readUtf8Line();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(702L);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe0.sourceClosed = false;
      HashingSource hashingSource0 = HashingSource.md5(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.buffer();
      pipe0.sinkClosed = true;
      try { 
        realBufferedSource0.readLongLe();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      HashingSource hashingSource0 = HashingSource.sha256(buffer1);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.read(buffer0, 924L);
      buffer1.outputStream();
      Charset charset0 = Charset.defaultCharset();
      realBufferedSource0.readString(charset0);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pipe pipe0 = new Pipe(926L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.close();
      realBufferedSource0.buffer();
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8((-278L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -278
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readIntLe();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      pipe0.sinkClosed = false;
      Buffer buffer0 = new Buffer();
      pipe0.sinkClosed = true;
      buffer0.snapshot();
      realBufferedSource0.read(buffer0, 32L);
      try { 
        realBufferedSource0.readUtf8LineStrict(32L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=0 content=\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      ByteString byteString0 = ByteString.encodeUtf8("");
      buffer1.indexOfElement(byteString0, 2813L);
      HashingSource hashingSource0 = HashingSource.sha1(buffer1);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte)0, (-504L), (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-504 toIndex=-1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      realBufferedSource0.indexOfElement(byteString0);
      realBufferedSource0.rangeEquals(1L, byteString0, 2147221535, (-2147221534));
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=0 content=\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString[] byteStringArray0 = new ByteString[7];
      String string0 = "";
      ByteString byteString0 = ByteString.decodeBase64("");
      byteStringArray0[0] = byteString0;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)52;
      byteArray0[1] = (byte)45;
      byteArray0[2] = (byte)48;
      byteArray0[3] = (byte)98;
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte) (-68);
      byteArray0[6] = (byte)69;
      ByteString byteString1 = ByteString.of(byteArray0);
      byteStringArray0[1] = byteString1;
      ByteString byteString2 = new ByteString(byteArray0);
      byteStringArray0[2] = byteString2;
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString3 = hashingSink0.hash();
      byteStringArray0[3] = byteString3;
      try { 
        realBufferedSource0.readByteString(2640L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByte();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      HashingSource hashingSource0 = HashingSource.sha1(realBufferedSource0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-62);
      byteArray0[1] = (byte)124;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)120;
      byteArray0[4] = (byte)82;
      byteArray0[5] = (byte)10;
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSource.hmacSha1(hashingSource0, byteString0);
      ByteString byteString1 = hashingSource0.hash();
      try { 
        realBufferedSource0.indexOfElement(byteString1);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      InflaterSource inflaterSource1 = new InflaterSource(gzipSource0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource1);
      try { 
        realBufferedSource0.indexOf((byte)27, 0L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(2969L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      // Undeclared exception!
      try { 
        realBufferedSource0.request((-1615L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1615
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readByteArray();
      realBufferedSource0.indexOf((byte)21, (long) (byte)21, (long) (byte)21);
      try { 
        realBufferedSource0.readInt();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readAll(buffer0);
      try { 
        realBufferedSource0.readLong();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      long long0 = 8192L;
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.sha1(pipe_PipeSource0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      inflaterSource0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      inflaterSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.select((Options) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      realBufferedSource0.rangeEquals(1L, byteString0, 2147221535, (-2147221534));
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=0 content=\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteArray(8192L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.md5(inflaterSource0);
      HashingSource hashingSource1 = HashingSource.sha256(hashingSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource1);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-60);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-112);
      byteArray0[3] = (byte)57;
      byteArray0[4] = (byte)13;
      byteArray0[5] = (byte) (-32);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)57;
      byteArray0[8] = (byte)1;
      try { 
        realBufferedSource0.read(byteArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RealBufferedSource realBufferedSource0 = null;
      try {
        realBufferedSource0 = new RealBufferedSource((Source) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      inflaterSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readShortLe();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-64);
      byteArray0[1] = (byte) (-51);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)13;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0, (int) (byte)0, 0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      buffer0.rangeEquals(100L, byteString0);
      GzipSource gzipSource0 = new GzipSource(buffer0);
      gzipSource0.timeout();
      gzipSource0.timeout();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      realBufferedSource0.buffer();
      gzipSource0.timeout();
      realBufferedSource0.require(0L);
      byte[] byteArray1 = realBufferedSource0.readByteArray(0L);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Charset charset0 = Charset.forName("US");
      buffer0.readString(charset0);
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      ByteString[] byteStringArray0 = new ByteString[8];
      byteStringArray0[0] = byteString0;
      byteStringArray0[1] = byteString0;
      byteStringArray0[2] = byteString0;
      byteStringArray0[3] = byteString0;
      ByteString byteString1 = ByteString.encodeString("", charset0);
      byteStringArray0[4] = byteString1;
      InputStream inputStream0 = realBufferedSource0.inputStream();
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        HashingSource.sha256((Source) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // delegate == null
         //
         verifyException("okio.ForwardingSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      pipe0.sinkClosed = true;
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      HashingSource hashingSource0 = HashingSource.sha256(pipe_PipeSource0);
      ByteString byteString0 = hashingSource0.hash();
      realBufferedSource0.indexOf(byteString0, 3L);
      byte[] byteArray0 = new byte[1];
      pipe0.sinkClosed = true;
      byteArray0[0] = (byte) (-31);
      realBufferedSource0.read(byteArray0);
      realBufferedSource0.indexOf((byte) (-31));
      try { 
        realBufferedSource0.readFully(byteArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Source source0 = null;
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-61);
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte)73;
      byteArray0[2] = (byte)108;
      byteArray0[3] = (byte)110;
      byte byte1 = (byte) (-104);
      byteArray0[4] = (byte) (-104);
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (int) (byte) (-61), (int) (byte) (-104));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=5 offset=-61 byteCount=-104
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[0];
      realBufferedSource0.readFully(byteArray0);
      byte byte0 = (byte)44;
      long long0 = 484L;
      realBufferedSource0.read(buffer0, 1280L);
      byte[] byteArray1 = null;
      // Undeclared exception!
      try { 
        realBufferedSource0.readFully((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      String string0 = realBufferedSource0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      HashingSource hashingSource1 = HashingSource.md5(hashingSource0);
      HashingSource hashingSource2 = HashingSource.sha1(hashingSource1);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource2);
      ByteString[] byteStringArray0 = new ByteString[6];
      ByteString byteString0 = ByteString.EMPTY;
      byteStringArray0[0] = byteString0;
      int int0 = (-700);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-700));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.exhausted();
      long long0 = (-3935L);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)13;
      byteArray0[1] = (byte)102;
      byteArray0[2] = (byte) (-30);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte) (-68);
      byteArray0[5] = (byte) (-122);
      byte byte0 = (byte) (-60);
      byteArray0[6] = (byte) (-60);
      byteArray0[7] = (byte)13;
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (int) (byte) (-60), 1920);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=8 offset=-60 byteCount=1920
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = null;
      try {
        inflaterSource0 = new InflaterSource((BufferedSource) null, inflater0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      long long0 = 1L;
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer0.readUnsafe();
      // Undeclared exception!
      try { 
        buffer0.readAndWriteUnsafe(buffer_UnsafeCursor0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // already attached to a buffer
         //
         verifyException("okio.Buffer", e);
      }
  }
}
