/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:24:02 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.Challenge;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      Headers headers2 = HttpHeaders.varyHeaders(headers1, headers0);
      assertNotSame(headers2, headers0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("N n3dBH>G", (-1879048190));
      assertEquals((-1879048190), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("Content-Length", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches((Response) null, headers0, (Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders((Headers) null, (Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("ulT#D", (-2233), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Request) null).when(response0).request();
      // Undeclared exception!
      try { 
        HttpHeaders.hasBody(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "SHA-256";
      stringArray0[1] = "encodedpathsegments == null";
      stringArray0[2] = "vary";
      stringArray0[3] = "S}l,:y'!xoZ";
      stringArray0[4] = "Content-Length";
      stringArray0[5] = "SHA-1";
      stringArray0[6] = "Vary";
      stringArray0[7] = "iPD$C";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(3, set0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", Integer.MAX_VALUE);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("4", (-2798));
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(", url=", 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("uIbirn<f8O3", (-2126));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(",", 84);
      assertEquals(84, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("\"':;<=>@[]^`{}|/?#&!$(),~", 9, "\"':;<=>@[]^`{}|/?#&!$(),~");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("^azI", 3, "2JKO[aq1");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil(">)m>~YM_.2^l", 100, ">)m>~YM_.2^l");
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w?(nfga'";
      stringArray0[1] = "t";
      stringArray0[2] = "u)!uz.$9|u t|";
      stringArray0[3] = "u)!uz.$9|u t|";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "u)!uz.$9|u t|");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "w?(nfga'";
      stringArray0[1] = "t";
      stringArray0[2] = "u)!uz.$9|u t|";
      stringArray0[3] = "*";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "u)!uz.$9|u t|");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "([^ \"=]*)");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "SHA-256";
      stringArray0[1] = "encodedpathsegments == null";
      stringArray0[2] = "vary";
      stringArray0[3] = "S}l,:y'!xoZ";
      stringArray0[4] = "Content-Length";
      stringArray0[5] = "SHA-1";
      stringArray0[6] = "Vary";
      stringArray0[7] = "iPD$C";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Set<String> set0 = HttpHeaders.varyFields(headers1);
      assertFalse(set0.contains("SHA-256"));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[1] = ">)m>~YM_.2^l";
      stringArray0[2] = "Vary";
      stringArray0[3] = ">)m>~YM_.2^l";
      stringArray0[4] = ">)m>~YM_.2^l";
      stringArray0[5] = "X^l9?!v]'+1b!L7F";
      stringArray0[6] = ">)m>~YM_.2^l";
      stringArray0[7] = ">)m>~YM_.2^l";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(2, headers1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(") disagree", "({#h'4d/");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.putIfAbsent("Content-Length", "cacheResponse");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Response) null).when(response0).networkResponse();
      // Undeclared exception!
      try { 
        HttpHeaders.varyHeaders(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, (Headers) null, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.contentLength(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.hasVaryAll(response0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }
}