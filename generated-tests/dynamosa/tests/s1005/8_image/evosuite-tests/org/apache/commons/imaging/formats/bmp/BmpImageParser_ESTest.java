/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 05:28:05 GMT 2019
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.JLayeredPane;
import org.apache.commons.imaging.ImageFormat;
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
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byteArray0[1] = (byte)85;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      try { 
        bmpImageParser0.getBufferedImage((InputStream) byteArrayInputStream0, (Map<String, Object>) hashtable0);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 768);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(dataInputStream0, "");
      String string0 = bmpImageParser0.getXmpXml(byteSourceInputStream0, (Map<String, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("bitmapDataOffset", "BitmapDataOffset");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("2S0f;VyZ>2", "");
      String string0 = bmpImageParser0.getXmpXml(byteSourceFile0, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      String string0 = bmpImageParser0.getXmpXml((ByteSource) null, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", "VERBOSE");
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(mockFileInputStream0, "VERBOSE");
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) null, (Map<String, Object>) hashtable0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      hashMap0.put("A$", integer0);
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) hashMap0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      hashMap0.put("A$", integer0);
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockPrintStream mockPrintStream0 = new MockPrintStream("H'I");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      BufferedImage bufferedImage0 = new BufferedImage(4100, 4100, 3);
      // Undeclared exception!
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("PIXEL_DENSITY", true);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("PIXEL_DENSITY", mockFileOutputStream0);
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.io.MockFileOutputStream cannot be cast to org.apache.commons.imaging.PixelDensity
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("colorSpace.blue.y");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
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
  public void test15()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1908874352), 125);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, dataInputStream0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(sequenceInputStream0, "H*I");
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
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
      MockFile mockFile0 = new MockFile("");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
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
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3168), 1602);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "VERBOSE");
      // Undeclared exception!
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
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
  public void test21()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("ImageOffset");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2040109463), 4100);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "*V|S^%uY3/>~3/8z");
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      MockFile mockFile0 = new MockFile("BUFFERED_IMAGE_FACTORY");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
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
  public void test26()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-74), (byte)77);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) byteArrayInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("ZJM{'S8,c");
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(678);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0, true);
      MockFile mockFile0 = new MockFile("U=&yr>7t0JQ>L;d", "U=&yr>7t0JQ>L;d");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<Object, InputStream> hashtable0 = new Hashtable<Object, InputStream>();
      Enumeration<InputStream> enumeration0 = hashtable0.elements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) sequenceInputStream0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[20];
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
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("D;gb:&u", bmpImageParser0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("D;gb:&u");
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockPrintStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: D;gb:&u
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("PIXEL_DENSITY", (Object) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("PIXEL_DENSITY");
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockPrintStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", "FORMAT");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test35()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("}tYy=P(t2ZEJwT[,!e");
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
  public void test36()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("bX", bmpImageParser0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        bmpImageParser0.getBufferedImage((InputStream) pipedInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: bX
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("BUFFERED_IMAGE_FACTORY", "BUFFERED_IMAGE_FACTORY");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", "VERBOSE");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[56];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("org.apache.commons.imaging.ImageParser", "org.apache.commons.imaging.ImageParser");
      try { 
        bmpImageParser0.getImageInfo((ByteSource) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: org.apache.commons.imaging.ImageParser
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("VERBOSE", object0);
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
  public void test42()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("bX", "bX");
      try { 
        bmpImageParser0.getImageSize((ByteSource) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: bX
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[7];
      hashMap0.put("VERBOSE", bmpImageParser0);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("org.apache.commons.imaging.ImageParser", byteArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[22];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) hashMap0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String[] stringArray0 = bmpImageParser0.getAcceptedExtensions();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) null);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      assertEquals(1, imageFormatArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }
}
