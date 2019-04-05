/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:02:38 GMT 2019
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
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-8));
      classWriter0.index = (-8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Deprecated", "Deprecated", "UW?Kjbs4uc", "UW?Kjbs4uc");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-8));
      classWriter0.index = (-8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Deprecated", "Deprecated", "UW?Kjbs4uc", "UW?Kjbs4uc");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1388), "Signature", "", "", "");
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
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3217));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "org.apache.commons.io.filefilter.AndFileFilter", "org.apache.commons.io.filefilter.AndFileFilter", "bqD8}gDR8Rr24l/", "]y&cy{(wZ6T6wKe0");
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16, "", "", "", (Object) null);
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-8));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65532, "ConstantVajue", "v3", "iq:TZ)'", "v3");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1838, "+i90", "+i90", "ConstantValue", fieldWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.FieldWriter@a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Attribute attribute0 = new Attribute("");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1427), "zJh_. rD%C", "", "zJh_. rD%C", "");
      ByteVector byteVector0 = new ByteVector();
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 9, "WBWFT", "'r.BNga{", "'r.BNga{", "WBWFT");
      fieldWriter0.visitAnnotation("-T>Ut#GYZWby'M", false);
      ByteVector byteVector0 = new ByteVector(9);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "xJbcrgR ,z>nr", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      classWriter0.version = 231;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "WBWY", "WBWY", "WBWY", "WBWY");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 247, "wheel.asm.Handler", "pH5(bC", "", "pH5(bC");
      Attribute attribute0 = new Attribute("h");
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
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Signature", "zJh_. rD%C", (String) null, "zJh_. rD%C");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      classWriter0.version = 231;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "WBWY", "WBWY", "WBWY", "WBWY");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1388), "Signature", "Signature", "Signature", "Signature");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1388), "Signature", "Signature", "Signature", "Signature");
      fieldWriter0.visitAnnotation("Signature", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 9, "WBWFT", "'r.BNga{", "'r.BNga{", "WBWFT");
      fieldWriter0.visitAnnotation("-T>Ut#GYZWby'M", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 16, "", "", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(28);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1388), "Signature", "Signature", "Signature", "Signature");
      fieldWriter0.visitEnd();
  }
}