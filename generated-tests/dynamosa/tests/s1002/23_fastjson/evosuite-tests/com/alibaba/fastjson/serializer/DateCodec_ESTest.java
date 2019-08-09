/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 22:48:40 GMT 2019
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
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.format.ResolverStyle;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "OQZY]9q|H;Di;>NIc1", object0, (Type) null, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"OQZY]9q|H;Di;>NIc1\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      ResolverStyle resolverStyle0 = ResolverStyle.LENIENT;
      Long long0 = new Long(2);
      Type[] typeArray0 = new Type[2];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, (Type) null);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, resolverStyle0, long0, parameterizedTypeImpl0, (-273013145));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : LENIENT
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(2058);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, (Object) null, (Type) null, 1433);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@6e51faa1
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, class0, 558);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      ChronoField chronoField0 = ChronoField.SECOND_OF_MINUTE;
      jSONSerializer0.incrementIndent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeConfig0, chronoField0, (Type) null, 838);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.serializer.SerializeConfig@64
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      jSONSerializer0.decrementIdent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, (-273013144), (-273013144), 1, (-823));
      Integer integer0 = new Integer(417);
      dateCodec0.write(jSONSerializer0, integer0, mockGregorianCalendar0, (Type) null, 1253);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<Long> class0 = Long.TYPE;
      Period period0 = Period.ofYears(0);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) calendar0, (Object) localDate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<String> class0 = String.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, hashMap0);
      Class<?> class1 = javaBeanSerializer0.getType();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class1, (Object) javaBeanSerializer0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 8);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Long> class0 = Long.TYPE;
      Type[] typeArray0 = new Type[9];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[6], class0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) typeArray0[3], (Object) "0000-00-00T0000:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-00T0000:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-0");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      defaultJSONParser0.setResolveStatus(5);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0000-0", (Object) ":00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \":00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("@,nwh/x'ZL5A\"s|/W");
      defaultJSONParser0.setResolveStatus((-3955));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "@,nwh/x'ZL5A\"s|/W");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"@,nwh/x'ZL5A\"s|/W\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, (Object) null, jSONSerializer0, (Type) null, 17);
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
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      JSON.DEFFAULT_DATE_FORMAT = "/Date()/";
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float((float) (-1705));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, (Object) null, (Type) null, 30);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 't'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringKeyAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Locale locale0 = Locale.GERMANY;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeatureArray0[1], (Type) null, (-1712));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      serializeWriter0.count = 393216;
      SerializeConfig serializeConfig0 = new SerializeConfig(22);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Long long0 = new Long((short)19);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, "w{Xk#lkBFk$Z=nIC", (Type) null, (-1498835231));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) ":00", (Object) "new Date(");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "y(0\"Td1Qp^rWqD7@+!}";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("y(0\"Td1Qp^rWqD7@+!}");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "y(0\"Td1Qp^rWqD7@+!}", (Object) "y(0\"Td1Qp^rWqD7@+!}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<MockCalendar> class0 = MockCalendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      Class<?> class1 = javaBeanSerializer0.getType();
      Long long0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) null, (Object) "0000-00-00");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("H;Icg4D");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "/Date(");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "float overflow : ";
      char[] charArray0 = new char[11];
      JSON.DEFFAULT_DATE_FORMAT = "yyyyMMddHHmmssSSSZ";
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 9);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONReaderScanner0, (Object) "0000-00-00T0000:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-00T0000:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "", (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(":tKIn\"");
      Long long0 = new Long(0);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) ":tKIn\"", (Object) long0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("y(0\"Td1Qp^rWqD7@+!}");
      MockDate mockDate0 = new MockDate();
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) mockDate0);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("vC?0!%e", parserConfig0);
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) serializerFeature0, (Object) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01t00:00:00+08:00");
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "0001-01-01t00:00:00+08:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(22);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Short short0 = new Short((short)19);
      dateCodec0.write(jSONSerializer0, short0, serializerFeature0, (Type) null, 14);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(24);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(24, 24, 24, 24, 24);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, (Object) null, (Type) null, 24);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockDate mockDate0 = new MockDate((-1712), (-1712), (-1712), (-340), (-2013290465), (-340));
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, (Type) null, 3534);
      assertEquals(75, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      dateCodec0.write(jSONSerializer0, (Object) null, "vC?0!%e", (Type) null, (-2));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}