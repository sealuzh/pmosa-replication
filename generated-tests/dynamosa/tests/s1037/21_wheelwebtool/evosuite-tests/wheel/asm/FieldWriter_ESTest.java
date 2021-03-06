/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 12:04:46 GMT 2019
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
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-214));
      classWriter0.index = (-804);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-214), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3719));
      classWriter0.version = (-3719);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3719), "P\"", "P\"", "P\"", "P\"");
      classWriter0.version = 49;
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3713));
      classWriter0.index = (-3713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "j\"", "j\"", "j\"", "j\"");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-39));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "wheel.asm.Handler", "wheel.asm.Handler", "wheel.asm.Handler", "wheel.asm.Handler");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", (String) null, "");
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
      ClassWriter classWriter0 = new ClassWriter(1024);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1023), "RuntimeInvisibleAnnotations", "", "", "The array of prefixes must not be null");
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
      ClassWriter classWriter0 = new ClassWriter(1024);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "The array of prefixes must not be null", "The array of prefixes must not be null", (Object) null);
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2997, "Pk0+", "Pk0+", ":", "Pk0+");
      Attribute attribute0 = new Attribute("!|>4~^ ");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.length = 2;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "|5kCzsPrv", "|5kCzsPrv", "|5kCzsPrv", "|5kCzsPrv");
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
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 0, "", "", "", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(79);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-3288);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "D`<x}h9cBt8MuY9D${R", "D`<x}h9cBt8MuY9D${R", "D`<x}h9cBt8MuY9D${R", (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2997, "Pk0+", "Pk0+", ":", "Pk0+");
      Attribute attribute0 = new Attribute("!|>4~^ ");
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3713));
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "D`x}h9Bt-8MY9D${R", "D`x}h9Bt-8MY9D${R", "D`x}h9Bt-8MY9D${R", "D`x}h9Bt-8MY9D${R");
      fieldWriter0.visitAnnotation("D`x}h9Bt-8MY9D${R", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "The array of prefixes must not be null", "The array of prefixes must not be null", (Object) null);
      ByteVector byteVector0 = new ByteVector(0);
      fieldWriter0.visitAnnotation("The array of prefixes must not be null", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-193));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-193), "", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3713));
      classWriter0.version = 66;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3713), "P\"", "P\"", "P\"", "P\"");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "j\"", "j\"", "j\"", "j\"");
      Attribute attribute0 = new Attribute("j\"");
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
      ClassWriter classWriter0 = new ClassWriter(285212681);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "v&zV&~|3\u0003'", "v&zV&~|3\u0003'", "v&zV&~|3\u0003'", "v&zV&~|3\u0003'");
      fieldWriter0.visitAnnotation("v&zV&~|3\u0003'", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3719));
      classWriter0.version = (-3719);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3719), "P\"", "P\"", "P\"", "P\"");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1023), "RuntimeInvisibleAnnotations", "", "", "The array of prefixes must not be null");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1024);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "The array of prefixes must not be null", "The array of prefixes must not be null", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3713));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "D`x}h9Bt-8MY9D${R", "D`x}h9Bt-8MY9D${R", "D`x}h9Bt-8MY9D${R", "D`x}h9Bt-8MY9D${R");
      fieldWriter0.visitAnnotation("D`x}h9Bt-8MY9D${R", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "2", "2", (String) null, "2");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-4701), "2", "2", "2", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-39));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "wheel.asm.Handler", "wheel.asm.Handler", "wheel.asm.Handler", "wheel.asm.Handler");
      fieldWriter0.visitEnd();
  }
}
