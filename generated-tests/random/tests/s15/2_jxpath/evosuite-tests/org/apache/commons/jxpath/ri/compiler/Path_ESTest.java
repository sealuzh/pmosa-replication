/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 23:55:41 GMT 2019
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
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.ChildContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NamespaceContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAnd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationDivide;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
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
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Path_ESTest extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("h^t7#UdB");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      Constant constant0 = new Constant("/@h^t7#UdB/@h^t7#UdB");
      Expression[] expressionArray0 = new Expression[4];
      ExpressionPath expressionPath0 = new ExpressionPath(constant0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[3];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      Step[] stepArray1 = expressionPath0.getSteps();
      assertEquals(0, stepArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("");
      Step step0 = new Step(26, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      Expression[] expressionArray1 = new Expression[0];
      Step step1 = new Step(26, nodeNameTest0, expressionArray1);
      stepArray0[2] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      AncestorContext ancestorContext0 = new AncestorContext(precedingOrFollowingContext0, false, (NodeTest) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, (NodeTest) null);
      EvalContext evalContext0 = locationPath0.evalSteps(attributeContext0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("h^t7#UdB");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      EvalContext evalContext0 = locationPath0.evalSteps((EvalContext) null);
      assertEquals(0, evalContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      Expression[] expressionArray1 = new Expression[9];
      Step step0 = new Step(0, (NodeTest) null, expressionArray1);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, locationPath0);
      Expression[] expressionArray0 = new Expression[3];
      QName qName0 = new QName("", "");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationMultiply0, expressionArray0, stepArray0);
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step((-1214), nodeNameTest0, expressionArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAdd0, coreOperationAdd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = expressionPath0.createContextForStep((EvalContext) null, 241, processingInstructionTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("h^t7#UdB");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      NamespaceContext namespaceContext0 = new NamespaceContext((EvalContext) null, nodeNameTest0);
      SelfContext selfContext0 = new SelfContext(namespaceContext0, nodeNameTest0);
      EvalContext evalContext0 = locationPath0.createContextForStep(selfContext0, (-405), nodeNameTest0);
      assertNull(evalContext0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(locationPath0, locationPath0);
      QName qName0 = new QName("", "");
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((JXPathContext) null, (Object) coreOperationMultiply0);
      BasicVariables basicVariables0 = new BasicVariables();
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
      RootContext rootContext1 = (RootContext)locationPath0.buildContextChain(rootContext0, (-3884), false);
      assertSame(rootContext0, rootContext1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[2];
      Step step0 = new Step(13, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, (NodeTest) null);
      ChildContext childContext0 = new ChildContext(attributeContext0, (NodeTest) null, true, false);
      DescendantContext descendantContext0 = new DescendantContext(childContext0, false, (NodeTest) null);
      EvalContext evalContext0 = locationPath0.evalSteps(descendantContext0);
      // Undeclared exception!
      try { 
        locationPath0.buildContextChain(evalContext0, 3237, false);
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
  public void test12()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[0];
      CoreOperationUnion coreOperationUnion0 = new CoreOperationUnion(expressionArray0);
      Expression[] expressionArray1 = new Expression[9];
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Step step0 = new Step(12, nodeNameTest0, expressionArray1);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationUnion0, expressionArray1, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      NullPointer nullPointer0 = (NullPointer)NodePointer.newChildNodePointer((NodePointer) null, qName0, (Object) null);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, nullPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.compute(rootContext0);
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
      Expression[] expressionArray0 = new Expression[2];
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd(expressionArray0);
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      Step step0 = new Step(226, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(11, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) "E^oi-3~uS~QXOZ");
      Locale locale0 = Locale.PRC;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(rootContext0, 11, false);
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
      Step[] stepArray0 = new Step[8];
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step(891, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      Step step1 = new Step(10, (NodeTest) null, expressionArray0);
      stepArray0[2] = step1;
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) processingInstructionTest0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
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
  public void test16()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, (Expression) null);
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName("org.apache.commons.jxpath.ri.compiler.Path", " l?ns'p\"");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(9, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(nameAttributeTest0, expressionArray0, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) expressionArray0[0]);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(421);
      NamespaceContext namespaceContext0 = new NamespaceContext(initialContext0, nodeTypeTest0);
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
  public void test17()  throws Throwable  {
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest((Expression) null, (Expression) null);
      Expression[] expressionArray0 = new Expression[9];
      Step[] stepArray0 = new Step[3];
      Step step0 = new Step(13, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(8, (NodeTest) null, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) nameAttributeTest0);
      QName qName0 = new QName("", "%l2:G9V'KZp");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodeNameTest0, locale0);
      RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
      InitialContext initialContext0 = (InitialContext)rootContext0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.iterate(initialContext0);
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
      Expression[] expressionArray0 = new Expression[5];
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(expressionArray0[0], expressionArray0[0]);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationAdd0, coreOperationNotEqual0);
      Step[] stepArray0 = new Step[5];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(61);
      Step step0 = new Step(61, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(6, nodeTypeTest0, expressionArray0);
      stepArray0[1] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      ChildContext childContext0 = new ChildContext((EvalContext) null, nodeTypeTest0, true, true);
      // Undeclared exception!
      try { 
        expressionPath0.buildContextChain(childContext0, 6, false);
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
      QName qName0 = new QName("");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "");
      Expression[] expressionArray0 = new Expression[5];
      Step step0 = new Step((-966), nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(4, nodeNameTest0, expressionArray0);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) step1);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      // Undeclared exception!
      try { 
        locationPath0.getSingleNodePointerForSteps(initialContext0);
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
      CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd((Expression[]) null);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationAdd0, coreOperationAdd0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationLessThanOrEqual0, coreOperationLessThanOrEqual0);
      Step[] stepArray0 = new Step[3];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("<<unknown namespace>>");
      Step step0 = new Step(2127, processingInstructionTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      Step step1 = new Step(3, processingInstructionTest0, (Expression[]) null);
      stepArray0[2] = step1;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationNotEqual0, (Expression[]) null, stepArray0);
      EvalContext evalContext0 = expressionPath0.evalSteps((EvalContext) null);
      assertEquals((-1), evalContext0.getDocumentOrder());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("org.apache.commons.jxpath.FunctionLibrary");
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
      locationPath0.createContextForStep(nodeSetContext0, 2, processingInstructionTest0);
      //  // Unstable assertion: assertEquals(1, nodeSetContext0.getPosition());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Step[] stepArray0 = new Step[3];
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("");
      Step step0 = new Step(26, (NodeTest) null, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(1, (NodeTest) null, expressionArray0);
      stepArray0[1] = step1;
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "org.apache.commons.jxpath.ri.compiler.Path");
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext((EvalContext) null, nodeNameTest0, false);
      AncestorContext ancestorContext0 = new AncestorContext(precedingOrFollowingContext0, false, (NodeTest) null);
      BasicNodeSet basicNodeSet0 = new BasicNodeSet();
      NodeSetContext nodeSetContext0 = new NodeSetContext(ancestorContext0, basicNodeSet0);
      AttributeContext attributeContext0 = new AttributeContext(nodeSetContext0, (NodeTest) null);
      // Undeclared exception!
      try { 
        locationPath0.evalSteps(attributeContext0);
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
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      Step[] stepArray0 = new Step[4];
      QName qName0 = new QName((String) null, "Xi|");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Expression[] expressionArray0 = new Expression[8];
      Step step0 = new Step(7, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      Step step1 = new Step(7, nodeNameTest0, (Expression[]) null);
      stepArray0[1] = step1;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.computeValue(initialContext0);
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) fileSystemHandling0);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      BeanPointer beanPointer0 = (BeanPointer)locationPath0.searchForPath(initialContext0);
      assertFalse(beanPointer0.isDynamicPropertyDeclarationSupported());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CoreOperationAnd coreOperationAnd0 = new CoreOperationAnd((Expression[]) null);
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationAnd0, (Expression[]) null, stepArray0);
      JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl)JXPathContext.newContext((Object) null);
      InitialContext initialContext0 = (InitialContext)jXPathContextReferenceImpl0.getAbsoluteRootContext();
      NullPointer nullPointer0 = (NullPointer)expressionPath0.getSingleNodePointerForSteps(initialContext0);
      assertTrue(nullPointer0.isRoot());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide((Expression) null, (Expression) null);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationDivide0, (Expression) null);
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nameAttributeTest0);
      // Undeclared exception!
      try { 
        jXPathContext0.removePath("org.apache.commons.jxpath.ri.compiler.Path");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Exception trying to remove xpath org.apache.commons.jxpath.ri.compiler.Path; No pointer for xpath: org.apache.commons.jxpath.ri.compiler.Path
         //
         verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("RlIH!_Sf7E.Pn1{ ti~", "\" could not be added as the root of the document: ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(extensionFunction0, extensionFunction0);
      CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(extensionFunction0, coreOperationLessThanOrEqual0);
      CoreOperationNotEqual coreOperationNotEqual0 = new CoreOperationNotEqual(coreOperationMultiply0, extensionFunction0);
      expressionArray0[0] = (Expression) coreOperationNotEqual0;
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(1);
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(extensionFunction0, expressionArray0[0]);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, coreOperationDivide0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(extensionFunction0, coreOperationGreaterThan0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationGreaterThan0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, coreOperationGreaterThanOrEqual0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Step[] stepArray0 = new Step[9];
      Expression[] expressionArray0 = new Expression[8];
      Long long0 = Long.valueOf((-2506L));
      Constant constant0 = new Constant(long0);
      expressionArray0[0] = (Expression) constant0;
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(constant0, constant0);
      expressionArray0[1] = (Expression) nameAttributeTest0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      // Undeclared exception!
      try { 
        locationPath0.areBasicPredicates(expressionArray0);
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
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      QName qName0 = new QName("V1sHo!qZI", "V1sHo!qZI");
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationOr0, expressionArray0[4]);
      Step[] stepArray0 = new Step[2];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Step[] stepArray0 = new Step[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Expression[] expressionArray0 = new Expression[1];
      expressionArray0[0] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CoreFunction coreFunction0 = new CoreFunction(0, (Expression[]) null);
      Expression[] expressionArray0 = new Expression[0];
      Step[] stepArray0 = new Step[0];
      ExpressionPath expressionPath0 = new ExpressionPath(coreFunction0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.areBasicPredicates(expressionArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Step[] stepArray0 = new Step[6];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest(2);
      Expression[] expressionArray0 = new Expression[0];
      Step step0 = new Step(2, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[4];
      Step[] stepArray0 = new Step[5];
      ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest("normalize-space");
      Step step0 = new Step(1, processingInstructionTest0, expressionArray0);
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleStep(step0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[7];
      QName qName0 = new QName("RlIH!_Sf7E.Pn1{ ti~", "\" could not be added as the root of the document: ");
      ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
      Step[] stepArray0 = new Step[7];
      NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-2362));
      Step step0 = new Step(1, nodeTypeTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(false, stepArray0);
      CoreOperationDivide coreOperationDivide0 = new CoreOperationDivide(extensionFunction0, expressionArray0[0]);
      CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(locationPath0, coreOperationDivide0);
      CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual0 = new CoreOperationGreaterThanOrEqual(extensionFunction0, coreOperationGreaterThan0);
      CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
      CoreOperationNegate coreOperationNegate0 = new CoreOperationNegate(coreOperationOr0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreOperationNegate0, coreOperationGreaterThan0);
      CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(nameAttributeTest0, coreOperationGreaterThanOrEqual0);
      ExpressionPath expressionPath0 = new ExpressionPath(coreOperationSubtract0, expressionArray0, stepArray0);
      boolean boolean0 = expressionPath0.isSimpleExpressionPath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("h^t7#UdB");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.isSimplePath();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[1];
      Step[] stepArray0 = new Step[1];
      QName qName0 = new QName("/X-E2a'Q.mhb", "/X-E2a'Q.mhb");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(26, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      ExpressionPath expressionPath0 = new ExpressionPath((Expression) null, expressionArray0, stepArray0);
      expressionPath0.isSimplePath();
      boolean boolean0 = expressionPath0.isSimplePath();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Expression[] expressionArray0 = new Expression[5];
      CoreFunction coreFunction0 = new CoreFunction(2, expressionArray0);
      NameAttributeTest nameAttributeTest0 = new NameAttributeTest(coreFunction0, coreFunction0);
      expressionArray0[0] = (Expression) nameAttributeTest0;
      QName qName0 = new QName("V1sHo!qZI", "V1sHo!qZI");
      Step[] stepArray0 = new Step[2];
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(2, nodeNameTest0, expressionArray0);
      stepArray0[0] = step0;
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Step[] stepArray0 = new Step[2];
      QName qName0 = new QName("h^t7#UdB");
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      Step step0 = new Step(5, nodeNameTest0, (Expression[]) null);
      stepArray0[0] = step0;
      stepArray0[1] = stepArray0[0];
      LocationPath locationPath0 = new LocationPath(true, stepArray0);
      Constant constant0 = new Constant("/@h^t7#UdB/@h^t7#UdB");
      Expression[] expressionArray0 = new Expression[4];
      expressionArray0[0] = (Expression) constant0;
      expressionArray0[1] = (Expression) locationPath0;
      boolean boolean0 = locationPath0.areBasicPredicates(expressionArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocationPath locationPath0 = new LocationPath(true, (Step[]) null);
      boolean boolean0 = locationPath0.computeContextDependent();
      assertFalse(boolean0);
  }
}
