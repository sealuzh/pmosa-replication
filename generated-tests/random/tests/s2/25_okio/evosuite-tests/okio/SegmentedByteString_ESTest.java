/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 10:45:47 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf((byte[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      int int0 = segmentedByteString0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte byte0 = segmentedByteString0.getByte(0);
      assertEquals((byte)1, byte0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt((-3982));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("_w==", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      assertTrue(buffer0.exhausted());
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      byte[] byteArray0 = new byte[8];
      segmentedByteString0.rangeEquals(42, byteArray0, 872, 5);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      byte[] byteArray0 = new byte[8];
      segmentedByteString0.lastIndexOf(byteArray0, 55);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha1(byteString0);
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
      byte[] byteArray0 = new byte[7];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hmacSha1(segmentedByteString0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toByteArray();
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
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf(byteArray0, 0);
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
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString((Buffer) null, (-2668));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, (-2722));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=-2722
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      ByteString byteString0 = segmentedByteString0.sha256();
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      boolean boolean0 = segmentedByteString0.equals(segmentedByteString0);
      assertTrue(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(2078L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.equals("Lz<(lq?{y`=E[ym7J2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt((-3982));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[7];
      segmentedByteString0.rangeEquals(362, byteArray0, (int) (byte) (-13), (-316));
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = segmentedByteString0.rangeEquals((-4), byteArray0, 2, (int) (byte) (-98));
      assertEquals(1, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      boolean boolean0 = segmentedByteString0.endsWith((ByteString) segmentedByteString0);
      assertEquals(1, segmentedByteString0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals((int) (byte)65, (ByteString) segmentedByteString0, 5, (int) (byte) (-62));
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt((-3982));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.sha256();
      boolean boolean0 = segmentedByteString0.endsWith(byteString0);
      assertEquals(1, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      segmentedByteString0.write(buffer0);
      assertEquals(1L, buffer0.size());
      assertEquals(1L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.write(realBufferedSink0.buffer);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.md5(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
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
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      MockFile mockFile0 = new MockFile("yiz@dRA3_");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0, false);
      segmentedByteString0.write(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals((int) (byte)65, (ByteString) segmentedByteString0, 5, (int) (byte) (-98));
      assertEquals(1, segmentedByteString0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.getByte(0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeByte(0);
      String string0 = buffer1.toString();
      assertEquals("[hex=00]", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.string((Charset) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.hmacSha256(segmentedByteString0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt((-3982));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      int int0 = segmentedByteString0.indexOf((ByteString) segmentedByteString0);
      assertEquals(0, int0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
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
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.sha1();
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
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test37()  throws Throwable  {
      Pipe pipe0 = new Pipe(16711680L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.asByteBuffer();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      String string0 = segmentedByteString0.base64();
      assertEquals("CQ==", string0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort(2467);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.md5();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Pipe pipe0 = new Pipe(193L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.internalArray();
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
      GzipSink gzipSink0 = new GzipSink(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring((-3366), (-706));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.md5(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
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
  public void test43()  throws Throwable  {
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
}
