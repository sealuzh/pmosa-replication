/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 00:15:32 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListAxioms;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSListSubstitution;
import umd.cs.shop.JSOperator;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSState;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSState_ESTest extends JSState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("ir8st");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSJshopVars.flagLevel = 32;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSState0.addElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSState0.applySubstitutionListLogicalAtoms(jSSubstitution0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSListLogicalAtoms0, jSSubstitution0, jSListAxioms0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSJshopVars.flagLevel = 7;
      StringReader stringReader0 = new StringReader("umd.cs.shopSListLogicalAtoms");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSState0.addElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertFalse(jSListSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSJshopVars.flagLevel = 7;
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
      assertTrue(jSListSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSPlan0.setSize(746);
      jSPlan0.addElement(jSState0);
      jSState0.addElementsToState(jSPlan0);
      assertEquals(2, jSState0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("make-domain ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSState0.addElement(jSTerm0);
      JSState jSState1 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState1.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTaskAtom0, (JSSubstitution) null);
      assertTrue(jSListSubstitution0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSPlan0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
      assertEquals("[]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSPlan0, jSSubstitution0, (JSListAxioms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSListAxioms0.add((Object) jSState0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSPlan0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals("[[[]]]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll((JSListLogicalAtoms) null, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      jSListAxioms0.add((Object) jSState0);
      JSSubstitution jSSubstitution1 = jSState0.satisfies(jSPlan0, jSSubstitution0, jSListAxioms0);
      assertEquals(0, jSSubstitution1.capacity());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSState jSState0 = new JSState();
      // Undeclared exception!
      try { 
        jSState0.satisfies((JSListLogicalAtoms) null, (JSSubstitution) null, (JSListAxioms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSState0.applyOp(jSOperator0, jSSubstitution0, (JSListLogicalAtoms) null, (JSListLogicalAtoms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSPlan0.add((Object) null);
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSState0.applyOp(jSOperator0, jSSubstitution0, jSPlan0, jSPlan0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSState0.applyOp(jSOperator0, (JSSubstitution) null, jSPlan0, jSPlan0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSPlan0);
      JSOperator jSOperator0 = new JSOperator();
      // Undeclared exception!
      try { 
        jSState0.applyOp(jSOperator0, jSSubstitution0, jSPlan0, jSPlan0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.applyOp((JSOperator) null, jSSubstitution0, jSPlan0, jSPlan0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSState jSState1 = jSState0.apply((JSPlan) null);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSPlan0.addWithCost(jSTaskAtom0, 0.0);
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSState jSState0 = new JSState();
      jSState0.addElement((Object) null);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSState0.addElement(jSSubstitution0);
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm((JSPredicateForm) null, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSState0.addElement(jSTaskAtom0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSState0, (JSSubstitution) null, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSState0.addElement(jSSubstitution0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSState0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSPredicateForm
         //
         verifyException("umd.cs.shop.JSListAxioms", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      jSPlan0.addWithCost(jSTaskAtom0, (-3176.529148167444));
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfiesAll(jSPlan0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies((JSListLogicalAtoms) null, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSListAxioms", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSState0);
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSState cannot be cast to umd.cs.shop.JSPairVarTerm
         //
         verifyException("umd.cs.shop.JSSubstitution", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSTerm jSTerm0 = new JSTerm();
      jSPlan0.add((Object) jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      // Undeclared exception!
      try { 
        jSState0.satisfies(jSPlan0, jSSubstitution0, jSListAxioms0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      jSState0.addElement(jSPlan0);
      jSPlan0.addElement(jSState0);
      // Undeclared exception!
      try { 
        jSState0.addElementsToState(jSPlan0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSState jSState0 = new JSState();
      // Undeclared exception!
      try { 
        jSState0.addElementsToState((JSListLogicalAtoms) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSState", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState0 = null;
      try {
        jSState0 = new JSState(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSListLogicalAtoms", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSState jSState0 = null;
      try {
        jSState0 = new JSState((StreamTokenizer) null);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("ir8st");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSJshopVars.flagLevel = 32;
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSState0.addElement(jSTerm0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertEquals("[[]]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSJshopVars.flagLevel = 2492;
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTaskAtom0, jSSubstitution0);
      assertEquals("[]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      StringReader stringReader0 = new StringReader("make-domain ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSState0.addElement(jSTerm0);
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertEquals(1, jSListSubstitution0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("lB{ 9>hamL");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      jSState0.addElement(jSTerm1);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListSubstitution jSListSubstitution0 = jSState0.satisfiesTAm(jSTerm0, jSSubstitution0);
      assertEquals("[]", jSListSubstitution0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSState jSState0 = new JSState();
      StringReader stringReader0 = new StringReader("make-domain ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSState0.addElement(jSTerm0);
      JSState jSState1 = new JSState();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSListAxioms jSListAxioms0 = new JSListAxioms();
      JSSubstitution jSSubstitution1 = jSState1.satisfies(jSState0, jSSubstitution0, jSListAxioms0);
      assertTrue(jSSubstitution1.fail());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSState jSState0 = new JSState();
      jSState0.addElementsToState(jSState0);
      assertTrue(jSState0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?5(?");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSState jSState0 = new JSState(streamTokenizer0);
      assertEquals("", jSState0.Name());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSState jSState0 = new JSState();
      JSPlan jSPlan0 = new JSPlan();
      JSState jSState1 = jSState0.apply(jSPlan0);
      assertNotSame(jSState1, jSState0);
  }
}
