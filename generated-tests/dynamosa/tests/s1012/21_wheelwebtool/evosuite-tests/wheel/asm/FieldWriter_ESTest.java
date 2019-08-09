/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 17:30:08 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(49);
      classWriter0.visit(49, (-918), "", "C[", "", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1616), "", "_", "", "_");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.index = (-3634);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1618), "bCfU7X?Nz5e)", "", "bCfU7X?Nz5e)", "");
      ByteVector byteVector0 = new ByteVector(4096);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(48);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1595), "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      classWriter0.visit(49, 50331648, "wheel.asm.ClassWriter", "wheel.asm.ClassWriter", "wheel.asm.ClassWriter", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.index = (-3634);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1618), "bCfU7X?Nz5e)", "", "bCfU7X?Nz5e)", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2810);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, ">QVT.!-F", ">QVT.!-F", ">QVT.!-F", ">QVT.!-F");
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
      ClassWriter classWriter0 = new ClassWriter(224);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "s", "s", "s", "s");
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
      ClassWriter classWriter0 = new ClassWriter(2603);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2603, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-808));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, "", "", (String) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[2];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("The list of suffixes must not be null", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2580);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2580, "", "", "", "");
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2597);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2597, "vC]^", "vC]^", "vC]^", "vC]^");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 2597;
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
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1570));
      classWriter0.index = 64075;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1071), "`uRGq?b", "`uRGq?b", "`uRGq?b", "`uRGq?b");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-615));
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
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-32797));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", classWriter0);
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
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-78));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, ">QVT.!-F", ">QVT.!-F", ">QVT.!-F", ">QVT.!-F");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector(16777217);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      fieldWriter0.visitAnnotation(";", true);
      ByteVector byteVector0 = new ByteVector((byte)0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2810);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, "J&V7i2", "d+", (String) null, "EkJP3Mq1;}{%;,_-!");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1941));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1941), "", "", "", "");
      ByteVector byteVector0 = new ByteVector(1);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "L";
      stringArray0[2] = "L";
      stringArray0[3] = "L";
      stringArray0[4] = "L";
      classWriter0.visit(4017, (-1941), "", "", "L", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2810);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, "{E", "\u0005", "{E", (Object) null);
      ByteVector byteVector0 = new ByteVector(2627);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2810);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, "J&V7i2", "d+", (String) null, "EkJP3Mq1;}{%;,_-!");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1941));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1941), "", "", "", "");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "L";
      stringArray0[2] = "L";
      stringArray0[3] = "L";
      stringArray0[4] = "L";
      classWriter0.visit(4017, (-1941), "", "", "L", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2810);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, "{E", "\u0005", "{E", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      fieldWriter0.visitAnnotation(";", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      fieldWriter0.visitAnnotation("}/", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-808));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2627, "", "", (String) null, "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-808), "p?%", "", "", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "", ";", "");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
}
