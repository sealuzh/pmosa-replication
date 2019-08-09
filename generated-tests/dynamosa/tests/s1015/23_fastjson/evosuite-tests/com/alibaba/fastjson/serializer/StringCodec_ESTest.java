/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 22:12:21 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.incrementIndent();
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.decrementIdent();
      stringCodec0.instance.write(jSONSerializer0, "");
      assertEquals((-1), jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Type[] typeArray0 = new Type[0];
      Class<Object> class0 = Object.class;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, class0);
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) null, (Type) parameterizedTypeImpl0, (-2716));
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      Class<Object> class0 = Object.class;
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, object0, object0, (Type) class0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      stringCodec0.instance.write(jSONSerializer0, (Object) "{", (Object) null, (Type) null, 4);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("L:dLoq&<&g4cBxgqk]%");
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) "L:dLoq&<&g4cBxgqk]%");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : L:dLoq&<&g4cBxgqk]%
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("55kB/q");
      Class<StringBuffer> class0 = StringBuffer.class;
      defaultJSONParser0.setResolveStatus(8);
      StringCodec stringCodec0 = new StringCodec();
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
      assertEquals(28, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1.2.46");
      defaultJSONParser0.resolveStatus = (-2370);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.resolveStatus = 187;
      Integer integer0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.setResolveStatus((-1754));
      Integer integer0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, "MJ@1{u>{!d");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, object0, (Type) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-{,ha.{[.@");
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze((DefaultJSONParser) null, (Type) class0, (Object) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("|\"7+?s", parserConfig0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : |\"7+?s
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.instance.write(jSONSerializer0, "minutes");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1.2.46");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5\u0005kB/qR");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("5", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"-9223372036854775808\"", parserConfig0, 516);
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("-9223372036854775808", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"-9223372036854775808\"");
      Object object0 = new Object();
      Object object1 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, object0);
      assertEquals("-9223372036854775808", object1.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("BI<*j 5h8$N");
      StringCodec stringCodec0 = new StringCodec();
      Type[] typeArray0 = new Type[2];
      Class<Annotation> class0 = Annotation.class;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], class0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : BI<*j 5h8$N
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      Class<StringBuffer> class0 = StringBuffer.class;
      Integer integer0 = StringCodec.instance.deserialze(defaultJSONParser0, (Type) class0, object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }
}
