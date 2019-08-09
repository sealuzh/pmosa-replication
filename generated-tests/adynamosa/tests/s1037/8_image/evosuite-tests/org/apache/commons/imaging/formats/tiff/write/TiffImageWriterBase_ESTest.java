/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 12:52:39 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort;
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.setGPSInDegrees(0.0, 0.0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.setGPSInDegrees((-1L), (-1970.921213154332));
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-1622L));
      assertEquals("II\u0000*\uFFFD\uFFFD\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      File file0 = MockFile.createTempFile("Unknown parameter: ", "4RAxU=jYA(Q[98]znnG");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 428L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(86);
      ByteOrder byteOrder0 = charBuffer0.order();
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)106);
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null, byteOrder0);
      binaryOutputStream0.setDebug(true);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)40, 41989, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      ImageBuilder imageBuilder0 = new ImageBuilder(25, 826, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      bufferedImage0.coerceData(true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(binaryOutputStream0, true);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-100));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 0);
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
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, byteOrder0);
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
  public void test14()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(42, 42, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, printStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
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
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.io.filefilter.MagicNumberFileFilter");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(25);
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      ImageBuilder imageBuilder0 = new ImageBuilder(25, 826, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockPrintStream mockPrintStream0 = new MockPrintStream(binaryOutputStream0, true);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PipedInputStream pipedInputStream0 = new PipedInputStream(826);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      hashMap0.put("Output set has Exif Directory Offset field, but no Exif Directory", bufferedInputStream0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: Output set has Exif Directory Offset field, but no Exif Directory
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(25, 25, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      MockPrintStream mockPrintStream0 = new MockPrintStream("]jZ^}W");
      hashtable0.put("COMPRESSION", bufferedImage0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: BufferedImage@744d8c96: type = 1 DirectColorModel: rmask=ff0000 gmask=ff00 bmask=ff amask=0 IntegerInterleavedRaster: width = 25 height = 25 #Bands = 3 xOff = 0 yOff = 0 dataOffset[0] 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(73, 73, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Byte byte0 = new Byte((byte)35);
      hashtable0.put("COMPRESSION", byte0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashtable0);
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
      PrintStream printStream0 = DebugGraphics.logStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("XMP_XML", "XMP_XML");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      PrintStream printStream0 = DebugGraphics.logStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Object object0 = new Object();
      hashtable0.put("EXIF", object0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, printStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Double double0 = new Double(0.0);
      hashtable0.put("FORMAT", double0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      ImageBuilder imageBuilder0 = new ImageBuilder(8, 3, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      MockPrintStream mockPrintStream0 = new MockPrintStream("]jZ^}W");
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      assertEquals(2, bufferedImage0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(73, tiffOutputSet0.byteOrder);
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
  public void test25()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      tiffOutputSet0.addExifDirectory();
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
  public void test26()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees(4067.0, 4067.0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("]jZ^}W");
      tiffImageWriterLossy0.write(mockPrintStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.addRootDirectory();
      HashMap<Integer, TiffOutputDirectory> hashMap0 = new HashMap<Integer, TiffOutputDirectory>();
      TiffOutputSummary tiffOutputSummary0 = new TiffOutputSummary(byteOrder0, tiffOutputDirectory0, hashMap0);
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_EXIF_IFD;
      TagInfoSShorts tagInfoSShorts0 = new TagInfoSShorts("TFRMA", 0, (-4), tiffDirectoryType0);
      short[] shortArray0 = new short[2];
      tiffOutputSummary0.rootDirectory.add(tagInfoSShorts0, shortArray0);
      TagInfoShort tagInfoShort0 = new TagInfoShort("TFRMA", 0, tagInfoSShorts0.directoryType);
      tiffOutputDirectory0.add(tagInfoShort0, (short)900);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Tag (0 (0x0: TFRMA): ) appears twice in directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      PrintStream printStream0 = DebugGraphics.logStream();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(9);
      assertEquals(3, int0);
  }
}
