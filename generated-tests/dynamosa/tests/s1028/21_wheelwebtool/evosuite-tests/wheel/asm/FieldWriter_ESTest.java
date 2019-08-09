/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 20:23:51 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65475);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65475, "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT");
      ByteVector byteVector0 = new ByteVector(16777263);
      classWriter0.visit(49, 579, "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT", (String[]) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = (-1991);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "YoKOwQ8t8e$O\"6T", "wheel.asm.Type", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-196));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-196), "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT");
      classWriter0.visit(16777265, 16777265, "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = (-1991);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "YoKOwQ8t8e$O\"6T", "wheel.asm.Type", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-161));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-161), "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T");
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
      ClassWriter classWriter0 = new ClassWriter(21);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 21, "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T");
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
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1072), "", "org.apache.commons.io.filefilter.FileFileFilter", (String) null, "");
      // Undeclared exception!
      try { 
        fieldVisitor0.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65475);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65475, "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg");
      ByteVector byteVector0 = new ByteVector(16777263);
      Attribute attribute0 = new Attribute("Synthetic");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T", "YoKOwQ8t8e$O\"6T");
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.length = 2;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-25));
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-677), "", "", "@Ga-DK03", "jT{tTutK%Ye4]4");
      byteVector0.length = 1588;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65514);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1034), "OAB77}REe8;$3,W_xC", "wheel.asm.Type", "OAB77}REe8;$3,W_xC", "YoKOwQ8t8e$O\"6T");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 60, "xV", "", "d'vnIU-", annotationVisitor0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.AnnotationWriter@d
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65475);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65475, "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg");
      ByteVector byteVector0 = new ByteVector(16777263);
      Attribute attribute0 = new Attribute("Synthetic");
      fieldWriter0.visitAttribute(attribute0);
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

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65475);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65475, "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg");
      ByteVector byteVector0 = new ByteVector(16777263);
      fieldWriter0.visitAnnotation("K(_w7bY2fALMg", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-1072), "", "org.apache.commons.io.filefilter.FileFileFilter", (String) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-168));
      classWriter0.version = 613;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-168), "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-128), "", "", "", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-196));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-196), "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT", "K!_%iw+a$o7bY28LT");
      Attribute attribute0 = new Attribute("K!_%iw+a$o7bY28LT");
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
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1034), "OAB77}REe8;$3,W_xC", "wheel.asm.Type", "OAB77}REe8;$3,W_xC", "YoKOwQ8t8e$O\"6T");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-1072), "", "org.apache.commons.io.filefilter.FileFileFilter", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-168));
      classWriter0.version = 613;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-168), "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT", "K(_w7bY28ALMT");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-128), "", "", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65475);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65475, "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg", "K(_w7bY2fALMg");
      fieldWriter0.visitAnnotation("K(_w7bY2fALMg", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-128), "", "", "", (Object) null);
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1072), "", "org.apache.commons.io.filefilter.FileFileFilter", (String) null, "");
      fieldVisitor0.visitEnd();
  }
}
