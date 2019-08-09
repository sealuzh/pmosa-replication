/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 08:05:05 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "[JHx{I8P");
      String string0 = Class2HTML.referenceClass(10);
      assertEquals("<A HREF=\"java.lang.Object_cp.html#cp10\" TARGET=ConstantPool>IllegalArgumentException</A>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("W$RL7");
      assertEquals("<A HREF=\"W$RL7.html\" TARGET=_top>W$RL7</A>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-1163));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.toHTML((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "[JHx{I8P");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(1128);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 1128. Constant pool size is: 86
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".r!=p\"*o&}td";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassPathRepository classPathRepository0 = new ClassPathRepository((ClassPath) null);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "&lt;A HREF=\"-2a1(SVbV&lt;,R.html\" TARGET=_top&gt;-2a1(SVbV&lt;,R&lt;/A&gt;");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
      assertEquals("_cp.html\"\\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\"&gt;\\n&lt;FRAME NAME=\"Attributes\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-zip";
      stringArray0[1] = "-4a1(SbPV<,R";
      stringArray0[2] = "w{T#";
      stringArray0[3] = "java.util.Locale";
      stringArray0[4] = "h/A>";
      stringArray0[5] = "nGc\"@Xi9";
      stringArray0[6] = "java.lang.Object";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // -4a1(SbPV<,R (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-2a1(SVbV<,R";
      Class2HTML.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-d";
      stringArray0[1] = "The offset cannot be negative";
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-d";
      stringArray0[1] = "The offset cannot be negative";
      stringArray0[2] = "<init>";
      stringArray0[3] = "-d";
      stringArray0[4] = "iconst_5";
      stringArray0[5] = "-d";
      stringArray0[6] = "nP.no8y3}S7n,+zx:D%";
      stringArray0[7] = "-d";
      stringArray0[8] = "The offset cannot be negative";
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
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "iconst_5";
      stringArray0[1] = "iconst_5";
      stringArray0[2] = "iconst_5";
      stringArray0[3] = "-d";
      stringArray0[4] = "-/";
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
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "&lt;A HREF=\"-2a1(SVbV&lt;,R.html\" TARGET=_top&gt;-2a1(SVbV&lt;,R&lt;/A&gt;";
      stringArray0[1] = "<A HREF=\"-2a1(SVbV<,R.html\" TARGET=_top>-2a1(SVbV<,R</A>";
      stringArray0[2] = "-2a1(SVbV<,R";
      stringArray0[3] = "<TD>";
      stringArray0[4] = "&lt;A HREF=\"-2a1(SVbV&lt;,R.html\" TARGET=_top&gt;-2a1(SVbV&lt;,R&lt;/A&gt;";
      stringArray0[5] = "-2a1(SVbV<,R";
      stringArray0[6] = "<A HREF=\"-2a1(SVbV<,R.html\" TARGET=_top>-2a1(SVbV<,R</A>";
      stringArray0[7] = "-2a1(SVbV<,R";
      stringArray0[8] = "&lt;A HREF=\"-2a1(SVbV&lt;,R.html\" TARGET=_top&gt;-2a1(SVbV&lt;,R&lt;/A&gt;";
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
  public void test21()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      javaClass0.setClassName("ae&7+");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "-/");
  }
}