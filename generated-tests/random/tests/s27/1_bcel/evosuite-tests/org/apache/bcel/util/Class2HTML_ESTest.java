/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:28:21 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.apache.bcel.util.MemorySensitiveClassPathRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Class2HTML.toHTML("lstore_3");
      assertEquals("lstore_3", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.referenceType("<A HREF=\"");
      assertEquals("<A HREF=\"<A HREF=\".html\" TARGET=_top><A HREF=\"</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceType((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(251);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("org.apache.bcel.util.Class2HTML");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      JavaClass javaClass0 = classPathRepository0.loadClass("org.apache.bcel.util.Class2HTML");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "org.apache.bcel.util.Class2HTML");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance((ClassPath) null);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "-d");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-zip";
      stringArray0[1] = "|.1ZO";
      stringArray0[2] = "-d";
      stringArray0[3] = ";]`4f";
      stringArray0[4] = "Fm0]3";
      stringArray0[5] = "r&BF93M-p2";
      stringArray0[6] = "M";
      stringArray0[7] = "d/O";
      stringArray0[8] = "boolean";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // |.1ZO (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "CONSTANT_Float";
      stringArray0[1] = "<A HREF=\"";
      stringArray0[2] = "-4";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[13];
      stringArray0[0] = "%h";
      stringArray0[1] = "%h";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "<A HREF=\"I/24l\"aaKBmB?X _f^.html\" TARGET=_top>I.24l\"aaKBmB?X _f^</A>";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "\b";
      stringArray0[5] = "-d";
      stringArray0[6] = "-d";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("z*");
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      javaClass0.setClassName("v=qWBV");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "z*");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("z*");
      MemorySensitiveClassPathRepository memorySensitiveClassPathRepository0 = new MemorySensitiveClassPathRepository(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = memorySensitiveClassPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "z*");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 2 and got CONSTANT_Methodref[10](class_index = 1, name_and_type_index = 58)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }
}
