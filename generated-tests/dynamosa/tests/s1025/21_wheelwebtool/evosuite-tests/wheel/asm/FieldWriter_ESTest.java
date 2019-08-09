/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 15:36:53 GMT 2019
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
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4087);
      classWriter0.index = (-3203);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4087, "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4087);
      classWriter0.index = (-3203);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4087, "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1189, "RuntimeInvisibleAnnotations", "f\"`I02rO?,", (String) null, "RuntimeInvisibleAnnotations");
      AnnotationVisitor annotationVisitor0 = fieldVisitor0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-338), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4115);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4115, "", "", "", "");
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1181);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(1181, "V.DaZ75", "V.DaZ75", (String) null, "V.DaZ75");
      // Undeclared exception!
      try { 
        fieldVisitor0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-723));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "-ov/YA}]D58~)", "-ov/YA}]D58~)", ".TU;O3Ij", "-ov/YA}]D58~)");
      Attribute attribute0 = new Attribute("@Xo*Pia*n?");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(1);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(370);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null", "The FilenameFilter must not be null");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 370;
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
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4115);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 4115, (String) null, (String) null, (String) null, classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4115);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4115, "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[3];
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "", "1x:=r6jN=$H", "", byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(330, "o,ri?q_", "o,ri?q_", "o,ri?q_", "o,ri?q_");
      ByteVector byteVector0 = new ByteVector(1);
      Attribute attribute0 = new Attribute("o,ri?q_");
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
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4087);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4087, "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.AgeFileFilter", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1189, "RuntimeInvisibleAnnotations", "f\"`I02rO?,", (String) null, "RuntimeInvisibleAnnotations");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-355), "wI ", "", "", "wI ");
      ByteVector byteVector0 = new ByteVector(1);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "wI ";
      stringArray0[3] = "";
      stringArray0[4] = "wI ";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      classWriter0.visit(2248, 2248, "", "", "", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-355), "wI ", "", "", "wI ");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(131072, "f\"`If02rO?,", "LineNumberTable", "", (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1270);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter", "org.apache.commons.io.filefilter.AgeFileFilter");
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilter.AgeFileFilter");
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
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4115);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4115, "h1NpPf-R_o&AZeoS", "h1NpPf-R_o&AZeoS", "h1NpPf-R_o&AZeoS", "h1NpPf-R_o&AZeoS");
      fieldWriter0.visitAnnotation("h1NpPf-R_o&AZeoS", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-338), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeInvisibleAnnotations", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-355), "wI ", "", "", "wI ");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "wI ";
      stringArray0[3] = "";
      stringArray0[4] = "wI ";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      classWriter0.visit(2248, 2248, "", "", "", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(131072, "f\"`If02rO?,", "LineNumberTable", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2248, "wI ", "", "wI ", (Object) null);
      fieldWriter0.visitAnnotation("wI ", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1189, "RuntimeInvisibleAnnotations", "f\"`I02rO?,", (String) null, "RuntimeInvisibleAnnotations");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4115);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4115, "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "", "1x:=r6jN=$H", "", byteVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ByteVector@1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(131072, "f\"`If02rO?,", "LineNumberTable", "", (Object) null);
      fieldVisitor0.visitEnd();
  }
}
