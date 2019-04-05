/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:09:58 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.zip.Inflater;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSink;
import okio.InflaterSource;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0, 55);
      Source source0 = Okio.source((InputStream) bufferedInputStream0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile(".outputStream()", "byteCount < 0: ");
      Sink sink0 = Okio.sink(file0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      MockThrowable mockThrowable0 = new MockThrowable();
      assertionError0.initCause(mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockException mockException0 = new MockException();
      AssertionError assertionError0 = new AssertionError("^L{`5r|*kW|c", mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((Socket) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // socket == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      try { 
        Okio.source((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[8];
      // Undeclared exception!
      try { 
        Okio.sink((Path) null, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        Okio.sink(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.appendingSink((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[0];
      // Undeclared exception!
      try { 
        Okio.source((Path) null, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("source(", "source == null");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      File file0 = MockFile.createTempFile("Y#uU.@", "Y#uU.@");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Object[] objectArray0 = new Object[9];
      mockPrintStream0.format("Y#uU.@", objectArray0);
      short short0 = bufferedSource0.readShort();
      assertEquals((short)22819, short0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("Y#uU.@", "Y#uU.@");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      long long0 = bufferedSource0.indexOf((byte)89);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((Socket) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // socket == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile("Fx*X1~;73T=S3B)%4]", "");
      Sink sink0 = Okio.appendingSink(file0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.writeShortLe((-1910));
      realBufferedSink0.flush();
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.flush();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      HashingSink hashingSink0 = HashingSink.sha256(sink0);
      Timeout timeout0 = hashingSink0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-11));
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(source0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      realBufferedSource0.close();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) (-11));
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(source0, inflater0);
      Timeout timeout0 = inflaterSource0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      File file0 = MockFile.createTempFile("Fx*X1~;73T=S3B)%4]", "");
      Sink sink0 = Okio.appendingSink(file0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      HashingSink hashingSink0 = HashingSink.md5(realBufferedSink0);
      Timeout timeout0 = hashingSink0.timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Failed to close timed out socket ");
      Sink sink0 = Okio.sink((File) mockFile0);
      AssertionError assertionError0 = new AssertionError(sink0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      File file0 = MockFile.createTempFile("Fx*X1~;73T=S3B)%4]", "");
      Sink sink0 = Okio.appendingSink(file0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      HashingSink hashingSink0 = HashingSink.md5(realBufferedSink0);
      BufferedSink bufferedSink0 = Okio.buffer((Sink) hashingSink0);
      assertFalse(bufferedSink0.equals((Object)realBufferedSink0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("sbs", 1188);
      Proxy proxy0 = new Proxy(proxy_Type0, inetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      try { 
        Okio.sink((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = ByteString.of(byteArray0);
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      BufferedSink bufferedSink1 = realBufferedSink0.emit();
      assertSame(bufferedSink1, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      File file0 = MockFile.createTempFile("Y#uU.@", "Y#uU.@");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      AssertionError assertionError0 = new AssertionError(bufferedSource0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }
}