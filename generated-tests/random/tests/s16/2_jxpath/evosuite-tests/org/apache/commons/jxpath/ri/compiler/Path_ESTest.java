/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:57:44 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Constant constant0 = new Constant("");
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(5);
      Step step0 = new Step(1592, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Step[] stepArray0 = locationPath0.getSteps();
      assertNull(stepArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant constant0 = new Constant("R42S-");
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertSame(stepArray1, stepArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      QName qName0 = new QName("R42S-");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      Step step0 = new Step((-2674), nodeNameTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 1564, (NodeTest) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Constant constant0 = new Constant("");
      Step[] stepArray0 = new Step[7];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Expression[] expressionArray0 = new Expression[0];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[4];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step(2, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, processingInstructionTest0, true, false);
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, processingInstructionTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(namespaceContext0);
      AncestorContext ancestorContext0 = new AncestorContext(evalContext0, false, processingInstructionTest0);
      // Undeclared exception!
      try { 
        expressionPath0.searchForPath(ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain((EvalContext) null, 1559, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("1t1=09L_a&):", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "1t1=09L_a&):");
      Expression[] expressionArray1 = new Expression[0];
      Step step0 = new Step(5, nodeNameTest0, expressionArray1);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
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
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(13, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      AncestorContext ancestorContext0 = new AncestorContext(namespaceContext0, true, (NodeTest) null);
      EvalContext[] evalContextArray0 = new EvalContext[0];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(unionContext0);
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
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, true, nodeNameTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(descendantContext0, 12, nodeNameTest0);
      //  // Unstable assertion: assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step((-1465), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(10, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, true);
      NamespaceContext namespaceContext0 = new NamespaceContext(childContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(namespaceContext0);
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
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 9, processingInstructionTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      QName qName0 = new QName("format-number");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationUnion0, coreOperationUnion0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationGreaterThan0, extensionFunction0);
      Step[] stepArray0 = new Step[9];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      Step step0 = new Step((-747), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[2];
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = step0;
      stepArray0[6] = stepArray0[3];
      stepArray0[7] = step0;
      Step step1 = new Step(7, nodeTypeTest0, expressionArray0);
      stepArray0[8] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeTypeTest0);
      Locale locale0 = Locale.forLanguageTag("format-number");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, "format-number", locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getVariableContext(qName0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.evalSteps(initialContext0);
      assertTrue(predicateContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("g;rkXS1H-CIS3gBrG");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[3];
      Step step0 = new Step((-6073), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[2];
      stepArray0[4] = step0;
      Step step1 = new Step(6, nodeNameTest0, expressionArray0);
      stepArray0[5] = step1;
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
  public void test18()  throws Throwable  {
      QName qName0 = new QName("java.lang.String");
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[1];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "java.lang.String");
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, false, false);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(childContext0, nodeNameTest0, false);
      ParentContext parentContext0 = new ParentContext(precedingOrFollowingContext0, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(parentContext0, evalContextArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(unionContext0, 5, nodeNameTest0);
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
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(31);
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("YLfbir");
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[1];
      stepArray0[5] = stepArray0[0];
      stepArray0[6] = stepArray0[4];
      Step step1 = new Step(4, nodeTypeTest0, expressionArray0);
      stepArray0[7] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) stepArray0[1]);
      Locale locale0 = Locale.forLanguageTag("YLfbir");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[4], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NullPointer nullPointer1 = (NullPointer)locationPath0.getSingleNodePointerForSteps(rootContext0);
      assertNull(nullPointer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1));
      Step step0 = new Step((-1), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      Step step1 = new Step(3, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(nodeSetContext0);
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
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(11, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      QName qName0 = new QName("", "?lYNh!2Vrgrdq&MqM7");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step1 = new Step(8, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, locationPath0);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Step step0 = new Step(1564, (NodeTest) null, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(31);
      Expression[] expressionArray0 = new Expression[9];
      QName qName0 = new QName("YLfbir");
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[3];
      stepArray0[5] = stepArray0[2];
      stepArray0[6] = stepArray0[5];
      stepArray0[7] = stepArray0[4];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) stepArray0[3]);
      Locale locale0 = Locale.forLanguageTag("YLfbir");
      NullPointer nullPointer0 = (NullPointer)NodePointer.newNodePointer(qName0, expressionArray0[4], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      NullPointer nullPointer1 = (NullPointer)locationPath0.getSingleNodePointerForSteps(rootContext0);
      assertNull(nullPointer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[0];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      QName qName0 = new QName("--h^F'A^u-9-\"E", "--h^F'A^u-9-\"E");
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[4]);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(coreOperationOr0);
      BeanPointer beanPointer0 = (BeanPointer)expressionPath0.searchForPath(initialContext0);
      assertFalse(beanPointer0.isContainer());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("A");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "A");
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-1374), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      // Undeclared exception!
      try { 
        locationPath0.computeValue(rootContext0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      QName qName0 = new QName("R42S-");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 8, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(evalContext0, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(descendantContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Constant constant0 = new Constant("R42S-");
      Expression[] expressionArray0 = new Expression[8];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) constant0;
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      boolean boolean1 = expressionPath0.isSimplePath();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationAdd0, coreOperationAdd0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName(".^~7K.P/", ".^~7K.P/");
      Expression[] expressionArray0 = new Expression[1];
      VariableReference variableReference0 = new VariableReference(qName0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, variableReference0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(constant0, coreOperationAdd0);
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(5);
      Step step0 = new Step(5, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, (Expression[]) null, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[9];
      QName qName0 = new QName("0vEP", "0vEP");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1950);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nodeTypeTest0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("org.apache.commons.jxpath.ri.compiler.Path");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.ri.compiler.Path
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("UY{brq,,LW f");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "UY{brq,,LW f");
      Expression[] expressionArray0 = new Expression[3];
      Constant constant0 = new Constant("UY{brq,,LW f");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, constant0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Float float0 = new Float(1.0);
      Constant constant0 = new Constant(float0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThan0, constant0);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(11, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      Step step0 = new Step(1371, (NodeTest) null, expressionArray0);
      boolean boolean0 = step0.isContextDependent();
      assertFalse(boolean0);
  }
}