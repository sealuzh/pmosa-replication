/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:51:43 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object[] objectArray0 = jSONArray0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Iterator<Object> iterator0 = jSONArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      jSONArray0.fluentSet(1403, jSONArray0);
      jSONArray0.fluentAddAll(39, (Collection<?>) jSONArray0);
      Class<String> class0 = String.class;
      jSONArray0.getObject(1444, class0);
      assertEquals(2808, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1403, jSONArray0);
      jSONArray1.getDouble(0);
      assertEquals(1404, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1596);
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Set<String> set0 = jSONArray0.defaultLocale.getUnicodeLocaleAttributes();
      JSONArray jSONArray1 = jSONArray0.fluentRetainAll(set0);
      assertTrue(jSONArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1551, jSONObject0);
      jSONArray1.fluentRemove(1551);
      assertEquals(1551, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getString(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      jSONArray0.fluentAdd(0, (Object) jSONArray0.DEFAULT_GENERATE_FEATURE);
      Integer integer0 = jSONArray0.getInteger(0);
      assertEquals(3089, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(119);
      // Undeclared exception!
      try { 
        jSONArray0.getString((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getShortValue(11);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 11, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3079);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(3079);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3079, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray((-733));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getIntValue(1590);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1590, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue((-1397));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Set<String> set0 = jSONArray0.defaultLocale.getUnicodeLocaleAttributes();
      // Undeclared exception!
      jSONArray0.fluentSet(9999, set0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray((List<Object>) null);
      // Undeclared exception!
      try { 
        jSONArray1.fluentRetainAll(jSONArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((-2413), (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-557));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -557
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.equals(jSONArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.clone();
      assertNotSame(object0, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentAdd((Object) jSONArray0);
      Class<JSONArray> class0 = JSONArray.class;
      List<JSONArray> list0 = jSONArray0.toJavaList(class0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Integer> class0 = Integer.class;
      List<Integer> list0 = jSONArray0.toJavaList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3011, (Object) null);
      float float0 = jSONArray1.getFloatValue(1935);
      assertEquals(3012, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2895);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1403, (Object) null);
      long long0 = jSONArray1.getLongValue(1403);
      assertEquals(1404, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1403, "1.2.46");
      short short0 = jSONArray1.getShortValue(1381);
      assertEquals(1404, jSONArray0.size());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(661, (Object) null);
      JSONArray jSONArray2 = jSONArray0.fluentAddAll(71, (Collection<?>) jSONArray1);
      boolean boolean0 = jSONArray2.getBooleanValue(678);
      assertEquals(1324, jSONArray1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      jSONArray0.fluentSet(1403, jSONArray0);
      Class<String> class0 = String.class;
      jSONArray0.getObject(1381, (Type) class0);
      assertEquals(1404, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      jSONArray0.fluentSet(1551, jSONObject0);
      jSONArray0.getJSONArray(1547);
      assertEquals(1552, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      jSONArray0.fluentSet(1403, jSONArray0);
      jSONArray0.getJSONObject(973);
      assertEquals(1404, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-5562), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = jSONArray0.set((-1), jSONArray0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONScanner jSONScanner0 = new JSONScanner("");
      Class<Object> class0 = Object.class;
      Collection<String> collection0 = jSONScanner0.newCollectionByType(class0);
      boolean boolean0 = jSONArray0.containsAll(collection0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONObject jSONObject0 = new JSONObject(true);
      boolean boolean0 = jSONArray0.contains(jSONObject0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      jSONArray0.fluentSet(1403, jSONArray0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertEquals(1404, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 1381);
      jSONArray0.setRelatedArray(pushbackInputStream0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(3045);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3045, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      jSONArray1.fluentSet(1403, jSONArray0);
      assertEquals(1404, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp((-1027));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<JSONArray> class0 = JSONArray.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, (Map<String, String>) null);
      javaBeanSerializer0.getFieldValues(jSONArray0);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2895);
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      Field field0 = hashMap0.remove((Object) jSONArray0);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<JSONObject> class0 = JSONObject.class;
      jSONArray0.setComponentType(class0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString(101);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 101, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      LinkedHashSet<JSONArray> linkedHashSet0 = new LinkedHashSet<JSONArray>();
      // Undeclared exception!
      try { 
        jSONArray1.fluentAddAll((-3266), (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -3266, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.removeAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3052);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(255);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 255, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList((-1), 1646);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex = -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2895);
      // Undeclared exception!
      try { 
        jSONArray0.add(2824, (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2824, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<ByteArrayInputStream> linkedList0 = new LinkedList<ByteArrayInputStream>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) linkedList0);
      assertEquals(0, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemove((Object) jSONArray0);
      assertTrue(jSONArray2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      String string0 = JSON.toJSONString((Object) jSONArray0, 1403, serializerFeatureArray0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(class0);
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.getByte((-4419));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getShort(2024);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2024, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2895);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSONArray0.sort(comparator0);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2895);
      boolean boolean0 = jSONArray0.retainAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(60);
      // Undeclared exception!
      try { 
        jSONArray0.getLong(2816);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2816, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(526);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 526
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getInteger(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.addAll((Collection<?>) jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(119);
      int int0 = jSONArray0.lastIndexOf((Object) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(1289, (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1289, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      int int0 = jSONArray0.indexOf(charset0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.remove((-5562));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(jSONArray0);
      assertTrue(jSONArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3079);
      JSONObject[] jSONObjectArray0 = new JSONObject[2];
      JSONObject[] jSONObjectArray1 = jSONArray0.toArray(jSONObjectArray0);
      assertSame(jSONObjectArray0, jSONObjectArray1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(1176);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1176, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
