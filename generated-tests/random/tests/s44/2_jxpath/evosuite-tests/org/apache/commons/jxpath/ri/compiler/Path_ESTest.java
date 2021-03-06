/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:10:54 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
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
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Ca70O~)K[m/h");
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(300, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(coreOperationAdd0, coreOperationAdd0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, (Expression[]) null, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("F");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(10, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      Step step1 = new Step(1253, nodeNameTest0, expressionArray0);
      stepArray0[4] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, expressionPath0);
      EvalContext evalContext0 = expressionPath0.evalSteps(predicateContext0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[1];
      stepArray0[4] = stepArray0[0];
      Step step1 = new Step((-1), nodeNameTest0, expressionArray0);
      stepArray0[5] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(nodeSetContext0, coreOperationOr0);
      ParentContext parentContext0 = new ParentContext(predicateContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(parentContext0, nodeNameTest0, false);
      expressionPath0.evalSteps(precedingOrFollowingContext0);
      //  // Unstable assertion: assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(800);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 800, nodeTypeTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAdd0, coreOperationUnion0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationAdd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationLessThanOrEqual0, expressionArray0[0]);
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("yI/DILR'_");
      Step step0 = new Step(13, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(nodeSetContext0, coreOperationOr0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(predicateContext0, 1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.NodeSetContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      Expression[] expressionArray0 = new Expression[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Float float0 = new Float(0.0F);
      Constant constant0 = new Constant(float0);
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("", "org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.createContextForStep((EvalContext) null, 5, nodeNameTest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[2];
      Step step0 = new Step(1629, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step(12, nodeNameTest0, expressionArray0);
      stepArray0[2] = step1;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(parentContext0, 26, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      Expression[] expressionArray0 = new Expression[2];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(extensionFunction0, expressionArray0[1]);
      Step[] stepArray0 = new Step[8];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "S3a<Z{Fe");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 11, nodeNameTest0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-4474));
      Expression[] expressionArray0 = new Expression[4];
      Step step0 = new Step(9, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAnd0, coreOperationAnd0);
      Step[] stepArray0 = new Step[8];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, (NodeTest) null);
      NamespaceContext namespaceContext0 = new NamespaceContext(parentContext0, (NodeTest) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(namespaceContext0, basicNodeSet0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(nodeSetContext0, 8, (NodeTest) null);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreOperationOr0, coreOperationAdd0);
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1898);
      Step step0 = new Step(1898, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      QName qName0 = new QName(").\u0001~G#XalR$'");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step((short)7, nodeNameTest0, expressionArray0);
      stepArray0[2] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) ").\u0001~G#XalR$'");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      NamespaceContext namespaceContext0 = new NamespaceContext(rootContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(namespaceContext0);
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
      Step[] stepArray0 = new Step[9];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(575);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      QName qName0 = new QName("8C1\"&A_~g]7Ef5EnY", (String) null);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeTypeTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      NamespaceContext namespaceContext0 = (NamespaceContext)locationPath0.createContextForStep(rootContext0, 6, nodeNameTest0);
      assertEquals(0, namespaceContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(4);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 4, nodeTypeTest0);
      EvalContext evalContext1 = locationPath0.createContextForStep(evalContext0, 4, nodeTypeTest0);
      assertTrue(evalContext1.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName((String) null, (String) null);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      Step step1 = new Step(3, nodeNameTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      ChildContext childContext0 = new ChildContext(selfContext0, nodeTypeTest0, true, true);
      EvalContext evalContext0 = locationPath0.evalSteps(childContext0);
      assertEquals(0, childContext0.getPosition());
      assertNotNull(evalContext0);
      assertEquals(0, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, (NodeSet) null);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      PredicateContext predicateContext0 = new PredicateContext(nodeSetContext0, coreOperationOr0);
      ParentContext parentContext0 = new ParentContext(predicateContext0, nodeNameTest0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(parentContext0, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(precedingOrFollowingContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationAdd0, coreOperationUnion0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreOperationAdd0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationLessThanOrEqual0, expressionArray0[0]);
      Step[] stepArray0 = new Step[7];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("yI/DILR'_");
      Step step0 = new Step(13, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      QName qName0 = new QName("", "yI/DILR'_");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step1 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, step0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(800);
      Step step0 = new Step(1322, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain((EvalContext) null, 100, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      Expression[] expressionArray0 = new Expression[1];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "");
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)expressionPath0.searchForPath(initialContext0);
      assertEquals(Integer.MIN_VALUE, beanPointer0.getIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps((EvalContext) null);
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
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[8];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(nameAttributeTest0, coreOperationAdd0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationMultiply0);
      Step[] stepArray0 = new Step[4];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant constant0 = new Constant("\"div\"");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Expression[] expressionArray0 = new Expression[5];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[2];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.areBasicPredicates(expressionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "gKaszR}!{$:\"~m>04=-");
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      Step step0 = new Step(2, (NodeTest) null, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
      ParentContext parentContext0 = new ParentContext(unionContext0, (NodeTest) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("2fqxnzab");
      SelfContext selfContext0 = new SelfContext(parentContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(selfContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("preceding");
      Expression[] expressionArray0 = new Expression[9];
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
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
  public void test32()  throws Throwable  {
      QName qName0 = new QName("4Y\"?p g?qfx4/=", "4Y\"?p g?qfx4/=");
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1184);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locationPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[5];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, expressionArray0, stepArray0);
      expressionPath0.isSimplePath();
      boolean boolean0 = expressionPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Expression[] expressionArray0 = new Expression[2];
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationEqual0, coreOperationEqual0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(nameAttributeTest0, constant0);
      expressionArray0[0] = (Expression) coreOperationDivide0;
      Step step0 = new Step(1767, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      QName qName0 = new QName("\"processing-instruction\"", "\"processing-instruction\"");
      VariableReference variableReference0 = new VariableReference(qName0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[4];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "\"processing-instruction\"");
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(variableReference0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertFalse(boolean0);
  }
}
