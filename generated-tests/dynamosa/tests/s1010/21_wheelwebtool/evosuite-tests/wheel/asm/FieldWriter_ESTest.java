/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 14:06:41 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(521);
      classWriter0.index = (-219);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "\nk&^vN", "\nk&^vN", "\nk&^vN", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(444);
      classWriter0.index = (-1927);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1257, "\nk&^vN", "a/Sp", "Ip$.dr/", "\nk&^vN");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(506);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "bnaCvN", "bnaCvN", "bnaCvN", "bnaCvN");
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
      ClassWriter classWriter0 = new ClassWriter(521);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 521, "\nk&^vN", "pONnr^2YvM^Xb", "pONnr^2YvM^Xb", "p(`}>8SQ$n");
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
      ClassWriter classWriter0 = new ClassWriter(499);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4, "_5ftBe6{hDwy3", "_5ftBe6{hDwy3", "_5ftBe6{hDwy3", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(489);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "\nk&^vN", "\nk&^vN", "\nk&^vN", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 489;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("YA", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "\nk&^vN", "\nk&^vN", "\nk&^vN", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("Signature");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1364));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1364), "!", "!", "!", "!");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = (-1364);
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(489);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "\nk&^vN", "\nk&^vN", "\nk&^vN", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 489;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(463);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "\nk&^vN", "\nk&^vN", "\nk&^vN", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("Signature");
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
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1364));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1364), "!", "!", "!", "!");
      fieldWriter0.visitAnnotation("!", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(516);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 516, "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3094);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "\nk&^vN", "\nk&^vN", (String) null, "\nk&^vN");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      classWriter0.version = 521;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1531), "\nk&^vN", "ConstantValue", "r+r)bS/{;J[ClhNsW", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      Attribute attribute0 = new Attribute("");
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
      ClassWriter classWriter0 = new ClassWriter(16);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "{~7eK", "{~7eK", "{~7eK", "{~7eK");
      fieldWriter0.visitAnnotation("{~7eK", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      classWriter0.version = 521;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1531), "\nk&^vN", "ConstantValue", "r+r)bS/{;J[ClhNsW", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-10), "\nk&^vN", "\nk&^vN", "\nk&^vN", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = classWriter0.firstField.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3094);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "\nk&^vN", "\nk&^vN", (String) null, "\nk&^vN");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4406);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "LocalVariabl5Typ1Table", "LocalVariabl5Typ1Table", "LocalVariabl5Typ1Table", "LocalVariabl5Typ1Table");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "LocalVariabl5Typ1Table", "LocalVariabl5Typ1Table", "LocalVariabl5Typ1Table", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      classWriter0.firstField.visitEnd();
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }
}
