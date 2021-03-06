/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:43:07 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, (Object) null, class0, (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 3668);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Long> class0 = Long.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2529, 0, 19);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) "/Date(");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "writeFieldValue";
      char[] charArray0 = new char[9];
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 3);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "writeFieldValue");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'r'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      char[] charArray0 = new char[9];
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 3);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "writeFieldValue");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"writeFieldValue\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, type0, (Object) locale0, (Object) locale0);
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
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("$RKY7d6?@M");
      Class<Long> class0 = Long.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      ZoneInfo zoneInfo0 = (ZoneInfo)jSONSerializer0.timeZone;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) zoneInfo0);
      Byte byte0 = new Byte((byte) (-13));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) calendar0, (Object) byte0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      char[] charArray0 = new char[2];
      JSONScanner jSONScanner0 = new JSONScanner(charArray0, 0, (-1850532002));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(serializerFeature0, jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 22, 20, 19, 54, 62);
      Double double0 = dateCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, (Map<String, String>) null);
      Class<?> class1 = javaBeanSerializer0.getType();
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) null, (Object) "");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Byte byte0 = new Byte((byte)110);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, byte0, byte0, (Type) null, 4828);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0, charsetEncoder0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[6] = serializerFeature1;
      serializerFeatureArray0[7] = serializerFeatureArray0[2];
      serializerFeatureArray0[8] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(197, 197, 197, (-935), (-935), (-935));
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializeWriter0, (Type) null, 3678080);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockFile mockFile0 = new MockFile("clazz is null");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, (-1419594581), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      Locale locale0 = Locale.KOREAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, calendar0, locale_FilteringMode0, class0, (-1419594581));
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Long long0 = new Long(1444L);
      Class<Locale> class0 = Locale.class;
      FieldInfo fieldInfo0 = new FieldInfo("_v", class0, class0, class0, (Field) null, (-593), (-593), 3858);
      dateCodec0.write(jSONSerializer0, (Object) null, long0, fieldInfo0.fieldClass, 3858);
      assertFalse(fieldInfo0.fieldAccess);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      TimeZone timeZone0 = TimeZone.getTimeZone("val");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Class<Long> class0 = Long.TYPE;
      dateCodec0.write(jSONSerializer0, date0, (Object) null, class0, 248);
      assertEquals(1041, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
