/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 09:32:52 GMT 2019
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
  public void test00()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("MsgContents.xml");
      assertNull(dictionaryInfo0);
      
      List<DictionaryInfo> list0 = library0.getDictionaries();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Library library0 = new Library();
      String string0 = null;
      String string1 = "|Q]|GM =Fk]\\0Ic";
      library0.loadFromDirectory("0Nas|.T8@-'Gx");
      library0.loadFromDirectory("|Q]|GM =Fk]\u0000Ic");
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("XTYq@F]>%|g\"hcUi");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
      
      library0.getDictionaries();
      library0.loadFromDirectory("N3MltKuOjMxriF4Y=.n");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("/");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("N3MltKuOjMxriF4Y=.n");
      library0.loadFromDirectory("(\"A|&c,+C[l$b;U3yL");
      library0.loadFromDirectory("Unloading previous dictionaries");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("Unloading previous dictionaries");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("N3MltKuOjMxriF4Y=.n");
      library0.getDictionaries();
      library0.loadFromDirectory("N3MltKuOjMxriF4Y=.n");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionary("Unloading previous dictionaries");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("/");
      library0.getDictionary("");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("usTEPl5e");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.loadFromDirectory("N~g[U^f8$.");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("N~g[U^f8$.");
      assertNull(dictionaryInfo0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("y=5s^k");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[0] = (byte)1;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      String string0 = "e+q;zC:}";
      library0.loadFromDirectory("e+q;zC:}");
      library0.getDictionaries();
      library0.loadFromDirectory("org.fixsuite.message.info.FieldInfo");
      String string1 = "";
      library0.loadFromDirectory("Unable to load any dictionaries");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.getDictionaries();
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
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("y=5s^k");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[0] = (byte)1;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Library library0 = new Library();
      library0.loadFromDirectory("HK");
      boolean boolean0 = library0.loadFromDirectory("");
      assertTrue(boolean0);
      
      boolean boolean1 = library0.loadFromDirectory("y=5s^k");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("N3MltKuOjMxriF4Y=.n");
      library0.getDictionaries();
      library0.getDictionaries();
      boolean boolean0 = library0.loadFromDirectory("/");
      assertTrue(boolean0);
      
      boolean boolean1 = library0.loadFromDirectory("\":&}H{Z(");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("org.fixsuite.message.info.ComponentInfo");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      List<DictionaryInfo> list0 = library0.getDictionaries();
      library0.getDictionary("");
      List<DictionaryInfo> list1 = library0.getDictionaries();
      assertNotSame(list1, list0);
  }
}
