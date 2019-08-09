/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 08:39:25 GMT 2019
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
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(34, timeUnit0);
      // Undeclared exception!
      try { 
        cacheControl_Builder1.maxStale((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      cacheControl_Builder0.minFresh(0, timeUnit0);
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(0, timeUnit0);
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxAge((-1463), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxAge < 0: -1463
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      cacheControl_Builder0.maxAge(0, timeUnit0);
      // Undeclared exception!
      try { 
        cacheControl_Builder0.maxStale((-1), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxStale < 0: -1
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      cacheControl0.onlyIfCached();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      boolean boolean0 = cacheControl0.noTransform();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertTrue(boolean0);
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      boolean boolean0 = cacheControl0.noStore();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertTrue(boolean0);
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.noCache();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(2496, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      cacheControl_Builder0.minFresh(59, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals(212400, int0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), int0);
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      cacheControl_Builder0.maxAge(182, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder0.build();
      int int0 = cacheControl0.maxAgeSeconds();
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals(0, int0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(75, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(6480000, int0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxStale(75, timeUnit0);
      CacheControl cacheControl0 = cacheControl_Builder1.build();
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals(0, int0);
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(Integer.MAX_VALUE, timeUnit0);
      assertSame(cacheControl_Builder1, cacheControl_Builder0);
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
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.minFresh(38, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("min-fresh=136800", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(44, timeUnit0);
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder1);
      String string0 = cacheControl0.toString();
      assertEquals("max-age=158400", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      String string0 = cacheControl0.toString();
      assertEquals("no-cache", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Cache-Control", "must-revalidate,");
      Headers.Builder headers_Builder2 = headers_Builder0.addLenient("s-maxage");
      Headers headers0 = headers_Builder1.build();
      CacheControl.parse(headers0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      CacheControl cacheControl1 = CacheControl.parse(headers0);
      cacheControl1.FORCE_CACHE.toString();
      CacheControl cacheControl2 = CacheControl.FORCE_NETWORK;
      cacheControl0.toString();
      Headers headers1 = headers_Builder2.build();
      CacheControl cacheControl3 = CacheControl.parse(headers1);
      cacheControl3.mustRevalidate();
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      int int0 = 1941;
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.maxAge(1941, timeUnit0);
      cacheControl_Builder0.noTransform();
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        cacheControl_Builder1.minFresh((-1728201212), timeUnit1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minFresh < 0: -1728201212
         //
         verifyException("okhttp3.CacheControl$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "|?I9XLWq>t*,";
      stringArray0[1] = "no-transform, ";
      stringArray0[2] = "|?I9XLWq>t*,";
      stringArray0[3] = "max-stale=2147483647, only-if-cached";
      stringArray0[4] = "Pragma";
      stringArray0[5] = "|?I9XLWq>t*,";
      stringArray0[6] = "Pragma";
      stringArray0[7] = "no-transform, ";
      Headers headers0 = Headers.of(stringArray0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertTrue(cacheControl0.noTransform());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("Pragma", "private");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPrivate();
      assertFalse(cacheControl0.mustRevalidate());
      assertTrue(boolean0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noTransform());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("Cache-Control", "no-store, ");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.isPublic());
      assertTrue(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.mustRevalidate());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("Pragma", "no-cache");
      Headers headers0 = new Headers(headers_Builder0);
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertTrue(cacheControl0.noCache());
      assertFalse(cacheControl0.isPublic());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Cache-Control", "s-maxage=");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.add("Pragma", "max-stale=2147483647, only-if-cached");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertFalse(cacheControl0.noStore());
      assertTrue(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noCache());
      assertEquals(Integer.MAX_VALUE, cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      headers_Builder0.addLenient("Pragma", "public");
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.isPublic();
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.onlyIfCached());
      assertTrue(boolean0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertEquals((-1), cacheControl0.minFreshSeconds());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers.Builder headers_Builder1 = headers_Builder0.addLenient("Cache-Control", "Vg,Z9");
      headers_Builder0.add("Cache-Control", "%le2)tzO=\"bS@q'&ml*");
      Headers headers0 = headers_Builder1.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
      assertFalse(cacheControl0.isPrivate());
      assertFalse(cacheControl0.noStore());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertFalse(cacheControl0.isPublic());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.mustRevalidate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.sMaxAgeSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.isPublic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.noTransform();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.maxStaleSeconds();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.isPrivate();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      int int0 = cacheControl0.minFreshSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_CACHE;
      boolean boolean0 = cacheControl0.onlyIfCached();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      int int0 = cacheControl0.maxAgeSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CacheControl cacheControl0 = CacheControl.FORCE_NETWORK;
      boolean boolean0 = cacheControl0.noCache();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Headers.Builder headers_Builder0 = new Headers.Builder();
      Headers headers0 = headers_Builder0.build();
      CacheControl cacheControl0 = CacheControl.parse(headers0);
      boolean boolean0 = cacheControl0.mustRevalidate();
      assertFalse(cacheControl0.isPublic());
      assertFalse(boolean0);
      assertFalse(cacheControl0.noStore());
      assertFalse(cacheControl0.isPrivate());
      assertEquals((-1), cacheControl0.sMaxAgeSeconds());
      assertEquals((-1), cacheControl0.maxAgeSeconds());
      assertFalse(cacheControl0.onlyIfCached());
      assertEquals((-1), cacheControl0.minFreshSeconds());
      assertEquals((-1), cacheControl0.maxStaleSeconds());
      assertFalse(cacheControl0.noTransform());
      assertFalse(cacheControl0.noCache());
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
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.noCache();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noTransform();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertEquals("no-transform", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      CacheControl.Builder cacheControl_Builder1 = cacheControl_Builder0.onlyIfCached();
      assertSame(cacheControl_Builder0, cacheControl_Builder1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CacheControl.Builder cacheControl_Builder0 = new CacheControl.Builder();
      cacheControl_Builder0.noStore();
      CacheControl cacheControl0 = new CacheControl(cacheControl_Builder0);
      String string0 = cacheControl0.toString();
      assertEquals("no-store", string0);
      assertNotNull(string0);
  }
}
