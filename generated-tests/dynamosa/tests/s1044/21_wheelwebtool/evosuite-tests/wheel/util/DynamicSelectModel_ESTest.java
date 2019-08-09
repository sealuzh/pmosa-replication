/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 00:15:59 GMT 2019
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.Asset;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.Label;
import wheel.components.StandaloneComponent;
import wheel.components.TextArea;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      String string0 = dynamicSelectModel1.getValue(0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[] from ");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      int int0 = dynamicSelectModel0.getOptionCount();
      //  // Unstable assertion: assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel1.getLabel(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.setComponent(errorPage0);
      ErrorPage errorPage1 = (ErrorPage)dynamicSelectModel0.getComponent();
      assertEquals("div", errorPage1.defaultTagName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value((String) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator((String) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setComponent((Component) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label((String) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty((Object) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("w[eel.Asset$AssetType");
      // Undeclared exception!
      dynamicSelectModel1.translateValue("w[eel.Asset$AssetType");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("|YD[y#^+oY");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("|YD[y#^+oY");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("[>R#Bd9`(>V]mp1d4Wc");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("63");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unbalanced braces inside inline collection
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?cwZ~jv)^-iTB_Y");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("?cwZ~jv)^-iTB_Y");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-2160));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression Could not create DynamicSelection model. Value attribute was null or not an el-expression..values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("java.lang.Integ]r@0000000037");
      // Undeclared exception!
      dynamicSelectModel1.getValue((-1242639180));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("-Ee]");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[>R#Bd9`(>V]mp1d4Wc");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(2912);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unbalanced braces inside inline collection
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-939));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("?cwZ~jv)^-iTB_Y");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(1799);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-1433));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1433
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("3]P91~SV");
      // Undeclared exception!
      dynamicSelectModel1.getOptionCount();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("-Ee]");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[>R#Bd9`(>V]mp1d4Wc");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unbalanced braces inside inline collection
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("2*~jtLCsJhkaUCPe");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("?yG/1H:s7FCl\f");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("2N$h]U;IMw+ 8");
      // Undeclared exception!
      dynamicSelectModel0.getObjects();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("811T^*Vkg13]YMLj!!");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[>R#Bd9`(>V]mp1d4Wc");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unbalanced braces inside inline collection
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration(";%+jg}fhDZY-b`GgdUn");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.mvel.math.IEEEFloatingPointMath", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(" to translate value ' ");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel((-2016696636));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  to translate value ' .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("w[eel.Asset$AssetType");
      // Undeclared exception!
      dynamicSelectModel1.getLabel((-1697));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("811T^*Vkg13]YMLj!!");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-2160));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel1.empty("INVOKESTATIC: ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?l100uS@oZJ\"[d2}:");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(455);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(303);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 303
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      Object object0 = new Object();
      dynamicSelectModel1.empty(object0);
      Collection collection0 = dynamicSelectModel0.getObjects();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("'\n'JDB1LCG");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression '
         // 'JDB1LCG.values() evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] from ");
      Collection collection0 = dynamicSelectModel1.getObjects();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      Collection collection0 = dynamicSelectModel1.getObjects();
      Collection collection1 = dynamicSelectModel1.getObjects();
      assertSame(collection1, collection0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(",=N).rjp eQJKOj.>");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(" {<V:|y83)");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label(" {<V:|y83)");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(" {<V:|y83)");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("'\n'JDB1LCG");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression '
         // 'JDB1LCG.values() evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[] from ");
      Object object0 = dynamicSelectModel0.translateValue("java.lang.Integer@0000000030");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      Object object0 = dynamicSelectModel0.translateValue("java.lang.Integer@0000000027");
      //  // Unstable assertion: assertEquals(Asset.AssetType.js, object0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel1.translator("wheel.Asset$AssetType");
      Object object0 = dynamicSelectModel1.translateValue("java.lang.Integer@0000000028");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertTrue(standaloneComponent0.isPage());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel((ElExpression) null, (ElExpression) null, (ElExpression) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.setComponent(label0);
      Component component0 = dynamicSelectModel0.getComponent();
      assertSame(component0, label0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.reset();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("java.lang.Integer@0000000037");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      TextArea textArea0 = new TextArea(errorPage0, "", "_W");
      Label label0 = new Label(textArea0, textArea0);
      Any any0 = new Any(label0, "");
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      Component component0 = dynamicSelectModel0.getComponent();
      assertNull(component0);
  }
}
