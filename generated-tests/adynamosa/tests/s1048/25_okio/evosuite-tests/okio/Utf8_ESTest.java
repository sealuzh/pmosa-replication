/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 07:54:31 GMT 2019
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
      // Undeclared exception!
      try { 
        Utf8.size("nVf(lPyZ`8UmW", 0, 961);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 961 > 13
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", (-2968), (-2858));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -2968
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = Utf8.size("", 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long long0 = Utf8.size("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  public void test5()  throws Throwable  {
      long long0 = Utf8.size("]Z[]p%R`_'Z1mN1:N3", 16, 18);
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.size("", 0, (-1903));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: -1903 < 0
         //
         verifyException("okio.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
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
  public void test8()  throws Throwable  {
      long long0 = Utf8.size("]Z[]p%R`_'Z1mN1:N3");
      assertEquals(19L, long0);
  }
}
