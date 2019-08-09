/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 07:54:51 GMT 2019
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
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<String, Map<String, HashMap<Integer, Object>>> hashMap2 = new HashMap<String, Map<String, HashMap<Integer, Object>>>();
      DoubleKeyMap<String, String, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<Integer, Object>>(hashMap2);
      Map<String, String> map0 = doubleKeyMap0.newMap();
      HashMap<String, String> hashMap3 = new HashMap<String, String>(map0);
      hashMap3.put("", "");
      hashMap0.put(hashMap1, hashMap3);
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(hashMap0);
      doubleKeyMap1.remove((Object) hashMap2, "");
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0, class0);
      DoubleKeyMap<String, Map<Object, String>, Object> doubleKeyMap1 = new DoubleKeyMap<String, Map<Object, String>, Object>((Map<String, Map<Map<Object, String>, Object>>) null, class0);
      Map<String, Object> map0 = doubleKeyMap1.newMap();
      hashMap0.put(integer0, map0);
      Map<String, Object> map1 = doubleKeyMap0.remove(integer0);
      assertTrue(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, String, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, String, String>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      doubleKeyMap0.put((Map<Object, String>) hashMap0, "pDz /clO)-I<Q+", "");
      Map<String, String> map0 = doubleKeyMap0.remove((Map<Object, String>) hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Map<String, Object>> hashMap0 = new HashMap<String, Map<String, Object>>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", hashMap1);
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>(hashMap0);
      Map<String, Object> map0 = doubleKeyMap0.get("us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, integer0);
      Map<Integer, Integer> map0 = doubleKeyMap0.get(integer0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Map<Map<Object, String>, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Map<Map<Object, String>, String>, Object>();
      HashMap<Map<Object, String>, Map<String, String>> hashMap0 = new HashMap<Map<Object, String>, Map<String, String>>();
      DoubleKeyMap<Map<Object, String>, String, String> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, String, String>(hashMap0);
      Map<Map<Object, String>, String> map0 = doubleKeyMap1.newMap();
      Object object0 = doubleKeyMap0.remove((Map<Object, String>) null, map0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, Map<Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>>> hashMap0 = new HashMap<Object, Map<Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>>>();
      DoubleKeyMap<Object, Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>>(hashMap0);
      Map<HashMap<Object, String>, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, String>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, String>, Object, Object>(map0, class0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(hashMap1, object0, (Object) ":b`M! J`J+rd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      DoubleKeyMap<String, String, Object> doubleKeyMap1 = new DoubleKeyMap<String, String, Object>(class0);
      Object object0 = doubleKeyMap1.put((String) null, "", (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, Map<HashMap<Object, Object>, Object>> hashMap0 = new HashMap<Object, Map<HashMap<Object, Object>, Object>>();
      DoubleKeyMap<Object, HashMap<Object, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Object>, Object>(hashMap0);
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Map<String, String>> hashMap1 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(hashMap1, class0);
      String string0 = doubleKeyMap1.put((Object) doubleKeyMap0, (String) null, "XbG{EG3T`8KD[(@");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = doubleKeyMap0.get((Object) null, (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Integer, String, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, HashMap<Object, Object>>();
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Object, Integer, Map<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Map<Object, Object>>();
      Map<Object, Object> map0 = doubleKeyMap1.get((Object) doubleKeyMap0, integer0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Map<Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>>> hashMap0 = new HashMap<Object, Map<Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>>>();
      DoubleKeyMap<Object, Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<HashMap<Object, String>, Map<Object, Object>>, HashMap<String, String>>(hashMap0);
      Map<HashMap<Object, String>, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, String>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, String>, Object, Object>(map0, class0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      Object object0 = doubleKeyMap1.remove(hashMap1, (Object) doubleKeyMap0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(hashMap1, object0, (Object) ":b`M! J`J+rd");
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
      DoubleKeyMap<Integer, HashMap<Object, Integer>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, Integer>, Integer>((Map<Integer, Map<HashMap<Object, Integer>, Integer>>) null, class0);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>(class0);
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
      HashMap<Integer, Map<HashMap<String, String>, HashMap<Map<Object, String>, Integer>>> hashMap0 = new HashMap<Integer, Map<HashMap<String, String>, HashMap<Map<Object, String>, Integer>>>();
      DoubleKeyMap<Integer, HashMap<String, String>, HashMap<Map<Object, String>, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<String, String>, HashMap<Map<Object, String>, Integer>>(hashMap0, class0);
      Map<HashMap<String, String>, HashMap<Map<Object, String>, Integer>> map0 = doubleKeyMap0.remove((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      Map<Integer, Integer> map0 = doubleKeyMap0.get((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, (Integer) null, (Integer) null);
      Integer integer1 = doubleKeyMap0.remove(integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap0.remove(integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0, class0);
      Integer integer0 = new Integer(1);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>(1);
      hashMap0.put(integer0, hashMap1);
      Object object0 = doubleKeyMap0.put(integer0, integer0, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      DoubleKeyMap<String, Map<Object, String>, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, String>, Map<Integer, Object>>((Map<String, Map<Map<Object, String>, Map<Integer, Object>>>) null);
      DoubleKeyMap<Integer, Map<HashMap<Object, String>, Map<Object, String>>, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<HashMap<Object, String>, Map<Object, String>>, HashMap<Object, Object>>();
      Map<HashMap<Object, String>, Map<Object, String>> map0 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, String>, Object, String> doubleKeyMap2 = new DoubleKeyMap<HashMap<Object, String>, Object, String>(map0, class0);
      String string0 = doubleKeyMap2.get(hashMap0, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      HashMap<String, Map<Map<Object, String>, Object>> hashMap1 = new HashMap<String, Map<Map<Object, String>, Object>>();
      DoubleKeyMap<String, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, String>, Object>(hashMap1);
      Map<String, Object> map0 = doubleKeyMap0.newMap();
      hashMap0.put(integer0, map0);
      DoubleKeyMap<Integer, String, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Object>(hashMap0, class0);
      Object object0 = doubleKeyMap1.get(integer0, "h?SI&");
      assertNull(object0);
  }
}
