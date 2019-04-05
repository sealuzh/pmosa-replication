/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:34:01 GMT 2019
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("K$q|Yr1y", "g_");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=cacheDir&type=&offerpage=&offer=cacheDir&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ":6Zg6");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheDir", "", "cacheDir", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=g_&type=null&offerpage=g_&offer=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      boolean boolean0 = fileUtil0.downloadOneASINFile("g_", (String) null, (String) null, "g_", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SMILARIESEARCH_SMILARIESEARCH_SMILARIESEARCH.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("SmilarieSearch", "SmilarieSearch", "SmilarieSearch");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_A5~/9T1.XML");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getSimilarItems("a5~/9T1", "a5~/9T1");
      assertNotNull(file0);
      assertEquals(9L, file0.length());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertFalse(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "6e");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "3rd_");
      assertEquals(3, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SMILARIESEARCH_SMILARIESEARCH_SMILARIESEARCH.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "SmilarieSearch");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("SmilarieSearch", "SmilarieSearch", "SmilarieSearch");
      assertEquals(14, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_).XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(")", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/CACHEDIR_CACHEDIR__.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "SimilaritySearch");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheDir", "", "cacheDir", "");
      assertEquals(17, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SIMILARITYSEARCH__M'7XFMO^.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "-Q&Mw7tTZW.-j\"gY{V;");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("SimilaritySearch", "", "M'7XFMO^");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
      assertEquals(20L, file0.length());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("'J`n}Xef*auXP_", "");
      File file0 = MockFile.createTempFile(".0123456789", "", (File) mockFile0);
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      mockFile0.mkdir();
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("bnm!rOr\"f", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", (String) null, ".Y){Fd#~m");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("Ye-w&q", "GN+v-'9]CI)1", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "", "There is no Properties File Setting to default");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("7<?:U0+!<cc>W", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "");
      File file0 = fileUtil0.getAccessories("ShoppingCart=modify&f=xml&dev-t=", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", (String) null, "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("new", "", "l$a:te", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, "U' Q,", "U' Q,");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "&H2L4q2L", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("6e", "bj~?jv]X>]E>", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("wK_|tF\"", (String) null, "", "a_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "", "7:1J#tXu!ySN", "cacheLife");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "net.klncoch&anea4jfie.FileUtil", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "&c~Vi(@gX[=d?p", "", "864000r0");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "jQv");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("&NU*?SN=a(5", "", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("|!`IaLr&", "by", "offer=", "offer=");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, ">J'3i=_H!>(t");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("hp'n*", (String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "eGQ", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("new", (String) null, "/Xa@", "", "/Xa@", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "", (String) null, (String) null, "4G^$j&4", "+ QiPHMn");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("SimilaritySearch", "SimilaritySearch", "SimilaritySearch", "SimilaritySearch", "SimilaritySearch", "SimilaritySearch");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("*]a20", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "VYPz#");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("5mKJ8~#pQb<GN", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ts_", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "6e", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("/", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("*k@dkCReHi<H7", "%iq9w;[).hiWneC&", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("V(kF(UTW*6", (String) null, "offerpage=", "r8T&9RLmc");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "", (String) null, "pkd;};MWd ");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "V(kF(UTW*6", "k_", "I>sWt;");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("/", "", "/", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", (String) null, (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "b_", "mode=", "mode=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("*G{8*$!r", "*G{8*$!r", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, "/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("%yA+V|W1$%:", (String) null, "%yA+V|W1$%:", "Dv/7h$DAPDL&^;h21", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "XK4l{MC!yB^!~,I!-4", "XK4l{MC!yB^!~,I!-4", (String) null, ".elsfA7zrJ\bcKc7Q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("Log file isn't there Setting default properties", "", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "['&q 6xkv[", "?1gNSLyY", "['&q 6xkv[", "offer=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", (String) null, "", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "offerpage=", "a_", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "]>X");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("[L~DWNUqUe<*7N0(.", "", "E~EC9<a9/Q5T$,#i", (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("ooXeMBj", "ooXeMBj", "ooXeMBj", "all", "", "(]ja4`= j[(=N");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("I)hY)[xmI_u5<ib.A", "oW|6gKrf[vyWl&>7M", (String) null, "<ndtg-Msc", "AsinSearch", "I)hY)[xmI_u5<ib.A");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", (String) null, "", "", "3kc_e+nU-cmXs1", "o<VcJve`");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "cacheLife", (String) null, "cacheLife", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("URLSeperator");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("t=", (String) null, "", "t=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "22bP2", "t=", "t=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("*}05JTNE&EqiQjr:", "SmilarieSearch", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("x/pK)> L2(", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("http://xml.amazon.net/onca/xml3", "n");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", (ArrayList) null, "ek~?>9K_%/@x@U\taR");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("ta_", arrayList0, "*#0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
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
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=n,&type=lite&offerpage=n,&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ",URLSf6eWBBfk~tfTQ[=");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("n,", "n,", ",URLSf6eWBBfk~tfTQ[=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertEquals("/S_.XML", file0.toString());
      assertNotNull(file0);
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "Similarilt]Search");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Similarilt]Search&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Uwq-");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "nZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("&Hmac=", "Sj0 =", "9S[ kx ", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=SimilaritySearch&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Shopp_ngCart=geG&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "SimilaritySearch");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SIMILARITYSEARCH__M'7XFMO^.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("SimilaritySearch", "", "M'7XFMO^");
      assertNotNull(file0);
      assertEquals("/SIMILARITYSEARCH__M'7XFMO^.XML", file0.toString());
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("=");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("c");
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=N&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "4RCrk{N~\"a?k-I\"^%");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("N", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "N");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "Similarilt]Search");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Similarilt]Search&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Uwq-");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Similarilt]Search", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=popcornmonste2-20&type=popcornmonste2-20&page=&offerstatus=popcornmonste2-20&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "popcornmonste2-20");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("popcornmonste2-20", "popcornmonste2-20", "", "popcornmonste2-20");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "2{vJmeR~?y6?,\"Tx", ")xi", ")xi", "", "K>^\"zu;9SHoZkK\"q,wC");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&ShoppingCart=get&f=xml&dev-t==ShoppingCart%3Dget%26f%3Dxml%26dev-t%3D&mode=SimilaritySearch&type=ShoppingCart=get&f=xml&dev-t=&page=SimilaritySearch&offer=ShoppingCart=get&f=xml&dev-t=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=get&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("ShoppingCart=get&f=xml&dev-t=", "ShoppingCart=get&f=xml&dev-t=", "SimilaritySearch", "ShoppingCart=get&f=xml&dev-t=", "SimilaritySearch", "ShoppingCart=get&f=xml&dev-t=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "URLSeperator");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=SimilaritySearch&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "SimilaritySearch");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "SimilaritySearch");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SMILARIESEARCH_SMILARIESEARCH_SMILARIESEARCH.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("SmilarieSearch", "SmilarieSearch", "SmilarieSearch");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=SmilarieSearch&mode=SmilarieSearch&type=lite&page=SmilarieSearch&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ".k`uK:V8`p'y5]eQK?]*");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("SmilarieSearch", "SmilarieSearch", "SmilarieSearch");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/CACHEDIR_CACHEDIR__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheDir", "", "cacheDir", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("1Yy", "", "", "sSQ3");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SIMILLARITSEARCH_SIMILLARITSEARCH_SIMILLARITSEARCH_SIMILLARITSEARCH.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("SimiLlaritSearch", "SimiLlaritSearch", "SimiLlaritSearch", "SimiLlaritSearch");
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "N");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=n,&type=,URLSf6eWBBfk~tfTQ[=&offerpage=n,&offer=n,&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ",URLSf6eWBBfk~tfTQ[=");
      boolean boolean0 = fileUtil0.downloadOneASINFile("n,", ",URLSf6eWBBfk~tfTQ[=", "n,", "n,", "n,");
      assertFalse(boolean0);
  }
}