/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 07:31:05 GMT 2019
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
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertFalse(class1.isEnum());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constructor<String>[] constructorArray0 = (Constructor<String>[]) Array.newInstance(Constructor.class, 5);
      Class<Object> class0 = Object.class;
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
  public void test03()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build(class0, (Type) null, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Annotation> class1 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<Integer> class1 = Integer.class;
      Class<String> class2 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("org.springframework.security.core.context.SecurityContextImpl", class1, class2, class0, (Field) null, 0, 0, (-830));
      // Undeclared exception!
      try { 
        JavaBeanInfo.add((List<FieldInfo>) null, fieldInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
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
  public void test16()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) javaBeanInfo0.clazz, propertyNamingStrategy0);
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
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo.add(linkedList0, (FieldInfo) null);
      // Undeclared exception!
      try { 
        JavaBeanInfo.add(linkedList0, (FieldInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Void> class0 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((Class<?>) null, (JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 1);
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
  public void test21()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Void> class1 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<FieldInfo> class1 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.addLast((FieldInfo) null);
      Class<String> class2 = String.class;
      Class<Void> class3 = Void.class;
      JavaBeanInfo javaBeanInfo1 = null;
      try {
        javaBeanInfo1 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Object> class1 = Object.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, true);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicBoolean> class2 = AtomicBoolean.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, class0, (Constructor<?>) null, javaBeanInfo0.defaultConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNotNull(class1);
      
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<Void> class2 = Void.TYPE;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, class1, javaBeanInfo0.creatorConstructor, (Constructor<?>) null, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(11, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Annotation> class1 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("&8Jd.r\";DND+|&:U", class1, class0, class0, (Field) null, 8, (-4179), (-4304));
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      Class<Integer> class2 = Integer.class;
      linkedList0.add(fieldInfo0);
      Class<AtomicInteger> class3 = AtomicInteger.class;
      String[] stringArray0 = new String[5];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("GCkntqAY/PrtG").when(jSONType0).typeKey();
      doReturn("gettoUpperCase").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Type[] typeArray0 = new Type[6];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], class0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build(javaBeanInfo0.clazz, (Type) null, propertyNamingStrategy0, true, false);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<AtomicLong> class0 = AtomicLong.class;
      Class<Annotation> class1 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      FieldInfo fieldInfo0 = new FieldInfo("G", class0, class0, class1, (Field) null, (-63), (-63), (-619));
      Class<AtomicInteger> class2 = AtomicInteger.class;
      FieldInfo fieldInfo1 = new FieldInfo("G", class2, class2, (Type) null, (Field) null, 55296, 0, (-2336));
      JavaBeanInfo.add(linkedList0, fieldInfo1);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      FieldInfo fieldInfo0 = new FieldInfo("G", class0, class0, class1, (Field) null, (-63), (-63), (-619));
      linkedList0.addLast(fieldInfo0);
      Class<AtomicInteger> class2 = AtomicInteger.class;
      FieldInfo fieldInfo1 = new FieldInfo("G", class2, class2, (Type) null, (Field) null, 55296, 0, (-2336));
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertFalse(linkedList0.contains(fieldInfo0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      FieldInfo fieldInfo0 = new FieldInfo("G", class0, class0, class1, (Field) null, (-63), (-63), (-619));
      linkedList0.addLast(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<FieldInfo> class1 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<String> class2 = String.class;
      Class<Void> class3 = Void.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Annotation> class1 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("&8Jd.r\";DND+|&:U", class1, class0, class0, (Field) null, 8, (-4179), (-4304));
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      Class<Integer> class2 = Integer.class;
      Class<AtomicInteger> class3 = AtomicInteger.class;
      String[] stringArray0 = new String[5];
      stringArray0[1] = "&8Jd.r\";DND+|&:U";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("GCkntqAY/PrtG").when(jSONType0).typeKey();
      doReturn("gettoUpperCase").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class0 = Integer.class;
      Class<AtomicInteger> class1 = AtomicInteger.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType0).orders();
      doReturn("DisableASM").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
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
  public void test40()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Annotation> class1 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("&8Jd.r\";DND+|&:U", class1, class0, class0, (Field) null, 8, 8, (-4314));
      Class<Integer> class2 = Integer.class;
      Class<AtomicInteger> class3 = AtomicInteger.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(fieldInfo0.alternateNames).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn(" %N").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      Class<AtomicLong> class2 = AtomicLong.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build(class1, (Type) class0, propertyNamingStrategy0, false, false);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, class2, javaBeanInfo0.clazz);
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build(javaBeanInfo0.clazz, (Type) parameterizedTypeImpl0, propertyNamingStrategy0);
      assertNotSame(javaBeanInfo0, javaBeanInfo1);
  }
}
