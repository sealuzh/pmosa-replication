/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:06:28 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>(comparator1);
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, String> linkedHashTreeMap2 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, String>();
      linkedHashTreeMap2.keySet();
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap3 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      linkedHashTreeMap3.keySet();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap4 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer(739);
      linkedHashTreeMap4.putIfAbsent("", integer0);
      assertEquals(1, linkedHashTreeMap4.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Integer, Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = linkedHashTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleImmutableEntry0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      Object object0 = linkedHashTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, Object>();
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, String>();
      linkedHashTreeMap0.size = 145;
      Set<AbstractMap.SimpleImmutableEntry<String, String>> set0 = linkedHashTreeMap0.keySet();
      assertEquals(145, set0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("com.google.gson.internal.LinkedHashTreeMap$AvlIterator", "com.google.gson.internal.LinkedHashTreeMap$AvlIterator");
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      Object object0 = linkedHashTreeMap0.remove((Object) abstractMap_SimpleImmutableEntry0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      linkedHashTreeMap0.get((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, LinkedHashTreeMap<Object, Object>>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap0.get(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Object>(comparator0);
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      linkedHashTreeMap0.findByObject(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find(")(0YXh.k\"j4)0(\"iULd", true);
      assertNotNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      Integer integer0 = new Integer((-2278));
      linkedHashTreeMap0.find(integer0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Map.Entry<String, Object>, Comparable<Map.Entry<Integer, Object>>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Map.Entry<String, Object>, Comparable<Map.Entry<Integer, Object>>>();
      LinkedHashTreeMap.Node<Map.Entry<String, Object>, Comparable<Map.Entry<Integer, Object>>> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove("com.google.gson.internal.LinkedHashTreeMap$KeySet$1");
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0.next);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap1);
      assertEquals(0, linkedHashTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, String>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, LinkedHashTreeMap<Object, String>>(linkedHashTreeMap_Node0, (AbstractMap.SimpleEntry<Object, String>) null, (-2640), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.reset((-2640));
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 10);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
      
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.last();
      assertSame(linkedHashTreeMap_Node3, linkedHashTreeMap_Node2);
      assertNotNull(linkedHashTreeMap_Node3);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node3;
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, Integer>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(20, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Map.Entry<Integer, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Map.Entry<Integer, Object>>();
      LinkedHashTreeMap.Node<Integer, Map.Entry<Integer, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Map.Entry<Integer, Object>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, Map.Entry<Integer, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, "!9o}g(`jz_5Qiaa@p", 2973, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, String>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap.Node<Comparable<Object>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<Object>, String>(linkedHashTreeMap_Node0, comparable0, 137, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, String>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      Integer integer0 = new Integer((-694));
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("", integer0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, (-694), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      Integer integer0 = new Integer((-694));
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("", integer0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, (-694), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(2498);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>();
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      boolean boolean0 = linkedHashTreeMap_Node0.left.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, Object>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, Object>>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, Object>>(linkedHashTreeMap_Node0, linkedHashTreeMap1, 1, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap_EntrySet0, "");
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap1.put(abstractMap_SimpleEntry0, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Object>(comparator0);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("", "");
      linkedHashTreeMap0.putIfAbsent(abstractMap_SimpleEntry0, abstractMap_SimpleEntry0);
      linkedHashTreeMap0.replace(abstractMap_SimpleEntry0, (Object) null);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Integer integer0 = new Integer((-2825));
      Object object0 = new Object();
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>(integer0, object0);
      LinkedHashTreeMap<Object, Map.Entry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Map.Entry<Integer, Object>>();
      linkedHashTreeMap0.putIfAbsent(integer0, abstractMap_SimpleEntry0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      Integer integer0 = new Integer((-310));
      linkedHashTreeMap0.put(integer0, integer0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.putIfAbsent((Integer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Object>(comparator0);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("", "");
      linkedHashTreeMap0.putIfAbsent(abstractMap_SimpleEntry0, abstractMap_SimpleEntry0);
      linkedHashTreeMap0.replace(abstractMap_SimpleEntry0, (Object) null);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 6);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleEntry>>, AbstractMap.SimpleImmutableEntry<String, Integer>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(12, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)linkedHashTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      Object object0 = linkedHashTreeMap_Node0.setValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<Integer, Object>>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }
}
