/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 18:35:51 GMT 2019
 */

package org.apache.bcel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.Class2HTML;
import org.apache.bcel.util.ClassLoaderRepository;
import org.apache.bcel.util.SyntheticRepository;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Class2HTML_ESTest extends Class2HTML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("T8K)A<ElV]", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      javaClass0.dump((OutputStream) mockPrintStream0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "T8K)A<ElV]";
      stringArray0[1] = "cskdy7)_";
      stringArray0[2] = "cskdy7)_";
      stringArray0[3] = "cskdy7)_";
      stringArray0[4] = "cskdy7)_";
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
  public void test01()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<Object> class0 = Object.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "H3mIZHc@;");
      String string0 = Class2HTML.referenceClass((byte)1);
      assertEquals("<A HREF=\"java.lang.Object_cp.html#cp1\" TARGET=ConstantPool>StringBuilder</A>", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Class2HTML.toHTML("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Class2HTML.referenceType("n\"");
      assertEquals("<A HREF=\"n\".html\" TARGET=_top>n\"</A>", string0);
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
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Class2HTML.referenceClass((-1425));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Class2HTML.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, " skipped");
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
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("java.nio.channels.FileChannel");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "72{_$");
      stringArray0[0] = "java.nio.channels.FileChannel";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.nio.channels.FileChannel is not a Java .class file
         //
         verifyException("org.apache.bcel.classfile.ClassParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-d";
      // Undeclared exception!
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.bcel.util.Class2HTML", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("1");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "1");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      Class<InputStream> class0 = InputStream.class;
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Constant[] constantArray0 = new Constant[5];
      ConstantPool constantPool0 = new ConstantPool(constantArray0);
      javaClass0.setConstantPool(constantPool0);
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, ".html\" TARGET=_top>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid constant pool reference: 27. Constant pool size is: 5
         //
         verifyException("org.apache.bcel.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML((JavaClass) null, "^<8qc\"LP3l\"#");
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
      Class<InputStream> class0 = InputStream.class;
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nulljava.io.InputStream_methods.html");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass(class0);
      Class2HTML class2HTML0 = null;
      try {
        class2HTML0 = new Class2HTML(javaClass0, (String) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
      ClassLoaderRepository classLoaderRepository0 = new ClassLoaderRepository(classLoader0);
      JavaClass javaClass0 = classLoaderRepository0.loadClass("java.lang.Class");
      javaClass0.setClassName("GUK!C-/KPjk;");
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "<A HREF=\"java.lang.Class.html\" TARGET=_top>Class</A>");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Class2HTML.toHTML("_methods.html\"\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\">\n</FRAMESET></FRAMESET></HTML>");
      assertEquals("_methods.html\"\\n MARGINWIDTH=0 MARGINHEIGHT=0 FRAMEBORDER=1 SCROLLING=\"AUTO\"&gt;\\n&lt;/FRAMESET&gt;&lt;/FRAMESET&gt;&lt;/HTML&gt;", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "oxR/yxtgm&%t`;r";
      stringArray0[1] = "NfC96vQDs*yJH[t|jk>";
      stringArray0[2] = "java.util.regex.Matcher";
      stringArray0[3] = "-zip";
      stringArray0[4] = "java.util.regex.Pattern";
      stringArray0[5] = "java.util.Locale";
      stringArray0[6] = "(-W%";
      stringArray0[7] = "CONSTANT_Fieldref";
      stringArray0[8] = "?J/l#,_L,^glA";
      try { 
        Class2HTML.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // java.util.regex.Pattern (No such file or directory)
         //
         verifyException("java.util.zip.ZipFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-d";
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringArray0[1] = "-d";
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
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-d/";
      stringArray0[1] = "-d";
      stringArray0[2] = "-d";
      stringArray0[3] = "-d";
      stringArray0[4] = "-d/";
      Class2HTML.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SyntheticRepository syntheticRepository0 = SyntheticRepository.getInstance();
      Class<Integer> class0 = Integer.class;
      JavaClass javaClass0 = syntheticRepository0.loadClass(class0);
      Class2HTML class2HTML0 = new Class2HTML(javaClass0, "1'0fq@zLm';l]RoL");
  }
}
