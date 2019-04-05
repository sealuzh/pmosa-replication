/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:06:04 GMT 2019
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
  public void test0()  throws Throwable  {
      HashMap<HashMap<String, Integer>, Map<String, Object>> hashMap0 = new HashMap<HashMap<String, Integer>, Map<String, Object>>();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      hashMap2.put("", hashMap0);
      hashMap0.put(hashMap1, hashMap2);
      DoubleKeyMap<HashMap<String, Integer>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, String, Object>(hashMap0);
      doubleKeyMap0.remove(hashMap1, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Integer>, Integer, HashMap<Integer, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Integer>, Integer, HashMap<Integer, String>>();
      Integer integer0 = new Integer(0);
      HashMap<Integer, String> hashMap0 = doubleKeyMap0.remove((Map<Integer, Integer>) null, integer0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(1395);
      HashMap<Integer, Map<String, HashMap<Map<String, Object>, Object>>> hashMap0 = new HashMap<Integer, Map<String, HashMap<Map<String, Object>, Object>>>();
      DoubleKeyMap<Integer, String, HashMap<Map<String, Object>, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, HashMap<Map<String, Object>, Object>>(hashMap0);
      HashMap<String, HashMap<Map<String, Object>, Object>> hashMap1 = new HashMap<String, HashMap<Map<String, Object>, Object>>(0, 1395);
      hashMap0.put(integer0, hashMap1);
      HashMap<Map<String, Object>, Object> hashMap2 = new HashMap<Map<String, Object>, Object>();
      HashMap<Map<String, Object>, Object> hashMap3 = doubleKeyMap0.put(integer0, "6Qy65)Jy", hashMap2);
      assertNull(hashMap3);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<Map<Map<String, Object>, Object>, String, String> doubleKeyMap0 = new DoubleKeyMap<Map<Map<String, Object>, Object>, String, String>();
      HashMap<Map<String, Object>, Object> hashMap0 = new HashMap<Map<String, Object>, Object>();
      String string0 = doubleKeyMap0.get((Map<Map<String, Object>, Object>) hashMap0, "zY3M_[G2d#qA");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<Map<Map<String, Object>, Object>, String, String> doubleKeyMap0 = new DoubleKeyMap<Map<Map<String, Object>, Object>, String, String>();
      HashMap<Map<String, Object>, Object> hashMap0 = new HashMap<Map<String, Object>, Object>();
      doubleKeyMap0.put((Map<Map<String, Object>, Object>) hashMap0, (String) null, "*'3-cCh");
      String string0 = doubleKeyMap0.get((Map<Map<String, Object>, Object>) hashMap0, "zY3M_[G2d#qA");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, HashMap<Object, Map<String, Object>>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Object, Map<String, Object>>, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>((Map<Integer, Map<String, Object>>) null);
      Integer integer0 = new Integer(1395);
      Map<String, Object> map0 = doubleKeyMap0.remove(integer0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<String, Object>, HashMap<Object, Integer>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, Object>, HashMap<Object, Integer>>((Map<Object, Map<Map<String, Object>, HashMap<Object, Integer>>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, integer0, "");
      String string0 = doubleKeyMap0.remove(integer0, integer0);
      assertEquals("", string0);
  }
}