/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:59:08 GMT 2019
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
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Short short0 = new Short((short)0);
      Short short1 = new Short((short)2917);
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.write(jSONSerializer0, short0, short1, class0, (short)2917);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      Class<Integer> class0 = Integer.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, class0, (-87));
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Type[] typeArray0 = new Type[3];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], typeArray0[0]);
      Byte byte0 = new Byte((byte)9);
      dateCodec0.write(jSONSerializer0, (Object) null, byte0, parameterizedTypeImpl0, 3600000);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(42, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, (Object) null, object0, (Type) null, 221);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(126, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.incrementIndent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 126, 45, (-226), 2, 126);
      Class<MockCalendar> class0 = MockCalendar.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockGregorianCalendar0, class1, 0);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(126, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 126, 45, (-226), 2, 126);
      Class<Date> class0 = Date.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      jSONSerializer0.decrementIdent();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockGregorianCalendar0, class1, 0);
      assertEquals(1, mockGregorianCalendar0.getMinimalDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("GMT");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      Long long0 = new Long(126);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(long0, jSONReaderScanner0, parserConfig0);
      ParseContext parseContext0 = defaultJSONParser0.getContext();
      Class<Float> class0 = Float.TYPE;
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) aSMDeserializerFactory0, (Object) parseContext0);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      Float float0 = new Float((double) (short)1242);
      Object object0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) float0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("HV|T&l:'AsfI");
      defaultJSONParser0.resolveStatus = 3;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "D!BE", (Object) "HV|T&l:'AsfI");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"HV|T&l:'AsfI\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Date> class0 = Date.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("G! g<]Nb", parserConfig0);
      defaultJSONParser0.setResolveStatus((-690));
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) null, (Object) null);
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.class;
      String[] stringArray0 = new String[7];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      LocalDate localDate0 = MockLocalDate.now();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, localDate0, simplePropertyPreFilter0, class0, 2143);
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
      JSON.DEFFAULT_DATE_FORMAT = "w-TgE";
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("..");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("..", jSONReaderScanner0, parserConfig0);
      Float float0 = new Float(0.75F);
      // Undeclared exception!
      try { 
        dateCodec0.instance.cast(defaultJSONParser0, (Type) null, (Object) float0, (Object) "w-TgE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Date> class0 = Date.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 2);
      ParserConfig parserConfig0 = new ParserConfig(false);
      Double double0 = new Double(0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(double0, jSONReaderScanner0, parserConfig0);
      Type type0 = FieldInfo.getFieldType(class1, class1, class1);
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) null, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("..");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("fastjson.parser.autoTypeSupport", jSONReaderScanner0, parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONReaderScanner0, (Object) "0000-00-00T00:00:00");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Long> class0 = Long.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00", (Object) "0000-00-00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Date> class0 = Date.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      char[] charArray0 = new char[25];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 126, 45);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(class1, jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "/Date(>)/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \">\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Date> class0 = Date.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      char[] charArray0 = new char[25];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 126, 45);
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(class1, jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "0000-00-0000:00:00.D00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-0000:00:00.D00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(126, false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 126, 45, (-226), 2, 126);
      Class<Date> class0 = Date.class;
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 1);
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(mockGregorianCalendar0, jSONReaderScanner0, parserConfig0);
      MockGregorianCalendar mockGregorianCalendar1 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) serializeConfig0, (Object) "");
      assertNull(mockGregorianCalendar1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, (short)2917, (-5151));
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONSerializer0, jSONReaderScanner0, parserConfig0);
      Type[] typeArray0 = new Type[3];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], typeArray0[0]);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) defaultJSONParser0, (Object) parameterizedTypeImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Short short0 = new Short((short) (-16));
      Class<Byte> class0 = Byte.TYPE;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("w-TgE", parserConfig0, 620);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "w-TgE", (Object) short0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      MockDate mockDate0 = new MockDate(1, (-682), 0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "", (Object) mockDate0);
      assertSame(mockDate0, object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(126, false);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 126, 45, (-226), 2, 126);
      Class<Date> class0 = Date.class;
      char[] charArray0 = new char[22];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 1);
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(mockGregorianCalendar0, jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) serializeConfig0, (Object) "/Date(>");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(>\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Date> class0 = Date.class;
      MockDate mockDate0 = new MockDate(478, 716, 1433, 165, 0, 0);
      dateCodec0.write(jSONSerializer0, mockDate0, (Object) null, class0, 1643);
      assertEquals("Fri Aug 09 21:00:00 GMT 2441", mockDate0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
