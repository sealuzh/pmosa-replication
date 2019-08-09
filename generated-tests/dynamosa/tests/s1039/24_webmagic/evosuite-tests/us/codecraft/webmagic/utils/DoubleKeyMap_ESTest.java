/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 15:27:40 GMT 2019
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
      HashMap<HashMap<String, Object>, Map<HashMap<Object, Object>, HashMap<Integer, Object>>> hashMap0 = new HashMap<HashMap<String, Object>, Map<HashMap<Object, Object>, HashMap<Integer, Object>>>();
      DoubleKeyMap<HashMap<String, Object>, HashMap<Object, Object>, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, HashMap<Object, Object>, HashMap<Integer, Object>>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      HashMap<Integer, Object> hashMap3 = new HashMap<Integer, Object>();
      doubleKeyMap0.put(hashMap1, hashMap2, hashMap3);
      Map<HashMap<Object, Object>, HashMap<Integer, Object>> map0 = doubleKeyMap0.remove(hashMap1);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(161);
      DoubleKeyMap<Map<Integer, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, Integer, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = new Object();
      doubleKeyMap0.put((Map<Integer, Object>) hashMap0, integer0, object0);
      Object object1 = doubleKeyMap0.put((Map<Integer, Object>) hashMap0, integer0, (Object) integer0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Object>, Map<Integer, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, Map<Integer, Object>, Object>();
      DoubleKeyMap<Object, Object, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, String>>();
      Integer integer0 = new Integer(2035);
      HashMap<Object, String> hashMap0 = doubleKeyMap1.remove((Object) integer0, (Object) doubleKeyMap0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Integer, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, Map<Integer, Object>>();
      Integer integer0 = new Integer((-1));
      Map<Integer, Object> map0 = doubleKeyMap0.remove((HashMap<Object, Object>) null, integer0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>();
      HashMap<Object, Map<Object, String>> hashMap0 = new HashMap<Object, Map<Object, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(hashMap0, class0);
      String string0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Object>, String>();
      Map<HashMap<Object, Object>, String> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>();
      DoubleKeyMap<Object, Map<Integer, Object>, Map<Integer, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Integer, Object>, Map<Integer, Object>>();
      Map<Map<Integer, Object>, Map<Integer, Object>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>();
      Integer integer0 = new Integer(4615);
      Object object0 = doubleKeyMap1.put(integer0, (Object) doubleKeyMap0, (Object) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>();
      Object object0 = doubleKeyMap0.put((Object) null, (Map<Integer, String>) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>();
      Object object0 = doubleKeyMap0.put((Object) doubleKeyMap0, (Map<Integer, String>) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>();
      DoubleKeyMap<Integer, Object, Map<Integer, Object>> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Map<Integer, Object>>();
      Integer integer0 = new Integer((-2791));
      Map<Integer, Object> map0 = doubleKeyMap1.get(integer0, (Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<HashMap<String, Integer>, Map<HashMap<String, Integer>, Integer>> hashMap0 = new HashMap<HashMap<String, Integer>, Map<HashMap<String, Integer>, Integer>>();
      DoubleKeyMap<HashMap<String, Integer>, HashMap<String, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, HashMap<String, Integer>, Integer>(hashMap0);
      Integer integer0 = doubleKeyMap0.get((HashMap<String, Integer>) null, (HashMap<String, Integer>) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      Object object0 = new Object();
      Integer integer0 = doubleKeyMap0.get(object0, "cT<B+ustX\"dBUr");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0);
      Object object0 = new Object();
      Map<Object, Object> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Map<HashMap<String, Integer>, Integer>> hashMap0 = new HashMap<Object, Map<HashMap<String, Integer>, Integer>>();
      DoubleKeyMap<Object, HashMap<String, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, Integer>, Integer>(hashMap0);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, hashMap1, (Integer) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Map<Integer, Object>, Map<Map<String, Object>, Integer>> hashMap0 = new HashMap<Map<Integer, Object>, Map<Map<String, Object>, Integer>>();
      HashMap<Object, Map<Map<Integer, String>, Object>> hashMap1 = new HashMap<Object, Map<Map<Integer, String>, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Object>(hashMap1, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, (Map<Integer, String>) null, (Object) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Map<Integer, Object>, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Map<Integer, Object>, String>, Object>();
      Map<HashMap<Map<Integer, Object>, String>, Object> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Integer integer0 = new Integer(161);
      DoubleKeyMap<Map<Integer, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, Integer, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      doubleKeyMap0.put((Map<Integer, Object>) hashMap0, integer0, (Object) integer0);
      Integer integer1 = new Integer(0);
      Object object0 = doubleKeyMap0.remove((Map<Integer, Object>) hashMap0, integer1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Map<Integer, Object>, Map<HashMap<Object, String>, HashMap<Object, Integer>>> hashMap0 = new HashMap<Map<Integer, Object>, Map<HashMap<Object, String>, HashMap<Object, Integer>>>();
      DoubleKeyMap<Map<Integer, Object>, HashMap<Object, String>, HashMap<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, HashMap<Object, String>, HashMap<Object, Integer>>(hashMap0);
      DoubleKeyMap<Object, Object, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, String>>();
      Map<Integer, Object> map0 = doubleKeyMap1.newMap();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Object, Integer> hashMap2 = new HashMap<Object, Integer>();
      doubleKeyMap0.put(map0, hashMap1, hashMap2);
      HashMap<Object, Integer> hashMap3 = doubleKeyMap0.get(map0, hashMap1);
      assertSame(hashMap3, hashMap2);
      assertNotNull(hashMap3);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>(class0);
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
      Integer integer0 = new Integer(161);
      DoubleKeyMap<Map<Integer, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, Integer, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = new Object();
      doubleKeyMap0.put((Map<Integer, Object>) hashMap0, integer0, object0);
      Object object1 = doubleKeyMap0.remove((Map<Integer, Object>) hashMap0, integer0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}