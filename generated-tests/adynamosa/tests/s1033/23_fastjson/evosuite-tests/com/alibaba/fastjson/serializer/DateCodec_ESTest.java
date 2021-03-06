/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 04:53:34 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.ByteArrayOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringKeyAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[3] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Double double0 = new Double(1.0);
      MockDate mockDate0 = new MockDate(0, (byte)51, 1, 0, 2, (byte)51);
      dateCodec0.write(jSONSerializer0, mockDate0, double0, class0, (-173));
      assertEquals(73, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(999999999);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringValueAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeatureArray0[4];
      serializerFeatureArray0[6] = serializerFeature0;
      serializerFeatureArray0[7] = serializerFeatureArray0[2];
      serializerFeatureArray0[8] = serializerFeatureArray0[3];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 999999999, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      dateCodec0.write(jSONSerializer0, (Object) null, serializerFeatureArray0[7], (Type) null, 0);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1162), (-2981), 409, (-1992499875), (-1992499875), 1290);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Type[] typeArray0 = new Type[4];
      Class<Double> class0 = Double.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], class0);
      dateCodec0.write(jSONSerializer0, date0, jSONSerializer0, parameterizedTypeImpl0, (-1803672094));
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(114);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Object object0 = new Object();
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, serializeWriter0, class0, 199);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@42cb95e7
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      Long long0 = new Long(0);
      dateCodec0.write(jSONSerializer0, long0, "0000-00-00", class0, (-831894194));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockDate mockDate0 = new MockDate(0, (-931), 1);
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.decrementIdent();
      dateCodec0.write(jSONSerializer0, (Object) null, mockDate0, (Type) null, (-551));
      assertEquals("Sat Jun 01 00:00:00 GMT 1822", mockDate0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("k", parserConfig0, 44);
      Class<Object> class0 = Object.class;
      Class<Short> class1 = Short.class;
      FieldInfo fieldInfo0 = new FieldInfo("fastjson.parser.autoTypeSupport", class1, class0, class0, (Field) null, 19, (-1859492155), (-595));
      HijrahDate hijrahDate0 = MockHijrahDate.now();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, fieldInfo0.fieldType, (Object) defaultJSONParser0.NeedToResolve, (Object) hijrahDate0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(">Nna~CG^.=sx");
      Type[] typeArray0 = new Type[7];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], typeArray0[5]);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) typeArray0[5], (Object) typeArray0[1]);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      String string0 = dateCodec0.instance.cast((DefaultJSONParser) null, (Type) class1, (Object) serializerFeature0, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("vm5d", parserConfig0, 11);
      defaultJSONParser0.resolveStatus = 198;
      Class<MockCalendar> class0 = MockCalendar.class;
      Class<Object> class1 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("val", class1, class1, class0, (Field) null, 11, 1, 0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) fieldInfo0.fieldClass, (Object) "vm5d", (Object) "j %v9&|*Z8O");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"j %v9&|*Z8O\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00.000");
      defaultJSONParser0.resolveStatus = (-1977863589);
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "0000-00-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(1583, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("1Yd");
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory((ClassLoader) null);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONReaderScanner0, aSMDeserializerFactory0, class0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.parser.JSONReaderScanner@66
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, (-3906));
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
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 13, (-1859492155));
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Float> class0 = Float.TYPE;
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.resolveStatus, (Object) "0001-01-01t00:00:00+08:00");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("7_a|t^L'SJ!zXR]\"");
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "/Date(00000-00P0:0:A00", (Object) "/Date(00000-00P0:0:A00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(00000-00P0:0:A00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00");
      Class<Short> class0 = Short.TYPE;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) ">Nna~CG^.=sx", (Object) "0000-00-00T00:00:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("g~`yR}BC}*b!!");
      TimeZone timeZone0 = jSONReaderScanner0.getTimeZone();
      Locale locale0 = new Locale("");
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory((ClassLoader) null);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0.classLoader);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) calendar0, (Object) "");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00.000");
      Class<Short> class0 = Short.TYPE;
      Object object0 = dateCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) "0000-00-00T00:00:00.000");
      Object object1 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "R)O:}*K0R*<", object0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object1.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Object object0 = new Object();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-00-00T00:00:00.000");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(object0, jSONReaderScanner0, parserConfig0);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) classLoader0, (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Short> class0 = Short.TYPE;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[1] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 1705, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(1705);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte) (-126));
      dateCodec0.write(jSONSerializer0, byte0, (Object) null, (Type) null, (-1152));
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, 45, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Double double0 = new Double(0.0);
      dateCodec0.write(jSONSerializer0, double0, ")/", (Type) null, 45);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.BrowserSecure;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature1;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte) (-89));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, byte0, "0000-00-00", (Type) null, 117);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, (-151), serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Double double0 = new Double(0.0);
      dateCodec0.write(jSONSerializer0, double0, "", (Type) null, (-151));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
