/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:03:07 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<Integer>>();
      Object object0 = linkedTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Integer, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>> linkedTreeMap0 = new LinkedTreeMap<Integer, Comparable<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>>((Comparator<? super Integer>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "com.google.gson.internal.LinkedTreeMap", linkedTreeMap_Node0, linkedTreeMap_Node0);
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(linkedTreeMap_Node1);
      linkedTreeMap0.put("com.google.gson.internal.LinkedTreeMap", abstractMap_SimpleImmutableEntry0);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Map.Entry<String, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, Map.Entry<String, String>>(comparator0);
      Integer integer0 = new Integer(1);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      linkedTreeMap0.putIfAbsent(integer0, linkedTreeMap_Node0);
      linkedTreeMap0.put(integer0, (Map.Entry<String, String>) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer((-1));
      BiFunction<Integer, Integer, Integer> biFunction0 = (BiFunction<Integer, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(integer0, integer0, biFunction0);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, String> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, String>(comparator0);
      Set<Map.Entry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, String>> set0 = (Set<Map.Entry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, String>>)linkedTreeMap0.entrySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>((Comparator<? super String>) null);
      LinkedTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Comparable<String>>(comparator0);
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>((Comparator<? super AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>>) null);
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<String, String>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Object>, Integer>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>((Comparator<? super Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>) null);
      LinkedTreeMap<AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>((Comparator<? super AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>();
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(linkedTreeMap_Node1);
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleEntry<AbstractMap.SimpleEntry<Integer, String>, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<AbstractMap.SimpleEntry<Integer, String>, Object>(abstractMap_SimpleEntry0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(abstractMap_SimpleEntry1);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, String>();
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer((-1));
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, "s_Av+CM/`L`RI)`z( z");
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Integer, String>(abstractMap_SimpleEntry0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object>(linkedTreeMap_Node0, abstractMap_SimpleEntry1, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object>();
      Integer integer0 = new Integer((-1));
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node1, integer0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = linkedTreeMap_Node0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, AbstractMap.SimpleEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, AbstractMap.SimpleEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>>();
      Set<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<Object, Object>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Object, Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Object>, LinkedTreeMap<Integer, Object>>((Comparator<? super Map.Entry<Object, Object>>) null);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedTreeMap0, linkedTreeMap_Node0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(abstractMap_SimpleImmutableEntry0);
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, linkedTreeMap1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Object, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, LinkedTreeMap<String, Object>>();
      Integer integer0 = new Integer(163);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.put(integer0, linkedTreeMap1);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>(comparator0);
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedTreeMap0, integer0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, Object>();
      linkedTreeMap0.put(abstractMap_SimpleEntry0, linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      
      linkedTreeMap0.remove((Object) integer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.putIfAbsent((Integer) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>((Comparator<? super Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>) null);
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, String>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, String>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet1.removeAll(linkedTreeMap_KeySet0);
      assertEquals(0, linkedTreeMap_KeySet1.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>((Comparator<? super AbstractMap.SimpleEntry<Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>, Object>>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains("d2$");
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Integer, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>> linkedTreeMap0 = new LinkedTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<Integer, String>, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
