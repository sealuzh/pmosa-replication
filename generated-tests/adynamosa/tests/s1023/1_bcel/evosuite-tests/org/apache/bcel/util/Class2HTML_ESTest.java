/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 11:18:46 GMT 2019
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
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "&aX:`");
      String string0 = Class2HTML.referenceClass((byte)1);
      assertEquals("<A HREF=\"java.lang.Object_cp.html#cp1\" TARGET=ConstantPool>StringBuilder</A>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("-zip");
      assertEquals("<A HREF=\"-zip.html\" TARGET=_top>-zip</A>", string0);
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
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, ";>IS*y7+k");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-853));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: -853. Constant pool size is: 86
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<A HREF=\"<A HREF=\".html\" TARGET=_top></A>.html\" TARGET=_top><A HREF=\".html\" TARGET=_top><.A></A>";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "0ca|1uilo.wmJnU2w?X";
      stringArray0[1] = "-d";
      stringArray0[2] = "0ca|1uilo.wmJnU2w?X";
      stringArray0[3] = "#";
      stringArray0[4] = "0ca|1uilo.wmJnU2w?X";
      stringArray0[5] = "UMU[}Q";
      stringArray0[6] = "-d";
      stringArray0[7] = "#";
      stringArray0[8] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("<A HREF=\"5V\u0005kY5T^.html\" TARGET=_top>5V\u0005kY5T^</A>");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "5V\u0005kY5T^");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "^}d{A2$0di9*");
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
      String string0 = Class2HTML.toHTML("<HTML>\n<HEAD><TITLE>Documentation for ");
      assertEquals("&lt;HTML&gt;\\n&lt;HEAD&gt;&lt;TITLE&gt;Documentation for ", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[1] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      stringArray0[2] = "-zip";
      stringArray0[3] = "<A HREF=\"-zip.html\" TARGET=_top>-zip</A>";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // <A HREF=\"-zip.html\" TARGET=_top>-zip</A> (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[20];
      stringArray0[0] = "#";
      stringArray0[1] = "#";
      stringArray0[2] = "-d";
      stringArray0[3] = "0ca|1uilo.wmJnU2w?X";
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
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-d";
      stringArray0[1] = "#";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
      stringArray0[5] = "-d";
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "#";
      stringArray0[1] = "-d";
      stringArray0[2] = "0ca|1uilo.wmJnU2w?X/";
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
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-=uDs4@;i:";
      stringArray0[1] = "z5DmCn3:IV#+Ba[0L";
      stringArray0[2] = "&lt;HTML&gt;\n&lt;HEAD&gt;&lt;TITLE&gt;Documentation for ";
      stringArray0[3] = "-=uDs4@;i:";
      stringArray0[4] = "iconst_m1";
      stringArray0[5] = "-=uDs4@;i:";
      stringArray0[6] = "-=uDs4@;i:";
      stringArray0[7] = "wceEXvbo";
      stringArray0[8] = "java.nio.charset.Charset";
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
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<MockFileInputStream> class0 = MockFileInputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassName("d");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "Wg");
  }
}
