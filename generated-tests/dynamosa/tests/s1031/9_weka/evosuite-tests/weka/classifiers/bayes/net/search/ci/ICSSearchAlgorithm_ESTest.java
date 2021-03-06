/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 01:35:04 GMT 2019
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 458);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[0][7];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.existsSepSet(2, 458, 2, booleanArray0);
      assertNull(iCSSearchAlgorithm_SeparationSet0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, 10);
      arrayList0.add(attribute0);
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale locale0 = Locale.CANADA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      Attribute attribute1 = new Attribute("%27Pe`Y", list0);
      arrayList0.add(attribute1);
      Instances instances0 = new Instances("-cardinality <num>", arrayList0, 4891);
      arrayList0.add(attribute0);
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[7];
      intArray0[0] = (-1015);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(122);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.setMaxCardinality((-2978));
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains((-5427));
      assertEquals((-2978), iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("$Revision: 8034 $", arrayList0, 1287);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[2][8];
      int int0 = iCSSearchAlgorithm0.next((-1), (-3082), 69, booleanArray0);
      assertEquals(0, int0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("W", arrayList0, 1287);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[7][4];
      int int0 = iCSSearchAlgorithm0.next(1287, 1287, 1287, booleanArray0);
      assertEquals(1288, int0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attribute attribute0 = new Attribute("N");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.name(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.name(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("h4", arrayList0, 872);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      iCSSearchAlgorithm0.maxn();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.maxn();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-2429));
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals((-2429), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setOptions((String[]) null);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[0];
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      assertEquals(0, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 896);
      double[] doubleArray0 = new double[8];
      SparseInstance sparseInstance0 = new SparseInstance((-1707.2), doubleArray0);
      instances0.add((Instance) sparseInstance0);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      bayesNet0.setOptions(stringArray0);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, bayesNet0.m_Instances);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("<fX ", arrayList0, 134);
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.m_Instances = instances0;
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.setDebug(true);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, bayesNet0.m_Instances);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-659), 2, (-4441), (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[1][0];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(0, 0, 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ICSSearchAlgorithm.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ICSSearchAlgorithm.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(0, 0, 0, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][3];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes((boolean[][]) null, (boolean[][]) null, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][7];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][6];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[3][5];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][9];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][7];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph((boolean[][]) null, iCSSearchAlgorithm_SeparationSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][1];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "9)9GF`L";
      stringArray0[1] = "9)9GF`L";
      stringArray0[2] = "-";
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-cardinality";
      stringArray0[1] = "-K <number of features>";
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-K <number of features>\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-cardinality";
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No value given for -cardinality option.
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][9];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-1), (-1646), (-1), booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("use", arrayList0, 893);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(893);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 893, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("/repo.zip", arrayList0, 91);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name((-3581));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3581
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.maxn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-613));
      boolean[][] booleanArray0 = new boolean[0][4];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet((-613), (-613), (-613), booleanArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm$SeparationSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][1];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(1000, 1000, 1000, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1000
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Attribute attribute0 = new Attribute("&", "&");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[3][0];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Attribute attribute0 = new Attribute("$2Cwp'1xK.");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[0][2];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections((boolean[][]) null, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Attribute attribute0 = new Attribute("$2Cwp'1xK.");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[5][0];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcArcDirections(booleanArray0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(5, stringArray0.length);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Attribute attribute0 = new Attribute("N");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add(attribute0);
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      boolean[][] booleanArray1 = new boolean[4][6];
      booleanArray1[1] = booleanArray0;
      booleanArray1[2] = booleanArray0;
      iCSSearchAlgorithm0.calcArcDirections(booleanArray1, booleanArray1);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Attribute attribute0 = new Attribute("9)9GF`L");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("relational", arrayList0, 2);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-2118));
      try { 
        iCSSearchAlgorithm0.search((BayesNet) null, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Attribute attribute0 = new Attribute("N");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      arrayList0.add(attribute0);
      boolean[][] booleanArray0 = new boolean[14][6];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Attribute attribute0 = new Attribute("&", "&");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[3][0];
      boolean[] booleanArray1 = new boolean[10];
      booleanArray1[0] = true;
      booleanArray0[2] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(2, 2, 1, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Attribute attribute0 = new Attribute("", "");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[9][6];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = true;
      booleanArray0[0] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(0, 2, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Attribute attribute0 = new Attribute("");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[7][0];
      boolean[] booleanArray1 = new boolean[9];
      booleanArray0[2] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(2, 2, 1, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 1287);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[7][4];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-3082), (-3082), 1287, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(117);
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 896);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      boolean[][] booleanArray0 = new boolean[7][4];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.existsSepSet(66, 66, 117, booleanArray0);
      assertNull(iCSSearchAlgorithm_SeparationSet0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Attribute attribute0 = new Attribute("N");
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("@end", arrayList0, 1);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[4][6];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(566);
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains((-1));
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String[] stringArray0 = Locale.getISOLanguages();
      ICSSearchAlgorithm.main(stringArray0);
      assertEquals(188, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      ArrayList<String> arrayList1 = new ArrayList<String>();
      Attribute attribute0 = new Attribute(" ", arrayList1);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("", arrayList0, 896);
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, instances0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.BayesNet", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals("8034", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }
}
