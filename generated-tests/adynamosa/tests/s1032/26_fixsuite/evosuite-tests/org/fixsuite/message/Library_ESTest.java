/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 04:34:55 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("yVn?");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "5V~8z:W");
      String string0 = "i-`>g";
      library0.loadFromDirectory("i-`>g");
      library0.getDictionaries();
      library0.loadFromDirectory("i-`>g");
      library0.loadFromDirectory("i-`>g");
      library0.loadFromDirectory("i-`>g");
      String string1 = "";
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      String string2 = null;
      // Undeclared exception!
      try { 
        library0.loadFromDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionary("pp`D");
      library0.loadFromDirectory("pp`D");
      library0.loadFromDirectory("Unable to load dictionary from ");
      String string0 = "MoC+.n\\{O`hhzsA";
      library0.loadFromDirectory("MoC+.n{O`hhzsA");
      String string1 = "";
      library0.loadFromDirectory("");
      // Undeclared exception!
      try { 
        library0.getDictionary((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.getDictionary("org.fixsuite.message.parsers.fpl.MainParser");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = "i-`>g";
      library0.loadFromDirectory("i-`>g");
      library0.getDictionaries();
      library0.loadFromDirectory("i-`>g");
      library0.loadFromDirectory("i-`>g");
      library0.loadFromDirectory("i-`>g");
      String string1 = "";
      library0.loadFromDirectory("yVn?");
      library0.getDictionary("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("yVn?");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      String string2 = null;
      // Undeclared exception!
      try { 
        library0.loadFromDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("~KGCN0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Library library0 = new Library();
      String string0 = "A;T8g1.h.&5N7lt";
      // Undeclared exception!
      try { 
        library0.loadFromDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}