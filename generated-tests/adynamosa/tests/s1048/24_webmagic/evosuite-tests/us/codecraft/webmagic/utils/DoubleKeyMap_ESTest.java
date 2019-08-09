/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 07:31:33 GMT 2019
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
      DoubleKeyMap<HashMap<Integer, Integer>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Integer>, Integer, Object>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(1);
      doubleKeyMap0.put(hashMap0, integer0, (Object) integer0);
      Object object0 = doubleKeyMap0.remove(hashMap0, integer0);
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>();
      Integer integer0 = new Integer((-1));
      doubleKeyMap0.put("", integer0, "");
      Map<Integer, String> map0 = doubleKeyMap0.get("");
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap0);
      Integer integer0 = new Integer((-1047));
      String string0 = doubleKeyMap0.remove(integer0, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object>();
      DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>>();
      HashMap<HashMap<String, String>, Object> hashMap0 = new HashMap<HashMap<String, String>, Object>();
      Object object0 = doubleKeyMap0.remove((Map<HashMap<String, String>, Object>) hashMap0, (Object) doubleKeyMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>();
      Map<Map<HashMap<String, String>, Object>, Map<String, Map<HashMap<String, String>, Object>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<HashMap<String, String>, Object>, String, Map<HashMap<String, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<Map<HashMap<String, String>, Object>, String, Map<HashMap<String, String>, Object>>(map0, class0);
      Map<HashMap<String, String>, Object> map1 = doubleKeyMap1.remove((Map<HashMap<String, String>, Object>) null, "");
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, String>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, Object, Object>();
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>();
      HashMap<Object, Object> hashMap0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "iO!agUA4?");
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, Integer>();
      Map<Object, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(map0, class0);
      Map<String, Integer> map1 = doubleKeyMap1.remove((Object) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, Integer>();
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>();
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Object, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, HashMap<String, String>>();
      Map<Integer, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(map0);
      Integer integer0 = new Integer((-1297));
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.put(integer0, object0, (Object) null);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Object, Map<Object, HashMap<Object, Map<HashMap<String, String>, Object>>>>, Object, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Map<Object, HashMap<Object, Map<HashMap<String, String>, Object>>>>, Object, String>();
      Map<Object, Map<Object, HashMap<Object, Map<HashMap<String, String>, Object>>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, HashMap<Object, Map<HashMap<String, String>, Object>>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, Map<HashMap<String, String>, Object>>>(map0, class0);
      HashMap<Object, Map<HashMap<String, String>, Object>> hashMap0 = new HashMap<Object, Map<HashMap<String, String>, Object>>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) doubleKeyMap0, (Object) null, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      Map<String, Map<Object, HashMap<String, Object>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap1 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(map0, class0);
      Object object0 = new Object();
      HashMap<String, Object> hashMap0 = doubleKeyMap1.get("", object0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      Integer integer0 = doubleKeyMap0.get((Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      DoubleKeyMap<Object, HashMap<Object, String>, String> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Object, String>, String>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      String string0 = doubleKeyMap1.get((Object) doubleKeyMap0, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<String, Object>, String, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, String, String>(class0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Map<String, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<HashMap<String, String>, Object> hashMap0 = new HashMap<HashMap<String, String>, Object>();
      HashMap<String, Map<Object, Map<HashMap<String, String>, Object>>> hashMap1 = new HashMap<String, Map<Object, Map<HashMap<String, String>, Object>>>();
      DoubleKeyMap<String, Object, Map<HashMap<String, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, Map<HashMap<String, String>, Object>>(hashMap1);
      Map<Map<HashMap<String, String>, Object>, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Map<HashMap<String, String>, Object>) hashMap0, (Object) hashMap0, (Object) doubleKeyMap0);
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
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object>();
      DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>>();
      Map<HashMap<String, String>, Object> map0 = doubleKeyMap1.newMap();
      HashMap<HashMap<String, String>, Object> hashMap0 = new HashMap<HashMap<String, String>, Object>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put(hashMap1, doubleKeyMap1);
      doubleKeyMap0.put(map0, (Object) hashMap0, (Object) map0);
      HashMap<HashMap<String, String>, Object> hashMap2 = new HashMap<HashMap<String, String>, Object>();
      Object object0 = doubleKeyMap0.remove((Map<HashMap<String, String>, Object>) hashMap2, (Object) hashMap2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>>();
      HashMap<HashMap<String, String>, Object> hashMap0 = new HashMap<HashMap<String, String>, Object>();
      doubleKeyMap0.put("", "", (Map<HashMap<String, String>, Object>) hashMap0);
      Map<HashMap<String, String>, Object> map0 = doubleKeyMap0.put("", "", (Map<HashMap<String, String>, Object>) hashMap0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, Integer>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Integer>, Integer, Object>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      doubleKeyMap0.put(hashMap0, (Integer) null, (Object) "iDLJMr:i{6+n09=+");
      Object object0 = doubleKeyMap0.get(hashMap0, (Integer) null);
      assertEquals("iDLJMr:i{6+n09=+", object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, String>, String, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, String, String>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Map<String, String>> hashMap0 = new HashMap<Integer, Map<String, String>>();
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(hashMap0);
      Integer integer0 = new Integer(1399);
      doubleKeyMap0.put(integer0, "", "");
      Map<String, String> map0 = doubleKeyMap0.remove(integer0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<String, String>, Object>, Object, Object>();
      DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<String, String, Map<HashMap<String, String>, Object>>();
      Map<HashMap<String, String>, Object> map0 = doubleKeyMap1.newMap();
      HashMap<HashMap<String, String>, Object> hashMap0 = new HashMap<HashMap<String, String>, Object>();
      doubleKeyMap0.put(map0, (Object) hashMap0, (Object) map0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.remove((Map<HashMap<String, String>, Object>) hashMap0, (Object) hashMap0);
      assertTrue(hashMap1.isEmpty());
  }
}