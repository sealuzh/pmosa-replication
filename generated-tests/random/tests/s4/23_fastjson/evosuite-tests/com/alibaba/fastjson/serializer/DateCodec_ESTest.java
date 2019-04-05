/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:55:52 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.io.BufferedWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.MinguoEra;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("T");
      Class<MinguoEra> class0 = MinguoEra.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) defaultJSONParser0, (Object) "Path deserialize erorr");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Path deserialize erorr\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSON.DEFFAULT_DATE_FORMAT = "GMT";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("GMT");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "GMT", (Object) "GMT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("GMT");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "GMT", (Object) "GMT");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"GMT\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("%=2\"f7#r!qrr", parserConfig0, (-5309));
      Double double0 = new Double(2);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) double0, (Object) parserConfig0);
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
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("85hzp8Mb|228", parserConfig0, 15);
      Class<Float> class0 = Float.TYPE;
      Object object0 = dateCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
      Object object1 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 2);
      Class<Integer> class0 = Integer.class;
      Class<String> class1 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("sh7", class0, class1, class1, (Field) null, (-37), (-37), 0);
      MockDate mockDate0 = new MockDate(0, 2, 2);
      String string0 = dateCodec0.instance.deserialze(defaultJSONParser0, (Type) fieldInfo0.fieldClass, (Object) mockDate0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 2);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) fileSystemHandling0, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.DisableCircularReferenceDetect;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature2 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[5] = serializerFeature2;
      serializerFeatureArray0[6] = serializerFeature2;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short) (-1889));
      dateCodec0.write(jSONSerializer0, short0, serializerFeatureArray0[1], (Type) null, 2109);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature1;
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-362442487), 2692, 2692, 0, (-362442487), 1856);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, date0, (Object) null, class0, 2692);
      assertEquals(25, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short) (-1889));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, short0, serializerFeatureArray0[5], (Type) null, 2095);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(serializeWriter0, 28);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.BrowserSecure;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(bufferedWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1338));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRANCE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Class<Byte> class0 = Byte.class;
      String[] stringArray0 = new String[3];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeatureArray0[0], class1, (-1338));
      assertEquals(21, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeatureArray0[4];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-362442487), 2692, 2692, 0, (-362442487), 1856);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, date0, (Object) null, class0, 2692);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.IgnoreErrorGetter;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeatureArray0[4];
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float(1.0);
      Class<Integer> class0 = Integer.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, float0, class0, 1);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-1338));
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.FRANCE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Class<Byte> class0 = Byte.class;
      String[] stringArray0 = new String[3];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeatureArray0[0], class1, (-1338));
      assertTrue(mockGregorianCalendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}