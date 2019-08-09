/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 08:54:46 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.PipedWriter;
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
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.decrementIdent();
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Object> class0 = Object.class;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringValueAsString;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.instance.write(jSONSerializer0, (Object) serializerFeature0, object0, (Type) class0, 1509950721);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.SerializerFeature cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, object0, (Object) null, (Type) null, 0);
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
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.incrementIndent();
      Class<Integer> class0 = Integer.class;
      Class class1 = (Class)FieldInfo.getFieldType(class0, class0, class0);
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) jSONSerializer0, (Type) class1, 1427);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.decrementIdent();
      // Undeclared exception!
      try { 
        StringCodec.instance.write(jSONSerializer0, (Object) serializeConfig0, (Object) "cDV:3w8riG[|QP", (Type) null, (-520));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.SerializeConfig cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.global;
      char[] charArray0 = new char[8];
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 0);
      StringCodec stringCodec0 = new StringCodec();
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[7], typeArray0[2]);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "com.alibaba.fastjson.serializer.StringCodec");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, pos 0, json : \u0000\u0000
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      char[] charArray0 = new char[11];
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 1443168256);
      defaultJSONParser0.resolveStatus = 2;
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, pos 0, json : \u0000\u0000
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("7F-Qu2cm(8:7;");
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuffer> class0 = StringBuffer.class;
      defaultJSONParser0.resolveStatus = (-784);
      Object object0 = new Object();
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, object0);
      assertEquals(26, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("java.util.Optional", (-2494));
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.setResolveStatus(20);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("H{7\"{\u0002|q4:([=3[<P");
      defaultJSONParser0.setResolveStatus((-2475));
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : H{7\"{\u0002|q4:([=3[<P
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0);
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 8);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      // Undeclared exception!
      try { 
        stringCodec0.instance.write(jSONSerializer0, "7F-Qu2cm(8:7;");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 191);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-aJ");
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("b4#f#k/4Q^");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : b4#f#k/4Q^
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
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
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("7F-Qu2cm(8:7;");
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("2jKuhZ\"rd<e:o");
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"b\"vaX1}NW8", parserConfig0);
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("b", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("-2k(:[<6,p!PAfHu", 1);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) jSONScanner0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = new StringCodec();
      char[] charArray0 = new char[3];
      charArray0[0] = '\"';
      charArray0[1] = '\"';
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 2, parserConfig0, 2);
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) stringBuilder0);
      assertFalse(stringBuilder1.equals((Object)stringBuilder0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "");
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuffer> class0 = StringBuffer.class;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"~}?Fm*r8\"i.#&yp+o");
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.resolveStatus);
      assertEquals(8, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuffer> class0 = StringBuffer.class;
      SerializeWriter serializeWriter0 = new SerializeWriter(2);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, class0);
      stringCodec0.write(jSONSerializer0, (Object) "7F-Qu2cm(8:7;", (Object) jSONSerializer0, (Type) parameterizedTypeImpl0, (-5122));
      assertEquals(15, serializeWriter0.size());
      assertEquals(15, serializeWriter0.getBufferLength());
  }
}
