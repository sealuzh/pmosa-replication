/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 19:22:16 GMT 2019
 */

package weka.core.stemmers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.TechnicalInformation;
import weka.core.stemmers.LovinsStemmer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LovinsStemmer_ESTest extends LovinsStemmer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("eu#|,l|O,zb(iUeIEv}");
      assertEquals("eu#|,l|o,zb(iueief}", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "ious";
      stringArray0[1] = "ionally";
      stringArray0[2] = " option.";
      stringArray0[3] = "+)8^3BB7/i%0";
      stringArray0[4] = "-h";
      LovinsStemmer.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LovinsStemmer.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LovinsStemmer.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stemString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.stemmers.LovinsStemmer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      // Undeclared exception!
      try { 
        lovinsStemmer0.stem((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("#");
      assertEquals("#", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      TechnicalInformation technicalInformation0 = lovinsStemmer0.getTechnicalInformation();
      assertEquals(TechnicalInformation.Type.ARTICLE, technicalInformation0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("learnyz");
      assertEquals("learnys", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("pdfyt");
      assertEquals("pdfys", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("masonet");
      assertEquals("masonet", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The editinn of a book---for example, ``Second''. This should be an ordinal, and should have the first letter capitalized, as shown here; the standard styles convert to lower case when necessary.");
      assertEquals("th editin of a book---for exampl, ``second''. th should be an ordin, and should hav th first letter capital, as shown hes; th standard styl convers to lower cas when neces.", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("iedmit");
      assertEquals("iedmis", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dqucui|opher");
      assertEquals("dqucu|opher", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("esrud");
      assertEquals("esrus", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ytimlud");
      assertEquals("ytimlus", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("pfnherond");
      assertEquals("pfnherons", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("erisend");
      assertEquals("erisens", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("end");
      assertEquals("ens", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("/bquggp?}jyn8~plgyzend");
      assertEquals("/bquggp?}jyn8~plgyzens", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("erid");
      assertEquals("eris", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("cislid");
      assertEquals("cislis", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("cid");
      assertEquals("cis", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("vad");
      assertEquals("vas", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("uad");
      assertEquals("uas", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("mrnumberlux");
      assertEquals("mrnumberluc", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("filix");
      assertEquals("filic", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("8034ex");
      assertEquals("8034ec", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("40jax");
      assertEquals("40jac", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Title of a book, part of which is being cited. See the LaTeX book for how to type titles. For book entries, use the title field instead.");
      assertEquals("titl of a book, part of which is being cit. se th latic book for how to typ titl. for book entr, us th titl field instead.", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th www univers resourc loc that point to th item being refer. th oft is us for techn report to point to th ftp sit whes th postscript sourc of th report is loc.luxpex");
      assertEquals("th www univer resourc loc that point to th item being refer. th oft is us for techn report to point to th ftp sit wh th postscript sourc of th report is loc.luxpic", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dex");
      assertEquals("dic", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("8034bex");
      assertEquals("8034bic", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("f;aully");
      assertEquals("f;aul", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString(",ull");
      assertEquals(",l", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.");
      assertEquals("a stemmer ba on th lovin stemmer, describ he:\n\njl beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("7ka*OLv^");
      assertEquals("7k*olut^", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("metr");
      assertEquals("meter", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("istr");
      assertEquals("ister", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("FI2umpt");
      assertEquals("fi2um", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Can't construct a path to file relative to user dir.");
      assertEquals("can't construc a path to fil rel to user dir.", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("arra-dimns of 'new string[3][4][]':vpand");
      assertEquals("ar-dimn of 'new string[3][4][]':vpans", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString(",*^xIjSdu^LFaPP");
      assertEquals(",*^xijsdu^lfap", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("XkgG>`J}l`h:u']uq");
      assertEquals("xkg>`j}l`h:u']uq", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("wZ_`pMQh&dK9aWtIDD");
      assertEquals("wz_`pmqh&dk9awtid", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Lbb");
      assertEquals("lb", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("aical");
      assertEquals("aic", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Any addit+onal information that can help &he reader. The first wocd should be capitalized.");
      assertEquals("any addit+onal inform that can help &he reader. th first wocd should be capital.", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("dLnqJfar");
      assertEquals("dlnqjfar", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("4MIaR+ruyH0q|q]_br");
      assertEquals("4mi+ruyh0q|q]_br", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ediRPtor");
      assertEquals("edirb", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ZtfeZoc3<Epron");
      assertEquals("ztfezoc3<epron", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("V;HXRyL]Q~");
      assertEquals("v;hxr]q~", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A document having an author and title, but not formally published.");
      assertEquals("a docum hav an author and titl, but not form publ.", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The number of a journal, magazine, technical report, or of a work in a series. An issue of a journal or magazine is usually identified by its volume and number; the organization that issues a technical report usually gives it a number; and sometimes books are given numbers in a named series.");
      assertEquals("th number of a journ, magaz, techn report, or of a work in a ser. an issu of a journ or magaz is usu identif by it volum and number; th organ that issu a techn report usu giv it a number; and sometim book ar giv number in a nam ser.", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The WWW Universal Resource Locator that points to the item being referenced. This often is used for technical reports to point to the ftp site where the postscript source of the report is located.");
      assertEquals("th www univers resourc loc that point to th item being refer. th oft is us for techn report to point to th ftp sit whes th postscript sourc of th report is loc.", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("Induction of decision trees");
      assertEquals("induction of decision tree", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.");
      assertEquals("a stemmer bas on th lovin stemmer, describ hes:\n\njuli beth lovin (1968). developm of a stem algorithm. mechan transl and comput lingu. 11:22-31.", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("nam(s) of edit(s), typ as indic in th latic book. if ther is als an author field, then th edit field giv th edit of th book or collect in which th refer appear.");
      assertEquals("nam(s) of edit(s), typ as ind in th lat book. if ther is al an author field, then th edit field giv th edit of th book or collect in which th refer appear.", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("ious");
      assertEquals("ious", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("b9Qum");
      assertEquals("b9qum", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("a work that is print and bound, but without a nam publishes or sponsor institut.");
      assertEquals("a work that is print and bound, but without a nam publish or spons institut.", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Get position of otion -o: ");
      assertEquals("ges posit of otion -o: ", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th first letter capital, as shown hes; th standard styl convers to lower cas when neces.pand");
      assertEquals("th edit of a book---for exampl, ``second''. th should be an ordin, and should hav th first letter capit, as shown he; th standard styl conver to lower ca when nec.pans", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ancies");
      assertEquals("anci", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Macine Lar[ing");
      assertEquals("macin lar[ing", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stem("otide");
      assertEquals("ot", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("The year of publication or, for an unpublished work, the year it was written. Generally it should consist of four numerals, such as 1984, although the standard styles can handle any year whose last four nonpunctuation characters are numerals, such as `hbox{(about 1984)}'.");
      assertEquals("th year of public or, for an unpubl work, th year it wa writ. gener it should cons of four numer, such as 1984, although th standard styl can handl any year whos last four nonpunctu character ar numer, such as `hbox{(about 1984)}'.", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("ement");
      assertEquals("ement", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.stemString("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.");
      assertEquals("us for alphabes, cros refer, and creat a label when th ``author'' inform is mis. th field should not be confus with th key that appear in th cit command and at th begin of th databas entr.", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.globalInfo();
      assertEquals("A stemmer based on the Lovins stemmer, described here:\n\nJulie Beth Lovins (1968). Development of a stemming algorithm. Mechanical Translation and Computational Linguistics. 11:22-31.", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LovinsStemmer lovinsStemmer0 = new LovinsStemmer();
      String string0 = lovinsStemmer0.toString();
      assertEquals("weka.core.stemmers.LovinsStemmer", string0);
  }
}
