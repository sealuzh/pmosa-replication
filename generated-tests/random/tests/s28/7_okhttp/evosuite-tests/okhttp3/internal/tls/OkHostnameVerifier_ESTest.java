/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:10:14 GMT 2019
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collection;
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
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      doReturn((Certificate[]) null).when(sSLSession0).getPeerCertificates();
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("},#;b{", sSLSession0);
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
  public void test2()  throws Throwable  {
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      List<String> list0 = OkHostnameVerifier.allSubjectAltNames(x509Certificate0);
      LinkedList<List<List<String>>> linkedList1 = new LinkedList<List<List<String>>>();
      X509Certificate x509Certificate1 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate1).getSubjectAlternativeNames();
      OkHostnameVerifier.allSubjectAltNames(x509Certificate1);
      String string0 = "okhttp3.internal.tls.OkHostnameVerifier";
      X509Certificate x509Certificate2 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      X509Certificate x509Certificate3 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      String string1 = "";
      String string2 = "[";
      SSLSession sSLSession0 = mock(SSLSession.class, new ViolatedAssumptionAnswer());
      X509Certificate x509Certificate4 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      X509Certificate x509Certificate5 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null, (Collection) null).when(x509Certificate5).getSubjectAlternativeNames();
      List<String> list1 = OkHostnameVerifier.allSubjectAltNames(x509Certificate5);
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      X509Certificate x509Certificate0 = mock(X509Certificate.class, new ViolatedAssumptionAnswer());
      doReturn((Collection) null).when(x509Certificate0).getSubjectAlternativeNames();
      boolean boolean0 = okHostnameVerifier0.verify("..", x509Certificate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OkHostnameVerifier okHostnameVerifier0 = OkHostnameVerifier.INSTANCE;
      // Undeclared exception!
      try { 
        okHostnameVerifier0.verify("", (SSLSession) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okhttp3.internal.tls.OkHostnameVerifier", e);
      }
  }
}
