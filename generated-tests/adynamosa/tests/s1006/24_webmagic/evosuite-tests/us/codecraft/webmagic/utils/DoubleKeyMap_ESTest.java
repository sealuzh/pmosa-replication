/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 06:35:51 GMT 2019
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
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      HashMap<Integer, Map<String, Object>> hashMap2 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap2);
      Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>> map0 = doubleKeyMap0.newMap();
      hashMap0.put(hashMap1, map0);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0, class0);
      Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>> map1 = doubleKeyMap1.remove(hashMap1);
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(554);
      DoubleKeyMap<Map<Object, String>, Integer, HashMap<Integer, Map<Object, String>>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, HashMap<Integer, Map<Object, String>>>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Integer, Map<Object, String>> hashMap1 = new HashMap<Integer, Map<Object, String>>();
      doubleKeyMap0.put((Map<Object, String>) hashMap0, integer0, hashMap1);
      Map<Integer, HashMap<Integer, Map<Object, String>>> map0 = doubleKeyMap0.remove((Map<Object, String>) hashMap0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      Map<Map<Object, String>, Map<HashMap<Integer, Map<Object, String>>, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer>(map0);
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>(2416, 2416);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Integer>(hashMap0, class0);
      Integer integer0 = doubleKeyMap2.remove((Object) "%%Wp", (Object) doubleKeyMap1);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<String, Integer>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<String, Integer>>(601);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Object>, String, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, String, Integer>(hashMap0, class0);
      Integer integer0 = doubleKeyMap0.remove((HashMap<Object, Object>) null, "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<String, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, String>, Object>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.remove(object0, hashMap0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Integer, Object>, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Map<Object, String>, Object>((Map<HashMap<Integer, Object>, Map<Map<Object, String>, Object>>) null);
      DoubleKeyMap<Object, Map<Object, String>, Map<Object, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Map<Object, Integer>>(class0);
      Map<Map<Object, String>, Map<Object, Integer>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Map<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Map<Object, Object>>();
      Object object0 = new Object();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.put((Integer) null, object0, (Map<Object, Object>) hashMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      Map<Map<Object, Map<Object, Integer>>, Map<Object, HashMap<Object, Map<Object, String>>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, Map<Object, Integer>>, Object, HashMap<Object, Map<Object, String>>> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Map<Object, Integer>>, Object, HashMap<Object, Map<Object, String>>>(map0, class0);
      Integer integer0 = new Integer(1961);
      Integer integer1 = doubleKeyMap0.put((Object) doubleKeyMap1, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, String>, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, String>, HashMap<Object, Object>>();
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>((Map<String, Map<Object, String>>) null);
      String string0 = doubleKeyMap1.get("k dJP8},}&n$U:", (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>();
      String string0 = doubleKeyMap0.get((Integer) null, (Object) "CgoX!]wS:h;1t\u0006");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Map<Integer, Object>> hashMap0 = new HashMap<String, Map<Integer, Object>>();
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(hashMap0);
      Map<Object, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(map0, class0);
      HashMap<Object, Map<String, Map<Object, String>>> hashMap1 = new HashMap<Object, Map<String, Map<Object, String>>>();
      DoubleKeyMap<Object, String, Map<Object, String>> doubleKeyMap2 = new DoubleKeyMap<Object, String, Map<Object, String>>(hashMap1);
      Map<Object, String> map1 = doubleKeyMap2.get((Object) doubleKeyMap1, "w");
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      HashMap<Object, Map<Map<String, String>, Map<Object, String>>> hashMap0 = new HashMap<Object, Map<Map<String, String>, Map<Object, String>>>();
      DoubleKeyMap<Object, Map<String, String>, Map<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, String>, Map<Object, String>>(hashMap0);
      Map<Map<String, String>, Map<Object, String>> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Map<String, Integer>> hashMap0 = new HashMap<Object, Map<String, Integer>>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>(hashMap0);
      Integer integer0 = new Integer(1362);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "us.codecraft.webmagic.utils.DoubleKeyMap", integer0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>>, HashMap<Object, Map<Object, String>>> doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>>, HashMap<Object, Map<Object, String>>>();
      Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>> map0 = doubleKeyMap0.newMap();
      HashMap<Object, Map<Object, String>> hashMap0 = new HashMap<Object, Map<Object, String>>();
      HashMap<String, Map<Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>>, HashMap<Object, Map<Object, String>>>> hashMap1 = new HashMap<String, Map<Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>>, HashMap<Object, Map<Object, String>>>>();
      DoubleKeyMap<String, Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>>, HashMap<Object, Map<Object, String>>> doubleKeyMap1 = new DoubleKeyMap<String, Map<Object, Map<HashMap<Map<Object, String>, String>, Integer>>, HashMap<Object, Map<Object, String>>>(hashMap1, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("*Qdl!PmCw+7Z3-", map0, hashMap0);
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
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Integer, Object>, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Map<Object, String>, Object>((Map<HashMap<Integer, Object>, Map<Map<Object, String>, Object>>) null);
      Map<Integer, Map<Map<String, Object>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Map<String, Object>, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<String, Object>, Object>(map0, class0);
      Map<Map<String, Object>, Object> map1 = doubleKeyMap1.get((Integer) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      HashMap<HashMap<String, Object>, HashMap<Map<Object, String>, Object>> hashMap2 = new HashMap<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>();
      HashMap<String, Object> hashMap3 = new HashMap<String, Object>();
      HashMap<Map<Object, String>, Object> hashMap4 = new HashMap<Map<Object, String>, Object>();
      hashMap2.put(hashMap3, hashMap4);
      hashMap0.put(hashMap1, hashMap2);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0, class0);
      doubleKeyMap0.remove(hashMap1, (HashMap<String, Object>) null);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      HashMap<Integer, Map<String, Object>> hashMap2 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap2);
      Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>> map0 = doubleKeyMap0.newMap();
      hashMap0.put(hashMap1, map0);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0, class0);
      HashMap<Map<Object, String>, Object> hashMap3 = new HashMap<Map<Object, String>, Object>();
      doubleKeyMap1.put(hashMap1, (HashMap<String, Object>) null, hashMap3);
      doubleKeyMap1.remove(hashMap1, (HashMap<String, Object>) null);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0, class0);
      HashMap<Map<Object, String>, Object> hashMap2 = doubleKeyMap0.get(hashMap1, (HashMap<String, Object>) null);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      HashMap<Integer, Map<String, Object>> hashMap2 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap2);
      Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>> map0 = doubleKeyMap0.newMap();
      hashMap0.put(hashMap1, map0);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0, class0);
      HashMap<Map<Object, String>, Object> hashMap3 = doubleKeyMap1.get(hashMap1, (HashMap<String, Object>) null);
      assertNull(hashMap3);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<Object, String>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, String>, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      Integer integer0 = new Integer(554);
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      doubleKeyMap1.put(integer0, "", (Object) doubleKeyMap0);
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
  }
}