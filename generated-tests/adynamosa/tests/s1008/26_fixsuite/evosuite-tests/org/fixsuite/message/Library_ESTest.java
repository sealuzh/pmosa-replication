/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 09:58:22 GMT 2019
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
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("A1)S9P9R|V6i-u");
      library0.loadFromDirectory("A1)S9P9R|V6i-u");
      library0.loadFromDirectory("");
      library0.getDictionary("org.fixsuite.message.Library");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("A1)S9P9R|V6i-u");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      library0.getDictionary("A1)S9P9R|V6i-u");
      library0.getDictionaries();
      library0.getDictionary("u5)b+jCYp1jR~,|kV");
      library0.getDictionary("u5)b+jCYp1jR~,|kV");
      library0.loadFromDirectory("");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("org.fixsuite.message.Library");
      FileSystemHandling.createFolder(evoSuiteFile1);
      library0.getDictionaries();
      library0.loadFromDirectory("A1)S9P9R|V6i-u");
      boolean boolean0 = library0.loadFromDirectory("org.fixsuite.message.Library");
      library0.getDictionaries();
      boolean boolean1 = library0.loadFromDirectory("");
      assertFalse(boolean1 == boolean0);
      
      library0.getDictionary("org.fixsuite.message.Library");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("A1)S9P9R|V6i-u");
      library0.loadFromDirectory("A1)S9P9R|V6i-u");
      library0.loadFromDirectory("");
      library0.getDictionary("org.fixsuite.message.Library");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("A1)S9P9R|V6i-u");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      library0.getDictionary("A1)S9P9R|V6i-u");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.getDictionary("u5)b+jCYp1jR~,|kV");
      library0.getDictionary("u5)b+jCYp1jR~,|kV");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("A1)S9P9R|V6i-u");
      library0.loadFromDirectory("org.fixsuite.message.Library");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionary("org.fixsuite.message.Library");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = "Enums.xml";
      library0.loadFromDirectory("Enums.xml");
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.loadFromDirectory("Enums.xml");
      library0.loadFromDirectory("Enums.xml");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("O");
      String string1 = ".";
      library0.getDictionary(".");
      library0.getDictionary("");
      library0.getDictionaries();
      String string2 = null;
      library0.getDictionaries();
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
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.loadFromDirectory(";)hD0B*?8D7J|o");
      library0.getDictionary(";)hD0B*?8D7J|o");
      library0.loadFromDirectory("");
      library0.getDictionary("ki]ljt%]$zv \"a*,l7");
      library0.loadFromDirectory(";mI30*j#G5!m");
      library0.getDictionary("ki]ljt%]$zv \"a*,l7");
      library0.getDictionary(";mI30*j#G5!m");
      library0.loadFromDirectory(";mI30*j#G5!m");
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("MsgType.xml");
      String string0 = "gw ')fclzJ'%?<3\"u";
      String string1 = null;
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
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("C43q@c8Y");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("BBd<\"K^I5a%v!;c");
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
  }
}