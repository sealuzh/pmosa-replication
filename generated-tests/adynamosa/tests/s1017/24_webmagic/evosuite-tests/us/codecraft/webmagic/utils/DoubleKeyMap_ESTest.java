/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 02:13:40 GMT 2019
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
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0);
      Integer integer0 = new Integer(2798);
      Object object0 = new Object();
      doubleKeyMap0.put(integer0, integer0, object0);
      Integer integer1 = new Integer(2798);
      doubleKeyMap0.remove(integer1, integer0);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, String, Map<HashMap<Object, Object>, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, Map<HashMap<Object, Object>, Object>>();
      Map<Integer, String> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, HashMap<Object, Object>, String> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Object, Object>, String>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      doubleKeyMap1.put((Object) map0, hashMap0, "wrong proto type map ");
      HashMap<HashMap<Object, Object>, Object> hashMap1 = new HashMap<HashMap<Object, Object>, Object>();
      Map<HashMap<Object, Object>, String> map1 = doubleKeyMap1.remove((Object) hashMap1);
      assertEquals(1, map1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<String, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, Object>, Object>(class0);
      Map<HashMap<String, Integer>, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<String, Integer>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Integer>, Object, Object>(map0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Object object0 = doubleKeyMap1.remove(hashMap0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, Object>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Object object0 = doubleKeyMap0.remove((Object) null, hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0);
      Class<HashMap> class0 = HashMap.class;
      HashMap<Integer, Map<Object, Object>> hashMap0 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Integer, Object, Object>(hashMap0, class0);
      Map<Object, Map<Map<HashMap<Object, Object>, Object>, String>> map1 = doubleKeyMap2.newMap();
      DoubleKeyMap<Object, Map<HashMap<Object, Object>, Object>, String> doubleKeyMap3 = new DoubleKeyMap<Object, Map<HashMap<Object, Object>, Object>, String>(map1);
      HashMap<HashMap<Object, Object>, Object> hashMap1 = new HashMap<HashMap<Object, Object>, Object>();
      String string0 = doubleKeyMap3.remove((Object) doubleKeyMap1, (Map<HashMap<Object, Object>, Object>) hashMap1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<HashMap<String, Object>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Integer, Integer>>();
      DoubleKeyMap<HashMap<String, Object>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Integer, Integer>(hashMap0);
      Map<Integer, Integer> map0 = doubleKeyMap0.remove((HashMap<String, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap0.put((Object) null, "+TZ 7$", integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Object, Map<Integer, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>(map0);
      Integer integer0 = new Integer(1);
      String string0 = doubleKeyMap1.put((Object) doubleKeyMap0, integer0, " &oGF");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(2798);
      DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, String> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, String>();
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Integer>();
      Integer integer1 = doubleKeyMap1.get(integer0, (Object) doubleKeyMap0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Integer, Integer>();
      Map<Map<String, String>, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<String, String>, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<String, String>, String, Integer>(map0);
      Integer integer0 = doubleKeyMap1.get((Map<String, String>) null, (String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      Map<HashMap<Integer, Integer>, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Integer, Integer>, String, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Integer>, String, Integer>(map0);
      Map<String, Integer> map1 = doubleKeyMap1.get((HashMap<Integer, Integer>) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<String, HashMap<Map<HashMap<Object, Object>, Object>, Object>>> hashMap0 = new HashMap<Integer, Map<String, HashMap<Map<HashMap<Object, Object>, Object>, Object>>>();
      DoubleKeyMap<Integer, String, HashMap<Map<HashMap<Object, Object>, Object>, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, HashMap<Map<HashMap<Object, Object>, Object>, Object>>(hashMap0, class0);
      Integer integer0 = new Integer(1572);
      HashMap<Map<HashMap<Object, Object>, Object>, Object> hashMap1 = new HashMap<Map<HashMap<Object, Object>, Object>, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(integer0, (String) null, hashMap1);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, HashMap<Integer, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, HashMap<Integer, Object>>((Map<Object, Map<Integer, HashMap<Integer, Object>>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<String, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, Object>, Object>(class0);
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(hashMap0, class1);
      Map<Object, Integer> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, Object>();
      Map<HashMap<Integer, Object>, Map<String, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Integer, Object>, String, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Object>, String, String>(map0);
      Map<Object, Map<Integer, Map<Map<HashMap<Object, Object>, Object>, String>>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Integer, Map<Map<HashMap<Object, Object>, Object>, String>> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, Map<Map<HashMap<Object, Object>, Object>, String>>(map1, class0);
      Map<Integer, Map<Map<HashMap<Object, Object>, Object>, String>> map2 = doubleKeyMap2.get((Object) doubleKeyMap0);
      assertNull(map2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0);
      Integer integer0 = new Integer(2798);
      Integer integer1 = new Integer(0);
      doubleKeyMap0.put(integer0, integer1, (Object) integer1);
      Integer integer2 = new Integer(2798);
      doubleKeyMap0.remove(integer0, integer2);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, Map<Map<HashMap<Object, Object>, Object>, Map<String, String>>> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, Map<Map<HashMap<Object, Object>, Object>, Map<String, String>>>();
      DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, String> doubleKeyMap1 = new DoubleKeyMap<Map<HashMap<Object, Object>, Object>, Object, String>();
      Map<HashMap<Object, Object>, Object> map0 = doubleKeyMap1.newMap();
      Object object0 = new Object();
      Map<Map<HashMap<Object, Object>, Object>, Map<String, String>> map1 = doubleKeyMap0.put(map0, object0, (Map<Map<HashMap<Object, Object>, Object>, Map<String, String>>) null);
      DoubleKeyMap<Map<HashMap<Object, Object>, Object>, String, String> doubleKeyMap2 = new DoubleKeyMap<Map<HashMap<Object, Object>, Object>, String, String>(map1);
      HashMap<HashMap<Object, Object>, Object> hashMap0 = new HashMap<HashMap<Object, Object>, Object>();
      String string0 = doubleKeyMap2.remove((Map<HashMap<Object, Object>, Object>) hashMap0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(2798);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>(class0);
      doubleKeyMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", integer0, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      String string0 = doubleKeyMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", integer0, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertEquals("us.codecraft.webmagic.utils.MultiKeyMapBase", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<String, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, Object>, Object>(class0);
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Object object0 = doubleKeyMap1.get((Object) doubleKeyMap0, "4iy");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(2798);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>(class0);
      doubleKeyMap0.put("", integer0, "");
      String string0 = doubleKeyMap0.get("", integer0);
      assertEquals("", string0);
  }
}
