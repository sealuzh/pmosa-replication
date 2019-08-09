/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 14:55:59 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, Integer>();
      Integer integer0 = linkedTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer((-55));
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, Integer>>((LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, Integer>>) null, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Integer integer1 = linkedTreeMap_Node1.getKey();
      assertEquals((-55), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>((String) null, (String) null);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(abstractMap_SimpleImmutableEntry0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>>(linkedTreeMap_Node0, abstractMap_SimpleEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap0.root = linkedTreeMap_Node1;
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, String>("", (String) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(abstractMap_SimpleEntry1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, String>>();
      Integer integer0 = new Integer((-530));
      linkedTreeMap0.putIfAbsent(integer0, (AbstractMap.SimpleImmutableEntry<Object, String>) null);
      linkedTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>(comparator0);
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(integer0, integer0);
      BiFunction<String, String, String> biFunction0 = (BiFunction<String, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(abstractMap_SimpleImmutableEntry0, "", biFunction0);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Integer>(comparator0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Comparable<Object>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap1 = new LinkedTreeMap<Comparable<Object>, AbstractMap.SimpleImmutableEntry<String, Integer>>(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(comparable0).toString();
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("", integer0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Integer>(abstractMap_SimpleImmutableEntry0);
      linkedTreeMap1.put(comparable0, abstractMap_SimpleImmutableEntry1);
      linkedTreeMap1.findByObject(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Map.Entry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Map.Entry<String, Object>>(comparator0);
      Set<Map.Entry<AbstractMap.SimpleImmutableEntry<Integer, Object>, Map.Entry<String, Object>>> set0 = (Set<Map.Entry<AbstractMap.SimpleImmutableEntry<Integer, Object>, Map.Entry<String, Object>>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      Set<Object> set0 = linkedTreeMap0.keySet();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      linkedTreeMap1.putIfAbsent("", set0);
      linkedTreeMap1.entrySet();
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(5194);
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Object>((Comparator<? super AbstractMap.SimpleImmutableEntry<Object, Object>>) null);
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(integer0, "");
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Object> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, Object>, Object>(comparator0);
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Map.Entry<Object, String>> comparator0 = (Comparator<Map.Entry<Object, String>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Map.Entry<Object, String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, String>, Comparable<Integer>>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      Object object0 = new Object();
      linkedTreeMap0.findByObject(object0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>>(comparator0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("Qeo`waR4j\"'i]=V", "Qeo`waR4j\"'i]=V");
      linkedTreeMap0.find(abstractMap_SimpleEntry0, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, String>();
      boolean boolean0 = linkedTreeMap0.containsKey(comparator0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Object>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>(comparator1);
      Integer integer0 = new Integer(0);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(linkedTreeMap1, biFunction0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>(comparator0);
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Integer integer0 = new Integer(732);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(integer0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(5194);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(linkedList0, biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(linkedTreeMap_KeySet0);
      //  // Unstable assertion: assertEquals(0, linkedTreeMap_EntrySet0.size());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>((Object) null, "6$h~YfM.gYo[$v~x");
      boolean boolean0 = linkedTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(732);
      LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, String>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap_Node0, "");
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Map.Entry<Object, String>>(linkedTreeMap_Node0, abstractMap_SimpleEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Integer>, LinkedTreeMap<Object, Object>>();
      boolean boolean0 = linkedTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Object>>(comparator0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      BiConsumer<Object, Object> biConsumer1 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(24);
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleEntry<Object, Integer>>(comparator0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("+y8.e(", "+y8.e(");
      Integer integer0 = new Integer((-1285));
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<String, Integer>("com.google.gson.internal.LinkedTreeMap$1", integer0);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry2 = new AbstractMap.SimpleEntry<Object, Integer>(abstractMap_SimpleEntry1);
      linkedTreeMap0.putIfAbsent(abstractMap_SimpleEntry0, abstractMap_SimpleEntry2);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Map.Entry<Object, String>> comparator0 = (Comparator<Map.Entry<Object, String>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(nullable(java.util.Map.Entry.class) , nullable(java.util.Map.Entry.class));
      LinkedTreeMap<Map.Entry<Object, String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, String>, Comparable<Integer>>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>(comparator1);
      linkedTreeMap0.put(linkedTreeMap_Node0, (Comparable<Integer>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap1, "com.google.gson.internal.LinkedTreeMap$EntrySet");
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap0.findByEntry(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Integer>>(comparator0);
      LinkedTreeMap.Node<Object, Comparable<Integer>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer((-3129));
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, Object>();
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(integer0, "");
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleImmutableEntry0, (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(2, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap0.values();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(5182);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(linkedList0, biFunction0);
      linkedList0.add(integer0);
      linkedTreeMap_KeySet0.iterator();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.find((Object) null, true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap0.new KeySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.contains("");
      linkedTreeMap_KeySet1.contains(linkedTreeMap_Node0);
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap1 = new LinkedTreeMap<Object, Comparable<Object>>();
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap2 = new LinkedTreeMap<Object, Comparable<Object>>((Comparator<? super Object>) null);
      Set<Object> set0 = linkedTreeMap2.keySet();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Map.Entry<Object, String>>, LinkedTreeMap<Object, Integer>> linkedTreeMap3 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Map.Entry<Object, String>>, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap.Node<Object, Map.Entry<Object, String>> linkedTreeMap_Node1 = null;
      try {
        linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Map.Entry<Object, String>>((LinkedTreeMap.Node<Object, Map.Entry<Object, String>>) null, set0, (LinkedTreeMap.Node<Object, Map.Entry<Object, String>>) null, (LinkedTreeMap.Node<Object, Map.Entry<Object, String>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2473)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(5194);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(linkedList0, biFunction0);
      linkedList0.add(integer0);
      boolean boolean0 = linkedTreeMap_KeySet0.containsAll(linkedList0);
      assertEquals(1, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>(comparator0);
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<Object>>();
      linkedTreeMap0.root = linkedTreeMap_Node1;
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, String>>((Comparator<? super Integer>) null);
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Integer) null, linkedTreeMap1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer((-2297));
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>((Integer) null, integer0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Comparable<Object>>(comparator0);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Comparable<Object>>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replace(abstractMap_SimpleImmutableEntry0, comparable0, comparable0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(5194);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(linkedList0, biFunction0);
      boolean boolean0 = linkedList0.containsAll(linkedTreeMap_KeySet0);
      assertEquals(1, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      String string0 = linkedTreeMap_Node0.setValue("l6w1yCT(8Wy8Z+F");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
