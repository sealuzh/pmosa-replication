/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:42:10 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.DeflaterSink;
import okio.GzipSink;
import okio.GzipSource;
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
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[0] = (OpenOption) linkOption0;
      Source source0 = Okio.source(path0, openOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("file == null", "9Z*U%#rh&]5#%c", (File) null);
      Path path0 = file0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
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
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/sink(0sink(");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = MockFile.createTempFile("sink(", "sink(");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      System.setCurrentTimeMillis((-379L));
      File file0 = MockFile.createTempFile("8@jlFJTDi\"y^", "8@jlFJTDi\"y^");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
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
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("Failed to close timed out socket ");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[0];
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"Failed to close timed out socket \" \"write\")
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
             // sun.reflect.GeneratedMethodAccessor346.invoke(Unknown Source)
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("R+>a6Q54`W>aYy_", 0);
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
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      Sink sink0 = Okio.sink((OutputStream) pipedOutputStream0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis((-18L));
      MockFile mockFile0 = new MockFile("", "Z2WGF1cU{avAn:Dq");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = MockFile.createTempFile("0IH iSd,]vBu+_iJ", "0IH iSd,]vBu+_iJ");
      MockFile mockFile0 = new MockFile(file0, "MR9v");
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
      MockFile mockFile0 = new MockFile("");
      mockFile0.setExecutable(false, true);
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
  public void test14()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      BufferedSource bufferedSource0 = Okio.buffer((Source) gzipSource0);
      assertNotNull(bufferedSource0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("sink(", "sink(");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/sink(0sink(");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "sink(");
      Okio.appendingSink(file0);
      assertEquals(6L, file0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      File file0 = MockFile.createTempFile("source(", "ID1ID2");
      Sink sink0 = Okio.appendingSink(file0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile(".7V|2~lK>`|}s3h", ".7V|2~lK>`|}s3h");
      Sink sink0 = Okio.appendingSink(file0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = MockFile.createTempFile("out == null", "out == null");
      MockFile mockFile0 = new MockFile(file0, "socket == null");
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
      File file0 = MockFile.createTempFile("g$)74$Tn@oq>_1I#7jq", "g$)74$Tn@oq>_1I#7jq");
      Path path0 = file0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("}u\"J4(`Hz#z");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[6];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      openOptionArray0[2] = (OpenOption) linkOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.APPEND;
      openOptionArray0[3] = (OpenOption) standardOpenOption1;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
      openOptionArray0[4] = (OpenOption) standardOpenOption2;
      openOptionArray0[5] = (OpenOption) standardOpenOption2;
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError((Object) null);
      MockException mockException0 = new MockException("rM<& B017uuMm*geV", assertionError0);
      assertionError0.initCause(mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockException mockException0 = new MockException();
      AssertionError assertionError0 = new AssertionError((String) null, mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      LinkOption[] linkOptionArray0 = LinkOption.values();
      // Undeclared exception!
      try { 
        Okio.sink((Path) null, (OpenOption[]) linkOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("qW(HuH X3Z1c2mlh");
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
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
      OpenOption[] openOptionArray0 = new OpenOption[3];
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
      MockFile mockFile0 = new MockFile("\"a|y[[^V\"K\"'4J&U5", "WMvUPpqehf_! s");
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
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      long long0 = realBufferedSource0.buffer.writeAll(source0);
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSink0);
      gzipSink0.flush();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSink0);
      Timeout timeout0 = gzipSink0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      File file0 = MockFile.createTempFile("g$)74$Tn@oq>_1I#7jq", "g$)74$Tn@oq>_1I#7jq");
      Source source0 = Okio.source(file0);
      AssertionError assertionError0 = new AssertionError(source0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockFile mockFile0 = new MockFile("wH6q!(%ZVEp*QC2u", "wH6q!(%ZVEp*QC2u");
      Sink sink0 = Okio.sink((File) mockFile0);
      AssertionError assertionError0 = new AssertionError(sink0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".outputStream()", ".outputStream()");
      Sink sink0 = Okio.sink((File) mockFile0);
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSink0);
      Deflater deflater0 = gzipSink0.deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) realBufferedSink0, deflater0);
      deflaterSink0.close();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      Timeout timeout0 = gzipSource0.timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      File file0 = MockFile.createTempFile("cgjK/w}L=WM?B", "^PD9fym/XA/.G_iX");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }
}