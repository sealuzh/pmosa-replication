/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 03:17:39 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerialContext;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.ByteArrayOutputStream;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockInstant;
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
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, (Type) null, 0);
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
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Byte> class0 = Byte.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, parameterizedTypeImpl0, (-339));
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
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      dateCodec0.write(jSONSerializer0, date0, instant0, class0, 2);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      Object object0 = new Object();
      Long long0 = new Long((byte)98);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, long0, class0, (-206));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@42a9118d
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      jSONSerializer0.incrementIndent();
      Short short0 = new Short((short)2112);
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, short0, short0, class0, (short)2112);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      StringWriter stringWriter0 = new StringWriter(18);
      SerializeWriter serializeWriter0 = new SerializeWriter(18);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Short> class0 = Short.TYPE;
      jSONSerializer0.decrementIdent();
      Byte byte0 = new Byte((byte)19);
      dateCodec0.write(jSONSerializer0, byte0, stringWriter0, class0, 1);
      assertEquals(2, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      ParserConfig parserConfig0 = new ParserConfig(false);
      Class<Byte> class1 = Byte.TYPE;
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("oK", parserConfig0);
      Type[] typeArray0 = new Type[3];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class1);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "must D ", (Object) aSMDeserializerFactory0);
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
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0C13KMtHEEx", parserConfig0, 895);
      defaultJSONParser0.setResolveStatus(1685);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0C13KMtHEEx", (Object) "0C13KMtHEEx");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0C13KMtHEEx\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("VPZ&Y]+r2?");
      defaultJSONParser0.setResolveStatus((-860739838));
      Class<Byte> class0 = Byte.TYPE;
      ChronoField chronoField0 = ChronoField.CLOCK_HOUR_OF_AMPM;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) chronoField0, (Object) chronoField0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "VPZ&Y]+r2?", "VPZ&Y]+r2?", class0, 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"VPZ&Y]+r2?\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, parserConfig0, class0, (-1987254398));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      StringWriter stringWriter0 = new StringWriter(18);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, 18, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(18, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Short> class0 = Short.TYPE;
      JSON.DEFFAULT_DATE_FORMAT = "fastjson.parser.deny";
      Byte byte0 = new Byte((byte) (-2));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, byte0, stringWriter0, class0, (-12));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) "VPZ&Y]+r2?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<String> class0 = String.class;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0001-01-01T00:00:00+08:00", (short)2112);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser((Object) null, jSONReaderScanner0, parserConfig0);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(".GD0bJ`7CM-d')tmJ^LD");
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = new Double(1);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) double0, (Object) "/Date(TPl~w)5bj'$");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(TPl~w)5bj'$\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("VPZ&Y]+r2?");
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "VPZ&Y]+r2?", (Object) "/Date(TPl~w)5bj'$)/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"TPl~w)5bj'$\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.TypeNameRedirect, (Object) "0000-00-00");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<Byte> class0 = Byte.TYPE;
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Short short0 = new Short((short) (-778));
      Date date0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) null, (Object) short0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("M0vXY_@\"}+s\"iV.1>");
      Class<Byte> class0 = Byte.TYPE;
      Long long0 = new Long(0);
      MockDate mockDate0 = new MockDate(1, 2, 0);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) long0, (Object) mockDate0);
      assertSame(mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 2);
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, (Type) null, class0);
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) null, (Object) null);
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00");
      Class<Byte> class0 = Byte.TYPE;
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00T00:00:00");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteDefaultValue;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, false);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature0;
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 39, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Locale locale0 = new Locale("$R)ZG>Q3,RQ$g%");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeature0, class0, 19);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, (-1990000634), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Locale locale0 = new Locale(".GDbJ=7HM-d')tmJ^LD");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, ".GDbJ=7HM-d')tmJ^LD", class0, (-1990000634));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("VPZ&Y]Fr2?");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature0;
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 33, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((byte) (-79), (byte) (-79), (byte) (-79), (byte) (-79), (byte) (-79));
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeature0, class0, 33);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      StringWriter stringWriter0 = new StringWriter(18);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, 18, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      Byte byte0 = new Byte((byte) (-2));
      dateCodec0.write(jSONSerializer0, byte0, stringWriter0, class0, 18);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, (-1990000634), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Locale locale0 = new Locale(".GDbJ=7HM-d')tmJ^LD", ".GDbJ=7HM-d')tmJ^LD", ".GDbJ=7HM-d')tmJ^LD");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Class<Short> class0 = Short.TYPE;
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      SerialContext serialContext0 = jSONSerializer0.context;
      dateCodec0.write(jSONSerializer0, date0, serialContext0, class0, 1842);
      assertEquals(25, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, class0, (short)2112);
      assertEquals("float", class0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
