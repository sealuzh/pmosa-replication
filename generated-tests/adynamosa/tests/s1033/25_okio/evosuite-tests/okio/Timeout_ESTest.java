/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 05:54:09 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Timeout_ESTest extends Timeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      Timeout timeout1 = timeout0.deadline(106L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified(timeout0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout1 = timeout0.deadline(106L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified(timeout0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      System.setCurrentTimeMillis(0L);
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      try { 
        timeout0.waitUntilNotified(timeout1);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      System.setCurrentTimeMillis(0L);
      timeout0.deadlineNanoTime(0L);
      try { 
        timeout0.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      timeout0.timeout(1000000L, timeUnit0);
      long long0 = timeout0.timeoutNanos();
      assertEquals(9223372036854775807L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Timeout timeout1 = timeout0.timeout(0L, timeUnit0);
      assertFalse(timeout1.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(0L);
      boolean boolean0 = timeout0.hasDeadline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      timeout0.timeout(3866L, timeUnit0);
      timeout0.deadlineNanoTime(3866L);
      assertEquals(3866000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(1344L);
      long long0 = timeout0.deadlineNanoTime();
      assertEquals(1344L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime((-1L));
      long long0 = timeout0.deadlineNanoTime();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      Timeout timeout1 = timeout0.timeout(3866L, timeUnit0);
      timeout1.deadline(2779L, timeUnit0);
      assertEquals(3866000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      Timeout timeout2 = timeout1.clearTimeout();
      assertEquals(0L, timeout2.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      timeout0.timeout(3866L, timeUnit0);
      timeout0.clearDeadline();
      assertEquals(3866000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      Timeout timeout1 = timeout0.timeout(0L, timeUnit0);
      assertSame(timeout0, timeout1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      Timeout timeout1 = timeout0.deadlineNanoTime((-222L));
      assertSame(timeout1, timeout0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        timeout0.deadline(0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: 0
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(0L);
      long long0 = timeout0.deadlineNanoTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      long long0 = timeout0.timeoutNanos();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      boolean boolean0 = timeout0.hasDeadline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(1L);
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout2 = timeout1.timeout(1L, timeUnit0);
      try { 
        timeout2.waitUntilNotified(timeout0);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout1 = timeout0.timeout(1344L, timeUnit0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified(object0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      timeout0.deadline(1344L, timeUnit0);
      timeout0.throwIfReached();
      assertTrue(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(1564985L);
      try { 
        timeout0.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.throwIfReached();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.deadline(1344L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        timeout0.deadline((-3541L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -3541
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      // Undeclared exception!
      try { 
        timeout0.deadlineNanoTime();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No deadline
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.timeout(1046L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        timeout0.timeout((-3514L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout < 0: -3514
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      timeout0.NONE.throwIfReached();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearTimeout();
      assertEquals(0L, timeout1.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      assertFalse(timeout1.hasDeadline());
  }
}
