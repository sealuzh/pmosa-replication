/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 22:49:24 GMT 2019
 */

package weka.classifiers.functions.supportVector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.classifiers.functions.SMOreg;
import weka.classifiers.functions.supportVector.RegSMO;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegSMO_ESTest extends RegSMO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (byte) (-60);
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_target = regSMO0.m_alphaStar;
      regSMO0.optimize();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
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
  public void test02()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[3];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[0] = (double) (byte)8;
      double[] doubleArray1 = new double[13];
      regSMO0.m_alpha = doubleArray1;
      int int0 = regSMO0.secondChoiceHeuristic((-1038));
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (byte) (-60);
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      int int0 = regSMO0.secondChoiceHeuristic(7);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) (-1995);
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((-1995));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2399, 2399, 421, 421, 421, 421, 2574.4949348317996, 4.94E-321, 4.94E-321, 2399, 1720.2);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2145066467, 812.9, 0.0, (-2567.0), 2145066467, (-2567.0), 0.0, (-1350.0), 2145066467, 1.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(518, 1.7976931348623157E308, (-1927.427546), (-2388.881219578156), (-1), (-1.645963480258145), (-2388.881219578156), (-3745.77), 1.0E-10, 1103.83464387548, (-978.967373147));
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
      double[] doubleArray0 = new double[8];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = regSMO0.m_alphaStar;
      try { 
        regSMO0.examineExample(2);
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
      regSMO0.setEpsilon((-3374.7419613));
      double double0 = regSMO0.getEpsilon();
      assertEquals((-3374.7419613), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(2676, 200, 0.25, 1.0E10, 0.0);
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
      int int0 = regSMO0.takeStep(631, 631, 631, 631, (-376.4));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(739, (-3162), (-3162), 0.0, 1.0E-12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-110), (-100), 0, 2.0, 2.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-1), 0, 1.0E10, 1.0E10, 1.0E10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(0, (-1435), 1.0E10, 1.0E10, 1.0E10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-9), 2, (-3646.338469), (-9), 2118.238862896155);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[0];
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(0.0);
      assertEquals(0.0, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(1.0E-12);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("The epsilon for round-off error (shouldn't be changed).", arrayList0, 2500);
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
  public void test21()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, 3.0, 1242.90231204, 0, 0, 0.0, (-1927.427546), 887.427211, 0.0, 0, 295.8596);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1660173573), (-3646.338469), 0.1, (-1660173573), (-1559), (-2189.3537), 2, 2037.7856065592725, (-1660173573), 295.8596, (-1559));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample((-1995));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 178);
      DenseInstance denseInstance0 = new DenseInstance(3397);
      instances0.add((Instance) denseInstance0);
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
  public void test26()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("8034", arrayList0, 48);
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
  public void test27()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-";
      try { 
        regSMO0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[1];
      try { 
        regSMO0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "-P";
      try { 
        regSMO0.setOptions(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No value given for -P option.
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[0];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((-2371));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[7];
      regSMO0.m_alphaStar = doubleArray0;
      double[] doubleArray1 = new double[10];
      regSMO0.m_alpha = doubleArray1;
      regSMO0.m_target = regSMO0.m_alpha;
      try { 
        regSMO0.optimize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOreg sMOreg0 = new SMOreg();
      regSMO0.setSMOReg(sMOreg0);
      try { 
        regSMO0.init((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[12];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)4, 0.0, (byte)4, 0.0, 500, (-2508.79), (-2508.79), 0.0, (byte)4, (byte)4, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 500
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[4];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_target = regSMO0.m_alpha;
      try { 
        regSMO0.examineExample(715827883);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 715827883
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOreg sMOreg0 = new SMOreg();
      regSMO0.setSMOReg(sMOreg0);
      try { 
        regSMO0.buildClassifier((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[9];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[2] = (double) (byte)5;
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
  public void test37()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = regSMO0.getEpsilon();
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[12];
      regSMO0.m_alphaStar = doubleArray0;
      double[] doubleArray1 = new double[2];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = doubleArray1;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[8];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[2] = (double) (byte)5;
      double[] doubleArray1 = new double[10];
      regSMO0.m_alpha = doubleArray1;
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
  public void test40()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_nInstances = (int) (byte)90;
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
  public void test41()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[3];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[0] = (double) (byte)1;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      int int0 = regSMO0.secondChoiceHeuristic((-1038));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 14.17;
      regSMO0.m_C = 171.7149;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic((-1949));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 14.17;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((-1949));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[3];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      int int0 = regSMO0.secondChoiceHeuristic((-1038));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[12];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)4, (-2634.8141012795813), (-2634.8141012795813), 5.0, (byte)4, 4.0, 4.0, (-2634.8141012795813), (-318.39), 0.5, (-2488.8520600857646));
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
      double[] doubleArray0 = new double[11];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)5, 5.0, (-2.0), 1041.3, (byte)5, (-950.494345), 5.0, 1342.7332392877, (-2483.8520600857646), 1342.7332392877, (-950.494345));
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
      double[] doubleArray0 = new double[13];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)5, (byte)5, 3177.0656, 4.6, (byte)5, 4.6, (-4.989502109537654), 61.87297458491846, 0.0, 3177.0656, (-23.141805052571016));
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
      double[] doubleArray0 = new double[9];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(1, 1, 1.0, 26.9648582694, 1, 15.0, 26.9648582694, (-444.23), (-3528.106186), 26.9648582694, (-3528.106186));
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
      double[] doubleArray0 = new double[3];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.findOptimalPointOnLine((byte)0, (byte)0, 1.0E-12, 1.0E-12, (byte)0, 0.0, (byte)0, (byte)0, 0.0, 1.0E-12, 1.0E-12);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[11];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)0, (byte)0, 20.64688492181827, 20.64688492181827, (byte)0, 0.0, (byte)0, (byte)0, 0.0, 20.64688492181827, 20.64688492181827);
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
      double[] doubleArray0 = new double[9];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 1.0E-12, 2, 1.0E-12, 2, 2, (-2172.9822527638494), 2, 1.0E-12, 818.45615270703, 1.0);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(5957, (-444.23), 429.865546, 1.0E10, 40, 1.0, 0.1, 0.1, (-2267.8417059671265), 429.865546, 5957);
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
        regSMO0.findOptimalPointOnLine((-730), (-730), 1.0E-12, 1868.0, (-730), 1.0E-12, 1868.0, 318.91339645032843, (-730), 1763.609653, 2801.96206);
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
        regSMO0.findOptimalPointOnLine((-1557), 0.0, 189.35297684348, 2747.0974670727, (-1323), 0.0, (-1557), 2273.636340263636, (-2388.743951274633), 1.0, 1.0);
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
        regSMO0.findOptimalPointOnLine(2, 2, 0.002, 0.002, (-152), 418.58018867085, (-152), 2, 1.0E-10, 0.2146668354, 2);
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
        regSMO0.findOptimalPointOnLine(2791, 0, 0, 2045.40268, 2791, (-2.145067817E9), 0, 2791, (-2045.90446579815), 2791, 2791);
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
        regSMO0.findOptimalPointOnLine((-1), 15.0, (-1734.34), 1.7976931346825464E308, (-1323), (-1870.972750316895), 1.0E-4, 2747.0974670727, (-1323), 1.0, 1.0E-10);
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
        regSMO0.findOptimalPointOnLine(1, 1.0, 5090.65463, 5090.65463, 1, 5090.65463, 1.0, 445.23, 1.0, 445.23, 445.23);
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
        regSMO0.findOptimalPointOnLine(2, 2328.6648668293137, 1927.427546, 2328.6648668293137, 2, 483.59493915, 1230.0, 2328.6648668293137, 1.0E-8, 0.1, 1927.427546);
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
        regSMO0.findOptimalPointOnLine(2782, 1601.870804172, 100.0, 2622.0, 2782, 1601.870804172, 100.0, 2782, 2782, 2622.0, 100.0);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(92, (-627.8833059347877), 0.0, 80, 2, 2, (-627.8833059347877), 80, 1.0E-4, 1.0E-8, 2820.206237606);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, (byte)4, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2788, 2788, 2788, 1.7976931346825464E308, 2788, (-2.0), 0.0, 0.0, (-2.0), 2788.0, (-2.0));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 3874.0348899, 3874.0348899, 757.187071606, 602, 0, 0, 3874.0348899, (-1832.0), 1.0E10, 3874.0348899);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(644, 644, 644, 644, 644, 644, 644, (-1587.457), 644, (-1587.457), (-1587.457));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-P";
      stringArray0[1] = "yzrbjYynnKxW";
      try { 
        regSMO0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setOptions((String[]) null);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.listOptions();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.globalInfo();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("Implementation of SMO for support vector regression as described in :\n\nA.J. Smola, B. Schoelkopf (1998). A tutorial on support vector regression.", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
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
  public void test72()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.getRevision();
      assertEquals("8034", string0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.epsilonTipText();
      assertEquals("The epsilon for round-off error (shouldn't be changed).", string0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = regSMO0.getOptions();
      assertEquals(6, stringArray0.length);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getTechnicalInformation();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }
}
