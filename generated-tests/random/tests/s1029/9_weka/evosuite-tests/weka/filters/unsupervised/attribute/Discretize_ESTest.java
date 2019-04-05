/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 14:41:14 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Range;
import weka.core.SparseInstance;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.listOptions();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize("yY$4u4ST^pO;");
      discretize0.getAttributeIndices();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      assertTrue(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(false);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize("_?:a`ve)jzvX(mS2{.");
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      assertTrue(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      assertEquals(0.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize(",o@{o$3L=eu3b}?3Ns'");
      discretize0.setBins((-121));
      assertEquals((-121), discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Discretize.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.setAttributeIndicesArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.getCapabilities();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize("_?:a`ve)jzvX(mS2{.");
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals(6, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      boolean boolean0 = discretize0.getMakeBinary();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.getAttributeIndices();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize("yY$4u4ST^pO;");
      discretize0.setFindNumBins(false);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("Sorted array (doubles): ");
      discretize0.setAttributeIndices(",??\"J&");
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(boolean0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setDesiredWeightOfInstancesPerInterval(82);
      assertEquals(82.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins(33);
      assertEquals(33, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize("yY$4u4ST^pO;");
      discretize0.setUseEqualFrequency(false);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize(",o@{o$3L=eu3b}?3Ns'");
      double[][] doubleArray0 = new double[9][2];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.setOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute("3o", linkedList0, 200);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("3o", arrayList0, 77);
      discretize0.setInputFormat(instances0);
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-827));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize("_?:a`ve)jzvX(mS2{.");
      discretize0.getBinRangesString(14);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[7][4];
      discretize0.m_CutPoints = doubleArray0;
      String string0 = discretize0.getBinRangesString(2);
      assertEquals(10, discretize0.getBins());
      assertNotNull(string0);
      assertEquals("(-inf-0],(0-0],(0-0],(0-0],(0-inf)", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize("_?:a`ve)jzvX(mS2{.");
      discretize0.getCutPoints(14);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[1][9];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints((-2021161078));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2021161078
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize("b6=");
      // Undeclared exception!
      try { 
        discretize0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.input((Instance) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute("3o", linkedList0, 200);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("3o", arrayList0, 77);
      discretize0.setInputFormat(instances0);
      DenseInstance denseInstance0 = new DenseInstance(114);
      // Undeclared exception!
      try { 
        discretize0.input(denseInstance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Instance has no dataset assigned!!
         //
         verifyException("weka.core.RelationalLocator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Range range0 = new Range("");
      discretize0.m_DiscretizeCols = range0;
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize("yY$4u4ST^pO;");
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize("z0,-Lhw~m/bTp]");
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Attribute attribute0 = new Attribute("3o", linkedList0, 200);
      arrayList0.add(attribute0);
      Instances instances0 = new Instances("3o", arrayList0, 77);
      discretize0.setInputFormat(instances0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "date";
      stringArray0[1] = ".arff";
      stringArray0[2] = ".arff";
      stringArray0[3] = "@end";
      stringArray0[4] = "3o";
      stringArray0[5] = "integer";
      stringArray0[6] = "3o";
      stringArray0[7] = "numeric";
      stringArray0[8] = "date";
      try { 
        Filter.filterFile(discretize0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // Illegal options: date .arff .arff @end 3o integer 3o numeric date 
         // Filter options:
         // 
         // -unset-class-temporarily
         // \tUnsets the class index temporarily before the filter is
         // \tapplied to the data.
         // \t(default: no)
         // -B <num>
         // \tSpecifies the (maximum) number of bins to divide numeric attributes into.
         // \t(default = 10)
         // -M <num>
         // \tSpecifies the desired weight of instances per bin for
         // \tequal-frequency binning. If this is set to a positive
         // \tnumber then the -B option will be ignored.
         // \t(default = -1)
         // -F
         // \tUse equal-frequency instead of equal-width discretization.
         // -O
         // \tOptimize number of bins using leave-one-out estimate
         // \tof estimated entropy (for equal-width discretization).
         // \tIf this is set then the -B option will be ignored.
         // -R <col1,col2-col4,...>
         // \tSpecifies list of columns to Discretize. First and last are valid indexes.
         // \t(default: first-last)
         // -V
         // \tInvert matching sense of column indexes.
         // -D
         // \tOutput binary attributes for discretized attributes.
         // -Y
         // \tUse bin numbers rather than ranges for discretized attributes.
         // 
         // General options:
         // 
         // -h
         // \tGet help on available options.
         // \t(use -b -h for help on batch mode.)
         // -i <file>
         // \tThe name of the file containing input instances.
         // \tIf not supplied then instances will be read from stdin.
         // -o <file>
         // \tThe name of the file output instances will be written to.
         // \tIf not supplied then instances will be written to stdout.
         // -c <class index>
         // \tThe number of the attribute to use as the class.
         // \t\"first\" and \"last\" are also valid entries.
         // \tIf not supplied then no class is assigned.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.invertSelectionTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Discretize discretize0 = new Discretize("yY$4u4ST^pO;");
      String string0 = discretize0.globalInfo();
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.makeBinaryTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Make resulting attributes binary.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Discretize discretize0 = new Discretize("yY$4u4ST^pO;");
      String string0 = discretize0.getRevision();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("8964", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[4];
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Discretize discretize0 = new Discretize("_");
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = discretize0.getOptions();
      Discretize.main(stringArray0);
      discretize0.setOptions(stringArray0);
      assertEquals(10, discretize0.getBins());
      assertEquals(6, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.findNumBinsTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseBinNumbers(false);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Discretize discretize0 = new Discretize("    super.setInputFormat(instanceInfo);\n");
      double[] doubleArray0 = new double[0];
      SparseInstance sparseInstance0 = new SparseInstance(1323.022919793493, doubleArray0);
      // Undeclared exception!
      try { 
        discretize0.input(sparseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }
}