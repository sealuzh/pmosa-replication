/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 20:29:31 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-H/1yB7";
      stringArray0[1] = "-H/1yB7";
      Class2HTML.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "char");
      String string0 = Class2HTML.referenceClass(68);
      assertEquals("<A HREF=\"java.io.InputStream_cp.html#cp68\" TARGET=ConstantPool>Math</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("fload_3");
      assertEquals("<A HREF=\"fload_3.html\" TARGET=_top>fload_3</A>", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Class2HTML.referenceType("");
      assertEquals("<A HREF=\".html\" TARGET=_top></A>", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass(0);
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
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "t|e(j\"%u.GW`7");
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((byte)1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected class `CONSTANT_Class' at index 1 and got CONSTANT_Methodref[10](class_index = 15, name_and_type_index = 61)
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-1365));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "&gt;;fH8Q`r)41";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "int";
      stringArray0[1] = "5VD+T9*Vi_";
      stringArray0[2] = "-zip";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<String> class0 = String.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"");
      assertEquals("_cp.html\"\\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\"&gt;\\n&lt;FRAME NAME=\"Attributes\" SRC=\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = " but failed";
      stringArray0[1] = "G?S5x81elz?}v]U>RA<";
      stringArray0[2] = "short";
      stringArray0[3] = "_cp.html#cp";
      stringArray0[4] = " but failed";
      stringArray0[5] = "-zip";
      stringArray0[6] = "-zip";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // -zip (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = " but failed";
      stringArray0[1] = "G?S5x81elz?}v]U>RA<";
      stringArray0[2] = "short";
      stringArray0[3] = "_cp.html#cp";
      stringArray0[4] = " but failed";
      stringArray0[5] = "-zip";
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
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/performance/Dataset/gordon_scripts/projects/1_bcel");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-d";
      stringArray0[1] = "java.io.InputStream";
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("fload_3");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "java.lang.Throwable";
      stringArray0[1] = "-d";
      stringArray0[2] = "fload_3";
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
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "[C5petL(NHj";
      stringArray0[1] = "-d";
      stringArray0[2] = "_cp.html\"\n MARGINWIDTH=\"0\" MARGINHEIGHT=\"0\" FRAMEBORDER=\"1\" SCROLLING=\"AUTO\">\n<FRAME NAME=\"Attributes\" SRC=\"";
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
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-d";
      stringArray0[1] = "tR/";
      Class2HTML.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      javaClass0.setClassName("a^M`N Iw");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "J-@-Kt-I5 M/5(3");
  }
}