/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:08:41 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      long long0 = classReader0.readLong(1);
      assertEquals(1057, classReader0.getAccess());
      assertEquals((-91551935198384384L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      short short0 = classReader0.readShort(479);
      assertEquals(1121, classReader0.header);
      assertEquals((short)4951, short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      Label[] labelArray0 = new Label[4];
      classReader0.readLabel(1, labelArray0);
      assertEquals(1734, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      // Undeclared exception!
      try { 
        classReader0.getItem((-36));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -36
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(61);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, (-501));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      // Undeclared exception!
      try { 
        classReader0.readClass(1, (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      int int0 = classReader0.readInt(62);
      assertEquals(1734, classReader0.header);
      assertEquals(1577084937, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      long long0 = classReader0.readLong(195);
      assertEquals(6216375960272591187L, long0);
      assertEquals(1531, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      // Undeclared exception!
      try { 
        classReader0.readShort((-374));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -374
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.PrefixFileFilter");
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        classReader0.readConst(21, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.PrefixFileFilter");
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      classReader0.accept((ClassVisitor) classAdapter0, 2);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      ClassWriter classWriter0 = new ClassWriter((-1));
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[4];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 0);
      assertEquals(48, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.PrefixFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 21);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 2171);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.accept((ClassVisitor) classWriter0, 1);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      // Undeclared exception!
      try { 
        classReader0.readInt((-134));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -134
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)2, (byte)2);
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
        classReader0 = new ClassReader("AnnotationDefault");
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
      ClassReader classReader0 = new ClassReader("wheel.asm.FieldWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1734);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      ClassWriter classWriter0 = new ClassWriter(8);
      classReader0.copyPool(classWriter0);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.OrFileFilter");
      classReader0.getInterfaces();
      assertEquals(1512, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      assertEquals(1121, classReader0.header);
      
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.OrFileFilter");
      String string0 = classReader0.getSuperName();
      assertEquals(1512, classReader0.header);
      assertNotNull(string0);
      assertEquals("org/apache/commons/io/filefilter/AbstractFileFilter", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 91, 2147483645);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 868
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertEquals("wheel/asm/Edge", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readByte((byte)0);
      assertEquals(202, int0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.OrFileFilter");
      int int0 = classReader0.getItem(12);
      assertEquals(1512, classReader0.header);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.OrFileFilter");
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }
}