/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:17:35 GMT 2019
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
      DoubleKeyMap<HashMap<String, Object>, Map<Object, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Map<Object, Integer>, Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(1373);
      doubleKeyMap0.put(hashMap0, (Map<Object, Integer>) hashMap1, integer0);
      Integer integer1 = doubleKeyMap0.remove(hashMap0, (Map<Object, Integer>) hashMap1);
      assertEquals(1373, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Map<Object, Integer>, Map<Map<Object, Integer>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, Integer>, Map<Object, Integer>, String> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Integer>, Map<Object, Integer>, String>(map0);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<Map<Object, Integer>, Map<Object, Object>> hashMap1 = new HashMap<Map<Object, Integer>, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, Integer>, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Map<Object, Integer>, Object, Object>(hashMap1, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap2.put((Map<Object, Integer>) hashMap0, (Object) "YhLi{X]R5", (Object) doubleKeyMap1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>(class0);
      Integer integer0 = new Integer(0);
      Map<Object, Integer> map0 = doubleKeyMap0.remove(integer0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Integer>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, String, Object>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Map<String, Object> map0 = doubleKeyMap0.get(hashMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      doubleKeyMap0.put((Object) null, (String) null, (Integer) null);
      Integer integer0 = doubleKeyMap0.remove((Object) null, "2?Cml>C\"L");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Map<String, Map<String, String>>, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<String, Map<String, String>>, Object, HashMap<Object, Object>>();
      Map<String, Map<String, String>> map0 = doubleKeyMap0.newMap();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.remove(map0, (Object) hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<Map<Object, Integer>, Map<String, Object>>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<Map<Object, Integer>, Map<String, Object>>>();
      DoubleKeyMap<HashMap<Object, Object>, Map<Object, Integer>, Map<String, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Map<Object, Integer>, Map<String, Object>>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      HashMap<Map<Object, Integer>, Map<String, Object>> hashMap2 = new HashMap<Map<Object, Integer>, Map<String, Object>>();
      hashMap0.put(hashMap1, hashMap2);
      Map<Object, Integer> map0 = doubleKeyMap1.newMap();
      HashMap<String, Object> hashMap3 = new HashMap<String, Object>();
      Map<String, Object> map1 = doubleKeyMap0.put(hashMap1, map0, (Map<String, Object>) hashMap3);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Map<Object, Integer>, Map<Map<Object, Integer>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, Integer>, Map<Object, Integer>, String> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Integer>, Map<Object, Integer>, String>(map0);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap1.put((Map<Object, Integer>) hashMap0, (Map<Object, Integer>) hashMap0, "YhLi{X]R5");
      String string0 = doubleKeyMap1.get((Map<Object, Integer>) hashMap0, (Map<Object, Integer>) hashMap0);
      assertEquals("YhLi{X]R5", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<Object, Integer>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, Integer>, String>(class0);
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
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Map<Object, Integer>, Map<Map<Object, Integer>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, Integer>, Map<Object, Integer>, String> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Integer>, Map<Object, Integer>, String>(map0);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap1.put((Map<Object, Integer>) hashMap0, (Map<Object, Integer>) hashMap0, "YhLi{X]R5");
      doubleKeyMap1.remove((Map<Object, Integer>) hashMap0, (Map<Object, Integer>) hashMap0);
      assertEquals(0, map0.size());
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Object>, Map<Object, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Map<Object, Integer>, Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      Integer integer0 = doubleKeyMap0.get(hashMap0, (Map<Object, Integer>) hashMap1);
      assertNull(integer0);
  }
}