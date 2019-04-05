/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:28:09 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassAdapter;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        classReader0.readConst((-772), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -772
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FileFileFilter");
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        classReader0.readClass(0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      // Undeclared exception!
      try { 
        classReader0.readInt((-690));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readClass(100780810, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = classReader0.readInt(185);
      assertEquals(100780810, int0);
      assertEquals(8070, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(756, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanWriteFileFilter");
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        classReader0.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanWriteFileFilter");
      ClassWriter classWriter0 = new ClassWriter(1);
      classReader0.accept((ClassVisitor) classWriter0, 527);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((InputStream) null);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[2];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 2);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, (-539));
      assertEquals(48, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassWriter");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(7316, classReader0.header);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.FileFileFilter");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(0, stringArray0.length);
      assertEquals(464, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      assertNotNull(string0);
      assertEquals(3025, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-123);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), 1663);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.CanWriteFileFilter");
      assertEquals(623, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertEquals("org/apache/commons/io/filefilter/CanWriteFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readByte(41);
      assertEquals(0, int0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Attribute");
      // Undeclared exception!
      try { 
        classReader0.getItem(716);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 716
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      classReader0.accept((ClassVisitor) classWriter0, (-4164));
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[2];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 2);
      assertEquals(8070, classReader0.header);
  }
}