/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:53:42 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSource_ESTest extends RealBufferedSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)57;
      byteArray0[1] = (byte) (-20);
      byteArray0[2] = (byte) (-29);
      byteArray0[3] = (byte) (-36);
      byteArray0[4] = (byte) (-15);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)69;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Pipe pipe0 = new Pipe(2088L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      Buffer buffer0 = realBufferedSink0.buffer;
      realBufferedSink0.writeUtf8("'r`[2RW?1S");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteArray(2088L);
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
      Pipe pipe0 = new Pipe(9223372036854775807L);
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
  public void test02()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      Pipe pipe0 = new Pipe(32L);
      Buffer buffer0 = pipe0.buffer;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-118);
      byteArray0[1] = (byte)69;
      byteArray0[2] = (byte)1;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      pipe0.sinkClosed = true;
      realBufferedSource0.indexOf((byte) (-17), 8192L);
      Charset charset0 = Charset.defaultCharset();
      try { 
        realBufferedSource0.readString(32L, charset0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
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
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(964L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe_PipeSource0.close();
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte)40, 964L, (-2085L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=964 toIndex=-2085
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "2d");
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      pipe0.sinkClosed = true;
      pipe0.sinkClosed = true;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      realBufferedSource0.indexOf((byte)49);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte) (-6), (-1L), 4L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-1 toIndex=4
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      realBufferedSource0.skip((-5704L));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long long0 = 4278190080L;
      Pipe pipe0 = new Pipe(4278190080L);
      Source source0 = pipe0.source();
      pipe0.sourceClosed = true;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.timeout();
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pipe pipe0 = new Pipe(2147483647L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe0.sinkClosed = true;
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      realBufferedSource0.readByteString();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong(2043L);
      long long0 = realBufferedSource0.readAll(bufferedSink0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)78;
      buffer0.writeInt(0);
      byteArray0[1] = (byte)88;
      byteArray0[2] = (byte)87;
      realBufferedSource0.read(byteArray0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readString((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte) (-114);
      byteArray0[3] = (byte) (-91);
      byteArray0[4] = (byte)24;
      byteArray0[5] = (byte) (-39);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-13);
      int int0 = realBufferedSource0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      try { 
        realBufferedSource0.readUtf8LineStrict(617L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      Source source0 = hashingSource0.delegate();
      HashingSource hashingSource1 = HashingSource.sha1(source0);
      ByteString byteString0 = hashingSource0.hash();
      HashingSource.hmacSha256(hashingSource1, byteString0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource1);
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
  public void test13()  throws Throwable  {
      long long0 = 1L;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      Pipe pipe0 = new Pipe(1L);
      Source source0 = pipe0.source();
      GzipSource gzipSource0 = new GzipSource(source0);
      gzipSource0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readShortLe();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = 720L;
      Pipe pipe0 = new Pipe(720L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      realBufferedSource0.close();
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOfElement(byteString0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
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
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      try { 
        realBufferedSource0.skip(15L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(2290L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = buffer0.sha256();
      realBufferedSource0.read(buffer0, 4278190080L);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf(byteString0, (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex < 0
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer1, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)101;
      byteArray0[1] = (byte)93;
      byteArray0[2] = (byte)55;
      byteArray0[3] = (byte)8;
      byteArray0[4] = (byte)51;
      byteArray0[5] = (byte)73;
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = realBufferedSource0.rangeEquals((-1965L), byteString0, (int) (byte)101, (int) (byte)73);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      pipe0.sinkClosed = true;
      realBufferedSource0.toString();
      boolean boolean0 = true;
      pipe0.sourceClosed = true;
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      hashingSource0.toString();
      GzipSource gzipSource0 = new GzipSource(hashingSource0);
      gzipSource0.close();
      try { 
        buffer0.readUtf8CodePoint();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-67);
      ByteString byteString0 = realBufferedSource0.readByteString();
      byteString0.startsWith(byteArray0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf(byteString0, (long) (byte) (-67));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes is empty
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      HashingSource hashingSource1 = HashingSource.sha256(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource1);
      try { 
        realBufferedSource0.readByte();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(735L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      pipe_PipeSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readShortLe();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(440L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Buffer buffer1 = realBufferedSource0.buffer();
      assertEquals(0L, buffer1.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      HashingSource hashingSource1 = HashingSource.sha256(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource1);
      try { 
        realBufferedSource0.indexOfElement((ByteString) null);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-38);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)51;
      byteArray0[3] = (byte)51;
      byteArray0[4] = (byte)110;
      ByteString byteString0 = ByteString.of(byteArray0);
      buffer0.hmacSha512(byteString0);
      try { 
        realBufferedSource0.readByteArray(846L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(71776119061217280L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.toString();
      // Undeclared exception!
      try { 
        Charset.forName("buffer([size=0])");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // buffer([size=0])
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Pipe pipe0 = new Pipe(2071L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Buffer buffer0 = realBufferedSink0.buffer();
      pipe0.sinkClosed = true;
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      try { 
        realBufferedSource0.indexOf(byteString0);
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
      Pipe pipe0 = new Pipe(9L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer1);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-10);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-8);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-1);
      byteArray0[8] = (byte) (-127);
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
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.segmentSizes();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.md5(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      inflaterSource0.timeout();
      // Undeclared exception!
      try { 
        realBufferedSource0.rangeEquals(1L, (ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer buffer0 = buffer_UnsafeCursor0.buffer;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readUtf8Line();
      long long0 = 32L;
      try { 
        realBufferedSource0.readFully(buffer0, 32L);
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
      Buffer buffer0 = new Buffer();
      GzipSink gzipSink0 = new GzipSink(buffer0);
      HashingSink hashingSink0 = HashingSink.sha1(gzipSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      realBufferedSink0.emitCompleteSegments();
      // Undeclared exception!
      try { 
        Charset.forName("093i");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // 093i
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)26;
      byteArray0[1] = (byte) (-97);
      byteArray0[2] = (byte)57;
      byteArray0[3] = (byte) (-50);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)78;
      inflaterSource0.timeout();
      byteArray0[6] = (byte)5;
      ByteString byteString0 = new ByteString(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha256(inflaterSource0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readFully(buffer0, 10L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }
}
