/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:28:24 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassAdapter;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.Label;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      int int0 = classReader0.readUnsignedShort(12);
      assertEquals(1121, classReader0.header);
      assertEquals(4608, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 0);
      String string0 = classReader0.readClass(1678, (char[]) null);
      assertEquals("java/lang/String", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.AnnotationWriter");
      // Undeclared exception!
      try { 
        classReader0.readLabel(2, (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.AnnotationWriter");
      ClassWriter classWriter0 = new ClassWriter((-3412));
      classReader0.copyPool(classWriter0);
      assertEquals(2149, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readLabel((-110), (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
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
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      char[] charArray0 = new char[3];
      Object object0 = classReader0.readConst(26, charArray0);
      assertEquals("\u00000", object0);
      assertEquals(1121, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(1);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 19);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 1);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.DirectoryFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-1481));
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort(3621);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      int int0 = classReader0.readInt(91);
      assertEquals(271, classReader0.header);
      assertEquals(16781644, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        classReader0.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(41, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0);
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
  public void test17()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(";9My");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 0);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 1264);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-533));
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1304);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 3003);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(1531, classReader0.header);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(0, stringArray0.length);
      assertEquals(575, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      assertEquals(1531, classReader0.header);
      
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-72);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte) (-8), (byte)11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(197, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      assertEquals(1531, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertEquals("org/apache/commons/io/IOCase", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Throwable");
      ClassWriter classWriter0 = new ClassWriter((-693));
      classReader0.accept((ClassVisitor) classWriter0, 1);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      int int0 = classReader0.readByte(79);
      assertEquals(703, classReader0.header);
      assertEquals(104, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      int int0 = classReader0.getItem(30);
      assertEquals(287, int0);
      assertEquals(1121, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      ClassWriter classWriter0 = new ClassWriter((-1241));
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 2);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }
}
