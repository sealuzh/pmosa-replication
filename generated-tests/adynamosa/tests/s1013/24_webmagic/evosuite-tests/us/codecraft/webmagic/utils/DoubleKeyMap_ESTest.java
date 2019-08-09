/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:45:15 GMT 2019
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
      HashMap<Integer, Map<HashMap<String, Integer>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<String, Integer>, Object>>();
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      HashMap<HashMap<String, Integer>, Object> hashMap1 = new HashMap<HashMap<String, Integer>, Object>();
      hashMap0.put(integer0, hashMap1);
      DoubleKeyMap<Integer, HashMap<String, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<String, Integer>, Object>(hashMap0, class0);
      Map<HashMap<String, Integer>, Object> map0 = doubleKeyMap0.get(integer0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<HashMap<Integer, Object>, Map<Object, String>> hashMap0 = new HashMap<HashMap<Integer, Object>, Map<Object, String>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Integer, Object>, Object, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Object, String>(hashMap0, class0);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      doubleKeyMap0.put(hashMap1, (Object) null, (String) null);
      Map<Object, String> map0 = doubleKeyMap0.get(hashMap1);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = doubleKeyMap0.remove((Object) "us.codecraft.webmagic.utils.DoubleKeyMap", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<Object, String>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, HashMap<Object, String>>();
      Map<String, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(map0, class0);
      String string0 = doubleKeyMap1.remove("[)->a&3Mqe40k6m=,PB", (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      Map<Object, Map<HashMap<Integer, Object>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, HashMap<Integer, Object>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Object>(map0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = doubleKeyMap1.remove((Object) null, hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(class0);
      Integer integer0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>(hashMap0, class0);
      Map<Integer, Object> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, HashMap<Object, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, Integer>, Integer>(class0);
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<String, Object>>(class0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<String, Object> hashMap1 = doubleKeyMap0.put(integer0, (Object) null, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      Object object0 = doubleKeyMap0.put((Object) null, "", (Object) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer((-786));
      DoubleKeyMap<String, String, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<Integer, Object>>(class0);
      DoubleKeyMap<Object, HashMap<String, String>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<String, String>, Integer>((Map<Object, Map<HashMap<String, String>, Integer>>) null, class0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Integer integer1 = doubleKeyMap1.put((Object) doubleKeyMap0, hashMap0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<Object, String>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, HashMap<Object, String>>();
      Map<String, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(map0, class0);
      String string0 = doubleKeyMap1.get("wrong proto type map ", (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>((Map<Object, Map<Integer, Object>>) null);
      Object object0 = doubleKeyMap0.get((Object) null, (Integer) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(map0, class0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.get(object0, "C00X");
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<Integer, Object>>(class0);
      Map<String, HashMap<Integer, Object>> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<String, Object>, HashMap<String, Map<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<String, Object>, HashMap<String, Map<String, Object>>>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Map<String, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(map0);
      Map<Integer, Map<Object, Map<String, Object>>> map1 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, Map<String, Object>> doubleKeyMap2 = new DoubleKeyMap<Integer, Object, Map<String, Object>>(map1, class0);
      Integer integer0 = new Integer(764);
      // Undeclared exception!
      try { 
        doubleKeyMap2.put(integer0, (Object) doubleKeyMap1, (Map<String, Object>) hashMap0);
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
      HashMap<String, Map<Object, String>> hashMap0 = new HashMap<String, Map<Object, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(hashMap0, class0);
      HashMap<String, Map<String, Integer>> hashMap1 = new HashMap<String, Map<String, Integer>>();
      DoubleKeyMap<String, String, Integer> doubleKeyMap1 = new DoubleKeyMap<String, String, Integer>(hashMap1);
      Map<Object, String> map0 = doubleKeyMap1.newMap();
      hashMap0.put("", map0);
      doubleKeyMap0.remove("", (Object) hashMap0);
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<HashMap<Integer, Object>, Map<String, String>> hashMap0 = new HashMap<HashMap<Integer, Object>, Map<String, String>>();
      DoubleKeyMap<HashMap<Integer, Object>, String, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, String, String>(hashMap0, class0);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      doubleKeyMap0.put(hashMap1, "us.codecraft.webmagic.utils.DoubleKeyMap", "");
      String string0 = doubleKeyMap0.get(hashMap1, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, HashMap<String, String>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, HashMap<String, String>>(class0);
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
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Integer>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = doubleKeyMap1.put((Object) integer0, "", (Object) doubleKeyMap0);
      Object object1 = doubleKeyMap1.put((Object) integer0, "", object0);
      assertNotNull(object1);
  }
}
