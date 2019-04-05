/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:43:03 GMT 2019
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
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = linkedTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Integer, String>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, String>, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      linkedTreeMap0.root = linkedTreeMap_Node0;
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, String> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, String>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.put("", abstractMap_SimpleEntry0);
      linkedTreeMap0.put("", abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Integer>>(comparator0);
      linkedTreeMap0.find("", true);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Comparable<Object>>((Comparator<? super Comparable<String>>) null);
      linkedTreeMap0.findByObject("com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.entrySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Map.Entry<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Map.Entry<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>>>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>>();
      linkedTreeMap0.put(comparable0, linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      Object object0 = new Object();
      linkedTreeMap0.get(object0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, String>>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(0);
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap1.put(linkedTreeMap_EntrySet0, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$EntrySet is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
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
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      linkedTreeMap0.putIfAbsent("", "");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Integer integer0 = new Integer(627);
      boolean boolean0 = linkedTreeMap_KeySet0.remove(integer0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Integer integer0 = new Integer(0);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(integer0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap<String, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(379);
      Integer integer1 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(integer1);
      
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(379);
      Integer integer1 = linkedTreeMap_Node0.setValue(integer0);
      assertNull(integer1);
      
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      linkedTreeMap0.keySet();
      Set<AbstractMap.SimpleEntry<Integer, Object>> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.entrySet();
      Set<Map.Entry<Object, Integer>> set0 = (Set<Map.Entry<Object, Integer>>)linkedTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node0;
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(246);
      linkedTreeMap0.put(integer0, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet1.retainAll(linkedTreeMap_EntrySet0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap1.find(linkedTreeMap_KeySet0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$KeySet is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-69)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Integer>>(comparator0);
      linkedTreeMap0.find("", true);
      linkedTreeMap0.remove((Object) "");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Integer>>(comparator0);
      linkedTreeMap0.find("", true);
      linkedTreeMap0.remove((Object) "");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<Object, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<String>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Object) null, (Comparable<String>) null);
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
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(1);
      linkedTreeMap0.put(integer0, integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(integer0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      LinkedTreeMap<Integer, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, Object>>(comparator0);
      Integer integer0 = new Integer(3);
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      BiFunction<Object, Object, LinkedTreeMap<Object, Object>> biFunction0 = (BiFunction<Object, Object, LinkedTreeMap<Object, Object>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(integer0, linkedTreeMap1, biFunction0);
      linkedTreeMap0.get("wssj6=Qw");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(1);
      linkedTreeMap0.put(integer0, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.removeAll(linkedTreeMap_EntrySet0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<String, Object>>();
      LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, AbstractMap.SimpleEntry<Object, String>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<String, Object>>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Object object0 = linkedTreeMap_Node1.getKey();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, Object>>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}