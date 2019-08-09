/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 08:20:25 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.Month;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteSlashAsSpecial;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature1;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.class;
      MockDate mockDate0 = new MockDate(2992L);
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, class0, 407);
      assertEquals(63, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Double double0 = new Double(1);
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, double0, object0, (Type) null, 0);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.QuoteFieldNames;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float((-549.75006F));
      Type[] typeArray0 = new Type[9];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], typeArray0[8]);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, parameterizedTypeImpl0, 1442);
      assertEquals(4, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      Month month0 = Month.MARCH;
      Month month1 = month0.minus(319);
      Float float0 = new Float(5232.9261090159);
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, month1, float0, class0, (-2148));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Byte byte0 = new Byte((byte)88);
      jSONSerializer0.incrementIndent();
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.write(jSONSerializer0, byte0, "com.alibaba.fastjson.serializer.DateCodec", class0, 326);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Byte byte0 = new Byte((byte)88);
      jSONSerializer0.decrementIdent();
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.write(jSONSerializer0, byte0, "com.alibaba.fastjson.serializer.DateCodec", class0, 326);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      ParseContext parseContext0 = defaultJSONParser0.setContext((Object) dateCodec0, (Object) "");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0.TypeNameRedirect, (Object) parseContext0);
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
      Class<Byte> class0 = Byte.TYPE;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("e1o@*olb wx[,?h;l#", parserConfig0, 19);
      defaultJSONParser0.resolveStatus = 19;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "e1o@*olb wx[,?h;l#", (Object) "yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("e1o@*olb wx[,?h;l#", parserConfig0, (-4));
      defaultJSONParser0.resolveStatus = (-4);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "e1o@*olb wx[,?h;l#", (Object) "yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(319, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, javaBeanSerializer0, serializeConfig0, class0, 2935);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.serializer.JavaBeanSerializer@68
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null, serializeConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, (Object) null, class0, 3600);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.JSONSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("0001-01-01T00:00:00+08:00", 319);
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser((Object) null, jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONScanner0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00", parserConfig0);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) classLoader0, (Object) "0000-00-00T00:00:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("9PeL");
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("9PeL", jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "/Date(B1o_f!Kwn.V+}K@");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(B1o_f!Kwn.V+}K@\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("9PeL");
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      Float float0 = new Float((float) 0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(float0, jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, parserConfig0.propertyNamingStrategy);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, (Type) null, javaBeanInfo0.clazz);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) class0, (Object) "9PeL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"9PeL\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("9PeL");
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("9PeL", jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00", parserConfig0);
      Object object0 = new Object();
      Byte byte0 = new Byte((byte)22);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, object0, (Object) byte0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.class;
      Month month0 = Month.JULY;
      MockDate mockDate0 = new MockDate(2992L);
      Date date0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) month0, (Object) mockDate0);
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("EwPRvH3+my.[Adaxw");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Field> class0 = Field.class;
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.NONE, (Object) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      PipedReader pipedReader0 = new PipedReader();
      PipedWriter pipedWriter0 = new PipedWriter(pipedReader0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.PrettyFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature1;
      serializerFeatureArray0[7] = serializerFeatureArray0[4];
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, 22, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float((-2267.491480142238));
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, float0, float0, class0, 22);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      SerializerFeature serializerFeature1 = SerializerFeature.UseSingleQuotes;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature1;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 2212, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float(Double.NaN);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature1, class0, 45);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 2212, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float(Double.NaN);
      dateCodec0.write(jSONSerializer0, float0, serializerFeature0, class0, 45);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("9PeL");
      Class<Annotation> class0 = Annotation.class;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.QuoteFieldNames;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[7] = serializerFeature1;
      serializerFeatureArray0[8] = serializerFeatureArray0[3];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONScanner0.matchStat, jSONScanner0, class0, (-2543));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("9PeL");
      Class<Annotation> class0 = Annotation.class;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.QuoteFieldNames;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeature1;
      serializerFeatureArray0[7] = serializerFeatureArray0[0];
      serializerFeatureArray0[8] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      dateCodec0.write(jSONSerializer0, jSONScanner0.matchStat, jSONScanner0, class0, (-2543));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(319, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Class<MockGregorianCalendar> class1 = MockGregorianCalendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class1);
      dateCodec0.write(jSONSerializer0, (Object) null, javaBeanSerializer0, class0, 319);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}