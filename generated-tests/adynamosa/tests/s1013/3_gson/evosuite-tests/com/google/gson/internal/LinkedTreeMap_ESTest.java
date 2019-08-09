/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:56:14 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Object object0 = linkedTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      String string0 = linkedTreeMap_Node1.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>((Comparator<? super Object>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<String, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap0.root = linkedTreeMap_Node1;
      linkedTreeMap0.get("");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.find("'", true);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.putIfAbsent("", linkedTreeMap1);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, LinkedTreeMap<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap1.put("com.google.gson.internal.LinkedTreeMap", "");
      linkedTreeMap1.get(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(1);
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = linkedTreeMap0.find(integer0, true);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any() , any());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator1);
      linkedTreeMap1.find("zlr5nbGPfM>zh^P'T", true);
      linkedTreeMap1.findByEntry(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("Q@_0E]JU", linkedTreeMap_Node0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>(comparator0);
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<Object>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.entrySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      Integer integer0 = new Integer(166);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("", integer0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>>(linkedTreeMap_Node0, abstractMap_SimpleEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node2 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node1);
      assertNull(linkedTreeMap_Node2);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>((Comparator<? super AbstractMap.SimpleImmutableEntry<Object, Object>>) null);
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.put(" is not Comparable", (Integer) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Object) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>(comparator0);
      LinkedTreeMap<Object, Object> linkedTreeMap2 = new LinkedTreeMap<Object, Object>();
      Integer integer0 = new Integer((-2402));
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap0, integer0);
      linkedTreeMap1.put(abstractMap_SimpleEntry0, linkedTreeMap2);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>((Comparator<? super Object>) null);
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<String, String>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, String>, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Comparable<Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Comparable<Integer>>(comparator0);
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, Object>>();
      Integer integer0 = new Integer(460);
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Integer, Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap0.findByObject(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      linkedTreeMap0.find((Object) null, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, LinkedTreeMap<Object, Object>>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, (Object) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      // Undeclared exception!
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<String, Object>) null, true);
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
      LinkedTreeMap<Comparable<String>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Integer>();
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
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("fqTU^G#e@F>X3L", "fqTU^G#e@F>X3L");
      Integer integer0 = new Integer(3558);
      linkedTreeMap0.put("ty$.@Y]9pO<", "");
      linkedTreeMap0.put("ty$.@Y]9pO<", integer0);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      Integer integer0 = new Integer(1);
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      Integer integer0 = new Integer(3558);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(integer0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Iterator<LinkedTreeMap<Object, Object>> iterator0 = linkedTreeMap_KeySet0.iterator();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(iterator0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, (Object) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node1.left.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, (Object) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node0.right.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>>();
      LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap_Node1.setValue(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap1);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, String>();
      LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>>();
      linkedTreeMap_Node0.value = "ts`7%?/W_0@6d[=h!";
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>>();
      LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, Object>>(linkedTreeMap_Node0, "gz+&Lun;3gi", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap_Node1.setValue(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap1);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, String>>(linkedTreeMap_Node1, linkedTreeMap0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("", integer0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Integer>(abstractMap_SimpleImmutableEntry0);
      boolean boolean0 = linkedTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      Integer integer0 = new Integer(2520);
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, Comparable<Object>>((LinkedTreeMap.Node<Integer, Comparable<Object>>) null, integer0, linkedTreeMap_Node0, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, String>();
      boolean boolean0 = linkedTreeMap_Node0.equals("JHb1:*|#[FB#RtpL;f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.keySet();
      Set<String> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)linkedTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("fqTU^G#e@F>X3L", "fqTU^G#e@F>X3L");
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      linkedTreeMap0.find("M1928--@%\"L", true);
      linkedTreeMap0.find("[aJ{9gx{VnEM", true);
      Integer integer0 = new Integer(328);
      linkedTreeMap0.put("", integer0);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("fqTU^G#U|e@F>X3L", "fqTU^G#U|e@F>X3L");
      linkedTreeMap0.find("rHCZ!w$D7KcUN&Z5D&", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet1.removeAll(linkedTreeMap_EntrySet0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, (Object) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
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
  public void test52()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap1.find(linkedTreeMap_Node1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      Integer integer0 = new Integer(3);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("va]=9{g", biFunction0);
      linkedTreeMap0.put("", "");
      linkedTreeMap0.find("dz", true);
      linkedTreeMap0.removeInternalByKey("dz");
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap0.put("%)|HqtP`", "8m(W.ZzD(K_DE3$");
      linkedTreeMap0.remove((Object) "");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, String>, Object>();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<String, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Comparable<String>> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Comparable<String>>(comparator0);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("P", "+G+]6");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap1.merge(abstractMap_SimpleImmutableEntry0, "+G+]6", biFunction0);
      boolean boolean0 = linkedTreeMap1.containsKey(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      linkedTreeMap0.find("M1928--@%\"L", true);
      Predicate<Object> predicate0 = Predicate.isEqual((Object) "[aJ{9gx{VnEM");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.removeIf(predicate0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Integer>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>((Comparator<? super Object>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains("F}vyv1q%Y>:SD_AR");
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("~{AjH/", true);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>((Comparator<? super Object>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
