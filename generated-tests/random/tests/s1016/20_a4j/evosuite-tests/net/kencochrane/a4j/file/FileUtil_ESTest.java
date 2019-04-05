/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 12:16:34 GMT 2019
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
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
      File file0 = fileUtil0.getBrowseNodeFile("pv-Ld}(u@xbsL4:dHWS", "Hf 40eV{Lg}2-I~O9", "(%{NRNf0QG3lFtT#");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "0/H9{L", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer((-145));
      arrayList0.add((Object) integer0);
      File file0 = fileUtil0.getAccessories("SimilaritySearch", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("'4;y.oR-*{A*/0:", "offer=", "lqf<eBpH[G", "f6Ay:ZFuC'Mc&9`");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("{;>gXAcZ96ojg7&V/", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("[Or? }aP5pUp@7ft", "[Or? }aP5pUp@7ft", "KeywordSearch=", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "{;>gXAcZ96ojg7&V/");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(">1.>#", ">1.>#", ">1.>#", "Le,#%W3I", "Le,#%W3I", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("a+i:`%o", "net.kencochrane.a4j.util.LoadProperties", "", "k_", "a_", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "_My", "0/H9{L");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("w1_", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("lite", "", "", "t{");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "{*hc", "{*hc", "ta_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("wRl:oe", "/rEzGUxg':c4", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("rqw>iv", "i", "s.tD`rk ", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "a+i:`%o", "", "a+i:`%o");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "popcornmonste2-20", "popcornmonste2-20");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("{;>gXAcZ96ojg7&V/", "", "{;>gXAcZ96ojg7&V/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "Hf 40eV{Lg}2-I~O9", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "}oy\"Zq:4", "f6Ay:ZFuC'Mc&9`");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("#:A.oFH", "#:A.oFH", "", "ba{SI3~>MB", "#:A.oFH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("MIf.Yi;B95<jnK)6", "ta_", (String) null, " \"NVLq", "upe.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "ta_", "|rA_nZ#~+>N)6", "asg>A4LRC8>9ea2", "a_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("ts_", "w1_", "@EVhSPd*H*", "ts_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("J]+zAkdD5c<S-!n7(Z", "new", "s.tD`rk ", "iYM:p.r>HFp{CLZ;S", (String) null, "new");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("net.kencochrane.a4j.util.LoadProperties", "", "", "cacheDir", "", "cacheDir");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("$j7", "$j7", "dz!Y", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "86400000", "", "d:Tt|\"M44JGR ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, "pv-Ld}(u@xbsL4:dHWS", "c-!Fg1h0BwI$|y");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("lqf<eBpH[G", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "@?\"Q1LZX+GoMG%@B>:");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("net.kencochrane.a4j.util.LoadProperties", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer((-145));
      arrayList0.add((Object) integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("wRl:oe", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("wRl:oe", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "qK)D3HBVHT[s~%C");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("c-!Fg1h0BwI$|y", "c-!Fg1h0BwI$|y", "c-!Fg1h0BwI$|y", "", "ShiVBe", "Hf 40eV{Lg}2-I~O9");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("1", "", (String) null, "{*hc");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("#:A.oFH");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_LITE.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "X+DP.MW<b)J&");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("lite", "X`RP/3O\"l4jRF]RTB");
      assertEquals(12, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=a4j-config.txt&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "f`?TZ$");
      File file0 = fileUtil0.getSimilarItems("", "a4j-config.txt");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      File file0 = fileUtil0.getSimilarItems("", "w1_");
      assertTrue(file0.isFile());
      assertNotNull(file0);
      assertTrue(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_W1_.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("w1_", arrayList0);
      assertEquals(3, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("qXg_Rg7>/vLpHhu{C", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("t{", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("SimilaritySearch", "a4j-config.txt", ".xml", "2F%Jd.-_lG");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=X`RP/3O\"l4jRF]RTB&type=X`RP/3O\"l4jRF]RTB&page=null&offerstatus=^LF2U/)&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "X+DP.MW<b)J&");
      File file0 = fileUtil0.downloadThirdPartySearchFile("X`RP/3O\"l4jRF]RTB", "X`RP/3O\"l4jRF]RTB", (String) null, "^LF2U/)");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&R-n!^HhqVan=g_&mode=R-n!^HhqVan&type=e{,Y3AG&page=g_&offer=R-n!^HhqVan&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#AfabN");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("R-n!^HhqVan", "g_", "R-n!^HhqVan", "e{,Y3AG", "g_", "R-n!^HhqVan");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("dz!Y", "offer=", "offer=", "iYM:p.r>HFp{CLZ;S");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "qXg_Rg7>/vLpHhu{C", "t{", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("Yj3L4'pTz1}[P@", "page=", "Yj3L4'pTz1}[P@");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/7VEF$(*C@_%%|@YVHDM=E(MPFHKEL_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("7vef$(*C@", "%%|@YvHdM=E(mpfhKel", (String) null);
      assertNotNull(file0);
      assertEquals("7VEF$(*C@_%%|@YVHDM=E(MPFHKEL_NULL.XML", file0.getName());
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=e{,Y3AG&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#AfabN");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "e{,Y3AG", "R-n!^HhqVan");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/{;>GXACZ96OJG7&V/_{;>GXACZ96OJG7&V/_F6AY:ZFUC'MC&9`_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "U;R07.2{&ZK.f:H");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("{;>gXAcZ96ojg7&V/", "f6Ay:ZFuC'Mc&9`", "{;>gXAcZ96ojg7&V/", "");
      assertEquals(15, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile(")(X:zqA", "lqf<eBpH[G");
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_K_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "g_");
      File file0 = fileUtil0.getAccessories("k_", (ArrayList) null);
      assertNotNull(file0);
      assertEquals(2L, file0.length());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile(";{f");
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=null&type=t{&offerpage=a+i:`%o&offer=6(x,|[P8M<y9#n1H,&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "k_");
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "t{", "6(x,|[P8M<y9#n1H,", "a+i:`%o", "t{");
      assertFalse(boolean0);
  }
}