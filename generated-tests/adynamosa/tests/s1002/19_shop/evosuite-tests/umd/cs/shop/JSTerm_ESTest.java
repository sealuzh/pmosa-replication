/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 23:11:41 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSTerm_ESTest extends JSTerm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.call();
      jSTerm0.addAll((Collection) jSSubstitution0);
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertEquals("[[(this Collection), (this Collection)]]", jSTerm1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?)-gU+'.&P{FIL/n72");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      jSTerm2.matches(jSTerm1, jSSubstitution1);
      assertFalse(jSTerm1.isFunction());
      assertEquals(1, jSSubstitution1.size());
      assertFalse(jSTerm2.isFunction());
      assertFalse(jSTerm2.isEval());
      assertTrue(jSTerm2.isVariable());
      assertFalse(jSTerm2.isConstant());
      assertEquals("[?0]", jSTerm2.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("P");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) stringReader0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertTrue(jSTerm1.equals((Object)jSTerm0));
      
      jSTerm0.addAll((Collection) jSTerm0);
      jSTerm0.matches(jSTerm1);
      assertNotSame(jSTerm1, jSTerm0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?)-gU+'.&P{FIL/n72");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSTerm0, jSSubstitution1);
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSSubstitution2.fail());
      assertEquals("[?]", jSTerm1.toString());
      assertTrue(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm0, jSSubstitution0);
      JSTerm jSTerm2 = jSTerm1.applySubstitutionT(jSSubstitution1);
      assertEquals(1, jSSubstitution1.size());
      assertFalse(jSTerm0.isFunction());
      assertNotSame(jSTerm2, jSTerm0);
      assertFalse(jSTerm2.isEval());
      assertFalse(jSTerm2.isFunction());
      assertEquals("[?%%%]", jSTerm1.toString());
      assertTrue(jSTerm2.isVariable());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm0);
      assertFalse(jSSubstitution0.isEmpty());
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isVariable();
      assertFalse(jSTerm0.isEval());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertTrue(boolean0);
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("c2/k$izz#q:!@ch,b");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isConstant();
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("sbU:8n}~");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.clear();
      JSTerm jSTerm1 = jSTerm0.call();
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("t");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm0.isEval());
      
      jSTerm0.makeEval(true);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.applySubstitutionT(jSSubstitution0);
      assertTrue(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = jSTerm0.matches(jSTerm0);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT((JSSubstitution) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(40);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(40);
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt((Object) null, 0);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      Object object0 = new Object();
      jSSubstitution0.add(object0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.parseList((StreamTokenizer) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSTerm) null, jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("P");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) stringReader0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm1.matches(jSTerm1, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("Z<&");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm1);
      jSTerm0.makeVariable();
      // Undeclared exception!
      try { 
        jSTerm0.matches(jSTerm1, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("v");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) stringReader0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.applySubstitutionT(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm1.matches(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(40);
      // Undeclared exception!
      try { 
        jSTerm0.isGround();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Expecting word as term");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSTerm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.setSize(32);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionT(jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isEval());
      assertEquals("?%%% ", stringBuffer0.toString());
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("1h-");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StringBuffer stringBuffer0 = jSTerm0.toStr();
      assertFalse(jSTerm0.isEval());
      assertEquals(4, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertFalse(jSTerm0.isFunction());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertTrue(boolean0);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MnRz4?Z");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.equals(jSTerm0);
      assertFalse(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Term expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
      assertFalse(jSTerm0.isEval());
      assertNotSame(jSSubstitution1, jSSubstitution0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?)-gU+'.&P{FIL/n72");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isConstant());
      assertFalse(jSTerm0.isFunction());
      assertFalse(jSTerm1.isEval());
      assertEquals("[?]", jSTerm1.toString());
      assertFalse(jSTerm1.isFunction());
      assertTrue(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isVariable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeEval(false);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeFunction();
      boolean boolean0 = jSTerm0.isFunction();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isConstant();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      boolean boolean0 = jSTerm0.isEval();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeConstant();
      assertTrue(jSTerm0.isConstant());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(40);
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.call();
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm0.isFunction());
      assertTrue(jSTerm1.isVariable());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A6)@'/Jn");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm1.standardizerTerm();
      assertEquals(41, streamTokenizer0.ttype);
      assertTrue(jSTerm2.equals((Object)jSTerm1));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.standardizerTerm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Term expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      assertFalse(jSTerm1.isFunction());
      assertEquals("[Term]", jSTerm1.toString());
      assertTrue(jSTerm1.isConstant());
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isVariable());
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      Object object0 = jSTerm0.clone();
      jSSubstitution0.add(object0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.makeVariable();
      boolean boolean0 = jSTerm0.isGround();
      assertTrue(jSTerm0.isVariable());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MnRz4?Z");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm0.isGround();
      assertFalse(jSTerm0.isEval());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?)-gU+'.&P{FIL/n72");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = jSTerm0.parseList(streamTokenizer0);
      jSTerm1.toStr();
      assertEquals(41, streamTokenizer0.ttype);
      assertEquals("[., [?], [nil]]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt("%%%", 0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm1.isConstant());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm2 = jSTerm0.call();
      boolean boolean0 = jSTerm1.equals(jSTerm2);
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isConstant());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      jSSubstitution0.add((Object) jSTerm0);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm1 = jSTerm0.call();
      // Undeclared exception!
      try { 
        jSTerm1.equals(jSTerm1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSTerm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      boolean boolean0 = jSTerm0.equals(jSTerm1);
      assertFalse(jSTerm0.isEval());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(boolean0);
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("?)-gU+'.&P{FIL/n72");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm2 = jSTerm0.parseList(streamTokenizer0);
      boolean boolean0 = jSTerm2.equals(jSTerm1);
      assertTrue(jSTerm2.isConstant());
      assertFalse(jSTerm2.isVariable());
      assertFalse(jSTerm1.isEval());
      assertEquals("[nil]", jSTerm2.toString());
      assertEquals("[?]", jSTerm1.toString());
      assertTrue(jSTerm1.isVariable());
      assertFalse(jSTerm2.isFunction());
      assertFalse(jSTerm1.isFunction());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = (JSTerm)jSTerm0.clone();
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm2 = jSTerm0.call();
      JSSubstitution jSSubstitution1 = jSTerm1.matches(jSTerm2, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      assertTrue(jSTerm2.isFunction());
      assertFalse(jSTerm2.isConstant());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("?)-gU+'.&P{FIL/n72");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isConstant());
      
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      JSSubstitution jSSubstitution2 = jSTerm1.matches(jSTerm1, jSSubstitution1);
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSSubstitution2.fail());
      assertEquals(1, jSSubstitution1.size());
      assertEquals("[?]", jSTerm1.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Term expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
      assertFalse(jSTerm1.isEval());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("Predicateform.print(): 0 elements");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      assertFalse(jSTerm1.isVariable());
      
      JSSubstitution jSSubstitution0 = jSTerm1.matches(jSTerm0, (JSSubstitution) null);
      assertFalse(jSTerm1.isEval());
      assertNotNull(jSSubstitution0);
      assertTrue(jSSubstitution0.fail());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm0, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm1.addAll((Collection) jSSubstitution0);
      jSTerm2.addAll((Collection) jSTerm1);
      jSTerm2.applySubstitutionT(jSSubstitution0);
      assertEquals(2, jSTerm2.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(32);
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.insertElementAt("%%%", 0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches(jSTerm1, jSSubstitution0);
      assertFalse(jSTerm1.isConstant());
      assertEquals(0, jSSubstitution1.size());
      assertFalse(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.cloneT();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm0 = new JSTerm();
      JSTerm jSTerm1 = new JSTerm();
      jSSubstitution0.add((Object) jSTerm1);
      jSTerm0.addAll((Collection) jSSubstitution0);
      JSTerm jSTerm2 = jSTerm0.call();
      jSTerm1.addAll((Collection) jSSubstitution0);
      jSTerm2.addAll((Collection) jSTerm1);
      jSTerm2.print();
      assertEquals(1, jSTerm0.size());
      assertFalse(jSTerm0.equals((Object)jSTerm2));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader(" Term expected");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertEquals(32, streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?-Xd|qIITY5F1eX<@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.print();
      assertFalse(jSTerm0.isEval());
      assertEquals("[?%%%]", jSTerm0.toString());
      assertFalse(jSTerm0.isConstant());
      assertTrue(jSTerm0.isVariable());
      assertFalse(jSTerm0.isFunction());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(pLd");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(pLd");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.parseList(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StringReader stringReader0 = new StringReader("A6)@'/Jn");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.parseList(streamTokenizer0);
      JSTerm jSTerm1 = null;
      try {
        jSTerm1 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%pLd");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      assertEquals((-3), streamTokenizer0.ttype);
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%*l-f_e4SC8z");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(+pLId");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = null;
      try {
        jSTerm0 = new JSTerm(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSTerm", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MnRz4?Z");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.isFunction();
      assertFalse(jSTerm0.isVariable());
      assertFalse(jSTerm0.isEval());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MnRz4?Z");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.cloneT();
      assertNotSame(jSTerm1, jSTerm0);
      assertFalse(jSTerm1.isFunction());
      assertFalse(jSTerm1.isEmpty());
      assertFalse(jSTerm1.isEval());
      assertFalse(jSTerm1.isVariable());
      assertTrue(jSTerm1.isConstant());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.call();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }
}
