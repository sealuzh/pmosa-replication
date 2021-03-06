/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:15:05 GMT 2019
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
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<Comparable<Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Integer>((Comparator<? super Comparable<Integer>>) null);
      Integer integer0 = Integer.valueOf(1);
      Integer integer1 = linkedTreeMap0.put(integer0, integer0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("s", integer1);
      linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>(comparator1);
      Integer integer0 = new Integer((-1913));
      linkedTreeMap0.put(linkedTreeMap1, integer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.findByObject(linkedTreeMap1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Integer>();
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Integer, Object>>();
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, Integer>(comparator0);
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Integer>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap<Integer, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, String>>((Comparator<? super Integer>) null);
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
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
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, String>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove("&>':Ky5Sd}n1.dOl]");
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>((Comparator<? super Integer>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node0;
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0.parent);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<String, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, Object>, Integer>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<String, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, Object>, Integer>();
      LinkedTreeMap.Node<LinkedTreeMap<String, Object>, Integer> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, Integer>();
      LinkedTreeMap.Node<Comparable<Object>, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, Integer>(linkedTreeMap_Node0, (Comparable<Object>) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Comparable<Object>, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, Object>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<String>>();
      Comparable<String> comparable0 = linkedTreeMap_Node1.setValue("[]");
      assertNull(comparable0);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, Integer>, Object>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<String>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>>(linkedTreeMap_Node0, "com.google.gson.internal.LinkedTreeMap$EntrySet", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      boolean boolean0 = linkedTreeMap_Node0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      linkedTreeMap0.keySet();
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String>();
      linkedTreeMap0.entrySet();
      Set<Map.Entry<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String>> set0 = (Set<Map.Entry<AbstractMap.SimpleImmutableEntry<Integer, Integer>, String>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Integer>(comparator0);
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap1 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>((Comparator<? super Object>) null);
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap1.removeInternal(linkedTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<String, String>>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("", "");
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, abstractMap_SimpleEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap0.find("", true);
      Object object0 = linkedTreeMap0.putIfAbsent("A`B", linkedTreeMap_EntrySet0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge("|&[rq\"\"~y", "|&[rq\"\"~y", biFunction0);
      linkedTreeMap0.find("\"?(o|h:()", false);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1900).when(comparator0).compare(anyString() , anyString());
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      BiFunction<Object, Object, Comparable<Object>> biFunction0 = (BiFunction<Object, Object, Comparable<Object>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge("", comparable0, biFunction0);
      boolean boolean0 = linkedTreeMap0.containsKey("");
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap1 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedTreeMap1.remove((Object) linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyString() , anyString());
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>(comparator0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      BiFunction<Object, Object, Comparable<Object>> biFunction0 = (BiFunction<Object, Object, Comparable<Object>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge("", comparable0, biFunction0);
      boolean boolean0 = linkedTreeMap0.containsKey("");
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Integer>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparable0).compareTo(any());
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("psi.NW:=2(1m#hR", "psi.NW:=2(1m#hR", "", "", "").when(comparable1).toString();
      Integer integer0 = new Integer(396);
      linkedTreeMap0.putIfAbsent(comparable1, integer0);
      assertEquals(1, linkedTreeMap0.size());
      
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(biFunction0).apply(any() , anyInt());
      linkedTreeMap0.computeIfPresent(comparable0, biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, String>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<Object, Integer>>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = linkedTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<Object>>();
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<Object>>(linkedTreeMap_Node0, (String) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      String string0 = linkedTreeMap_Node1.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, "JsDLA", linkedTreeMap_Node0, linkedTreeMap_Node0);
      Object object0 = linkedTreeMap_Node1.getKey();
      assertEquals("JsDLA", object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, "JsDLA", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap_Node1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
