/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 06:45:36 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import okio.Utf8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utf8_ESTest extends Utf8_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      long long0 = Utf8.size("bL7J{G", 1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      long long0 = Utf8.size("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long long0 = Utf8.size("/F={ /", 0, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      long long0 = Utf8.size("", 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 1 > 0
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size(" < ", 0, (-179));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: -179 < 0
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("KjmN", (-1381), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -1381
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size((String) null, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      long long0 = Utf8.size(" < ");
      assertEquals(3L, long0);
  }
}
