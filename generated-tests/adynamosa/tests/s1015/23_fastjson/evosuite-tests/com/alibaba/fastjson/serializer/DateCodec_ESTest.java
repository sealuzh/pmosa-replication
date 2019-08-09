/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 22:35:17 GMT 2019
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
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      DateCodec dateCodec0 = DateCodec.instance;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, class0, fileSystemHandling0, class0, (-1577));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : class java.lang.Object
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Byte byte0 = new Byte((byte)82);
      jSONSerializer0.decrementIdent();
      DateCodec dateCodec0 = DateCodec.instance;
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      dateCodec0.write(jSONSerializer0, (Object) null, byte0, parameterizedTypeImpl0, (-2854));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, type0, (Object) null, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yyyyMMddHHmmssSSSZ");
      Class<Byte> class0 = Byte.TYPE;
      defaultJSONParser0.resolveStatus = 52;
      Double double0 = new Double(0.0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) double0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("?dU<b1x)6");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.setResolveStatus((-1166));
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      DateCodec dateCodec0 = new DateCodec();
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) jSONSerializer0, (Object) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Short> class0 = Short.class;
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Byte byte0 = new Byte((byte)82);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "?dU<b1x)6", byte0, class0, (-2854));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"?dU<b1x)6\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("R8\u0006'N=hHD8>Q/hd", parserConfig0);
      Class<Double> class0 = Double.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, object0, defaultJSONParser0, class0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Annotation> class0 = Annotation.class;
      Double double0 = new Double((-180));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, double0, serializerFeature0, class0, (-1777));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "(>gs";
      JSON.DEFFAULT_DATE_FORMAT = "N";
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("R8\u0006'N=hHD8>Q/hd", parserConfig0);
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "N", (Object) "N");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'N'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("0000-00-00t00:00:00");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "|8aMQoVm{-@n@eM*qK", (Object) "0000-00-00t00:00:00");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-00-00");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      DateCodec dateCodec0 = new DateCodec();
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "W", (Object) "0000-00-00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      DateCodec dateCodec0 = DateCodec.instance;
      Object object0 = new Object();
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, object0, (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(dateCodec0, jSONReaderScanner0, parserConfig0);
      Class<Float> class0 = Float.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      BeanContext beanContext0 = javaBeanSerializer0.getBeanContext(0);
      Type type0 = beanContext0.getFieldType();
      Byte byte0 = new Byte((byte) (-76));
      Date date0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) "", (Object) byte0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.class;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("s FbAZZ)l[@@70");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2, 2, 2, 2);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "s FbAZZ)l[@@70", (Object) date0);
      assertSame(date1, date0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5\"Ay94co:n");
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) fileSystemHandling0, (Object) "R8\u0006'N=hHD8V>Q/hd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"R8\u0006'N=hHD8V>Q/hd\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      StringWriter stringWriter0 = new StringWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 2478, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      DateCodec dateCodec0 = DateCodec.instance;
      MockDate mockDate0 = new MockDate((byte) (-96), (short) (-1685), 1000, (byte) (-96), (short) (-210));
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate0, class0, (-1));
      assertEquals(22, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 2478, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      DateCodec dateCodec0 = DateCodec.instance;
      Double double0 = new Double(0.0);
      dateCodec0.write(jSONSerializer0, double0, serializeWriter1, (Type) null, (byte) (-18));
      assertEquals(13, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringValueAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 688, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Short short0 = new Short((short) (-4480));
      dateCodec0.write(jSONSerializer0, short0, (Object) null, class0, 125);
      assertEquals(26, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Float> class0 = Float.TYPE;
      MockDate mockDate0 = new MockDate((byte)62);
      dateCodec0.write(jSONSerializer0, mockDate0, fileSystemHandling0, class0, (byte)6);
      assertEquals(61, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.PrettyFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[4] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Calendar calendar0 = MockCalendar.getInstance();
      Class<Short> class0 = Short.TYPE;
      dateCodec0.instance.write(jSONSerializer0, calendar0, serializerFeature0, class0, (-679));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.class;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2, 2, 2, 2);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      dateCodec0.write(jSONSerializer0, date0, class0, class0, 0);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      JSONScanner jSONScanner0 = new JSONScanner("m,q!c!");
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m,q!c!", parserConfig0, 0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONScanner0, (Object) "/Date(Fx0'@+EgE%/8V?D9");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(Fx0'@+EgE%/8V?D9\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
