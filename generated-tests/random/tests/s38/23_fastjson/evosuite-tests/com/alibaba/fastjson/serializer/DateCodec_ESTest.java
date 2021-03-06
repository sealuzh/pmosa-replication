/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:18:00 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("S!;");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) jSONReaderScanner0, (Object) "S!;");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"S!;\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("(jb#0`74", parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0001-01-01T00:00:00+08:00", (Object) "0001-01-01T00:00:00+08:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      Class<Double> class0 = Double.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      ChronoLocalDate chronoLocalDate0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) "0000-00-00t00:00:00", (Object) "0000-00-00t00:00:00");
      assertNull(chronoLocalDate0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 675, 2);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) classLoader0, (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      Class<Double> class0 = Double.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00", parserConfig0, 22);
      Class<Float> class0 = Float.TYPE;
      Object object0 = dateCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) parserConfig0, "0000-00-00", 0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockDate mockDate0 = new MockDate(573, 573, 573);
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("w4>9}:?4Mh@,3)P");
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockDate0, (Object) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00", parserConfig0);
      Class<Double> class0 = Double.TYPE;
      Field field0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "0000-00-00");
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("f2n_;v$7&,.=", true);
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteMapNullValue;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeatureArray0[3];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      serializerFeatureArray0[7] = serializerFeatureArray0[2];
      serializerFeatureArray0[8] = serializerFeatureArray0[7];
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer(31186);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      String[] stringArray0 = new String[3];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      dateCodec0.write(jSONSerializer0, integer0, calendar0, class1, 125);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("f2n_;v$7&,.=", true);
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeature1;
      serializerFeatureArray0[6] = serializerFeature1;
      serializerFeatureArray0[7] = serializerFeatureArray0[1];
      serializerFeatureArray0[8] = serializerFeatureArray0[7];
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer(31186);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Calendar calendar0 = MockCalendar.getInstance(timeZone0);
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      String[] stringArray0 = new String[3];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      dateCodec0.write(jSONSerializer0, integer0, calendar0, class1, 125);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.QuoteFieldNames;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[5] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-456), (-456), (-361052750), 340, (-456));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeature0, (Type) null, (-361052750));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeatureArray0[4];
      serializerFeatureArray0[7] = serializerFeatureArray0[1];
      serializerFeatureArray0[8] = serializerFeatureArray0[7];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Locale locale0 = Locale.FRENCH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, calendar0, serializerFeatureArray0[0], class0, 3063);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockDate mockDate0 = new MockDate(573, 573, 573);
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      Class class1 = (Class)FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, mockDate0, (Object) null, class1, (-1137));
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      dateCodec0.write(jSONSerializer0, (Object) null, jSONSerializer0, (Type) null, 1658);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      Class<Locale.Category> class0 = Locale.Category.class;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockDate mockDate0 = new MockDate(1, 1089, 2, 0, (-302));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, parserConfig0, mockDate0, class0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.parser.ParserConfig@96
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
