/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 01:17:21 GMT 2019
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-100);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
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
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      byteArray0[16] = (byte)2;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String[] stringArray0 = bmpImageParser0.getAcceptedExtensions();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("VERBOSE", "VERBOSE");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("f(Kbr~Juw'TB", byteArray0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = bmpImageParser0.getXmpXml((ByteSource) null, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) null);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[23];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("PIXEL_DENSITY", byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerInch((byte)36, 5823.14707602);
      hashtable0.put("PIXEL_DENSITY", pixelDensity0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) null, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("$rk<", "Bmp-Custom");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(file0);
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceFile0, (Map<String, Object>) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[8];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("Parsing XPM file failed, can't parse <Values> section XPMEXT", bmpImageParser0);
      byte[] byteArray1 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) hashtable0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PipedInputStream pipedInputStream0 = new PipedInputStream(22);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) bufferedInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
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
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
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
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("W2b'>g8w4");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("6t");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(pushbackInputStream0, "6t");
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[23];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("PIXEL_DENSITY", byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("PIXEL_DENSITY", byteSourceArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) byteArrayInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: PIXEL_DENSITY
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 359, (byte)0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) byteArrayInputStream0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(256, 256);
      Integer integer0 = Integer.getInteger("c0DZ.$cH4g,]@]]A", 9);
      hashMap0.put("nQW46*W|!~75", integer0);
      BufferedImage bufferedImage0 = new BufferedImage(256, 9, 9);
      try { 
        bmpImageParser0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: nQW46*W|!~75
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("PIXEL_DENSITY", bmpImageParser0);
      PrintStream printStream0 = DebugGraphics.logStream();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, printStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.imaging.formats.bmp.BmpImageParser cannot be cast to org.apache.commons.imaging.PixelDensity
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_STROKE_CONTROL;
      hashtable0.put("FORMAT", sunHints_Key0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("FORMAT");
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockFileOutputStream0, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, (OutputStream) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(256, 256);
      BufferedImage bufferedImage0 = new BufferedImage(256, 9, 9);
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PixelDensity pixelDensity0 = PixelDensity.createUnitless(9, 1.0);
      hashMap0.put("bytes", pixelDensity0);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(mockFileInputStream0, "rgb.txt");
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: bytes
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("BUFFERED_IMAGE_FACTORY", "BUFFERED_IMAGE_FACTORY");
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
  public void test27()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", (Object) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
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
  public void test28()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[4];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[36];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("bytes", "bytes");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(file0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("c)<59DH% /l", hashMap0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: c)<59DH% /l
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", (Object) null);
      byte[] byteArray0 = new byte[1];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("-J:<0URHJvGr", byteArray0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageInfo((ByteSource) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[1];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("-J:<0URHJvGr", byteArray0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[2];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Object object0 = new Object();
      hashtable0.put("FORMAT", object0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: FORMAT
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[23];
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("VERBOSE", "VERBOSE");
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("f(Kbr~Juw'TB", byteArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[23];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) null, (ByteSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("S.hOU*|dL", byteArray0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, (Map<String, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      assertEquals(1, imageFormatArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }
}
