/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:59:06 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(2362);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 49, "(gjV?4D:4vY", "(gjV?4D:4vY", (String) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@215c2f3f
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(455);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "Deprecated", "", "", (Object) null);
      Attribute attribute0 = new Attribute("");
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
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(455);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "Deprecated", "", "", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("Deprecated", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-27));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-261), "org.apache.commons.io.filefilter.NotFileFilter", "_/UX", "ConstantValue", "_/UX");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilter.NotFileFilter", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1384));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAAAAABCKLLDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIDNOAAAAAAGGGGGGGHAFBFAAFFAAQPIIJJIIIIIIIIIIIIIIIIII", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-27));
      classWriter0.version = (-1492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-261), "org.apache.commons.io.filefilter.NotFileFilter", "_/UX", "ConstantValue", "_/UX");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-607), "?%U?[47.)+Z|kF", "?%U?[47.)+Z|kF", "}p-$>lr,mLg~tJ~7", "}p-$>lr,mLg~tJ~7");
      fieldWriter0.visitAnnotation("}p-$>lr,mLg~tJ~7", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-27));
      classWriter0.version = (-1492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-261), "org.apache.commons.io.filefilter.NotFileFilter", "_/UX", "ConstantValue", "_/UX");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2817);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "wheel.asm.FieldWriter", "ConstantValue", "ConstantValue");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(455);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "Deprecated", "", "", (Object) null);
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1082));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-594), "4|C;?7-", "4|C;?7-", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2817);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "wheel.asm.FieldWriter", "ConstantValue", "ConstantValue");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2817, "+^ECM?9U", "ConstantValue", "ConstantValue", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-607), "?%U?[47.)+Z|kF", "?%U?[47.)+Z|kF", "}p-$>lr,mLg~tJ~7", "}p-$>lr,mLg~tJ~7");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-248));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-607), "?%U?[47.)+Z|kF", "?%U?[47.)+Z|kF", "}p-$>lr,mLg~tJ~7", "}p-$>lr,mLg~tJ~7");
      Attribute attribute0 = new Attribute("}p-$>lr,mLg~tJ~7");
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
