/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:17:59 GMT 2019
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
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(2);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Type[] typeArray0 = new Type[3];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[1], typeArray0[2]);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeConfig0, "/Date(R7/}r|[XsU", parameterizedTypeImpl0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.serializer.SerializeConfig@63
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, object0, class0, 5);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@24722038
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      Long long0 = new Long((-910L));
      Byte byte0 = new Byte((byte)0);
      Class<Long> class0 = Long.TYPE;
      dateCodec0.write(jSONSerializer0, long0, byte0, class0, (-1206));
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.decrementIdent();
      Class<Date> class0 = Date.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, type0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("kz_tcB~+'N2*%Ti");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.resolveStatus, object0);
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
      Double double0 = new Double(1.0);
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 127, 127);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(double0, jSONReaderScanner0, parserConfig0);
      Class<Float> class0 = Float.TYPE;
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) aSMDeserializerFactory0, (Object) null);
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) class0);
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
      Class<MockCalendar> class0 = MockCalendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.setResolveStatus(1154);
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      Float float0 = new Float(0.0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("ident");
      defaultJSONParser0.setResolveStatus((-1587));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) float0, (Object) "/Date(UoUp\"MT(-7R)S,?i'|");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(UoUp\"MT(-7R)S,?i'|\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Integer integer0 = new Integer(0);
      Class<Double> class0 = Double.class;
      Long long0 = new Long(132);
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, integer0, long0, class0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2034852666), (-9), 91);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("UG<b0`jSP6B=");
      Long long0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-9), (-9));
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(")riF2t$Gn1u7?*qy");
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockGregorianCalendar0, (Object) "0000-00-00");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2034852666), (-9), 91);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("UG<b0`jSP6B=");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) "0001-0101T00:00:00+000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0001-0101T00:00:00+000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-9), (-9));
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(")riF2t$Gn1u7?*qy");
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockGregorianCalendar0, (Object) "0000-00-00T00:00:00");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("kz_tcB~+'N2*%Ti");
      Type[] typeArray0 = new Type[2];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[1]);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) defaultJSONParser0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("29<#_DsFZE6c", parserConfig0);
      Short short0 = new Short((short)22);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) short0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0, 0, (-2));
      Class<Short> class0 = Short.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("z_tcB+~'N2*%Ti");
      Long long0 = new Long(0);
      Date date0 = TypeUtils.castToDate(long0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) date0);
      assertSame(date0, object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-593), ")/");
      JSON.defaultTimeZone = (TimeZone) simpleTimeZone0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, 2790, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(2790);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float(0.0F);
      Class<Float> class0 = Float.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, type0, 115);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, 2790, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(2790);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float(0.0F);
      Class<Float> class0 = Float.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, type0, 115);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(byteArrayOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.DisableCheckSpecialChar;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, 2785, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float(0.0F);
      Class<Float> class0 = Float.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, type0, 115);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(jSONSerializer0.out, 66, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(896);
      JSONSerializer jSONSerializer1 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Double double0 = new Double(0.0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer1, double0, (Object) null, class0, 896);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(jSONSerializer0.out, 66, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(896);
      JSONSerializer jSONSerializer1 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Long> class1 = Long.TYPE;
      dateCodec0.write(jSONSerializer1, date0, class1, class0, (-16547010));
      assertEquals(25, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, (Object) null, object0, (Type) null, (-3547));
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockDate mockDate0 = new MockDate(0, 0, (-28));
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-28), serializerFeatureArray0);
      Class<Integer> class0 = Integer.TYPE;
      Float float0 = new Float(0.0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      dateCodec0.instance.write(jSONSerializer0, float0, mockDate0, class0, 1);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
