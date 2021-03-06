/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:10:29 GMT 2019
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
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Double double0 = Expression.NOT_A_NUMBER;
      Constant constant0 = new Constant(double0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(constant0, constant0);
      expressionArray0[0] = (Expression) coreOperationGreaterThan0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("A?n:-", "A?n:-");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationDivide0, (Expression) null);
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("wrV5z&NZ2");
      Step step0 = new Step((-1923), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = step0;
      Expression[] expressionArray1 = new Expression[0];
      stepArray0[6] = stepArray0[0];
      stepArray0[7] = step0;
      Step step1 = new Step((-1923), processingInstructionTest0, expressionArray1);
      stepArray0[8] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, processingInstructionTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(attributeContext0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationOr0);
      ParentContext parentContext0 = new ParentContext(predicateContext0, nodeNameTest0);
      DescendantContext descendantContext0 = new DescendantContext(parentContext0, false, nodeNameTest0);
      EvalContext[] evalContextArray0 = new EvalContext[5];
      UnionContext unionContext0 = new UnionContext(descendantContext0, evalContextArray0);
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
  public void test03()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path", "org.apache.commons.jxpath.ri.compiler.Path");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, expressionArray0[0]);
      CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(extensionFunction0, coreOperationMultiply0);
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-718));
      Step step0 = new Step(4, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationEqual0, expressionArray0, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertNotNull(evalContext0);
      
      ParentContext parentContext0 = new ParentContext(evalContext0, nodeTypeTest0);
      expressionPath0.createContextForStep(parentContext0, (-718), nodeTypeTest0);
      assertEquals(1, evalContext0.getDocumentOrder());
      assertTrue(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(0);
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(13, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(0, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = stepArray0[2];
      stepArray0[5] = step1;
      stepArray0[6] = stepArray0[1];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, processingInstructionTest0);
      AncestorContext ancestorContext0 = new AncestorContext(parentContext0, true, processingInstructionTest0);
      NamespaceContext namespaceContext0 = new NamespaceContext(ancestorContext0, processingInstructionTest0);
      AttributeContext attributeContext0 = new AttributeContext(namespaceContext0, processingInstructionTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(attributeContext0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(evalContext0, 469, true);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Expression[] expressionArray0 = new Expression[4];
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract((Expression) null, (Expression) null);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      Step step0 = new Step(12, processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "!vPS Jb02?i=");
      QName qName0 = new QName("", "g$89X]';");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      PredicateContext predicateContext0 = (PredicateContext)expressionPath0.evalSteps(rootContext0);
      AncestorContext ancestorContext0 = new AncestorContext(predicateContext0, true, processingInstructionTest0);
      // Undeclared exception!
      try { 
        locationPath0.searchForPath(ancestorContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationOr0;
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.isSimplePath();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      Expression[] expressionArray0 = new Expression[1];
      Step step0 = new Step(10, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      stepArray0[3] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(ancestorContext0, 890, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[6];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAnd0, expressionArray0[0]);
      Step[] stepArray0 = new Step[9];
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(expressionArray0[0], expressionArray0[3]);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationLessThan0, coreOperationMod0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThanOrEqual0, expressionArray0, stepArray0);
      // Undeclared exception!
      try { 
        expressionPath0.areBasicPredicates(expressionArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("Qi~m[\"gK~kNs61");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step(0, nodeNameTest0, (Expression[]) null);
      stepArray0[2] = step1;
      stepArray0[3] = step1;
      stepArray0[4] = step0;
      stepArray0[5] = stepArray0[2];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      Integer integer0 = new Integer(1);
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, expressionArray0[1]);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      expressionPath0.isSimplePath();
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
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, (Step[]) null);
      // Undeclared exception!
      try { 
        expressionPath0.computeContextDependent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.ExpressionPath", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 11, nodeNameTest0);
      //  // Unstable assertion: assertEquals(1, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      Expression[] expressionArray0 = new Expression[1];
      Step step1 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeTypeTest0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(rootContext0);
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
      Expression[] expressionArray0 = new Expression[8];
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreOperationDivide0, (Expression) null);
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("wrV5z&NZ2");
      Step step0 = new Step((-1923), processingInstructionTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      Step step1 = new Step(8, processingInstructionTest0, expressionArray0);
      stepArray0[2] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMod0, expressionArray0, stepArray0);
      AncestorContext ancestorContext0 = new AncestorContext((EvalContext) null, true, processingInstructionTest0);
      EvalContext[] evalContextArray0 = new EvalContext[7];
      UnionContext unionContext0 = new UnionContext(ancestorContext0, evalContextArray0);
      AttributeContext attributeContext0 = new AttributeContext(unionContext0, processingInstructionTest0);
      // Undeclared exception!
      try { 
        expressionPath0.evalSteps(attributeContext0);
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
      Constant constant0 = new Constant("");
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[8];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(303);
      Step step0 = new Step(38, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      Step step1 = new Step(7, nodeTypeTest0, expressionArray0);
      stepArray0[2] = step1;
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
      QName qName0 = new QName((String) null, "E`A`qGy#");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 6, nodeNameTest0);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("/QIwv1n[x");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "O=})xVi*");
      Step step0 = new Step((-2418), nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[1];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(39);
      Step step1 = new Step(3, nodeTypeTest0, (Expression[]) null);
      stepArray0[4] = step1;
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
  public void test19()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      QName qName0 = new QName("Qi~m[\"gK~kNs61");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      Step step1 = new Step(2, nodeNameTest0, (Expression[]) null);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      Integer integer0 = new Integer(1);
      Locale locale0 = Locale.CANADA_FRENCH;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, integer0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, expressionPath0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      PredicateContext predicateContext0 = new PredicateContext(rootContext0, expressionArray0[1]);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(predicateContext0);
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
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("O=})xVi*", "/QIwv1n[x");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "O=})xVi*");
      Step step0 = new Step((-2418), nodeNameTest0, (Expression[]) null);
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
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) locationPath0);
      QName qName0 = new QName("", "");
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
      InitialContext initialContext0 = (InitialContext)rootContext0.getConstantContext(qName0);
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.searchForPath(initialContext0);
      assertTrue(beanPointer0.isNode());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      Constant constant0 = new Constant("");
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, expressionArray0[1]);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("Y2q");
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, processingInstructionTest0);
      ChildContext childContext0 = new ChildContext(attributeContext0, processingInstructionTest0, true, true);
      Expression[] expressionArray1 = new Expression[8];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray1);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationLessThan0, coreOperationUnion0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, expressionArray1[7]);
      PredicateContext predicateContext0 = new PredicateContext(childContext0, coreOperationSubtract0);
      // Undeclared exception!
      try { 
        expressionPath0.getSingleNodePointerForSteps(predicateContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.EvalContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[8];
      expressionArray0[0] = (Expression) locationPath0;
      expressionArray0[1] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      Expression[] expressionArray0 = new Expression[2];
      Float float0 = new Float((-1143.83225347713));
      Constant constant0 = new Constant(float0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(constant0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(coreOperationNegate0, extensionFunction0);
      expressionArray0[1] = (Expression) coreOperationGreaterThanOrEqual0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("", "");
      VariableReference variableReference0 = new VariableReference(qName0);
      expressionArray0[0] = (Expression) variableReference0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(expressionArray0[0], variableReference0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, (Step[]) null);
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
  public void test26()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(extensionFunction0, extensionFunction0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(extensionFunction0, coreOperationLessThan0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      Step[] stepArray0 = new Step[3];
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locationPath0);
      // Undeclared exception!
      try { 
        jXPathContext0.getValue("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No value for xpath: org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[8];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.compiler.Path");
      Step step0 = new Step(5, processingInstructionTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nodeNameTest0);
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeTypeTest0, (Locale) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(rootContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.InitialContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[5];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationNegate0;
      Step step0 = new Step((-449), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(1, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = stepArray0[2];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, (Expression[]) null, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[4];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      String string0 = expressionPath0.toString();
      assertEquals("()[null][null][null][null]", string0);
  }
}
