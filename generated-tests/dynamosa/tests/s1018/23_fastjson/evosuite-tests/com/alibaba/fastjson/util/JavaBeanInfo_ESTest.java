/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 02:37:58 GMT 2019
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
      Class<String> class0 = String.class;
      Class<Void> class1 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNotNull(class2);
      assertEquals("void", class2.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Annotation> class1 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNotNull(class2);
      assertTrue(class2.isInterface());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertEquals(1537, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 8);
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
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Constructor<String>[] constructorArray0 = (Constructor<String>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
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
      Class<AtomicLong> class0 = AtomicLong.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<String> class1 = String.class;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, class0, (Type) null);
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) parameterizedTypeImpl0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0);
      Class<FieldInfo> class1 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build((Class<?>) class1, (Type) class1, propertyNamingStrategy0, false, true);
      Class<Object> class2 = Object.class;
      JavaBeanInfo.build(javaBeanInfo1.clazz, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class1, (Type) class1, propertyNamingStrategy0);
      // Undeclared exception!
      JavaBeanInfo.build((Class<?>) class1, (Type) class2, propertyNamingStrategy0, false, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) null, (PropertyNamingStrategy) null, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      // Undeclared exception!
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) class0, (PropertyNamingStrategy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Object> class1 = Object.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, false);
      Class<?> class2 = JavaBeanInfo.getBuilderClass((Class<?>) null, javaBeanInfo0.jsonType);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constructor<Integer>[] constructorArray0 = (Constructor<Integer>[]) Array.newInstance(Constructor.class, 1);
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
  public void test20()  throws Throwable  {
      Constructor<AtomicInteger>[] constructorArray0 = (Constructor<AtomicInteger>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[5]);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Void> class0 = Void.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      Class<Annotation> class1 = Annotation.class;
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build((Class<?>) class1, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0, false, false);
      assertFalse(javaBeanInfo1.equals((Object)javaBeanInfo0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Void> class1 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0);
      JavaBeanInfo.build((Class<?>) class1, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Object> class1 = Object.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, false);
      Class<Annotation> class2 = Annotation.class;
      Class<AtomicBoolean> class3 = AtomicBoolean.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, class3, javaBeanInfo0.defaultConstructor, javaBeanInfo0.defaultConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo1.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add((FieldInfo) null);
      JavaBeanInfo javaBeanInfo1 = null;
      try {
        javaBeanInfo1 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Void> class0 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<Void> class1 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Class<Annotation> class1 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("reaK-e", class1, class1, class0, (Field) null, 1745, 1745, 1745);
      Class<FieldInfo> class2 = FieldInfo.class;
      FieldInfo fieldInfo1 = new FieldInfo("reaK-e", class0, class2, class2, (Field) null, 1745, 1745, 1745);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertTrue(linkedList0.contains(fieldInfo1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Class<Annotation> class1 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("reaK-e", class1, class1, class0, (Field) null, 1733, 1733, 1733);
      Class<FieldInfo> class2 = FieldInfo.class;
      FieldInfo fieldInfo1 = new FieldInfo("reaK-e", class0, class2, class2, (Field) null, 1733, 1733, 1733);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo1);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertTrue(linkedList0.contains(fieldInfo1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<String> class0 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("with", class0, class0, class0, (Field) null, (-108), (-108), (-108));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class0, class0, javaBeanInfo0.creatorConstructor, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(11, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[10];
      stringArray0[0] = "JD{x}JG@d0>f9";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("JD{x}JG@d0>f9").when(jSONType0).typeKey();
      doReturn("JD{x}JG@d0>f9").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<String> class0 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("JD{x}JG@d0>f9", class0, class0, class0, (Field) null, 13, 13, (-21));
      linkedList0.offerFirst(fieldInfo0);
      Class<Integer> class1 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class1, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      String[] stringArray0 = new String[0];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("NnJqo(HFrK/Q\"~S*8").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("E|%;nV|cVg2n^`R").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
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
  public void test38()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }
}
