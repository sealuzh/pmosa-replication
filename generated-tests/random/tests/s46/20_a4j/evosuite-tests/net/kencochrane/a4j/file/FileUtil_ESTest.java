/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:36:51 GMT 2019
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
      fileUtil0.renameFile("]A/r9w{\"Zo{", "AR,@zAR\"wiN=ADB&");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("fLz}u9FGKg!3N.(", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile(";kH&)9OVVfnr,d!7", "4DuN:+voPpUw-w.w", "Z?j");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", (String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "O_XZ#?2P+2[~ER7g'", "O_XZ#?2P+2[~ER7g'");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "$-", "", "all");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "t75U_@=OTW{>Px|j", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("N20JH?S3vDbOvl", "", (String) null, "3a0yRv 3ft&j'TL77Fh");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "@8#/@\"", "", "@8#/@\"");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "GF!0rhu+V");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("NKS[e!+z", (String) null, "NKS[e!+z", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("en", "w;^]qby'bfG/_0C", "w;^]qby'bfG/_0C", "en");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(2176);
      arrayList0.add(integer0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("net.kencochrane.a4j.file.FileUtil", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("net.kencochrane.a4j.file.FileUtil", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("c_", "", (String) null, "@8#/@\"");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("cacheDir", "", "cacheDir", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("&CartId=", "N!p", "&CartId=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("GF!0rhu+V", "dRx5JkC+zc*t", "", "o_dga,", "$TlveQ9m?L};VsNB'#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, "Ir)Q", "d>H'ySY5X)e6pX", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("g_", "g_", ".DB**;", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "There is no Properties File Setting to default", "There is no Properties File Setting to default", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "JR.2'LYd>@", "tKnX=aC^E8x7Ng~<", "K@O('dx:x", "cacheDir", "K@O('dx:x");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", (String) null, (String) null, "", "", "?a:O");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "@']", "{I#B;YfP", "ts_", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("GF!0rhu+V", "associateID", (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "?rZ", "?rZ", "3rd_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("&CartId=", "&CartId=", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "c_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "$U_lVo");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer(279);
      arrayList0.add((Object) integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("taog_", arrayList0, "X%-/Lj?");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("amazonServerURL", "amazonServerURL");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("@ #v", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("net.kencochrane.a4j.file.FileUtil", "", "", "@8#/@\"");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("!'R3Jl%{G", "ts_", "", "px(.Q_R96=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("3|J %i9W~|fgu:*", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("3a0yRv 3ft&j'TL77Fh");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart(".DB**;");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Z?j");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", ",51 {5KDtq?!5ncXx:]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("c_", "@8#/@\"");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=}F;tJ>2OwN:p&type=&page=&offerstatus=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "34&h");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("}F;tJ>2OwN:p", "", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "cacheDir", "&", "K@O('dx:x", "c[V2f5Z[");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&t_=6Am7V&mode=&type=Z?j&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "34&h");
      File file0 = fileUtil0.downloadGenericSearchFile("t_", "6Am7V", "", "Z?j", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(".xml", "", ".xml", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("y1AcEN~qA", "@ #v");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "GF!0rhu+V", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/THERE IS NO PROPERTIES FILE SETTING TO DEFAULT_THERE IS NO PROPERTIES FILE SETTING TO DEFAULT_THERE IS NO PROPERTIES FILE SETTING TO DEFAULT.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "a4j-config.txt");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("There is no Properties File Setting to default", "There is no Properties File Setting to default", "There is no Properties File Setting to default");
      assertEquals(15, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=J[p,cu<V2ayz_Y&type=lite&page=J[p,cu<V2ayz_Y&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "bPUV{9UN%tO>d7");
      File file0 = fileUtil0.getBrowseNodeFile("J[p,cu<V2ayz_Y", "", "J[p,cu<V2ayz_Y");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/N!P_U_&CARTID=_U.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("N!p", "&CartId=", "U", "U");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("dRx5JkC+zc*t", "o_dga,", "", "associateID");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/!'R3JL%{G__!'R3JL%{G_!'R3JL%{G.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "c_");
      File file0 = fileUtil0.getASINFile("!'R3Jl%{G", "!'R3Jl%{G", "", "!'R3Jl%{G");
      assertEquals(2L, file0.length());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "3rd_");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_C_.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("c_", "@8#/@\"");
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      fileUtil0.renameFile("", "3rd_");
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Ry}O0YMc'Be3\"nIR=&type=r!+ySfsD7lY([pGr_&offerpage=&offer=Ry}O0YMc'Be3\"nIR=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Ry}O0YMc'Be3\"nIR=");
      File file0 = fileUtil0.getASINFile("Ry}O0YMc'Be3\"nIR=", "r!+ySfsD7lY([pGr_", "Ry}O0YMc'Be3\"nIR=", "");
      assertNull(file0);
  }
}
