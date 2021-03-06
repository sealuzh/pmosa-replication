/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:52:54 GMT 2019
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
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("}", "1", "c_", "U?3chm']$2");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1);
      arrayList0.add(integer0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("ts_", "", "/", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("associateID", "associateID", (String) null, "URLSeperator", "URLSeperator", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("mR%@|(", (String) null, (String) null, "mR%@|(", "mR%@|(", "mR%@|(");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, "net.kencochrane.a4j.util.a4jUtil", (String) null, (String) null, "R~NkqU");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "2$=j{IlV.Pa)jNU-z");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("~(:bY", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "", "7", "7");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "*R#e\"w5_T :wNO7Ks`6", "", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "/", "Log file isn't there Setting default properties", "fgkc8e)&)");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile(":vx}{1jDz9IX/}~=]_r", (String) null, "&Hmac=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("$", "$", "$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, "Q!~R0=B", "associateID");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("sJ!", "", "net.kencochrane.a4j.util.LoadProperties", "sJ!");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "mR%@|(", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "1", "[Le^?]k.O\"<<D@FzM", "k6!(w\"5Z8,M$\"z");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("Q9RSw $Hx,$pE", "AsinSearch", "DjJ{z", "88xTJz /NI@=HA+A;5", "]lE#qS.N", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("AsinSearch", "lite", "HCWJEdVYaH #@uua", (String) null, (String) null, "lite");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("Aw[", "Jz", "", "cacheDir", "There is no Properties File Setting to default", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
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
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("popcornmonste2-20", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("popcornmonste2-20", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "5LA<]AgBI)lx-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "=n^4k!w");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("_*t$`16a(yd<+I[OX", (ArrayList) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("C#z=]]", arrayList0, "C#z=]]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile(":D$[WZIDrg&A8", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("_", "P{]r*V[+Gwqtjnsue", "KiP1W[>yT#y^i6XLo-", "", "P{]r*V[+Gwqtjnsue", "KiP1W[>yT#y^i6XLo-");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("-", "_", "", "amazonServerURL");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("net.kencochrane.a4j.util.LoadProperties", "P{]r*V[+Gwqtjnsue");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("SJ!_NET.KENCOCHRANE.A4J.UTIL.LOADPROPERTIES_THERE IS NO PROPERTIES FILE SETTING TO DEFAULT.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("sJ!", "net.kencochrane.a4j.util.LoadProperties", "There is no Properties File Setting to default");
      assertNotNull(file0);
      assertTrue(file0.exists());
      assertEquals("SJ!_NET.KENCOCHRANE.A4J.UTIL.LOADPROPERTIES_THERE IS NO PROPERTIES FILE SETTING TO DEFAULT.XML", file0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_LCH4AEE9.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "QwjwjQ5m");
      File file0 = fileUtil0.getSimilarItems("lch4aee9", (String) null);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(9L, file0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("popcornmonste2-20");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("cqWybh{kfx?k*AO");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_T_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "cqWybh{kfx?k*AO");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("t_", "URLSeperator");
      assertEquals(15, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("s_", "s_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "$");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=0&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer(0);
      arrayList0.add((Object) integer0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "XnB/0)Cw9G*WXbH)(");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertEquals(18L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "2wXOz(*% 5 gf>yP2Av", "88xTJz /NI@=HA+A;5", "HCWJEdVYaH #@uua");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=yM}6!jy&type=F^j@ylw}7m8[?&page=OY;FoQ`!?aOL#G!fM&offerstatus=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ggT]5o|T0q!WTgu~\"");
      File file0 = fileUtil0.downloadThirdPartySearchFile("yM}6!jy", "F^j@ylw}7m8[?", "OY;FoQ`!?aOL#G!fM", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&F=HA%27i&mode=mR%@|(&type=HA'i&page=2$=j{IlV.Pa)jNU-z&offer=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ggT]5o|T0q!WTgu~\"");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("F", "HA'i", "mR%@|(", "HA'i", "2$=j{IlV.Pa)jNU-z", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=UwytMxt9%25%5D%3BzMQx&mode=null&type=popcornmonste2-20&page=UwytMxt9%];zMQx&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("UwytMxt9%];zMQx", (String) null, "popcornmonste2-20", "UwytMxt9%];zMQx");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%24&type=$&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("$", "$");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=cVL>(cI&mode=null&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "2$=j{IlV.Pa)jNU-z");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "cVL>(cI", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("A8!n>#-}9Y?", "A8!n>#-}9Y?", "cqWybh{kfx?k*AO", "_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "2$=j{IlV.Pa)jNU-z");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("P{]r*V[+Gwqtjnsue", "net.kencochrane.a4j.util.LoadProperties");
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_LCH4AEE9.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "QwjwjQ5m");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=lch4aee9&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "S`t@D^!a4I");
      File file0 = fileUtil0.getSimilarItems("lch4aee9", (String) null);
      assertEquals(9L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("AW[_AW[_AW[.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("Aw[", "Aw[", "Aw[");
      assertNull(fileInputStream0);
  }
}
