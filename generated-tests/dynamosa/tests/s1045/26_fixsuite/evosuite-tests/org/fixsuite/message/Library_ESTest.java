/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:46:39 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
      
      library0.getDictionaries();
      library0.loadFromDirectory("}dAwSDgrIyK\"8R?");
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".");
      library0.loadFromDirectory("}dAwSDgrIyK\"8R?");
      library0.getDictionary("}dAwSDgrIyK\"8R?");
      library0.loadFromDirectory("+Yl{o");
      library0.loadFromDirectory("J:");
      library0.loadFromDirectory("J:");
      library0.getDictionaries();
      library0.loadFromDirectory("Path name does not point to a file.");
      library0.loadFromDirectory(".");
      library0.loadFromDirectory("Path name does not point to a file.");
      library0.loadFromDirectory("+Yl{o");
      library0.getDictionary("Path name does not point to a file.");
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("tkV\"{#2>lgOY2F`MPTn");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionary("");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.getDictionary("nkKIN]4&Yy9");
      library0.loadFromDirectory("Supplied directory is empty.");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("?hIbuE");
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
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      DictionaryInfo dictionaryInfo0 = new DictionaryInfo("");
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
  public void test5()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".");
      library0.loadFromDirectory("+Yl{o");
      library0.loadFromDirectory("J:");
      library0.loadFromDirectory("J:");
      library0.getDictionaries();
      library0.loadFromDirectory("Path name does not point to a file.");
      library0.loadFromDirectory(".");
      library0.loadFromDirectory("Path name does not point to a file.");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      library0.loadFromDirectory("+Yl{o");
      library0.getDictionary("Path name does not point to a file.");
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("tkV\"{#2>lgOY2F`MPTn");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Library library0 = new Library();
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
  public void test7()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory(".");
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionary("Enums.xml");
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
  public void test8()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = null;
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