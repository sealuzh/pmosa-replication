/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 21:46:41 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-5));
      classWriter0.version = (-5);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "T&Xt9L,-m", "T&Xt9L,-m", "T&Xt9L,-m", "T&Xt9L,-m");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      classWriter0.index = (-2228);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "7", "7", "7", "7");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65532);
      classWriter0.version = 55;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65532, "7", "7", (String) null, "7");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(77);
      classWriter0.index = (-535);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "[]x", "[]x", "[]x", "[]x");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "", "", "", "");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-609));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "VS)B;?Tk?25nwbv", "wheel.asm.AnnotationWriter", "");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-609));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "wheel.asm.AnnotationWriter", "");
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "LbzQAB1-.1*AGC", "LbzQAB1-.1*AGC", "LbzQAB1-.1*AGC", "LbzQAB1-.1*AGC");
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1227, "Z@-*ZZ-@9fh]!_Zb=e", "wheel.asm.FieldWriter", "org.apache.commons.io.ilefilter.DiretoryFileFHlter", "Z@-*ZZ-@9fh]!_Zb=e");
      Attribute attribute0 = new Attribute("wheel.asm.FieldWriter");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-5));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 131072;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65532);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65532, "7", "7", (String) null, "7");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[2];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 2, "", "", "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 49, "", "nZGy8zXM$", (String) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@bff272c
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-491), "org.apache.commons.io.filefilter.DirectoryFileFilter", "RuntimeVisibleAnnotations", "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.DirectoryFileFilter", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65532);
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65532, "7", "7", (String) null, "7");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(30);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "The filter must not be null", "The filter must not be null", "The filter must not be null", "The filter must not be null");
      Attribute attribute0 = new Attribute("The filter must not be null");
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
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3252, "wheel.asm.AnnotationWriter", "qwS?`vp{", "qwS?`vp{", (Object) null);
      fieldWriter0.visitAnnotation("wheel.asm.FieldWriter", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-491), "org.apache.commons.io.filefilter.DirectoryFileFilter", "RuntimeVisibleAnnotations", "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65532);
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65532, "7", "7", (String) null, "7");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-491), "org.apache.commons.io.filefilter.DirectoryFileFilter", "RuntimeVisibleAnnotations", "org.apache.commons.io.filefilter.DirectoryFileFilter", "org.apache.commons.io.filefilter.DirectoryFileFilter");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.DirectoryFileFilter", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "wheel.asm.FieldWriter", "org.apache.commons.io.ilefilter.DiretoryFileFHlter", "", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("org.apache.commons.io.ilefilter.DiretoryFileFHlter", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131072, "wheel.asm.FieldWriter", "org.apache.commons.io.ilefilter.DiretoryFileFHlter", "", "RuntimeVisibleAnnotations");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "rvKt`ZrS", "wheel.asm.ClassAdapter", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.next.put(byteVector0);
      assertFalse(fieldWriter0.equals((Object)fieldWriter1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "org.apache.commons.io.filefilter.WildcardFileFilter", "org.apache.commons.io.filefilter.WildcardFileFilter", "BH", "'aJr0(+v10:PcI$gY%");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1227, "Z@-*ZZ-@9fh]!_Zb=e", "wheel.asm.FieldWriter", "org.apache.commons.io.ilefilter.DiretoryFileFHlter", "Z@-*ZZ-@9fh]!_Zb=e");
      Attribute attribute0 = new Attribute("wheel.asm.FieldWriter");
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
}
