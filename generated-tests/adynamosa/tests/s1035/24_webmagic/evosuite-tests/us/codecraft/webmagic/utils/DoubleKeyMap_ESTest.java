/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 09:41:35 GMT 2019
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
      DoubleKeyMap<Object, Map<Object, String>, HashMap<Map<Object, String>, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Object, String>, HashMap<Map<Object, String>, String>>(class0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<HashMap<String, Object>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Integer, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Integer, Integer>(hashMap0, class0);
      HashMap<Object, Map<String, Object>> hashMap1 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap1);
      Map<Integer, Integer> map0 = doubleKeyMap1.newMap();
      hashMap0.put((HashMap<String, Object>) null, map0);
      Map<Integer, Integer> map1 = doubleKeyMap0.remove((HashMap<String, Object>) null);
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<String, Map<Object, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, Integer>, Integer>();
      HashMap<Integer, Map<String, Integer>> hashMap0 = new HashMap<Integer, Map<String, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Integer>(hashMap0, class0);
      Integer integer0 = doubleKeyMap1.get((Integer) null, (String) null);
      HashMap<Object, Map<Object, Object>> hashMap1 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Object>(hashMap1, class0);
      Object object0 = doubleKeyMap2.remove((Object) integer0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Map<String, Integer>, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<String, Integer>, Object, Integer>();
      Integer integer0 = doubleKeyMap0.remove((Map<String, Integer>) null, (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>();
      Map<Object, Map<HashMap<Object, Object>, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, HashMap<Object, Object>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Object, Object>, Integer>(map0, class0);
      Integer integer0 = doubleKeyMap1.remove((Object) doubleKeyMap0, hashMap0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<HashMap<String, Object>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Integer, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Integer, Integer>(hashMap0, class0);
      Map<Integer, Integer> map0 = doubleKeyMap0.remove((HashMap<String, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, Object>();
      Integer integer0 = new Integer(3538);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.put(integer0, hashMap0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<Integer, Object>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<Integer, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, Object>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap2 = new DoubleKeyMap<Integer, String, Object>();
      Map<HashMap<Object, HashMap<Map<Object, String>, Map<Map<String, String>, Object>>>, Integer> map0 = doubleKeyMap2.newMap();
      Object object0 = doubleKeyMap1.put((Object) hashMap1, (Object) doubleKeyMap0, (Object) map0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      Map<String, Map<Integer, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Integer, String> doubleKeyMap1 = new DoubleKeyMap<String, Integer, String>(map0);
      String string0 = doubleKeyMap1.put((String) null, integer0, "grG2");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, String>((Map<String, Map<HashMap<String, Object>, String>>) null, class0);
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>();
      String string0 = doubleKeyMap1.put((Object) doubleKeyMap0, (Integer) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Map<Object, String>, Map<Map<Object, String>, Object>> hashMap0 = new HashMap<Map<Object, String>, Map<Map<Object, String>, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Map<Object, String>, Object>(hashMap0, class0);
      HashMap<Map<Integer, String>, Map<Object, Object>> hashMap1 = new HashMap<Map<Integer, String>, Map<Object, Object>>();
      DoubleKeyMap<Map<Integer, String>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, String>, Object, Object>(hashMap1);
      HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
      Object object0 = doubleKeyMap1.get((Map<Integer, String>) hashMap2, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Map<Object, String>, Map<Map<Object, String>, Object>> hashMap0 = new HashMap<Map<Object, String>, Map<Map<Object, String>, Object>>();
      DoubleKeyMap<Map<Object, String>, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Map<Object, String>, Object>(hashMap0);
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Object, Integer, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, HashMap<Object, String>>();
      HashMap<Object, String> hashMap1 = doubleKeyMap1.get((Object) doubleKeyMap0, integer0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Object, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Object, String>>();
      Object object0 = new Object();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "F", (Object) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, String>, Object, Map<Integer, Map<Map<Object, String>, String>>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, Object, Map<Integer, Map<Map<Object, String>, String>>>((Map<HashMap<Object, String>, Map<Object, Map<Integer, Map<Map<Object, String>, String>>>>) null, class0);
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
      DoubleKeyMap<Integer, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, Object>();
      Integer integer0 = new Integer(3538);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Object object0 = doubleKeyMap0.put(integer0, hashMap0, (Object) hashMap0);
      DoubleKeyMap<Object, Object, Map<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Map<Object, String>>();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap1.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, Object>();
      Integer integer0 = new Integer(3538);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Object object0 = doubleKeyMap0.put(integer0, hashMap0, (Object) hashMap0);
      hashMap0.put(object0, "zug[.y0");
      Object object1 = doubleKeyMap0.remove(integer0, hashMap0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, Object>();
      Map<String, String> map0 = doubleKeyMap0.newMap();
      Integer integer0 = new Integer(3538);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      doubleKeyMap0.put(integer0, hashMap0, (Object) map0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.put(integer0, hashMap0, (Object) hashMap0);
      assertEquals(0, hashMap1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>(class0);
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
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      HashMap<Object, Map<Object, HashMap<Object, Object>>> hashMap0 = new HashMap<Object, Map<Object, HashMap<Object, Object>>>();
      DoubleKeyMap<Object, Object, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, Object>>(hashMap0);
      Map<Object, HashMap<Object, Object>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, Object>();
      Integer integer0 = new Integer(3538);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      doubleKeyMap0.put(integer0, hashMap0, (Object) hashMap0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.remove(integer0, hashMap0);
      assertEquals(0, hashMap1.size());
  }
}
