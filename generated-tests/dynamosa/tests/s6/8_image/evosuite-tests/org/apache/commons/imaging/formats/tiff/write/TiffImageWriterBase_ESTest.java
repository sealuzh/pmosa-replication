/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 16:00:20 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-2832L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile("0cCr'YMQi6`sZFr", "t @|)w2_f=Y/9|");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null, byteOrder0);
      binaryOutputStream0.setDebug(true);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, (OutputStream) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((byte)112);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-3299));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, tiffOutputSet0.byteOrder);
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 8L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(4, 44, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid TIFF File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("FORMAT");
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addRootDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateRootDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        tiffImageWriterLossy0.write(pipedOutputStream0, tiffOutputSet0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.validateDirectories((TiffOutputSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("$V", false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Double double0 = new Double((-3246.60485506548));
      hashtable0.put("COMPRESSION", double0);
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      BufferedImage bufferedImage0 = new BufferedImage((byte)3, 62, (byte)3);
      PrintStream printStream0 = DebugGraphics.logStream();
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, printStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      ImageBuilder imageBuilder0 = new ImageBuilder(4, 4, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put(" is less than 8000 minimum", tiffImageWriterLossless0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter:  is less than 8000 minimum
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(33, 33, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Byte byte0 = new Byte((byte)3);
      hashtable0.put("COMPRESSION", byte0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid TIFF byte order 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(9, 16, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byte[] byteArray0 = new byte[5];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      hashtable0.put("COMPRESSION", imageBuilder0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: org.apache.commons.imaging.common.ImageBuilder@1
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(147, 147, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("XMP_XML", "RH#=WG6~xUF~X$Whes");
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(147, 147, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("EXIF", hashtable0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Hashtable cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.addGPSDirectory();
      hashMap0.put("FORMAT", tiffOutputDirectory0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory((-4070), tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown directory: -4070
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees(254.0, 254.0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(9, 16, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      MockPrintStream mockPrintStream0 = new MockPrintStream("X9NF{x8");
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      assertEquals(16, bufferedImage0.getHeight());
  }
}