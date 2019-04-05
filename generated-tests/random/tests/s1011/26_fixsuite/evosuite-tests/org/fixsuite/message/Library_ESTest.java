/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 11:28:50 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      library0.loadFromDirectory("Approximate memory allocation: ");
      library0.getDictionaries();
      library0.getDictionary("k");
      library0.getDictionaries();
      library0.getDictionary("k");
      library0.getDictionary("");
      library0.getDictionary("k:\"L$Ecc_)3eSEDU{c<");
      library0.loadFromDirectory("C+!`DoB");
      library0.getDictionary("");
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
      library0.getDictionaries();
      library0.getDictionaries();
      String string0 = "Approximate memory allocation: ";
      library0.getDictionary("Approximate memory allocation: ");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      String string1 = "\"O^bIqZt,w|";
      library0.loadFromDirectory("\"O^bIqZt,w|");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Approximate memory allocation: ");
      library0.loadFromDirectory("Components.xml");
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
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionary("org.fixsuite.message.Library");
      library0.loadFromDirectory("org.fixsuite.message.Library");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("org.fixsuite.message.Library");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      Library library0 = new Library();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      System.setCurrentTimeMillis(45L);
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("QD&2Va<4{");
      library0.loadFromDirectory("QD&2Va<4{");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("Unable to load dictionary from ");
      System.setCurrentTimeMillis(45L);
      library0.getDictionaries();
      library0.loadFromDirectory("=");
      library0.loadFromDirectory("/");
      library0.getDictionaries();
      library0.getDictionary("=");
      library0.loadFromDirectory("Supplied path is not a directory.");
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      Library library0 = new Library();
      library0.getDictionary("org.fixsuite.message.info.FieldInfo");
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
  }
}