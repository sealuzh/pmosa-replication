/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:11:03 GMT 2019
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.function.BiFunction;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      mockPrintStream0.println('h');
      mockPrintStream0.println((long) (byte)2);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      mockPrintStream0.print(54);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // BMP: Unknown Compression: 65536
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read HeadeA", "PSD: Couldn't read HeadeA");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      bufferedImage0.coerceData(true);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      assertEquals(922L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bufferedImage0.setAccelerationPriority(0.0F);
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      assertEquals(922L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, (Map<String, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("kA7-/$v;xP3{");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(550, 550);
      Object object0 = new Object();
      hashMap0.put("Top Position", object0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceFile0, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("nE4(zb!=t958V", "nE4(zb!=t958V");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(file0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceFile0, (Map<String, Object>) null);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("BOL:%~m}5");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("c-`%&S_*j6", mockFile0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) null, (Map<String, Object>) hashtable0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile(";p|}R)J*", ";p|}R)J*");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
      byte[] byteArray1 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceArray0, (Map<String, Object>) null);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[8];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("Ot$KzY{F`;%~N", object0);
      byte[] byteArray1 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(95, 95);
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) hashMap0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Z G4~#");
      // Undeclared exception!
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageSize((ByteSource) null, (Map<String, Object>) hashMap0);
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageInfo((ByteSource) null, (Map<String, Object>) hashMap0);
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[14];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Object object0 = new Object();
      hashtable0.put("", object0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("l", "l");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) null);
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
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(pushbackInputStream0, "redMask");
      // Undeclared exception!
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) null, (ByteSource) byteSourceInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      InputStream inputStream0 = byteSourceFile0.getInputStream();
      bmpImageParser0.getBufferedImage(inputStream0, (Map<String, Object>) hashMap0);
      assertEquals(922L, byteSourceFile0.getLength());
      assertEquals(922L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      ImageInfo imageInfo0 = bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
      assertEquals("Bmp (BM: Windows 3.1x, 95, NT,)", imageInfo0.getFormatDetails());
      assertEquals(1, imageInfo0.getBitsPerPixel());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      hashMap0.put("u3H$N", "u3H$N");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, pipedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: u3H$N
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      hashMap0.put("PIXEL_DENSITY", pipedInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, pipedOutputStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.PipedInputStream cannot be cast to org.apache.commons.imaging.PixelDensity
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", "FORMAT");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, pipedOutputStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("l", "l");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockFileOutputStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashtable0.merge("PIXEL_DENSITY", hashMap0, biFunction0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: PIXEL_DENSITY
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_DITHERING;
      hashtable0.put("BUFFERED_IMAGE_FACTORY", sunHints_Key0);
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      hashMap0.put("VERBOSE", (Object) null);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(dataInputStream0, (InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) bufferedInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        bmpImageParser0.getBufferedImage((InputStream) pipedInputStream0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[14];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)109);
      bmpImageParser0.writeImage(bufferedImage0, bufferedOutputStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
      assertEquals(922L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)109);
      bmpImageParser0.writeImage(bufferedImage0, bufferedOutputStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
      assertEquals(922L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_TEXT_ANTIALIASING;
      hashMap0.put("PIXEL_DENSITY", sunHints_Key0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: PIXEL_DENSITY
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", bmpImageParser0);
      try { 
        bmpImageParser0.getImageInfo(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[1];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("z 0", bmpImageParser0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: z 0
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("VERBOSE", bmpImageParser0);
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
  public void test39()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      Dimension dimension0 = bmpImageParser0.getImageSize((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
      assertEquals(922L, byteSourceFile0.getLength());
      assertEquals(54, dimension0.height);
      assertEquals(109, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Co ldn't read Header", "PSD: Co ldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      mockPrintStream0.write(65534);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 39, (byte)2);
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File count: -1 read: 545 length: 4594
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      mockPrintStream0.println('-');
      mockPrintStream0.append((CharSequence) "PSD: Couldn't read Header");
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // BMP has invalid image data offset: 661546092 (expected: 1701978242, paletteLength: 0, headerSize: 1701978242)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      mockPrintStream0.println('-');
      mockPrintStream0.append((CharSequence) "PSD: Couldn't read Header");
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 39, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File count: -1 read: 571 length: 637289450
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      mockPrintStream0.println('n');
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File count: -1 read: 786 length: 262144
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 54, (byte)2);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)109);
      bmpImageParser0.writeImage(bufferedImage0, bufferedOutputStream0, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream0, true);
      boolean boolean0 = bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceFile0);
      assertEquals(1364L, mockFile0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Co ldn't read Header", "PSD: Co ldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "PSD: Co ldn't read Header");
      BufferedImage bufferedImage0 = new BufferedImage((byte)109, 39, (byte)2);
      bmpImageParser0.writeImage(bufferedImage0, printStream0, hashMap0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File count: -1 read: 569 length: 39936
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[22];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
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
  public void test48()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("PSD: Couldn't read Header", "PSD: Couldn't read Header");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)109);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream0, true);
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String[] stringArray0 = bmpImageParser0.getAcceptedExtensions();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = bmpImageParser0.getXmpXml((ByteSource) null, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      assertEquals(1, imageFormatArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }
}