/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 04:13:17 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      byte[] byteArray0 = new byte[27];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ClassReader classReader0 = new ClassReader(byteArrayInputStream0);
      int int0 = classReader0.readUnsignedShort(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      short short0 = classReader0.readShort(2);
      assertEquals((short) (-17730), short0);
      assertEquals(1380, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ClassReader classReader0 = new ClassReader(byteArray0);
      long long0 = classReader0.readLong(1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      long long0 = classReader0.readLong(2);
      assertEquals(1380, classReader0.header);
      assertEquals((-4990551337076850600L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      Label[] labelArray0 = new Label[6];
      Label label0 = classReader0.readLabel(1, labelArray0);
      assertNotNull(label0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      int int0 = classReader0.readInt(1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      int int0 = classReader0.readInt(8);
      assertEquals(271, classReader0.header);
      assertEquals(1706496, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(271);
      Attribute[] attributeArray0 = new Attribute[3];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 250);
      char[] charArray0 = new char[3];
      Object object0 = classReader0.readConst(23, charArray0);
      assertEquals("<init>", object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      char[] charArray0 = new char[11];
      String string0 = classReader0.readClass(19, charArray0);
      assertEquals("()V", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      int int0 = classReader0.readByte(330);
      assertEquals(1380, classReader0.header);
      assertEquals(114, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      int int0 = classReader0.getItem(12);
      assertEquals(92, int0);
      assertEquals(271, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      int int0 = classReader0.getAccess();
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      ClassReader classReader0 = new ClassReader(sequenceInputStream0);
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort((-3));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ClassReader classReader0 = new ClassReader(byteArray0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ClassReader classReader0 = new ClassReader(byteArray0);
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-407), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      classReader0.readShort(0);
      assertEquals(10, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      long long0 = classReader0.readLong(10);
      assertEquals(1380, classReader0.header);
      assertEquals(720596831956500500L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      Label[] labelArray0 = new Label[0];
      // Undeclared exception!
      try { 
        classReader0.readLabel(8, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      int int0 = classReader0.readInt(1);
      assertEquals((-21316096), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.readConst((-1383), (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1383
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.readClass(318, (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        classReader0.readClass(1005, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassReader classReader0 = new ClassReader(byteArray0);
      classReader0.readByte((byte)0);
      assertEquals(10, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readByte((-2107));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2107
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      classReader0.getItem(0);
      assertEquals(1380, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      // Undeclared exception!
      try { 
        classReader0.getItem(98);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 98
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.copyPool((ClassWriter) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      ClassWriter classWriter0 = new ClassWriter(9);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[6];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, (int) (short)0);
      assertEquals(6, attributeArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      // Undeclared exception!
      try { 
        classReader0.readShort((-147));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -147
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.readLabel(17, (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      Label[] labelArray0 = new Label[6];
      // Undeclared exception!
      try { 
        classReader0.readLabel((-12), labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -12
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassReader classReader0 = new ClassReader(byteArray0, (byte)0, 2497);
      // Undeclared exception!
      try { 
        classReader0.getSuperName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.getClassName();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassWriter classWriter0 = new ClassWriter((-1921));
      ClassReader classReader0 = new ClassReader(byteArray0, (byte)0, 2497);
      // Undeclared exception!
      try { 
        classReader0.copyPool(classWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      Attribute[] attributeArray0 = new Attribute[0];
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, attributeArray0, 15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassWriter classWriter0 = new ClassWriter(46);
      ClassReader classReader0 = new ClassReader(byteArray0);
      Attribute[] attributeArray0 = new Attribute[6];
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassWriter classWriter0 = new ClassWriter((-1921));
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) classWriter0, (int) (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      byteArray0[8] = (byte) (-105);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 25
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      char[] charArray0 = new char[9];
      Object object0 = classReader0.readConst(9, charArray0);
      assertEquals(Integer.MAX_VALUE, object0);
      assertEquals(271, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        classReader0.readConst(1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(271);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[3];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 750);
      String string0 = classReader0.readUTF8(22, (char[]) null);
      assertEquals("ConstantValue", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 25165824);
      Attribute[] attributeArray0 = new Attribute[8];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-3253));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      int int0 = classReader0.readUnsignedShort(388);
      assertEquals(271, classReader0.header);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        classReader0.readClass((-5755), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      ClassReader classReader0 = new ClassReader(byteArray0, 8, 1080);
      // Undeclared exception!
      try { 
        classReader0.readInt((-562));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      short short0 = classReader0.readShort(8);
      assertEquals((short)26, short0);
      assertEquals(271, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readConst(2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      char[] charArray0 = new char[7];
      String string0 = classReader0.readUTF8(388, charArray0);
      assertEquals("\u0000\u0017\u0007", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      classReader1.accept((ClassVisitor) classWriter0, 1008);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      classReader1.accept((ClassVisitor) classWriter0, 72);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter((-1225));
      Attribute[] attributeArray0 = new Attribute[4];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org/apache/commons/io/filefilter/AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(980);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 980);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      assertEquals(7802, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(sequenceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("<init>");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      ClassWriter classWriter0 = new ClassWriter(9);
      classReader0.copyPool(classWriter0);
      assertEquals(4, ClassReader.SKIP_FRAMES);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1);
      classReader0.accept((ClassVisitor) classWriter0, (-614));
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org/apache/commons/io/filefilter/AbstractFileFilter");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(1057, classReader0.getAccess());
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(10, classReader0.header);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.getSuperName();
      assertEquals(1008, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      String string0 = classReader0.getSuperName();
      assertEquals("java/lang/Object", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFileFilter");
      ClassReader classReader1 = new ClassReader(classReader0.b, 8, 8);
      // Undeclared exception!
      try { 
        classReader1.getInterfaces();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 4, 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 18724
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 180, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1002
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      ClassReader classReader1 = new ClassReader(classReader0.b, 225, 2);
      ClassWriter classWriter0 = null;
      try {
        classWriter0 = new ClassWriter(classReader1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Edge");
      assertEquals(271, classReader0.header);
      
      String string0 = classReader0.getClassName();
      assertEquals("wheel/asm/Edge", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.readLong((-25));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      // Undeclared exception!
      try { 
        classReader0.getItem((-4654));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4654
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      ClassReader classReader0 = new ClassReader(byteArray0);
      classReader0.getAccess();
      assertEquals(10, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1049);
      Attribute[] attributeArray0 = new Attribute[6];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1254);
      assertEquals(1008, classReader0.header);
  }
}
