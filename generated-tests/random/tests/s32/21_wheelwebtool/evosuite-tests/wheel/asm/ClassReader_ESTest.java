/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:31:19 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
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
      ClassReader classReader0 = new ClassReader("wheel.asm.ByteVector");
      char[] charArray0 = new char[7];
      charArray0[0] = '3';
      charArray0[1] = ']';
      charArray0[2] = 'D';
      charArray0[3] = 'T';
      charArray0[4] = '[';
      charArray0[5] = 'z';
      charArray0[6] = '<';
      // Undeclared exception!
      try { 
        classReader0.readConst(64, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          ClassReader classReader0 = new ClassReader("wheel.asm.Attribute");
          ClassWriter classWriter0 = new ClassWriter(8);
          ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
          classAdapter0.cv = (ClassVisitor) classWriter0;
          classAdapter0.cv = (ClassVisitor) classWriter0;
          classReader0.accept((ClassVisitor) classAdapter0, 2);
          classReader0.getSuperName();
          classReader0.getClassName();
          Attribute[] attributeArray0 = new Attribute[1];
          Attribute attribute0 = new Attribute("wheel.asm.Attribute");
          attributeArray0[0] = attribute0;
          classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 1);
          classReader0.getClassName();
          // Undeclared exception!
          try { 
            classReader0.readShort((-1451));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
          
          } catch(ArrayIndexOutOfBoundsException e) {
             //
             // no message in exception (getMessage() returned null)
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      ClassWriter classWriter0 = new ClassWriter(3976);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classAdapter0, 76);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.NotFileFilter");
      String string0 = classReader0.getClassName();
      assertEquals("org/apache/commons/io/filefilter/NotFileFilter", string0);
      
      int int0 = classReader0.getAccess();
      assertEquals(33, int0);
      
      classReader0.getInterfaces();
      char[] charArray0 = new char[9];
      charArray0[0] = 'J';
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-179));
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      Attribute[] attributeArray0 = new Attribute[0];
      classReader0.accept((ClassVisitor) classAdapter0, attributeArray0, 711);
      charArray0[1] = '<';
      charArray0[2] = '#';
      charArray0[3] = 'J';
      charArray0[4] = '-';
      charArray0[5] = '9';
      charArray0[6] = 'O';
      charArray0[7] = 'Y';
      charArray0[8] = '?';
      // Undeclared exception!
      try { 
        classReader0.readConst(63, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 63
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Item");
      classReader0.getInterfaces();
      classReader0.readByte(1215);
      int int0 = 2514;
      // Undeclared exception!
      try { 
        classReader0.readUnsignedShort(2514);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ClassReader classReader0 = new ClassReader("org.apache.commons.io.filefilter.EmptyFileFilter");
      assertEquals(703, classReader0.header);
      
      char[] charArray0 = new char[5];
      charArray0[0] = '\"';
      charArray0[1] = '%';
      charArray0[2] = 'M';
      charArray0[3] = 'K';
      String string0 = classReader0.getSuperName();
      assertEquals("org/apache/commons/io/filefilter/AbstractFileFilter", string0);
      
      charArray0[4] = 'Q';
      int int0 = classReader0.getItem(6);
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte) (-93);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-99);
      byteArray0[4] = (byte)40;
      byteArray0[5] = (byte)11;
      byteArray0[6] = (byte) (-106);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ClassReader classReader0 = new ClassReader("wheel.asm.MethodWriter");
      classReader0.getClassName();
      int int0 = 80;
      ClassWriter classWriter0 = new ClassWriter((byte) (-99));
      classReader0.accept((ClassVisitor) classWriter0, 1);
      char[] charArray0 = new char[2];
      char char0 = 'Y';
      // Undeclared exception!
      try { 
        classReader0.readUTF8((-1691), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-41);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte) (-14);
      byteArray0[3] = (byte) (-1);
      byte byte0 = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)8;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3983), (byte)0);
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)55;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)15;
      byteArray0[4] = (byte) (-55);
      byte byte0 = (byte) (-23);
      byteArray0[5] = (byte) (-23);
      byteArray0[6] = (byte) (-94);
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, 3406, 3406);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "kQ%q");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)31;
      byteArray0[1] = (byte)17;
      byteArray0[2] = (byte) (-22);
      byteArray0[3] = (byte) (-99);
      byteArray0[4] = (byte)9;
      byteArray0[5] = (byte) (-58);
      byteArray0[6] = (byte) (-26);
      byteArray0[7] = (byte) (-52);
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (-4), (byte)31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ObjectInputStream$PeekInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = 41;
      ClassWriter classWriter0 = new ClassWriter(classReader0, (-1104));
      classReader0.accept((ClassVisitor) classWriter0, (-1104));
      char[] charArray0 = new char[9];
      charArray0[0] = '-';
      charArray0[0] = 'B';
      charArray0[2] = 'S';
      charArray0[3] = '|';
      charArray0[4] = 'K';
      charArray0[5] = '%';
      charArray0[6] = '0';
      charArray0[7] = ':';
      charArray0[8] = 'H';
      // Undeclared exception!
      try { 
        classReader0.readConst(41, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.ClassReader");
      int int0 = 41;
      ClassWriter classWriter0 = new ClassWriter(41);
      // Undeclared exception!
      classReader0.accept((ClassVisitor) classWriter0, (-1104));
  }
}