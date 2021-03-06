/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 21:11:26 GMT 2019
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
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(class0);
      HashMap<String, Object> hashMap0 = doubleKeyMap0.remove("", (Object) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Map<Map<Map<String, Object>, Map<String, Object>>, Map<String, Object>>> hashMap0 = new HashMap<Integer, Map<Map<Map<String, Object>, Map<String, Object>>, Map<String, Object>>>();
      DoubleKeyMap<Integer, Map<Map<String, Object>, Map<String, Object>>, Map<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Map<String, Object>, Map<String, Object>>, Map<String, Object>>(hashMap0);
      HashMap<Map<String, Object>, Map<String, Object>> hashMap1 = new HashMap<Map<String, Object>, Map<String, Object>>();
      Map<String, Object> map0 = doubleKeyMap0.remove((Integer) null, (Map<Map<String, Object>, Map<String, Object>>) hashMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<String, String, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<Object, String>>();
      Map<HashMap<Integer, String>, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Integer, String>, Object, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, String>, Object, String>(map0);
      DoubleKeyMap<Object, Map<Map<String, Object>, String>, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Map<Map<String, Object>, String>, Object>();
      DoubleKeyMap<Integer, Map<Map<String, Object>, String>, String> doubleKeyMap3 = new DoubleKeyMap<Integer, Map<Map<String, Object>, String>, String>();
      Map<Map<String, Object>, String> map1 = doubleKeyMap3.newMap();
      Object object0 = doubleKeyMap2.remove((Object) doubleKeyMap1, map1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<Integer, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, Integer>, Object>((Map<Object, Map<HashMap<Integer, Integer>, Object>>) null, class0);
      Map<HashMap<Integer, Integer>, Object> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Map<Map<String, Object>, Integer>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Map<String, Object>, Integer>, String, Object>();
      HashMap<Map<String, Object>, Integer> hashMap0 = new HashMap<Map<String, Object>, Integer>();
      doubleKeyMap0.put((Map<Map<String, Object>, Integer>) hashMap0, "", (Object) null);
      Map<String, Object> map0 = doubleKeyMap0.remove((Map<Map<String, Object>, Integer>) hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0);
      DoubleKeyMap<Object, String, Object> doubleKeyMap2 = new DoubleKeyMap<Object, String, Object>(class0);
      Object object0 = doubleKeyMap2.put((Object) "@;oeQdkmC", "", (Object) doubleKeyMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Map<HashMap<Integer, Object>, Integer>> hashMap0 = new HashMap<String, Map<HashMap<Integer, Object>, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(map0, class0);
      Object object0 = new Object();
      String string0 = doubleKeyMap1.put(object0, (Object) hashMap0, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.get("6 ", object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<HashMap<String, String>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, String>, Map<Integer, Integer>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = doubleKeyMap0.get((String) null, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      HashMap<Object, Map<Map<String, Object>, Integer>> hashMap0 = new HashMap<Object, Map<Map<String, Object>, Integer>>();
      DoubleKeyMap<Object, Map<String, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, Object>, Integer>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Integer integer0 = doubleKeyMap0.get(object0, (Map<String, Object>) hashMap1);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<Integer, Object>, Map<Integer, String>>, Map<String, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<Integer, Object>, Map<Integer, String>>, Map<String, Object>, Integer>();
      Map<HashMap<Integer, Object>, Map<Integer, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Integer, Object>, Integer, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Object>, Integer, String>(map0);
      Map<Integer, String> map1 = doubleKeyMap1.get((HashMap<Integer, Object>) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, Object, HashMap<Object, Map<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, HashMap<Object, Map<String, Object>>>();
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      Map<Integer, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, integer0, integer0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>((Map<Integer, Map<Integer, String>>) null, class0);
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
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Integer, Integer>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
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
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      DoubleKeyMap<Object, Object, HashMap<Object, Map<String, Object>>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, Map<String, Object>>>();
      Map<Object, HashMap<Object, Map<String, Object>>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(class0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put("wrong proto type map ", (Object) "wrong proto type map ", hashMap0);
      HashMap<String, Object> hashMap1 = doubleKeyMap0.remove("wrong proto type map ", (Object) "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(class0);
      Integer integer0 = new Integer(1);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", (Object) integer0, hashMap0);
      Object object0 = new Object();
      HashMap<String, Object> hashMap1 = doubleKeyMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", object0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(class0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      doubleKeyMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", object0, hashMap0);
      HashMap<String, Object> hashMap1 = doubleKeyMap0.remove("us.codecraft.webmagic.utils.MultiKeyMapBase", object0);
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, Map<String, Map<String, Map<String, Object>>>> hashMap0 = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, String, Map<String, Map<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<String, String, Map<String, Map<String, Object>>>(hashMap0, class0);
      HashMap<String, Map<String, Object>> hashMap1 = new HashMap<String, Map<String, Object>>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((String) null, (String) null, (Map<String, Map<String, Object>>) hashMap1);
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
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = doubleKeyMap0.get("", (Object) null);
      assertNull(object0);
  }
}
