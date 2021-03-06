/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:49:54 GMT 2019
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.classifiers.bayes.BayesNet;
import weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm;
import weka.core.Attribute;
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ICSSearchAlgorithm_ESTest extends ICSSearchAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("yN?i`PLf", arrayList0, 542);
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.listOptions();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "8034";
      stringArray0[1] = "8034";
      ICSSearchAlgorithm.main(stringArray0);
      iCSSearchAlgorithm0.listOptions();
      iCSSearchAlgorithm0.listOptions();
      boolean[][] booleanArray0 = new boolean[7][5];
      boolean[] booleanArray1 = new boolean[3];
      booleanArray1[0] = false;
      booleanArray1[1] = false;
      booleanArray1[2] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[5];
      booleanArray2[0] = false;
      booleanArray2[1] = true;
      booleanArray2[2] = false;
      booleanArray2[3] = false;
      booleanArray2[4] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[5];
      booleanArray3[0] = true;
      booleanArray3[1] = false;
      booleanArray3[2] = false;
      booleanArray3[3] = false;
      booleanArray3[4] = true;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[3];
      booleanArray4[0] = false;
      booleanArray4[1] = true;
      booleanArray4[2] = false;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[3];
      booleanArray5[0] = false;
      booleanArray5[1] = false;
      booleanArray5[2] = true;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[8];
      booleanArray6[0] = false;
      booleanArray6[1] = false;
      booleanArray6[2] = false;
      booleanArray6[3] = false;
      booleanArray6[4] = false;
      booleanArray6[5] = false;
      booleanArray6[6] = true;
      booleanArray6[7] = true;
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[6];
      booleanArray7[0] = true;
      booleanArray7[1] = false;
      booleanArray7[2] = false;
      booleanArray7[3] = true;
      booleanArray7[4] = false;
      booleanArray7[5] = false;
      booleanArray0[6] = booleanArray7;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-54), 548, (-54), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 548
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1231);
      intArray0[1] = (-1);
      intArray0[2] = (-650);
      intArray0[3] = 0;
      intArray0[4] = 4498;
      intArray0[5] = 87;
      intArray0[6] = (-3299);
      intArray0[7] = 84;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(3120);
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      iCSSearchAlgorithm0.getOptions();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int int0 = (-3988);
      int[] intArray0 = new int[3];
      intArray0[0] = (-3988);
      intArray0[1] = (-3988);
      intArray0[2] = (-3988);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains((-3988));
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcScoreWithMissingParent(1, (-3517));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(5, stringArray0.length);
      
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      intArray0[1] = 2;
      int int0 = 3006;
      iCSSearchAlgorithm_SeparationSet0.getRevision();
      intArray0[2] = 3006;
      int int1 = 1063;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.logScore(1580);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = 1;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      iCSSearchAlgorithm0.listOptions();
      boolean[][] booleanArrayArray0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "gone";
      stringArray0[1] = "'J";
      stringArray0[2] = "<hRJx";
      stringArray0[3] = "f?3%c)SM?\u0003g";
      stringArray0[4] = "Rr`B8=`8q,z";
      stringArray0[5] = "*6\"";
      stringArray0[6] = "-cardinality <num>";
      iCSSearchAlgorithm0.getRevision();
      stringArray0[7] = "$s/rDX)Xn6Q[7S";
      iCSSearchAlgorithm0.setMarkovBlanketClassifier(false);
      iCSSearchAlgorithm0.setOptions(stringArray0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(1, 1, 1, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "^uK<6#t'olv.@xj";
      stringArray0[1] = ".Ol0L";
      stringArray0[2] = "";
      stringArray0[3] = "Wq;";
      stringArray0[4] = "";
      stringArray0[5] = "1 {,K@4-X";
      stringArray0[6] = "pv";
      stringArray0[7] = "";
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][3];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[6][9];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[0];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray2 = new ICSSearchAlgorithm.SeparationSet[1];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray2[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[1] = iCSSearchAlgorithm_SeparationSetArray2;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray3 = new ICSSearchAlgorithm.SeparationSet[7];
      iCSSearchAlgorithm_SeparationSetArray3[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray3[1] = iCSSearchAlgorithm_SeparationSet0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray3[2] = iCSSearchAlgorithm_SeparationSet1;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet2 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray3[3] = iCSSearchAlgorithm_SeparationSet2;
      iCSSearchAlgorithm_SeparationSetArray3[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray3[5] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray3[6] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[2] = iCSSearchAlgorithm_SeparationSetArray3;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray4 = new ICSSearchAlgorithm.SeparationSet[5];
      iCSSearchAlgorithm_SeparationSetArray4[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray4[1] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray4[2] = iCSSearchAlgorithm_SeparationSet2;
      iCSSearchAlgorithm_SeparationSetArray4[3] = iCSSearchAlgorithm_SeparationSet2;
      iCSSearchAlgorithm_SeparationSetArray4[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[3] = iCSSearchAlgorithm_SeparationSetArray4;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray5 = new ICSSearchAlgorithm.SeparationSet[1];
      iCSSearchAlgorithm_SeparationSetArray5[0] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[4] = iCSSearchAlgorithm_SeparationSetArray5;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray6 = new ICSSearchAlgorithm.SeparationSet[5];
      iCSSearchAlgorithm_SeparationSetArray6[0] = iCSSearchAlgorithm_SeparationSet1;
      iCSSearchAlgorithm_SeparationSetArray6[1] = iCSSearchAlgorithm_SeparationSet1;
      iCSSearchAlgorithm_SeparationSetArray6[2] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray6[3] = iCSSearchAlgorithm_SeparationSet2;
      iCSSearchAlgorithm_SeparationSetArray6[4] = iCSSearchAlgorithm_SeparationSet0;
      iCSSearchAlgorithm_SeparationSetArray0[5] = iCSSearchAlgorithm_SeparationSetArray6;
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
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[5][7];
      boolean[] booleanArray1 = new boolean[4];
      booleanArray1[0] = false;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[7];
      booleanArray3[0] = false;
      booleanArray3[1] = true;
      booleanArray3[2] = false;
      booleanArray3[3] = false;
      booleanArray3[4] = true;
      booleanArray3[5] = true;
      booleanArray3[6] = true;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[7];
      booleanArray4[0] = true;
      booleanArray4[1] = false;
      booleanArray4[2] = true;
      booleanArray4[3] = false;
      booleanArray4[4] = true;
      booleanArray4[5] = true;
      booleanArray4[6] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[9];
      booleanArray5[0] = true;
      booleanArray5[1] = true;
      booleanArray5[2] = true;
      booleanArray5[3] = false;
      booleanArray5[4] = true;
      booleanArray5[5] = false;
      booleanArray5[6] = true;
      booleanArray5[7] = true;
      booleanArray5[8] = false;
      booleanArray0[4] = booleanArray5;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(827, (-982), 103, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1));
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSet0.contains((-1));
      boolean[][] booleanArray0 = new boolean[6][2];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[2];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[5];
      booleanArray4[0] = false;
      booleanArray4[1] = true;
      booleanArray4[2] = false;
      booleanArray4[3] = false;
      booleanArray4[4] = false;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[1];
      booleanArray5[0] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[9];
      booleanArray6[0] = false;
      booleanArray6[1] = false;
      booleanArray6[2] = false;
      booleanArray6[3] = true;
      booleanArray6[4] = false;
      booleanArray6[5] = false;
      booleanArray6[6] = false;
      booleanArray6[7] = true;
      booleanArray6[8] = false;
      booleanArray0[5] = booleanArray6;
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
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[6][9];
      boolean[] booleanArray1 = new boolean[9];
      booleanArray1[0] = true;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = false;
      booleanArray1[4] = true;
      booleanArray1[5] = false;
      booleanArray1[6] = true;
      booleanArray1[7] = true;
      booleanArray1[8] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[7];
      booleanArray2[0] = true;
      booleanArray2[1] = true;
      booleanArray2[2] = true;
      booleanArray2[3] = true;
      booleanArray2[4] = true;
      booleanArray2[5] = true;
      booleanArray2[6] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[9];
      booleanArray3[0] = false;
      booleanArray3[1] = true;
      booleanArray3[2] = false;
      booleanArray3[3] = true;
      booleanArray3[4] = false;
      booleanArray3[5] = true;
      booleanArray3[6] = false;
      booleanArray3[7] = false;
      booleanArray3[8] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[9];
      booleanArray4[0] = true;
      booleanArray4[1] = true;
      booleanArray4[2] = false;
      booleanArray4[3] = true;
      booleanArray4[4] = true;
      booleanArray4[5] = true;
      booleanArray4[6] = true;
      booleanArray4[7] = true;
      booleanArray4[8] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[3];
      booleanArray5[0] = true;
      booleanArray5[1] = true;
      booleanArray5[2] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[5];
      booleanArray6[0] = false;
      booleanArray6[1] = false;
      booleanArray6[2] = false;
      booleanArray6[3] = true;
      booleanArray6[4] = false;
      booleanArray0[5] = booleanArray6;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[6][7];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[6];
      int int0 = 0;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(989, 0, 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[4][1];
      boolean[] booleanArray1 = new boolean[1];
      booleanArray1[0] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[9];
      booleanArray2[0] = false;
      booleanArray2[1] = false;
      booleanArray2[2] = false;
      booleanArray2[3] = false;
      booleanArray2[4] = true;
      booleanArray2[5] = false;
      booleanArray2[6] = false;
      booleanArray2[7] = false;
      booleanArray2[8] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[7];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray3[2] = true;
      booleanArray3[3] = true;
      booleanArray3[4] = false;
      booleanArray3[5] = true;
      booleanArray3[6] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[3];
      booleanArray4[0] = false;
      booleanArray4[1] = false;
      booleanArray4[2] = true;
      booleanArray0[3] = booleanArray4;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      try { 
        iCSSearchAlgorithm0.search(bayesNet0, (Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(1136);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[8];
      intArray0[0] = (-4587);
      intArray0[1] = 2;
      intArray0[2] = 573;
      intArray0[3] = 68;
      intArray0[4] = (-2688);
      intArray0[5] = 368;
      intArray0[6] = 153;
      intArray0[7] = 4;
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      iCSSearchAlgorithm_SeparationSet0.contains((-586));
      int int0 = 1386;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.logScore(559);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[6][5];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = false;
      booleanArray1[1] = true;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[2];
      booleanArray3[0] = true;
      booleanArray3[1] = true;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[5];
      booleanArray4[0] = true;
      booleanArray4[1] = false;
      booleanArray4[2] = false;
      booleanArray4[3] = false;
      booleanArray4[4] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[5];
      booleanArray5[0] = true;
      booleanArray5[1] = true;
      booleanArray5[2] = false;
      booleanArray5[3] = true;
      booleanArray5[4] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[2];
      booleanArray6[0] = true;
      booleanArray6[1] = true;
      booleanArray0[5] = booleanArray6;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph(booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[8][4];
      boolean[] booleanArray1 = new boolean[7];
      booleanArray1[0] = false;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = false;
      booleanArray1[4] = true;
      booleanArray1[5] = true;
      booleanArray1[6] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[1];
      booleanArray2[0] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[6];
      booleanArray3[0] = false;
      booleanArray3[1] = false;
      booleanArray3[2] = true;
      booleanArray3[3] = true;
      booleanArray3[4] = true;
      booleanArray3[5] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[3];
      booleanArray4[0] = false;
      booleanArray4[1] = true;
      booleanArray4[2] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[1];
      booleanArray5[0] = true;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[8];
      booleanArray6[0] = true;
      booleanArray6[1] = true;
      booleanArray6[2] = true;
      booleanArray6[3] = true;
      booleanArray6[4] = true;
      booleanArray6[5] = true;
      booleanArray6[6] = false;
      booleanArray6[7] = true;
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[1];
      booleanArray7[0] = false;
      booleanArray0[6] = booleanArray7;
      boolean[] booleanArray8 = new boolean[0];
      booleanArray0[7] = booleanArray8;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[3][8];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[0];
      iCSSearchAlgorithm_SeparationSetArray0[0] = iCSSearchAlgorithm_SeparationSetArray1;
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray2 = new ICSSearchAlgorithm.SeparationSet[8];
      int int0 = 1454;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(1454, 1454, 563, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 563
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 350);
      Instances instances1 = Instances.mergeInstances(instances0, instances0);
      iCSSearchAlgorithm0.search((BayesNet) null, instances1);
      boolean[][] booleanArray0 = new boolean[6][2];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = false;
      booleanArray1[1] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[0];
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[1];
      booleanArray3[0] = false;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[8];
      booleanArray4[0] = false;
      booleanArray4[1] = false;
      booleanArray4[2] = false;
      booleanArray4[3] = false;
      booleanArray4[4] = false;
      booleanArray4[5] = false;
      booleanArray4[6] = false;
      booleanArray4[7] = false;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[6];
      booleanArray5[0] = false;
      booleanArray5[1] = false;
      booleanArray5[2] = false;
      booleanArray5[3] = true;
      booleanArray5[4] = false;
      booleanArray5[5] = false;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[2];
      booleanArray6[0] = false;
      booleanArray6[1] = true;
      booleanArray0[5] = booleanArray6;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][1];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[3];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      boolean[][] booleanArray7 = new boolean[7][9];
      booleanArray7[0] = booleanArray5;
      booleanArray7[1] = booleanArray4;
      booleanArray7[2] = booleanArray6;
      booleanArray7[3] = booleanArray1;
      boolean[] booleanArray8 = new boolean[1];
      booleanArray8[0] = false;
      booleanArray7[4] = booleanArray8;
      booleanArray7[5] = booleanArray1;
      booleanArray7[6] = booleanArray6;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(2353, 2353, 0, booleanArray7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.globalInfo();
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[4][3];
      boolean[] booleanArray1 = new boolean[5];
      booleanArray1[0] = true;
      booleanArray1[1] = true;
      booleanArray1[2] = false;
      booleanArray1[3] = true;
      booleanArray1[4] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[1];
      booleanArray2[0] = false;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[1];
      booleanArray3[0] = true;
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[2];
      booleanArray4[0] = false;
      booleanArray4[1] = true;
      booleanArray0[3] = booleanArray4;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm1.existsSepSet(536, 536, 549, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 549
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = 532;
      iCSSearchAlgorithm0.setMaxCardinality(532);
      int int1 = 524;
      boolean[][] booleanArray0 = new boolean[2][5];
      boolean[] booleanArray1 = new boolean[0];
      booleanArray0[0] = booleanArray1;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[3][4];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[9];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet1;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet2 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet2;
      int int2 = (-668);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(532, (-668), (-668), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -668
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.setMaxCardinality(562);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "8034";
      ICSSearchAlgorithm.main(stringArray0);
      iCSSearchAlgorithm0.getMaxCardinality();
      iCSSearchAlgorithm0.getMaxCardinality();
      BayesNet bayesNet0 = new BayesNet();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("8034", arrayList0, 562);
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      iCSSearchAlgorithm0.getMaxCardinality();
      iCSSearchAlgorithm0.getRevision();
      boolean[][] booleanArray0 = new boolean[8][1];
      boolean[] booleanArray1 = new boolean[8];
      booleanArray1[0] = true;
      booleanArray1[1] = true;
      booleanArray1[2] = true;
      booleanArray1[3] = true;
      booleanArray1[4] = true;
      booleanArray1[5] = false;
      booleanArray1[6] = true;
      booleanArray1[7] = false;
      booleanArray0[0] = booleanArray1;
      boolean[] booleanArray2 = new boolean[1];
      booleanArray2[0] = true;
      booleanArray0[1] = booleanArray2;
      boolean[] booleanArray3 = new boolean[0];
      booleanArray0[2] = booleanArray3;
      boolean[] booleanArray4 = new boolean[9];
      booleanArray4[0] = true;
      booleanArray4[1] = true;
      booleanArray4[2] = false;
      booleanArray4[3] = true;
      booleanArray4[4] = false;
      booleanArray4[5] = true;
      booleanArray4[6] = true;
      booleanArray4[7] = true;
      booleanArray4[8] = true;
      booleanArray0[3] = booleanArray4;
      boolean[] booleanArray5 = new boolean[6];
      booleanArray5[0] = false;
      booleanArray5[1] = true;
      booleanArray5[2] = false;
      booleanArray5[3] = true;
      booleanArray5[4] = true;
      booleanArray5[5] = true;
      booleanArray0[4] = booleanArray5;
      boolean[] booleanArray6 = new boolean[3];
      booleanArray6[0] = true;
      booleanArray6[1] = false;
      booleanArray6[2] = true;
      booleanArray0[5] = booleanArray6;
      boolean[] booleanArray7 = new boolean[2];
      booleanArray7[0] = false;
      booleanArray7[1] = false;
      booleanArray0[6] = booleanArray7;
      boolean[] booleanArray8 = new boolean[9];
      booleanArray8[0] = true;
      booleanArray8[1] = true;
      booleanArray8[2] = true;
      booleanArray8[3] = true;
      booleanArray8[4] = true;
      booleanArray8[5] = true;
      booleanArray8[6] = true;
      booleanArray8[7] = true;
      booleanArray8[8] = true;
      booleanArray0[7] = booleanArray8;
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[6][3];
      ICSSearchAlgorithm.SeparationSet[] iCSSearchAlgorithm_SeparationSetArray1 = new ICSSearchAlgorithm.SeparationSet[9];
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[0] = iCSSearchAlgorithm_SeparationSet0;
      ICSSearchAlgorithm iCSSearchAlgorithm1 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet1 = iCSSearchAlgorithm1.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[1] = iCSSearchAlgorithm_SeparationSet1;
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet2 = iCSSearchAlgorithm1.new SeparationSet();
      iCSSearchAlgorithm_SeparationSetArray1[2] = iCSSearchAlgorithm_SeparationSet2;
      int int0 = 1405;
      iCSSearchAlgorithm0.existsSepSet(562, 1405, 562, booleanArray0);
      iCSSearchAlgorithm_SeparationSetArray1[3] = null;
      int int1 = (-1545);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm1.existsSepSet(562, 1405, (-1545), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1545
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.getOptions();
      boolean[][] booleanArray0 = new boolean[0][2];
      byte[] byteArray0 = new byte[6];
      iCSSearchAlgorithm0.getRevision();
      byteArray0[0] = (byte)3;
      iCSSearchAlgorithm0.getRevision();
      iCSSearchAlgorithm0.getScoreType();
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)78;
      byteArray0[3] = (byte) (-67);
      byteArray0[4] = (byte) (-35);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      byteArray0[5] = (byte)65;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][5];
      iCSSearchAlgorithm0.setMarkovBlanketClassifier(false);
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
}
