/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:59:06 GMT 2019
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
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = Headers.of(stringArray0);
      Headers headers2 = HttpHeaders.varyHeaders(headers1, headers0);
      assertNotSame(headers1, headers2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("", (-1201));
      assertEquals((-1201), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("3", 65);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = HttpHeaders.parseSeconds("-9223372036854775808", (-3276));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace(") and stream length (", 12);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = HttpHeaders.skipWhitespace("Vary", 519);
      assertEquals(519, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("transfer-encoding", 9, "transfer-encoding");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("Aq*N&j+!]:Lvi|T", 5, "");
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.skipUntil("transfer-encoding", (-1124), "ej1(mw7");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = HttpHeaders.skipUntil("M1n$Y};", 204, "fCz&$#kiC83^ut");
      assertEquals(204, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      HttpHeaders.receiveHeaders((CookieJar) null, (HttpUrl) null, headers0);
      assertEquals(0, headers0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "+Bq+l+o\":/";
      stringArray0[1] = "jlI=V2&8Z.";
      stringArray0[2] = "yfws\"47]6jk8 ~A";
      stringArray0[3] = "(_TZ1tF~Wbn&[>jY?4d";
      stringArray0[4] = "v?3E!-^5 |R#~0";
      stringArray0[5] = "7vn(czr&z";
      stringArray0[6] = "^";
      stringArray0[7] = "B7<163x;A.E ,SC=";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "^");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "dc;fn*I8cH[yW(wN";
      stringArray0[1] = "dc;fn*I8cH[yW(wN";
      stringArray0[2] = "dc;fn*I8cH[yW(wN";
      stringArray0[3] = "dc;fn*I8cH[yW(wN";
      stringArray0[4] = "dc;fn*I8cH[yW(wN";
      stringArray0[5] = "dc;fn*I8cH[yW(wN";
      Headers headers0 = Headers.of(stringArray0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "dc;fn*I8cH[yW(wN");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Headers headers0 = Headers.of((Map<String, String>) hashMap0);
      List<Challenge> list0 = HttpHeaders.parseChallenges(headers0, "!vS[c");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Vary";
      stringArray0[1] = "fffe";
      stringArray0[2] = "ak([yJ";
      stringArray0[3] = "h,!TqYatpiCd!_u";
      stringArray0[4] = ".";
      stringArray0[5] = "realm";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertFalse(headers1.equals((Object)headers0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Vary";
      stringArray0[1] = "4F[a!sm0;";
      stringArray0[2] = "4F[a!sm0;";
      stringArray0[3] = "Vary";
      stringArray0[4] = "Vary";
      stringArray0[5] = "^iCPTE*8";
      Headers headers0 = Headers.of(stringArray0);
      Set<String> set0 = HttpHeaders.varyFields(headers0);
      assertEquals(2, set0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      Headers headers1 = HttpHeaders.varyHeaders(headers0, headers0);
      assertEquals(1, headers1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "SP58 !{";
      stringArray0[1] = "SP58 !{";
      stringArray0[2] = "SP58 !{";
      stringArray0[3] = "SP58 !{";
      stringArray0[4] = "SP58 !{";
      stringArray0[5] = "SP58 !{";
      stringArray0[6] = "HuueY_Y(0";
      stringArray0[7] = "SP58 !{";
      Headers headers0 = Headers.of(stringArray0);
      boolean boolean0 = HttpHeaders.hasVaryAll(headers0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Headers headers0 = Headers.of(stringArray0);
      Response response0 = mock(Response.class, new ViolatedAssumptionAnswer());
      doReturn(headers0).when(response0).headers();
      boolean boolean0 = HttpHeaders.varyMatches(response0, headers0, (Request) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Vary";
      stringArray0[1] = "Vary";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "}1{cky*&c";
      stringArray0[1] = "zG &e={BCKM2";
      stringArray0[2] = "Content-Length";
      stringArray0[3] = "([^ \"=]*)";
      stringArray0[4] = "(d{2,4})[^d]*";
      stringArray0[5] = "umG.";
      stringArray0[6] = "*";
      stringArray0[7] = ")ov}b [mss`}";
      Headers headers0 = Headers.of(stringArray0);
      long long0 = HttpHeaders.contentLength(headers0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpHeaders.varyMatches((Response) null, (Headers) null, (Request) null);
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