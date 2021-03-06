/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:21:31 GMT 2019
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
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedList;
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
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNotNull(class2);
      assertEquals("class java.util.concurrent.atomic.AtomicLong", class2.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      boolean boolean0 = JavaBeanInfo.add(linkedList0, (FieldInfo) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) null, propertyNamingStrategy0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) class0, propertyNamingStrategy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((Class<?>) null, (JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constructor<String>[] constructorArray0 = (Constructor<String>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      Class<AtomicLong> class0 = AtomicLong.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class0 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0);
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build((Class<?>) class0, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0, true, false);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Integer> class1 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Annotation> class0 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, true, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class1 = Integer.class;
      Class<Void> class2 = Void.class;
      FieldInfo fieldInfo0 = new FieldInfo("getfloatValue", class1, class2, class2, (Field) null, 31, (-2866), 1863);
      linkedList0.add(fieldInfo0);
      FieldInfo fieldInfo1 = new FieldInfo("getfloatValue", class1, class1, class0, (Field) null, 107, 107, 107);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class1 = Integer.class;
      Class<Void> class2 = Void.class;
      FieldInfo fieldInfo0 = new FieldInfo("getfloatValue", class1, class2, class2, (Field) null, 837, (-2866), 1863);
      linkedList0.add(fieldInfo0);
      FieldInfo fieldInfo1 = new FieldInfo("getfloatValue", class1, class1, class0, (Field) null, 107, 107, 107);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class0 = Integer.class;
      FieldInfo fieldInfo0 = new FieldInfo("z]'QW@kV><{", (Class<?>) null, class0, (Type) null, (Field) null, (-2766), 0, 1896);
      linkedList0.add(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      Class<Integer> class2 = Integer.class;
      String[] stringArray0 = new String[4];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("setlazySet").when(jSONType0).typeKey();
      doReturn("setlazySet").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Annotation> class3 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("D^eglj}Su(Y=bi]'K", class1, class3, class2, (Field) null, 26, 4, 1609);
      linkedList0.add(fieldInfo0);
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<Integer> class1 = Integer.class;
      String[] stringArray0 = new String[0];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("setlazySet").when(jSONType0).typeKey();
      doReturn("setlazySet").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<Integer> class1 = Integer.class;
      String[] stringArray0 = new String[8];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<Integer> class1 = Integer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType0).orders();
      doReturn("setlazySet").when(jSONType0).typeKey();
      doReturn("setlazySet").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
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
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<?> class1 = JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
      assertNull(class1);
  }
}
