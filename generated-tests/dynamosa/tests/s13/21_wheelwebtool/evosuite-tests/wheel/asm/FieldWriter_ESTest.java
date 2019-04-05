/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 23:21:03 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4230);
      classWriter0.visit(4230, 4230, "SKB", "SKB", "SKB", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4230, "SKB", "SKB", "SKB", "SKB");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2782);
      classWriter0.index = (-895);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2782, "ty<v,]Sp.]0pbvA#k", "ty<v,]Sp.]0pbvA#k", (String) null, "ty<v,]Sp.]0pbvA#k");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2707);
      classWriter0.index = (-487);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "x$;lx&Un>;", "x$;lx&Un>;", "x$;lx&Un>;", "x$;lx&Un>;");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "q;=t";
      classWriter0.visit(49, (-1), "q;=t", "", "t4]tIo(Aofjde)7w", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "t4]tIo(Aofjde)7w", "The wildcard list must not be null", (String) null, "The wildcard list must not be null");
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-805), "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE");
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
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-805), "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE");
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
      ClassWriter classWriter0 = new ClassWriter(11);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k");
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
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k");
      Attribute attribute0 = new Attribute("ty<v,]Sp.]0pbv#k");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "dy<v,]SpP]0pv#Q", "dy<v,]SpP]0pv#Q", "dy<v,]SpP]0pv#Q", "dy<v,]SpP]0pv#Q");
      ByteVector byteVector0 = new ByteVector(1);
      byteVector0.length = (-958);
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
      ClassWriter classWriter0 = new ClassWriter((-2356));
      classWriter0.index = 65535;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2356), "java/lang/String", "v /ct}J>&K: `Z8ZRSU", (String) null, "yie$M&zA(jxE");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
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
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", fieldWriter0);
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
      ClassWriter classWriter0 = new ClassWriter((-7));
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putShort(36);
      byteVector1.length = 65532;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 8, "'S=KB", "46F+S%=pAEB", (String) null, (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k", "ty<v,]Sp.]0pbv#k");
      Attribute attribute0 = new Attribute("ty<v,]Sp.]0pbv#k");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
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
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-805), "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE");
      fieldWriter0.visitAnnotation("CSWuLl,G)fJu", false);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-805), "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE");
      fieldWriter0.visitAnnotation("CSWuLl,G)fJu", true);
      ByteVector byteVector0 = new ByteVector(8);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4234);
      classWriter0.visit(49, 49, "SKB", "SKB", "SKB", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4234, "SKB", "SKB", "SKB", "SKB");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-637), "Ufw:vx}{1jDz9IX", "Ufw:vx}{1jDz9IX", "qR", (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4230);
      classWriter0.visit(51, 51, "SKB", "SKB", "SKB", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4230, "SKB", "SKB", "SKB", "SKB");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3375), "wheel.asm.FieldWriter", "q;=t", "k", "-");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-805), "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE");
      fieldWriter0.visitAnnotation("CSWuLl,G)fJu", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3375), "wheel.asm.FieldWriter", "q;=t", "k", "-");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-637), "Ufw:vx}{1jDz9IX", "Ufw:vx}{1jDz9IX", "qR", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-805), "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE", "d|WcXD'5qaWE");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3375), "wheel.asm.FieldWriter", "q;=t", "k", "-");
      Attribute attribute0 = new Attribute("+,aWYxIdJB)7u\u0000Y");
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
}