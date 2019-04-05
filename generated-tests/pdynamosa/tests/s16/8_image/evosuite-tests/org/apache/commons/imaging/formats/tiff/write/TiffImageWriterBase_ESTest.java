/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 02:02:04 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.function.BiFunction;
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.setGPSInDegrees((-144.7033821), (-144.7033821));
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 16, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFile mockFile0 = new MockFile("SL`},d");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(208L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, (byte[]) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream(77);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 77);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, tiffOutputSummary0.byteOrder);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-1L));
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("SL`},d", false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, (ByteOrder) null);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertTrue(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(filterOutputStream0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(128, 404, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, printStream0, (Map<String, Object>) null);
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
      BufferedImage bufferedImage0 = new BufferedImage(10, 10, 10);
      bufferedImage0.setAccelerationPriority(0.0F);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
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
  public void test08()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-342));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader((BinaryOutputStream) null, 0L);
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
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
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
  public void test14()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("RPr4Ppd(z");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "RPr4Ppd(z");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImageBuilder imageBuilder0 = new ImageBuilder(572, 3556, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("MZ0u:XtvaF$aJFUv");
      FileChannel fileChannel0 = mockFileOutputStream0.getChannel();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("]Jb-a", fileChannel0);
      ImageBuilder imageBuilder0 = new ImageBuilder(768, 2, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: ]Jb-a
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(10, 10, 10);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge("COMPRESSION", "COMPRESSION", biFunction0);
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
  public void test17()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", (Object) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, hashMap0);
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
      PrintStream printStream0 = DebugGraphics.logStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Byte byte0 = new Byte((byte) (-128));
      hashtable0.put("EXIF", byte0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", tiffImageWriterLossy0);
      ImageBuilder imageBuilder0 = new ImageBuilder(15, 128, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, printStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(73, tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
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
  public void test21()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
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
  public void test22()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
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
  public void test24()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
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
}