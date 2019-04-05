/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 17:14:10 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.BinarySparseInstance;
import weka.core.Instances;
import weka.core.Range;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseEqualFrequency(false);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize("m#iTU1Rx#NU");
      discretize0.setMakeBinary(false);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(false);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-4082));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("-D");
      discretize0.m_DiscretizeCols = null;
      // Undeclared exception!
      try { 
        discretize0.getInvertSelection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning(539);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("no}x{k9yP~iK9{O\"4B");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning((-890));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPoints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize("Bin number optimization in conjunction with equal-frequency binning not implemented.");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Make resulting attributes binary.";
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize("Name");
      discretize0.listOptions();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      boolean boolean0 = discretize0.getMakeBinary();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(boolean0);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getAttributeIndices();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertEquals("first-last", string0);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize("Name");
      double double0 = discretize0.getDesiredWeightOfInstancesPerInterval();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals((-1.0), double0, 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int int0 = discretize0.getBins();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, int0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setAttributeIndices("Usage: java weka.core.Environment <string> <string> ...");
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      discretize0.setDesiredWeightOfInstancesPerInterval(2.0);
      assertEquals(2.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins(350);
      assertEquals(350, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("m#iTU1Rx#NU");
      discretize0.getInvertSelection();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setOutputFormat();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize("+q>jb<=");
      double[][] doubleArray0 = new double[0][4];
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
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      double[][] doubleArray0 = new double[4][0];
      double[] doubleArray1 = new double[4];
      doubleArray0[2] = doubleArray1;
      discretize0.m_CutPoints = doubleArray0;
      String string0 = discretize0.getBinRangesString(2);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("(-inf-0],(0-0],(0-0],(0-0],(0-inf)", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString((-1463));
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize("-D");
      discretize0.getCutPoints(1214);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize("attributes");
      double[][] doubleArray0 = new double[7][0];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(60);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 60
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize("Bin number optimization in conjunction with equal-frequency binning not implemented.");
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
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(82);
      // Undeclared exception!
      try { 
        discretize0.input(binarySparseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      discretize0.m_MakeBinary = true;
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't ignore class when changing the number of attributes!
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_MakeBinary = true;
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
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.getCapabilities((Instances) null);
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
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getCapabilities();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(4, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize("m#iTU1Rx#NU");
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      discretize0.getOptions();
      assertTrue(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize("m#iTU1Rx#NU");
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Discretize discretize0 = new Discretize("g0RVy8`j3PxP");
      String string0 = discretize0.invertSelectionTipText();
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Discretize discretize0 = new Discretize("m#iTU1Rx#NU");
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Discretize discretize0 = new Discretize("m#iTU1Rx#NU");
      String string0 = discretize0.useBinNumbersTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.globalInfo();
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Number of bins.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Discretize discretize0 = new Discretize("Bin number optimization in conjunction with equal-frequency binning not implemented.");
      String string0 = discretize0.makeBinaryTipText();
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Make resulting attributes binary.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getRevision();
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("8964", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Discretize discretize0 = new Discretize("Name");
      int[] intArray0 = new int[3];
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Discretize discretize0 = new Discretize("Name");
      String string0 = discretize0.attributeIndicesTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "O";
      stringArray0[1] = "%6))UVp>";
      stringArray0[2] = "wYZn";
      stringArray0[3] = "Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning";
      Discretize.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.findNumBinsTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseBinNumbers(false);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Discretize discretize0 = new Discretize("Bin number optimization in conjunction with equal-frequency binning not implemented.");
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(6, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
  }
}