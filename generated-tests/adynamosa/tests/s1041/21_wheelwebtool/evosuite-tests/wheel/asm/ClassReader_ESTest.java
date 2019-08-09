/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 18:47:19 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ClassReader;
import wheel.asm.ClassVisitor;
import wheel.asm.ClassWriter;
import wheel.asm.Label;
import wheel.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassReader_ESTest extends ClassReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ClassReader classReader0 = new ClassReader(byteArray0);
      ClassWriter classWriter0 = new ClassWriter(2754);
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
  public void test01()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      classReader0.readUnsignedShort(4);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      short short0 = classReader0.readShort(127);
      assertEquals(1057, classReader0.getAccess());
      assertEquals((short)12129, short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readInt(8);
      assertEquals(1057, classReader0.getAccess());
      assertEquals(2820608, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[1];
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(1000);
      classReader0.accept((ClassVisitor) classWriter0, 64);
      Type type0 = (Type)classReader0.readConst(1, charArray0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      char[] charArray0 = new char[8];
      String string0 = classReader0.readClass(13, charArray0);
      assertEquals(575, classReader0.header);
      assertEquals("<init>", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readByte(36);
      assertEquals(0, int0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readUnsignedShort(0);
      assertEquals(1057, classReader0.getAccess());
      assertEquals(51966, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort((-2456));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(612, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[5];
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
  public void test11()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-39), (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      short short0 = classReader0.readShort(0);
      assertEquals((short) (-13570), short0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      long long0 = classReader0.readLong(0);
      assertEquals((-3819410108757049297L), long0);
      assertEquals(612, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      Label[] labelArray0 = new Label[0];
      // Undeclared exception!
      try { 
        classReader0.readLabel(26988, labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 26988
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      Label[] labelArray0 = new Label[22];
      Label label0 = classReader0.readLabel(0, labelArray0);
      assertNotNull(label0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.IOCase");
      Label[] labelArray0 = new Label[4];
      // Undeclared exception!
      try { 
        classReader0.readLabel((-3103), labelArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3103
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readInt(0);
      assertEquals(1057, classReader0.getAccess());
      assertEquals((-889275714), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readInt((byte) (-110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -110
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readConst(0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
          char[] charArray0 = new char[7];
          // Undeclared exception!
          try { 
            classReader0.readConst((-3171), charArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
          
          } catch(ArrayIndexOutOfBoundsException e) {
             //
             // -3171
             //
             verifyException("wheel.asm.ClassReader", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readClass(2864, (char[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        classReader0.readClass(10, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2560
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        classReader0.readClass((-1294), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.readByte(0);
      assertEquals(202, int0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1856);
      classReader0.accept((ClassVisitor) classWriter0, 0);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readShort((-1248));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1248
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readLong((-609));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -609
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readLabel(1000, (Label[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readConst(4, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.readByte((-1495));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1495
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.getItem((-244));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -244
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.copyPool((ClassWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[20];
      // Undeclared exception!
      try { 
        classReader0.readUTF8(4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      ClassReader classReader1 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader1, 1);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 24);
      assertNotSame(classReader1, classReader0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, (-606));
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1852);
      Attribute[] attributeArray0 = new Attribute[1];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 2);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      ClassWriter classWriter0 = new ClassWriter(4);
      classReader0.accept((ClassVisitor) classWriter0, (Attribute[]) null, 461);
      assertEquals(575, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.SizeFileFilter");
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, (Attribute[]) null, 494);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(1);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, (-1447));
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        classReader0.readClass(0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 51966
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(1000);
      classReader0.accept((ClassVisitor) classWriter0, 442);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(1000);
      classReader0.accept((ClassVisitor) classWriter0, 52);
      assertEquals(1, ClassReader.SKIP_CODE);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassReader classReader1 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      classReader1.accept((ClassVisitor) classWriter0, 2);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassReader classReader1 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 612);
      classReader1.accept((ClassVisitor) classWriter0, (-871));
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(classReader0.b);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 4);
      ClassReader classReader1 = new ClassReader(bufferedInputStream0);
      ClassReader classReader2 = null;
      try {
        classReader2 = new ClassReader(byteArrayInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader("ED[ow)7,YyJ&u6>i\"");
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Class not found
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassReader classReader1 = new ClassReader(classReader0.b, 612, 612);
      // Undeclared exception!
      try { 
        classReader1.copyPool(classWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/Object");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 4);
      classReader0.accept((ClassVisitor) classWriter0, 6);
      assertEquals(8, ClassReader.EXPAND_FRAMES);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      String[] stringArray0 = classReader0.getInterfaces();
      assertEquals(1, stringArray0.length);
      assertEquals(612, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      String string0 = classReader0.getSuperName();
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.WildcardFilter");
      classReader0.getInterfaces();
      assertEquals(1121, classReader0.header);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      ClassReader classReader1 = null;
      try {
        classReader1 = new ClassReader(classReader0.b, 64, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 868
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      String string0 = classReader0.getClassName();
      assertEquals("org/apache/commons/io/filefilter/AbstractFileFilter", string0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      long long0 = classReader0.readLong(91);
      assertEquals(1057, classReader0.getAccess());
      assertEquals(7278098551399211873L, long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.getItem(2);
      assertEquals(16, int0);
      assertEquals(1057, classReader0.getAccess());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      int int0 = classReader0.getAccess();
      assertEquals(1057, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      // Undeclared exception!
      try { 
        classReader0.accept((ClassVisitor) null, 1289);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.AbstractFileFilter");
      short short0 = classReader0.readShort(4);
      assertEquals((short)0, short0);
      assertEquals(1057, classReader0.getAccess());
  }
}
