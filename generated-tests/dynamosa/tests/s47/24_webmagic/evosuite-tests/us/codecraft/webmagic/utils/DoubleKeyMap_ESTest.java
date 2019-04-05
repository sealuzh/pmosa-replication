/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:17:03 GMT 2019
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
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put((Object) integer0, integer0, (Object) "l");
      Integer integer1 = new Integer(0);
      Object object0 = doubleKeyMap0.remove((Object) integer0, integer1);
      assertEquals("l", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, HashMap<Map<Integer, Integer>, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Map<Integer, Integer>, Object>>();
      Integer integer0 = new Integer(1);
      HashMap<Map<Integer, Integer>, Object> hashMap0 = doubleKeyMap0.remove(integer0, integer0);
      doubleKeyMap0.put(integer0, integer0, hashMap0);
      Map<Integer, HashMap<Map<Integer, Integer>, Object>> map0 = doubleKeyMap0.remove(integer0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Object, Object, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Integer, Object>>();
      Object object0 = new Object();
      Map<Integer, Object> map0 = doubleKeyMap0.remove((Object) integer0, object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = doubleKeyMap0.remove((Object) null, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>();
      String string0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Integer) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<String, Integer, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, HashMap<Integer, Object>>();
      Map<Integer, HashMap<Integer, Object>> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      HashMap<Integer, Map<Map<Integer, Integer>, HashMap<Map<Integer, Integer>, Map<Integer, Integer>>>> hashMap0 = new HashMap<Integer, Map<Map<Integer, Integer>, HashMap<Map<Integer, Integer>, Map<Integer, Integer>>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<Integer, Integer>, HashMap<Map<Integer, Integer>, Map<Integer, Integer>>> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<Integer, Integer>, HashMap<Map<Integer, Integer>, Map<Integer, Integer>>>(hashMap0, class0);
      Map<Object, String> map0 = doubleKeyMap0.remove((Object) doubleKeyMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, HashMap<String, Map<Integer, Integer>>, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, HashMap<String, Map<Integer, Integer>>, HashMap<String, Object>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put((HashMap<Object, Object>) null, (HashMap<String, Map<Integer, Integer>>) null, hashMap0);
      Map<HashMap<String, Map<Integer, Integer>>, HashMap<String, Object>> map0 = doubleKeyMap0.get((HashMap<Object, Object>) null);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Object, Object>, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Object, Integer>(class0);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      Integer integer0 = new Integer((-1));
      Integer integer1 = doubleKeyMap0.put(hashMap0, object0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Integer, HashMap<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, HashMap<Integer, Integer>>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer((-1929));
      Object object0 = doubleKeyMap1.put((Object) doubleKeyMap0, integer0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<Integer, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Integer>(map0, class0);
      Integer integer0 = doubleKeyMap1.get((Integer) null, (Object) doubleKeyMap0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(map0, class0);
      DoubleKeyMap<Object, String, String> doubleKeyMap2 = new DoubleKeyMap<Object, String, String>();
      String string0 = doubleKeyMap2.get((Object) doubleKeyMap1, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      DoubleKeyMap<Object, String, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<Object, String, HashMap<Integer, String>>();
      Map<String, HashMap<Integer, String>> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Map<String, Map<Integer, Integer>>> hashMap0 = new HashMap<Object, Map<String, Map<Integer, Integer>>>();
      DoubleKeyMap<Object, String, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<Integer, Integer>>(hashMap0);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "P|X&Jo!&1", (Map<Integer, Integer>) hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Map<Integer, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Map<Integer, Integer>, Object>();
      Map<HashMap<String, Object>, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, String, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Object>, String, Object>(map0, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((HashMap<String, Object>) null, "", object0);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>((Map<Object, Map<Integer, Integer>>) null, class0);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Map<Integer, Integer>, Object>, Integer, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Integer, Integer>, Object>, Integer, String>(class0);
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
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put((Object) "`{", integer0, (Object) integer0);
      Integer integer1 = new Integer((-1573));
      Object object0 = doubleKeyMap0.remove((Object) "`{", integer1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Map<String, Map<HashMap<Integer, Object>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, HashMap<Integer, Object>, String> doubleKeyMap1 = new DoubleKeyMap<String, HashMap<Integer, Object>, String>(map0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      doubleKeyMap1.put("-hm", hashMap0, "-hm");
      String string0 = doubleKeyMap1.put("-hm", hashMap0, "-hm");
      assertEquals("-hm", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      doubleKeyMap0.put("l", "", (Object) integer0);
      Object object0 = doubleKeyMap0.get("l", "");
      assertNotNull(object0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, String, Map<Integer, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, String, Map<Integer, Object>>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}