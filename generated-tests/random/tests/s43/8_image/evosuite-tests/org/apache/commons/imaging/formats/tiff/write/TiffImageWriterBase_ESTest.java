/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:23:49 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
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
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, byteOrder0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)56);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("XMP_XML", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(dataOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-4));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(402, 402, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(127, 8, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, byteOrder0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Double double0 = new Double(0.0);
      hashMap0.put("Output set has Exif Directory Offset field, but no Exif Directory", double0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: Output set has Exif Directory Offset field, but no Exif Directory
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(127, 8, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, byteOrder0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.putIfAbsent("COMPRESSION", byteArrayOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("EXIF", byteOrder0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EXIF", true);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, mockFileOutputStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.nio.ByteOrder cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", tiffImageWriterLossy0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, bufferedOutputStream0, hashMap0);
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.addRootDirectory();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSet tiffOutputSet1 = new TiffOutputSet();
      tiffOutputSet1.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Output set has Exif Directory Offset field, but no Exif Directory
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile(".");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(11, byteOrder0);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.write(mockPrintStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
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
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(8, 13, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      File file0 = MockFile.createTempFile("pHW/?", "pHW/?");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      assertEquals(216L, file0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory((-1), tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown directory: -1
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, byteOrder0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateGPSDirectory();
      tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("T.6 compression with the uncompressed mode extension is not yet supported");
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
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
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[4];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
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

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("XMP_XML", false);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
      tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
  }
}
