/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 03:52:55 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import javax.swing.JLayeredPane;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(296, 296, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("FORMAT");
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.setGPSInDegrees((-4), 2832.663927);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.setGPSInDegrees(0.0, 0.0);
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, (-1544L));
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Do(t;bvm&^Jg0", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(dataOutputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0, byteOrder0);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 2147483647L);
      assertTrue(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets", false);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(filterOutputStream0, byteOrder0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (byte)6);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertTrue(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BufferedImage bufferedImage0 = new BufferedImage(1126, (byte)1, 3);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>((byte)1);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, printStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(777);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-1879048190));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, byteOrder0);
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
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
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
  public void test15()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)4, (byte)4, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("COMPRESSION");
      mockFileOutputStream0.close();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
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
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, (TiffOutputSet) null);
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
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addRootDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
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
  public void test19()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(296, 296, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("|)", "|)");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("CFAPattern");
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: |)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", "XMP_XML");
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
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("EXIF", tiffImageWriterLossless0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, (OutputStream) null, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      hashMap0.put("FORMAT", integer0);
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
  public void test23()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addExifDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
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
  public void test24()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)4, (byte)4, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("COMPRESSION");
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
}
