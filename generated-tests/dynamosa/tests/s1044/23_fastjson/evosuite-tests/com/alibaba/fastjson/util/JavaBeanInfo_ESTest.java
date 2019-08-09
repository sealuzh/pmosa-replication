/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 23:27:28 GMT 2019
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
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<Object> class1 = Object.class;
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class1, jSONType0);
      assertNotNull(class2);
      assertTrue(class2.isInterface());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Void> class1 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNotNull(class2);
      assertTrue(class2.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertTrue(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 6);
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
      Constructor<Integer>[] constructorArray0 = (Constructor<Integer>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("getindexOf", class0, class0, class0, (Field) null, (-109828176), (-109828176), (-109828176));
      Constructor<String>[] constructorArray0 = (Constructor<String>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(fieldInfo0.declaringClass, constructorArray0);
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
      Class<String> class0 = String.class;
      Class<Void> class1 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0);
      JavaBeanInfo.getBuilderClass(class1, javaBeanInfo0.jsonType);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<Annotation> class1 = Annotation.class;
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class1, javaBeanInfo0.jsonType);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[5], typeArray0[4]);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[4];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[3], typeArray0[1]);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build((Class<?>) class0, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      // Undeclared exception!
      JavaBeanInfo.build(javaBeanInfo1.clazz, (Type) null, propertyNamingStrategy0, false, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) class0, (PropertyNamingStrategy) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<String> class1 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0);
      Class<FieldInfo> class2 = FieldInfo.class;
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class2, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class2, (Type) class2, propertyNamingStrategy0);
      // Undeclared exception!
      JavaBeanInfo.build((Class<?>) class2, (Type) null, propertyNamingStrategy0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
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
  public void test20()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((Class<?>) null, (JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 4);
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
  public void test22()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<String> class0 = String.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<Integer> class0 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build(javaBeanInfo0.clazz, (Type) null, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Annotation> class0 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("EMPTY", class0, class1, class1, (Field) null, (-109828176), (-109828176), (-109828176));
      Class<AtomicBoolean> class2 = AtomicBoolean.class;
      Class<AtomicLong> class3 = AtomicLong.class;
      FieldInfo fieldInfo1 = new FieldInfo("EMPTY", class2, class3, class0, (Field) null, 1784, (-109828176), (-109828176));
      JavaBeanInfo.add(linkedList0, fieldInfo1);
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(fieldInfo1.alternateNames).when(jSONType0).orders();
      doReturn("'?NoJ6+~X").when(jSONType0).typeKey();
      doReturn("EMPTY").when(jSONType0).typeName();
      linkedList0.add(fieldInfo0);
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo1.declaringClass, fieldInfo1.fieldClass, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Object> class0 = Object.class;
      Class<AtomicBoolean> class1 = AtomicBoolean.class;
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class0 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Integer> class0 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Annotation> class0 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicInteger> class1 = AtomicInteger.class;
      Class<Annotation> class2 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("", class0, class2, class1, (Field) null, 33, 33, 33);
      FieldInfo fieldInfo1 = new FieldInfo("", class1, class1, fieldInfo0.declaringClass, (Field) null, 33, 33, 33);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo1);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertTrue(linkedList0.contains(fieldInfo1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicInteger> class1 = AtomicInteger.class;
      Class<Annotation> class2 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("", class0, class2, class1, (Field) null, (-109828176), (-109828176), (-109828176));
      FieldInfo fieldInfo1 = new FieldInfo("", class1, class1, fieldInfo0.declaringClass, (Field) null, (-109828176), (-109828176), (-109828176));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertTrue(linkedList0.contains(fieldInfo1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("getindexOf", class0, class0, class0, (Field) null, (-109828176), (-109828176), (-109828176));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("EMPTY", class0, class1, class1, (Field) null, (-109828176), (-109828176), (-109828176));
      linkedList0.add(fieldInfo0);
      String[] stringArray0 = new String[2];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("EMPTY").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("EMPTY", class0, class1, class1, (Field) null, (-109828176), (-109828176), (-109828176));
      linkedList0.add(fieldInfo0);
      String[] stringArray0 = new String[7];
      stringArray0[6] = "EMPTY";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("'pO>WNTbg|vu|vWx").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[9];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add((FieldInfo) null);
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((JSONType) null);
      assertNull(class0);
  }
}