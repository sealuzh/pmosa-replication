/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 05:11:41 GMT 2019
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.Headers;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CacheControl_ESTest extends CacheControl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(0, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-2658), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -2658
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(0, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Pragma", "no-cache, max-age=3801600, min-fresh=3801600");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertTrue(cacheControl0.noCache());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(3801600, cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals(3801600, cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.noTransform();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.noStore();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertTrue(boolean0);
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(boolean0);
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(0, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals(0, int0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals(2147483, int0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      cacheControl_Builder0.maxStale(4, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.maxStaleSeconds();
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.maxStaleSeconds();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(2, int0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      cacheControl_Builder0.maxAge(214, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals(0, int0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "public";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(cacheControl0.isPrivate());
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheControl.parse((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.CacheControl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheControl cacheControl0 = null;
      try {
        cacheControl0 = new CacheControl((CacheControl.Builder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.CacheControl", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-381), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -381
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-537), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -537
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      int int0 = cacheControl0.maxAgeSeconds();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(4244, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("max-age=0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String string0 = cacheControl0.FORCE_CACHE.toString();
      assertEquals("max-stale=2147483647, only-if-cached", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      cacheControl0.toString();
      String string0 = cacheControl0.toString();
      assertEquals("no-cache", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Pragma", "no-transform");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertTrue(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Pragma", "only-if-cached");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertTrue(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("cache-control", "private");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Pragma", "s-maxage");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Pragma";
      stringArray0[1] = "no-store";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertTrue(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("Pragma", "max-stale=");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPublic());
      assertEquals(Integer.MAX_VALUE, cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Pragma", ",;");
      Headers headers0 = new Headers(headers_Builder1);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("Pragma", "no-cache, max-age=0, min-fresh=0");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertTrue(cacheControl0.noCache());
      assertFalse(cacheControl0.isPublic());
      assertEquals(0, cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("cache-control", "cache-control");
      headers_Builder0.addLenient("cache-control", "cache-control");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noTransform();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.noCache();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Dl";
      stringArray0[1] = "s~}zy$-.o>t3hk";
      stringArray0[2] = ":MZBU??m?oX3H";
      stringArray0[3] = "s~}zy$-.o>t3hk";
      stringArray0[4] = "Pragma";
      stringArray0[5] = "must-revalidate, ";
      stringArray0[6] = "Pragma";
      stringArray0[7] = "Pragma";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noStore());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.noStore();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noCache();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      boolean boolean0 = cacheControl0.noCache();
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("no-transform", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.onlyIfCached();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertTrue(boolean0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.maxStaleSeconds();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-store", string0);
  }
}
