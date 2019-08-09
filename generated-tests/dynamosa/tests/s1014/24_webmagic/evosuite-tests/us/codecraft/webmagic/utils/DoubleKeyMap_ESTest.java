/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 20:03:16 GMT 2019
 */

package us.codecraft.webmagic.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.utils.DoubleKeyMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleKeyMap_ESTest extends DoubleKeyMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      Map<Integer, Map<Integer, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, Integer>(map0);
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(1);
      doubleKeyMap1.put(integer1, integer1, integer0);
      Integer integer2 = new Integer(1);
      Integer integer3 = doubleKeyMap1.remove(integer2, integer1);
      assertEquals(0, map0.size());
      assertEquals(0, (int)integer3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<Integer, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Object>(class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      HashMap<Object, Map<Object, Object>> hashMap2 = new HashMap<Object, Map<Object, Object>>();
      hashMap2.put(doubleKeyMap0, hashMap1);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap2);
      Map<Object, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(1);
      HashMap<Integer, Map<HashMap<Object, String>, Map<Object, String>>> hashMap0 = new HashMap<Integer, Map<HashMap<Object, String>, Map<Object, String>>>();
      DoubleKeyMap<Integer, HashMap<Object, String>, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, Map<Object, String>>(hashMap0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      doubleKeyMap0.put(integer0, hashMap1, (Map<Object, String>) hashMap1);
      Map<Object, String> map0 = doubleKeyMap0.get(integer0, hashMap1);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(4555);
      DoubleKeyMap<Object, Map<String, Object>, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, Object>, Map<Object, Integer>>();
      Map<Object, Integer> map0 = doubleKeyMap0.remove((Object) integer0, (Map<String, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, String, Map<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<String, Integer>>();
      HashMap<Object, Map<Map<String, Object>, Map<Object, Integer>>> hashMap0 = new HashMap<Object, Map<Map<String, Object>, Map<Object, Integer>>>();
      DoubleKeyMap<Object, Map<String, Object>, Map<Object, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, Object>, Map<Object, Integer>>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Map<Object, Integer> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Map<String, Object>) hashMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Integer>, String>();
      Map<HashMap<Object, Integer>, String> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Map<Map<String, Object>, String>> hashMap0 = new HashMap<String, Map<Map<String, Object>, String>>();
      DoubleKeyMap<String, Map<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, Map<String, Object>, String>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      doubleKeyMap0.put("GS_}5=p", (Map<String, Object>) hashMap1, (String) null);
      Map<Map<String, Object>, String> map0 = doubleKeyMap0.remove("GS_}5=p");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>((Map<Object, Map<Object, Object>>) null, class0);
      Object object0 = doubleKeyMap1.put((Object) null, (Object) null, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      DoubleKeyMap<HashMap<Map<String, Object>, Object>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Map<String, Object>, Object>, Object, Integer>();
      HashMap<Map<String, Object>, Object> hashMap0 = new HashMap<Map<String, Object>, Object>();
      Integer integer0 = new Integer((-2222));
      Integer integer1 = doubleKeyMap1.put(hashMap0, (Object) doubleKeyMap0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Map<String, Object>, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, String, HashMap<String, Object>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put((Map<String, Object>) null, "", hashMap0);
      Map<String, HashMap<String, Object>> map0 = doubleKeyMap0.get((Map<String, Object>) null);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Integer, Map<Object, Map<String, Integer>>> hashMap0 = new HashMap<Integer, Map<Object, Map<String, Integer>>>();
      Integer integer0 = new Integer(1546);
      HashMap<Object, Map<String, Integer>> hashMap1 = new HashMap<Object, Map<String, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, Map<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Map<String, Integer>>(hashMap0, class0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(hashMap1, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) doubleKeyMap0, "A2`ek,0VNj,.<fZKf", integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      String string0 = doubleKeyMap0.get("=P`ZN", (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0, class0);
      Map<HashMap<String, Object>, Map<Object, HashMap<Object, String>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<String, Object>, Object, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Object>, Object, HashMap<Object, String>>(map0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<Object, String> hashMap2 = doubleKeyMap1.get(hashMap1, (Object) doubleKeyMap0);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Integer, Map<HashMap<Object, Object>, Object>> hashMap1 = new HashMap<Integer, Map<HashMap<Object, Object>, Object>>();
      DoubleKeyMap<Integer, HashMap<Object, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, Object>, Object>(hashMap1);
      Object object0 = doubleKeyMap0.get((Integer) null, hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      Object object0 = new Object();
      String string0 = doubleKeyMap0.get(object0, "JAjZlEI'ndcC");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Map<String, Object>, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, String, HashMap<String, Object>>();
      Map<String, HashMap<String, Object>> map0 = doubleKeyMap0.get((Map<String, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Object object0 = new Object();
      Map<String, Object> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<Object, String>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, Integer>((Map<String, Map<HashMap<Object, String>, Integer>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-693));
      doubleKeyMap0.put(integer1, integer1, integer1);
      Integer integer2 = new Integer((-693));
      Integer integer3 = doubleKeyMap0.remove(integer2, integer0);
      assertNull(integer3);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0);
      Object object0 = doubleKeyMap0.remove((Object) null, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer0);
      Integer integer1 = new Integer(0);
      Integer integer2 = doubleKeyMap0.put(integer1, integer1, integer1);
      assertTrue(integer2.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Integer, HashMap<String, Integer>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<String, Integer>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      HashMap<Object, Map<Object, Object>> hashMap1 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap1);
      Object object0 = doubleKeyMap1.remove((Object) hashMap0, (Object) doubleKeyMap0);
      assertNull(object0);
  }
}
