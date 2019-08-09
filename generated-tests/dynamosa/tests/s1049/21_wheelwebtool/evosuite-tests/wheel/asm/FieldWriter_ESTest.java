/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 07:59:44 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(2);
      classWriter0.index = (-453);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "b%(5H.x!{_@", "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "W/";
      stringArray0[1] = "Signature";
      stringArray0[2] = "Signature";
      stringArray0[3] = "Signature";
      stringArray0[4] = "dj=72o";
      stringArray0[5] = "Signature";
      stringArray0[6] = "";
      classWriter0.visit(49, (-2090), "org.apache.commons.io.filefilter.FalseFileFilter", (String) null, "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4508, "dj=72o", "EuT]:&hRe-", "wheel.asm.Frame", "Signature");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      ByteVector byteVector0 = new ByteVector();
      classWriter0.index = (-2088);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4, "RuntimeeisibleAn(otations", "org.apache.commons.io.filefilter.FalseFileFilter", (String) null, "ConstantValue");
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      String[] stringArray0 = new String[7];
      stringArray0[0] = "W/";
      stringArray0[1] = "Signature";
      stringArray0[2] = "Signature";
      stringArray0[3] = "Signature";
      stringArray0[4] = "dj=72o";
      stringArray0[5] = "Signature";
      stringArray0[6] = "";
      classWriter0.visit(49, (-2090), "org.apache.commons.io.filefilter.FalseFileFilter", (String) null, "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4508, "dj=72o", "EuT]:&hRe-", "wheel.asm.Frame", "Signature");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      classWriter0.index = (-2088);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4, "RuntimeeisibleAn(otations", "org.apache.commons.io.filefilter.FalseFileFilter", (String) null, "ConstantValue");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "LocalVariableTable", "ConstantValue", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-1071));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "[)D", " v^B{*3Wc[k-<%=<", "N~5T#/d_;p-3Z!Wuk%)", "[)D");
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
      ClassWriter classWriter0 = new ClassWriter(37);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.apache.ommons.io.filefilter.FileFileFilter", "org.apache.ommons.io.filefilter.FileFileFilter", "org.apache.ommons.io.filefilter.FileFileFilter", "org.apache.ommons.io.filefilter.FileFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-823);
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
      ClassWriter classWriter0 = new ClassWriter(47);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, (String) null, (String) null, (String) null, classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1449));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Synthetic", "Synthetic", "Synthetic", "Synthetic");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, (-1449), "Synthetic", "Synthetic", "Synthetic", fieldWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.FieldWriter@8
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "LocalVariableTable", "ConstantValue", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("+;W{:!5TdyA#");
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
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "LocalVriableTble", "ConstantValue", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "1Gxg,z", "V\"X", "V\"X", "V\"X");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("V\"X", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-176), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "LocalVariableTable", "ConstantValue");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1078));
      classWriter0.version = (-1078);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "~}}/iFoeJQ4Py", "1B{3NW;UtO ", "1B{3NW;UtO ", "~}}/iFoeJQ4Py");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "~}$/iFoek*4Py", "~}$/iFoek*4Py", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("~}$/iFoek*4Py");
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
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-176), "org.apache.commons.io.filefilter.FalseFileFilter", "org.apache.commons.io.filefilter.FalseFileFilter", "LocalVariableTable", "ConstantValue");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1078));
      classWriter0.version = (-1078);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "~}}/iFoeJQ4Py", "1B{3NW;UtO ", "1B{3NW;UtO ", "~}}/iFoeJQ4Py");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "1Gxg,z", "V\"X", "V\"X", "V\"X");
      fieldWriter0.visitAnnotation("V\"X", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "LocalVriableTble", "ConstantValue", (Object) null);
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-176));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "LocalVriableTble", "ConstantValue", (Object) null);
      fieldWriter0.visitEnd();
  }
}