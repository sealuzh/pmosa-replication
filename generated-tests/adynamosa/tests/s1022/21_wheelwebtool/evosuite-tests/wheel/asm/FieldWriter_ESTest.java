/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 10:31:54 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dn&P*l8a", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      classWriter0.version = (-1168);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      classWriter0.index = (-1168);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dnVP*l8a", "dnVP*l8a", "dnVP*l8a", "dnVP*l8a");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dn&P*l8a", "", "", "");
      classWriter0.version = (-1168);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      classWriter0.index = (-1168);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dnVP*l8a", "dnVP*l8a", "dnVP*l8a", "dnVP*l8a");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2552));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2552), "!PIF]Dv9\"", "!PIF]Dv9\"", "!PIF]Dv9\"", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(20);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-764), "", "Synthetic", "5#T&;!Z>g?Wi^6%", "5#T&;!Z>g?Wi^6%");
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
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 340, "dn&P*l8a", "dn&P*l8a", "dn&P*l8a", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(20);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (byte)2, "mkz[BR$_inzM#HL", "org.apache.commons.io.filefilter.WildcardFileFilter", " )AfL;", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@3f19007e
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dn&P*l8a", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("dn&P*l8a");
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "dn&P*l8a", "", (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "dn&P*l8a", "", (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.visitAnnotation("wheel.asm.FieldWriter", true);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(227);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "rbn3", "rbn3", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1677), "fn&$*l8a", "fn&$*l8a", "fn&$*l8a", "fn&$*l8a");
      ByteVector byteVector0 = new ByteVector(196);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "fn&$*l8a";
      stringArray0[1] = "fn&$*l8a";
      stringArray0[2] = "EU.(";
      stringArray0[3] = "]";
      stringArray0[4] = "EU.(";
      stringArray0[5] = "]";
      stringArray0[6] = "fn&$*l8a";
      stringArray0[7] = "EU.(";
      stringArray0[8] = "fn&$*l8a";
      classWriter0.visit(49, 2767, "fn&$*l8a", "EU.(", "]", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "d&*8a", "d&*8a", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1677), "fn&$*l8a", "fn&$*l8a", "fn&$*l8a", "fn&$*l8a");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "fn&$*l8a";
      stringArray0[1] = "fn&$*l8a";
      stringArray0[2] = "EU.(";
      stringArray0[3] = "]";
      stringArray0[4] = "EU.(";
      stringArray0[5] = "]";
      stringArray0[6] = "fn&$*l8a";
      stringArray0[7] = "EU.(";
      stringArray0[8] = "fn&$*l8a";
      classWriter0.visit(49, 2767, "fn&$*l8a", "EU.(", "]", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "dn&P*l8a", "", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "dn&P*l8a", "", (Object) null);
      fieldWriter0.visitAnnotation("wheel.asm.FieldWriter", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(227);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "rbn3", "rbn3", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dn&P*l8a", ";F", ";F", ";F");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1677), "dn&P*l8a", "Deprecated", "Deprecated", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 167, "The FileFilter must not be null", "org.apache.commons.io.filefilter.WildcardFileFilter", "jd", "mkz[BR$_inzM#HL");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(196);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1168), "dn&P*l8a", "", "", "");
      Attribute attribute0 = new Attribute("dn&P*l8a");
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
