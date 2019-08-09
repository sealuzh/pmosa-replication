/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 01:45:07 GMT 2019
 */

package weka.classifiers.functions.supportVector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.classifiers.functions.supportVector.RegSMO;
import weka.classifiers.functions.supportVector.SMOset;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Instance;
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegSMO_ESTest extends RegSMO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-6.78214234);
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = regSMO0.m_alpha;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-22.11508684584);
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = regSMO0.m_alpha;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_nInstances = 100;
      regSMO0.m_nInstances = (int) (byte)0;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_C = 986.8845105;
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = 986.8845105;
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      int int0 = regSMO0.secondChoiceHeuristic(724);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(2477);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOset sMOset0 = new SMOset(1906);
      regSMO0.m_supportVectors = sMOset0;
      double[] doubleArray0 = new double[11];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, (-1586.7579454971765), (-1586.7579454971765), 0, 0, 1906, 0, (-1586.7579454971765), 3814.0050361622143, 3814.0050361622143, (-1586.7579454971765));
      assertTrue(boolean0);
      
      int int0 = regSMO0.secondChoiceHeuristic(2471);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(0, 1803, 1803, 0, 2937.854);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1013, 1013, 1630.58242044, 1013, 1013, 1630.58242044, 1.0E-10, 0.0, 0.0, 1.0E-10, 1630.58242044);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1522.49328285, 1.7976931348623157E308, 1.7976931348623157E308, 0, (-2101.5184047310872), 0, 1.7976931348623157E308, 0L, 4.0E-10, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-5), (-2442), 566.83370584, (-5), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep(0, 0, 0, 0.7, 0.7);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep((-842), (-842), (-842), (-842), (-842));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setOptions((String[]) null);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[0];
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      
      regSMO0.setEpsilon(0.0);
      double double0 = regSMO0.getEpsilon();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon((-401.97123244616));
      double double0 = regSMO0.getEpsilon();
      assertEquals((-401.97123244616), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.init((Instances) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(2146966568, 4, 2, 1.2113379969948757, 1, (-1659.9634309), 4, (-15.723366135286504), 2.2000000000000003E-9, (-1425.75507273), 2);
      assertFalse(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample((-3579));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.buildClassifier((Instances) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("KKT condition 1 violated: ", arrayList0, 0);
      int[] intArray0 = new int[5];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(986.8845105, intArray0, (-2351));
      instances0.add((Instance) binarySparseInstance0);
      try { 
        regSMO0.buildClassifier(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-";
      try { 
        regSMO0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances((String) null, arrayList0, 1);
      try { 
        regSMO0.init(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample(36);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getTechnicalInformation();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = regSMO0.getEpsilon();
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alphaStar = doubleArray0;
      double[] doubleArray1 = new double[22];
      regSMO0.m_alpha = doubleArray1;
      regSMO0.m_target = regSMO0.m_alphaStar;
      doubleArray0[0] = (double) 410;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 4;
      regSMO0.m_target = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alpha = doubleArray0;
      double[] doubleArray1 = new double[3];
      regSMO0.m_target = regSMO0.m_alpha;
      regSMO0.m_alphaStar = doubleArray1;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOset sMOset0 = new SMOset(1906);
      regSMO0.m_supportVectors = sMOset0;
      double[] doubleArray0 = new double[15];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.findOptimalPointOnLine(0, 1.5, 0.0, 0, 0, 0, 0.1, 2.0, (-1), 3800.7123826602256, 2.0);
      int int0 = regSMO0.secondChoiceHeuristic(0);
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = 986.8845105;
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      int int0 = regSMO0.secondChoiceHeuristic(724);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = regSMO0.m_alphaStar;
      regSMO0.m_error = doubleArray0;
      regSMO0.m_nInstances = 44;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[0] = (-6.78214234);
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = regSMO0.m_alphaStar;
      regSMO0.m_error = doubleArray0;
      regSMO0.m_nInstances = 44;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(2471, 56, 3814.0050361622143, 0, (-3542.602807));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOset sMOset0 = new SMOset(1906);
      regSMO0.m_supportVectors = sMOset0;
      double[] doubleArray0 = new double[15];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.findOptimalPointOnLine(0, 1.5, 0.0, 0, 0, 0, 0.1, 2.0, (-1), 3800.7123826602256, 2.0);
      int int0 = regSMO0.secondChoiceHeuristic((-1));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOset sMOset0 = new SMOset(1906);
      regSMO0.m_supportVectors = sMOset0;
      double[] doubleArray0 = new double[11];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, 1.5, 0.0, 2477, 0, 0, 0.1, (-3397.2657827539415), (-1), 3815.188306372665, 20.0);
      assertTrue(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOset sMOset0 = new SMOset(1906);
      regSMO0.m_supportVectors = sMOset0;
      double[] doubleArray0 = new double[11];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, (-1586.7579454971765), (-1586.7579454971765), 0, 0, 1906, 0, (-1586.7579454971765), 3814.0050361622143, 3814.0050361622143, (-1586.7579454971765));
      assertTrue(boolean0);
      
      boolean boolean1 = regSMO0.findOptimalPointOnLine(0, 1.5, 0.0, 2471, 0, 0, 0.1, 0, (-1), 3814.0050361622143, 0.1);
      assertTrue(boolean1);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 5.5, (-1856.63055715), 2675.04651, 2, 4405.125, 1760.8, 214727, (-2019.1871795628379), 214727, 5.5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, (-460.255023545), 64.0, 2487.0178580972, 0, 2487.0178580972, 64.0, (-49.71741896), 6.283185307179586, 64.0, 6.283185307179586);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      regSMO0.setEpsilon(986.8845105);
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, (-359.0), 1.9999999998, (-11.0), 0, 0, (-1278.8086931855842), 4.1E-9, 1382.0, 1382.0, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      doubleArray0[0] = 986.8845105;
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 986.8845105, 986.8845105, 0, 0, (-1072.0), 0, 986.8845105, 1.7976931348623157E308, 1.7976931348623157E308, 986.8845105);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      regSMO0.setEpsilon(Double.POSITIVE_INFINITY);
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = regSMO0.m_alpha;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 0, 0, (-1072.0), 0, Double.POSITIVE_INFINITY, 1.7976931348623157E308, 1.7976931348623157E308, Double.POSITIVE_INFINITY);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[1];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[0] = (-6.78214234);
      regSMO0.m_alpha = doubleArray0;
      regSMO0.setEpsilonParameter(1616.55894741771);
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-6.78214234), 0, 1.0E-12, 112, (-2076.642780153677), 6.7, 1616.55894741771, 0, 862.64, 862.64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 112
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(100.0);
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-6238.7), 1.9999999998, 5.7, 305, (-1399.6460229508525), 1.0E-10, 1917.7361926106878, (-1096.3577), 2, (-1072.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(4, 4, 4, 2, 1, (-759.6), 4, 896.519941, (-759.6), 1, 9.99875737761613E-11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-6238.7), 1.9999999998, 5.7, 305, (-1399.6460229508525), 1.0E-10, 1917.7361926106878, (-1096.3577), 2, (-1072.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(4, (-1664.83290730882), 4.0, 4.0, 2, 1, (-460.255023545), 4.0, (-2.0), 4.0, 1013.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.7976931348623157E308, 3800.7123826602256, 6.0, 2, 0.0, (-2.0), 1.0E-12, (-2.0), 2.0E-10, (-1052.27227569));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-2031), 700.344639636, 700.344639636, 1495.6, 509, 1.7976931348623157E308, (-2031), 1039.0, 163.280761, 1707.1914365462, (-2031));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(105, 9, 0.002, 9, 105, 1946.3435779, 2388.603588890042, 2388.603588890042, 1.0E-10, 2388.603588890042, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, (-759.6), 2176.8030439, (-2461), 2217, 0.0, 0.0, (-2461), 0, 896.519941, (-4130.74717));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(9, 492.27097543113, 0.1, 0.05, 21257029, 492.27097543113, 22.0, 1.0E-10, 1.0E-10, 9, 0.1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(4, (-1664.83290730882), 4.0, 1630.58242044, 2, 228, (-460.255023545), 4.0, (-2.0), 4.0, 1013.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(105, 9, 0.002, 9, 105, 1946.3435779, 2388.603588890042, 2388.603588890042, 1.0E-10, 2388.603588890042, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1108), 0.3, (-1108), 4410.65367730448, (-1108), 2.0, 3.0, 2.0, 0.3, 4166.66314, (-367.1923395));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 0.1, 457.684, Double.POSITIVE_INFINITY, 0, 4166.66314, 1306.5265661795, 0.1, 5.3, 1.3, 1501.2272946);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, 6.522887348247367, (-15), 166.235, 4, 4152.1039050987065, 5.7, 2259.09832779, 2, 0.9, (-15));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 0, (-1915.5425082), 1.7976931348623157E308, (-1), (-1.0), 690.93474735, 59.0, (-3455.36899), 0.002, (-1.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1017229096, 0.0, 0.0, 3356.8644503, 0, (-253.1992917626), 2169.3799462767, 1017229096, 2169.3799462767, 1298.4092781171373, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.3, 1, 2758.5, (-1), (-1280.15726582), 0, 1.3, 0.1, 0.1, (-1989309216));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine((-1257), (-1257), (-1257), (-1257), (-1257), (-2049.2653028844), 0.0, (-1257), (-1257), 0.0, (-2049.2653028844));
      assertFalse(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.listOptions();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.wrapUp();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.getRevision();
      assertEquals("8034", string0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.epsilonTipText();
      assertEquals("The epsilon for round-off error (shouldn't be changed).", string0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = regSMO0.getOptions();
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.globalInfo();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("Implementation of SMO for support vector regression as described in :\n\nA.J. Smola, B. Schoelkopf (1998). A tutorial on support vector regression.", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("KKT condition 1 violated: ", arrayList0, 0);
      try { 
        regSMO0.buildClassifier(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // SVM not initialized in optimizer. Use RegOptimizer.setSVMReg()
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }
}
