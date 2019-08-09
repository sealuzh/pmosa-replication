/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 21:56:38 GMT 2019
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
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
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
      ImageBuilder imageBuilder0 = new ImageBuilder(72, 72, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.addGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[3];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" 2j:v$$q0y");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0, byteOrder0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-2147483648L));
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(2773);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, byteOrder0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0);
      assertEquals("II\u0000*\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", true);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, byteOrder0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 978L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", true);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, byteOrder0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, pipedOutputStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
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
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedImage bufferedImage0 = new BufferedImage(46, 52, 3);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-4));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, (-1376L));
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 52);
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(5, 5, 5);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
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
  public void test20()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, (ByteOrder) null);
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
  public void test21()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedImage bufferedImage0 = new BufferedImage(12, 12, 12);
      hashMap0.put((String) null, (Object) null);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: null
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(3149, 3149, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte)8);
      hashMap0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", byte0);
      hashMap0.put("COMPRESSION", (Object) null);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Block size parameter 8 is less than 8000 minimum
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(255, 255, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", bufferedImage0);
      hashMap0.put("COMPRESSION", (Object) null);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression block-size parameter: null
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(5, 5, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      hashMap0.put("COMPRESSION", tiffImageWriterLossy0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy@1
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(1396, 48324, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte)32);
      hashMap0.put("COMPRESSION", byte0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedImage bufferedImage0 = new BufferedImage(5, 5, 5);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", "XMP_XML");
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
      assertEquals("II*\u0000\b\u0000\u0000\u0000\r\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0015\u0002\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\uFFFD\u0002\u0001\u0000\u0007\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000XMP_XML\u0000\uFFFD\u0000 P8$\u0016\r\u0007\uFFFDBaP\uFFFDL\u0004", byteArrayOutputStream0.toString());
      assertEquals(220, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("EXIF", pipedOutputStream0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, pipedOutputStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.PipedOutputStream cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedImage bufferedImage0 = new BufferedImage(5, 5, 5);
      hashMap0.put("FORMAT", "FORMAT");
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
      assertEquals(200, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0015\u0002\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000 P8$\u0016\r\u0007\uFFFDBaP\uFFFDL\u0004", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addExifDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
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
  public void test30()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
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
}
