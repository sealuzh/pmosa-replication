/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 06:42:45 GMT 2019
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
      HashMap<Map<Map<Object, String>, String>, Map<Map<Object, Object>, HashMap<Integer, Object>>> hashMap0 = new HashMap<Map<Map<Object, String>, String>, Map<Map<Object, Object>, HashMap<Integer, Object>>>();
      HashMap<Integer, Map<String, Integer>> hashMap1 = new HashMap<Integer, Map<String, Integer>>();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>(hashMap1);
      Map<Map<Object, String>, String> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<String, String>, Object, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, String>, Object, String>();
      Map<Map<Object, Object>, HashMap<Integer, Object>> map1 = doubleKeyMap1.newMap();
      hashMap0.put(map0, map1);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Map<Object, String>, String>, Map<Object, Object>, HashMap<Integer, Object>> doubleKeyMap2 = new DoubleKeyMap<Map<Map<Object, String>, String>, Map<Object, Object>, HashMap<Integer, Object>>(hashMap0, class0);
      Map<Map<Object, Object>, HashMap<Integer, Object>> map2 = doubleKeyMap2.remove(map0);
      assertTrue(map2.isEmpty());
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
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0);
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      HashMap<Map<Object, String>, Object> hashMap2 = new HashMap<Map<Object, String>, Object>();
      doubleKeyMap0.put(hashMap1, (HashMap<String, Object>) null, hashMap2);
      HashMap<Map<Object, String>, Object> hashMap3 = doubleKeyMap0.get(hashMap1, (HashMap<String, Object>) null);
      assertTrue(hashMap3.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Integer>, String>();
      String string0 = doubleKeyMap0.remove("f2n", (HashMap<String, Integer>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Object, Map<String, Map<Object, String>>> hashMap0 = new HashMap<Object, Map<String, Map<Object, String>>>();
      DoubleKeyMap<Object, String, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<Object, String>>(hashMap0, class0);
      Map<Object, String> map0 = doubleKeyMap0.remove((Object) null, "wrong proto type map ");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Map<Object, String>, String>, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Map<Object, String>, String>, Map<Object, Integer>>();
      DoubleKeyMap<Object, Map<Object, String>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Object>();
      Map<Object, String> map0 = doubleKeyMap1.newMap();
      Object object0 = doubleKeyMap1.remove((Object) doubleKeyMap0, map0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      HashMap<Object, Map<Map<Object, String>, Object>> hashMap0 = new HashMap<Object, Map<Map<Object, String>, Object>>();
      DoubleKeyMap<Object, Map<Object, String>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Object>(hashMap0);
      Map<Map<Object, String>, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, Object, Object>();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Object object0 = doubleKeyMap0.put(hashMap0, (Object) hashMap0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Integer integer0 = new Integer((-2167));
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.put((Map<Object, String>) hashMap0, integer0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<String, Map<Object, Map<Object, String>>> hashMap1 = new HashMap<String, Map<Object, Map<Object, String>>>();
      HashMap<Object, Map<Map<Object, String>, Object>> hashMap2 = new HashMap<Object, Map<Map<Object, String>, Object>>();
      DoubleKeyMap<Object, Map<Object, String>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Object>(hashMap2);
      Object object0 = doubleKeyMap1.put((Object) doubleKeyMap0, (Map<Object, String>) hashMap0, (Object) hashMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>> hashMap0 = new HashMap<HashMap<String, Map<Object, String>>, Map<HashMap<String, Object>, HashMap<Map<Object, String>, Object>>>();
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, Object>, HashMap<Map<Object, String>, Object>>(hashMap0);
      HashMap<String, Map<Object, String>> hashMap1 = new HashMap<String, Map<Object, String>>();
      HashMap<Map<Object, String>, Object> hashMap2 = doubleKeyMap0.get(hashMap1, (HashMap<String, Object>) null);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Map<Map<HashMap<String, String>, Map<Object, String>>, Object>> hashMap0 = new HashMap<String, Map<Map<HashMap<String, String>, Map<Object, String>>, Object>>();
      DoubleKeyMap<String, Map<HashMap<String, String>, Map<Object, String>>, Object> doubleKeyMap0 = new DoubleKeyMap<String, Map<HashMap<String, String>, Map<Object, String>>, Object>(hashMap0);
      Map<HashMap<String, String>, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, String>, Object, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, String>, Object, String>(map0, class0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Object object0 = new Object();
      String string0 = doubleKeyMap1.get(hashMap1, object0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(class0);
      String string0 = doubleKeyMap0.get((Integer) null, (Object) "CgoX!]wS:h;1t\u0006");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Integer>, String>();
      DoubleKeyMap<String, HashMap<Object, Object>, String> doubleKeyMap1 = new DoubleKeyMap<String, HashMap<Object, Object>, String>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, String, Object> doubleKeyMap2 = new DoubleKeyMap<Object, String, Object>(map0);
      Object object0 = doubleKeyMap2.get((Object) doubleKeyMap0, "*VPl*M");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Integer, Object>, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Map<Object, String>, Object>((Map<HashMap<Integer, Object>, Map<Map<Object, String>, Object>>) null);
      Map<Integer, Map<Map<String, Object>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Map<String, Object>, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<String, Object>, Object>(map0, class0);
      Map<Map<String, Object>, Object> map1 = doubleKeyMap1.get((Integer) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Integer>, String>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Map<Object, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      HashMap<String, Map<HashMap<Object, String>, String>> hashMap0 = new HashMap<String, Map<HashMap<Object, String>, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, String>(hashMap0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((String) null, (HashMap<Object, String>) null, "B;CN<X\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>((Map<Object, Map<Integer, Object>>) null, class0);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>(class0);
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
      DoubleKeyMap<String, HashMap<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Integer>, String>();
      Map<HashMap<String, Integer>, String> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      Map<Map<Object, String>, Map<HashMap<Integer, Map<Object, String>>, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer>(map0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Integer, Map<Object, String>> hashMap1 = new HashMap<Integer, Map<Object, String>>();
      hashMap1.put((Integer) null, hashMap0);
      Integer integer0 = new Integer(0);
      doubleKeyMap1.put((Map<Object, String>) hashMap0, hashMap1, integer0);
      HashMap<Integer, Map<Object, String>> hashMap2 = new HashMap<Integer, Map<Object, String>>();
      doubleKeyMap1.remove((Map<Object, String>) hashMap0, hashMap2);
      assertEquals(1, map0.size());
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      Map<Map<Object, String>, Map<HashMap<Integer, Map<Object, String>>, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer>(map0);
      HashMap<String, Map<Object, HashMap<Object, Integer>>> hashMap0 = new HashMap<String, Map<Object, HashMap<Object, Integer>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, HashMap<Object, Integer>> doubleKeyMap2 = new DoubleKeyMap<String, Object, HashMap<Object, Integer>>(hashMap0, class0);
      HashMap<Object, Integer> hashMap1 = doubleKeyMap2.remove("", (Object) doubleKeyMap1);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Integer>, String>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, String>();
      Integer integer0 = new Integer(2071);
      doubleKeyMap1.put(integer0, (Object) null, "EPfl");
      String string0 = doubleKeyMap1.put(integer0, (Object) doubleKeyMap0, "I$2VEU@[%v|,52foS~");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, String, Object>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      Map<Map<Object, String>, Map<HashMap<Integer, Map<Object, String>>, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, HashMap<Integer, Map<Object, String>>, Integer>(map0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Integer, Map<Object, String>> hashMap1 = new HashMap<Integer, Map<Object, String>>();
      Integer integer0 = new Integer(0);
      doubleKeyMap1.put((Map<Object, String>) hashMap0, hashMap1, integer0);
      assertFalse(map0.isEmpty());
      
      doubleKeyMap1.remove((Map<Object, String>) hashMap0, hashMap1);
      assertEquals(0, map0.size());
  }
}
