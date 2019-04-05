/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:09:33 GMT 2019
 */

package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.ParentContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationNegate;
import org.apache.commons.jxpath.ri.compiler.CoreOperationUnion;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.LocationPath;
import org.apache.commons.jxpath.ri.compiler.NameAttributeTest;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Step[] stepArray0 = locationPath0.getSteps();
      assertNull(stepArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Constant constant0 = new Constant("i");
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[1];
      Step step1 = new Step(2601, nodeTypeTest0, (Expression[]) null);
      stepArray0[3] = step1;
      stepArray0[4] = step0;
      stepArray0[5] = stepArray0[1];
      stepArray0[6] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[0];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = expressionPath0.getPredicates();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-572));
      Step step0 = new Step((-1631), nodeTypeTest0, expressionArray1);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[7];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      Step step0 = new Step(11, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[1];
      stepArray0[3] = stepArray0[1];
      stepArray0[4] = step0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1345));
      stepArray0[5] = stepArray0[0];
      stepArray0[6] = stepArray0[5];
      stepArray0[7] = step0;
      stepArray0[8] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertNotNull(evalContext0);
      
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(evalContext0, basicNodeSet0);
      locationPath0.createContextForStep(nodeSetContext0, (-2203), nodeTypeTest0);
      assertEquals(0, nodeSetContext0.getDocumentOrder());
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
      EvalContext evalContext0 = locationPath0.createContextForStep((EvalContext) null, 1, processingInstructionTest0);
      assertFalse(evalContext0.isChildOrderingRequired());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[0];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-3524));
      Expression[] expressionArray0 = new Expression[7];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAnd0;
      Step step0 = new Step((-3524), nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.computeContextDependent();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("");
      Integer integer0 = new Integer(6);
      Constant constant0 = new Constant(integer0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, expressionArray0[2]);
      Step[] stepArray0 = new Step[9];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(2259, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = stepArray0[0];
      stepArray0[4] = step0;
      stepArray0[5] = stepArray0[3];
      stepArray0[6] = stepArray0[4];
      stepArray0[7] = stepArray0[4];
      stepArray0[8] = stepArray0[1];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeNameTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(attributeContext0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(evalContext0, 2, true);
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
  public void test08()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray0[0] = (Expression) coreOperationAdd0;
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationAnd0, coreOperationAnd0);
      Step[] stepArray0 = new Step[6];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
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
  public void test09()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[8];
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(95);
      Step step0 = new Step(13, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
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
  public void test10()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("c2hw+lH]7UM?");
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step1 = new Step(12, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      ParentContext parentContext0 = new ParentContext((EvalContext) null, nodeTypeTest0);
      AttributeContext attributeContext0 = new AttributeContext(parentContext0, nodeNameTest0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(attributeContext0, 7, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.jxpath.ri.compiler.Path", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAnd0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNegate0, expressionArray0, stepArray0);
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.ri.model.container.ContainerPointer");
      SelfContext selfContext0 = new SelfContext((EvalContext) null, processingInstructionTest0);
      expressionPath0.createContextForStep(selfContext0, 10, processingInstructionTest0);
      assertEquals(0, selfContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Constant constant0 = new Constant("i");
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      Step step1 = new Step(9, nodeTypeTest0, (Expression[]) null);
      stepArray0[2] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
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
  public void test13()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-792));
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(attributeContext0, 7, nodeTypeTest0);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("");
      Integer integer0 = new Integer(6);
      Constant constant0 = new Constant(integer0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(constant0, expressionArray0[2]);
      Step[] stepArray0 = new Step[9];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(2259, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = stepArray0[0];
      stepArray0[3] = step0;
      stepArray0[4] = stepArray0[0];
      stepArray0[5] = stepArray0[0];
      stepArray0[6] = stepArray0[1];
      stepArray0[7] = stepArray0[0];
      Step step1 = new Step(6, nodeNameTest0, expressionArray0);
      stepArray0[8] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThanOrEqual0, expressionArray0, stepArray0);
      SelfContext selfContext0 = new SelfContext((EvalContext) null, nodeNameTest0);
      AttributeContext attributeContext0 = new AttributeContext(selfContext0, nodeNameTest0);
      EvalContext evalContext0 = expressionPath0.evalSteps(attributeContext0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      Step[] stepArray0 = new Step[4];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1487));
      Step step0 = new Step(813, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = step0;
      Step step1 = new Step(5, nodeTypeTest0, expressionArray0);
      stepArray0[3] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, nodeTypeTest0);
      ParentContext parentContext0 = new ParentContext(descendantContext0, nodeTypeTest0);
      EvalContext evalContext0 = locationPath0.evalSteps(parentContext0);
      assertEquals(0, evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[7];
      ExpressionPath expressionPath0 = new ExpressionPath(expressionArray0[0], expressionArray0, stepArray0);
      Step step0 = new Step(11, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      stepArray0[2] = stepArray0[0];
      Step step1 = new Step(4, nodeNameTest0, expressionArray0);
      stepArray0[3] = step1;
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
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("1w,I I", "");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, (String) null);
      Step step0 = new Step((-1527), nodeNameTest0, (Expression[]) null);
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
  public void test18()  throws Throwable  {
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("The DocType already is attached to a document");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression");
      Step step0 = new Step(3, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, locationPath0);
      EvalContext evalContext0 = locationPath0.evalSteps(predicateContext0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(evalContext0, 3, true);
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
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-1288));
      Expression[] expressionArray0 = new Expression[5];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan");
      VariableReference variableReference0 = new VariableReference(qName0);
      Step step0 = new Step(8, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      stepArray0[2] = step0;
      stepArray0[3] = step0;
      stepArray0[4] = step0;
      stepArray0[5] = step0;
      Step step1 = new Step(2, nodeTypeTest0, (Expression[]) null);
      stepArray0[6] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, variableReference0, locale0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, nodePointer0, nodePointer0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      Object object0 = locationPath0.computeValue(evalContext0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(10, (Expression[]) null);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(coreFunction0, coreFunction0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationDivide0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, (Object) null, (Pointer) null);
      QName qName0 = new QName("I\"|ThKr{';W");
      VariablePointer variablePointer0 = new VariablePointer(qName0);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nodePointer0);
      EvalContext evalContext0 = rootContext0.getVariableContext(qName0);
      Pointer pointer0 = expressionPath0.searchForPath(evalContext0);
      assertNotSame(variablePointer0, pointer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray0, stepArray0);
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
  public void test22()  throws Throwable  {
      Constant constant0 = new Constant("7p6Daz8A,");
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      Expression[] expressionArray0 = new Expression[7];
      expressionArray0[0] = (Expression) nameAttributeTest0;
      expressionArray0[1] = (Expression) nameAttributeTest0;
      expressionArray0[2] = (Expression) nameAttributeTest0;
      expressionArray0[3] = (Expression) constant0;
      expressionArray0[4] = (Expression) constant0;
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("7p6Daz8A,");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Expression[] expressionArray0 = new Expression[2];
      expressionArray0[0] = (Expression) locationPath0;
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      boolean boolean0 = locationPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(false, (Step[]) null);
      Expression[] expressionArray0 = new Expression[5];
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(locationPath0, locationPath0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreFunction coreFunction0 = new CoreFunction(5, expressionArray0);
      Step[] stepArray0 = new Step[1];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      Step step0 = new Step(5, processingInstructionTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("Cannot remove ");
      Expression[] expressionArray0 = new Expression[6];
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(extensionFunction0);
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(200);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, locationPath0);
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationAdd0);
      CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(coreOperationNegate0, coreOperationNegate0);
      Step[] stepArray0 = new Step[8];
      QName qName0 = new QName("~UB:lS$U", "~UB:lS$U");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(1, nodeNameTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationLessThan0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Constant constant0 = new Constant("i");
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, (Expression[]) null);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, (Expression[]) null, stepArray0);
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
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locationPath0);
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
  public void test31()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      VariableReference variableReference0 = new VariableReference(qName0);
      Constant constant0 = new Constant((String) null);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(variableReference0, constant0);
      Expression[] expressionArray0 = new Expression[6];
      Step[] stepArray0 = new Step[1];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step((-1996), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationGreaterThan0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = new JXPathContextReferenceImpl((JXPathContext) null, variableReference0, (Pointer) null);
      EvalContext evalContext0 = jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        expressionPath0.computeValue(evalContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.axes.PredicateContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[8];
      String string0 = "8C\\ueOJ";
      QName qName0 = new QName(string0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(1803, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Expression[] expressionArray1 = new Expression[6];
      Expression[] expressionArray2 = new Expression[4];
      Float float0 = new Float((double) 1803);
      Constant constant0 = new Constant(float0);
      CoreFunction coreFunction0 = new CoreFunction(1803, expressionArray0);
      CoreOperationMod coreOperationMod0 = new CoreOperationMod(constant0, coreFunction0);
      expressionArray2[0] = (Expression) coreOperationMod0;
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      expressionArray2[1] = (Expression) coreOperationAdd0;
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationMod0, coreFunction0);
      expressionArray2[2] = (Expression) coreOperationLessThanOrEqual0;
      expressionArray2[3] = (Expression) constant0;
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray2);
      expressionArray1[0] = (Expression) coreOperationUnion0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, coreFunction0);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(nameAttributeTest0, coreOperationMod0);
      expressionArray1[1] = (Expression) coreOperationGreaterThan0;
      Step step1 = new Step(1803, nodeNameTest0, expressionArray1);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[0];
      ExpressionPath expressionPath0 = new ExpressionPath(locationPath0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.isContextDependent();
      assertFalse(boolean0);
  }
}