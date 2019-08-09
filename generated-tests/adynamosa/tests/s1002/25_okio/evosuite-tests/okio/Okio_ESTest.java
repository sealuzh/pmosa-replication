/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 23:19:31 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSink;
import okio.HashingSink;
import okio.HashingSource;
import okio.Okio;
import okio.RealBufferedSink;
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
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
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
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/byteString == null0byteString == null");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = MockFile.createTempFile("byteString == null", "byteString == null");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      System.setCurrentTimeMillis((-649L));
      MockFile mockFile0 = new MockFile("T-w", "*-ZqJr@u");
      File file0 = MockFile.createTempFile("T-w", "*-ZqJr@u", (File) mockFile0);
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/getsockname failed0");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = MockFile.createTempFile("getsockname failed", "");
      try { 
        Okio.source(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile((File) null, "");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[0];
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.spi.FileSystemProvider.newOutputStream(FileSystemProvider.java:434)
             // java.nio.file.Files.newOutputStream(Files.java:216)
             // okio.Okio.sink(Okio.java:193)
             // sun.reflect.GeneratedMethodAccessor488.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("127.0.0.1", 192);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      MockSocket mockSocket0 = new MockSocket("", 192);
      Sink sink0 = Okio.sink((Socket) mockSocket0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      File file0 = MockFile.createTempFile("q!^n(h`3-?@dO6qW%s", "q!^n(h`3-?@dO6qW%s");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Sink sink0 = Okio.sink((OutputStream) mockPrintStream0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis((-2001L));
      MockFile mockFile0 = new MockFile("B$BR92", "B$BR92");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".[i~YV2");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("%?-u)- s+Oi'", "file == null", (File) mockFile0);
      MockFile mockFile1 = new MockFile(file0, "jeX6waC^R%w(c8T");
      try { 
        Okio.sink((File) mockFile1);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("path == null", "okio.SegmentedByteString");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.writeByte(0);
      HashingSource hashingSource0 = HashingSource.sha256(realBufferedSink0.buffer);
      ByteString byteString0 = hashingSource0.hash();
      HashingSink hashingSink0 = HashingSink.hmacSha512(realBufferedSink0, byteString0);
      hashingSink0.close();
      Okio.appendingSink(mockFile0);
      assertEquals(1L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("a4y", "a4y");
      System.setCurrentTimeMillis((-1L));
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".[i~YV2");
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("1a-Zb([9)+HXn");
      MockFile mockFile0 = new MockFile("1a-Zb([9)+HXn", "iE6k7`b^AFM");
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
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".[i~YV2");
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
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zO)l8msM/]:Tb");
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
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[5];
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
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
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
  public void test24()  throws Throwable  {
      MockException mockException0 = new MockException("okio.Okio$1", (Throwable) null);
      AssertionError assertionError0 = new AssertionError("getsockname failed", mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(60L);
      AssertionError assertionError1 = new AssertionError(0.0F);
      assertionError1.initCause(assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(2943L);
      AssertionError assertionError1 = new AssertionError((String) null, assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(0.0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((Path) null, (OpenOption[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[5];
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[7];
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
  public void test34()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      Source source0 = Okio.source(path0, openOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Buffer buffer0 = new Buffer();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      try { 
        buffer0.write(source0, 189L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      File file0 = MockFile.createTempFile(".(~@r", "\u2026]");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      try { 
        bufferedSource0.readShortLe();
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSink0);
      Deflater deflater0 = gzipSink0.deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink(sink0, deflater0);
      Timeout timeout0 = deflaterSink0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      HashingSource hashingSource0 = HashingSource.sha256(realBufferedSink0.buffer);
      ByteString byteString0 = hashingSource0.hash();
      HashingSink hashingSink0 = HashingSink.hmacSha512(realBufferedSink0, byteString0);
      hashingSink0.close();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      File file0 = MockFile.createTempFile("getsockname failed", "O");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      ((RealBufferedSource) bufferedSource0).close();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      File file0 = MockFile.createTempFile("size < 2: ", "b?vR!i");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      Timeout timeout0 = ((RealBufferedSource) bufferedSource0).timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      AssertionError assertionError0 = new AssertionError(source0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockFile mockFile0 = new MockFile("path == null", "okio.SegmentedByteString");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      HashingSource hashingSource0 = HashingSource.sha256(realBufferedSink0.buffer);
      ByteString byteString0 = hashingSource0.hash();
      HashingSink hashingSink0 = HashingSink.hmacSha512(realBufferedSink0, byteString0);
      hashingSink0.flush();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockFile mockFile0 = new MockFile("path == null", "okio.SegmentedByteString");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Sink sink0 = Okio.sink((OutputStream) byteArrayOutputStream0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      AssertionError assertionError0 = new AssertionError(realBufferedSink0);
      assertEquals("buffer(sink())", assertionError0.getMessage());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      File file0 = MockFile.createTempFile("q!^n(h`3-?@dO6qW%s", "q!^n(h`3-?@dO6qW%s");
      Sink sink0 = Okio.appendingSink(file0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      HashingSource hashingSource0 = HashingSource.sha256(realBufferedSink0.buffer);
      ByteString byteString0 = hashingSource0.hash();
      HashingSink hashingSink0 = HashingSink.hmacSha512(realBufferedSink0, byteString0);
      BufferedSink bufferedSink0 = Okio.buffer((Sink) hashingSink0);
      assertNotSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      HashingSink hashingSink0 = HashingSink.sha256(sink0);
      Buffer buffer0 = new Buffer();
      hashingSink0.write(buffer0, 0L);
      assertEquals(0L, buffer0.size());
  }
}
