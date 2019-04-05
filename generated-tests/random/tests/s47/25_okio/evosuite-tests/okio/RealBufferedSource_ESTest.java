/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:54:02 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Options;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSource_ESTest extends RealBufferedSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)107);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byteString0.write(buffer0);
      realBufferedSource0.readFully(byteArray0);
      assertTrue(buffer0.exhausted());
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)107);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      HashingSink hashingSink0 = HashingSink.hmacSha256(buffer0, byteString0);
      ByteString byteString1 = hashingSink0.hash();
      byteString1.write(buffer0);
      realBufferedSource0.readIntLe();
      assertTrue(buffer0.exhausted());
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000000L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      long long0 = realBufferedSource0.indexOf((byte) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8((-1152921504606846976L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1152921504606846976
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      inflaterSource0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readLong();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      ByteString byteString0 = ByteString.encodeUtf8("l2}= =7|^'-Z}W");
      HashingSource hashingSource0 = HashingSource.hmacSha1(pipe_PipeSource0, byteString0);
      pipe_PipeSource0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOfElement(byteString0, 2059L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte) (-1), (-2662L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-2662 toIndex=9223372036854775807
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      HashingSource hashingSource0 = HashingSource.sha256(gzipSource0);
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      byte[] byteArray0 = new byte[6];
      inflater0.setInput(byteArray0);
      try { 
        realBufferedSource0.indexOf((byte)70);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // java.util.zip.DataFormatException: unknown compression method
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)107);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf(byteString0, (-531L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex < 0
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[1];
      buffer0.write(byteArray0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      boolean boolean0 = realBufferedSource0.request(1793L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8CodePoint();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.buffer.writeInt(2);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOfElement((ByteString) null, 2752L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeIntLe((-867));
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=4 content=9dfcffff\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte)0, (-1L), (long) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-1 toIndex=-1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.skip((-2103L));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(1449L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      try { 
        realBufferedSource0.readUtf8LineStrict(1449L);
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
      Pipe pipe0 = new Pipe(2147483647L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict((-1386L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // limit < 0: -1386
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.readUtf8Line();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Charset charset0 = Charset.defaultCharset();
      String string0 = realBufferedSource0.readString(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)107);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byteString0.write(buffer0);
      realBufferedSource0.read(byteArray0);
      realBufferedSource0.buffer();
      assertTrue(buffer0.exhausted());
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      byte[] byteArray0 = new byte[3];
      try { 
        realBufferedSource0.readFully(byteArray0);
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
      Pipe pipe0 = new Pipe(1000000L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      ByteString[] byteStringArray0 = new ByteString[2];
      HashingSource hashingSource0 = HashingSource.sha1(realBufferedSink0.buffer);
      ByteString byteString0 = hashingSource0.hash();
      byteStringArray0[0] = byteString0;
      Options options0 = Options.of(byteStringArray0);
      int int0 = realBufferedSource0.select(options0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.closed = false;
      realBufferedSource0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSource0.readByte();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)107);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byteString0.write(buffer0);
      realBufferedSource0.readIntLe();
      assertEquals(0L, buffer0.size());
      assertTrue(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      boolean boolean0 = realBufferedSource0.exhausted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      long long0 = realBufferedSource0.read(buffer0, 8L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.read(buffer0, (-241L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -241
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      assertTrue(buffer1.exhausted());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = realBufferedSource0.readByteArray();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Pipe pipe0 = new Pipe(811L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readShortLe();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.readUtf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)107);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = realBufferedSource0.rangeEquals((-531L), byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("J", charset0);
      HashingSource hashingSource0 = HashingSource.hmacSha1(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readFully(buffer0, (-3759L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -3759
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      pipe_PipeSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readLongLe();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = new ByteString(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha1(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
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
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.indexOf((byte)53, (long) (byte)53);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readUtf8(2L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      Timeout timeout0 = gzipSource0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      GzipSource gzipSource0 = new GzipSource(hashingSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      try { 
        realBufferedSource0.indexOf(byteString0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
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
  public void test43()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000000L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      byte[] byteArray0 = new byte[7];
      int int0 = realBufferedSource0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      try { 
        realBufferedSource0.readByteString();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      HashingSource hashingSource0 = HashingSource.sha256(gzipSource0);
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      String string0 = realBufferedSource0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000000000000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
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
  public void test47()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteArray(1793L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = new ByteString(byteArray0);
      long long0 = realBufferedSource0.indexOfElement(byteString0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      InputStream inputStream0 = realBufferedSource0.inputStream();
      assertNotNull(inputStream0);
  }
}