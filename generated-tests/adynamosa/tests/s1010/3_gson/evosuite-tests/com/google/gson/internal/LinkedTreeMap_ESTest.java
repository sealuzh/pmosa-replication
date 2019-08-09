/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 14:05:37 GMT 2019
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
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      String string0 = linkedTreeMap_Node0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      String string0 = linkedTreeMap_Node0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, String>(comparator0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("9AQ0", "9AQ0");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(abstractMap_SimpleEntry0, biFunction0);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      linkedTreeMap0.size = (-599);
      int int0 = linkedTreeMap0.size();
      assertEquals((-599), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      linkedTreeMap0.find("", true);
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.removeInternalByKey(linkedTreeMap1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator1);
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.put("kd=?fSX", abstractMap_SimpleImmutableEntry0);
      linkedTreeMap0.put(linkedTreeMap1, abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      UnaryOperator<Object> unaryOperator0 = UnaryOperator.identity();
      linkedTreeMap0.computeIfAbsent(",d-V%9-VR.qYR4'U*,", unaryOperator0);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.size = (-390);
      Set<String> set0 = linkedTreeMap0.keySet();
      assertEquals((-390), set0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Map.Entry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, Map.Entry<Object, Object>>(comparator0);
      LinkedTreeMap.Node<Integer, Map.Entry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Map.Entry<Object, Object>>();
      Integer integer0 = new Integer((-516));
      linkedTreeMap0.root = linkedTreeMap_Node0;
      boolean boolean0 = linkedTreeMap0.containsKey(integer0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<String, LinkedTreeMap<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<String, Integer>>();
      LinkedTreeMap.Node<String, LinkedTreeMap<String, Integer>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Object>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node0);
      assertNull(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, Object>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object>(comparator0);
      linkedTreeMap1.remove((Object) linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>((Comparator<? super AbstractMap.SimpleEntry<Object, String>>) null);
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      linkedTreeMap0.findByObject(comparator0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, String>>();
      linkedTreeMap0.find("zX1,V", false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      Object object0 = new Object();
      boolean boolean0 = linkedTreeMap0.containsKey(object0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>((Comparator<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      Integer integer0 = new Integer((-2));
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0, integer0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, (String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>>();
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
  public void test26()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, AbstractMap.SimpleEntry<Object, String>>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((AbstractMap.SimpleEntry<Integer, Object>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = linkedTreeMap0.find("ec(qz\"!G{-", true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>((Comparator<? super Integer>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      String string0 = linkedTreeMap_Node0.setValue("");
      assertNull(string0);
      
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<String>>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<String>>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparable<String> comparable0 = linkedTreeMap_Node1.setValue("");
      assertNull(comparable0);
      
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<String>>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<String>>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>();
      Integer integer0 = Integer.valueOf((-870));
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("", integer0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Integer>, String>(linkedTreeMap_Node0, abstractMap_SimpleEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, String>();
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<String>>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<String>>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedTreeMap0, (Object) null);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      boolean boolean0 = linkedTreeMap_Node0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.keySet();
      Set<Integer> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      Integer integer0 = Integer.valueOf(0);
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
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
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, LinkedTreeMap<Object, Object>>(comparator0);
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.find(linkedTreeMap1, true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(1, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.find("", true);
      linkedTreeMap0.find("ec(qz\"!G{-", true);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(linkedList0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.find("ec(qz\"!G{-", true);
      linkedTreeMap0.find("com.google.gson.internal.LinkedTreeMap$EntrySet$1", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(linkedTreeMap_KeySet0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.find("ec(qz\"!G{-", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(linkedTreeMap_EntrySet0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-870)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator1);
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.put("kd=?fSX", abstractMap_SimpleImmutableEntry0);
      linkedTreeMap0.put(linkedTreeMap1, abstractMap_SimpleImmutableEntry0);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedTreeMap0, (Integer) null);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, String>(comparator0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("9AQ0", "9AQ0");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(abstractMap_SimpleEntry0, biFunction0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((AbstractMap.SimpleEntry<Object, Object>) null, "`tUy-hYZ&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 1, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap0.root = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, Object>();
      Integer integer0 = new Integer(0);
      linkedTreeMap0.replace((Object) linkedTreeMap_Node2, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_EntrySet0.retainAll(linkedTreeMap_KeySet0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.find("ec(qz\"!G{-", true);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(1, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_KeySet0.retainAll(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "DOo&7(9Mt", linkedTreeMap_Node0, linkedTreeMap_Node0);
      String string0 = linkedTreeMap_Node1.toString();
      assertEquals("DOo&7(9Mt=null", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains("V28y4&fN4.EcPP");
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Object>();
      linkedTreeMap0.containsValue((Object) null);
      Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Object>> set0 = (Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Object>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
