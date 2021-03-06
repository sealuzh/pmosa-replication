/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:59:28 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSink;
import okio.HashingSink;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSink_ESTest extends RealBufferedSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pipe pipe0 = new Pipe(3300L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertNotSame(buffer1, buffer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8((String) null, 1, (-2130964542));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("", 1196, 1196);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 1196 > 0
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      GzipSink gzipSink0 = new GzipSink(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString((String) null, 0, 2294, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort((-1));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe(0L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt((-2130964542));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong((-528L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(827L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) realBufferedSource0, 0L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(827L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("P47]LrU wqP:vYw");
      ByteString byteString0 = ByteString.of(byteBuffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("buffer([size=0])", (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -1
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(370L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("iCWxJs#E", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8CodePoint(102);
      realBufferedSink0.close();
      assertFalse(buffer0.exhausted());
      assertEquals(1L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSource0.buffer);
      Deflater deflater0 = gzipSink0.deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink(realBufferedSource0.buffer, deflater0);
      deflaterSink0.flush();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe((-2130964542));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(3300L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      pipe0.sinkClosed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.close();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(1708L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8CodePoint((-1));
      realBufferedSink0.flush();
      assertFalse(buffer0.exhausted());
      assertEquals(1L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(1204L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.flush();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8CodePoint((-1));
      realBufferedSink0.emit();
      assertFalse(buffer0.exhausted());
      assertEquals(1L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.emit();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.emitCompleteSegments();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeHexadecimalUnsignedLong((-1859L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeHexadecimalUnsignedLong(470L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(3638L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeDecimalLong(183L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLongLe((-1209L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe(1L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLong(15L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeIntLe(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeInt(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt(3335);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(1708L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShortLe(2086126972);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Pipe pipe0 = new Pipe(827L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe((-982));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShort(37);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte(3080);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeByte((-1));
      Buffer buffer1 = realBufferedSink0.buffer();
      assertEquals(1L, buffer1.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      buffer0.writeUtf8CodePoint(65280);
      try { 
        realBufferedSink0.write((Source) buffer0, 2495L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Pipe pipe0 = new Pipe(3300L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSink0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) hashingSource0, (-129L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Pipe pipe0 = new Pipe(206L);
      Sink sink0 = pipe0.sink();
      HashingSink hashingSink0 = HashingSink.sha256(sink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeLong((-1083L));
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      // Undeclared exception!
      realBufferedSink0.writeAll(realBufferedSource0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeAll((Source) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      long long0 = realBufferedSink0.writeAll(buffer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[0];
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, 0, (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Pipe pipe0 = new Pipe(867L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, 17, (-1647));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=5 offset=17 byteCount=-1647
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      byte[] byteArray0 = new byte[4];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("v5$66yYzRnN", (-2144779007), 140, charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Pipe pipe0 = new Pipe(4278190080L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString((String) null, (int) (byte) (-12), 0, (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("okio.SegmentPool", charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Pipe pipe0 = new Pipe(3300L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      Charset charset0 = Charset.defaultCharset();
      BufferedSink bufferedSink0 = realBufferedSink0.writeString(")SUFlge='", charset0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Pipe pipe0 = new Pipe(71776119061217280L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      HashingSink hashingSink0 = HashingSink.sha1(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint(2324);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("AA", 825, 102);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Pipe pipe0 = new Pipe(3300L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8(")SUFlge='", 0, 0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("buffer(okio.Pipe$PipeSink@3)");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("buffer([text=\uFF00])");
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Pipe pipe0 = new Pipe(3300L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      realBufferedSink0.close();
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteString0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write(realBufferedSink0.buffer, (long) 1063);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, 100000000000000000L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=100000000000000000
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RealBufferedSink realBufferedSink0 = null;
      try {
        realBufferedSink0 = new RealBufferedSink((Sink) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sink == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSource0.buffer);
      Deflater deflater0 = gzipSink0.deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink(buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      realBufferedSink0.close();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      String string0 = realBufferedSink0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      assertNotNull(outputStream0);
  }
}
