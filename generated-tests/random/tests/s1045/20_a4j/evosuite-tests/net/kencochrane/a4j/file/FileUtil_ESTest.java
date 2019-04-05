/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 17:08:58 GMT 2019
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("\"p:zD`U)HypumIG(;", "k_");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "5iJaW1V,+oW");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "1B6GD{\"%j@)aNL9'e", "a4j-config.txt");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "/", "", "qim[* =zVjs");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("qim[* =zVjs", "", "AsinSearch", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "cacheDir", "popcornmonste2-20", "A*grr94p'_z*:C");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("net.kencochrane.a4j.util.LoadProperties", "+*~M!l_<$o`]Nyj&");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("cacheLife", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ShoppingCart=clear&f=xml&dev-t=", "s_", "new");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", (String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("{\"AKi]m1fY-(L", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "Y]:/f");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, "t_", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("u?PF8?9SWY", "-", "nfdCv?jle<9KuB", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("o;r\"(e&#pgO", "new", "=", "UTF-8", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("5iJaW1V,+oW", "wfl$j?`", "", "86400000", "wfl$j?`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", (String) null, "_O ifmx", "", "a4j-config.txt", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "1B6GD{\"%j@)aNL9'e", "1B6GD{\"%j@)aNL9'e", "a4j-config.txt", "a4j-config.txt", "a4j-config.txt");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("9SEG56}Y)", "o)@/-cs%5o7", "^pE*j6$c", "dev-t=", "", "TB<6c(6*u^2^d");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "popcornmonste2-20", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("new", "", "b-@CQjiW", "s_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", (String) null, "cacheLife", "ta_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("B,}t^!df", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("5iJaW1V,+oW", (ArrayList) null, "TB<6c(6*u^2^d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("&");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile(".xml", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile(".xml", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.deleteFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("2%", "&D({t(Y9S-hE.\"\"", "new", "j)]");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "8e9Nepm:");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_O&2&_.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getASINFile((String) null, "o&2&", (String) null, "");
      assertNotNull(file0);
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("5iJaW1V,+oW", (String) null, "{\"AKi]m1fY-(L", "IYF%");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("f)/#\"YCu8^yylyT+");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("{\"AKi]m1fY-(L");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=/Bi~hGewl-YDv{2.6r&type=lite&offerpage=cacheLife&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "iwCGi/>");
      File file0 = fileUtil0.getSimilarItems("/Bi~hGewl-YDv{2.6r", "cacheLife");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("S_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "5iJaW1V,+oW");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", (String) null);
      assertEquals(12, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "AsinSearch");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      File file0 = fileUtil0.getAccessories("f)/#\"YCu8^yylyT+", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("A_5IJAW1V,+OW.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      File file0 = fileUtil0.getAccessories("5iJaW1V,+oW", (ArrayList) null);
      assertNotNull(file0);
      assertEquals(1L, file0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=cacheLife&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "iwCGi/>");
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "cacheLife", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("cacheDir", "cacheDir", "o;r\"(e&#pgO", "o;r\"(e&#pgO", "o;r\"(e&#pgO", "cacheDir");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("%NkG\"dP}V/w b}", "z|G`!!|", "j@bqxMQ%Z-k!6@X", "popcornmonste2-20");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=TB<6c(6*u^2^d&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "9SEG56}Y)");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "TB<6c(6*u^2^d");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("WFL$J?`_DSB0XDDW1GQ3S_.XML");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.cacheDir = "";
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("wfl$j?`", "DSB0XDDW1GQ3S", "");
      assertEquals(8, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_/_+*~M!L_<$O`]NYJ&.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getBrowseNodeFile("", "/", "+*~M!l_<$o`]Nyj&");
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=5iJaW1V,+oW&mode=a3-GuW8]Ec*LU}&type=lite&page= Zg!Ih`.3nLmCVf&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "9SEG56}Y)");
      File file0 = fileUtil0.getBrowseNodeFile("a3-GuW8]Ec*LU}", "5iJaW1V,+oW", " Zg!Ih`.3nLmCVf");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__ASSOCIATEID_8E9NEPM:.XML");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "associateID", "", "8e9Nepm:");
      assertEquals(8, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=net.kencochrane.a4j.file.FileUtil&type=&offerpage=cacheLife&offer=5_l &f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "iwCGi/>");
      boolean boolean0 = fileUtil0.downloadOneASINFile("net.kencochrane.a4j.file.FileUtil", "", "5_l ", "cacheLife", "5_l ");
      assertFalse(boolean0);
  }
}