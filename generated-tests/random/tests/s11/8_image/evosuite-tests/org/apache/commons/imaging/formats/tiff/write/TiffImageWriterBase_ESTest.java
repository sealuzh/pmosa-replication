/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:01:33 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 179L);
      assertEquals("II\u0000*\u0000\u0000\u0000\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-1086L));
      assertEquals("II\u0000*\uFFFD\uFFFD\uFFFD\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("Unknown directory: ");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertEquals("II*\u0000\b\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
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
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)15, 1021, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.EXIF_DIRECTORY_INTEROP_IFD;
      TagInfoSRational tagInfoSRational0 = new TagInfoSRational("&akex", (byte)15, tiffDirectoryType0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputField tiffOutputField0 = TiffOutputField.createOffsetField(tagInfoSRational0, byteOrder0);
      hashtable0.put(":c[PHfN", tiffOutputField0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, bufferedOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: :c[PHfN
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)15, 1021, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("EXIF", ":c[PHfN");
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, bufferedOutputStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)15, 1021, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      SunHints.LCDContrastKey sunHints_LCDContrastKey0 = (SunHints.LCDContrastKey)RenderingHints.KEY_TEXT_LCD_CONTRAST;
      hashtable0.put("FORMAT", sunHints_LCDContrastKey0);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, bufferedOutputStream0, hashtable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(2, 2, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(2);
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
      assertEquals(192, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u00005\u0005\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\b\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000 P8$\n\u0002", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addExifDirectory();
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
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
      StringBuffer stringBuffer0 = new StringBuffer("Unknown directory: ");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees(78.85629154111, (byte)105);
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals(328, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0003\u0000\u0000\u0001\u0000\u0002\u0000\u0002\u0000\u0000\u0000N\u0000\u0000\u0000\u0002\u0000\u0005\u0000\u0003\u0000\u0000\u0000t\u0000\u0000\u0000\u0003\u0000\u0002\u0000\u0002\u0000\u0000\u0000E\u0000\u0000\u0000\u0004\u0000\u0005\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000i\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000N\u0000\u0000\u0000\u0001\u0000\u0000\u00003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\uFFFD\u0001\u0000O\u0014\u0000\u0000II*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0003\u0000\u0000\u0001\u0000\u0002\u0000\u0002\u0000\u0000\u0000N\u0000\u0000\u0000\u0002\u0000\u0005\u0000\u0003\u0000\u0000\u0000t\u0000\u0000\u0000\u0003\u0000\u0002\u0000\u0002\u0000\u0000\u0000E\u0000\u0000\u0000\u0004\u0000\u0005\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000i\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000N\u0000\u0000\u0000\u0001\u0000\u0000\u00003\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\uFFFD\u0001\u0000O\u0014\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1713);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      try { 
        tiffImageWriterLossy0.write(bufferedOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals(112, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0001\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000II*\u0000\b\u0000\u0000\u0000\u0001\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }
}