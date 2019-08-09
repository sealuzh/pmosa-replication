/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 02:10:51 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-1315));
      classWriter0.index = (-1923);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1315), "org.apache.commons.io.filefilter.AndFileFilter", ":]s?\u0004Jc", ":]s?\u0004Jc", "org.apache.commons.io.filefilter.AndFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1315));
      classWriter0.index = (-1923);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1315), "org.apache.commons.io.filefilter.AndFileFilter", ":]s?\u0004Jc", ":]s?\u0004Jc", "org.apache.commons.io.filefilter.AndFileFilter");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
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
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1304));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :XocsZR", "\" :XocsZR", "\" :XocsZR", (Object) null);
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
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(Integer.MAX_VALUE);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, Integer.MAX_VALUE, "Runti&eInvisib&eParameterAnnotations", "Runti&eInvisib&eParameterAnnotations", "Runti&eInvisib&eParameterAnnotations", "Runti&eInvisib&eParameterAnnotations");
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
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1277));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      Attribute attribute0 = new Attribute("\" :TopsZR");
      fieldWriter0.visitAttribute(attribute0);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1277), "\" :TopsZR", "\" :TopsZR", "heel.asm.FieldWritr", (Object) null);
      fieldWriter1.next = fieldWriter0;
      fieldWriter1.next.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(256);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1249));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "w :opsZR", "w :opsZR", "w :opsZR", "w :opsZR");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 2418;
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, (String) null, "\" :TopsZR", "\" :TopsZR", classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1251));
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 64455;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", classWriter0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations", "RuntimeInvisibleParameterAnnotations");
      fieldWriter0.visitAnnotation("RuntimeInvisibleParameterAnnotations", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1290));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "*B?7Zl%S[hYV9(j", "*B?7Zl%S[hYV9(j", (String) null, "*B?7Zl%S[hYV9(j");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      ByteVector byteVector0 = new ByteVector(2);
      classWriter0.version = (-490);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-490), "Ac9}Lq?[|(", "Ac9}Lq?[|(", "\":To5ZR", "\":To5ZR");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1277));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      ByteVector byteVector0 = new ByteVector(256);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1294));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1294), "-D", "-D", "-D", "-D");
      Attribute attribute0 = new Attribute("-D");
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
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "]|<B2tN$XVz3i=W", "", "", "");
      fieldWriter0.visitAnnotation("]|<B2tN$XVz3i=W", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      classWriter0.version = (-490);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-490), "Ac9}Lq?[|(", "Ac9}Lq?[|(", "\":To5ZR", "\":To5ZR");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1277));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1277));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      fieldWriter0.visitAnnotation("\" :TopsZR", true);
      ByteVector byteVector0 = new ByteVector(256);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(624);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 105, "", "m\"kZ)nZf:W+nh^", "a3?w\"k&~,{%G", (Object) null);
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1290));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "*B?7Zl%S[hYV9(j", "*B?7Zl%S[hYV9(j", (String) null, "*B?7Zl%S[hYV9(j");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(826);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, ",\" ", ",\" ", "", "");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1277));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      Attribute attribute0 = new Attribute("\" :TopsZR");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(256);
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