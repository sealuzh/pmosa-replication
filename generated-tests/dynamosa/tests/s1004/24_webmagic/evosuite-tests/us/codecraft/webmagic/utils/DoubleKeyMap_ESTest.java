/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 03:29:16 GMT 2019
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
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      Integer integer0 = new Integer(1);
      doubleKeyMap0.put(integer0, (String) null, "u>mDy}n3FX'");
      String string0 = doubleKeyMap0.remove(integer0, (String) null);
      assertEquals("u>mDy}n3FX'", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Map<Integer, Map<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, Map<Integer, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Integer, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<Integer, Object>>(hashMap0, class0);
      Integer integer0 = new Integer((-384));
      HashMap<Integer, Map<Integer, Object>> hashMap1 = new HashMap<Integer, Map<Integer, Object>>();
      hashMap0.put(integer0, hashMap1);
      Integer integer1 = new Integer(0);
      Map<Integer, Object> map0 = doubleKeyMap0.get(integer0, integer1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0, class0);
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, (Object) integer0);
      Map<Integer, Object> map0 = doubleKeyMap0.remove(integer0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-1160));
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      HashMap<Integer, HashMap<String, String>> hashMap0 = new HashMap<Integer, HashMap<String, String>>();
      doubleKeyMap0.put((Object) null, integer0, (Object) hashMap0);
      Map<Integer, Object> map0 = doubleKeyMap0.get((Object) null);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      DoubleKeyMap<Object, Object, Map<String, Map<Integer, HashMap<String, String>>>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Map<String, Map<Integer, HashMap<String, String>>>>();
      Map<String, Map<Integer, HashMap<String, String>>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(class0);
      DoubleKeyMap<String, Object, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<String, Object, HashMap<Object, String>>(class0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Object, String> hashMap1 = doubleKeyMap1.put((String) null, (Object) doubleKeyMap0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<Integer, Map<String, HashMap<Object, Object>>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Integer, String, HashMap<Object, Object>>(map0, class0);
      HashMap<Integer, HashMap<String, String>> hashMap0 = new HashMap<Integer, HashMap<String, String>>();
      Object object0 = doubleKeyMap0.put((Object) doubleKeyMap1, "", (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<String, String>>((Map<Object, Map<Object, Map<String, String>>>) null, class0);
      DoubleKeyMap<Map<Integer, HashMap<String, String>>, HashMap<Integer, Map<Integer, HashMap<String, String>>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, HashMap<String, String>>, HashMap<Integer, Map<Integer, HashMap<String, String>>>, Integer>(class0);
      Map<Object, Map<Object, HashMap<String, Map>>> map0 = doubleKeyMap1.newMap();
      Map<String, String> map1 = doubleKeyMap0.get((Object) map0, (Object) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>();
      String string0 = doubleKeyMap1.get((String) null, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<Map<Integer, HashMap<String, String>>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, HashMap<String, String>>, Map<String, Object>>();
      DoubleKeyMap<Map<Integer, HashMap<String, String>>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<String, String>>, String, Object>(hashMap0, class0);
      Map<String, Object> map0 = doubleKeyMap0.get((Map<Integer, HashMap<String, String>>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(class0);
      Map<Object, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, String>, String>();
      Map<Object, Map<Integer, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>(map0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) map0, integer0, integer0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>();
      Map<String, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("(]cqd", (Object) class0, (Object) doubleKeyMap0);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, HashMap<String, String>>, Map<Integer, HashMap<String, String>>, Map<Map<Integer, HashMap<String, String>>, Integer>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<String, String>>, Map<Integer, HashMap<String, String>>, Map<Map<Integer, HashMap<String, String>>, Integer>>((Map<Map<Integer, HashMap<String, String>>, Map<Map<Integer, HashMap<String, String>>, Map<Map<Integer, HashMap<String, String>>, Integer>>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>();
      Map<Integer, String> map0 = doubleKeyMap0.remove((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      doubleKeyMap0.put((Integer) null, (String) null, (String) null);
      String string0 = doubleKeyMap0.remove((Integer) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      doubleKeyMap0.put((Integer) null, (String) null, "M9Gejqo77./");
      String string0 = doubleKeyMap0.put((Integer) null, (String) null, (String) null);
      assertEquals("M9Gejqo77./", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      DoubleKeyMap<Object, Object, Map<Integer, HashMap<String, String>>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Map<Integer, HashMap<String, String>>>();
      Map<Integer, HashMap<String, String>> map0 = doubleKeyMap1.get((Object) doubleKeyMap0, (Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(class0);
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
      HashMap<String, Map<HashMap<String, Integer>, String>> hashMap0 = new HashMap<String, Map<HashMap<String, Integer>, String>>();
      DoubleKeyMap<String, HashMap<String, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Integer>, String>(hashMap0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }
}
