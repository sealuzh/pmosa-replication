/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 14:15:42 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-2418));
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2418), "Sy~taghe;ic", "Sy~taghe;ic", "Sy~taghe;ic", "Sy~taghe;ic");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2457));
      classWriter0.index = (-2457);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2457), "bNLg(IyW(", "bNLg(IyW(", "bNLg(IyW(", "bNLg(IyW(");
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2418));
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2418), "Sy~taghe;ic", "Sy~taghe;ic", "Sy~taghe;ic", "Sy~taghe;ic");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2457));
      classWriter0.index = (-2457);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Synthetic", "Synthetic", "Synthetic", "Synthetic");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1684);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "Z'8e,lPkDzv)", "Jh-zwJO");
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
      ClassWriter classWriter0 = new ClassWriter(1684);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2416), "", "", "Deprecated", "");
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
      ClassWriter classWriter0 = new ClassWriter(1665);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1498, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2490));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-2490);
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2457));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "2!6#bC ,M+_s&YW", "2!6#bC ,M+_s&YW", "2!6#bC ,M+_s&YW", "2!6#bC ,M+_s&YW");
      classWriter0.index = 131072;
      fieldWriter0.getSize();
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-3487), "LN", "R|pObVFk", "?vg-FD?]o.=>", "?vg-FD?]o.=>");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1684);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 3252, "Fo", "", ";qH+~gsH3hW4~))K", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@4f3a69db
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1498, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
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
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2457));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2457), "Synthetic", "Synthetic", "Synthetic", "Synthetic");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("Synthetic", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1684);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, ";qH+~gsH3hW4~)K", "", "", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2457));
      classWriter0.version = 3;
      classWriter0.version = 63079;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2457), "Synthetic", "Synthetic", "Synthetic", "Synthetic");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(821);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Sythetc", "Sythetc", "Sythetc", "Sythetc");
      Attribute attribute0 = new Attribute("Sythetc");
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
      ClassWriter classWriter0 = new ClassWriter(1501);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, ";qH+~gsH3hW4~)K", "Jh-zwJO", "1G0a$GDCCG~", "Jh-zwJO");
      fieldWriter0.visitAnnotation("9", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "T-", "T-", "T-", "T-");
      fieldWriter0.visitAnnotation("T-", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2457));
      classWriter0.version = 3;
      classWriter0.version = 63079;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2457), "Synthetic", "Synthetic", "Synthetic", "Synthetic");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1498, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1684);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1729), "", ";qH+~gsH3hW4~))K", "", "");
      fieldWriter0.visitEnd();
  }
}
