/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 07:19:16 GMT 2019
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "wV7N:B}|gY4i} ";
      stringArray0[1] = "#A>";
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
  public void test01()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.referenceType("<A HREF=\".html\" TARGET=_top></A>");
      assertEquals("<A HREF=\"<A HREF=\".html\" TARGET=_top></A>.html\" TARGET=_top><A HREF=\".html\" TARGET=_top><.A></A>", string0);
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
        Class2HTML.referenceClass((-2075));
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-zip";
      stringArray0[2] = "-zip";
      stringArray0[4] = "-zip";
      stringArray0[6] = "-zip";
      stringArray0[8] = "-zip";
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
  public void test11()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, (String) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>");
      assertEquals("_methods.html\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;/FRAMESET&gt;&lt;/FRAMESET&gt;&lt;/HTML&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-zip";
      stringArray0[1] = "`(E4|Ea{V";
      stringArray0[2] = "<A HREF=\"`(E4|Ea{V.html\" TARGET=_top>`(E4|Ea{V</A>";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // `(E4|Ea{V (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "k9(Hn2fG2RU+66/d/m";
      stringArray0[1] = "k9(Hn2fG2RU+66/d/m";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/performance/Dataset/gordon_scripts/projects/1_bcel");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, true);
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-d";
      stringArray0[1] = "-d";
      stringArray0[2] = "|V)&>w;Y8xH<fUf=X";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d";
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "kz9(n2fGRU+6;d/";
      stringArray0[1] = "kz9(n2fGRU+6;d/";
      stringArray0[2] = "-d";
      stringArray0[3] = "kz9(n2fGRU+6;d/";
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
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-zip";
      stringArray0[2] = "<A HREF=\"`(E4|Ea{V.html\" TARGET=_top>`(E4|Ea{V</A>";
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-ip";
      stringArray0[1] = "-ip";
      stringArray0[2] = "-ip";
      stringArray0[3] = "-ip";
      Class2HTML.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassPath classPath0 = new ClassPath("java.util.regex.Matcher");
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<PipedInputStream> class0 = PipedInputStream.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "to=]!F-_iyp)1S%QaO");
      String string0 = Class2HTML.referenceClass(1);
      assertEquals("<A HREF=\"java.io.PipedInputStream_cp.html#cp1\" TARGET=ConstantPool>PipedInputStream</A>", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassPath classPath0 = ClassPath.SYSTEM_CLASS_PATH;
      ClassPathRepository classPathRepository0 = new ClassPathRepository(classPath0);
      Class<String> class0 = String.class;
      JavaClass javaClass0 = classPathRepository0.loadClass(class0);
      javaClass0.setClassName("-^");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "java.lang.String$1");
  }
}