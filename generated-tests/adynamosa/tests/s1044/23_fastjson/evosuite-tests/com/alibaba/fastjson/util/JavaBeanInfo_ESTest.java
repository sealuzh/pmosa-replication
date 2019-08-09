/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 00:30:21 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaBeanInfo_ESTest extends JavaBeanInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<AtomicLong> class1 = AtomicLong.class;
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class1, jSONType0);
      assertEquals("void", class2.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Annotation> class0 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(javaBeanInfo0.clazz).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class1, jSONType0);
      assertNotNull(class2);
      assertEquals("interface java.lang.annotation.Annotation", class2.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertEquals(1041, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertEquals("interface java.lang.annotation.Annotation", class1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.getDefaultConstructor((Class<?>) null, (Constructor<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.getCreatorConstructor((Constructor[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, (JSONType) null);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, (JSONType) null);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class0 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[5], typeArray0[4]);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[4];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[3], typeArray0[1]);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.add((List<FieldInfo>) null, (FieldInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Constructor<Void>[] constructorArray0 = (Constructor<Void>[]) Array.newInstance(Constructor.class, 7);
      // Undeclared exception!
      try { 
        JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Void> class0 = Void.TYPE;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) class0, propertyNamingStrategy0, false, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) null, propertyNamingStrategy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add((FieldInfo) null);
      // Undeclared exception!
      try { 
        JavaBeanInfo.add(linkedList0, (FieldInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Object> class1 = Object.class;
      String[] stringArray0 = new String[4];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("gettoString", stringArray0[1]).when(jSONType0).typeKey();
      doReturn("", stringArray0[0]).when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      Class<Annotation> class2 = Annotation.class;
      Class<AtomicBoolean> class3 = AtomicBoolean.class;
      JavaBeanInfo javaBeanInfo1 = null;
      try {
        javaBeanInfo1 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, javaBeanInfo0.jsonType, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((Class<?>) null, (JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Constructor<AtomicLong>[] constructorArray0 = (Constructor<AtomicLong>[]) Array.newInstance(Constructor.class, 1);
      // Undeclared exception!
      try { 
        JavaBeanInfo.getCreatorConstructor(constructorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<String> class1 = String.class;
      Type type0 = FieldInfo.getFieldType(class1, (Type) null, class0);
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build(class1, type0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Annotation> class0 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<Object> class1 = Object.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<String> class1 = String.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class1, class1, (Constructor<?>) null, javaBeanInfo0.defaultConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertFalse(javaBeanInfo1.equals((Object)javaBeanInfo0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<FieldInfo> class1 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class1, javaBeanInfo0.clazz, javaBeanInfo0.creatorConstructor, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(1, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicInteger> class1 = AtomicInteger.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNotNull(class2);
      
      JavaBeanInfo.build(class2, (Type) null, (PropertyNamingStrategy) null, true, true);
      assertEquals(1, class2.getModifiers());
      assertEquals("class java.util.concurrent.atomic.AtomicInteger", class2.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<FieldInfo> class1 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<Void> class0 = Void.TYPE;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      Class<String> class0 = String.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, true, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<Object> class1 = Object.class;
      Class<AtomicLong> class2 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("java.lang.Integer", class2, class1, (Type) null, (Field) null, 0, 0, 1792);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      FieldInfo fieldInfo1 = new FieldInfo("java.lang.Integer", class1, javaBeanInfo0.clazz, class1, (Field) null, 0, 0, 1792);
      JavaBeanInfo.add(linkedList0, fieldInfo1);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertTrue(linkedList0.contains(fieldInfo0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("java.lang.Integer", class1, class0, (Type) null, (Field) null, 0, 0, 1791);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<Object> class1 = Object.class;
      Class<AtomicLong> class2 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("java.lang.Integer", class2, class1, (Type) null, (Field) null, 0, 0, 1791);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      Class<Annotation> class3 = Annotation.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class3, class2, (Constructor<?>) null, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      Class<AtomicLong> class0 = AtomicLong.class;
      Class<Integer> class1 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, false);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicInteger> class2 = AtomicInteger.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, javaBeanInfo0.clazz, (Constructor<?>) null, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      Class<FieldInfo> class1 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build((Class<?>) class1, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[16];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("gettoString").when(jSONType0).typeKey();
      doReturn("acc").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[0];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("gettoString").when(jSONType0).typeKey();
      doReturn("acc").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Object> class1 = Object.class;
      String[] stringArray0 = new String[4];
      Class<AtomicBoolean> class2 = AtomicBoolean.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Object) stringArray0, (Object) stringArray0, (Object) stringArray0).when(jSONType0).orders();
      doReturn("gettoString", "#VT(`h4C%AdB779;nhO", "").when(jSONType0).typeKey();
      doReturn("acc", "dalvik", "gettoString").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      Class<Annotation> class3 = Annotation.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class3, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, javaBeanInfo0.jsonType, linkedList0);
      JavaBeanInfo javaBeanInfo2 = new JavaBeanInfo(javaBeanInfo1.clazz, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, javaBeanInfo0.jsonType, linkedList0);
      assertEquals(0, javaBeanInfo2.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<?> class1 = JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
      assertNull(class1);
  }
}