/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 01:44:41 GMT 2019
 */

package weka.classifiers.bayes.net.search.ci;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
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
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[7][5];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(91, 0, 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.CISearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 39);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[12][3];
      boolean[] booleanArray1 = new boolean[7];
      booleanArray1[0] = true;
      booleanArray0[1] = booleanArray1;
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet(1, 1, 1, booleanArray0);
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
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("ax", arrayList0, 0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
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
  public void test03()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[7];
      intArray0[1] = (-1550);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains((-1));
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      iCSSearchAlgorithm0.setMaxCardinality((-1243));
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(1289);
      assertEquals((-1243), iCSSearchAlgorithm0.getMaxCardinality());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 1289);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[8][5];
      int int0 = iCSSearchAlgorithm0.next((-1), (-1), 1, booleanArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 58);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[0][2];
      int int0 = iCSSearchAlgorithm0.next(58, 58, 58, booleanArray0);
      assertEquals(59, int0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 30);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.name(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("", (-2623));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 39);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.name(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 1289);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      iCSSearchAlgorithm0.maxn();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (String) null, 1);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 1);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      iCSSearchAlgorithm0.maxn();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-1266));
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals((-1266), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setOptions((String[]) null);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[0];
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality(0);
      assertEquals(0, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 1289);
      double[] doubleArray0 = new double[4];
      SparseInstance sparseInstance0 = new SparseInstance(4, doubleArray0);
      instances0.add((Instance) sparseInstance0);
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.setUseADTree(true);
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
  public void test17()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 2246);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.m_Instances = instances0;
      iCSSearchAlgorithm0.search(bayesNet0, bayesNet0.m_Instances);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2);
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.m_Instances = instances0;
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
  public void test19()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      BayesNet bayesNet0 = new BayesNet();
      bayesNet0.setDebug(true);
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
  public void test20()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[7][9];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-2536), (-2779), 0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[1][7];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(1, 0, (-2079), booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next(0, 1, 2, (boolean[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      ICSSearchAlgorithm.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ICSSearchAlgorithm.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[5][6];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][9];
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
  public void test28()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes((boolean[][]) null, (boolean[][]) null, (ICSSearchAlgorithm.SeparationSet[][]) null);
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
      boolean[][] booleanArray0 = new boolean[0][5];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray0, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[4][6];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[0][2];
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
  public void test31()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[0][8];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[4][8];
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
  public void test32()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      boolean[][] booleanArray0 = new boolean[11][3];
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
  public void test33()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "j<o2:";
      stringArray0[1] = "";
      stringArray0[2] = "SearchAlgorithm\n";
      stringArray0[3] = "-";
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-cardinality";
      stringArray0[1] = "th&EoS#6l`H";
      try { 
        iCSSearchAlgorithm0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"th&EoS#6l`H\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name((-1807));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("integer", arrayList0, 4);
      BayesNet bayesNet0 = new BayesNet();
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("qPmk$9#", arrayList0, 9);
      BayesNet bayesNet0 = new BayesNet();
      iCSSearchAlgorithm0.search(bayesNet0, instances0);
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.name((-528));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -528
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.setMaxCardinality((-4445));
      boolean[][] booleanArray0 = new boolean[0][7];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet((-1673), (-1673), (-1673), booleanArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm$SeparationSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.existsSepSet((-11), (-11), (-11), (boolean[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -11
         //
         verifyException("weka.classifiers.bayes.net.search.ci.ICSSearchAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, 27);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 27);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[10][2];
      boolean[][] booleanArray1 = new boolean[0][0];
      ICSSearchAlgorithm.SeparationSet[][] iCSSearchAlgorithm_SeparationSetArray0 = new ICSSearchAlgorithm.SeparationSet[2][8];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcVeeNodes(booleanArray0, booleanArray1, iCSSearchAlgorithm_SeparationSetArray0);
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
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.calcDependencyGraph((boolean[][]) null, (ICSSearchAlgorithm.SeparationSet[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 39);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[8][0];
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
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2274);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[0][9];
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
  public void test47()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 39);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[12][3];
      boolean[] booleanArray1 = new boolean[16];
      booleanArray1[0] = true;
      booleanArray0[0] = booleanArray1;
      booleanArray0[1] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(1, 0, 2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      int int0 = iCSSearchAlgorithm0.getMaxCardinality();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String[] stringArray0 = iCSSearchAlgorithm0.getOptions();
      iCSSearchAlgorithm0.setOptions(stringArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.listOptions();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("W}x\"Z5");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.setMaxCardinality((-3432));
      BayesNet bayesNet0 = new BayesNet();
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
  public void test52()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 4);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      arrayList0.add(attribute0);
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[11][3];
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
  public void test53()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute((String) null, (String) null);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 51);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[21][3];
      boolean[] booleanArray1 = new boolean[4];
      arrayList0.add(attribute0);
      booleanArray1[1] = true;
      booleanArray0[0] = booleanArray1;
      booleanArray0[1] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(1, 0, 2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("", (-2623));
      arrayList0.add(attribute0);
      Instances instances0 = new Instances((String) null, arrayList0, 39);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.m_instances = instances0;
      boolean[][] booleanArray0 = new boolean[12][3];
      boolean[] booleanArray1 = new boolean[16];
      booleanArray1[0] = true;
      booleanArray0[1] = booleanArray1;
      iCSSearchAlgorithm0.existsSepSet(1, 2, 2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 59);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[0][2];
      // Undeclared exception!
      try { 
        iCSSearchAlgorithm0.next((-978), (-978), (-1268), booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Attribute attribute0 = new Attribute("");
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("numeric", arrayList0, 2);
      arrayList0.add(attribute0);
      BayesNet bayesNet0 = new BayesNet();
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
  public void test57()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 62);
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      iCSSearchAlgorithm0.search((BayesNet) null, instances0);
      boolean[][] booleanArray0 = new boolean[7][7];
      iCSSearchAlgorithm0.existsSepSet((-2784), 2, 2, booleanArray0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      int[] intArray0 = new int[7];
      intArray0[1] = (-1);
      iCSSearchAlgorithm_SeparationSet0.m_set = intArray0;
      boolean boolean0 = iCSSearchAlgorithm_SeparationSet0.contains(603);
      assertFalse(boolean0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String[] stringArray0 = new String[2];
      ICSSearchAlgorithm.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.globalInfo();
      assertEquals("This Bayes Network learning algorithm uses conditional independence tests to find a skeleton, finds V-nodes and applies a set of rules to find the directions of the remaining arrows.", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.getRevision();
      assertEquals("8034", string0);
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      String string0 = iCSSearchAlgorithm0.maxCardinalityTipText();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("When determining whether an edge exists a search is performed for a set Z that separates the nodes. MaxCardinality determines the maximum size of the set Z. This greatly influences the length of the search. Default value is 2.", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ICSSearchAlgorithm iCSSearchAlgorithm0 = new ICSSearchAlgorithm();
      ICSSearchAlgorithm.SeparationSet iCSSearchAlgorithm_SeparationSet0 = iCSSearchAlgorithm0.new SeparationSet();
      String string0 = iCSSearchAlgorithm_SeparationSet0.getRevision();
      assertEquals(2, iCSSearchAlgorithm0.getMaxCardinality());
      assertEquals("8034", string0);
  }
}