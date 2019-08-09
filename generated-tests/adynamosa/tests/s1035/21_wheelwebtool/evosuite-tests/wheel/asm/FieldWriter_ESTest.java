/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 09:11:58 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1923));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1923), "E/#", "E/#", "E/#", "E/#");
      ByteVector byteVector0 = new ByteVector(2090);
      classWriter0.visit(1278, (-1923), "E/#", "E/#", "GOzdF`*", (String[]) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1587));
      classWriter0.index = (-6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1587), "InnerClasses", "InnerClasses", "InnerClasses", "InnerClasses");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1923));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1923), "E/#", "E/#", "E/#", "E/#");
      classWriter0.visit(1278, (-1923), "E/#", "E/#", "GOzdF`*", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1587));
      classWriter0.index = (-6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1587), "InnerClasses", "InnerClasses", "InnerClasses", "InnerClasses");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, " & LQZu+h]Xo{uQTL#1", "w", " & LQZu+h]Xo{uQTL#1", "w");
      // Undeclared exception!
      try { 
        fieldWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(91);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "EH#", "EH#", "EH#", "EH#");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2497);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, " & LQZu+h]Xo{uQTL#1", "", " & LQZu+h]Xo{uQTL#1", "");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 863, ",Bs", ",Bs", "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2497);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, " & LQZu+h]Xo{uQTL#1", "", " & LQZu+h]Xo{uQTL#1", "");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2082), "A$#gBu*+", "InnerClasses", "InnerClasses", "");
      fieldWriter0.visitAnnotation("Insensitive", true);
      ByteVector byteVector0 = new ByteVector(48);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      classWriter0.index = 0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1590), "InnerClasses", "A$#gBu*+", "InnerClasses", "InnerClasses");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1923));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1923), "E/#", "E/#", "E/#", "E/#");
      ByteVector byteVector0 = new ByteVector(2090);
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-1923), "E/#", "DQJJMGL>E9", "E/#", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-32768), "", "", "InnerClasses", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1590), "InnerClasses", "Z", "wheel.asm.MethodWriter", "InnerClasses");
      Attribute attribute0 = new Attribute("wheel.asm.MethodWriter");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2497);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, " & LQZu+h]Xo{uQTL#1", "", " & LQZu+h]Xo{uQTL#1", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      classWriter0.index = 0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1590), "InnerClasses", "A$#gBu*+", "InnerClasses", "InnerClasses");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1923));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1923), "E/#", "E/#", "E/#", "E/#");
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-1923), "E/#", "DQJJMGL>E9", "E/#", stringArray0);
      int int0 = classWriter0.firstField.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1602));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2115), "", "}jycVtd", "InnerClasses", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2082), "A$#gBu*+", "InnerClasses", "InnerClasses", "");
      fieldWriter0.visitAnnotation("Insensitive", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "B~X8~b)fyWCey#", "B~X8~b)fyWCey#", (String) null, classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1602));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1602), "InnerClasses", "A$#gBu*+", "InnerClasses", "InnerClasses");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-2115), "", "}jycVtd", "InnerClasses", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1587));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1587), "InnerClasses", "InnerClasses", "InnerClasses", "InnerClasses");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1590));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2082), "A$#gBu*+", "InnerClasses", "InnerClasses", "");
      Attribute attribute0 = new Attribute("?uZDJcCp`Q6'1Jk(O");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(48);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }
}
