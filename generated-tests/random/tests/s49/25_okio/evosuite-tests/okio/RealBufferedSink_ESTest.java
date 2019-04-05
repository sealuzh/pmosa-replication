/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:33:50 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSink;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
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
      Pipe pipe0 = new Pipe(718L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("", (-692), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -692
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(1664L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeHexadecimalUnsignedLong(1421L);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertEquals(3L, buffer1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8CodePoint(2570);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("");
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pipe pipe0 = new Pipe(1761L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort((-2644));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe((-1562));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pipe pipe0 = new Pipe(3741L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt(0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeHexadecimalUnsignedLong((-1L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink(buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(1652L);
      Buffer buffer0 = pipe0.buffer;
      ByteString byteString0 = ByteString.encodeUtf8(";Xuz([WK9*");
      HashingSink hashingSink0 = HashingSink.hmacSha1(buffer0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString(";Xuz([WK9*", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(1664L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write((byte[]) null, 765, (-1129));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      ByteString byteString0 = new ByteString((byte[]) null);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.emitCompleteSegments();
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(424);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(1761L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      pipe_PipeSink0.close();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.writeShort(0);
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
      Buffer buffer0 = new Buffer();
      GzipSink gzipSink0 = new GzipSink(buffer0);
      ByteString byteString0 = ByteString.encodeUtf8("p");
      HashingSink hashingSink0 = HashingSink.hmacSha256(gzipSink0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      realBufferedSink0.close();
      assertEquals(20L, buffer0.size());
      assertFalse(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pipe pipe0 = new Pipe(4501L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeHexadecimalUnsignedLong(1843L);
      realBufferedSink0.flush();
      assertFalse(buffer0.exhausted());
      assertEquals(3L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
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
      Pipe pipe0 = new Pipe(4501L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.flush();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
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
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(2239L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeHexadecimalUnsignedLong(2239L);
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
      Pipe pipe0 = new Pipe(492L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeHexadecimalUnsignedLong(0L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(2703L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeDecimalLong((-1198L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(3741L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(1L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLongLe(3L);
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
      Pipe pipe0 = new Pipe(3L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLong(3L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong((-1L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeInt(158);
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
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt((-703));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShortLe((-2144));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(3972L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe((-1118));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShort(54);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.sha1(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte(2103657451);
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
      BufferedSink bufferedSink0 = realBufferedSink0.writeByte(2570);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Pipe pipe0 = new Pipe(3741L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.writeShort(2145338309);
      realBufferedSink0.emit();
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) realBufferedSource0.buffer, 1L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Pipe pipe0 = new Pipe(3741L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      try { 
        realBufferedSink0.write((Source) realBufferedSource0.buffer, 1L);
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
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) null, (-511L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeLongLe((-1L));
      realBufferedSink0.emit();
      assertFalse(buffer0.exhausted());
      
      long long0 = realBufferedSink0.writeAll(buffer0);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Pipe pipe0 = new Pipe(492L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
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
      Pipe pipe0 = new Pipe(8L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      long long0 = realBufferedSink0.writeAll(buffer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = buffer0.readByteArray();
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, (-1492), 1717986918);
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, (int) (byte) (-8), (-2186));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=4 offset=-8 byteCount=-2186
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      byte[] byteArray0 = new byte[0];
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
  public void test47()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[4];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("N6$Ik'`FAQr", 1201, 1201, (Charset) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("eD?#aY8/ckzU'yST#", 282, 0, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: 0 < 282
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.sha1(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("?", charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      BufferedSink bufferedSink0 = realBufferedSink0.writeString("", charset0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSink gzipSink0 = new GzipSink(buffer0);
      ByteString byteString0 = ByteString.encodeUtf8("p");
      HashingSink hashingSink0 = HashingSink.hmacSha256(gzipSink0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint((-2815));
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
      Pipe pipe0 = new Pipe(718L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("", (-692), 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Pipe pipe0 = new Pipe(3972L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("[-/O{H'DH2", 82, 82);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 82 > 11
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("$u8");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, 65536L);
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
      Pipe pipe0 = new Pipe(1905L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write((Buffer) null, (long) (byte)93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("okio.Buffer", e);
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
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertNotSame(buffer0, buffer1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      String string0 = realBufferedSink0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      assertNotNull(outputStream0);
  }
}