/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 09:40:56 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(2, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      char[] charArray0 = new char[2];
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) defaultJSONParser0.NONE, (Type) null, 11);
      assertEquals(0, DefaultJSONParser.NONE);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuilder> class0 = StringBuilder.class;
      JSONScanner jSONScanner0 = new JSONScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Object object0 = new Object();
      Field field0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, object0);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '2';
      charArray0[1] = '\"';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 16);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed string : \u001A
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(1555);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      stringCodec0.write(jSONSerializer0, (String) null);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"$ref\":\"@\"}", parserConfig0, 855);
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '2';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 16);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("2", object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      char[] charArray0 = new char[2];
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      String string0 = stringCodec0.instance.deserialze(defaultJSONParser0, (Type) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<StringBuffer> class0 = StringBuffer.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Integer integer0 = stringCodec0.deserialze(defaultJSONParser0, type0, (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<StringBuilder> class0 = StringBuilder.class;
      String[] stringArray0 = new String[9];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      Class<?> class1 = simplePropertyPreFilter0.getClazz();
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) null, (Type) class1, 1086);
      assertEquals("class java.lang.StringBuilder", class1.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.instance.write(jSONSerializer0, "com.alibaba.fastjson.serializer.StringCodec");
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuffer> class0 = StringBuffer.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        stringCodec0.instance.write((JSONSerializer) null, (Object) null, (Object) type0, (Type) class0, (-182));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }
}