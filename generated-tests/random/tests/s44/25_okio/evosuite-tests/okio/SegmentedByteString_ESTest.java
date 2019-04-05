/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:51:40 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
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
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-120);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = segmentedByteString0.rangeEquals((int) (byte)2, (ByteString) segmentedByteString0, (int) (byte)16, (int) (byte)16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      int int0 = segmentedByteString0.size();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      assertTrue(buffer0.exhausted());
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(487L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      byte[] byteArray1 = new byte[0];
      int int0 = segmentedByteString0.lastIndexOf(byteArray1, 3);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      byte[] byteArray1 = new byte[0];
      int int0 = segmentedByteString0.indexOf(byteArray1, 3);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pipe pipe0 = new Pipe(2776L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.utf8();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      GzipSource gzipSource0 = new GzipSource(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toAsciiUppercase();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(3532L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.md5();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(2906L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.hex();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.base64Url();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 317);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=317
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = segmentedByteString0.equals(buffer1);
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      Deflater deflater0 = new Deflater((-1), false);
      DeflaterSink deflaterSink0 = new DeflaterSink(hashingSink0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      buffer1.writeLong((-726L));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 3);
      byte[] byteArray0 = new byte[4];
      boolean boolean0 = segmentedByteString0.rangeEquals(3, byteArray0, (-1), (-1878));
      assertEquals(3, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      byte[] byteArray0 = new byte[7];
      segmentedByteString0.rangeEquals((int) (byte)48, byteArray0, (int) (byte) (-89), 1145);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = segmentedByteString0.rangeEquals((-2413), byteArray0, 2052, 48);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = segmentedByteString0.startsWith((ByteString) segmentedByteString0);
      assertEquals(2, segmentedByteString0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(93);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = segmentedByteString0.rangeEquals((int) (byte) (-29), (ByteString) segmentedByteString0, (int) (byte)0, (int) (byte)0);
      assertFalse(boolean0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.write(buffer0);
      assertFalse(buffer0.exhausted());
      assertEquals(6L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(528L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      GzipSource gzipSource0 = new GzipSource(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pipe pipe0 = new Pipe(528L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      GzipSource gzipSource0 = new GzipSource(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      segmentedByteString0.write(byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(93);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      assertEquals(2, segmentedByteString0.size());
      
      long long0 = buffer0.indexOf((ByteString) segmentedByteString0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      assertEquals(2, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      String string0 = segmentedByteString0.toString();
      assertEquals("[hex=000000]", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        segmentedByteString0.string(charset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.hmacSha256(segmentedByteString0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.hmacSha1(segmentedByteString0);
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      Deflater deflater0 = new Deflater((-1), false);
      DeflaterSink deflaterSink0 = new DeflaterSink(hashingSink0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      realBufferedSink0.buffer.writeLong((-726L));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 3);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      assertEquals(3, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      int int0 = segmentedByteString0.indexOf(byteArray0, 3);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      String string0 = segmentedByteString0.hex();
      assertEquals("000000", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.sha1();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(0, true);
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.asByteBuffer();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.base64();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShort(105);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.sha256();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeLong((-726L));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.md5();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.internalArray();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeIntLe(0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, (byte)2);
      segmentedByteString0.utf8();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      Deflater deflater0 = new Deflater((-1), false);
      DeflaterSink deflaterSink0 = new DeflaterSink(hashingSink0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      realBufferedSink0.buffer.writeLong((-726L));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 3);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("____", string0);
      assertEquals(3, segmentedByteString0.size());
  }
}