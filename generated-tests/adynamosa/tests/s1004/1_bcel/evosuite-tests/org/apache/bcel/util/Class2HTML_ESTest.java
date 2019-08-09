/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 03:07:15 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.PipedInputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.ClassPath;
import org.apache.bcel.util.ClassPathRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.referenceType("<A HREF=\"");
      assertEquals("<A HREF=\"<A HREF=\".html\" TARGET=_top><A HREF=\"</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-2740));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      ClassPathRepository classPathRepository0 = new ClassPathRepository((ClassPath) null);
      Class<PipedInputStream> class0 = PipedInputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "\" TARGET=Code>Byte code</A></LI></UL>\n");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(590);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 590. Constant pool size is: 177
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ArSN9P;";
      stringArray0[1] = "<A HREF=\"ArSN9P;.html\" TARGET=_top>ArSN9P;</A>";
      stringArray0[2] = "ArSN9P;";
      stringArray0[3] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = ".";
      stringArray0[1] = "1-]-";
      stringArray0[2] = "-d";
      stringArray0[3] = ".";
      stringArray0[4] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Class2HTML.toHTML("\" TARGET=Code>Byte code</A></LI></UL>\n");
      assertEquals("\" TARGET=Code&gt;Byte code&lt;/A&gt;&lt;/LI&gt;&lt;/UL&gt;\\n", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "l@g<JE4K>GM?";
      stringArray0[1] = "l@g<JE4K>GM?";
      stringArray0[2] = "l@g&lt;JE4K&gt;GM?";
      stringArray0[3] = "l@g<JE4K>GM?";
      stringArray0[4] = "-zip";
      stringArray0[5] = "l@g&lt;JE4K&gt;GM?";
      stringArray0[6] = "l@g&lt;JE4K&gt;GM?";
      stringArray0[7] = "l@g<JE4K>GM?";
      stringArray0[8] = "l@g&lt;JE4K&gt;GM?";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // l@g&lt;JE4K&gt;GM? (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("r{pw=7gE$&gt;21PZzR3");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-d";
      stringArray0[1] = "r{pw=7gE$&gt;21PZzR3";
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
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[26];
      stringArray0[0] = "+B2^j%nql";
      stringArray0[1] = "-d";
      stringArray0[2] = "/";
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
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<A HREF=\"l@g<JE4K>GM?.html\" TARGET=_top>l@g<JE4K>GM?</A>";
      stringArray0[1] = "<A HREF=\"l@g<JE4K>GM?.html\" TARGET=_top>l@g<JE4K>GM?</A>";
      stringArray0[2] = "-Y";
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
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O-lL,v.0$X1QA-(";
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
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassName("\n");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "\n");
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "g{&;-e;:|]ZWe{8!g");
      String string0 = Class2HTML.referenceClass(10);
      assertEquals("<A HREF=\"java.lang.Object_cp.html#cp10\" TARGET=ConstantPool>IllegalArgumentException</A>", string0);
  }
}
