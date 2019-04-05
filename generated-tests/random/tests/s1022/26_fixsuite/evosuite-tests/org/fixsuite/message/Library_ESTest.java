/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 13:21:23 GMT 2019
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
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      library0.getDictionaries();
      library0.loadFromDirectory("nQcmPoD+cllU8b");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("CBw%v\r[O'+')9L");
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      String string0 = "*li";
      library0.getDictionaries();
      library0.loadFromDirectory("*li");
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
  public void test1()  throws Throwable  {
      Library library0 = new Library();
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Library library0 = new Library();
      FileSystemHandling.shouldAllThrowIOExceptions();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("@B3U~VO");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionary(" FIX dictionaries.");
      library0.getDictionary("Fields.xml");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("]{FTJ=rd63g");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      library0.getDictionaries();
      library0.loadFromDirectory("nQcmPoD+cllU8b");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nQcmPoD+cllU8b");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "p77Tc-pL{");
      String string0 = "";
      library0.loadFromDirectory("");
      String string1 = "CBw%v\\r[O'+')9L";
      library0.loadFromDirectory("CBw%v\r[O'+')9L");
      library0.getDictionary("CBw%v\r[O'+')9L");
      library0.getDictionaries();
      library0.getDictionaries();
      String string2 = "";
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
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
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      library0.getDictionaries();
      library0.loadFromDirectory("nQcmPoD+cllU8b");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("nQcmPoD+cllU8b");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "p77Tc-pL{");
      String string0 = "";
      library0.loadFromDirectory("");
      String string1 = "CBw%v\\r[O'+')9L";
      library0.loadFromDirectory("CBw%v\r[O'+')9L");
      library0.getDictionary("CBw%v\r[O'+')9L");
      library0.getDictionaries();
      library0.getDictionaries();
      String string2 = "";
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("org.fixsuite.message.parsers.fpl.MainParser");
      DictionaryInfo dictionaryInfo0 = new DictionaryInfo("");
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
}