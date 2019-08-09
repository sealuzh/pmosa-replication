/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 01:58:56 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("A<@'B%'qPP&)a*7b8");
      Class<Integer> class0 = Integer.class;
      Short short0 = Short.valueOf((short) (-2835));
      Short short1 = new Short((short)1223);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) short0, (Object) short1);
      assertEquals("Thu Jan 01 00:00:01 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1, 2, (-1), (-1889211775));
      Type[] typeArray0 = new Type[1];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[0]);
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, mockGregorianCalendar0, parameterizedTypeImpl0, 0);
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
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      dateCodec0.write(jSONSerializer0, (Object) null, thaiBuddhistEra0, (Type) null, (short) (-1));
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Integer> class0 = Integer.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      Float float0 = new Float(0.0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, float0, class0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@35eabdfd
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.incrementIndent();
      Short short0 = new Short((short) (-1));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "|wdi%.3;h", short0, class0, (-360988911));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"|wdi%.3;h\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Short short0 = new Short((short)165);
      jSONSerializer0.decrementIdent();
      dateCodec0.write(jSONSerializer0, short0, jSONSerializer0, (Type) null, 44);
      assertEquals((-1), jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("b5$h%UX)UUTJ]_r");
      Class<Integer> class0 = Integer.class;
      Locale locale0 = Locale.JAPAN;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.of(0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) calendar0, (Object) thaiBuddhistEra0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-^\"Fnp-OHav)T.");
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-939), 5, 11, 0, (-1789));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) thaiBuddhistEra0, (Object) mockGregorianCalendar0);
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
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("GMT", parserConfig0, 656);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, (Type) null, (Type) null);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) parserConfig0, (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Calendar> class0 = Calendar.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5.2szg&,T@=");
      defaultJSONParser0.setResolveStatus(169);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3600000, 25, (-1), 2164, 124);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) dateCodec0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      Calendar calendar0 = MockCalendar.getInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[float");
      defaultJSONParser0.setResolveStatus((-336));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) calendar0, (Object) ":00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \":00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, class0, (Object) null, class0, (-653));
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
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Byte byte0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0001-01-01T00:00:00+08:00", (Object) "0001-01-01T00:00:00+08:00");
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yw*uy1)iy:mkamn!z\"|t");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "/Date(yw*uy1)iy:mkamn!z\"|t");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(yw*uy1)iy:mkamn!z\"|t\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yw*uy1)iy:mkamn!z\"|t");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "\"-9223372036854775808\"");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"-9223372036854775808\"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00");
      Class<Float> class0 = Float.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00T00:00:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("5.2szg&,T@=");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Float> class0 = Float.TYPE;
      Long long0 = new Long(1);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) long0, (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      Calendar calendar0 = MockCalendar.getInstance();
      MockDate mockDate0 = new MockDate(2);
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("+", parserConfig0, (-4041));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) calendar0, (Object) mockDate0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Byte byte0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) "5.2szg&,T@=", (Object) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      MockFile mockFile0 = new MockFile("c`ge6_nU,U-8]r4");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, (-537361821), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate((-101), (short)7, (short) (-3005), 3388, (-395990916));
      Float float0 = new Float((double) (-395990916));
      dateCodec0.write(jSONSerializer0, mockDate0, float0, class0, 3388);
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(2);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 2, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Class<Short> class0 = Short.TYPE;
      Calendar calendar0 = MockCalendar.getInstance();
      MockDate mockDate0 = new MockDate(2);
      dateCodec0.write(jSONSerializer0, calendar0, mockDate0, class0, (short) (-3005));
      assertEquals(26, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(2);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 2, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((short) (-3021), (short) (-3021), (short) (-3021));
      MockDate mockDate0 = new MockDate(2);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockDate0, class0, (short) (-3021));
      assertEquals(13, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteDefaultValue;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[5] = serializerFeature1;
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long(0);
      dateCodec0.write(jSONSerializer0, long0, dateCodec0, class0, 123);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter(2);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, (-1986267296), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1986267296), (short) (-3005), (-1986267296));
      MockDate mockDate0 = new MockDate(2);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockDate0, class0, (short) (-3005));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.class;
      MockFileWriter mockFileWriter0 = new MockFileWriter("<'B%N'qPP&)a*78", true);
      BufferedWriter bufferedWriter0 = new BufferedWriter(mockFileWriter0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.DisableCircularReferenceDetect;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(bufferedWriter0, (-667), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate(0L);
      dateCodec0.write(jSONSerializer0, mockDate0, "k?yB]Z", class0, 124);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
