/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 17:17:40 GMT 2019
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
      HashMap<Integer, Map<Integer, HashMap<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, HashMap<Integer, Object>>>();
      DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>>(hashMap0);
      Integer integer0 = new Integer((-3055));
      Integer integer1 = new Integer((-3055));
      HashMap<Integer, HashMap<Integer, Object>> hashMap1 = new HashMap<Integer, HashMap<Integer, Object>>();
      hashMap0.put(integer0, hashMap1);
      doubleKeyMap0.remove(integer1, integer0);
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Map<Integer, HashMap<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, HashMap<Integer, Object>>>();
      DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>>(hashMap0);
      Integer integer0 = new Integer((-3055));
      Integer integer1 = new Integer((-3055));
      HashMap<Integer, HashMap<Integer, Object>> hashMap1 = new HashMap<Integer, HashMap<Integer, Object>>();
      hashMap0.put(integer0, hashMap1);
      HashMap<Integer, Object> hashMap2 = doubleKeyMap0.get(integer0, integer1);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-3055));
      DoubleKeyMap<Map<String, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, Integer, Object>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put((Map<String, Object>) hashMap0, integer0, (Object) integer0);
      Map<Integer, Object> map0 = doubleKeyMap0.remove((Map<String, Object>) hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<HashMap<Map<String, Object>, Map<String, Object>>, Map<Integer, Object>> map0 = doubleKeyMap0.newMap();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<Object, Map<String, String>> hashMap2 = new HashMap<Object, Map<String, String>>();
      hashMap2.put(map0, hashMap1);
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(hashMap2);
      Map<String, String> map1 = doubleKeyMap1.get((Object) hashMap0);
      assertTrue(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, Map<Integer, HashMap<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, HashMap<Integer, Object>>>();
      DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>>(hashMap0);
      HashMap<Integer, Object> hashMap1 = doubleKeyMap0.remove((Integer) null, (Integer) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      DoubleKeyMap<Map<String, Object>, Object, HashMap<Integer, Map<String, Object>>> doubleKeyMap1 = new DoubleKeyMap<Map<String, Object>, Object, HashMap<Integer, Map<String, Object>>>();
      HashMap<Integer, Map<String, Object>> hashMap0 = doubleKeyMap1.remove((Map<String, Object>) null, (Object) doubleKeyMap0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Map<String, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, Integer, Object>();
      DoubleKeyMap<Map<String, Object>, String, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Map<String, Object>, String, HashMap<Object, Object>>();
      Map<Object, Map<String, Integer>> map0 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, String, Integer>(map0, class0);
      Integer integer0 = doubleKeyMap2.remove((Object) doubleKeyMap0, "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Object, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, String, Object>(class0);
      Map<String, Object> map0 = doubleKeyMap0.remove((HashMap<Object, String>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(class0);
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>();
      Map<String, String> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, HashMap<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Integer, String>, String>(class0);
      String string0 = doubleKeyMap0.put("u>WCk*zUMdh", (HashMap<Integer, String>) null, "u>WCk*zUMdh");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Map<HashMap<String, Object>, Map<String, String>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<String, Object>, String, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Object>, String, String>(map0, class0);
      DoubleKeyMap<String, Object, Integer> doubleKeyMap2 = new DoubleKeyMap<String, Object, Integer>(class0);
      Integer integer0 = new Integer((-2617));
      Integer integer1 = doubleKeyMap2.put((String) null, (Object) doubleKeyMap1, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      Integer integer0 = doubleKeyMap0.put((Object) null, "1IE u,:xxQi-qSM", (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>(class0);
      Integer integer0 = new Integer(0);
      String string0 = doubleKeyMap1.put((Object) doubleKeyMap0, integer0, "wrong proto type map ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, String>();
      String string0 = doubleKeyMap0.get("b\"o/[,B*vM\"%?M}-!", (HashMap<String, String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Map<Object, Integer>> hashMap0 = new HashMap<String, Map<Object, Integer>>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(hashMap0);
      Object object0 = new Object();
      Integer integer0 = doubleKeyMap0.get(">}eAbx?Xg", object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<String, Map<HashMap<String, String>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap1 = new DoubleKeyMap<String, HashMap<String, String>, String>(map0, class0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = doubleKeyMap1.get((String) null, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Integer>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, String, Object>();
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(hashMap0, class0);
      String string0 = doubleKeyMap1.get((Object) doubleKeyMap0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>(hashMap0, class0);
      Map<Object, Integer> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Map<String, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, Map<HashMap<Object, Object>, String>> hashMap0 = new HashMap<Object, Map<HashMap<Object, Object>, String>>();
      DoubleKeyMap<Object, HashMap<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Object>, String>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, hashMap1, "");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Map<String, HashMap<Object, Object>>> hashMap0 = new HashMap<Object, Map<String, HashMap<Object, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "", hashMap1);
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
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>((Map<Integer, Map<Integer, Object>>) null, (Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>((Map<Integer, Map<String, Object>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Integer, Map<Integer, HashMap<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, HashMap<Integer, Object>>>();
      DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>>(hashMap0);
      Integer integer0 = new Integer((-3055));
      HashMap<Integer, HashMap<Integer, Object>> hashMap1 = new HashMap<Integer, HashMap<Integer, Object>>();
      hashMap1.put((Integer) null, (HashMap<Integer, Object>) null);
      hashMap0.put(integer0, hashMap1);
      doubleKeyMap0.remove(integer0, integer0);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Integer integer0 = new Integer((-3045));
      DoubleKeyMap<Map<String, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, Integer, Object>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.put((Map<String, Object>) hashMap0, integer0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<Integer, Map<Integer, HashMap<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, HashMap<Integer, Object>>>();
      Integer integer0 = new Integer(0);
      HashMap<Integer, HashMap<Integer, Object>> hashMap1 = new HashMap<Integer, HashMap<Integer, Object>>();
      hashMap0.put(integer0, hashMap1);
      DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Integer, Object>>(hashMap0);
      HashMap<Integer, Object> hashMap2 = new HashMap<Integer, Object>();
      HashMap<Integer, Object> hashMap3 = doubleKeyMap0.put(integer0, integer0, hashMap2);
      assertNull(hashMap3);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}