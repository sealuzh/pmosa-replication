/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 00:20:08 GMT 2019
 */

package okhttp3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
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
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      boolean boolean0 = cacheControl0.noTransform();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertTrue(boolean0);
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noCache();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.minFresh((-3776), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -3776
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-578), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -578
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-1725044865), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -1725044865
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder0.minFresh(56, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=201600", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(56, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("max-age=201600", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-store", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String string0 = cacheControl0.toString();
      assertEquals("no-cache", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, no-transform";
      stringArray0[1] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, no-transform";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, no-transform";
      stringArray0[4] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, no-transform";
      stringArray0[5] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, no-transform";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals(738000, cacheControl0.maxStaleSeconds());
      assertTrue(cacheControl0.noStore());
      assertEquals(17712000, cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertTrue(cacheControl0.noCache());
      assertTrue(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "''qc^b8kpY#0W[";
      stringArray0[1] = "6O";
      stringArray0[2] = "pragma";
      stringArray0[3] = "must-revalidate";
      stringArray0[4] = "okhttp3.CacheControl$Builder";
      stringArray0[5] = "n[bt-0v]vc[";
      stringArray0[6] = "okhttp3.RequestBody";
      stringArray0[7] = "}kP~w1J";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertTrue(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.set("Pragma", "s-maxage");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[1] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[4] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[5] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals(36000, cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertTrue(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertTrue(cacheControl0.noCache());
      assertEquals(17712000, cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "[size=";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.set("pragma", "i;!L&o");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, only-if-cached";
      stringArray0[1] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, only-if-cached";
      stringArray0[2] = "cache-control";
      stringArray0[3] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, only-if-cached";
      stringArray0[4] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, only-if-cached";
      stringArray0[5] = "no-cache, no-store, max-stale=738000, min-fresh=17712000, only-if-cached";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals(738000, cacheControl0.maxStaleSeconds());
      assertEquals(17712000, cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertTrue(cacheControl0.noCache());
      assertTrue(cacheControl0.noStore());
      assertTrue(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "namesAndValues == null";
      stringArray0[1] = "z.ssnk>)/";
      stringArray0[2] = "\"^'29%";
      stringArray0[3] = "NV^J`,!3~-YtZtm:1:|";
      stringArray0[4] = "pragma";
      stringArray0[5] = "private, ";
      stringArray0[6] = "no-transform";
      stringArray0[7] = "`Dq";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertTrue(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "cache-control";
      stringArray0[1] = "cache-control";
      stringArray0[2] = "fXt`*|";
      stringArray0[3] = "cache-control";
      stringArray0[4] = "cache-control";
      stringArray0[5] = "cache-control";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("cache-control", "public, ");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertTrue(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(boolean0);
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      cacheControl0.noTransform();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.noCache();
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertFalse(boolean0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noStore();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertNotNull(string0);
      assertEquals("no-transform", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.maxAgeSeconds();
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), int0);
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl.Builder cacheControl_Builder2 = cacheControl_Builder1.noCache();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      cacheControl_Builder0.maxStale(205, timeUnit1);
      cacheControl_Builder1.maxStale(205, timeUnit0);
      TimeUnit timeUnit2 = TimeUnit.HOURS;
      cacheControl_Builder0.maxAge(10, timeUnit2);
      CacheControl cacheControl0 = cacheControl_Builder2.build();
      String string0 = cacheControl0.toString();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[1] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      cacheControl0.FORCE_CACHE.toString();
      stringArray0[2] = "cache-control";
      stringArray0[3] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[4] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      stringArray0[5] = "no-cache, no-store, max-age=36000, max-stale=17712000";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      headers0.names();
      cacheControl0.onlyIfCached();
      String string1 = cacheControl1.toString();
      assertFalse(cacheControl1.onlyIfCached());
      assertFalse(cacheControl1.noTransform());
      assertTrue(cacheControl1.noStore());
      assertTrue(string1.equals((Object)string0));
      assertEquals((-1), cacheControl1.minFreshSeconds());
      assertFalse(cacheControl1.isPrivate());
      assertTrue(cacheControl1.noCache());
      assertEquals(36000, cacheControl1.maxAgeSeconds());
      assertEquals(17712000, cacheControl1.maxStaleSeconds());
      assertFalse(cacheControl1.mustRevalidate());
  }
}