/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:12:27 GMT 2019
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
      Class<Map> class0 = Map.class;
      HashMap<Object, Map<Map<String, String>, HashMap<Map<Object, String>, Integer>>> hashMap0 = new HashMap<Object, Map<Map<String, String>, HashMap<Map<Object, String>, Integer>>>();
      DoubleKeyMap<Object, Map<String, String>, HashMap<Map<Object, String>, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, HashMap<Map<Object, String>, Integer>>(hashMap0, class0);
      HashMap<Map<Object, String>, Map<String, Integer>> hashMap1 = new HashMap<Map<Object, String>, Map<String, Integer>>();
      DoubleKeyMap<Map<Object, String>, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, String, Integer>(hashMap1);
      Map<String, String> map0 = doubleKeyMap1.newMap();
      HashMap<Map<Object, String>, Integer> hashMap2 = doubleKeyMap0.get((Object) null, map0);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(1);
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      Map<Object, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(map0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) map0, "\"-&`<H", integer0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<Object, String>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, String>, String>((Map<String, Map<Map<Object, String>, String>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<String, Object, HashMap<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Integer>>();
      Map<Object, HashMap<String, Integer>> map0 = doubleKeyMap0.get("+c>:h(G$<#TY`z~+:");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<HashMap<Object, String>, Map<HashMap<String, Object>, Integer>> hashMap0 = new HashMap<HashMap<Object, String>, Map<HashMap<String, Object>, Integer>>();
      DoubleKeyMap<HashMap<Object, String>, HashMap<String, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, HashMap<String, Object>, Integer>(hashMap0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      HashMap<HashMap<String, Object>, Integer> hashMap3 = new HashMap<HashMap<String, Object>, Integer>();
      hashMap0.put(hashMap1, hashMap3);
      doubleKeyMap0.remove(hashMap1, hashMap2);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Object>, HashMap<Integer, String>, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, HashMap<Integer, String>, Map<Object, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, Object, Object>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      doubleKeyMap1.put((Map<Object, String>) hashMap0, (Object) class0, (Object) doubleKeyMap0);
      Object object0 = doubleKeyMap1.remove((Map<Object, String>) hashMap0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Map<Object, String>, Map<Integer, Object>> hashMap0 = new HashMap<Map<Object, String>, Map<Integer, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>(hashMap0, class0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      Integer integer0 = new Integer(1);
      HashMap<Integer, Object> hashMap2 = new HashMap<Integer, Object>();
      hashMap0.put(hashMap1, hashMap2);
      Object object0 = doubleKeyMap0.put((Map<Object, String>) hashMap1, integer0, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<String, Object, HashMap<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<Object, Integer>>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put("", (Object) "", hashMap0);
      Integer integer0 = new Integer(1);
      HashMap<Object, Integer> hashMap1 = doubleKeyMap0.get("", (Object) integer0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<String, Object, HashMap<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Integer>>();
      Integer integer0 = new Integer(1);
      HashMap<String, Integer> hashMap0 = doubleKeyMap0.remove("M}:,*^.D_pv1 7^ Q'y", (Object) integer0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Map<Object, String>>, String, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Map<Object, String>>, String, Integer>();
      HashMap<String, Map<Object, String>> hashMap0 = new HashMap<String, Map<Object, String>>();
      Map<String, Integer> map0 = doubleKeyMap0.remove(hashMap0);
      assertNull(map0);
  }
}