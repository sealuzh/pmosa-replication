/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 06:42:26 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.HijrahDate;
import java.time.chrono.IsoChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      Class<?> class1 = javaBeanSerializer0.getType();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("UUb.1}OV^I", parserConfig0, 13);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Float float0 = new Float(1.0F);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, defaultJSONParser0, float0, class1, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.parser.DefaultJSONParser@5
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Type[] typeArray0 = new Type[3];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], typeArray0[2]);
      dateCodec0.write(jSONSerializer0, typeArray0[0], parameterizedTypeImpl0, parameterizedTypeImpl0, 38);
      assertEquals(3, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null);
      SerializeConfig serializeConfig0 = new SerializeConfig(114, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Double> class0 = Double.TYPE;
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, localDate0, jSONSerializer0, class0, (-468));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 2014-02-14
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Locale> class0 = Locale.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      Object object0 = new Object();
      jSONSerializer0.incrementIndent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeWriter0, object0, class1, 2);
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
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockDate mockDate0 = new MockDate();
      Locale locale0 = Locale.US;
      jSONSerializer0.decrementIdent();
      dateCodec0.write(jSONSerializer0, mockDate0, locale0, (Type) null, (-1009));
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", mockDate0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("A(>,");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      HijrahDate hijrahDate0 = MockHijrahDate.now();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "A(>,", (Object) hijrahDate0);
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
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(114, false);
      Class<Double> class0 = Double.TYPE;
      JSONScanner jSONScanner0 = new JSONScanner("9e/*(>3+=~f_a7;!");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      Byte byte0 = new Byte((byte)10);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) byte0, (Object) serializeConfig0);
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
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("can not cast to char, value : ", parserConfig0);
      defaultJSONParser0.setResolveStatus(4997);
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m2IBnYI=x/}", parserConfig0);
      defaultJSONParser0.setResolveStatus((-1859915484));
      Short short0 = new Short((short)45);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) short0, (Object) "(Ljava/util/List;)V");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(Ljava/util/List;)V\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, class0, (Object) null, class0, (-3215));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : float
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, object0, class0, 20);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Locale locale0 = Locale.US;
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) locale0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("^Gr7G");
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00t00:00:00");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m2IBnYI=x/}", parserConfig0);
      ZoneId zoneId0 = ZoneId.systemDefault();
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now(zoneId0);
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) thaiBuddhistDate0, (Object) "0000-00-00");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("S9)B|K0:hE~", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "/Date(oeOErbEb");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(oeOErbEb\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("WriteEnumUsingToString");
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) locale0, (Object) "WriteEnumUsingToString");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"WriteEnumUsingToString\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("S9)B|K0:hE~", parserConfig0);
      Long long0 = new Long((-3793L));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) long0);
      assertEquals("Wed Dec 31 23:59:56 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.SkipTransientField;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m2IBnYI=x/}", parserConfig0);
      MockDate mockDate0 = new MockDate(955L);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) serializerFeature0, (Object) mockDate0);
      assertSame(mockDate0, object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Float> class0 = Float.TYPE;
      Byte byte0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) jSONSerializer0, (Object) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Locale locale0 = Locale.CHINESE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      serializerFeatureArray0[0] = serializerFeature1;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature1;
      serializerFeatureArray0[6] = serializerFeature1;
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float((float) 7);
      dateCodec0.write(jSONSerializer0, float0, mockGregorianCalendar0, (Type) null, (-2946));
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null);
      Locale locale0 = Locale.CHINESE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      serializerFeatureArray0[0] = serializerFeature1;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature1;
      serializerFeatureArray0[6] = serializerFeature1;
      serializerFeatureArray0[7] = serializerFeature1;
      serializerFeatureArray0[8] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, serializerFeatureArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1, serializeConfig0);
      Float float0 = new Float((float) 0);
      dateCodec0.write(jSONSerializer0, float0, mockGregorianCalendar0, (Type) null, (-2951));
      assertEquals(13, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      MockFileWriter mockFileWriter0 = new MockFileWriter("#dfQsB");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[5] = serializerFeature1;
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      serializerFeatureArray0[7] = serializerFeatureArray0[3];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 1, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(90, 271, (byte)63, 0, 0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, "B}mV|*+iv,Q\"|U@y1", class0, 6);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
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
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Float float0 = new Float((float) 47);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(47, 0, (-2966));
      dateCodec0.write(jSONSerializer0, float0, mockGregorianCalendar0, (Type) null, (-2966));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
