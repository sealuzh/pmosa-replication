/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 19:44:09 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter((-3170));
      classWriter0.index = (-15);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3170), ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3170));
      classWriter0.index = (-15);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3170), ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1829));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", (String) null, (Object) null);
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1853));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "void", "void", "void", "void");
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
      ClassWriter classWriter0 = new ClassWriter((-1851));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1851), "JSR/RE are no supported with computeFrames option", "JSR/RE are no supported with computeFrames option", "JSR/RE are no supported with computeFrames option", "JSR/RE are no supported with computeFrames option");
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
      ClassWriter classWriter0 = new ClassWriter((-1829));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", (String) null, (Object) null);
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
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3203));
      classWriter0.index = 65535;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3203), "rQ|AQ%", "rQ|AQ%", "rQ|AQ%", "rQ|AQ%");
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(174);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "vqi", "vqi", "Kf_2IFZ(sl[%GS9)", "vqi");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 174;
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
      ClassWriter classWriter0 = new ClassWriter(1684);
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3211));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "int", "int", "int", classWriter0);
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
      ClassWriter classWriter0 = new ClassWriter((-3204));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "int", "int", "int", "int");
      Attribute attribute0 = new Attribute("int");
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

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "`(j", "/4D)?qfzdc?", "/4D)?qfzdc?", (Object) null);
      fieldWriter0.visitAnnotation("=QWlyw%Ur^8=b[ iZ/2", true);
      Attribute attribute0 = new Attribute("`(j");
      byte[] byteArray0 = new byte[0];
      attribute0.value = byteArray0;
      ByteVector byteVector0 = attribute0.write(classWriter0, byteArray0, (-3198), (-635), 0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3160));
      classWriter0.version = (-3160);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3160), "rQPAe%", "rQPAe%", "rQPAe%", "rQPAe%");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1829));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1853));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "vo", "vo", "vo", "vo");
      fieldWriter0.visitAnnotation("vo", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-788));
      classWriter0.version = (-788);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-788), "Oq+),fN", "Oq+),fN", "Oq+),fN", "Oq+),fN");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3170));
      classWriter0.index = (-1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3170), ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3170));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3170), ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ");
      fieldWriter0.visitAnnotation("UH~;bKLLqc)hv#KY", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1853));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "void", "void", "void", "void");
      fieldWriter0.visitAnnotation("void", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1829));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3170));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3170), ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 36, ",$`O &CjQ", ",$`O &CjQ", ",$`O &CjQ", ",$c`O6&CjQ");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3198));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "`(j", "`(j", "`(j", (Object) null);
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3170));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3170), ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ", ",$c`O6&CjQ");
      Attribute attribute0 = new Attribute(",$c`O6&CjQ");
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
