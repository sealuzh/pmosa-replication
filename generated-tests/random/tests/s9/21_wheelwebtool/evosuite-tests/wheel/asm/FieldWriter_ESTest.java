/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:26:38 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-354), "wheel.asm.ClassReader", "wheel.asm.ClassReader", "wheel.asm.ClassReader", (Object) null);
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
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(707);
      Attribute attribute0 = new Attribute("eTqo");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "y&x`85[", ".9y.RX*NMH", "", ".9y.RX*NMH");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 171, "l%c,", "l%c,", "l%c,", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      classWriter0.version = (-863);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-863), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1416));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-325), "Signature", "Signature", "Signature", "Signature");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1416));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(0, "Signature", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "Signature");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(707);
      Attribute attribute0 = new Attribute("eTqo");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "y&x`85[", ".9y.RX*NMH", "", ".9y.RX*NMH");
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-354), "wheel.asm.ClassReader", "wheel.asm.ClassReader", "wheel.asm.ClassReader", (Object) null);
      fieldWriter0.visitAnnotation("wheel.asm.ClassReader", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "Signature", " #y_%zxoCt");
      fieldWriter0.visitAnnotation(" #y_%zxoCt", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      classWriter0.version = (-863);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-863), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1305));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2321, "hl_|rgB", "&|^@/", "&|^@/", "&|^@/");
      fieldWriter0.visitAnnotation("KYwpd~A?", true);
      ByteVector byteVector0 = new ByteVector(285212682);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(17);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4024, "RuntimeInvisibleAnnotations", "-MdLl", "RuntimeVisibleAnnotations", "RuntimeInvisibleAnnotations");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1416));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(0, "Signature", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "Signature");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-325), "Signature", "Signature", "Signature", "Signature");
      assertFalse(fieldWriter0.equals((Object)fieldVisitor0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1305));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2321, "hl_|rgB", "&|^@/", "&|^@/", "&|^@/");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1305));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2321, "hl_|rgB", "&|^@/", "&|^@/", "&|^@/");
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(285212682);
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
