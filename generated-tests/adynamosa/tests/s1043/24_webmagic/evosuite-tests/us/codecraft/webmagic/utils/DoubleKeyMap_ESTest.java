/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:48:25 GMT 2019
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
      HashMap<Map<Integer, String>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, String>, Map<String, Object>>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap0.put((Map<Integer, String>) null, hashMap1);
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Object>(hashMap0);
      Map<String, Object> map0 = doubleKeyMap0.remove((Map<Integer, String>) null);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      Integer integer0 = new Integer(2469);
      doubleKeyMap0.put("", "", (Object) integer0);
      Map<String, Object> map0 = doubleKeyMap0.remove("");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, Map<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Map<Integer, String>, String>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      doubleKeyMap0.put((Map<Object, Object>) hashMap0, (Map<Integer, String>) null, "ca&m!o2x)");
      String string0 = doubleKeyMap0.put((Map<Object, Object>) hashMap0, (Map<Integer, String>) null, (String) null);
      assertEquals("ca&m!o2x)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<String, Object>, Map<Map<Integer, String>, Map<Integer, String>>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Map<Integer, String>, Map<Integer, String>>>();
      DoubleKeyMap<HashMap<String, Object>, Map<Integer, String>, Map<Integer, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Map<Integer, String>, Map<Integer, String>>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<Map<Integer, String>, Map<Integer, String>> hashMap2 = new HashMap<Map<Integer, String>, Map<Integer, String>>();
      hashMap0.put(hashMap1, hashMap2);
      Map<Map<Integer, String>, Map<Integer, String>> map0 = doubleKeyMap0.get(hashMap1);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, String>();
      DoubleKeyMap<HashMap<String, String>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, String>, Object, Integer>((Map<HashMap<String, String>, Map<Object, Integer>>) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Integer integer0 = doubleKeyMap1.remove(hashMap0, (Object) doubleKeyMap0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0, class0);
      String string0 = doubleKeyMap0.remove((Object) null, "SPq7Psk");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      Map<Object, Map<Map<Object, String>, Map<Integer, Object>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Object, String>, Map<Integer, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Map<Integer, Object>>(map0, class0);
      Map<Map<Object, String>, Map<Integer, Object>> map1 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Object, Object>>();
      Map<String, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(map0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.put("'", (Object) null, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Integer, String>, String, HashMap<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, HashMap<String, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      DoubleKeyMap<HashMap<Object, Object>, Object, HashMap<Map<Integer, String>, Object>> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Object>, Object, HashMap<Map<Integer, String>, Object>>(class0);
      HashMap<Map<Integer, String>, Object> hashMap1 = new HashMap<Map<Integer, String>, Object>();
      HashMap<Map<Integer, String>, Object> hashMap2 = doubleKeyMap1.put(hashMap0, (Object) doubleKeyMap0, hashMap1);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) doubleKeyMap0, "h;h]Q%PQ`Z'!fQK]", "wrong proto type map ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Integer>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, String, Object>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Object object0 = doubleKeyMap0.get(hashMap0, (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, String, Map<HashMap<Object, Object>, Map<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<HashMap<Object, Object>, Map<String, Object>>>();
      Map<HashMap<Object, Object>, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Object>, String, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Object>, String, Object>(map0, class0);
      DoubleKeyMap<Object, Object, HashMap<String, String>> doubleKeyMap2 = new DoubleKeyMap<Object, Object, HashMap<String, String>>();
      HashMap<String, String> hashMap0 = doubleKeyMap2.get((Object) map0, (Object) doubleKeyMap1);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Integer integer0 = doubleKeyMap1.get((Object) doubleKeyMap0, "Yv:-/fkN*:~");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Map<Integer, String>, String, Map<Map<Integer, String>, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Map<Map<Integer, String>, String>>();
      Map<String, Map<Map<Integer, String>, String>> map0 = doubleKeyMap0.get((Map<Integer, String>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, String>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, String>, String, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Integer>((Map<Map<Integer, String>, Map<String, Integer>>) null, class0);
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
      DoubleKeyMap<Map<Object, Object>, Map<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Map<Integer, String>, String>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
      doubleKeyMap0.put((Map<Object, Object>) hashMap0, (Map<Integer, String>) hashMap1, "2%");
      String string0 = doubleKeyMap0.remove((Map<Object, Object>) hashMap0, (Map<Integer, String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      DoubleKeyMap<Object, Map<Object, Map<Integer, String>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, Map<Integer, String>>, Integer>();
      HashMap<Object, Map<Integer, String>> hashMap0 = new HashMap<Object, Map<Integer, String>>();
      Integer integer0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Map<Object, Map<Integer, String>>) hashMap0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<Map<Integer, String>, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, Integer, String>();
      doubleKeyMap0.put((Map<Integer, String>) null, (Integer) null, "{i&kx{");
      Integer integer0 = new Integer(1318);
      String string0 = doubleKeyMap0.get((Map<Integer, String>) null, integer0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Integer, String>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Integer>(class0);
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
      DoubleKeyMap<Map<Object, Object>, Map<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Map<Integer, String>, String>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      doubleKeyMap0.put((Map<Object, Object>) hashMap0, (Map<Integer, String>) null, "5>mwZ'LWBAawlw\"n;I");
      String string0 = doubleKeyMap0.remove((Map<Object, Object>) hashMap0, (Map<Integer, String>) null);
      assertEquals("5>mwZ'LWBAawlw\"n;I", string0);
  }
}
