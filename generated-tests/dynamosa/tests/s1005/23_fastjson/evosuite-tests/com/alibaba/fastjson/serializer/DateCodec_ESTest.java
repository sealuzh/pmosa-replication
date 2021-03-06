/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 05:03:37 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.HijrahDate;
import java.time.chrono.IsoChronology;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0, false);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockPrintWriter0, (Object) null, (Type) null, 424);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : org.evosuite.runtime.mock.java.io.MockPrintWriter@1d0d22ba
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1986902550), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.incrementIndent();
      Locale locale0 = Locale.UK;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, object0, (Type) null, (-1972170445));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      MockFileWriter mockFileWriter0 = new MockFileWriter("d2~S(}[a");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteSlashAsSpecial;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 8233, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.decrementIdent();
      Short short0 = new Short((short)26);
      dateCodec0.write(jSONSerializer0, short0, serializerFeature0, class0, (-2817));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Byte byte0 = new Byte((byte)34);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) byte0, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[7];
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 2);
      Type[] typeArray0 = new Type[4];
      Class<Long> class0 = Long.TYPE;
      Class<MockCalendar> class1 = MockCalendar.class;
      Type type0 = FieldInfo.getFieldType(class1, typeArray0[0], class1);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, type0, class0);
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      HijrahDate hijrahDate0 = MockHijrahDate.from(localDate0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) hijrahDate0, (Object) "0000-00-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[6];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 2);
      defaultJSONParser0.resolveStatus = 2;
      Class<MockCalendar> class0 = MockCalendar.class;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("66YO$xVhWx'SVa|C");
      Class<Short> class0 = Short.TYPE;
      defaultJSONParser0.setResolveStatus((-1437165718));
      Locale locale0 = Locale.CANADA;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) locale0, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "eDVA", jSONSerializer0, class0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"eDVA\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, class0, (-425));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1485), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long((-1080L));
      JSON.DEFFAULT_DATE_FORMAT = "/Date(66YO$xVhWx'SVa|C";
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, serializeWriter0, (Type) null, (-1485));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 't'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 739, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long(4147696707147271408L);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, serializeWriter0, (Type) null, 739);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) "66YO$xVhWx'SVa|C", (Object) "66YO$xVhWx'SVa|C");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "com.alibaba.fastjson.serializer.DateCodec";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.serializer.DateCodec");
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "com.alibaba.fastjson.serializer.DateCodec");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'c'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00t00:00:00", (Object) "/Date(66YO$xVhWx'SVa|C");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(66YO$xVhWx'SVa|C\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Class<Short> class0 = Short.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "66YO$xVhWn'SVa|C", (Object) "0001-01-01T00:00:00+08:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("eADe<");
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "eADe<", (Object) "/Date(hj6&pxH6P%Y!$x]");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(hj6&pxH6P%Y!$x]\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      Class<Short> class0 = Short.TYPE;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00t00:00:00", (Object) "0000-00-00t00:00:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("J<S$p\"'`Hb/Z~/&\u0005");
      Class<Short> class0 = Short.TYPE;
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "J<S$p\"'`Hb/Z~/&\u0005", (Object) defaultJSONParser0.resolveStatus);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockDate mockDate0 = new MockDate(655701488918567152L);
      Object object0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) null, (Object) mockDate0);
      assertSame(object0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00", parserConfig0);
      String string0 = dateCodec0.instance.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0.resolveStatus, (Object) "0000-00-00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.IgnoreNonFieldGetter;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 739, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate(154, (byte)1, 1432, (-3326), (-3326));
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, (Type) null, (-1959));
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockDate mockDate0 = new MockDate(14, 14, 31186, 31186, 2586, (-2014774587));
      dateCodec0.write(jSONSerializer0, mockDate0, jSONSerializer0, class0, 14);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1485), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long((-1080L));
      dateCodec0.write(jSONSerializer0, long0, serializeWriter0, (Type) null, (-1485));
      assertEquals((-1), serializeWriter0.getMaxBufSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 739, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long(0L);
      dateCodec0.write(jSONSerializer0, long0, serializeWriter0, (Type) null, 739);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      Class class1 = (Class)FieldInfo.getFieldType(class0, class0, class0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Type[] typeArray0 = new Type[24];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[7], typeArray0[7]);
      dateCodec0.write(jSONSerializer0, (Object) null, class1, parameterizedTypeImpl0, 677);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate((-1556753442), (-1), 99999999, (-1), 0, 99999999);
      SerializeConfig serializeConfig0 = new SerializeConfig(1063, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      dateCodec0.write(jSONSerializer0, mockDate0, serializeConfig0, class0, 0);
      assertTrue(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
