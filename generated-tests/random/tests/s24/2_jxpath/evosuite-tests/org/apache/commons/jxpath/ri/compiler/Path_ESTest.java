/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:41:18 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
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
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
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
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Step[] stepArray1 = locationPath0.getSteps();
      assertEquals(0, stepArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step(4, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      Step step1 = new Step(3218, processingInstructionTest0, (Expression[]) null);
      stepArray0[2] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1805, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = step0;
      stepArray0[6] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, true);
      expressionPath0.evalSteps(childContext0);
      assertEquals(0, childContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[6];
      UnionContext unionContext0 = new UnionContext(attributeContext0, evalContextArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(unionContext0, 75, processingInstructionTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath((EvalContext) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QName qName0 = new QName("\"}MzT'wv", "h^%O");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[8];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[5], expressionArray0, (Step[]) null);
      Step step0 = new Step(0, nodeNameTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("2SYJN:f-,");
      Step step0 = new Step(3691, processingInstructionTest0, expressionArray0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName((String) null, "comment");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(parentContext0);
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
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(11, expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      ChildContext childContext0 = new ChildContext(nodeSetContext0, processingInstructionTest0, false, false);
      AttributeContext attributeContext0 = new AttributeContext(childContext0, processingInstructionTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(attributeContext0, processingInstructionTest0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(namespaceContext0, 11, processingInstructionTest0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("No indexed read method for property ", "No indexed read method for property ");
      VariableReference variableReference0 = new VariableReference(qName0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, variableReference0);
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates((Expression[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("Collection element does not exist: ", "Diswm");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.createContextForStep((EvalContext) null, 0, nodeNameTest0);
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
      Step[] stepArray0 = new Step[3];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Step[] stepArray1 = locationPath0.getSteps();
      assertSame(stepArray0, stepArray1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, (Expression[]) null);
      Step[] stepArray0 = new Step[5];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(735, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step(13, processingInstructionTest0, (Expression[]) null);
      stepArray0[2] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, (Expression[]) null, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, processingInstructionTest0, true);
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
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAnd0);
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step((-1), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      Step step1 = new Step(12, processingInstructionTest0, expressionArray0);
      stepArray0[3] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      ParentContext parentContext0 = new ParentContext(namespaceContext0, processingInstructionTest0);
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
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(256, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-444));
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[2];
      Step step1 = new Step(11, nodeTypeTest0, expressionArray0);
      stepArray0[5] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Integer integer0 = new Integer(1048576);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locationPath0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(rootContext0, 2846, true);
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
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(11);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step((-595), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      Step step1 = new Step(10, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain((EvalContext) null, 4096, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step(9, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
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
  public void test17()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName("-}'M!`T\"EO{");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "-}'M!`T\"EO{");
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeNameTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(parentContext0, 8, nodeNameTest0);
      assertNotNull(evalContext0);
      assertEquals(1, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Constant constant0 = new Constant((Number) null);
      Expression[] expressionArray0 = new Expression[7];
      Step[] stepArray0 = new Step[7];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1805, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(7, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeNameTest0, true, true);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(childContext0);
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
      Step[] stepArray0 = new Step[9];
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(256, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[2];
      Step step1 = new Step(6, (NodeTest) null, expressionArray0);
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Integer integer0 = new Integer(1048576);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) integer0);
      QName qName0 = new QName("");
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, locationPath0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(rootContext0, 2846, true);
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
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant((Number) null);
      Step step0 = new Step(43, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[2] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, stepArray0[0], locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(rootContext0);
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
      Step[] stepArray0 = new Step[5];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(" ");
      Expression[] expressionArray0 = new Expression[4];
      CoreFunction coreFunction0 = new CoreFunction(3, expressionArray0);
      Step step0 = new Step(3, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      QName qName0 = new QName(" ", "D\"[1n|lcygz#o3");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, processingInstructionTest0);
      PredicateContext predicateContext0 = new PredicateContext(attributeContext0, coreFunction0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(predicateContext0, nodeNameTest0, false);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(precedingOrFollowingContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[7];
      Constant constant0 = new Constant((Number) null);
      Step step0 = new Step(43, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      Step step1 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[4] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) constant0);
      Locale locale0 = Locale.ENGLISH;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, step0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(rootContext0);
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
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("'[~V}`t^kW{pq0l ", "'[~V}`t^kW{pq0l ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[3], expressionArray0, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, (NodeTest) null);
      DescendantContext descendantContext0 = new DescendantContext(namespaceContext0, true, (NodeTest) null);
      PredicateContext predicateContext0 = new PredicateContext(descendantContext0, extensionFunction0);
      EvalContext evalContext0 = expressionPath0.createContextForStep(predicateContext0, 1, (NodeTest) null);
      //  // Unstable assertion: assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "AYQ+D]E#dXiRm");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.searchForPath(initialContext0);
      assertTrue(beanPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("\"\n\"");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, expressionArray0[0]);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(variableReference0);
      expressionArray0[2] = (Expression) coreOperationNegate0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      expressionArray0[0] = (Expression) locationPath0;
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(109);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeTypeTest0);
      QName qName0 = new QName("V?y*>3jtYyO-");
      Object object0 = new Object();
      Locale locale0 = new Locale("", "V?y*>3jtYyO-");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, object0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      Expression[] expressionArray0 = new Expression[6];
      CoreFunction coreFunction0 = new CoreFunction((-3063), expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationMultiply0, coreFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("\"\n\"");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(variableReference0, expressionArray0[0]);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
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
  public void test29()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      VariableReference variableReference0 = new VariableReference((QName) null);
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAdd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(2, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps((EvalContext) null);
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
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[7];
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.isSimplePath();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      VariableReference variableReference0 = new VariableReference((QName) null);
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(variableReference0, coreOperationAnd0);
      Step[] stepArray0 = new Step[4];
      NodeNameTest nodeNameTest0 = new NodeNameTest((QName) null);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Constant constant0 = new Constant("org.apache.commons.jxpath.ri.parser.TokenMgrError");
      Expression[] expressionArray0 = new Expression[2];
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1853));
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest((String) null);
      Step step0 = new Step(4, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("LpS*E}xhcjz^SH", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.isSimplePath();
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
      locationPath0.isSimplePath();
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Step[] stepArray0 = new Step[5];
      QName qName0 = new QName("DV)wWmYU3+vXBpcrqO");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[7];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      expressionArray0[0] = (Expression) extensionFunction0;
      Step step0 = new Step(5, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      VariableReference variableReference0 = new VariableReference((QName) null);
      expressionArray0[0] = (Expression) variableReference0;
      Step[] stepArray0 = new Step[6];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("2SYJN:f-,");
      Step step0 = new Step(3691, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = stepArray0[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      QName qName0 = new QName("\"}MzT'wv", "h^%O");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[8];
      expressionArray0[0] = (Expression) locationPath0;
      Step step0 = new Step(583, nodeNameTest0, expressionArray0);
      // Undeclared exception!
      try { 
        step0.isContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Step", e);
      }
  }
}
