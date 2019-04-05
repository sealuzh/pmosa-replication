/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:49:13 GMT 2019
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
import org.apache.commons.jxpath.ri.axes.PredicateContext;
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
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
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
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      QName qName0 = new QName("?Ps3^eJ=fYn$-AfEulw");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant constant0 = new Constant("[@name='");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, (Expression[]) null, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray1, stepArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Step[] stepArray1 = locationPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CoreOperationOr coreOperationOr0 = new CoreOperationOr((Expression[]) null);
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(29, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationOr0, (Expression[]) null, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, false, (NodeTest) null);
      SelfContext selfContext0 = new SelfContext(descendantContext0, nodeNameTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(selfContext0);
      assertNull(evalContext0);
      assertEquals(0, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, expressionArray0[2]);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMod0, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationGreaterThan0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, expressionArray0[1]);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationNotEqual0);
      Step[] stepArray0 = new Step[3];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(928, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) step0);
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.evalSteps(rootContext0);
      assertFalse(predicateContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(12);
      Step step0 = new Step(12, nodeTypeTest0, (Expression[]) null);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Step step0 = new Step((-1336), nodeNameTest0, (Expression[]) null);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("[@name='");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 12, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[4];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(401);
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, false, true);
      ParentContext parentContext0 = new ParentContext(childContext0, nodeTypeTest0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(parentContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(12);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "node");
      QName qName0 = new QName("UNKNOWN()");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locationPath0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(rootContext0, 1524, nodeTypeTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      InitialContext initialContext1 = (InitialContext)locationPath0.buildContextChain(initialContext0, (-1027), true);
      assertEquals(0, initialContext1.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant constant0 = new Constant("[@name='");
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, constant0);
      Step[] stepArray0 = new Step[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      Step step0 = new Step(6, (NodeTest) null, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain((EvalContext) null, 1340, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(13, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(ancestorContext0, 6, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(61);
      Step step0 = new Step(256, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[3];
      Step step1 = new Step(11, nodeTypeTest0, (Expression[]) null);
      stepArray0[5] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
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
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(12);
      Step step0 = new Step(12, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      Step step1 = new Step(9, nodeTypeTest0, (Expression[]) null);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "node");
      QName qName0 = new QName("UNKNOWN()");
      Locale locale0 = Locale.CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locationPath0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        locationPath0.computeValue(rootContext0);
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
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate((Expression) null);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "@l7`6)cA5dnVl");
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationNegate0);
      EvalContext evalContext0 = expressionPath0.evalSteps(predicateContext0);
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAnd0, coreOperationAnd0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationAnd0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(7);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 7, nodeTypeTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QName qName0 = new QName("l=^lzyu>");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(variableReference0, variableReference0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("l=^lzyu>");
      Step step0 = new Step(61, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(5, processingInstructionTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) processingInstructionTest0);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(expressionArray0[1]);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMod0, coreOperationNegate0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(nameAttributeTest0);
      expressionPath0.buildContextChain(initialContext0, 2, false);
      assertEquals(0, initialContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, false, nodeTypeTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(ancestorContext0, 4, nodeTypeTest0);
      assertFalse(evalContext0.equals((Object)ancestorContext0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationOr0, expressionArray0[2]);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationMod0, (Expression) null);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationOr0, coreOperationGreaterThan0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationUnion0, expressionArray0[1]);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationNotEqual0);
      Step[] stepArray0 = new Step[3];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(928, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(3, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) step0);
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, (Object) null, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(rootContext0);
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
      Long long0 = Long.valueOf(2893L);
      Constant constant0 = new Constant(long0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[2];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
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
  public void test24()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("#5C)aTt:]#R", "p^$");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "p^$");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      ParentContext parentContext0 = new ParentContext(ancestorContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(parentContext0, 8, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = "\\u";
      QName qName0 = new QName(string0, string0);
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[1];
      Step step0 = new Step(1, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)expressionPath0.searchForPath(initialContext0);
      assertNotNull(beanPointer0);
      assertTrue(beanPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      ParentContext parentContext0 = new ParentContext(childContext0, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(parentContext0, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[2];
      UnionContext unionContext0 = new UnionContext(selfContext0, evalContextArray0);
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
  public void test27()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("l=^lzyu>");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(variableReference0, variableReference0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThanOrEqual0, coreOperationGreaterThanOrEqual0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) variableReference0;
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      QName qName0 = new QName("s-vC'9P)'w[Z6;.8E", "5/8$K<XCO");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      Expression[] expressionArray0 = new Expression[9];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, nameAttributeTest0);
      expressionArray0[1] = (Expression) coreOperationDivide0;
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      Object object0 = expressionPath0.computeValue(rootContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationOr0, coreOperationOr0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) variableReference0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[0];
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Long long0 = Long.valueOf(2893L);
      Constant constant0 = new Constant(long0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[2];
      Step step0 = new Step(2, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAnd0, coreOperationAnd0);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, coreOperationSubtract0);
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
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
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("");
      Expression[] expressionArray0 = new Expression[4];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(401);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.isSimpleExpressionPath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.NodeTypeTest");
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(460, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      expressionPath0.isSimpleExpressionPath();
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[2];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step((-644), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      expressionArray0[0] = (Expression) locationPath0;
      CoreFunction coreFunction0 = new CoreFunction((-60), expressionArray0);
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Operation", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Long long0 = Long.valueOf(2893L);
      Constant constant0 = new Constant(long0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(constant0, constant0);
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
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
}