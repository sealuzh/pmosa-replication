/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:51:07 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.BufferedWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Object object0 = new Object();
      Class<Short> class0 = Short.class;
      String[] stringArray0 = new String[4];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      Class<?> class1 = simplePropertyPreFilter0.getClazz();
      // Undeclared exception!
      try { 
        dateCodec0.instance.write((JSONSerializer) null, object0, (Object) null, class1, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("uR%K0CH`DV7G|u9xkuL");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "uR%K0CH`DV7G|u9xkuL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"uR%K0CH`DV7G|u9xkuL\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("scanFieldFloat");
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) defaultJSONParser0);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("l");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Date> class0 = Date.class;
      Class<MockCalendar> class1 = MockCalendar.class;
      Class<Long> class2 = Long.class;
      FieldInfo fieldInfo0 = new FieldInfo("l", class1, class2, class0, (Field) null, 0, 0, (-2061774062));
      BeanContext beanContext0 = new BeanContext(class0, fieldInfo0);
      Type type0 = beanContext0.getFieldType();
      Long long0 = new Long(923L);
      Object object0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) defaultJSONParser0, (Object) long0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("*.b*mRv2A3+DXD1", 2);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("*.b*mRv2A3+DXD1", jSONReaderScanner0, parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "*.b*mRv2A3+DXD1", (Object) "0000-00-00");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("*.b*mRv2A3+DXD1", 2);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("*.b*mRv2A3+DXD1", jSONReaderScanner0, parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Byte byte0 = new Byte((byte)91);
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) byte0, (Object) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Short short0 = new Short((short) (-17906));
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("E_X~sk BuxhO=^7");
      TimeZone timeZone0 = jSONReaderScanner0.getTimeZone();
      Date date0 = TypeUtils.castToDate(short0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("_asm_flag_");
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) timeZone0, (Object) date0);
      assertSame(date0, object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte)32);
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, byte0, serializerFeatureArray0[1], class0, 22);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte)32);
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, byte0, serializerFeatureArray0[2], class0, 22);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("unclosed string : ");
      BufferedWriter bufferedWriter0 = new BufferedWriter(mockPrintWriter0);
      SerializeWriter serializeWriter0 = new SerializeWriter(bufferedWriter0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      MockDate mockDate0 = new MockDate();
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.instance.write(jSONSerializer0, mockDate0, mockDate0, class0, (-1475161935));
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Long> class0 = Long.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, class0, (-1189));
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Short short0 = new Short((short) (-17906));
      Date date0 = TypeUtils.castToDate(short0);
      SerializeWriter serializeWriter0 = new SerializeWriter(131072);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      dateCodec0.write(jSONSerializer0, short0, date0, (Type) null, (-2310));
      assertEquals(6, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockFile mockFile0 = new MockFile("WriteNonStringKeyAsString", "WriteNonStringKeyAsString");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = new Double((-2364987994247679115L));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, double0, serializerFeature0, (Type) null, (-2046));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}