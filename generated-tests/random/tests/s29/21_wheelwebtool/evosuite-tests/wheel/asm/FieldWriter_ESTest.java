/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:06:58 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-1550));
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1550), "l={2U(~BnZA}PhX'", "D/+p1v/\"t9", "l={2U(~BnZA}PhX'", (Object) null);
      AnnotationVisitor annotationVisitor0 = fieldVisitor0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2379);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 54, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "57wU!GYvhpO", "57wU!GYvhpO");
      fieldWriter0.next = fieldWriter0;
      // Undeclared exception!
      try { 
        fieldWriter0.next.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1550));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-1550), "l={2U(~BnZA}PhX'", "D/+p1v/\"t9", "l={2U(~BnZA}PhX'", (Object) null);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1110, "", "", (String) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@11babda7
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1874));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-1874), "!{-TJ_sH@;eD)wxp", "!{-TJ_sH@;eD)wxp", ":,I{sKO22vq|s", ":,I{sKO22vq|s");
      fieldWriter0.visitAnnotation("SourceDebugExtension", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2379);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 54, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "57wU!GYvhpO", "57wU!GYvhpO");
      fieldWriter0.visitAnnotation("wheel.asm.FieldWriter", true);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3434);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 127, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "gJE+d3Ul";
      stringArray0[1] = "";
      stringArray0[2] = "t}P1BFfd";
      stringArray0[3] = "gJE+d3Ul";
      stringArray0[4] = "t}P1BFfd";
      stringArray0[5] = "";
      stringArray0[6] = "gJE+d3Ul";
      stringArray0[7] = "t}P1BFfd";
      stringArray0[8] = "Synthetic";
      classWriter0.visit((-30), (-1), "", "t}P1BFfd", "gJE+d3Ul", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "KM DcIlYD", "(ia-", "KM DcIlYD", "KM DcIlYD");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-593));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-593), "p\b", "p\b", "p\b", "p\b");
      Attribute attribute0 = new Attribute("p\b");
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2379);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 54, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "57wU!GYvhpO", "57wU!GYvhpO");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1550));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-1550), "l={2U(~BnZA}PhX'", "D/+p1v/\"t9", "l={2U(~BnZA}PhX'", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-593));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-593), "p\b", "p\b", "p\b", "p\b");
      fieldWriter0.visitAnnotation("p\b", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-593));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-593), "p\b", "p\b", "p\b", "p\b");
      fieldWriter0.visitAnnotation("p\b", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3434);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 127, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1874));
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1874), "!{-TJ_sH@;eD)wxp", "!{-TJ_sH@;eD)wxp", ":,I{sKO22vq|s", ":,I{sKO22vq|s");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "MW)|@", (Object) null);
      assertFalse(fieldWriter0.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1550));
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-1550), "l={2U(~BnZA}PhX'", "D/+p1v/\"t9", "l={2U(~BnZA}PhX'", (Object) null);
      fieldVisitor0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1550));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-1550), "l={2U(~BnZA}PhX'", "D/+p1v/\"t9", "l={2U(~BnZA}PhX'", (Object) null);
      Attribute attribute0 = new Attribute("");
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
}
