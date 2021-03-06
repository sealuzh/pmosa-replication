/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 11:38:28 GMT 2019
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
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import java.nio.CharBuffer;
import java.text.DateFormat;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate(189, 189, 0);
      dateCodec0.write(jSONSerializer0, mockDate0, mockGregorianCalendar0, class0, 12);
      assertEquals(72, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Type[] typeArray0 = new Type[9];
      Class<Double> class0 = Double.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      dateCodec0.write(jSONSerializer0, (Object) null, serializerFeature0, parameterizedTypeImpl0, 38);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(19);
      StringBuffer stringBuffer0 = new StringBuffer("");
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer((-879));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, charBuffer0, integer0, (Type) null, (-1177));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.incrementIndent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Integer integer0 = Integer.valueOf(0);
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, integer0, mockGregorianCalendar0, class0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.decrementIdent();
      Class<Float> class0 = Float.TYPE;
      Long long0 = new Long(2857);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeConfig0, long0, class0, (-1163308165));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.serializer.SerializeConfig@3
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      JSONScanner jSONScanner0 = new JSONScanner("0000-00-00t00:00:00", (-1105));
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00t00:00:00", object0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1126);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(mockGregorianCalendar0, jSONReaderScanner0, parserConfig0);
      Type[] typeArray0 = new Type[5];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], typeArray0[2]);
      Float float0 = new Float((double) 2);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) float0, (Object) defaultJSONParser0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Class<Long> class0 = Long.TYPE;
      defaultJSONParser0.resolveStatus = 41;
      Byte byte0 = new Byte((byte)119);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) byte0, (Object) class0);
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
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(dateCodec0, jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.setResolveStatus((-1633));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) serializeConfig0, (Object) "fastjson.parser.deny");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.deny\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, (-1962978353));
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
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSON.DEFFAULT_DATE_FORMAT = "fieldDeserializer";
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      Float float0 = new Float((double) 33);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, serializerFeature0, class0, 33);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) "@type");
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
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      JSON.DEFFAULT_DATE_FORMAT = "_Jf|xX";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("new Date(", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "_Jf|xX", (Object) "_Jf|xX");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'J'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{q4j6zdGbcoGOIaDY&)t");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "/Date(00A0-x-00t:00:00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(00A0-x-00t:00:00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Class<Float> class0 = Float.TYPE;
      Integer integer0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) mockGregorianCalendar0, (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      JSONScanner jSONScanner0 = new JSONScanner("getMetaClass");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1766), (-4020), 1417);
      Float float0 = new Float((float) (-4020));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) float0);
      assertEquals("Wed Dec 31 23:59:55 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[1];
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory((ClassLoader) null);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      Class<Float> class0 = Float.TYPE;
      MockDate mockDate0 = new MockDate(0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) aSMDeserializerFactory0, (Object) mockDate0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      Integer integer0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 5158);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(dateCodec0, jSONReaderScanner0, parserConfig0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "0000-00-00t00:00:00");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 1466, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate(2586, (-1657740210), (-369721386), (byte)30, (-1414));
      Long long0 = new Long((-1L));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockDate0, long0, class0, (-1414));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      SerializeWriter serializeWriter0 = new SerializeWriter(1466);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 1466, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockDate mockDate0 = new MockDate((byte)30, (byte)30, 1466, 1466, 1466, (byte)30);
      dateCodec0.write(jSONSerializer0, mockDate0, serializeWriter0, class0, 1466);
      assertEquals(22, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(6);
      SerializerFeature serializerFeature0 = SerializerFeature.MapSortField;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 2629, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long(0);
      dateCodec0.write(jSONSerializer0, long0, serializerFeature0, (Type) null, 2);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      SerializeWriter serializeWriter0 = new SerializeWriter(1466);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 1466, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Byte byte0 = new Byte((byte)30);
      dateCodec0.write(jSONSerializer0, byte0, serializerFeature0, class0, (byte)30);
      assertEquals(26, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Float> class0 = Float.TYPE;
      TimeZone timeZone0 = TimeZone.getTimeZone("wbHF`+_G$xSsPX");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      ChronoField chronoField0 = ChronoField.DAY_OF_YEAR;
      dateCodec0.write(jSONSerializer0, date0, chronoField0, class0, (short)5);
      assertEquals(25, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      jSONSerializer0.setDateFormat(dateFormat0);
      Float float0 = new Float((double) 33);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, class0, 33);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      Float float0 = new Float((double) 33);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, class0, 33);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      SerializeWriter serializeWriter0 = new SerializeWriter(1466);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((byte)30, (byte)30, 1466, 1466, 1466, (byte)30);
      dateCodec0.write(jSONSerializer0, mockDate0, serializeWriter0, class0, 1466);
      assertEquals(14, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Long> class0 = Long.TYPE;
      Float float0 = new Float((float) (-4020));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "getMetaClass", float0, class0, 534);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"getMetaClass\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
