/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 15:21:12 GMT 2019
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
      DoubleKeyMap<Integer, HashMap<Object, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, Object>, Object>(class0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      Object object0 = doubleKeyMap0.remove("", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<String, Integer>, Object, String> doubleKeyMap0 = new DoubleKeyMap<Map<String, Integer>, Object, String>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.remove(object0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Object>, Object>();
      Map<HashMap<Object, Object>, Object> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<Object, Map<String, Map<String, Integer>>> hashMap1 = new HashMap<Object, Map<String, Map<String, Integer>>>();
      DoubleKeyMap<Object, String, Map<String, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, String, Map<String, Integer>>(hashMap1);
      Map<String, Map<String, Integer>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Object object1 = doubleKeyMap0.put((Object) "", (String) null, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Integer, Map<String, Integer>, HashMap<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, Integer>, HashMap<Integer, Integer>>();
      Map<String, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(map0, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((String) null, object0, "P");
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
      Object object0 = new Object();
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Object object1 = doubleKeyMap0.put(object0, "", (Object) null);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, Integer>, Map<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Integer>, Map<Integer, String>, String>();
      HashMap<Map<String, Integer>, Map<Object, Map<String, Integer>>> hashMap0 = new HashMap<Map<String, Integer>, Map<Object, Map<String, Integer>>>();
      DoubleKeyMap<Map<String, Integer>, Object, Map<String, Integer>> doubleKeyMap1 = new DoubleKeyMap<Map<String, Integer>, Object, Map<String, Integer>>(hashMap0);
      Map<String, Integer> map0 = doubleKeyMap1.get((Map<String, Integer>) null, (Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<String, Map<Integer, Integer>, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Map<Integer, Integer>, HashMap<String, Object>>();
      HashMap<Object, Map<String, Map<String, Integer>>> hashMap0 = new HashMap<Object, Map<String, Map<String, Integer>>>();
      DoubleKeyMap<Object, String, Map<String, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, String, Map<String, Integer>>(hashMap0);
      Map<String, Map<String, Integer>> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Map<Integer, Object> map0 = doubleKeyMap0.get((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer(0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      doubleKeyMap0.put(integer0, "RSF8o8|", (Object) hashMap0);
      Object object0 = doubleKeyMap0.remove(integer0, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Object object0 = doubleKeyMap0.remove((Integer) null, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer(0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      doubleKeyMap0.put(integer0, "RSF8o8|", (Object) hashMap0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.put(integer0, "RSF8o8|", (Object) integer0);
      assertEquals(0, hashMap1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer(0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Object object0 = doubleKeyMap0.put(integer0, "RSF8o83|", (Object) hashMap0);
      HashMap<Object, Map<Object, HashMap<Object, Object>>> hashMap1 = new HashMap<Object, Map<Object, HashMap<Object, Object>>>(0);
      DoubleKeyMap<Object, Object, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, Object>>(hashMap1);
      HashMap<Object, Object> hashMap2 = doubleKeyMap1.get(object0, (Object) null);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Integer, Map<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, Integer>, String>();
      Integer integer0 = new Integer((-1));
      DoubleKeyMap<HashMap<Integer, Map<String, Integer>>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Map<String, Integer>>, Object, Integer>((Map<HashMap<Integer, Map<String, Integer>>, Map<Object, Integer>>) null);
      Map<String, Integer> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(integer0, map0, "");
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String string0 = doubleKeyMap0.get(integer0, (Map<String, Integer>) hashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Map<String, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Map<String, Object>>(class0);
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
      HashMap<Object, Map<Object, HashMap<Object, Object>>> hashMap0 = new HashMap<Object, Map<Object, HashMap<Object, Object>>>(0);
      DoubleKeyMap<Object, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, HashMap<Object, Object>>(hashMap0);
      Object object0 = new Object();
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.get(object0, (Object) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer(0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      doubleKeyMap0.put(integer0, "RSF8o83|", (Object) hashMap0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.remove(integer0, "RSF8o83|");
      assertTrue(hashMap1.isEmpty());
  }
}
