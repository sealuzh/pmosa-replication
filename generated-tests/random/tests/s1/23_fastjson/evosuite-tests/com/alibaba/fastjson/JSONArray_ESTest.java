/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 10:05:17 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4091);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(15);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 15
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1783, jSONArray0.DEFAULT_GENERATE_FEATURE);
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray2.fluentAdd(90, (Object) null);
      assertEquals(1785, jSONArray2.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object[] objectArray0 = jSONArray0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3844, jSONArray0.DEFAULT_PARSER_FEATURE);
      jSONArray1.getInteger(90);
      assertEquals(3845, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      jSONArray0.fluentSet(1783, jSONArray0.DEFAULT_PARSER_FEATURE);
      jSONArray0.fluentRemove((Object) ";/:OiI&5mW-8&F_t");
      assertEquals(1784, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      jSONArray0.fluentSet(3844, jSONArray0.DEFAULT_PARSER_FEATURE);
      jSONArray0.fluentRemove(1742);
      assertEquals(3844, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentAddAll((Collection<?>) jSONArray1);
      assertSame(jSONArray1, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(50900);
      jSONArray0.fluentSet(90, jSONArray0);
      jSONArray0.addAll(90, (Collection<?>) jSONArray0);
      assertEquals(182, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Annotation> class0 = Annotation.class;
      List<Annotation> list0 = jSONArray0.toJavaList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3338);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      jSONArray0.fluentSet(2845, locale_Category0);
      assertEquals(2846, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) null);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<List> class0 = List.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, hashMap0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(hashMap0);
      JSONArray jSONArray0 = new JSONArray(list0);
      JSONArray jSONArray1 = jSONArray0.fluentAdd(0, (Object) hashMap0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.subList(0, (-4433));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(0) > toIndex(-4433)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(90);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 90, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(1750);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1750, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(50900);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray((-537));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = jSONArray0.fluentSet(90, jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.getInteger(90);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\"$ref\":\"@\"}]
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<List> class0 = List.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, hashMap0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(hashMap0);
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue((-4017));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-1168), jSONArray0.DEFAULT_PARSER_FEATURE);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, concurrentHashMap0);
      List<Object> list0 = javaBeanSerializer0.getFieldValues(concurrentHashMap0);
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove((-1082));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-989));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -989
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(740);
      // Undeclared exception!
      try { 
        jSONArray0.add(1762, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1762, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.get((-2097));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      Iterator<Object> iterator0 = jSONArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(672);
      boolean boolean0 = jSONArray0.remove((Object) jSONArray0.DEFAULT_GENERATE_FEATURE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(4298, jSONArray0.DEFAULT_PARSER_FEATURE);
      Class<InputStream> class0 = InputStream.class;
      // Undeclared exception!
      try { 
        jSONArray0.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : java.io.InputStream
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<List> class0 = List.class;
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, hashMap0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(hashMap0);
      JSONArray jSONArray0 = new JSONArray(list0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(2784, class0);
      long long0 = jSONArray1.getLongValue(90);
      assertEquals(2785, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3844, jSONArray0.DEFAULT_PARSER_FEATURE);
      int int0 = jSONArray1.getIntValue(90);
      assertEquals(3845, jSONArray0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      jSONArray0.fluentSet(3844, jSONArray0.DEFAULT_GENERATE_FEATURE);
      boolean boolean0 = jSONArray0.getBooleanValue(20);
      assertEquals(3845, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      jSONArray0.fluentSet(3844, jSONArray0.DEFAULT_GENERATE_FEATURE);
      jSONArray0.getBoolean(1742);
      assertEquals(3845, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2122, jSONObject0);
      jSONArray1.getObject(90, (Type) null);
      assertEquals(2123, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0);
      JSONArray jSONArray2 = jSONArray1.getJSONArray(0);
      assertSame(jSONArray2, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1, "hXA1Ho?n");
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3046);
      jSONArray0.fluentSet(3046, "1.2.46");
      // Undeclared exception!
      try { 
        jSONArray0.getJSONObject(3046);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.alibaba.fastjson.JSONObject
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PushbackInputStream> linkedHashSet0 = new LinkedHashSet<PushbackInputStream>();
      boolean boolean0 = jSONArray0.containsAll(linkedHashSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      linkedList0.add(jSONArray0);
      boolean boolean0 = jSONArray1.containsAll(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      jSONArray0.fluentSet(3844, jSONArray0.DEFAULT_GENERATE_FEATURE);
      boolean boolean0 = jSONArray0.isEmpty();
      assertEquals(3845, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.setRelatedArray((Object) null);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(951);
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3064);
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(3061);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3061, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(952);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 952, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3968);
      Class<Integer> class0 = Integer.class;
      List<Integer> list0 = jSONArray0.toJavaList(class0);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(90, (Collection<?>) list0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 90, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<JSONArray> linkedHashSet0 = new LinkedHashSet<JSONArray>();
      boolean boolean0 = linkedHashSet0.add(jSONArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      jSONArray0.setComponentType(parameterizedTypeImpl0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject((-3537), class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(672);
      boolean boolean0 = jSONArray0.removeAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(90);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 90, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(20);
      // Undeclared exception!
      try { 
        jSONArray0.subList(90, 90);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 90
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(90, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 90, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      jSONArray1.fluentSet(90, jSONArray0);
      assertEquals(91, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte(963);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 963, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(1417);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1417, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getShort(162);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 162, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray1);
      assertEquals(0, jSONArray2.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getLong(59);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 59, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1783, jSONArray0.DEFAULT_GENERATE_FEATURE);
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray0.fluentRetainAll(jSONArray2);
      assertFalse(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertSame(jSONArray1, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4823);
      boolean boolean0 = jSONArray0.addAll((Collection<?>) jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(5);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      Object object0 = jSONArray1.clone();
      assertNotSame(object0, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1058);
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(1058);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1058, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Integer> class0 = Integer.class;
      int int0 = jSONArray0.lastIndexOf(class0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, concurrentHashMap0);
      List<Object> list0 = javaBeanSerializer0.getFieldValues(concurrentHashMap0);
      JSONArray jSONArray0 = new JSONArray(list0);
      int int0 = jSONArray0.indexOf(class0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentRemove(65279);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 65279, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(672);
      Integer[] integerArray0 = new Integer[4];
      Integer[] integerArray1 = jSONArray0.toArray(integerArray0);
      assertSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2152);
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(2152);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2152, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
