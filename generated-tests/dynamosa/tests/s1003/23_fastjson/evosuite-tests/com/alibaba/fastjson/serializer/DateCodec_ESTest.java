/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 00:27:00 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import java.time.chrono.HijrahDate;
import java.time.chrono.ThaiBuddhistEra;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{]:`hJ,I#*}&Z", parserConfig0);
      MockDate mockDate0 = new MockDate(1219, 1, 2186, (short)130, 2, (-2054779849));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) mockDate0);
      assertEquals("Tue Dec 20 05:51:11 GMT 3059", date0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Short short0 = new Short((short)66);
      Float float0 = new Float((float) 0);
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, float0, short0, (Type) null, 0);
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
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-2005768392), serializerFeatureArray0);
      Integer integer0 = new Integer((short) (-2986));
      Class<Short> class0 = Short.TYPE;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Type[] typeArray0 = new Type[2];
      Class<Double> class1 = Double.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class1, class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeWriter0, integer0, parameterizedTypeImpl0, (-2005768392));
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
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 1384, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate(3142L);
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      dateCodec0.write(jSONSerializer0, mockDate0, thaiBuddhistEra0, class0, 1970);
      assertEquals("short", class0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      HijrahDate hijrahDate0 = MockHijrahDate.now();
      MockDate mockDate0 = new MockDate(2, 2, 2, 2, 124, 1450);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, hijrahDate0, mockDate0, (Type) null, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : Hijrah-umalqura AH 1435-04-14
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Double double0 = new Double(0.0);
      Short short0 = new Short((short)66);
      jSONSerializer0.incrementIndent();
      dateCodec0.write(jSONSerializer0, double0, short0, (Type) null, (short)66);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1474), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.decrementIdent();
      Short short0 = new Short((short)82);
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, short0, charArrayWriter0, class0, (short)82);
      assertEquals(0, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) thaiBuddhistEra0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 43);
      Type[] typeArray0 = new Type[0];
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, type0, type0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) defaultJSONParser0, (Object) type0);
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
      Class<Float> class0 = Float.TYPE;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      defaultJSONParser0.resolveStatus = 488;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "fastjson.parser.autoTypeAccept");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.autoTypeAccept\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(".lNev!jNGc");
      defaultJSONParser0.resolveStatus = (-310285970);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) ".lNev!jNGc", (Object) ".lNev!jNGc");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \".lNev!jNGc\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "FInUpF/", jSONSerializer0, class0, 1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"FInUpF/\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 44);
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
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      JSON.DEFFAULT_DATE_FORMAT = "can not cast to int, value : ";
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1474), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short)82);
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, short0, charArrayWriter0, class0, (short)82);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'c'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-2005768392), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short) (-2980));
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, short0, charArrayWriter0, class0, (short) (-2980));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1434), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      serializeWriter0.count = (-1434);
      Short short0 = new Short((short)85);
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, short0, charArrayWriter0, class0, (short)85);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1434
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) class0, (Object) "bC2uuaGtd8?wH/#");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "]etter Qt foun$, cls9 ";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("]etter Qt foun$, cls9 ");
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "]etter Qt foun$, cls9 ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'e'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00", parserConfig0);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00t00:00:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("pNZNYht");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "pNZNYht", (Object) "/Date(001-01-01t00:00:00+08:00)/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"001-01-01t00:00:00+08:00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("]etter Qt foun$, cls9 ");
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "]etter Qt foun$, cls9 ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"]etter Qt foun$, cls9 \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Float> class0 = Float.TYPE;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "/Date(001-01-01t00:00:00+08:00", (Object) "/Date(001-01-01t00:00:00+08:00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(001-01-01t00:00:00+08:00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) thaiBuddhistEra0, (Object) jSONSerializer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("9u{G]{ny");
      Double double0 = new Double((short) (-3005));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) double0);
      assertEquals("Wed Dec 31 23:59:56 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Float float0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) jSONSerializer0, (Object) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 1384, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate(1384, 1384, 1384, 1384, 1384);
      dateCodec0.write(jSONSerializer0, mockDate0, charArrayWriter0, class0, (-525));
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 1384, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      Float float0 = new Float((float) (short) (-3000));
      dateCodec0.write(jSONSerializer0, float0, "0000-00-00", class0, (short) (-3000));
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 2285, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2285, 2285, 2285, 2285, 2285);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, charArrayWriter0, class0, 2285);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 2275, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short)82);
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, short0, charArrayWriter0, class0, (short)82);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-2005768392), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1706118784), (short) (-2989), (short)21, (-2005768392), 0, (short)21);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      dateCodec0.write(jSONSerializer0, date0, serializeWriter0, class0, 1661);
      assertEquals(25, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-2005768392), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = new Double((-2005768392));
      Class<Double> class0 = Double.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, double0, double0, type0, (-739));
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Short short0 = new Short((short) (-3005));
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, short0, class0, 409);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-2005768392), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Short> class0 = Short.TYPE;
      MockDate mockDate0 = new MockDate(1, (short)130, 0, (-2054779849), 0, (short)8);
      Double double0 = new Double(2);
      dateCodec0.write(jSONSerializer0, mockDate0, double0, class0, (short)8);
      assertEquals(76, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
