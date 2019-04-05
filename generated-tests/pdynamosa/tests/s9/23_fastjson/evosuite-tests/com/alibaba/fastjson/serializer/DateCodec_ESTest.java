/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:21:45 GMT 2019
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
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Calendar> class0 = Calendar.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Integer integer0 = new Integer(9);
      Type[] typeArray0 = new Type[4];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[1], typeArray0[0]);
      dateCodec0.write(jSONSerializer0, integer0, class0, parameterizedTypeImpl0, 4364);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Long long0 = new Long((-2262244760619952081L));
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, long0, (Object) null, class0, (-214748364));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null, serializeConfig0);
      Long long0 = new Long((-2081L));
      Object object0 = new Object();
      jSONSerializer0.incrementIndent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, object0, (Type) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      Class<Double> class0 = Double.TYPE;
      jSONSerializer0.decrementIdent();
      dateCodec0.write(jSONSerializer0, (Object) null, jSONSerializer0, class0, 2902);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 3303);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(dateCodec0, jSONReaderScanner0, parserConfig0);
      Class<MockCalendar> class0 = MockCalendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      BeanContext beanContext0 = javaBeanSerializer0.getBeanContext(0);
      Class<?> class1 = beanContext0.getFieldClass();
      Long long0 = new Long((-614L));
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) long0, object0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("jPMPA!] 8ZB|p");
      Type[] typeArray0 = new Type[0];
      Class<Byte> class0 = Byte.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "jPMPA!] 8ZB|p", (Object) "jPMPA!] 8ZB|p");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"jPMPA!] 8ZB|p\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Calendar> class0 = Calendar.class;
      Short short0 = new Short((short)75);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("000-00-00T00:00:00.000");
      defaultJSONParser0.resolveStatus = 19;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) short0, (Object) "fastjson.parser.autoTypeAccept");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.autoTypeAccept\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("|$P>", parserConfig0);
      defaultJSONParser0.resolveStatus = (-1469330059);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "|$P>");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"|$P>\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockPrintStream mockPrintStream0 = new MockPrintStream("authority");
      Charset charset0 = Charset.defaultCharset();
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockPrintStream0, charsetEncoder0);
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, 90);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, outputStreamWriter0, serializeWriter0, class0, 90);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.io.OutputStreamWriter@64b347f8
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-1863620380), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-238), (short)319, (-3353), (short)319, (-137151586), 1036);
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializeWriter0, class0, (short)319);
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
      ParserConfig parserConfig0 = new ParserConfig();
      JSON.DEFFAULT_DATE_FORMAT = "b|`5#}\"5s#";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("jPMPA!] 8ZB|p", parserConfig0, 3599999);
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.NONE, (Object) "b|`5#}\"5s#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'b'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Calendar> class0 = Calendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("<oF~ gN");
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "0000-00-00T00:00:00");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Integer> class0 = Integer.TYPE;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "0000-00-00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("jPMPA!] 8ZB|p");
      Object object0 = new Object();
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, object0, (Object) "/Date(0000-00-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(0000-00-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Short short0 = new Short((short)12);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("r");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) short0, (Object) "000-00-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"000-00-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Double> class0 = Double.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONScanner0, (Object) "");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Short short0 = new Short((short)34);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) short0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Double> class0 = Double.TYPE;
      MockDate mockDate0 = new MockDate((-1717986916), 2, 0, 0, 0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) mockDate0);
      assertSame(object0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Double double0 = new Double(0.0);
      Date date0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) double0, (Object) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteTabAsSpecial;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (short)184, serializerFeatureArray0);
      StringBuffer stringBuffer0 = new StringBuffer();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((short)184, (short) (-693), (short)184, (-616), (-616), (-1431));
      mockGregorianCalendar0.getWeekYear();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, stringBuffer0, (Type) null, 87);
      assertEquals(22, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Double double0 = new Double(1);
      SerializeWriter serializeWriter0 = new SerializeWriter(12);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeatureArray0[1];
      serializerFeatureArray0[7] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      dateCodec0.write(jSONSerializer0, double0, serializerFeature0, (Type) null, (-1846059774));
      assertEquals(26, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteTabAsSpecial;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (short)184, serializerFeatureArray0);
      StringBuffer stringBuffer0 = new StringBuffer();
      SerializeWriter serializeWriter2 = serializeWriter1.append((CharSequence) stringBuffer0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter2);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((short)184, (short) (-693), (short)184, (-616), (-616), (-1431));
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, stringBuffer0, (Type) null, 87);
      assertEquals(13, serializeWriter2.size());
      assertEquals(13, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteTabAsSpecial;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (short)182, serializerFeatureArray0);
      StringBuffer stringBuffer0 = new StringBuffer();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((short)182, (short) (-693), (short)182, (-616), (-616), (-1431));
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, stringBuffer0, (Type) null, 87);
      assertEquals(13, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-1863620380), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockDate mockDate0 = new MockDate(3107, (-3353), 1777, (-1535), (-1863620380));
      Short short0 = new Short((short)2429);
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, mockDate0, short0, class0, 1333);
      assertEquals(74, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteTabAsSpecial;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-452574655), serializerFeatureArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2494), (-633), (-1431), 1706, (-2494), (-2028));
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Long long0 = new Long((-4131L));
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, long0, (Type) null, 882);
      assertEquals(21, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}