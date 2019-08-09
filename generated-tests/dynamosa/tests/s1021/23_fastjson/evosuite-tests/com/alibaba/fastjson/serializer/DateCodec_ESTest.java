/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 08:20:07 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.Month;
import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("!xh");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser((Object) null, jSONScanner0, parserConfig0);
      MockDate mockDate0 = new MockDate(2, (-1315), (-2376));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) mockDate0);
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockFile mockFile0 = new MockFile("0]r0^^1I,>&", "0]r0^^1I,>&");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, false);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullStringAsEmpty;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1732581770), serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      MockDate mockDate0 = new MockDate((-1732581770), 4065, 4065, (-1732581770), 4065);
      Short short0 = new Short((short) (-160));
      dateCodec0.write(jSONSerializer0, mockDate0, short0, class0, (-1732581770));
      assertEquals(77, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("!h");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Double double0 = new Double(0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(double0, jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Type[] typeArray0 = new Type[1];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[0]);
      dateCodec0.write(jSONSerializer0, defaultJSONParser0.TypeNameRedirect, defaultJSONParser0.TypeNameRedirect, parameterizedTypeImpl0, 0);
      assertEquals("yyyy-MM-dd HH:mm:ss", defaultJSONParser0.getDateFomartPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(319, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, object0, class0, (-721));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@75de1771
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("EwPRvH3+my.[Adaxw");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Short short0 = new Short((short)13);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) short0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("BeanoArra", parserConfig0);
      Type[] typeArray0 = new Type[7];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[6], typeArray0[1]);
      Float float0 = new Float((double) 0);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) typeArray0[4], (Object) float0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("BeanoArra", parserConfig0);
      Class<Float> class0 = Float.TYPE;
      defaultJSONParser0.setResolveStatus(63);
      Clock clock0 = MockClock.systemDefaultZone();
      HijrahDate hijrahDate0 = MockHijrahDate.now(clock0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) hijrahDate0, (Object) "0000-00-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0000-00-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[I", parserConfig0);
      defaultJSONParser0.resolveStatus = (-1996);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "fastjson.parser.deny", (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, (Type) null, (-3355));
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
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(319, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "![h2", (Object) null, class0, 19);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"![h2\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, "_asm_prefix__", (Type) null, (-3932));
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
      JSON.DEFFAULT_DATE_FORMAT = "a90q@*8fmswg!c*|oc";
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      MockFileWriter mockFileWriter0 = new MockFileWriter("(C)Ljava/math/BigDecimal;", true);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 1820, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Long long0 = new Long(1820);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, mockFileWriter0, class0, 1820);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'q'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) "!xh");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSON.DEFFAULT_DATE_FORMAT = "0000-000T00:00:00.000";
      ParserConfig parserConfig0 = new ParserConfig();
      Class<Integer> class0 = Integer.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-000T00:00:00.000", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "0000-000T00:00:00.000");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      JSONScanner jSONScanner0 = new JSONScanner("4", 1820);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Month month0 = Month.MARCH;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) month0, (Object) "4");
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      JSONScanner jSONScanner0 = new JSONScanner("0001-01-01t00:00:00+08:00");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("/Date(=VI`QSuX4", jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "`chyeg[k).2m@", (Object) "0001-01-01t00:00:00+08:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("v");
      ChronoField chronoField0 = ChronoField.YEAR;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(chronoField0, jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      Month month0 = Month.MAY;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) month0, (Object) "0000-00-00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      JSONScanner jSONScanner0 = new JSONScanner("com.alibaba.fastjson.serializer.MapSerializer");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser((Object) null, jSONScanner0, parserConfig0);
      Class<Integer> class0 = Integer.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "fastjson.parser.autoTypeSupport", (Object) "0000-00-00t00:00:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("w\t{%4m|");
      Class<Integer> class0 = Integer.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("w\t{%4m|");
      Class<Integer> class0 = Integer.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "/Date(/Da;e((C)L&avx/uUiV|xate;");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(/Da;e((C)L&avx/uUiV|xate;\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      StringWriter stringWriter0 = new StringWriter(2);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, 41, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Long long0 = new Long(41);
      MockDate mockDate0 = new MockDate(123, 1, 26085, 0, (-2925), 0);
      dateCodec0.write(jSONSerializer0, mockDate0, long0, class0, 6);
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      MockFileWriter mockFileWriter0 = new MockFileWriter(">");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 1844, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = new Integer((-1000));
      dateCodec0.write(jSONSerializer0, integer0, serializerFeature0, class0, (-2210));
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Date(/Da;e((C)L&avx/uUiV|xate;)/");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 123, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = new Double(0L);
      MockDate mockDate0 = new MockDate(1844, (-1793396220), 123);
      dateCodec0.write(jSONSerializer0, double0, mockDate0, class0, 123);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockFileWriter mockFileWriter0 = new MockFileWriter("0]r0^^G1I,>&");
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullStringAsEmpty;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1732581771), serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Long long0 = new Long((-1732581771));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, mockFileWriter0, class0, (-1732581771));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      MockFileWriter mockFileWriter0 = new MockFileWriter("(C)Ljava/math/BigDecimal;", true);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 1820, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Long long0 = new Long(1820);
      dateCodec0.write(jSONSerializer0, long0, mockFileWriter0, class0, 1820);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      StringWriter stringWriter0 = new StringWriter(2);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, 41, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = new Double((-1996));
      dateCodec0.write(jSONSerializer0, double0, (Object) null, class0, 0);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      dateCodec0.write(jSONSerializer0, (Object) null, "w\t{%4m|", class0, 5);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
