/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 06:15:45 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.HashingSink;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      String string0 = realBufferedSource0.readUtf8();
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("R+:gjE[9a+M'Ze$\"?Y", "R+:gjE[9a+M'Ze$\"?Y");
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
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
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("v");
      MockPrintStream mockPrintStream0 = new MockPrintStream("v");
      mockPrintStream0.print((int) (byte) (-118));
      Source source0 = Okio.source((File) mockFile0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".outputStream()", ".outputStream()");
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
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("o[t == nulF");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("o[t == nulF");
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
      MockFile mockFile0 = new MockFile("Bc{");
      Okio.appendingSink(mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("okio.Buffer$1", "@Vl0(\u0002B$PXJCz");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("byteString == null", "byteString == null");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[0];
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/home/apaniche/performance/Dataset/gordon_scripts/projects/25_okio/byteString == null/byteString == null\" \"write\")
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
             // sun.reflect.GeneratedMethodAccessor433.invoke(Unknown Source)
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.bind((SocketAddress) null);
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
  public void test12()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("RAM'Rjx-I8!.ozPS )");
      Sink sink0 = Okio.sink((OutputStream) mockPrintStream0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      System.setCurrentTimeMillis((-72057594037927936L));
      MockFile mockFile0 = new MockFile("h8)>$K4P", "socket == null");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".outputStream()", ".outputStream()");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("NZ{?~S");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@FN wMX.1I", "@FN wMX.1I");
      Okio.appendingSink(mockFile0);
      MockFile mockFile1 = new MockFile(mockFile0, "c\"@ ");
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
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SYNC;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      Source source0 = Okio.source(path0, openOptionArray0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      assertNotNull(bufferedSource0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("-9223372036854775808");
      Sink sink0 = Okio.appendingSink(mockFile0);
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("[bmC,A\",", "RAMRRjx-I8!.ozPS )");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.write((-1));
      Okio.appendingSink(mockFile0);
      assertEquals(1L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".outputStream()", ".outputStream()");
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Crc%6_frNw|O<", "not attached to a buffer");
      mockFile0.createNewFile();
      MockFile mockFile1 = new MockFile(mockFile0, "i0n)%91TIYLW");
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
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("[bmC,A\",", "RAMRRjx-I8!.ozPS )");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".outputStream()", ".outputStream()");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[6];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[4] = (OpenOption) standardOpenOption0;
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      AssertionError assertionError1 = new AssertionError((-596L));
      AssertionError assertionError2 = (AssertionError)assertionError0.initCause(assertionError1);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      AssertionError assertionError1 = new AssertionError((-596L));
      assertionError1.initCause(assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(0);
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
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
      MockFile mockFile0 = new MockFile("ZNUdG@8 3d|_0\"|]S5c", "");
      Sink sink0 = Okio.appendingSink(mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      byte[] byteArray0 = new byte[1];
      realBufferedSink0.write(byteArray0);
      realBufferedSink0.emit();
      assertEquals(1L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      MockException mockException0 = new MockException();
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      mockException0.printStackTrace((PrintStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (-9));
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 6, 6);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      Timeout timeout0 = realBufferedSource0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-18), (-18));
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      AssertionError assertionError0 = new AssertionError(source0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockFile mockFile0 = new MockFile("RAMRRjx-I8!.ozPS )");
      Sink sink0 = Okio.appendingSink(mockFile0);
      HashingSink hashingSink0 = HashingSink.sha1(sink0);
      hashingSink0.flush();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockFile mockFile0 = new MockFile("@FN wMX.1I", "@FN wMX.1I");
      Sink sink0 = Okio.appendingSink(mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ZNUdG@8 3d|_0\"|]S5c", "");
      Sink sink0 = Okio.appendingSink(mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ZNUdG@8 3d|_0\"|]S5c", "");
      Sink sink0 = Okio.appendingSink(mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      AssertionError assertionError0 = new AssertionError(realBufferedSink0);
  }
}
