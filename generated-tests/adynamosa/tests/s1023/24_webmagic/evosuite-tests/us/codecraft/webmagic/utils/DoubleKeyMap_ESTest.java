/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 11:17:38 GMT 2019
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
      Integer integer0 = new Integer(2001);
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<String, Map<Integer, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Integer, String> doubleKeyMap1 = new DoubleKeyMap<String, Integer, String>(map0, class0);
      doubleKeyMap1.put((String) null, integer0, (String) null);
      Map<Integer, String> map1 = doubleKeyMap1.remove((String) null);
      assertFalse(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<String, Map<Object, Object>> hashMap1 = new HashMap<String, Map<Object, Object>>();
      hashMap1.put("t*N4UWpx~,Kv", hashMap0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap1);
      Map<Object, Object> map0 = doubleKeyMap0.get("t*N4UWpx~,Kv");
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, Map<HashMap<String, String>, Integer>> map0 = doubleKeyMap0.newMap();
      doubleKeyMap0.put((String) null, (Object) map0, "");
      Map<Object, String> map1 = doubleKeyMap0.get((String) null);
      assertFalse(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(1);
      HashMap<Integer, Map<Object, Object>> hashMap0 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>(hashMap0, class0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.remove(integer0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.remove(object0, (String) null);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, String> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Map<Object, String>> hashMap0 = new HashMap<String, Map<Object, String>>();
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(hashMap0);
      Class<HashMap> class0 = HashMap.class;
      Map<Object, Map<HashMap<String, String>, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, HashMap<String, String>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<String, String>, Integer>(map0, class0);
      Map<HashMap<String, String>, Integer> map1 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(2001);
      DoubleKeyMap<Integer, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<Object, Object>>((Map<Integer, Map<Object, HashMap<Object, Object>>>) null);
      HashMap<Object, Object> hashMap0 = doubleKeyMap0.put(integer0, (Object) null, (HashMap<Object, Object>) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Map<Object, String>> hashMap0 = new HashMap<String, Map<Object, String>>();
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(hashMap0);
      Map<String, Map<HashMap<Object, String>, String>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap1 = new DoubleKeyMap<String, HashMap<Object, String>, String>(map0, class0);
      Map<HashMap<String, Integer>, Map<HashMap<Object, Object>, HashMap<String, String>>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<HashMap<String, Integer>, HashMap<Object, Object>, HashMap<String, String>> doubleKeyMap2 = new DoubleKeyMap<HashMap<String, Integer>, HashMap<Object, Object>, HashMap<String, String>>(map1, class0);
      HashMap<Object, Map<Object, Object>> hashMap1 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap3 = new DoubleKeyMap<Object, Object, Object>(hashMap1, class0);
      Object object0 = doubleKeyMap3.put((Object) null, (Object) doubleKeyMap2, (Object) doubleKeyMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(class0);
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Object, Object> hashMap1 = doubleKeyMap1.put((Object) doubleKeyMap0, "us.codecraft.webmagic.utils.DoubleKeyMap", hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<HashMap<Integer, Integer>, Map<HashMap<Object, Integer>, Object>> hashMap0 = new HashMap<HashMap<Integer, Integer>, Map<HashMap<Object, Integer>, Object>>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      DoubleKeyMap<HashMap<Integer, Integer>, HashMap<Object, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Integer>, HashMap<Object, Integer>, Object>(hashMap0, class0);
      Object object0 = doubleKeyMap0.get(hashMap1, (HashMap<Object, Integer>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, Integer, Object>(class0);
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>();
      Integer integer0 = new Integer(339);
      Integer integer1 = doubleKeyMap1.get((Object) doubleKeyMap0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, String> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(class0);
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>();
      Map<Integer, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Map<Object, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Map<Object, Object>>(class0);
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
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, Map<HashMap<String, String>, Integer>> map0 = doubleKeyMap0.newMap();
      doubleKeyMap0.put((String) null, (Object) map0, (String) null);
      Integer integer0 = new Integer(0);
      String string0 = doubleKeyMap0.remove((String) null, (Object) integer0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<String, Map<Object, Object>> hashMap1 = new HashMap<String, Map<Object, Object>>();
      hashMap1.put("t*N4UWpx~,Kv", hashMap0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap1);
      HashMap<HashMap<Object, Integer>, Object> hashMap2 = new HashMap<HashMap<Object, Integer>, Object>();
      Object object0 = doubleKeyMap0.put("t*N4UWpx~,Kv", (Object) hashMap2, (Object) hashMap2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, Map<HashMap<String, String>, Integer>> map0 = doubleKeyMap0.newMap();
      doubleKeyMap0.put((String) null, (Object) map0, (String) null);
      DoubleKeyMap<HashMap<String, Object>, String, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Object>, String, Object>();
      String string0 = doubleKeyMap0.get((String) null, (Object) doubleKeyMap1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      Map<Object, Map<HashMap<String, String>, Integer>> map0 = doubleKeyMap0.newMap();
      doubleKeyMap0.put((String) null, (Object) map0, "");
      String string0 = doubleKeyMap0.remove((String) null, (Object) map0);
      assertEquals("", string0);
  }
}
