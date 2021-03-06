/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 16:51:59 GMT 2019
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
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>((Map<Object, Map<Object, String>>) null);
      doubleKeyMap0.put((Object) null, (Object) null, "1Bb+TL8&'DtaQW@V~");
      Map<Object, String> map0 = doubleKeyMap0.remove((Object) null);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, String, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, String, String>((Map<String, Map<String, String>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<Integer, Integer>, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Integer, Integer>, Map<Integer, Integer>>();
      Map<String, Map<Map<Integer, Integer>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Map<Integer, Integer>, String> doubleKeyMap1 = new DoubleKeyMap<String, Map<Integer, Integer>, String>(map0, class0);
      Map<Map<Integer, Integer>, String> map1 = doubleKeyMap1.get("uN<7|0");
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<Map<Integer, Integer>, Object>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<Map<Integer, Integer>, Object>>();
      DoubleKeyMap<HashMap<Object, Object>, Map<Integer, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Map<Integer, Integer>, Object>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      doubleKeyMap0.put(hashMap1, (Map<Integer, Integer>) null, (Object) hashMap0);
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      doubleKeyMap0.remove(hashMap1, (Map<Integer, Integer>) hashMap2);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>((Map<Object, Map<Object, String>>) null);
      doubleKeyMap0.put((Object) null, (Object) null, "1Bb+TL8&'DtaQW@V~");
      String string0 = doubleKeyMap0.put((Object) null, (Object) null, "us.codecraft.webmagic.utils.DoubleKeyMap");
      assertEquals("1Bb+TL8&'DtaQW@V~", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>();
      Map<Map<Object, Object>, Map<Map<Object, Integer>, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, Object>, Map<Object, Integer>, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Object>, Map<Object, Integer>, Object>(map0, class0);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      Object object0 = doubleKeyMap1.get((Map<Object, Object>) hashMap0, (Map<Object, Integer>) hashMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Map<Integer, Integer>>();
      Map<Object, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(map0);
      Map<String, Map<Integer, Integer>> map1 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap2 = new DoubleKeyMap<String, Integer, Integer>(map1, class0);
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap2.remove(" Ep(u`r", integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, HashMap<Object, Object>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, Object>, Object>(class0);
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
      DoubleKeyMap<Object, Integer, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Map<Integer, Integer>>();
      Map<Object, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(map0);
      Map<String, Map<Integer, Integer>> map1 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap2 = new DoubleKeyMap<String, Integer, Integer>(map1, class0);
      Map<Integer, Integer> map2 = doubleKeyMap2.remove((String) null);
      assertNull(map2);
  }
}
