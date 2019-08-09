/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 02:39:58 GMT 2019
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
      HashMap<Map<Object, String>, Map<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>> hashMap0 = new HashMap<Map<Object, String>, Map<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>> hashMap2 = new HashMap<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>();
      HashMap<Object, Map<Object, Integer>> hashMap3 = new HashMap<Object, Map<Object, Integer>>();
      HashMap<Integer, Object> hashMap4 = new HashMap<Integer, Object>();
      hashMap2.put(hashMap3, hashMap4);
      hashMap0.put(hashMap1, hashMap2);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>(hashMap0, class0);
      HashMap<Integer, Object> hashMap5 = doubleKeyMap0.remove((Map<Object, String>) hashMap1, hashMap3);
      assertEquals(0, hashMap0.size());
      assertSame(hashMap5, hashMap4);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      HashMap<HashMap<Integer, String>, Map<String, Integer>> hashMap1 = new HashMap<HashMap<Integer, String>, Map<String, Integer>>();
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      hashMap1.put(hashMap0, hashMap2);
      DoubleKeyMap<HashMap<Integer, String>, String, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, String>, String, Integer>(hashMap1, class0);
      Map<String, Integer> map0 = doubleKeyMap0.remove(hashMap0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Map<Object, String>, Map<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>> hashMap0 = new HashMap<Map<Object, String>, Map<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>> hashMap2 = new HashMap<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>();
      HashMap<Object, Map<Object, Integer>> hashMap3 = new HashMap<Object, Map<Object, Integer>>();
      HashMap<Integer, Object> hashMap4 = new HashMap<Integer, Object>();
      HashMap<Integer, Object> hashMap5 = hashMap2.put(hashMap3, hashMap4);
      hashMap0.put(hashMap1, hashMap2);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>(hashMap0, class0);
      doubleKeyMap0.put((Map<Object, String>) hashMap1, hashMap3, hashMap5);
      assertEquals(1, hashMap2.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<String, Map<Object, Integer>>, Map<String, String>> hashMap0 = new HashMap<HashMap<String, Map<Object, Integer>>, Map<String, String>>();
      HashMap<String, Map<Object, Integer>> hashMap1 = new HashMap<String, Map<Object, Integer>>();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      hashMap0.put(hashMap1, hashMap2);
      DoubleKeyMap<HashMap<String, Map<Object, Integer>>, String, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, Integer>>, String, String>(hashMap0);
      Map<String, String> map0 = doubleKeyMap0.get(hashMap1);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Integer, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Integer, Object>, Integer>();
      Integer integer0 = new Integer(0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      doubleKeyMap0.put(integer0, hashMap0, integer0);
      Integer integer1 = new Integer(0);
      Map<HashMap<Integer, Object>, Integer> map0 = doubleKeyMap0.get(integer1);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Map<Object, Map<String, Map<Object, Integer>>>> hashMap0 = new HashMap<String, Map<Object, Map<String, Map<Object, Integer>>>>();
      DoubleKeyMap<String, Object, Map<String, Map<Object, Integer>>> doubleKeyMap0 = new DoubleKeyMap<String, Object, Map<String, Map<Object, Integer>>>(hashMap0);
      Object object0 = new Object();
      Map<String, Map<Object, Integer>> map0 = doubleKeyMap0.remove((String) null, object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>();
      Map<Object, Integer> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Map<Object, Map<String, HashMap<Integer, String>>>, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Map<String, HashMap<Integer, String>>>, Integer, String>();
      Map<Object, Map<String, HashMap<Integer, String>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<Object, String, HashMap<Integer, String>>(map0);
      Map<String, HashMap<Integer, String>> map1 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer((-186));
      DoubleKeyMap<HashMap<Object, Object>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, String, Object>(class0);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, Object>();
      Object object0 = doubleKeyMap1.put(integer0, integer0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Object, Integer>, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap0.put((Map<Object, Integer>) null, (Object) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>(class0);
      Integer integer0 = new Integer((-186));
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap0, class0);
      String string0 = doubleKeyMap0.put((Object) doubleKeyMap1, integer0, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null);
      Integer integer0 = doubleKeyMap0.get("dHHVdN<v^v6\t>\"+U!", object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Map<Object, Integer>, Map<Object, HashMap<Object, Object>>> hashMap0 = new HashMap<Map<Object, Integer>, Map<Object, HashMap<Object, Object>>>();
      DoubleKeyMap<Map<Object, Integer>, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, HashMap<Object, Object>>(hashMap0);
      DoubleKeyMap<Object, Integer, Map<Object, Map<Object, HashMap<Object, Object>>>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Map<Object, Map<Object, HashMap<Object, Object>>>>();
      Map<Object, Map<Object, HashMap<Object, Object>>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Object, HashMap<Object, Object>> doubleKeyMap2 = new DoubleKeyMap<Object, Object, HashMap<Object, Object>>(map0);
      HashMap<Object, Object> hashMap1 = doubleKeyMap2.get((Object) doubleKeyMap0, (Object) hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      DoubleKeyMap<Object, Map<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Object, Integer>, String>();
      Map<Map<Object, Integer>, String> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      HashMap<Map<Object, Integer>, Map<Object, HashMap<Object, Object>>> hashMap2 = new HashMap<Map<Object, Integer>, Map<Object, HashMap<Object, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, Integer>, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, HashMap<Object, Object>>(hashMap2, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Map<Object, Integer>) hashMap0, object0, hashMap1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<Object, Integer>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, Integer>, String>((Map<String, Map<Map<Object, Integer>, String>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>((Map<String, Map<HashMap<Object, Integer>, String>>) null);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer((-2506));
      doubleKeyMap0.put("", hashMap0, "");
      hashMap0.put(class0, integer0);
      String string0 = doubleKeyMap0.remove("", hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      HashMap<HashMap<Integer, String>, Map<String, Integer>> hashMap1 = new HashMap<HashMap<Integer, String>, Map<String, Integer>>();
      HashMap<String, Map<Integer, Object>> hashMap2 = new HashMap<String, Map<Integer, Object>>();
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(hashMap2);
      Map<String, Integer> map0 = doubleKeyMap0.newMap();
      hashMap1.put(hashMap0, map0);
      DoubleKeyMap<HashMap<Integer, String>, String, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, String>, String, Integer>(hashMap1, class0);
      Integer integer0 = doubleKeyMap1.get(hashMap0, "\fk!f?");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, Integer>, String, Map<HashMap<String, String>, Map<HashMap<Integer, String>, String>>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, String, Map<HashMap<String, String>, Map<HashMap<Integer, String>, String>>>(class0);
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
      HashMap<String, Map<Integer, Map<Object, Integer>>> hashMap0 = new HashMap<String, Map<Integer, Map<Object, Integer>>>();
      DoubleKeyMap<String, Integer, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Map<Object, Integer>>(hashMap0);
      Map<Integer, Map<Object, Integer>> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Map<Object, String>, Map<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>> hashMap0 = new HashMap<Map<Object, String>, Map<HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, Map<Object, Integer>>, HashMap<Integer, Object>>(hashMap0, class0);
      HashMap<Object, Map<String, Map<Object, Integer>>> hashMap1 = new HashMap<Object, Map<String, Map<Object, Integer>>>();
      DoubleKeyMap<Object, String, Map<Object, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, String, Map<Object, Integer>>(hashMap1);
      Map<Object, Integer> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer0);
      Map<Integer, Integer> map0 = doubleKeyMap0.remove(integer0);
      assertEquals(1, map0.size());
  }
}