/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 23:14:45 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.MinguoDate;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      Float float0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(20);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      byte[] byteArray0 = new byte[9];
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeWriter0, byteArray0[0], class0, 20);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("0001-01-01T00:00:00+08:00");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Float float0 = new Float(0.0F);
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) float0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("moduleversion");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "/Date(^E2OO* ~{ES<r2[4`");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(^E2OO* ~{ES<r2[4`\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "zQ";
      JSON.DEFFAULT_DATE_FORMAT = "'^\"I!e!c`IE)";
      char[] charArray0 = new char[2];
      JSONScanner jSONScanner0 = new JSONScanner(charArray0, 2);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "'^\"I!e!c`IE)", (Object) "'^\"I!e!c`IE)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unterminated quote
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("com.alibaba.fastjson.serializer.DateCodec");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Double double0 = new Double((-2));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) double0, (Object) jSONScanner0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("YUJDA~p)?XsO");
      Class<Double> class0 = Double.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Byte byte0 = new Byte((byte)12);
      Object object0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) type0, (Object) byte0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(2);
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      MinguoDate minguoDate0 = MockMinguoDate.now(clock0);
      Double double0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) minguoDate0, (Object) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Float float0 = new Float((float) 12);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(")w WLW6A/EE", parserConfig0, 12);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) float0, (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.MapSortField;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1496464632), (-1496464632), (-1496464632), (-1496464632), 48);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, ", actual ", (Type) null, 12);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.MapSortField;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1496464632), (-1496464632), (-1496464632), (-1496464632), 48);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      Class<MockGregorianCalendar> class1 = MockGregorianCalendar.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, ", actual ", class2, 12);
      assertEquals(1, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.QuoteFieldNames;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(12, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Double double0 = Double.valueOf(0.0);
      Float float0 = new Float((float) 12);
      dateCodec0.write(jSONSerializer0, double0, float0, (Type) null, 0);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 12);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockDate mockDate0 = new MockDate((-765), 637, 12);
      Class<Calendar> class0 = Calendar.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, mockDate0, jSONSerializer0, type0, 637);
      assertEquals(3, serializeWriter0.size());
      assertEquals("-24673334400", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(209, 0, 14, 14, 984, 984);
      dateCodec0.write(jSONSerializer0, (Object) null, mockGregorianCalendar0, (Type) null, 2743);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
