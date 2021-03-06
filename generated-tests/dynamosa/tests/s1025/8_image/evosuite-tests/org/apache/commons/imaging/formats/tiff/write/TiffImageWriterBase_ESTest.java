/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 14:51:53 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(2560, 2370, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.setGPSInDegrees((-4), 0.813);
      MockFile mockFile0 = new MockFile("EXIF");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0, tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
      assertEquals(184, binaryOutputStream0.getByteCount());
      assertEquals(184L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      MockFile mockFile0 = new MockFile("", "BY");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, (ByteOrder) null);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 719L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("|g3O55");
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, mockPrintStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(2218, 2218, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      bufferedImage0.coerceData(true);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(2506);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-4));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null, byteOrder0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-580L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-1L));
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
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(", fieldType: ");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(8, 8, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9nVN0K^vlb'W-^");
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      try { 
        tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateExifDirectory();
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
  public void test20()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(8, 8, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      byte[] byteArray0 = new byte[6];
      hashMap0.put((String) null, (Object) null);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, byteArray0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: null
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(2, 2, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", "COMPRESSION");
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: COMPRESSION
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(341, 341, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", (Object) null);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(54, 54, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Short short0 = new Short((short)459);
      hashMap0.put("COMPRESSION", short0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(341, 341, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", (Object) null);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(2212, 2212, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte)72);
      hashMap0.put("EXIF", byte0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(2, 2, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerInch((short)459, (short)459);
      hashMap0.put("FORMAT", pixelDensity0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
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
  public void test28()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(8, 8, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("9nVN0K^vlb'W-^");
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(0, bufferedImage0.getTileGridYOffset());
  }
}
