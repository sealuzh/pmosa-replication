/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 02:48:30 GMT 2019
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
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
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
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate();
      Float float0 = new Float((float) 0);
      dateCodec0.write(jSONSerializer0, mockDate0, float0, class0, 0);
      assertEquals(72, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Period period0 = Period.ofWeeks(0);
      IsoChronology isoChronology0 = period0.getChronology();
      SerializeWriter serializeWriter0 = new SerializeWriter(9);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, typeArray0[7]);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, isoChronology0, period0, parameterizedTypeImpl0, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : ISO
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Annotation> class0 = Annotation.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "", object0, class0, 0);
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
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer((-2806));
      jSONSerializer0.decrementIdent();
      Class<Double> class0 = Double.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      dateCodec0.write(jSONSerializer0, integer0, integer0, class0, (-2806));
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      String string0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) aSMDeserializerFactory0);
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(" K}s'/e}/l`?bxAbFj", parserConfig0);
      LocalDate localDate0 = MockLocalDate.ofYearDay(92, 1);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) localDate0, (Object) " K}s'/e}/l`?bxAbFj");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \" K}s'/e}/l`?bxAbFj\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("|:U=vQL:i|^]", parserConfig0);
      Class<Double> class0 = Double.TYPE;
      defaultJSONParser0.resolveStatus = 2010;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "Z$w.:po`#6idn|c}]L#");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Z$w.:po`#6idn|c}]L#\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("|2:U=vQL:i|S^]", parserConfig0);
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      defaultJSONParser0.setResolveStatus((-1956));
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) class1, (Object) "|2:U=vQL:i|S^]");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"|2:U=vQL:i|S^]\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, (Type) null, (-193998641));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<MockCalendar> class0 = MockCalendar.class;
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, ",ocalVariableTypeTablW", class0, class0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \",ocalVariableTypeTablW\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 83);
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
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 8233, serializerFeatureArray0);
      serializeWriter1.count = 8233;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Integer integer0 = new Integer(8233);
      Class<Double> class0 = Double.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, integer0, integer0, class0, 8233);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-711), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Integer integer0 = new Integer((-711));
      Class<Double> class0 = Double.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "foU$>L<]-dPC";
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, integer0, integer0, class0, (-711));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'f'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) null, (Object) "6fp+pD=/9m");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("(Ljava/lan/reflmct/Type;Ljava/lang/ObjPct;)9", parserConfig0);
      Class<Calendar> class0 = Calendar.class;
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<MockCalendar> class0 = MockCalendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00");
      DateCodec dateCodec0 = DateCodec.instance;
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00T00:00:00");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      DateCodec dateCodec0 = new DateCodec();
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0000-00-00", (Object) "0000-00-00");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(" ");
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "/Date(create instance error", (Object) "/Date(create instance error");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(create instance error\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<MockCalendar> class0 = MockCalendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("LocalVariableTypeTable");
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "LocalVariableTypeTable", (Object) "LocalVariableTypeTable");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"LocalVariableTypeTable\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<MockCalendar> class0 = MockCalendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(",gcalVariableTypeTablW");
      defaultJSONParser0.setDateFormat(",gcalVariableTypeTablW");
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) ",gcalVariableTypeTablW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'g'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) class1, (Object) "");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-00-00", (-1913));
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Byte byte0 = new Byte((byte) (-101));
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, (Type) null, (Type) null);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) byte0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, (-451));
      Class<Long> class0 = Long.TYPE;
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.NONE, (Object) defaultJSONParser0.NONE);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 2531, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Double> class0 = Double.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2531, 2531, (-1894273031), (-2006844884), 224, (-2006844884));
      MockDate mockDate0 = new MockDate();
      mockGregorianCalendar0.setGregorianChange(mockDate0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockGregorianCalendar0, class0, 1188);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 8233, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Integer integer0 = new Integer(8233);
      Class<Double> class0 = Double.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      dateCodec0.write(jSONSerializer0, integer0, integer0, class0, 8233);
      assertEquals("double", class0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-1726474114), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Class<Double> class0 = Double.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1726474114), (-1726474114), (-1726474114), (-1726474114), (-1726474114));
      Short short0 = new Short((short) (-1881));
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, short0, class0, (-1726474114));
      assertEquals(13, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, (-2006844884), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Double> class0 = Double.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2006844884), (-2006844884), (-2006844884), (-2006844884), (-2006844884));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializeWriter0, class0, (-2006844884));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-2806), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Integer integer0 = new Integer((-2806));
      Class<Double> class0 = Double.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      dateCodec0.write(jSONSerializer0, integer0, integer0, class0, (-2806));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, class0, 296);
      assertEquals("float", class0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, (-2006844884), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Double> class0 = Double.TYPE;
      Short short0 = new Short((short) (-1881));
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      dateCodec0.write(jSONSerializer0, date0, short0, class0, (-718));
      assertEquals(23, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
