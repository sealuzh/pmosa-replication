/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:06:56 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
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
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      File file0 = MockFile.createTempFile("000001011011", "u*kD./@VL");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 2);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(bufferedOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)76);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-1423));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, byteOrder0);
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, (byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, printStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[5];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      MockFile mockFile0 = new MockFile((File) null, "g/afH");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, (ByteOrder) null);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-1423));
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(2, (byte)1, 2);
      File file0 = MockFile.createTempFile("000001011011", "u*kD./@VL");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(7, (byte)76);
      hashMap0.put("=V/_(*K[`g:EC8>v", "=V/_(*K[`g:EC8>v");
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, bufferedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: =V/_(*K[`g:EC8>v
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(888, 580, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(580);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", (Object) null);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(41986, byteOrder0);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "g/afH");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, (ByteOrder) null);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      try { 
        tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter", false);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      File file0 = MockFile.createTempFile("000001011011", "u*kD./@VL");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 2);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(bufferedOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(2, (byte)1, 2);
      File file0 = MockFile.createTempFile("000001011011", "u*kD./@VL");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(7, (byte)76);
      tiffImageWriterLossy0.writeImage(bufferedImage0, bufferedOutputStream0, hashMap0);
      assertEquals(190L, file0.length());
  }
}