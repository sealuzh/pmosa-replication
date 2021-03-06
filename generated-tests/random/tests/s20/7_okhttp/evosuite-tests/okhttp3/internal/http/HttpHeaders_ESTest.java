/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:13:48 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertEquals(1, headers2.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("Vary", 57343);
      assertEquals(57343, int0);
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
      int int0 = HttpHeaders.skipWhitespace("Unexpected char %#04x at %d in header name: %s", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 2915, "");
      assertEquals(2915, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 6, "x-l8YyIfIe7:e`'");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("M", (-1409));
      assertEquals((-1409), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "xc20n+:v[`O";
      stringArray0[1] = "\"([^\"]*)\"";
      stringArray0[2] = "I";
      stringArray0[3] = "SHA-256";
      stringArray0[4] = "nW1DpYLjn)w&C?]";
      stringArray0[5] = "okio.Buffer";
      stringArray0[6] = "SHA-256";
      stringArray0[7] = "wss:";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      HttpHeaders.parseChallenges(headers1, "I");
      assertEquals(0, headers1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.hasBody((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("Unexpected hex string: ", (-1496));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace((String) null, 2698);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("ke+p?", (-1), "ke+p?");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.hasVaryAll((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.contentLength((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-11", 14);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("0", 53);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(") and stream length (", 1);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("B@6kkqL$ZrO.0", 3222);
      assertEquals(3222, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("hT+R?", 3, "HEAD");
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("okhttp3.CookieJar$1", 9, "; domain=");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      stringArray0[0] = " \"':;<=>@[]^`{}|/?#&!$(),~";
      stringArray0[1] = ",";
      Headers headers0 = Headers.of(stringArray0);
      HttpHeaders.receiveHeaders(cookieJar0, (HttpUrl) null, headers0);
      assertEquals(1, headers0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "cacheResponse";
      stringArray0[1] = "`";
      stringArray0[2] = "UF";
      stringArray0[3] = "\n not found: size=";
      stringArray0[4] = "y'-";
      stringArray0[5] = "([^ \"=]*)";
      stringArray0[6] = "B*l{84iu>e'~|g-W'[";
      stringArray0[7] = "x!`wqk=fdz.]?";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "UF");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "xc20n+:v[`O";
      stringArray0[1] = "\"([^\"]*)\"";
      stringArray0[2] = "I";
      stringArray0[3] = "SHA-256";
      stringArray0[4] = "nW1DpYLjn)w&C?]";
      stringArray0[5] = "okio.Buffer";
      stringArray0[6] = "SHA-256";
      stringArray0[7] = "wss:";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "I");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertNotSame(headers1, headers0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "vary";
      stringArray0[1] = "vary";
      stringArray0[2] = "^`{|}";
      stringArray0[3] = "uk=2^V>>e";
      stringArray0[4] = "vary";
      stringArray0[5] = "vary";
      stringArray0[6] = "^`{|}";
      stringArray0[7] = "vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(2, headers1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "M";
      stringArray0[1] = "private";
      stringArray0[2] = "lu";
      stringArray0[3] = "http";
      Headers headers0 = Headers.of(stringArray0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "C~lB)*xiCK[yWXKX{1";
      stringArray0[1] = "h2";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "PS7a(PnJv";
      stringArray0[4] = "tb8t.";
      stringArray0[5] = "6h5^%2mP@+;]6";
      stringArray0[6] = "xc20n+:v[`o";
      stringArray0[7] = "Xs}$!S";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
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
