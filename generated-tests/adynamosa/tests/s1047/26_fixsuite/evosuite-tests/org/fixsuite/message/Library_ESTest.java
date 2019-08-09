/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:04:12 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      String string0 = null;
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
      String string0 = "bO(F=U=";
      library0.getDictionaries();
      library0.loadFromDirectory("bO(F=U=");
      String string1 = "";
      String string2 = "d)|M";
      library0.loadFromDirectory("MsgContents.xml");
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
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionary("c}83^;0{rn5bo<'LPp");
      library0.loadFromDirectory("{s+hJ6cC6");
      library0.getDictionaries();
      library0.getDictionaries();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("=7ymU");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("=7ymU");
      assertNull(dictionaryInfo0);
  }
}
