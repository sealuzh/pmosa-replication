/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 19:38:25 GMT 2019
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
      DoubleKeyMap<Object, HashMap<Integer, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Object>(class0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap0.put((Object) null, hashMap1);
      Map<Object, Object> map0 = doubleKeyMap0.remove((Object) null);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      Object object0 = new Object();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0);
      Object object1 = doubleKeyMap0.remove((Object) hashMap0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Object, Map<Object, String>> hashMap0 = new HashMap<Object, Map<Object, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>(hashMap0);
      HashMap<Object, Map<Object, Object>> hashMap1 = new HashMap<Object, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap1, class0);
      Object object0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Integer>, String>();
      Map<HashMap<Object, Integer>, String> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      Object object0 = new Object();
      Map<Integer, Integer> map0 = doubleKeyMap0.remove(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Map<Map<String, Object>, String>> hashMap0 = new HashMap<String, Map<Map<String, Object>, String>>();
      DoubleKeyMap<String, Map<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, Map<String, Object>, String>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      doubleKeyMap0.put("GS_}5=p", (Map<String, Object>) hashMap1, (String) null);
      Map<Map<String, Object>, String> map0 = doubleKeyMap0.remove("GS_}5=p");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>(0);
      DoubleKeyMap<Integer, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<Object, Object>>();
      Integer integer0 = new Integer((-1129));
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.put(integer0, (Object) null, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, Map<Object, Map<String, Integer>>> hashMap0 = new HashMap<Integer, Map<Object, Map<String, Integer>>>();
      Integer integer0 = new Integer(1546);
      HashMap<Object, Map<String, Integer>> hashMap1 = new HashMap<Object, Map<String, Integer>>();
      hashMap0.put(integer0, hashMap1);
      Map<Object, Map<String, Integer>> map0 = hashMap0.put(integer0, hashMap1);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, Map<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Map<String, Integer>>(hashMap0, class0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) doubleKeyMap0, "A2`ek,0VNj,.<fZKf", integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      DoubleKeyMap<Map<Object, Map<HashMap<Integer, Object>, Object>>, Object, String> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Map<HashMap<Integer, Object>, Object>>, Object, String>();
      Map<Object, Map<HashMap<Integer, Object>, Object>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, HashMap<Integer, Object>, Object> doubleKeyMap2 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Object>(map0, class0);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      Object object0 = doubleKeyMap2.get((Object) doubleKeyMap0, hashMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Object object0 = new Object();
      Map<String, Object> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Object, Map<HashMap<Integer, Object>, Object>> hashMap0 = new HashMap<Object, Map<HashMap<Integer, Object>, Object>>();
      DoubleKeyMap<Object, HashMap<Integer, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Object>(hashMap0);
      HashMap<String, Map<Object, Object>> hashMap1 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(hashMap1, class0);
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("BF7Ah5|$U79swtF9~", (Object) hashMap2, (Object) doubleKeyMap0);
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
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<Integer, Map<HashMap<String, Object>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, HashMap<String, Object>, String> doubleKeyMap1 = new DoubleKeyMap<Integer, HashMap<String, Object>, String>(map0);
      Integer integer0 = new Integer((-3013));
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap1.put(integer0, hashMap0, "");
      doubleKeyMap1.remove(integer0, hashMap0);
      assertEquals(0, map0.size());
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      Object object0 = new Object();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      doubleKeyMap0.put((Object) null, object0, object0);
      Object object1 = doubleKeyMap0.remove((Object) null, (Object) hashMap0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      DoubleKeyMap<Map<String, Object>, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Map<String, Object>, Integer, Object>();
      Map<HashMap<String, String>, Map<Object, Integer>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<HashMap<String, String>, Object, Integer> doubleKeyMap2 = new DoubleKeyMap<HashMap<String, String>, Object, Integer>(map0);
      Map<String, Map<Object, String>> map1 = doubleKeyMap2.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap3 = new DoubleKeyMap<String, Object, String>(map1, class0);
      String string0 = doubleKeyMap3.get("", (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, String, Object>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put(hashMap0, "", (Object) "wrong proto type map ");
      Object object0 = doubleKeyMap0.get(hashMap0, "t5cP");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<String, Integer>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, Integer>, Object>(class0);
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
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<Integer, Map<HashMap<String, Object>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, HashMap<String, Object>, String> doubleKeyMap1 = new DoubleKeyMap<Integer, HashMap<String, Object>, String>(map0);
      Integer integer0 = new Integer((-3013));
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap1.put(integer0, hashMap0, "");
      doubleKeyMap1.put(integer0, hashMap0, "");
      assertEquals(1, map0.size());
      assertFalse(map0.isEmpty());
  }
}
