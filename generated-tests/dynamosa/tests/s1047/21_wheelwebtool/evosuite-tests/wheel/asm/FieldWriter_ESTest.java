/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 05:57:04 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
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
      ClassWriter classWriter0 = new ClassWriter((-844));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.version = (-1148);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-844), "", "", "*)\"5l5!s", (Object) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-25));
      classWriter0.index = (-1243);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2482), "Pu-a", "Pu-a", "Pu-a", "Pu-a");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-62));
      classWriter0.index = (-62);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-62), "org.apachecommons.io.filfilt/r.FalseF-leFilte", "org.apachecommons.io.filfilt/r.FalseF-leFilte", "org.apachecommons.io.filfilt/r.FalseF-leFilte", "org.apachecommons.io.filfilt/r.FalseF-leFilte");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-62));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-62), "org.apachecommons.io.filfilter.FalseFileFilte", "org.apachecommons.io.filfilter.FalseFileFilte", "org.apachecommons.io.filfilter.FalseFileFilte", "org.apachecommons.io.filfilter.FalseFileFilte");
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
      ClassWriter classWriter0 = new ClassWriter((-844));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "!{+GKvM", "*)\"5l5!s", (String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "}o", "}o", "", "");
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-844));
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "!{+GKvM", "*)\"5l5!s", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-44));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-44), "EZ", "EZ", "EZ", "EZ");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-44);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(808);
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "fO[(J]", "fO[(J]", "fO[(J]", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-1608);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "", "$V+8", "$V+8", dataInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-844));
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "!{+GKvM", "*)\"5l5!s", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("");
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
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-17));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "Synthetic", "'K>JJD\"y;1", "'K>JJD\"y;1", "Synthetic");
      fieldWriter0.visitAnnotation("wheel.asm.AnnotationWriter", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "Synthetic", "'K>JJD\"y;1", "'K>JJD\"y;1", "Synthetic");
      ByteVector byteVector0 = new ByteVector();
      classWriter0.visit(49, 166, "'K>JJD\"y;1", "uFoGB%\"!AQd?y", "|GX", (String[]) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-52));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-52), "EZ", "EZ", "EZ", "EZ");
      Attribute attribute0 = new Attribute("EZ");
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
      ClassWriter classWriter0 = new ClassWriter((-844));
      classWriter0.version = (-1148);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-844), "", "", "*)\"5l5!s", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-844));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "!{+GKvM", "*)\"5l5!s", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "Synthetic", "'K>JJD\"y;1", "'K>JJD\"y;1", "Synthetic");
      fieldWriter0.visitAnnotation("wheel.asm.AnnotationWriter", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-44));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-44), "EZ", "EZ", "EZ", "EZ");
      fieldWriter0.visitAnnotation("EZ", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-844));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "!{+GKvM", "*)\"5l5!s", (String) null, (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-844), "U", "", "*)\"5l5!s", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 309, "}o", "}o", "", "");
      fieldWriter0.visitEnd();
  }
}
