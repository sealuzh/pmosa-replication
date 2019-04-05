/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:43:04 GMT 2019
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
      Pipe pipe0 = new Pipe(11L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emitCompleteSegments();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeLong(543L);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertEquals(8L, buffer1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8CodePoint(24);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe((-1302));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      HashingSink hashingSink0 = HashingSink.hmacSha1(realBufferedSource0.buffer, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(238);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe(0L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong(0L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong((-665L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) buffer0, 0L);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) inflaterSource0, (-2095L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(1056L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
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
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      pipe_PipeSink0.close();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
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
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      DeflaterSink deflaterSink1 = new DeflaterSink(deflaterSink0, deflater0);
      // Undeclared exception!
      try { 
        deflaterSink1.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(14L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.flush();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(11L);
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
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      realBufferedSink0.writeByte((-1073741823));
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(1700L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
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
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeHexadecimalUnsignedLong(0L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(11L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeHexadecimalUnsignedLong(11L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeDecimalLong((-6077L));
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
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(892L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLongLe(60L);
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
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe((-352L));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeIntLe(1431655765);
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(3642);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(2L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeInt((-926));
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShortLe(56319);
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
      Pipe pipe0 = new Pipe(14L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShort(0);
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
      Pipe pipe0 = new Pipe(1157L);
      Buffer buffer0 = pipe0.buffer;
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort((-844));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte((-497));
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
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeInt(24);
      realBufferedSink0.flush();
      try { 
        realBufferedSink0.write((Source) buffer0, (long) 24);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(11L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      buffer0.writeLongLe(11L);
      long long0 = realBufferedSink0.writeAll(buffer0);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Pipe pipe0 = new Pipe(13L);
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
  public void test36()  throws Throwable  {
      Pipe pipe0 = new Pipe(11L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      long long0 = realBufferedSink0.writeAll(buffer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, (int) (byte) (-126), (int) (byte) (-126));
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, (int) (byte)44, (-363));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=7 offset=44 byteCount=-363
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Pipe pipe0 = new Pipe(514L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      byte[] byteArray0 = new byte[8];
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
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[7];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
        realBufferedSink0.writeString("okio.RealBufferedSink$1", 1867, 0, charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha256(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString(")", (-1520), 1908874353, charset0);
        fail("Expecting exception: IllegalAccessError");
      
      } catch(IllegalAccessError e) {
         //
         // beginIndex < 0: -1520
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("i}#Fv3P#;E+M%", charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      BufferedSink bufferedSink0 = realBufferedSink0.writeString("beginIndex < 0", charset0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint((-380));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("<EfER 9Ro&}_NOt5;", (-1889), (-1889));
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
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("already attached to a buffe", 2, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: 0 < 2
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Pipe pipe0 = new Pipe(1772L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      HashingSink hashingSink0 = HashingSink.sha256(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("!F!d,%m|/IMIh8");
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("");
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      HashingSink hashingSink0 = HashingSink.md5(realBufferedSink0);
      ByteString byteString0 = hashingSink0.hash();
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
  public void test51()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write((Buffer) null, (-971L));
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      buffer0.writeShort(3423);
      long long0 = buffer0.readAll(realBufferedSink0);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertTrue(buffer1.equals((Object)buffer0));
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      String string0 = realBufferedSink0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Pipe pipe0 = new Pipe(14L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      assertNotNull(outputStream0);
  }
}