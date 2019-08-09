/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 00:29:57 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-171));
      classWriter0.index = (-2179);
      ByteVector byteVector0 = new ByteVector(285212683);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 285212683, "", "", "", "The strings must not be null");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-171));
      classWriter0.index = (-2179);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 285212683, "", "", "", "The strings must not be null");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "f`D[Eg3uKRic6ZRq", "f`D[Eg3uKRic6ZRq", "f`D[Eg3uKRic6ZRq", "f`D[Eg3uKRic6ZRq");
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
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "f`D[Eg3uKRic6ZRq", "", "", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "f`D[Eg3uKRic6ZRq", "", "", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-3534), "value ", "value ", "value ", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "f`D[Eg3uKRic6ZRq", "", "", (Object) null);
      Attribute attribute0 = new Attribute("f`D[Eg3uKRic6ZRq");
      ByteVector byteVector0 = new ByteVector(22);
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
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-366), "gP2'N[?1bY0gO(", "gP2'N[?1bY0gO(", "@@.z2NRzP^wsX[aNDC", "gP2'N[?1bY0gO(");
      fieldWriter0.visitAnnotation("V$l:B*klS", false);
      ByteVector byteVector0 = new ByteVector(0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-171));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1734, "org.apache.commons.io.filefilter.NameFileFilter", "org.apache.commons.io.filefilter.NameFileFilter", "org.apache.commons.io.filefilter.NameFileFilter", "org.apache.commons.io.filefilter.NameFileFilter");
      fieldWriter0.visitAnnotation("]ra5@yU<p", true);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "@@.z2NRzP^wsX[aNDC", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-366), "gP2'N[?1bY0gO(", "gP2'N[?1bY0gO(", "@@.z2NRzP^wsX[aNDC", "gP2'N[?1bY0gO(");
      classWriter0.version = 176;
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-171));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2179), "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-190), "", "Pd9oWz@", "", "Pd9oWz@");
      classWriter0.version = (-190);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "f`D[Eg3uKRic6ZRq", "", "", (Object) null);
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-366), "gP2'N[?1bY0gO(", "gP2'N[?1bY0gO(", "@@.z2NRzP^wsX[aNDC", "gP2'N[?1bY0gO(");
      fieldWriter0.visitAnnotation("@@.z2NRzP^wsX[aNDC", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-171));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2179), "", "", (String) null, (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 285212683, "", "", "", "The strings must not be null");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-366), "gP2'N[?1bY0gO(", "gP2'N[?1bY0gO(", "@@.z2NRzP^wsX[aNDC", "gP2'N[?1bY0gO(");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "f`D[Eg3uKRic6ZRq", "", "", (Object) null);
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
}
