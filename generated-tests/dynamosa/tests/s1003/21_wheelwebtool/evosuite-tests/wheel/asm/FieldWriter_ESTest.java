/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 00:43:33 GMT 2019
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
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(167);
      classWriter0.index = (-28);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-28), "RuntimeVisibleAnnotations", "<86{F", "", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      classWriter0.version = 4096;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "pfPA1]^,iJ", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      classWriter0.version = 4096;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "pfPA1]^,iJ", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      classWriter0.index = (-3620);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 239, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2132));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(167);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-36), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(167);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-28), "RuntimeVisibleAnnotations", "<86{F", "", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1816, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "pfPA!]iJ", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-442);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("-flndLOm", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -442
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-906), "ov:*SjK_I\"v.$+", "F4", "", "F4");
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3362));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3362), "9w'0|Z1'B66$m:V", "9w'0|Z1'B66$m:V", "9w'0|Z1'B66$m:V", "9w'0|Z1'B66$m:V");
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.length = (-3362);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3391));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-790), "-g5/ ", "req@ZhJpUu^=h=n", "req@ZhJpUu^=h=n", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-1025);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1025
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 4096, "T0$k", "T0$k", "T0$k", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-80));
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 374;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-80), "EnclosingMethod", "EnclosingMethod", "EnclosingMethod", "EnclosingMethod");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(26);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "}", "}", "}", "}");
      Attribute attribute0 = new Attribute("}");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
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
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1816, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(49, 251, "The array of prefixes must not be null", "The array of prefixes must not be null", "The array of prefixes must not be null", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "pfPA1]^,iJ", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1837);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Runt-meVisibleAn9otations", "Runt-meVisibleAn9otations", "Runt-meVisibleAn9otations", "Runt-meVisibleAn9otations");
      Attribute attribute0 = new Attribute("Runt-meVisibleAn9otations");
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
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 239, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("n*60(1H#O", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, " 0wvnN", " 0wvnN", " 0wvnN", " 0wvnN");
      fieldWriter0.visitAnnotation(" 0wvnN", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Ar9I6l69<F+ls", "", "Ar9I6l69<F+ls", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(49, 251, "The array of prefixes must not be null", "The array of prefixes must not be null", "The array of prefixes must not be null", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "pfPA1]^,iJ", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3308));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3308), "9fw0|Z.'B6B6$wK:V", "9fw0|Z.'B6B6$wK:V", "9fw0|Z.'B6B6$wK:V", "9fw0|Z.'B6B6$wK:V");
      fieldWriter0.visitAnnotation("9fw0|Z.'B6B6$wK:V", false);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "pfPA1]^,iJ", (String) null, (Object) null);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 8, (String) null, ">i>]8", "C^E$G/=nG(ERn'cfwL", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "[.R4H]rR");
      fieldWriter0.visitEnd();
  }
}
