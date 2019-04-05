/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 21:21:39 GMT 2019
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
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer1);
      Integer integer2 = doubleKeyMap0.remove(integer0, integer1);
      assertTrue(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer1);
      Integer integer2 = doubleKeyMap0.get(integer0, integer1);
      assertTrue(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer0);
      Map<Integer, Integer> map0 = doubleKeyMap0.remove(integer0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<Object, String>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<Object, String>, Map<Integer, Integer>>();
      DoubleKeyMap<HashMap<Object, String>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, Integer, Integer>(hashMap0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      Integer integer0 = new Integer((-566));
      doubleKeyMap0.put(hashMap1, integer0, integer0);
      Map<Integer, Integer> map0 = doubleKeyMap0.get(hashMap1);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.remove("", object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<Object, HashMap<Object, String>>, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<Object, HashMap<Object, String>>, HashMap<String, Object>>();
      Map<Integer, Map<HashMap<String, Object>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, HashMap<String, Object>, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, HashMap<String, Object>, Object>(map0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = doubleKeyMap1.remove((Integer) null, hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Map<Integer, Object>> hashMap0 = new HashMap<String, Map<Integer, Object>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(hashMap0, class0);
      HashMap<Object, Map<Object, String>> hashMap1 = new HashMap<Object, Map<Object, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(hashMap1);
      String string0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<Object, Integer>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<Object, Integer>>();
      DoubleKeyMap<HashMap<Object, Object>, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Object, Integer>(hashMap0);
      Map<Object, Integer> map0 = doubleKeyMap0.remove((HashMap<Object, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Map<Object, Map<Object, Object>>, String, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Map<Object, Object>>, String, String>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0, class0);
      Map<Object, Map<Object, Integer>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Integer>(map1);
      Integer integer1 = doubleKeyMap2.put((Object) integer0, (Object) integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Integer, Object>();
      Map<Map<Object, HashMap<Object, String>>, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, HashMap<Object, String>>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, HashMap<Object, String>>, Object, Integer>(map0, class0);
      DoubleKeyMap<Map<Object, Map<Object, Object>>, String, String> doubleKeyMap2 = new DoubleKeyMap<Map<Object, Map<Object, Object>>, String, String>();
      DoubleKeyMap<Object, Map<Object, HashMap<Object, String>>, Object> doubleKeyMap3 = new DoubleKeyMap<Object, Map<Object, HashMap<Object, String>>, Object>();
      Object object0 = doubleKeyMap3.put((Object) doubleKeyMap1, (Map<Object, HashMap<Object, String>>) null, (Object) doubleKeyMap2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>();
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap0.put("ekp!)/7_W{0\")a", object0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, HashMap<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Integer>>(class0);
      Object object0 = new Object();
      HashMap<String, Integer> hashMap0 = doubleKeyMap0.get("x#HQ:m;m*PD>s:", object0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Integer, Object>((Map<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Map<Integer, Object>>) null);
      Map<Map<Object, HashMap<Object, String>>, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, HashMap<Object, String>>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, HashMap<Object, String>>, Object, Integer>(map0, class0);
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap1.get((Map<Object, HashMap<Object, String>>) null, (Object) integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      Map<Object, Map<String, String>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(map0, class0);
      String string0 = doubleKeyMap1.get((Object) doubleKeyMap0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, Object>, Integer, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Integer, String>();
      Map<Integer, String> map0 = doubleKeyMap0.get((HashMap<Integer, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>();
      Object object0 = new Object();
      Map<Integer, String> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, String>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, String>, Object, Object>();
      Map<Object, Map<String, Map<Map<Object, HashMap<Object, String>>, String>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, Map<Map<Object, HashMap<Object, String>>, String>> doubleKeyMap1 = new DoubleKeyMap<Object, String, Map<Map<Object, HashMap<Object, String>>, String>>(map0);
      Map<String, Map<Map<Object, HashMap<Object, String>>, String>> map1 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer0);
      Integer integer1 = new Integer(1);
      Integer integer2 = doubleKeyMap0.remove(integer0, integer1);
      assertNull(integer2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Map<Integer, HashMap<String, String>>> hashMap0 = new HashMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Map<Integer, HashMap<String, String>>>();
      DoubleKeyMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Integer, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>, Integer, HashMap<String, String>>(hashMap0);
      HashMap<HashMap<Object, Object>, Map<Object, Integer>> hashMap1 = new HashMap<HashMap<Object, Object>, Map<Object, Integer>>();
      DoubleKeyMap<HashMap<Object, Object>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Object>, Object, Integer>(hashMap1);
      Map<Integer, HashMap<String, String>> map0 = doubleKeyMap1.newMap();
      hashMap0.put((HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>) null, map0);
      Integer integer0 = new Integer(3324);
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      HashMap<String, String> hashMap3 = doubleKeyMap0.put((HashMap<Map<Object, HashMap<Object, String>>, Map<Object, HashMap<Object, String>>>) null, integer0, hashMap2);
      assertNull(hashMap3);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, HashMap<Object, String>>, Object, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Object, HashMap<Object, String>>, Object, Object>((Map<Map<Object, HashMap<Object, String>>, Map<Object, Object>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}