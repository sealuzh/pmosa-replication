/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 09:22:14 GMT 2019
 */

package okhttp3.internal.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;
import okhttp3.internal.tls.DistinguishedNameParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DistinguishedNameParser_ESTest extends DistinguishedNameParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("", hashMap0);
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("", hashMap0);
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("]RZ000Bhg");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      X500Principal x500Principal0 = new X500Principal("", hashMap0);
      DistinguishedNameParser distinguishedNameParser0 = new DistinguishedNameParser(x500Principal0);
      String string0 = distinguishedNameParser0.findMostSpecific("");
      assertNull(string0);
  }
}
