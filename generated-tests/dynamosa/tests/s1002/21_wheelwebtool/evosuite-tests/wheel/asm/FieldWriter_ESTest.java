/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 23:50:07 GMT 2019
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
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.version = 59273;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "", "", "Deprecated", "Deprecated");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2163));
      classWriter0.index = (-2163);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2163), "0Um=j F~wv1d{'zBw", "", "0Um=j F~wv1d{'zBw", "(`X<");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.version = 59273;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "", "", "Deprecated", "Deprecated");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2163));
      classWriter0.index = (-2163);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2163), "0Um=j F~wv1d{'zBw", "", "0Um=j F~wv1d{'zBw", "(`X<");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "00SUm=j F~wv1d{'zBw", "00SUm=j F~wv1d{'zBw", "00SUm=j F~wv1d{'zBw", "00SUm=j F~wv1d{'zBw");
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
      ClassWriter classWriter0 = new ClassWriter(84);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 84, "T2BZAD", "T2BZAD", "T2BZAD", "T2BZAD");
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
      ClassWriter classWriter0 = new ClassWriter(91);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "l", "l", "l", "l");
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
      ClassWriter classWriter0 = new ClassWriter(127);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "Deprecated", "", (String) null, "Deprecated");
      ByteVector byteVector0 = new ByteVector(28);
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(36);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[0];
      byteVector0.data = byteArray0;
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
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777218);
      classWriter0.index = 16777218;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1544), "org.apache.commons.io.filefilter.AgeFileFilter", "", "org.apache.commons.io.filefilter.AgeFileFilter", "");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212676);
      classWriter0.index = 285212676;
      classWriter0.visitInnerClass("M:u|7e<C", "?eF5#(", "?eF5#(", (-3684));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 285212676, "ConstantValue", "", "", "ConstantValue");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "SourceDebugExtension", (String) null, (String) null, classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2173));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "(`X<", "(`X<", "(`X<", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(8);
      byte[] byteArray0 = new byte[0];
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(127);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "Deprecated", "", (String) null, "Deprecated");
      ByteVector byteVector0 = new ByteVector(28);
      Attribute attribute0 = new Attribute((String) null);
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
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(127);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "Deprecated", "", (String) null, "Deprecated");
      ByteVector byteVector0 = new ByteVector(28);
      fieldWriter0.visitAnnotation("Deprecated", false);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1548), "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8");
      classWriter0.version = 49;
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 626, "-'pvI}Cox:FFaJ/{", "d", "d", (Object) null);
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2162), "RuntimeVisibleAnnotations", "ConstantValue", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "0Um=j F~wv1d{'zBw", "0Um=j F~wv1d{'zBw", "0Um=j F~wv1d{'zBw", "0Um=j F~wv1d{'zBw");
      fieldWriter0.visitAnnotation("0Um=j F~wv1d{'zBw", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1548), "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8");
      classWriter0.version = 49;
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(127);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-5), "Deprecated", "", (String) null, "Deprecated");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 626, "-'pvI}Cox:FFaJ/{", "d", "d", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(51);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "0-= lCF]wv1dR'zBw", "0-= lCF]wv1dR'zBw", "0-= lCF]wv1dR'zBw", "0-= lCF]wv1dR'zBw");
      fieldWriter0.visitAnnotation("0-= lCF]wv1dR'zBw", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1548), "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 626, "-'pvI}Cox:FFaJ/{", "d", "d", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-706), "LocalVariableTable", ".{", "RuntimeVisibleParameterAnnotations", "RuntimeVisibleParameterAnnotations");
      fieldWriter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1548), "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8", "[`?tS;:?8");
      Attribute attribute0 = new Attribute("");
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
