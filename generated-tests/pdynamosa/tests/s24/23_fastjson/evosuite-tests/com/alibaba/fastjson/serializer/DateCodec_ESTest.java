/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:04:17 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.PipedWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter(1);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = Double.valueOf("3");
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, (Type) null);
      dateCodec0.write(jSONSerializer0, double0, serializeWriter0, parameterizedTypeImpl0, 1);
      assertEquals(1, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Double> class0 = Double.class;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, classLoader0, jSONSerializer0, class0, 12);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : sun.misc.Launcher$AppClassLoader@3d4eac69
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      Integer integer0 = new Integer(1236);
      jSONSerializer0.incrementIndent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, class0, integer0, class0, 2127);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : short
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      jSONSerializer0.decrementIdent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(9, (-2054154035), (-2054154035), (-2157), (-2157));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      dateCodec0.write(jSONSerializer0, (Object) null, date0, class0, (-2061774062));
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = new Double(Double.NaN);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) double0, (Object) classLoader0);
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
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1567);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, object0, (Object) defaultJSONParser0);
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
      MockDate mockDate0 = new MockDate((-588L));
      MockCalendar mockCalendar0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) mockDate0, (Object) null);
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Type[] typeArray0 = new Type[1];
      Class<Short> class0 = Short.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], class0);
      Short short0 = dateCodec0.instance.cast((DefaultJSONParser) null, (Type) parameterizedTypeImpl0, (Object) class0, (Object) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("ilegahlh re");
      Class<Float> class0 = Float.TYPE;
      defaultJSONParser0.resolveStatus = 516;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "fastjson.parser.deny");
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
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("O|e&\"2Ek|gyde!");
      defaultJSONParser0.resolveStatus = (-333);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "O|e&\"2Ek|gyde!", (Object) "O|e&\"2Ek|gyde!");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"O|e&\"2Ek|gyde!\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 2);
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
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      jSONSerializer0.config(serializerFeature0, true);
      Float float0 = new Float(1.0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, jSONSerializer0, class0, (-359));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) "(I)Ljava/lang/Integer;", (Object) "GMT");
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
      Class<Short> class0 = Short.TYPE;
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(",~gzF", parserConfig0, (-363));
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00t00:00:00", (Object) "0000-00-00t00:00:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Integer> class0 = Integer.TYPE;
      MockDate mockDate0 = new MockDate(1, 0, 1);
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockDate0, (Object) "0000-00-00");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Oe&\"2Ek|gyde!");
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "Oe&\"2Ek|gyde!", (Object) "/Date(XVs25=)/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"XVs25=\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("(H%LyE(2F:P67S<", parserConfig0, 2);
      Class<Field> class0 = Field.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, (Map<String, String>) null);
      Class<?> class1 = javaBeanSerializer0.getType();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) parserConfig0, (Object) "/Date(,w$M3!?qy'P~P");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(,w$M3!?qy'P~P\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "0000-00-0T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-0T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(",~gzF", parserConfig0, (-363));
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[4];
      JSONScanner jSONScanner0 = new JSONScanner(charArray0, 4);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Class<Calendar> class0 = Calendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      BeanContext beanContext0 = javaBeanSerializer0.getBeanContext(1);
      Method method0 = beanContext0.getMethod();
      Class<?> class1 = method0.getReturnType();
      Short short0 = Short.valueOf((short) (-919));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) beanContext0, (Object) short0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m^*>:|9usM", parserConfig0);
      Class<Integer> class0 = Integer.class;
      MockDate mockDate0 = new MockDate();
      Locale locale0 = new Locale("fastjson.parser.deny", "fastjson.parser.autoTypeSupport", "fastjson.parser.autoTypeAccept");
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) locale0, (Object) mockDate0);
      assertSame(mockDate0, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      Class<Double> class0 = Double.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("('';i|d4W5)H", parserConfig0, (-815));
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) null);
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01t00:00:00+08:00", parserConfig0, 0);
      Class<Byte> class0 = Byte.TYPE;
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "0001-01-01t00:00:00+08:00");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      jSONSerializer0.config(serializerFeature0, true);
      Double double0 = new Double(0.0);
      dateCodec0.write(jSONSerializer0, double0, "'jY9", class0, (-359));
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      Float float0 = new Float((double) 2);
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeatureArray0[2];
      SerializerFeature serializerFeature1 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[7] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      dateCodec0.write(jSONSerializer0, float0, serializerFeatureArray0[2], class0, (-379));
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      jSONSerializer0.config(serializerFeature0, true);
      MockDate mockDate0 = new MockDate((-856), (-856), (-1392), (-1534), (-856), (-1534));
      dateCodec0.write(jSONSerializer0, mockDate0, "6UnKpD,O2a;`/[", class0, (-349));
      assertEquals("Fri Sep 04 11:18:26 GMT 968", mockDate0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float((double) 0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":00");
      TimeZone timeZone0 = jSONReaderScanner0.getTimeZone();
      Locale locale0 = Locale.KOREAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Class<Float> class0 = Float.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, float0, mockGregorianCalendar0, type0, 0);
      assertEquals(1, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      DateFormat dateFormat0 = MockDateFormat.getDateInstance();
      jSONSerializer0.setDateFormat(dateFormat0);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      jSONSerializer0.config(serializerFeature0, true);
      Double double0 = new Double((-349));
      dateCodec0.write(jSONSerializer0, double0, class0, class0, (-349));
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      jSONSerializer0.config(serializerFeature0, true);
      Double double0 = new Double((-349));
      dateCodec0.write(jSONSerializer0, double0, class0, class0, (-349));
      assertEquals(1041, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      dateCodec0.write(jSONSerializer0, (Object) null, aSMDeserializerFactory0, (Type) null, 1648);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}