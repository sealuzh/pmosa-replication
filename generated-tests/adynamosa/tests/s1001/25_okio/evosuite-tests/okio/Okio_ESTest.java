/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 21:37:38 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.Okio;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.lang.MockException;
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
      LinkOption[] linkOptionArray0 = LinkOption.values();
      Source source0 = Okio.source(path0, (OpenOption[]) linkOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("a`$}r<,6W_YA_fL#f/a`$}r<,6W_YA_fL#f");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "+VQ");
      MockFile mockFile0 = new MockFile("a`$}r<,6W_YA_fL#f", "a`$}r<,6W_YA_fL#f");
      Source source0 = Okio.source((File) mockFile0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".inputStream()", ".inputStream()");
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
      MockFile mockFile0 = new MockFile(">*@`iBrF");
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
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
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("okio.RealBufferedSource$1", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      Sink sink0 = Okio.sink((OutputStream) dataOutputStream0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("bytes is empty");
      MockFile.createTempFile("bytes is empty", "", (File) mockFile0);
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
      MockFile mockFile0 = new MockFile(">*@`iBrF", ">*@`iBrF");
      Sink sink0 = Okio.sink((File) mockFile0);
      HashingSink hashingSink0 = HashingSink.md5(sink0);
      BufferedSink bufferedSink0 = Okio.buffer((Sink) hashingSink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">*@`iBrF", ">*@`iBrF");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      byte[] byteArray0 = new byte[8];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      HashingSink hashingSink0 = HashingSink.sha1(bufferedSink0);
      hashingSink0.flush();
      Okio.appendingSink(mockFile0);
      assertEquals(8L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      MockFile mockFile0 = new MockFile("o:+7", "o:+7");
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".inputStream()", ".inputStream()");
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">*@`iBrF");
      Okio.sink((File) mockFile0);
      MockFile mockFile1 = new MockFile(mockFile0, ">*@`iBrF");
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
  public void test19()  throws Throwable  {
      File file0 = MockFile.createTempFile("Z(8t$9XD@v Mg", "Z(8t$9XD@v Mg");
      Path path0 = file0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.READ;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
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
      File file0 = MockFile.createTempFile("s7qH-qjB<tP]nv", "s7qH-qjB<tP]nv");
      MockFile mockFile0 = new MockFile(file0, "s7qH-qjB<tP]nv");
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
  public void test26()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      MockException mockException0 = new MockException(assertionError0);
      AssertionError assertionError1 = new AssertionError("getsockname failed", mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockException mockException0 = new MockException((String) null);
      AssertionError assertionError0 = new AssertionError((String) null, mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockException mockException0 = new MockException((String) null);
      AssertionError assertionError0 = new AssertionError("Le)v~j:an%fqIm1e7W{", mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(9);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[3];
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
  public void test32()  throws Throwable  {
      File file0 = MockFile.createTempFile("z/&*xPP", "z/&*xPP");
      Path path0 = file0.toPath();
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
      File file0 = MockFile.createTempFile("s%1)eHmg~3+T\"", "s%1)eHmg~3+T\"");
      Path path0 = file0.toPath();
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("okio.Okio$4");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Source source0 = Okio.source((File) mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("okio.Okio$4");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      long long0 = realBufferedSink0.writeAll(source0);
      assertEquals(9L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=x>5Z!", "=x>5Z!");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Source source0 = Okio.source((File) mockFile0);
      HashingSource hashingSource0 = HashingSource.sha256(source0);
      // Undeclared exception!
      try { 
        hashingSource0.read(realBufferedSink0.buffer, (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1
         //
         verifyException("okio.Okio$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
      MockFile mockFile0 = new MockFile(">*@`iBrF", ">*@`iBrF");
      Sink sink0 = Okio.sink((File) mockFile0);
      HashingSink hashingSink0 = HashingSink.sha512(sink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      byte[] byteArray0 = new byte[8];
      realBufferedSink0.write(byteArray0);
      hashingSink0.write(realBufferedSink0.buffer, 4L);
      assertEquals(4L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      HashingSink hashingSink0 = HashingSink.md5(sink0);
      hashingSink0.close();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">*@`iBrF", ">*@`iBrF");
      Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      HashingSource hashingSource0 = HashingSource.sha256(source0);
      hashingSource0.close();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">*@`iBrF", ">*@`iBrF");
      Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      HashingSource hashingSource0 = HashingSource.sha256(source0);
      Timeout timeout0 = hashingSource0.timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">*@`iBrF", ">*@`iBrF");
      Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      AssertionError assertionError0 = new AssertionError(source0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".inputStream()", ".inputStream()");
      Sink sink0 = Okio.sink((File) mockFile0);
      HashingSink hashingSink0 = HashingSink.sha512(sink0);
      Timeout timeout0 = hashingSink0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockFile mockFile0 = new MockFile("okio.Okio$4");
      Sink sink0 = Okio.sink((File) mockFile0);
      HashingSink hashingSink0 = HashingSink.md5(sink0);
      hashingSink0.close();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\n", "8m6XlE");
      Sink sink0 = Okio.sink((File) mockFile0);
      AssertionError assertionError0 = new AssertionError(sink0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      Charset charset0 = Charset.defaultCharset();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeString("'r/", charset0);
      HashingSink hashingSink0 = HashingSink.sha1(bufferedSink0);
      hashingSink0.flush();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      File file0 = MockFile.createTempFile("z/&*xPP", "z/&*xPP");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      assertNotNull(bufferedSource0);
  }
}
