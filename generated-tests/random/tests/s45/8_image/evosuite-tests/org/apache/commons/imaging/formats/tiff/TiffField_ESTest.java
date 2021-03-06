/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 06:58:09 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffField_ESTest extends TiffField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-80);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(152, 152, fieldTypeShort0, 24080L, 607L, byteArray0, byteOrder0, 2118850532);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(607, tiffField0.getOffset());
      assertEquals(24080L, tiffField0.getCount());
      assertEquals(152, tiffField0.getDirectoryType());
      assertEquals((-20480), int0);
      assertEquals(152, tiffField0.getTag());
      assertEquals(2118850532, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)89;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-242), (-242), fieldTypeShort0, 1L, 1155L, byteArray0, byteOrder0, 1266);
      tiffField0.getIntValueOrArraySum();
      assertEquals(1L, tiffField0.getCount());
      assertEquals((-242), tiffField0.getDirectoryType());
      assertEquals((-242), tiffField0.getTag());
      assertEquals(1155, tiffField0.getOffset());
      assertEquals(1266, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-92);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeLong0, 2136L, (-546L), byteArray0, byteOrder0, 391);
      tiffField0.getIntValueOrArraySum();
      assertEquals(1, tiffField0.getTag());
      assertEquals(2136L, tiffField0.getCount());
      assertEquals((-546), tiffField0.getOffset());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(391, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-1840700268), 4091, fieldTypeRational0, (-1840700268), 4L, byteArray0, byteOrder0, (byte) (-108));
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeByte0, (-1L), 1, byteArray0, byteOrder0, (byte)95);
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null, "4(c[t[SIfCgqa^?3");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = new FieldTypeShort(0, "");
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), 0, fieldTypeShort0, (-1), (-1), byteArray0, byteOrder0, (-1));
      // Undeclared exception!
      try { 
        tiffField0.dump();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2004, 2004, fieldTypeAscii0, 2004, 2004, byteArray0, byteOrder0, (-1049));
      MockFileWriter mockFileWriter0 = new MockFileWriter("2004 (0x7d4: Unknown Tag): java.lang.String@0000000003, java.lang.String@0000000004 (2004 ASCII)", false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileWriter0);
      tiffField0.dump((PrintWriter) mockPrintWriter0, (String) null);
      assertEquals(2004, tiffField0.getTag());
      assertEquals(2004L, tiffField0.getCount());
      assertEquals(2004, tiffField0.getOffset());
      assertEquals((-1049), tiffField0.getSortHint());
      assertEquals(2004, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      CharBuffer charBuffer0 = CharBuffer.allocate(50);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(50, 144, fieldTypeShort0, 144, 2346L, (byte[]) null, byteOrder0, 50);
      boolean boolean0 = tiffField0.isLocalValue();
      assertEquals(2346, tiffField0.getOffset());
      assertEquals(144, tiffField0.getDirectoryType());
      assertFalse(boolean0);
      assertEquals(50, tiffField0.getTag());
      assertEquals(50, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-161), (-5341), fieldTypeShort0, (-161), (-2942L), byteArray0, byteOrder0, 2659);
      tiffField0.getByteOrder();
      assertEquals((-161), tiffField0.getTag());
      assertEquals((-5341), tiffField0.getDirectoryType());
      assertEquals(2659, tiffField0.getSortHint());
      assertEquals((-2942), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-16), (-16), fieldTypeByte0, (-5900L), (-5900L), byteArray0, byteOrder0, 7);
      // Undeclared exception!
      try { 
        fieldTypeByte0.getValue(tiffField0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = new FieldTypeLong((-1576), "");
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), (-1576), fieldTypeLong0, (-1L), 3420L, byteArray0, byteOrder0, (-1576));
      tiffField0.getFieldType();
      assertEquals(3420, tiffField0.getOffset());
      assertEquals((-1576), tiffField0.getSortHint());
      assertEquals((-1576), tiffField0.getDirectoryType());
      assertEquals((-1), tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-1342), (-1342), fieldTypeLong0, 1747L, (-1906L), byteArray0, byteOrder0, (byte)5);
      tiffField0.getValue();
      assertEquals((-1906), tiffField0.getOffset());
      assertEquals(1747L, tiffField0.getCount());
      assertEquals((-1342), tiffField0.getTag());
      assertEquals(5, tiffField0.getSortHint());
      assertEquals((-1342), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-2147191512), (-2147191512), (FieldType) null, (-2147191512), (-2147191512), byteArray0, byteOrder0, 2090);
      int int0 = tiffField0.getOffset();
      assertEquals((-2147191512), int0);
      assertEquals((-2147191512), tiffField0.getTag());
      assertEquals((-2147191512), tiffField0.getDirectoryType());
      assertEquals(2090, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1475, 2683, fieldTypeFloat0, 0L, 93L, byteArray0, byteOrder0, 2683);
      tiffField0.getTagInfo();
      assertEquals(93, tiffField0.getOffset());
      assertEquals(2683, tiffField0.getDirectoryType());
      assertEquals(2683, tiffField0.getSortHint());
      assertEquals(1475, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2779, 2779, fieldTypeRational0, 2779, 2779, byteArray0, byteOrder0, (byte)1);
      long long0 = tiffField0.getCount();
      assertEquals(2779L, long0);
      assertEquals(2779, tiffField0.getOffset());
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(2779, tiffField0.getTag());
      assertEquals(2779, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(442, 793, fieldTypeByte0, (-544L), 793, byteArray0, byteOrder0, (byte) (-67));
      tiffField0.getBytesLength();
      assertEquals((-67), tiffField0.getSortHint());
      assertEquals(793, tiffField0.getDirectoryType());
      assertEquals(442, tiffField0.getTag());
      assertEquals(793, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(41485, 0, fieldTypeShort0, 100L, 41485, byteArray0, byteOrder0, 1);
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [S cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1475, 2683, fieldTypeFloat0, 0L, 93L, byteArray0, byteOrder0, 2683);
      // Undeclared exception!
      try { 
        tiffField0.getIntValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [F cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeLong0, 2136L, (-546L), byteArray0, byteOrder0, 391);
      tiffField0.getIntValueOrArraySum();
      assertEquals((-546), tiffField0.getOffset());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(2136L, tiffField0.getCount());
      assertEquals(391, tiffField0.getSortHint());
      assertEquals(1, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)1;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2779, 2779, fieldTypeRational0, 2779, 2779, byteArray0, byteOrder0, (byte)1);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(2779L, tiffField0.getCount());
      assertEquals(2779, tiffField0.getDirectoryType());
      assertEquals(0, int0);
      assertEquals(2779, tiffField0.getTag());
      assertEquals(2779, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2901, 300, fieldTypeFloat0, 1452L, 4L, byteArray0, byteOrder0, 3807);
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [F@29037884 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-738), "OSL+dOWAC9N\"ZzH");
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-738), (-738), fieldTypeDouble0, 6988L, (-15L), byteArray0, byteOrder0, (-738));
      tiffField0.getDoubleArrayValue();
      assertEquals((-15), tiffField0.getOffset());
      assertEquals(6988L, tiffField0.getCount());
      assertEquals((-738), tiffField0.getDirectoryType());
      assertEquals((-738), tiffField0.getSortHint());
      assertEquals((-738), tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2901, 300, fieldTypeFloat0, 1452L, 4L, byteArray0, byteOrder0, 3807);
      tiffField0.getDoubleArrayValue();
      assertEquals(1452L, tiffField0.getCount());
      assertEquals(2901, tiffField0.getTag());
      assertEquals(4, tiffField0.getOffset());
      assertEquals(300, tiffField0.getDirectoryType());
      assertEquals(3807, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[2];
      TiffField tiffField0 = new TiffField(32845, 0, fieldTypeAscii0, 32845, 0, byteArray0, (ByteOrder) null, 4);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [Ljava.lang.String;@3bc8ee65 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(6, (-270), fieldTypeLong0, 6, 2459L, byteArray0, byteOrder0, 2146969526);
      tiffField0.getDoubleArrayValue();
      assertEquals(2459, tiffField0.getOffset());
      assertEquals((-270), tiffField0.getDirectoryType());
      assertEquals(6, tiffField0.getTag());
      assertEquals(2146969526, tiffField0.getSortHint());
      assertEquals(6L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(41485, 0, fieldTypeShort0, 100L, 41485, byteArray0, byteOrder0, 1);
      tiffField0.getDoubleArrayValue();
      assertEquals(41485, tiffField0.getOffset());
      assertEquals(100L, tiffField0.getCount());
      assertEquals(41485, tiffField0.getTag());
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(1982292598, (String) null);
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1789, 1982292598, fieldTypeRational0, (-8369679852L), 1789, byteArray0, byteOrder0, (-989));
      double[] doubleArray0 = tiffField0.getDoubleArrayValue();
      assertEquals(1982292598, tiffField0.getDirectoryType());
      assertEquals((-8369679852L), tiffField0.getCount());
      assertEquals(1789, tiffField0.getTag());
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      assertEquals(1789, tiffField0.getOffset());
      assertEquals((-989), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(106, 50, fieldTypeLong0, 1L, (-3146L), byteArray0, byteOrder0, 0);
      tiffField0.getDoubleArrayValue();
      assertEquals(50, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals((-3146), tiffField0.getOffset());
      assertEquals(106, tiffField0.getTag());
      assertEquals(1L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(34677, 34677, fieldTypeByte0, 34677, 34677, byteArray0, byteOrder0, 122);
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@50992b7f for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = new FieldTypeShort(369, "");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(50, 50, fieldTypeShort0, 50, 0L, byteArray0, byteOrder0, (byte) (-1));
      int[] intArray0 = tiffField0.getIntArrayValue();
      assertEquals((-1), tiffField0.getSortHint());
      assertEquals(50, tiffField0.getDirectoryType());
      assertEquals(50, tiffField0.getTag());
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
      assertEquals(0, tiffField0.getOffset());
      assertEquals(50L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)1;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2779, 2779, fieldTypeRational0, 2779, 2779, byteArray0, byteOrder0, (byte)1);
      tiffField0.getIntArrayValue();
      assertEquals(2779L, tiffField0.getCount());
      assertEquals(2779, tiffField0.getTag());
      assertEquals(2779, tiffField0.getOffset());
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(2779, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(106, 50, fieldTypeLong0, 1L, (-3146L), byteArray0, byteOrder0, 0);
      tiffField0.getIntArrayValue();
      assertEquals(106, tiffField0.getTag());
      assertEquals((-3146), tiffField0.getOffset());
      assertEquals(1L, tiffField0.getCount());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(50, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(0, (-2092419963), fieldTypeLong0, 0, (-2143L), byteArray0, byteOrder0, 0);
      tiffField0.getIntArrayValue();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getTag());
      assertEquals((-2143), tiffField0.getOffset());
      assertEquals((-2092419963), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)58;
      TiffField tiffField0 = new TiffField(32845, 0, fieldTypeAscii0, 32845, 0, byteArray0, (ByteOrder) null, 4);
      String string0 = tiffField0.getStringValue();
      assertEquals(32845, tiffField0.getTag());
      assertEquals(0, tiffField0.getOffset());
      assertEquals(0, tiffField0.getDirectoryType());
      assertNotNull(string0);
      assertEquals(4, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(2092, "{p1NW{!.XYOd");
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(334, 334, fieldTypeDouble0, 334, 0L, byteArray0, byteOrder0, (-126));
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(334 (0x14e: NumberOfInks): ): [D@65cb3ae
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1475, 2683, fieldTypeFloat0, 0L, 93L, byteArray0, byteOrder0, 2683);
      String string0 = tiffField0.getTagName();
      assertEquals(2683, tiffField0.getSortHint());
      assertEquals(2683, tiffField0.getDirectoryType());
      assertEquals("Unknown Tag (0x5c3)", string0);
      assertEquals(93, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(297, 82, fieldTypeLong0, 255L, 82, byteArray0, byteOrder0, (byte)2);
      String string0 = tiffField0.getTagName();
      assertEquals(2, tiffField0.getSortHint());
      assertEquals(82, tiffField0.getDirectoryType());
      assertEquals(297, tiffField0.getTag());
      assertEquals("PageNumber", string0);
      assertEquals(82, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(3030, ", fieldType: ");
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(3030, 3030, fieldTypeFloat0, 3030, (-5048L), byteArray0, byteOrder0, (-2140876005));
      String string0 = tiffField0.toString();
      assertEquals((-5048), tiffField0.getOffset());
      assertEquals(3030, tiffField0.getDirectoryType());
      assertEquals("3030 (0xbd6: Unknown Tag): 0.0, 0.0 (3030 , fieldType: )", string0);
      assertEquals((-2140876005), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(131, 131, fieldTypeByte0, 1205L, 1205L, byteArray0, byteOrder0, (byte)124);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)124);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      tiffField0.dump((PrintWriter) mockPrintWriter0, ", ");
      assertEquals(", : 131 (0x83: Unknown Tag): 0, 0, 0, 0, 0, 0 (1205 SByte)\n", byteArrayOutputStream0.toString());
      assertEquals(131, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-2146979661), "Rating");
      byte[] byteArray0 = new byte[18];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-2146979661), (-2146979661), fieldTypeDouble0, (-2146979661), (-2548L), byteArray0, byteOrder0, 0);
      assertEquals(4031896, tiffField0.getBytesLength());
      
      String string0 = tiffField0.getValueDescription();
      assertEquals((-2146979661), tiffField0.getTag());
      assertEquals((-2548), tiffField0.getOffset());
      assertEquals((-2146979661), tiffField0.getDirectoryType());
      assertNotNull(string0);
      assertEquals((-2146979661L), tiffField0.getCount());
      assertEquals(0, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2371, 2371, fieldTypeDouble0, 2371, (-1L), byteArray0, byteOrder0, (byte) (-117));
      tiffField0.dump();
      assertEquals(2371, tiffField0.getTag());
      assertEquals(2371, tiffField0.getDirectoryType());
      assertEquals(18968, tiffField0.getBytesLength());
      assertEquals((-117), tiffField0.getSortHint());
      assertEquals(2371L, tiffField0.getCount());
      assertEquals((-1), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = new FieldTypeLong(57, "'0Cv_7");
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(57, 57, fieldTypeLong0, 57, 1680L, byteArray0, byteOrder0, (-1078));
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("'0Cv_7");
      tiffField0.dump((PrintWriter) mockPrintWriter0, "&\"{(H+?/8/P");
      assertEquals(57, tiffField0.getDirectoryType());
      assertEquals(57, tiffField0.getTag());
      assertEquals((-1078), tiffField0.getSortHint());
      assertEquals(228, tiffField0.getBytesLength());
      assertEquals(1680, tiffField0.getOffset());
      assertEquals(57L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(0, (-2092419963), fieldTypeLong0, 0, (-2143L), byteArray0, byteOrder0, 0);
      String string0 = tiffField0.getValueDescription();
      assertEquals((-2092419963), tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getSortHint());
      assertNotNull(string0);
      assertEquals(0, tiffField0.getTag());
      assertEquals((-2143), tiffField0.getOffset());
      assertEquals(0, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(41485, 0, fieldTypeShort0, 100L, 41485, byteArray0, byteOrder0, 1);
      MockFileWriter mockFileWriter0 = new MockFileWriter("E8[}y=4jly::V$-");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileWriter0);
      tiffField0.dump((PrintWriter) mockPrintWriter0);
      assertEquals(200, tiffField0.getBytesLength());
      assertEquals(41485, tiffField0.getOffset());
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(100L, tiffField0.getCount());
      assertEquals(41485, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-30);
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      TiffField tiffField0 = new TiffField((byte) (-30), (-1), fieldTypeAscii0, 255L, 1297L, byteArray0, (ByteOrder) null, (-3458));
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1, (-278), fieldTypeLong0, 1L, 1L, byteArray0, byteOrder0, (byte)97);
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = new FieldTypeLong((-1576), "");
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), (-1576), fieldTypeLong0, (-1L), 3420L, byteArray0, byteOrder0, (-1576));
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals((-1576), tiffField0.getDirectoryType());
      assertEquals((-1576), tiffField0.getSortHint());
      assertEquals(3420, tiffField0.getOffset());
      assertEquals((-1), tiffField0.getTag());
      assertNull(tiffElement0);
      assertEquals((-4), tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1475, 2683, fieldTypeFloat0, 0L, 93L, byteArray0, byteOrder0, 2683);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement((-1), (-542));
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertEquals(2683, tiffField0.getDirectoryType());
      assertEquals(93, tiffField0.getOffset());
      assertNull(string0);
      assertEquals(2683, tiffField0.getSortHint());
      assertEquals(1475, tiffField0.getTag());
      assertTrue(tiffField0.isLocalValue());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-160), 0, fieldTypeShort0, (-160), 0, byteArray0, byteOrder0, 2659);
      boolean boolean0 = tiffField0.isLocalValue();
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(2659, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getOffset());
      assertEquals((-160), tiffField0.getTag());
      assertTrue(boolean0);
      assertEquals((-160L), tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(442, 793, fieldTypeByte0, (-544L), 793, byteArray0, byteOrder0, (byte) (-67));
      tiffField0.getFieldTypeName();
      assertEquals(793, tiffField0.getDirectoryType());
      assertEquals((-67), tiffField0.getSortHint());
      assertEquals(442, tiffField0.getTag());
      assertEquals(793, tiffField0.getOffset());
      assertEquals((-544), tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[3];
      TiffField tiffField0 = new TiffField((-2500), 0, fieldTypeRational0, 1742L, 0, byteArray0, (ByteOrder) null, (-2807));
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertNotNull(tiffElement0);
      assertEquals(0L, tiffElement0.offset);
      assertEquals((-2500), tiffField0.getTag());
      assertEquals((-2807), tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(0, (-2092419963), fieldTypeLong0, 0, (-2143L), byteArray0, byteOrder0, 0);
      int int0 = tiffField0.getDirectoryType();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0L, tiffField0.getCount());
      assertEquals((-2092419963), int0);
      assertEquals(0, tiffField0.getTag());
      assertEquals((-2143), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1475, 2683, fieldTypeFloat0, 0L, 93L, byteArray0, byteOrder0, 2683);
      int int0 = tiffField0.getSortHint();
      assertEquals(2683, int0);
      assertEquals(1475, tiffField0.getTag());
      assertEquals(93, tiffField0.getOffset());
      assertEquals(2683, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(442, 793, fieldTypeByte0, (-544L), 793, byteArray0, byteOrder0, (byte) (-67));
      String string0 = tiffField0.getDescriptionWithoutValue();
      assertEquals(793, tiffField0.getOffset());
      assertEquals((-67), tiffField0.getSortHint());
      assertEquals("442 (0x1ba: Unknown Tag): ", string0);
      assertEquals(793, tiffField0.getDirectoryType());
      assertEquals((-544), tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1475, 2683, fieldTypeFloat0, 0L, 93L, byteArray0, byteOrder0, 2683);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement((-1), (-542));
      String string0 = tiffField_OversizeValueElement0.getElementDescription(false);
      assertEquals(1475, tiffField0.getTag());
      assertEquals(2683, tiffField0.getSortHint());
      assertEquals(0L, tiffField0.getCount());
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: Float", string0);
      assertEquals(93, tiffField0.getOffset());
      assertEquals(2683, tiffField0.getDirectoryType());
      assertNotNull(string0);
  }
}
