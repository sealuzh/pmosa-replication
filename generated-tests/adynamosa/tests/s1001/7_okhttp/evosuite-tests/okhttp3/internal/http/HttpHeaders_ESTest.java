/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 22:05:09 GMT 2019
 */

package okhttp3.internal.http;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.URI;
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
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpHeaders_ESTest extends HttpHeaders_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("0", 4);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("?P~8O", 5);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("`m$]h$").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(582).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("`m$]h$").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(231).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("U]/YLO~xZ2hZ{X", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("U]/YLO~xZ2hZ{X", 0, "U]/YLO~xZ2hZ{X");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "b)HeDa";
      stringArray0[1] = "=J}IW\"{Gi<L0p9{v$j";
      stringArray0[2] = "xb,S[uq6]";
      stringArray0[3] = "";
      stringArray0[4] = "okhttp3.CacheControl";
      stringArray0[5] = "qEf";
      stringArray0[6] = "64y-|Z>";
      stringArray0[7] = "JAH(P43+[t:";
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      long long0 = HttpHeaders.contentLength(response0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, (Headers) null, (Request) null);
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1=#!{U&IH>>=y/";
      stringArray0[1] = "|";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, headers1, (Request) null);
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1=#!{U&IH>>=y/";
      stringArray0[1] = "|";
      Headers headers0 = Headers.of(stringArray0);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertNotSame(headers0, headers1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace("", (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil((String) null, 1017, (String) null);
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
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("", (-2577), "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("", 51, "0>");
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      HttpUrl httpUrl1 = httpUrl0.resolve("B@|?V0vfOo");
      HttpHeaders.receiveHeaders(cookieJar0, httpUrl1, headers0);
      assertEquals("http://foo.bar/B@%7C?V0vfOo", httpUrl1.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1=#!{U&IH>>=y/";
      stringArray0[1] = "|";
      Headers headers0 = Headers.of(stringArray0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(1, headers0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("U]/YLO~xZ2hZ{X", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds((String) null, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", (-2242));
      assertEquals((-2242), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, (String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.hasVaryAll(response0);
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
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.contentLength((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "U]/YLO~xZ2hZ{X";
      stringArray0[1] = "U]/YLO~xZ2hZ{X";
      stringArray0[2] = "U]/YLO~xZ2hZ{X";
      stringArray0[3] = "U]/YLO~xZ2hZ{X";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      long long0 = HttpHeaders.contentLength(headers1);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.varyFields((Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipWhitespace((String) null, 4);
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
      CookieJar cookieJar0 = mock(CookieJar.class, new ViolatedAssumptionAnswer());
      URI uRI0 = MockURI.aHttpURI;
      HttpUrl httpUrl0 = HttpUrl.get(uRI0);
      // Undeclared exception!
      try { 
        HttpHeaders.receiveHeaders(cookieJar0, httpUrl0, (Headers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.Cookie", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.parseChallenges((Headers) null, "%@$ @WGCD");
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
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[3] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[4] = "Vary";
      stringArray0[5] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[6] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[7] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers1 = Headers.of((Map<String, String>) hashMap0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers1);
      assertEquals(0, headers2.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", 35);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("7", 4);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("Vary", 35);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("wIk[z4", 0, "b)N}!,a@");
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "U]/YLO~xZ2hZ{X";
      stringArray0[1] = "U]/YLO~xZ2hZ{X";
      stringArray0[2] = "U]/YLO~xZ2hZ{X";
      stringArray0[3] = "U]/YLO~xZ2hZ{X";
      Headers headers0 = Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("@wiz! o").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(100).when(response0).code();
      doReturn((String) null).when(response0).header(anyString());
      doReturn(headers0).when(response0).headers();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("`m$]h$").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(204).when(response0).code();
      doReturn((Headers) null).when(response0).headers();
      doReturn(request0).when(response0).request();
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
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "U]/YLO~xZ2hZ{X";
      stringArray0[1] = "U]/YLO~xZ2hZ{X";
      stringArray0[2] = "U]/YLO~xZ2hZ{X";
      stringArray0[3] = "U]/YLO~xZ2hZ{X";
      Headers.of(stringArray0);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("@wiz! o").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(100).when(response0).code();
      doReturn((Headers) null).when(response0).headers();
      doReturn(request0).when(response0).request();
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
  public void test45()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("7").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("HEAD").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn("~").when(request0).method();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(68).when(response0).code();
      doReturn(request0).when(response0).request();
      boolean boolean0 = HttpHeaders.hasBody(response0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.putIfAbsent("!Qjg7;hJ}A+", "; domain=");
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "!Qjg7;hJ}A+");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1=#!{U&IH>>=y/";
      stringArray0[1] = "|";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "1=#!{U&IH>>=y/");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      HttpHeaders.skipWhitespace(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)", 10);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      stringArray0[2] = "Vary";
      stringArray0[3] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[4] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[5] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[6] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      stringArray0[7] = " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)";
      Headers headers0 = Headers.of(stringArray0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.clear();
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      headers1.toString();
      hashMap0.putIfAbsent("HEAD", "*");
      headers0.values("<2u_@qJMYwANRF6@8");
      headers1.names();
      HttpHeaders.varyFields(headers0);
      headers0.toString();
      System.setCurrentTimeMillis(10);
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(response0).headers();
      HttpHeaders.hasVaryAll(headers0);
      Headers headers2 = HttpHeaders.varyHeaders(headers0, headers0);
      headers2.toString();
      HttpHeaders.varyHeaders(headers2, headers0);
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches(response0, headers1, request0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "?P~8O";
      stringArray0[1] = "?P~8O";
      stringArray0[2] = "yGl7(";
      stringArray0[3] = "b)heda";
      stringArray0[4] = "INVALID_HOST";
      stringArray0[5] = "?g62l67";
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "FVSgZEe";
      stringArray0[1] = "endIndex > length(";
      stringArray0[2] = "FVSgZEe";
      stringArray0[3] = "endIndex > length(";
      stringArray0[4] = "FVSgZEe";
      stringArray0[5] = "endIndex > length(";
      stringArray0[6] = "FVSgZEe";
      stringArray0[7] = "FVSgZEe";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "http/1.1";
      stringArray0[1] = "Content-Length";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "9Thmtl#-";
      stringArray0[4] = "b)heda";
      stringArray0[5] = "@wiz! o";
      stringArray0[6] = "Content-Length";
      stringArray0[7] = "b)heda";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Request request0 = mock(Request.class, new ViolatedAssumptionAnswer());
      doReturn((Headers) null).when(request0).headers();
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(request0).when(response0).request();
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Response response1 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response1).headers();
      doReturn(response0).when(response1).networkResponse();
      Headers headers1 = HttpHeaders.varyHeaders(response1);
      assertTrue(headers1.equals((Object)headers0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.hasVaryAll((Response) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.http.HttpHeaders", e);
      }
  }
}