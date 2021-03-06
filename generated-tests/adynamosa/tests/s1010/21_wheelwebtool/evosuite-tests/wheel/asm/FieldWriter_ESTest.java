/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 14:05:09 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1319), "", "", "The wildcard must not be null", "");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "kx,8`|c(Y<";
      stringArray0[2] = "";
      stringArray0[3] = "kx,8`|c(Y<";
      stringArray0[4] = "kx,8`|c(Y<";
      stringArray0[5] = "";
      stringArray0[6] = "";
      classWriter0.visit(192, 192, "", "", "kx,8`|c(Y<", stringArray0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-512));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.index = (-512);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2871), "Ljava/lang/Synthetic;", "", "", "Deprecated");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1319), "", "", "The wildcard must not be null", "");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "kx,8`|c(Y<";
      stringArray0[2] = "";
      stringArray0[3] = "kx,8`|c(Y<";
      stringArray0[4] = "kx,8`|c(Y<";
      stringArray0[5] = "";
      stringArray0[6] = "";
      classWriter0.visit(192, 192, "", "", "kx,8`|c(Y<", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-512));
      classWriter0.index = (-512);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2871), "Ljava/lang/Synthetic;", "", "", "Deprecated");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2634), "", "", "", "");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(504);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "\nk&^vN", "\"Mv$1%<!Q@", "-}^Tq{q 'E", "ee~~_H3m8e9");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1319), "", "", "The wildcard must not be null", "");
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1290);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "/~3F4uPwcZ54]<qJ", "", "/~3F4uPwcZ54]<qJ", ".|{*ip");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 4635, "LM;Cn8^YB&ly*r1xk,", "TOFiBo)UI`'k]! g[f", "wheel.asm.Item", "LM;Cn8^YB&ly*r1xk,");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2531));
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "", "S`K^:*", (String) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@6987df5b
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1862), "/~3F4uPwcZ54]<qJ", "qlSGvm5b/6O4R7h", "/~3F4uPwcZ54]<qJ", (Object) null);
      fieldWriter0.next = fieldWriter0;
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.next.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(504);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Ljava/lang/Synthetic;", "", "-}^Tq{q 'E", (Object) null);
      fieldWriter0.visitAnnotation("ConstantValue", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2646), "lK'zu9=\"NtN*j ", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-515));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Ljava/lang/Synthetic;", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2646), "lK'zu9=\"NtN*j ", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv");
      classWriter0.visit(49, 49, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", ",uGd^{xi<~Wfv", (String[]) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(504);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Ljava/lang/Synthetic;", "", "-}^Tq{q 'E", (Object) null);
      Attribute attribute0 = new Attribute("Ljava/lang/Synthetic;");
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
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(192);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 7, "", "T]7G;ND&<JS)d>[", "The wildcard must not be null", "");
      fieldWriter0.visitAnnotation("%B!RmLXC>5<uQH:xR", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2634), "", "", "", "");
      classWriter0.visit(49, (-2634), "", "", "Synthetic", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2646), "lK'zu9=\"NtN*j ", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-515));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Ljava/lang/Synthetic;", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2646), "lK'zu9=\"NtN*j ", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "GXs", ",uGd^{xi<~Wfv", ",uGd^{xi<~Wfv", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 268435455, "", "Ze2=~^", "Ze2=~^", "");
      fieldWriter0.visitEnd();
  }
}
