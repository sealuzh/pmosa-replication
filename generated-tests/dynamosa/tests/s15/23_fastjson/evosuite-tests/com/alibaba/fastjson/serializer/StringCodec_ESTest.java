/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:49:30 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.OutputStreamWriter;
import java.io.PipedOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1?");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser(defaultJSONParser0.lexer);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser1, (Type) parameterizedTypeImpl0, (Object) "i6yoRd_&Z]L%g5");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, json : 1?
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) null, (Type) null, 16);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) serializeConfig0, (Object) jSONSerializer0, (Type) null, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.SerializeConfig cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null, serializeConfig0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) "", (Object) serializeConfig0, (Type) null, (-277));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(1);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Type[] typeArray0 = new Type[1];
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], type0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) jSONSerializer0, (Object) jSONSerializer0, (Type) parameterizedTypeImpl0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.JSONSerializer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(612, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) jSONSerializer0, object0, (Type) null, 612);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.JSONSerializer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 85);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1?");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = new StringCodec();
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      String string0 = stringCodec0.deserialze(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "i6yoRd_&Z]L%g5");
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3SfWKM|!{x");
      defaultJSONParser0.resolveStatus = 1023;
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parse false
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      String[] stringArray0 = new String[5];
      Map<String, String> map0 = JavaBeanSerializer.createAliasMap(stringArray0);
      Class<StringBuffer> class0 = StringBuffer.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, map0);
      defaultJSONParser0.resolveStatus = (-2247);
      Class<?> class1 = javaBeanSerializer0.getType();
      StringCodec stringCodec0 = StringCodec.instance;
      String string0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class1, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3SfWKM|a=x");
      defaultJSONParser0.setResolveStatus(579);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parse false
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3SfWKM|a}x");
      defaultJSONParser0.setResolveStatus((-1789));
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parse false
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Charset charset0 = Charset.defaultCharset();
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(pipedOutputStream0, charset0);
      SerializeWriter serializeWriter0 = new SerializeWriter(outputStreamWriter0, 1);
      SerializeConfig serializeConfig0 = new SerializeConfig(1103, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, "+z!!5v,/`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1?");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = new StringCodec();
      StringCodec.deserialze(defaultJSONParser0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, json : 1?
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringCodec.deserialze((DefaultJSONParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      char[] charArray0 = new char[4];
      charArray0[0] = '_';
      charArray0[1] = '1';
      charArray0[2] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 15, 2);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("'/'");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("/", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Annotation annotation0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      char[] charArray0 = new char[4];
      charArray0[0] = '_';
      charArray0[1] = '1';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 15, 2);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      stringCodec0.deserialze(defaultJSONParser1, (Type) class0, (Object) null);
      jSONReaderScanner0.scanNumber();
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze((DefaultJSONParser) null, (Type) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1?");
      Class<StringBuffer> class0 = StringBuffer.class;
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, map0);
      Class<?> class1 = javaBeanSerializer0.getType();
      StringCodec stringCodec0 = StringCodec.instance;
      StringBuffer stringBuffer0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class1, (Object) "RQ_M!|y~R@|Z[o+iMo");
      assertNotNull(stringBuffer0);
      assertEquals(28, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("''");
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = StringCodec.instance;
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.AUTOSELECT_FILTERING;
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.instance.deserialze(defaultJSONParser0, (Type) class0, (Object) locale_FilteringMode0);
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<String> class0 = String.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, object0, (Object) ":7usJ&b*E|Dyi$R", (Type) class0, 415);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }
}