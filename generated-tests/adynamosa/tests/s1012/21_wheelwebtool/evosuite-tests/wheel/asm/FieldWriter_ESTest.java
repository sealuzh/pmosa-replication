/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 17:15:10 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
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
      ClassWriter classWriter0 = new ClassWriter((-710));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "", (Object) null);
      classWriter0.version = (-710);
      ByteVector byteVector0 = new ByteVector(40);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.index = Integer.MAX_VALUE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "sS!%f)", "m2");
      ByteVector byteVector0 = new ByteVector(40);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-710));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "", (Object) null);
      classWriter0.version = (-710);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      classWriter0.index = Integer.MAX_VALUE;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "sS!%f)", "m2");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-710));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "", (Object) null);
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "sS!%f)", "m2");
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
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
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
      ClassWriter classWriter0 = new ClassWriter(49);
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 49, 2);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 187, "", "", "bT\":H2eqlV}D'L&w", byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@5ff42c7b
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.DelegateFileFilter");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "sS!%f)", "m2");
      fieldWriter0.visitAnnotation("sS!%f)", false);
      ByteVector byteVector0 = new ByteVector(40);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.visitAnnotation("Ijh@hN$54^KIbTU[.F{", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      ByteVector byteVector0 = new ByteVector(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1437), "d'", "d'", "", "d'");
      classWriter0.version = 49;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Synthetic", "Synthetic", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.DelegateFileFilter");
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
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      fieldWriter0.visitAnnotation(";", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1437), "d'", "d'", "", "d'");
      classWriter0.version = 49;
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1, "Synthetic", "Synthetic", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "sS!%f)", "m2");
      fieldWriter0.visitAnnotation("sS!%f)", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1, "Synthetic", "Synthetic", (String) null, (Object) null);
      assertFalse(fieldVisitor0.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1584), "m2", "C>]ko?U2w#H", "sS!%f)", "m2");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
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
}
