/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 04:35:19 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-15));
      classWriter0.index = (-15);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-18));
      classWriter0.index = (-18);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
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
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Yn_}+_pw", "Yn_}+_pw", "Yn_}+_pw", "Yn_}+_pw");
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
      ClassWriter classWriter0 = new ClassWriter(304);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4103, "7DPL%h__l>w<", "7DPL%h__l>w<", "wheel.asm.FieldWriter", (Object) null);
      classWriter0.index = 131072;
      fieldWriter0.getSize();
      FieldWriter fieldWriter1 = (FieldWriter)classWriter0.visitField(22, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "java/lang/Objct", "7DPL%h__l>w<");
      fieldWriter1.getSize();
      // Undeclared exception!
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", false);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Yn_}H+_pw", "Yn_}H+_pw", "Yn_}H+_pw", "Yn_}H+_pw");
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
      ClassWriter classWriter0 = new ClassWriter(1427);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1427, " {gr5", " {gr5", " {gr5", " {gr5");
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute(" {gr5");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1388);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1388, " {gr5", " {gr5", " {gr5", " {gr5");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 1388;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      classWriter0.index = 262144;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(304);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4103, "oBhV7$-o+ELSYoi", "oBhV7$-o+ELSYoi", "oBhV7$-o+ELSYoi", (Object) null);
      classWriter0.index = 131072;
      fieldWriter0.getSize();
      classWriter0.visitField(22, "oBhV7$-o+ELSYoi", "oBhV7$-o+ELSYoi", "java/lang/Objct", "oBhV7$-o+ELSYoi");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 4103, "oBhV7$-o+ELSYoi", "7hahrcL_;", "oBhV7$-o+ELSYoi", "7hahrcL_;");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(830);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "wheel.asm.Item", (String) null, "wheel.asm.Item", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1366);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, " {gr5", " {gr5", " {gr5", " {gr5");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, " {gr5", " {gr5", " {gr5", fieldWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.FieldWriter@8
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1417);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1417, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), " {gr5", "'D3*wng*4", "StackMap", "StackMap");
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector(267386880);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1388);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, " {gr5", " {gr5", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(304);
      String[] stringArray0 = new String[0];
      classWriter0.visit(2335, 1, "{'X91S;r", "{'X91S;r", "{'X91S;r", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "7DPL%h__l>w<", "(!Whz$UyXFjb", "wheel.asm.FieldWriter", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, " {gr5", " {gr5", " {gr5", " {gr5");
      Attribute attribute0 = new Attribute(" {gr5");
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
      ClassWriter classWriter0 = new ClassWriter(304);
      String[] stringArray0 = new String[0];
      classWriter0.visit(2335, 1, "{'X91S;r", "{'X91S;r", "{'X91S;r", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "7DPL%h__l>w<", "(!Whz$UyXFjb", "wheel.asm.FieldWriter", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), " {gr5", "'D3*wng*4", "StackMap", "StackMap");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), " {gr5", "'D3*wng*4", "StackMap", "StackMap");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1388);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, " {gr5", " {gr5", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2940));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-268435456), "a|{/a*UB24", "a|{/a*UB24", " {gr5", "`{bcca+v<{*r5");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1440);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1440, " {gr5", " {gr5", " {gr5", " {gr5");
      Attribute attribute0 = new Attribute(" {gr5");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(1440);
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
