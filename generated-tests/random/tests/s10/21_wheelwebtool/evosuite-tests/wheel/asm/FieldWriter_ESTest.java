/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:49:55 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 256, "e]/R", "", "", (Object) null);
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
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ClassWriter classWriter0 = new ClassWriter((byte) (-96));
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-96), (-3239));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (byte) (-96), "", "", (String) null, byteArrayInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.ByteArrayInputStream@60ac4092
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "@%M&-E)", "@%M&-E)", "7NBw*yLpB@x", "7NBw*yLpB@x");
      Attribute attribute0 = new Attribute("7NBw*yLpB@x");
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
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3105));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3105), "\";6#~tH?eb+)JD", "The wildcard array must not be null", "System", "The wildcard array must not be null");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.visitAnnotation("System", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 256, "e]/R", "", "", (Object) null);
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector(256);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3105));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3105), "\";6#~tH?eb+)JD", "The wildcard array must not be null", "System", "The wildcard array must not be null");
      fieldWriter0.visitAnnotation("System", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3105));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3105), "\";6#~tH?eb+)JD", "The wildcard array must not be null", "System", "The wildcard array must not be null");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(294);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1561, "dYY", "dYY", "dYY", "dYY");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 256, "e]/R", "", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 256, "e]/R", "", "", (Object) null);
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-551));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-551), "RuntimeInvisibleAnnotations", "-srq|[/IQza>cH7\"", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "+ZH:\"E", "+ZH:\"E", "+ZH:\"E", "+ZH:\"E");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.visitField((-64), "F4Ff oV{|phO~h37nc", "/hf*E^x74t[08k_", "F4Ff oV{|phO~h37nc", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@5e147708
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3105));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3105), "\";6#~tH?eb+)JD", "The wildcard array must not be null", "System", "The wildcard array must not be null");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(294);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1561, "dYY", "dYY", "dYY", "dYY");
      Attribute attribute0 = new Attribute("dYY");
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
