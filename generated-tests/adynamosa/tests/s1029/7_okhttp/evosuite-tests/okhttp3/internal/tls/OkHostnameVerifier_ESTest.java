/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:02:18 GMT 2019
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
import java.util.LinkedList;
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
  public void test0()  throws Throwable  {
      LinkedList<List<Object>> linkedList0 = new LinkedList<List<Object>>();
      LinkedList<List<String>> linkedList1 = new LinkedList<List<String>>();
      LinkedList<List<Object>> linkedList2 = new LinkedList<List<Object>>();
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null, (Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[6];
      certificateArray0[0] = (Certificate) x509Certificate0;
      certificateArray0[1] = (Certificate) x509Certificate0;
      certificateArray0[2] = (Certificate) x509Certificate0;
      certificateArray0[3] = (Certificate) x509Certificate0;
      certificateArray0[4] = (Certificate) x509Certificate0;
      certificateArray0[5] = certificateArray0[4];
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      okHostnameVerifier0.verify(".", sSLSession0);
      OkHostnameVerifier.allSubjectAltNames(x509Certificate0);
      X509Certificate x509Certificate1 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      X509Certificate x509Certificate2 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate2).getSubjectAlternativeNames();
      OkHostnameVerifier.allSubjectAltNames(x509Certificate2);
      LinkedList<List<String>> linkedList3 = new LinkedList<List<String>>();
      X509Certificate x509Certificate3 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate3).getSubjectAlternativeNames();
      OkHostnameVerifier.allSubjectAltNames(x509Certificate3);
      OkHostnameVerifier okHostnameVerifier1 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier1.verify(".", (SSLSession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn((Certificate[]) null).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify((String) null, sSLSession0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("*0U_p{?ZKLfD", (X509Certificate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify((String) null, x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      Certificate[] certificateArray0 = new Certificate[4];
      Certificate certificate0 = mock(Certificate.class, new ViolatedAssumptionAnswer());
      certificateArray0[0] = certificate0;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn(certificateArray0).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("", sSLSession0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.security.cert.Certificate$MockitoMock$2125027969 cannot be cast to java.security.cert.X509Certificate
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      doReturn((X500Principal) null).when(x509Certificate0).getSubjectX500Principal();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.INSTANCE.verify("", x509Certificate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.DistinguishedNameParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      boolean boolean0 = okHostnameVerifier0.verify(":", x509Certificate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
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
  public void test8()  throws Throwable  {
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
}
