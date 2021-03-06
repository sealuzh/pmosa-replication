/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 09:20:08 GMT 2019
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
      HashMap<HashMap<String, Object>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Integer, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Integer, Integer>(hashMap0, class0);
      HashMap<Object, Map<String, Object>> hashMap1 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap1);
      Map<Integer, Integer> map0 = doubleKeyMap1.newMap();
      hashMap0.put((HashMap<String, Object>) null, map0);
      Map<Integer, Integer> map1 = doubleKeyMap0.remove((HashMap<String, Object>) null);
      assertEquals(0, map1.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Map<Object, String>, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Map<Object, String>, Object>, String>();
      String string0 = doubleKeyMap0.remove("GPELJmJ|Lx`!=cI'", (HashMap<Map<Object, String>, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, String>();
      DoubleKeyMap<HashMap<Object, String>, Object, HashMap<Map<Object, String>, Integer>> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, String>, Object, HashMap<Map<Object, String>, Integer>>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Map<Object, String>, Integer> hashMap1 = doubleKeyMap1.remove(hashMap0, (Object) doubleKeyMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Map<Object, String>, Map<Object, Object>> hashMap0 = new HashMap<Map<Object, String>, Map<Object, Object>>(0);
      DoubleKeyMap<Map<Object, String>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Object, Object>(hashMap0);
      Object object0 = doubleKeyMap0.remove((Map<Object, String>) null, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Map<Integer, Integer>, Map<Object, Object>> hashMap0 = new HashMap<Map<Integer, Integer>, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Integer>, Object, Object>(hashMap0, class0);
      HashMap<Object, Map<String, Object>> hashMap1 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap1);
      Object object0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "us.codecraft.webmagic.utils.DoubleKeyMap");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Object>, String>();
      Map<Integer, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Object>(map0, class0);
      HashMap<Object, Map<Object, Map<String, Object>>> hashMap0 = new HashMap<Object, Map<Object, Map<String, Object>>>();
      DoubleKeyMap<Object, Object, Map<String, Object>> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Map<String, Object>>(hashMap0, class0);
      Map<Object, Map<String, Object>> map1 = doubleKeyMap2.remove((Object) doubleKeyMap1);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<String, String>> hashMap0 = new HashMap<Integer, Map<String, String>>();
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(hashMap0, class0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(integer0, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Object>, String>();
      Map<Integer, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.put((Object) map0, (Object) "rV%qLp*Hh`=p@fJx{7", object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      Map<Integer, Map<HashMap<Object, String>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, HashMap<Object, String>, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, HashMap<Object, String>, Object>(map0);
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>((Map<String, Map<Object, String>>) null);
      String string0 = doubleKeyMap2.put("", (Object) doubleKeyMap1, ";k");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, HashMap<Integer, String>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Integer, String>, HashMap<String, String>>();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>(0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<String, String> hashMap2 = doubleKeyMap0.put((Map<Object, String>) null, hashMap0, hashMap1);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<HashMap<Map<Object, String>, Object>, Map<Map<Integer, Map<Object, Integer>>, HashMap<String, Map<Object, String>>>> hashMap0 = new HashMap<HashMap<Map<Object, String>, Object>, Map<Map<Integer, Map<Object, Integer>>, HashMap<String, Map<Object, String>>>>();
      DoubleKeyMap<HashMap<Map<Object, String>, Object>, Map<Integer, Map<Object, Integer>>, HashMap<String, Map<Object, String>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, String>, Object>, Map<Integer, Map<Object, Integer>>, HashMap<String, Map<Object, String>>>(hashMap0);
      Map<Integer, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Integer>(map0, class0);
      Integer integer0 = new Integer(1);
      Integer integer1 = doubleKeyMap1.get(integer0, (Object) doubleKeyMap0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>>, Object, Object>(class0);
      Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>(map0);
      Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>> map1 = doubleKeyMap1.newMap();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<HashMap<Object, String>, HashMap<Integer, Object>, String> doubleKeyMap2 = new DoubleKeyMap<HashMap<Object, String>, HashMap<Integer, Object>, String>(map1, class1);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      String string0 = doubleKeyMap2.get((HashMap<Object, String>) null, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, String>();
      DoubleKeyMap<Object, Integer, HashMap<Integer, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, HashMap<Integer, Object>>();
      HashMap<Integer, Object> hashMap0 = doubleKeyMap1.get((Object) doubleKeyMap0, (Integer) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>>, Object, Object>(class0);
      DoubleKeyMap<Object, Map<Object, String>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Integer>();
      Map<Map<Object, String>, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, String>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, HashMap<String, String>, Object>((Map<HashMap<String, Map<Object, String>>, Map<HashMap<String, String>, Object>>) null, class0);
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
      DoubleKeyMap<String, HashMap<Object, Object>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Object>, String>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<Object, String>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, Integer>(class0);
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
      DoubleKeyMap<String, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, String>((Map<String, Map<HashMap<String, Object>, String>>) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put("!jP2~j%_w8'_UP", (HashMap<String, Object>) null, "!jP2~j%_w8'_UP");
      String string0 = doubleKeyMap0.remove("!jP2~j%_w8'_UP", hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, String>((Map<String, Map<HashMap<String, Object>, String>>) null, class0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put("!jP2~j%_w8'_UP", hashMap0, "$~S(&#`fwkBq|!Ff");
      String string0 = doubleKeyMap0.put("!jP2~j%_w8'_UP", hashMap0, "wrong proto type map ");
      assertEquals("$~S(&#`fwkBq|!Ff", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer(1);
      doubleKeyMap0.put((Object) hashMap0, integer0, (Object) integer0);
      Object object0 = doubleKeyMap0.get((Object) hashMap0, integer0);
      assertEquals(1, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>>, Object, Object>(class0);
      Map<Integer, Map<Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>>, String>(map0);
      Map<HashMap<Object, String>, Map<HashMap<Integer, Object>, String>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<HashMap<Object, String>, HashMap<Integer, Object>, String> doubleKeyMap2 = new DoubleKeyMap<HashMap<Object, String>, HashMap<Integer, Object>, String>(map1);
      Map<String, Map<String, Integer>> map2 = doubleKeyMap2.newMap();
      DoubleKeyMap<String, String, Integer> doubleKeyMap3 = new DoubleKeyMap<String, String, Integer>(map2, class0);
      Map<String, Integer> map3 = doubleKeyMap3.get((String) null);
      assertNull(map3);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, String>((Map<String, Map<HashMap<String, Object>, String>>) null, class0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put("!jP2~j%_w8'_UP", hashMap0, "$~S(&#`fwkBq|!Ff");
      String string0 = doubleKeyMap0.remove("!jP2~j%_w8'_UP", hashMap0);
      assertNotNull(string0);
      assertEquals("$~S(&#`fwkBq|!Ff", string0);
  }
}
