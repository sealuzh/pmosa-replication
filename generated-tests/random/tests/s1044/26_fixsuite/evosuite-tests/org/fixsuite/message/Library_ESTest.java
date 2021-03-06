/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:58:57 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      String string0 = "Components.xml";
      library0.getDictionaries();
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.fixsuite.message.info.MessageInfo");
      byte byte0 = (byte)1;
      library0.loadFromDirectory("org.fixsuite.message.info.MessageInfo");
      library0.getDictionaries();
      byteArray0[0] = (byte)1;
      library0.loadFromDirectory("L?lPc{");
      library0.getDictionaries();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      String string1 = "";
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
      library0.loadFromDirectory("7yH2,q?M=a");
      library0.loadFromDirectory("Supplied path is not a directory.");
      library0.getDictionary("org.fixsuite.message.info.ComponentInfo");
      System.setCurrentTimeMillis((-1517L));
      library0.getDictionaries();
      System.setCurrentTimeMillis((-1517L));
      library0.loadFromDirectory("org.fixsuite.message.info.ComponentInfo");
      library0.loadFromDirectory("");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("7yH2,q?M=a");
      library0.getDictionary("7yH2,q?M=a");
      library0.loadFromDirectory("Supplied path is not a directory.");
      System.setCurrentTimeMillis(0L);
  }
}
