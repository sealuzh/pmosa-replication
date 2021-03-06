/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:08:58 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
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
      byte[] byteArray0 = new byte[6];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      MockFile mockFile0 = new MockFile("org.apache.commons.io.filefilter.PrefixFileFilter", "org.apache.commons.io.filefilter.PrefixFileFilter");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("W7S");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(73);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
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
  public void test04()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(printStream0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.write(objectOutputStream0, (TiffOutputSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)64, 255, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("VH}ye=;?y?_%vK)r");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)64, 255, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("VH}ye=;?y?_%vK)r");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("q4)ts5\"7R", byteOrder0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: q4)ts5\"7R
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", (Object) null);
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
  public void test08()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EXIF");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("EXIF", "EXIF");
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, bufferedOutputStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Long long0 = new Long(2867L);
      hashMap0.put("FORMAT", long0);
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
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(63, tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addGPSDirectory();
      try { 
        tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.setGPSInDegrees(652.6332324951998, (-2584.31));
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees(451.37, 451.37);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, tiffOutputSummary0.byteOrder);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-1943L));
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[0];
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
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      BufferedImage bufferedImage0 = new BufferedImage(8, 8, 3);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4554);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
      assertEquals(212, byteArrayOutputStream0.size());
      assertEquals("MM\u0000*\u0000\u0000\u0000\b\u0000\f\u0001\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0001\u0001\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\b\u0001\u0002\u0000\u0003\u0000\u0000\u0000\u0003\u0000\u0000\u0000\uFFFD\u0001\u0003\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0005\u0000\u0000\u0001\u0006\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0001\u0011\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0001\u0015\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0001\u0016\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0001M\u0001\u0017\u0000\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0019\u0001\u001A\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0001\u001B\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0001(\u0000\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\uFFFD\u0000 P8$\u0016\r\u0007\uFFFDBaP\uFFFDd6\u001D\u000F\uFFFDDbQ8\u0014\u0004\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader((BinaryOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
}
