/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 03:42:05 GMT 2019
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OkHostnameVerifier_ESTest extends OkHostnameVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn((Certificate[]) null).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify((String) null, sSLSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify("", (SSLSession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("", (X509Certificate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify((String) null, x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[1];
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      certificateArray0[0] = certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("aevp~;m1", sSLSession0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.security.cert.Certificate$MockitoMock$2096331424 cannot be cast to java.security.cert.X509Certificate
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[0];
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("byteCount < 0: ", sSLSession0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn((X500Principal) null).when(x509Certificate0).getSubjectX500Principal();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("", x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.DistinguishedNameParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        OkHostnameVerifier.allSubjectAltNames((X509Certificate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      boolean boolean0 = okHostnameVerifier0.verify("9", x509Certificate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[2];
      certificateArray0[0] = (Certificate) x509Certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      boolean boolean0 = okHostnameVerifier0.verify(".", sSLSession0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("", hashMap0);
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn((X500Principal) null).when(x509Certificate0).getSubjectX500Principal();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("", x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.DistinguishedNameParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      List<String> list0 = OkHostnameVerifier.allSubjectAltNames(x509Certificate0);
      assertEquals(0, list0.size());
  }
}
