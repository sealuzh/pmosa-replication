/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 15:43:46 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("");
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((byte) (-72), 2774, 2771);
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, jSONScanner0, mockGregorianCalendar0, class0, 0);
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
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Short> class0 = Short.class;
      Class<Long> class1 = Long.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class1);
      Class<?> class2 = javaBeanSerializer0.getType();
      Type type0 = FieldInfo.getFieldType(class0, class0, class2);
      Calendar calendar0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) type0, (Object) "0000-00-00");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<String> class0 = String.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("$r*<j{)eqYCA*`k/j");
      ZoneId zoneId0 = ZoneId.systemDefault();
      JapaneseDate japaneseDate0 = MockJapaneseDate.now(zoneId0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) japaneseDate0, (Object) "/Date(");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BEFORE_BE;
      JSONScanner jSONScanner0 = new JSONScanner("0000-00-00t00:00:00");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(thaiBuddhistEra0, jSONScanner0, parserConfig0);
      Byte byte0 = new Byte((byte) (-119));
      Byte byte1 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) byte0, (Object) "0000-00-00t00:00:00");
      assertNull(byte1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Calendar> class0 = Calendar.class;
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("new Date(", parserConfig0, (-1150));
      Float float0 = new Float((double) (-1150));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) float0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<String> class0 = String.class;
      JSONScanner jSONScanner0 = new JSONScanner("0000-00-00t00:00:00");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Object object0 = dateCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0, "t^NBeT}9xl+dO:-", 0);
      Date date0 = dateCodec0.instance.cast(defaultJSONParser0, (Type) class0, (Object) jSONScanner0, object0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[4] = serializerFeature1;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = Float.valueOf(0.0F);
      Locale locale0 = Locale.FRANCE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, mockGregorianCalendar0, (Type) null, (-1672856791));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      File file0 = MockFile.createTempFile("V7!)p{lXVqBIK", "V7!)p{lXVqBIK");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, (-4376), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      MockDate mockDate0 = new MockDate(1003, 45, 45, 45, (-1600), (-1887589357));
      Class<Calendar> class0 = Calendar.class;
      Class<Short> class1 = Short.class;
      FieldInfo fieldInfo0 = new FieldInfo("GMT", class1, class1, class0, (Field) null, (-4376), (-802), (-32));
      dateCodec0.write(jSONSerializer0, mockDate0, jSONSerializer0, fieldInfo0.fieldClass, 45);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, (Object) null, object0, (Type) null, 22);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Short short0 = new Short((short) (-202));
      Class<Integer> class0 = Integer.TYPE;
      dateCodec0.write(jSONSerializer0, short0, short0, class0, 1061);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}