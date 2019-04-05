/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 13:06:05 GMT 2019
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
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, Integer>();
      Integer integer0 = linkedTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, String>>();
      Object object0 = linkedTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge("key == null", "v7kKe$l!N+~u@", biFunction0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Integer integer0 = new Integer((-1055));
      boolean boolean0 = linkedTreeMap_KeySet0.remove(integer0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      Integer integer0 = new Integer((-1586));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      linkedTreeMap0.removeInternalByKey(integer0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(1749);
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.find(integer0, true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Integer>, Object>(comparator0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, Integer>, Object> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(object0);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(integer0, "");
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("", linkedTreeMap_Node0);
      linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object>();
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>((Comparator<? super Integer>) null);
      LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap1 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<String, Object>>((Comparator<? super LinkedTreeMap<Object, Object>>) null);
      linkedTreeMap1.get(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, String>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>>();
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
  public void test13()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>>(linkedTreeMap_Node1, linkedTreeMap_Node0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap_Node2, "V<Phi+2+,e@Y");
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove("v7kKe$l!N+~u@");
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedTreeMap<LinkedTreeMap<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>>(linkedTreeMap_Node1, linkedTreeMap_Node0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      linkedTreeMap_Node2.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node3 = linkedTreeMap_Node2.first();
      assertNotNull(linkedTreeMap_Node3);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap_Node0.value = linkedTreeMap0;
      assertEquals(0, linkedTreeMap_Node0.value.size());
      
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object>();
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>((Comparator<? super Integer>) null);
      LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
      
      LinkedTreeMap.Node<LinkedTreeMap<Integer, String>, Object> linkedTreeMap_Node3 = linkedTreeMap_Node2.last();
      assertNotNull(linkedTreeMap_Node3);
      
      boolean boolean0 = linkedTreeMap_Node3.equals(linkedTreeMap_Node2);
      assertTrue(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(linkedTreeMap_Node0);
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<Integer, Object>, Object> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleImmutableEntry<Integer, Object>, Object>(abstractMap_SimpleImmutableEntry0, linkedTreeMap0);
      boolean boolean0 = linkedTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer((-3961));
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, String>>();
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, String>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, LinkedTreeMap<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, LinkedTreeMap<Object, Integer>>(comparator0);
      boolean boolean0 = linkedTreeMap_Node0.next.equals(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      linkedTreeMap0.keySet();
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.putAll(linkedTreeMap0);
      linkedTreeMap0.putAll(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>(linkedTreeMap_Node0.right, "", linkedTreeMap_Node0.right, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node2, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node0.right, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, String>>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      Integer integer0 = new Integer(2966);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedTreeMap0, integer0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, (AbstractMap.SimpleImmutableEntry<String, Object>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Object, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Integer>, Object>(comparator0);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.putIfAbsent(linkedTreeMap1, linkedTreeMap1);
      Object object0 = new Object();
      boolean boolean0 = linkedTreeMap0.containsKey(object0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(1);
      BiFunction<Integer, Object, Integer> biFunction0 = (BiFunction<Integer, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(integer0, integer0, biFunction0);
      Integer integer1 = new Integer((-1909));
      linkedTreeMap0.find(integer1, false);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(1);
      BiFunction<Integer, Object, Integer> biFunction0 = (BiFunction<Integer, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(integer0, integer0, biFunction0);
      linkedTreeMap0.putAll(linkedTreeMap0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      linkedTreeMap0.remove((Object) "");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Object) null, "null=null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Object, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Integer>, Object>(comparator0);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.putIfAbsent(linkedTreeMap1, linkedTreeMap1);
      Object object0 = new Object();
      boolean boolean0 = linkedTreeMap0.containsKey(object0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      linkedTreeMap0.remove((Object) "v;ED,|s6D/ohTHc", (Object) "v;ED,|s6D/ohTHc");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      Object object0 = linkedTreeMap_Node0.setValue(linkedTreeMap_Node0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, LinkedTreeMap<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, LinkedTreeMap<Object, Integer>>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      Integer integer0 = new Integer((-1586));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Integer) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}