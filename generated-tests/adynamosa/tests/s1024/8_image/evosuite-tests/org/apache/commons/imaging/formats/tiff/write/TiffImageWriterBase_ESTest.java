/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 13:12:05 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong;
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
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)16, (byte)127, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>((byte)127);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.addGPSDirectory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals(76, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000D\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(37522);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.setGPSInDegrees(60.0, (-235.64168866571956));
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals(164, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0003\u0000\u0000\u0001\u0000\u0002\u0000\u0002\u0000\u0000\u0000S\u0000\u0000\u0000\u0002\u0000\u0005\u0000\u0003\u0000\u0000\u0000L\u0000\u0000\u0000\u0003\u0000\u0002\u0000\u0002\u0000\u0000\u0000E\u0000\u0000\u0000\u0004\u0000\u0005\u0000\u0003\u0000\u0000\u0000d\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0001\u0000\u0000\u0000&\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0007i\u0004\u0000\uFFFD%\u0000\u0000<\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, (ByteOrder) null);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-21L));
      assertEquals("II*\u0000\uFFFD\uFFFD\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(971);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0, 971);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(bufferedOutputStream0);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (byte)1);
      assertTrue(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[4];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("`L>#q?V");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)0);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[4];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("`L>#q?V");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(419);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, byteArrayOutputStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 3, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      bufferedImage0.setAccelerationPriority(0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
      assertEquals(196, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000x\u0003\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u000B\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000 P8$\u0016\r\u0006\uFFFD\uFFFD\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(1650);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-1982292596));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 2955L);
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile("^:{#K", "N>^_er~");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      binaryOutputStream0.close();
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
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
  public void test16()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
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
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.validateDirectories((TiffOutputSet) null);
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
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("[yBMgfdK");
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateRootDirectory();
      tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, (byte[]) null);
      ImageBuilder imageBuilder0 = new ImageBuilder(191, 191, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>(190);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("[yBOgfdKT");
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      byte[] byteArray0 = new byte[5];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)16, 37385, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>((byte)16);
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      hashtable0.put("org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary$OffsetItem", fieldTypeLong0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, mockFileOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary$OffsetItem
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("?XIF");
      ImageBuilder imageBuilder0 = new ImageBuilder(2357, 3, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      hashMap0.put("COMPRESSION", bufferedInputStream0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: java.io.BufferedInputStream@2e8dce60
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("[yBOgfdKT");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.putIfAbsent("XMP_XML", "XMP_XML");
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, mockFileOutputStream0, hashMap0);
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
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      byte[] byteArray0 = new byte[6];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      hashtable0.put("FORMAT", defaultTableModel0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, (OutputStream) null, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addGPSDirectory();
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getOrCreateRootDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile("Z(1y9NUB`f", "Z(1y9NUB`f");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSet tiffOutputSet1 = new TiffOutputSet(tiffOutputSet0.byteOrder);
      tiffOutputSet1.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.write(mockPrintStream0, tiffOutputSet1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Output set has GPS Directory Offset field, but no GPS Directory
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.getOrCreateRootDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addGPSDirectory();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
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
  public void test27()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals(56, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0001\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("[yBOgfdKT");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("EXIF", tiffImageWriterLossy0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
}
