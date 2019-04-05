/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:12:11 GMT 2019
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ShortLookupTable;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.URI;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiFunction;
import javax.swing.JWindow;
import javax.swing.plaf.synth.SynthPanelUI;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("BUFFERED_IMAGE_FACTORY");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      Locale locale0 = Locale.CANADA;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) mockPrintStream0;
      objectArray0[1] = (Object) mockPrintStream0;
      objectArray0[2] = (Object) mockPrintStream0;
      objectArray0[3] = (Object) mockPrintStream1;
      objectArray0[4] = (Object) mockPrintStream1;
      objectArray0[5] = (Object) mockFile0;
      Object object0 = new Object();
      objectArray0[6] = object0;
      objectArray0[7] = (Object) "BUFFERED_IMAGE_FACTORY";
      objectArray0[8] = (Object) "BUFFERED_IMAGE_FACTORY";
      PrintStream printStream0 = mockPrintStream1.format(locale0, "BUFFERED_IMAGE_FACTORY", objectArray0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, false);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "BUFFERED_IMAGE_FACTORY");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      InputStream inputStream0 = byteSourceFile0.getInputStream();
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(inputStream0, "BUFFERED_IMAGE_FACTORY");
      try { 
        bmpImageParser0.dumpImageFile(printWriter0, (ByteSource) byteSourceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getDefaultExtension();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BiFunction<Object, Object, JWindow> biFunction0 = (BiFunction<Object, Object, JWindow>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("BUFFERED_IMAGE_FACTORY", ".bmp", biFunction0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) pipedInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("VERBOSE", "VERBOSE");
      bmpImageParser0.getAllBufferedImages(file0);
      ByteSource byteSource0 = null;
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      hashtable0.put("VERBOSE", sequenceInputStream0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageSize((ByteSource) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.getMetadata((ByteSource) null, (Map<String, Object>) hashtable0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      hashtable0.putIfAbsent("VERBOSE", bmpImageParser0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) mockFileInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)97;
      byteArray0[1] = (byte)113;
      byteArray0[2] = (byte) (-10);
      byte byte0 = (byte) (-70);
      byteArray0[3] = (byte) (-70);
      byteArray0[4] = (byte)61;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, (byte)61);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_INTERPOLATION;
      hashtable0.put("Q", sunHints_Key0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) bufferedInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: Q
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ";)'rq{B[13C.agve");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile((File) null, "VERBOSE");
      File file0 = MockFile.createTempFile("Compression Algorithm: ", (String) null, (File) mockFile0);
      bmpImageParser0.getICCProfileBytes(file0, (Map<String, Object>) null);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      MockFile mockFile1 = new MockFile("greenMask", "greenMask");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.putIfAbsent(";)'rq{B[13C.agve", object0);
      Object object1 = new Object();
      mockFile1.setReadOnly();
      hashMap0.put("greenMask", object1);
      bmpImageParser0.getICCProfileBytes((File) mockFile1, (Map<String, Object>) hashMap0);
      bmpImageParser0.getDefaultExtension();
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile1);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: ;)'rq{B[13C.agve
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = "1^t^dkQE/&\"y)<$84";
      MockFile mockFile0 = new MockFile("1^t^dkQE/&\"y)<$84");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      Map<String, Object> map0 = null;
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceFile0, (Map<String, Object>) null);
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
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      URI uRI0 = MockURI.aHttpURI;
      MockURI.normalize(uRI0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte)87;
      byteArray0[2] = (byte) (-18);
      byteArray0[3] = (byte)21;
      byteArray0[4] = (byte)32;
      byteArray0[5] = (byte)73;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getAllBufferedImages((ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("u]<", "u]<");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(file0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "n7/(e{D");
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      bmpImageParser0.getICCProfileBytes(byteArray0, (Map<String, Object>) hashMap0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("PAM", "XKYC`y/3*w)e%oGa*");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(file0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("2GmJP$}", "2GmJP$}");
      hashMap0.put("XkdIZ&|$9", file0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: XkdIZ&|$9
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)127;
      byte byte0 = (byte)12;
      byteArray0[1] = (byte)12;
      byteArray0[2] = (byte)127;
      byteArray0[3] = (byte)70;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)54;
      byteArray0[6] = (byte)41;
      byte byte1 = (byte) (-30);
      byteArray0[7] = (byte) (-30);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.getMetadata(byteArray0, (Map<String, Object>) hashtable0);
      bmpImageParser0.getICCProfileBytes(byteArray0, (Map<String, Object>) hashtable0);
      bmpImageParser0.getName();
      File file0 = null;
      MockFile mockFile0 = new MockFile((File) null, "Bmp-Custom");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      bmpImageParser0.getMetadata((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
      bmpImageParser0.getAcceptedTypes();
      int int0 = 1784;
      int[] intArray0 = null;
      int int1 = 5899;
      BigInteger bigInteger0 = null;
      try {
        bigInteger0 = new BigInteger((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getAcceptedTypes();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-3268));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.getXmpXml((ByteSource) null, hashtable0);
      ImageParser.getAllImageParsers();
      BufferedImage bufferedImage0 = new BufferedImage(77, 65, 1);
      MockFile mockFile0 = new MockFile((String) null, "Wireless Application Protocol Bitmap");
      mockFile0.setWritable(false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) null);
      bmpImageParser0.writeImage(bufferedImage0, printStream0, hashtable0);
      assertEquals(842L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getDefaultExtension();
      StringWriter stringWriter0 = new StringWriter(608);
      StringWriter stringWriter1 = stringWriter0.append('!');
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter1, true);
      PrintWriter printWriter0 = mockPrintWriter0.append('!');
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-121);
      byteArray0[1] = (byte) (-3);
      byteArray0[2] = (byte)78;
      byteArray0[3] = (byte) (-2);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.dumpImageFile(printWriter0, (ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = "iNk-CA7;Xt9WwaROt";
      MockFile mockFile0 = new MockFile(":5}p");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      Hashtable<String, SynthPanelUI> hashtable0 = new Hashtable<String, SynthPanelUI>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(hashtable0);
      hashMap0.put("", bmpImageParser0);
      bmpImageParser0.getImageSize((File) mockFile1, (Map<String, Object>) hashMap0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-3);
      SynthPanelUI synthPanelUI0 = new SynthPanelUI();
      hashtable0.put(":5}p", synthPanelUI0);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("iNk-CA7;Xt9WwaROt", byteArray0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = "";
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-128);
      byteArray0[1] = (byte)58;
      byteArray0[2] = (byte) (-82);
      byteArray0[3] = (byte)22;
      byteArray0[4] = (byte)101;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-49);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)2;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byteSourceArray0.getDescription();
      Object object0 = new Object();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerCentimetre((byte)1, (byte) (-49));
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      PixelDensity.createUnitless(1.164, 0.0);
      hashtable0.put("VERBOSE", pixelDensity0);
      File file0 = MockFile.createTempFile("VERBOSE", "x?~d|");
      bmpImageParser0.getImageSize(file0, (Map<String, Object>) hashtable0);
      bmpImageParser0.getXmpXml(byteSourceArray0, hashtable0);
      bmpImageParser0.getXmpXml(byteSourceArray0, hashtable0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("j F8h");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintStream mockPrintStream0 = new MockPrintStream("The wildcard array must not be null");
      Locale locale0 = Locale.TAIWAN;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) locale0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) bmpImageParser0;
      objectArray0[3] = (Object) locale0;
      PrintStream printStream0 = mockPrintStream0.format(locale0, "]&S~{^gC;", objectArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_STROKE_CONTROL;
      hashMap0.put("]&S~{^gC;", sunHints_Key0);
      HashMap<String, JWindow> hashMap1 = new HashMap<String, JWindow>();
      hashMap0.putAll(hashMap1);
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, printStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: ]&S~{^gC;
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)58;
      byteArray0[1] = (byte)26;
      byteArray0[2] = (byte)65;
      byteArray0[3] = (byte)49;
      byteArray0[4] = (byte) (-118);
      byteArray0[5] = (byte)2;
      byteArray0[6] = (byte)1;
      byteArray0[7] = (byte)56;
      byteArray0[8] = (byte) (-78);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("ColorTable", byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "Couldn't read BMP Data";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Couldn't read BMP Data");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      int int0 = (-235);
      short[][] shortArray0 = new short[8][4];
      short[] shortArray1 = new short[3];
      shortArray1[0] = (short) (-4639);
      shortArray1[1] = (short)17;
      shortArray1[2] = (short)2244;
      shortArray0[0] = shortArray1;
      short[] shortArray2 = new short[6];
      shortArray2[0] = (short)2244;
      shortArray2[1] = (short) (-4639);
      shortArray2[2] = (short)2244;
      shortArray2[3] = (short) (-4639);
      shortArray2[4] = (short)2244;
      shortArray2[5] = (short)2244;
      shortArray0[1] = shortArray2;
      short[] shortArray3 = new short[7];
      shortArray3[0] = (short) (-4639);
      shortArray3[1] = (short) (-4639);
      short short0 = (short)101;
      shortArray3[2] = (short)101;
      shortArray3[3] = (short)17;
      shortArray3[4] = (short)2244;
      shortArray3[5] = (short)17;
      shortArray3[6] = (short)2244;
      shortArray0[2] = shortArray3;
      short[] shortArray4 = new short[9];
      shortArray4[0] = (short)17;
      shortArray4[1] = (short)101;
      shortArray4[2] = (short)101;
      shortArray4[3] = (short)17;
      shortArray4[4] = (short)101;
      shortArray4[5] = (short)101;
      shortArray4[6] = (short)101;
      shortArray4[7] = (short)101;
      shortArray4[8] = (short)17;
      shortArray0[3] = shortArray4;
      short[] shortArray5 = new short[6];
      shortArray5[0] = (short)101;
      shortArray5[1] = (short) (-1983);
      shortArray5[2] = (short)101;
      shortArray5[3] = (short)2244;
      shortArray5[4] = (short) (-4639);
      shortArray5[5] = (short)2244;
      shortArray0[4] = shortArray5;
      short[] shortArray6 = new short[2];
      shortArray6[0] = (short)2244;
      shortArray6[1] = (short) (-1983);
      shortArray0[5] = shortArray6;
      short[] shortArray7 = new short[2];
      shortArray7[0] = (short) (-24270);
      shortArray7[1] = (short)17;
      shortArray0[6] = shortArray7;
      short[] shortArray8 = new short[0];
      shortArray0[7] = shortArray8;
      ShortLookupTable shortLookupTable0 = null;
      try {
        shortLookupTable0 = new ShortLookupTable((-235), shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Offset must be greater than 0
         //
         verifyException("java.awt.image.LookupTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PNG missing image data", "PNG missing image data");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      String string0 = bmpImageParser0.getXmpXml(byteSourceFile0, hashtable0);
      assertNull(string0);
  }
}