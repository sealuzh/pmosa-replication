/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 11:12:15 GMT 2019
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, String>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Integer, Object>>(comparator0);
      linkedHashTreeMap0.find((String) null, true);
      assertEquals(1, linkedHashTreeMap0.size());
      
      LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, LinkedHashTreeMap<String, String>>();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, String>(comparator1);
      LinkedHashTreeMap<String, String> linkedHashTreeMap3 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap1.keySet();
      Comparator<Object> comparator2 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, Map.Entry<Integer, Object>> linkedHashTreeMap4 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, Map.Entry<Integer, Object>>(comparator2);
      LinkedHashTreeMap<Map.Entry<String, Integer>, Map.Entry<String, Integer>> linkedHashTreeMap5 = new LinkedHashTreeMap<Map.Entry<String, Integer>, Map.Entry<String, Integer>>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(12);
      linkedHashTreeMap2.find(integer0, false);
      assertEquals(0, linkedHashTreeMap2.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      Object object0 = linkedHashTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Integer>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = linkedHashTreeMap_Node0.prev.getKey();
      assertNull(abstractMap_SimpleImmutableEntry0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Object>, Integer>(comparator0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Object>, Object>(comparator0);
      Integer integer0 = new Integer(2);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("[YF", integer0);
      AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Object>(abstractMap_SimpleImmutableEntry0, "[YF");
      linkedHashTreeMap0.put(abstractMap_SimpleEntry0, integer0);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      String string0 = linkedHashTreeMap0.put("A/^xHOKHHi", "A/^xHOKHHi");
      assertNull(string0);
      
      Set<String> set0 = linkedHashTreeMap0.keySet();
      assertTrue(set0.contains("A/^xHOKHHi"));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.putIfAbsent("com.google.gson.inter(al.LinkedHashTreeMap$AvlI*erator", "com.google.gson.inter(al.LinkedHashTreeMap$AvlI*erator");
      linkedHashTreeMap0.entrySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>((Comparator<? super Object>) null);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      Iterator<Integer> iterator0 = linkedHashTreeMap_KeySet0.iterator();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, String>>(comparator1);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedHashTreeMap_Node0 = linkedHashTreeMap1.removeInternalByKey(iterator0);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer>(comparator0);
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      linkedHashTreeMap0.remove((Object) linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.put("com.google.gson.internal.LinkedHashTreeMap", (String) null);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Map.Entry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Map.Entry<String, Integer>>(comparator0);
      linkedHashTreeMap0.get((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      Object object0 = new Object();
      linkedHashTreeMap0.get(object0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>(comparator0);
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, String>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.findByObject(linkedHashTreeMap_AvlBuilder0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("YM~N&<n", (Integer) null);
      linkedHashTreeMap0.containsKey(abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>>();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("", (Integer) null);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Integer>(abstractMap_SimpleEntry0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>(comparator0);
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
  public void test23()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Map.Entry<String, Integer>, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedHashTreeMap<Map.Entry<String, Integer>, Object>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<String, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put("W lG3Ih@t~.XJ", "com.google.gson.internal.LinkedHashTreeMap$Node");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Map.Entry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, Map.Entry<String, Integer>>();
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove("k\"aj*a'zL66fy");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Integer>();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Integer integer0 = new Integer((-85));
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>("", integer0);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<LinkedHashTreeMap<Integer, Object>, Map.Entry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<LinkedHashTreeMap<Integer, Object>, Map.Entry<Object, Object>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Map.Entry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Map.Entry<Object, Object>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Map.Entry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Map.Entry<Object, Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node1);
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
  public void test37()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, String>();
      linkedHashTreeMap_AvlBuilder0.reset((-176));
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, AbstractMap.SimpleEntry<String, String>>();
      linkedHashTreeMap_AvlBuilder0.reset(3872);
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, String>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, LinkedHashTreeMap<Integer, String>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, LinkedHashTreeMap<Integer, String>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, LinkedHashTreeMap<Integer, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, LinkedHashTreeMap<Integer, String>>();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, LinkedHashTreeMap<Integer, String>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, LinkedHashTreeMap<Integer, String>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(4, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer(5);
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, Object>(linkedHashTreeMap_Node0, integer0, 5, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
      
      LinkedHashTreeMap.Node<Integer, Object> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.last();
      assertNotSame(linkedHashTreeMap_Node3, linkedHashTreeMap_Node2);
      assertFalse(linkedHashTreeMap_Node3.equals((Object)linkedHashTreeMap_Node2));
      assertNotNull(linkedHashTreeMap_Node3);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Integer integer0 = new Integer(1);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("", integer0);
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(abstractMap_SimpleImmutableEntry0);
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Integer>>(linkedHashTreeMap_Node0, "", 1, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>();
      Integer integer0 = new Integer((-3416));
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>((String) null, integer0);
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 15, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>();
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>(linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(abstractMap_SimpleImmutableEntry0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>();
      Integer integer0 = new Integer(222);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("#GICq4.^", integer0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, Integer>(abstractMap_SimpleImmutableEntry0);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>();
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>();
      LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<Map.Entry<String, Integer>, String>(linkedHashTreeMap_Node2, linkedHashTreeMap_Node0, (-1), linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node3.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
      assertFalse(linkedHashTreeMap_Node1.equals((Object)linkedHashTreeMap_Node3));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.containsValue("com.google.gson.inter(al.LinkedHashTreeMap$AvlI*erator");
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedHashTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(1016);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>(linkedHashTreeMap_Node0, integer0, 1016, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
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
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Map.Entry<String, Integer>>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Map.Entry<String, Integer>>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Map.Entry<String, Integer>, Map.Entry<String, Integer>>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(linkedHashTreeMap_Node0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<Integer, Map.Entry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<String, Integer>>();
      Integer integer0 = new Integer(0);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(linkedHashTreeMap_Node0);
      linkedHashTreeMap0.putIfAbsent(integer0, abstractMap_SimpleEntry0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Integer integer0 = new Integer(2241);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Map.Entry<Object, Object>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      String string0 = linkedHashTreeMap_Node0.setValue("8xBL^F>M.ex.q%");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap<String, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, LinkedHashTreeMap<Integer, Object>>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.threshold = (-3416);
      String string0 = linkedHashTreeMap0.put("com.google.gson.internal.LinkedHashTreeMap", "m:|'Y:KL");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      linkedHashTreeMap0.putIfAbsent("k\"aj*a'zL66fy", "k\"aj*a'zL66fy");
      boolean boolean0 = linkedHashTreeMap0.containsValue("A/^xHOKHHi");
      assertFalse(boolean0);
  }
}