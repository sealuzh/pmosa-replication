/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:28:07 GMT 2019
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
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
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
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SIMILARITYSEARCH.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("SimilaritySearch", "GGbyPz3ft-?5i&.0?I");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/=4K)H$_,';/S~QB*>;Z_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("=4k)h$", ",';/s~qB*>;Z", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/DITOT5IN^NWOYO%>,__NULL_DITOT5IN^NWOYO%>,.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("dITOt5IN^nWOyO%>,", (String) null, "", "dITOt5IN^nWOyO%>,");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[3];
      System.setCurrentTimeMillis((byte) (-88));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SHOPPINGCART=CLEAR&F=XML&DEV-T=.XML");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getSimilarItems("ShoppingCart=clear&f=xml&dev-t=", "a_");
      assertEquals((-88L), file0.lastModified());
      assertNotNull(file0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_?.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("?", (String) null);
      assertEquals("S_?.XML", file0.getName());
      assertNotNull(file0);
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("TA__NULL_TA_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "hELPw");
      File file0 = fileUtil0.getBrowseNodeFile("ta_", (String) null, "ta_");
      assertNotNull(file0);
      assertEquals(6L, file0.length());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals("A_.XML", file0.getName());
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_CACHEDIR_CACHEDIR_1.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile((String) null, "cacheDir", "cacheDir", "1");
      assertNotNull(file0);
      assertEquals("/NULL_CACHEDIR_CACHEDIR_1.XML", file0.toString());
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/REOSMC3AO=$GSW<$+R[_NET.KENCOCHRANE.A4J.FILE.FILEUTIL_REOSMC3AO=$GSW<$+R[_NET.KENCOCHRANE.A4J.FILE.FILEUTIL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=add&f=xml&dev-t=");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = fileUtil0.getASINFile("reOsmC3aO=$GsW<$+r[", "reOsmC3aO=$GsW<$+r[", "net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil");
      assertNotNull(file0);
      assertEquals("REOSMC3AO=$GSW<$+R[_NET.KENCOCHRANE.A4J.FILE.FILEUTIL_REOSMC3AO=$GSW<$+R[_NET.KENCOCHRANE.A4J.FILE.FILEUTIL.XML", file0.getName());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SIMILARITYSEARCH.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("SimilaritySearch", "GGbyPz3ft-?5i&.0?I");
      assertEquals(2, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/MPY ME-D1__RR-|2IJ]U+D|8.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("MPY Me-d1", "", "Rr-|2iJ]U+d|8");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_,D8 8.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(",d8 8", (ArrayList) null);
      assertEquals(1, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/DITOT5IN^NWOYO%>,__NULL_DITOT5IN^NWOYO%>,.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "t=");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("dITOt5IN^nWOyO%>,", (String) null, "", "dITOt5IN^nWOyO%>,");
      assertEquals(3, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "g_");
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      System.setCurrentTimeMillis((-2282L));
      FileUtil fileUtil0 = new FileUtil();
      File file0 = MockFile.createTempFile(">Q!DR)", "", (File) null);
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("9xK,", ".tn=");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/U]EVTXX5E'_5I{:DO_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("u]evtXX5E'", "5I{:DO", (String) null);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
      assertEquals("U]EVTXX5E'_5I{:DO_NULL.XML", file0.getName());
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("offerstatus=");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "amazonServerURL");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("HjJ$lEIh:k", (String) null, "? -`i:v-o\"a\"Tunr7!i");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, ".!6?cM&=", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("*dL0cYl+YpQ", (ArrayList) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("cacheLife");
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("?icC/s{ayV#''dZ", "E3~L$-Bx!^", "type=", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("43VtX #*#M/", "_q", (String) null, "1");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "", "cacheDir", "k*~oM`ZP#`p");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", (String) null, "ts_", "W*)FGFPsn]Oru70A");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile(" Vc", " Vc", "", "a_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("*.{Mt#}`BG,QB", (String) null, "amtw$JnSerDeDURL", "*.{Mt#}`BG,QB");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "", (String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("&", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("a_", "vKxjR;9.?=;", "", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("MPY Me-d1", "", "MPY Me-d1", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, "", "7<,#OvlF@%!03gz");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", (String) null, (String) null, ")\"Y]Lxn4th:-#G!RK7A");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("Gf 458", "all", "Gf 458", (String) null, "Gf 458", "Gf 458");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "offerstatus=", (String) null, "K", (String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("a4j-config.txt", (String) null, "a4j-config.txt", "", "", "3CV&1 d:-d!P}7");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("69!}`-7;6B", "", "69!}`-7;6B", "V2", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "\"bsB~+aA4y\".CAlW", "B6Ny[1OVrin", "offerstatus=", "plr", "3rd_");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "vKxjR;9.?=;", "", "", "Y+d$", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("=4k)h$", ",';/s~qB*>;Z", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("AsinSearch", "=4k)h$", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("A>c<g*", (String) null, "n3vC 9$n(hj");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "s3{@", "DzzmV");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "\"(R]pikhT>Fiz\fD{!k", "\"(R]pikhT>Fiz\fD{!k");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("F'g", "WeXm]", ",U.7@HN]k", (String) null);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Y'3R'q]Vr`6%bd7du", "", "Y'3R'q]Vr`6%bd7du", "");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("A>c<g*", "", (String) null, "A>c<g*");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "v", ">A{&ELlgW;*g)mU{zG");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "offerstatus=", "", ".wtg");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, ",J]+cm", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("3rd_", "q1JbzfVC?0", "", "c_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("&t=", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "V2", ",J]+cm");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "1", ":Et$~>O<uUGpg$", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "gS{", "", (String) null, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "AsinSearch", "", "86400000", ".xml");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "Bpjk5H>GO", "z9fO:/HC&nA`i;<!f", "*%iw'\"_D%2CgN3\"s)");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "h!</~Tha-\"u]|^", (String) null, "", "b_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("3rd_", (String) null, (String) null, "SimilaritySearch", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "KDB*{u`W>u/PaAa", (String) null, "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, "l=", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "I_6+0h,]l!xB_yMgG", "", "3rd_", "-", (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "KDB*{u`W>u/PaAa", (String) null, "cacheLife");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", (String) null, "lite", (String) null, "PV", "4<C`,rf|&rha}");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("net.kencochrane.a4j.util.LoadProperties", "", (String) null, "", "cacheDir", "s_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "$lcVi}0jq$^(", "", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "g_", "SimilaritySearch", "C", "ts_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("\"bsB~+aA4y\".CAlW", (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("0FG", (String) null, "mCFYbi}Sj9Zl_", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "@d)4+`ys", "", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("jMpPmK-Lmqd", "jMpPmK-Lmqd", "@", "9xK,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("t=", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "G7zt<;tct#!v<Ldto=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("^d,T7ZkN7(", (ArrayList) null, "])");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
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
  public void test099()  throws Throwable  {
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
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=x`T<,pzezW@)'SH?&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "x`T<,pzezW@)'SH?");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "r\"p7]>fvrg");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals(9L, file0.length());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=a_&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "GGbyPz3ft-?5i&.0?I");
      File file0 = fileUtil0.downloadThirdPartySearchFile("a_", "", "", "");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("u]evtXX5E'", (String) null, (String) null, "5I{:DO");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=O%7BzyV&type=b_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "GGbyPz3ft-?5i&.0?I");
      File file0 = fileUtil0.downloadBlendedSearchFile("O{zyV", "b_");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/U]EVTXX5E'_5I{:DO_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "5I{:DO");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("u]evtXX5E'", "5I{:DO", (String) null);
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(7L, file0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("cacheDir");
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("AmBe^Jw");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&Asin.&type=lite&offerpage=MAUB&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "S~m.,]x");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("&Asin.", "MAUB", "bX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=x`T<,pzezW@)'SH?&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.file.FileUtil");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "x`T<,pzezW@)'SH?");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("AmBe^Jw", arrayList0);
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NC.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Nc", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&ShoppingCUrt=motiYy&f=xml&dev-t==&mode=uz,s8&type=&page=uz,s8&offer=ShoppingCUrt=motiYy&f=xml&dev-t=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCUrt=motiYy&f=xml&dev-t=");
      File file0 = fileUtil0.downloadGenericSearchFile("ShoppingCUrt=motiYy&f=xml&dev-t=", "", "uz,s8", "", "uz,s8", "ShoppingCUrt=motiYy&f=xml&dev-t=");
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=a_&mode=ta_&type=cacheLife&page=&Asin.&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "^%PvHB!2M_");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("a_", "ta_", "cacheLife", "&Asin.");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-%7E%7C%2B&type=0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
      assertNull(fileInputStream0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/MPY ME-D1__RR-|2IJ]U+D|8.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCUrt=motiYy&f=xml&dev-t=");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("MPY Me-d1", "", "Rr-|2iJ]U+d|8");
      assertEquals(32, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=AsinSearch&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "GGbyPz3ft-?5i&.0?I");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "AsinSearch", "a_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_ASINSEARCH_PF<V 0`TYZV>RFR_0V|+.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "PF<v 0`tYZV>rfR", "AsinSearch", "0V|+");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("net.kencochrane.a4j.file.FileUtil", "reOsmC3aO=6$GsW<$+r[");
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NET.KENCOCHRANE.A4J.FILE.FILEUTIL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=amazonServerURL&offerpage=&offer=a_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "K6pDl(]~w=_L");
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "amazonServerURL", "a_", "", "Rr-|2iJ]U+d|8");
      assertFalse(boolean0);
  }
}
