/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 20:23:56 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.Locale;
import java.util.zip.Inflater;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Okio;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      Source source0 = Okio.source(path0, openOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      try { 
        Okio.source((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is closed
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.bind((SocketAddress) null);
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
  public void test03()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Ie,mbRrs]tX{b", "Ie,mbRrs]tX{b");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      mockPrintStream0.append('n');
      Source source0 = Okio.source((File) mockFile0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      System.setCurrentTimeMillis((-142L));
      File file0 = MockFile.createTempFile("7eCz$`", (String) null, (File) null);
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".outputStream()");
      try { 
        Okio.source((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      try { 
        Okio.sink((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is closed
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(1299);
      mockSocket0.bind(mockInetSocketAddress0);
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
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Ie,mbRr]tX{", "Ie,mbRr]tX{");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Sink sink0 = Okio.sink((OutputStream) mockPrintStream0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      System.setCurrentTimeMillis((-1947L));
      File file0 = MockFile.createTempFile("}%LS6+D,0U_k-+", "}%LS6+D,0U_k-+");
      Sink sink0 = Okio.sink(file0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("bi", "..h'5-fx");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("Ie,mbRrs]tXh{b", "Ie,mbRrs]tXh{b");
      MockFile mockFile0 = new MockFile(file0, "Ie,mbRrs]tXh{b");
      try { 
        Okio.sink((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      assertNotNull(bufferedSource0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      File file0 = MockFile.createTempFile("Ie,mbRrs]tX{b", "Ie,mbRrs]tX{b");
      Sink sink0 = Okio.sink(file0);
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Ie,mbRr]tX{", "Ie,mbRr]tX{");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Locale locale0 = Locale.UK;
      Object[] objectArray0 = new Object[5];
      mockPrintStream0.format(locale0, "okio.Okio$3", objectArray0);
      Okio.appendingSink(mockFile0);
      assertEquals(11L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis((-1801L));
      String string0 = "+053gB;&aa{-c\\us?";
      MockFile mockFile0 = new MockFile(string0, "");
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("*o}`@~S{5!]", "[X7X{&sJ4{].M(p6");
      MockFile mockFile1 = new MockFile(mockFile0, ".eLP~a|ud[u");
      Sink sink0 = Okio.appendingSink(mockFile1);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "");
      try { 
        Okio.appendingSink(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("#*S m?%=?#;T/PXn");
      Okio.sink((File) mockFile0);
      MockFile mockFile1 = new MockFile(mockFile0, "#*S m?%=?#;T/PXn");
      try { 
        Okio.appendingSink(mockFile1);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "timeout == null");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@f", "@f");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        Okio.source((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.READ;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // READ not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[6];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[0] = (OpenOption) linkOption0;
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DELETE_ON_CLOSE;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      openOptionArray0[3] = (OpenOption) standardOpenOption0;
      openOptionArray0[4] = (OpenOption) standardOpenOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[5] = (OpenOption) standardOpenOption1;
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      try { 
        Okio.sink((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.isAndroidGetsocknameError((AssertionError) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      AssertionError assertionError1 = new AssertionError("getsockname failed", assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      AssertionError assertionError0 = new AssertionError((String) null, mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      AssertionError assertionError0 = new AssertionError("[", mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[0];
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
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((Path) null, (OpenOption[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        Okio.source(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      try { 
        realBufferedSource0.buffer.write(source0, 1656L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      HashingSource hashingSource0 = HashingSource.sha256(source0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      inflaterSource0.close();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      File file0 = MockFile.createTempFile("xJ6G=#'KYNtPKYfTB", "");
      Source source0 = Okio.source(file0);
      GzipSource gzipSource0 = new GzipSource(source0);
      Timeout timeout0 = gzipSource0.timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      InputStream inputStream0 = realBufferedSource0.inputStream();
      AssertionError assertionError0 = new AssertionError(inputStream0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      File file0 = MockFile.createTempFile("Ie,mbRrs]tX{b", "Ie,mbRrs]tX{b");
      Sink sink0 = Okio.sink(file0);
      AssertionError assertionError0 = new AssertionError(sink0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.buffer((Sink) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sink == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      HashingSink hashingSink0 = HashingSink.md5(sink0);
      hashingSink0.close();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.buffer((Source) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
}
