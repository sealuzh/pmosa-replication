/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:05:34 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Step[] stepArray0 = locationPath0.getSteps();
      assertNull(stepArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Step[] stepArray1 = locationPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      QName qName0 = new QName("UW $$Xd2");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      RootContext rootContext1 = (RootContext)locationPath0.evalSteps(rootContext0);
      assertFalse(rootContext1.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("@(#) $RCSfile: Element.java,v $ $Revision: 1.159 $ $Date: 2007/11/14 05:02:08 $ $Name:  $");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(5, (Expression[]) null);
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step((-3135), processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      Step step1 = new Step(9, processingInstructionTest0, (Expression[]) null);
      stepArray0[3] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, (Expression[]) null, stepArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, false);
      EvalContext evalContext0 = locationPath0.evalSteps(childContext0);
      SelfContext selfContext0 = new SelfContext(evalContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath(selfContext0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-3736), (Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, (Expression[]) null, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step((-1804), processingInstructionTest0, (Expression[]) null);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, (Step[]) null);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      QName qName0 = new QName("UW $$Xd2");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      RootContext rootContext1 = (RootContext)locationPath0.buildContextChain(rootContext0, 1970, false);
      assertEquals(0, rootContext1.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(5, (Expression[]) null);
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step((-3135), processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, (Expression[]) null, stepArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, false);
      EvalContext evalContext0 = locationPath0.evalSteps(childContext0);
      SelfContext selfContext0 = new SelfContext(evalContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.SelfContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationAnd0, coreOperationAnd0);
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(3696);
      Step step0 = new Step(1026, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("\"}-Gen!");
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[1];
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[3];
      stepArray0[6] = step0;
      stepArray0[7] = step0;
      Step step1 = new Step(13, processingInstructionTest0, expressionArray0);
      stepArray0[8] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("ku[20{}?");
      Step step1 = new Step(12, processingInstructionTest0, expressionArray0);
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, stepArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      // Undeclared exception!
      try { 
        locationPath0.compute(initialContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-3736), (Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, (Expression[]) null, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, false);
      expressionPath0.createContextForStep(childContext0, 11, processingInstructionTest0);
      //  // Unstable assertion: assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "Exception trying to remove xpath ");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 10, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.compiler.Path");
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, constant0);
      Step[] stepArray0 = new Step[1];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, (Expression[]) null, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(namespaceContext0, true, (NodeTest) null);
      EvalContext evalContext0 = expressionPath0.createContextForStep(ancestorContext0, 8, (NodeTest) null);
      assertEquals(1, evalContext0.getDocumentOrder());
      assertNotNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Constant constant0 = new Constant("-DO0\"^roPJ=$wa2&");
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("-DO0\"^roPJ=$wa2&");
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      QName qName0 = new QName("-DO0\"^roPJ=$wa2&");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-DO0\"^roPJ=$wa2&");
      Step step1 = new Step(7, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(6);
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(107, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(6, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[0]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      ChildContext childContext0 = new ChildContext(initialContext0, nodeTypeTest0, true, true);
      // Undeclared exception!
      try { 
        locationPath0.compute(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step((-3135), processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      Expression[] expressionArray0 = new Expression[5];
      Step step1 = new Step(5, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, false, false);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(childContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("^<u'tnAV^3!k;%U");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      ParentContext parentContext0 = new ParentContext(descendantContext0, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(parentContext0, processingInstructionTest0, true, true);
      EvalContext evalContext0 = locationPath0.createContextForStep(childContext0, 4, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationUnion0, (Expression) null);
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Cannot determine the length of the indexed property ");
      Step step0 = new Step(104, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[2];
      Step step1 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[6] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 3696, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("I$");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, true);
      locationPath0.createContextForStep(childContext0, 2, processingInstructionTest0);
      //  // Unstable assertion: assertEquals(1, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAdd0, coreOperationAdd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationSubtract0, coreOperationAdd0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationNotEqual0, coreOperationAdd0);
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("", "/t5/e 2+t0So_E~@J");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "/t5/e 2+t0So_E~@J");
      Step step0 = new Step(45, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 45, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 2361, nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      VariablePointer variablePointer0 = new VariablePointer((QName) null);
      QName qName0 = new QName("UW $$Xd2");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newChildNodePointer(variablePointer0, qName0, variablePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      BeanPointer beanPointer1 = (BeanPointer)locationPath0.searchForPath(rootContext0);
      assertNotSame(beanPointer1, beanPointer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("BQ{/z6i{C0qf!");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, processingInstructionTest0);
      SelfContext selfContext0 = new SelfContext(descendantContext0, processingInstructionTest0);
      UnionContext unionContext0 = new UnionContext(selfContext0, (EvalContext[]) null);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(unionContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.UnionContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) expressionArray0[1]);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("org.apache.commons.jxpath.ri.compiler.Path", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.ri.compiler.Path
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Expression[] expressionArray0 = new Expression[1];
      Expression[] expressionArray1 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray1);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      expressionArray1[0] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      QName qName0 = new QName("d,e-_m");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, expressionArray0[0]);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNegate0, variableReference0);
      Step[] stepArray0 = new Step[7];
      Expression[] expressionArray1 = new Expression[2];
      expressionArray1[0] = (Expression) coreOperationGreaterThanOrEqual0;
      expressionArray1[1] = (Expression) nameAttributeTest0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Constant constant0 = new Constant("@3{2cIx#z,<)W~B-`c");
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("~", "CfP6\"Dc4 {;-Aqr");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(2, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      Expression[] expressionArray0 = new Expression[0];
      Step step1 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(")9w&");
      Step step0 = new Step(2, processingInstructionTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      QName qName0 = new QName("", "");
      Expression[] expressionArray0 = new Expression[3];
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(variableReference0, variableReference0);
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(extensionFunction0, coreOperationDivide0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationDivide0);
      Step[] stepArray0 = new Step[20];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleStep(step0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimplePath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      QName qName0 = new QName("(w0vV()OSCtHki3)ueH");
      Expression[] expressionArray0 = new Expression[8];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[7];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "(w0vV()OSCtHki3)ueH");
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(74);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Constant constant0 = new Constant("local-name");
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3290));
      Step step0 = new Step((-1112), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      boolean boolean1 = expressionPath0.isSimplePath();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QName qName0 = new QName("@(#) $RCSfile: Element.java,v $ $Revision: 1.159 $ $Date: 2007/11/14 05:02:08 $ $Name:  $");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) coreOperationMod0;
      Step[] stepArray0 = new Step[5];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "@(#) $RCSfile: Element.java,v $ $Revision: 1.159 $ $Date: 2007/11/14 05:02:08 $ $Name:  $");
      Step step0 = new Step((-766), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Expression[] expressionArray1 = new Expression[9];
      expressionArray1[0] = (Expression) coreOperationMod0;
      expressionArray1[1] = (Expression) coreOperationMod0;
      expressionArray1[2] = (Expression) variableReference0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray1[0], expressionArray0[0]);
      expressionArray1[3] = (Expression) nameAttributeTest0;
      Step step1 = new Step((-766), nodeNameTest0, expressionArray1);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction((-3736), (Expression[]) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, (Expression[]) null, (Step[]) null);
      boolean boolean0 = expressionPath0.isContextDependent();
      assertFalse(boolean0);
  }
}