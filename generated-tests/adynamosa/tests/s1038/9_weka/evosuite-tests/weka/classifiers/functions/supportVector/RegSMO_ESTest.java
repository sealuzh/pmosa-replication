/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 13:21:37 GMT 2019
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
      regSMO0.m_nInstances = 0;
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
  public void test01()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alphaStar = doubleArray0;
      doubleArray0[0] = (double) (-3420);
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      int int0 = regSMO0.secondChoiceHeuristic(2100694797);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, 1.7976931348623157E308, 6.0E-10, 46.383382, 0, 2, 0.0, (-2474.8948), (-2996.0), 5.0, 0.1);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-3295), 1640.3481023360007, 176.912260647945, 3136.125536, 46, (-3295), 0.0, 1640.3481023360007, 724.14347, 3136.125536, 1640.3481023360007);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1779), (-410.23), (-1779), 539.00246, 928, 1.0E-10, 539.00246, 0.693147181, 0.693147181, 0.693147181, (-410.23));
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
      double[] doubleArray0 = new double[24];
      regSMO0.m_nInstances = 122;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = doubleArray0;
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
  public void test06()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.listOptions();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      
      regSMO0.m_eps = 0.0;
      double double0 = regSMO0.getEpsilon();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(4080, 0, 0, 4080, 4080);
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
      int int0 = regSMO0.takeStep(0, 0, 5163.659859374, 0.0, 0.0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(2368, 75, (-3145.534124359), (-3145.534124359), 2368);
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
      regSMO0.setOptions((String[]) null);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      
      regSMO0.setEpsilon(0.0);
      assertEquals(0.0, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon((-1876.9479147304103));
      double double0 = regSMO0.getEpsilon();
      assertEquals((-1876.9479147304103), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((-42));
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
  public void test16()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(636, 2374.169281996, (-2274), 1753.45, 636, 636, 1233.91, 0.693147181, (-529.5), (-4.57826535), (-1708.33));
      assertFalse(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1), 459.5, 0.1, (-3140.518552), 2485, (-2.5360664951224408), 0.0, 2445.9999997554, 1463.4358416880557, 2293.107, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample((-1381));
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
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("w", arrayList0, 0);
      DenseInstance denseInstance0 = new DenseInstance(0, (double[]) null);
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
  public void test21()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("", arrayList0, 153);
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
  public void test22()  throws Throwable  {
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("actually", arrayList0, 639);
      RegSMO regSMO0 = new RegSMO();
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
  public void test23()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 1.0E-12, 28.954544102308958, 0.2, (-1), 137.8602, 1.7976931348623157E308, 1265.66749, 1148.05704946453, 346.42, 5.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.examineExample(614);
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
      regSMO0.getTechnicalInformation();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(66.05912998028553);
      assertEquals(66.05912998028553, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[4];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_target = doubleArray0;
      doubleArray0[0] = (double) (byte)56;
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
  public void test28()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[3];
      regSMO0.m_alpha = doubleArray0;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_target = doubleArray0;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      doubleArray0[0] = 48.96498624606226;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(44);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(44);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep((-2145965991), (-2145965991), 48.96498624606226, 48.96498624606226, (-2273.49743142798));
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(0, 2833, 2119.2, (-2568.27537145), (-1958.11));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, 0, 0, 1.0, 2, 0.0, 66.05912998028553, 1, 1.0E-12, 0.0, 1.0E-12);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 0.002, (-2273.49743142798), 10.0, (-2713), 0, 0.002, 1, (-2713), 613.2058896017, 848.990948);
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
      double[] doubleArray0 = new double[24];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 66.05912998028553, 0, 66.05912998028553, 1, 1696.47486085, 0.2999999999999545, 66.05912998028553, 1.0E-12, 0.2999999999999545, 5.5);
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
      double[] doubleArray0 = new double[24];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_eps = 122.0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 2, 2, 122.0, 0, 2, 1124.6851347346362, 1260.4695823470763, 1124.6851347346362, 122.0, 5.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 0.001, 2, 1.0E-12, 18, 137.8602, 1.7976931348623157E308, 1265.66749, 1148.05704946453, 346.42, 5.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_eps = 122.0;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(2, 2, 2, 122.0, 0, 2, 122.0, 1260.4695823470763, 122.0, 122.0, (-1.7976931348623157E308));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[24];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(0, (-6.834163509579), 1.0E-12, 6.0E-10, 663, 1696.47486085, 0.0, 2, 0.0, 1.0E-12, 0.0);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2468, 0, 1696.47486085, 5.9999999994E-10, 255, (-2485.71245780052), 1.0E-8, 2468, (-1414.0), 0.09038891207269159, (-713.358119356));
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-35), (-1229.3272574), 5.5, 2076243603, 3662, 498.229765107311, 4.5, 1640.3481023360007, (-2555), 1640.0, 3976.709448173731);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-27), (-1229.3272574), 4.9E-324, 2146707415, 3662, 498.229765107311, 1640.3481023360007, 1640.3481023360007, (-2566), 1568.062768, 3977.361396);
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
        regSMO0.findOptimalPointOnLine(4107, 386.60370498654, 1640.3481023360007, 176.912260647945, 4107, 1567.358014601869, 6.283185307179586, 176.912260647945, 0.3, 6.283185307179586, (-287.0));
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(213867, 4215.4655026, 257.95, 213867, 1, 1.0E-10, (-287.0), 476.337811902226, 6.283185307179586, 257.95, 54);
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
        regSMO0.findOptimalPointOnLine((-3295), 1640.3481023360007, 176.912260647945, 1640.3481023360007, 0, (-807.054492), 3679.72, 1640.3481023360007, 4.9E-324, 1640.3481023360007, 1.0001);
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
        regSMO0.findOptimalPointOnLine((-2566), (-2566), 0.0, 531.2348, (-2566), (-2566), (-2566), (-2566), 531.2348, 5059.18233329, 531.2348);
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
        regSMO0.findOptimalPointOnLine(3662, 3994.3078589206, 0.1, 3994.3078589206, 3662, 3662, 1.0, 4.9E-324, 1.0, 498.229765107311, (-45.0));
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
        regSMO0.findOptimalPointOnLine(614, 1681.7737097445413, 614, 614, 614, 1681.7737097445413, 614, 614, 614, 614, 614);
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
      double[] doubleArray0 = new double[24];
      doubleArray0[2] = 66.05912998028553;
      SMOreg sMOreg0 = new SMOreg();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(sMOreg0.FILTER_STANDARDIZE, sMOreg0.FILTER_STANDARDIZE, sMOreg0.FILTER_NORMALIZE, doubleArray0[2], sMOreg0.FILTER_STANDARDIZE, doubleArray0[2], doubleArray0[2], sMOreg0.FILTER_NONE, doubleArray0[6], sMOreg0.FILTER_STANDARDIZE, byteArray0[1]);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-3295), 1640.3481023360007, 176.912260647945, 3136.125536, 46, (-3295), 0.0, 1640.3481023360007, 724.14347, 3136.125536, (-3242.8538));
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
      double[] doubleArray0 = new double[24];
      SMOreg sMOreg0 = new SMOreg();
      byte byte0 = (byte)33;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(sMOreg0.FILTER_STANDARDIZE, doubleArray0[6], doubleArray0[6], doubleArray0[6], sMOreg0.FILTER_STANDARDIZE, doubleArray0[2], doubleArray0[6], doubleArray0[6], sMOreg0.FILTER_NORMALIZE, byte0, doubleArray0[6]);
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
        regSMO0.findOptimalPointOnLine(0, 0, 0, 0, 0, 0, (-3352.00808505542), 1624.58, 1624.58, 1624.58, (-3352.00808505542));
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
      double[] doubleArray0 = new double[24];
      SMOreg sMOreg0 = new SMOreg();
      double double0 = 6.0E-10;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(sMOreg0.FILTER_STANDARDIZE, double0, sMOreg0.FILTER_NONE, doubleArray0[0], sMOreg0.FILTER_STANDARDIZE, doubleArray0[2], doubleArray0[0], double0, doubleArray0[0], double0, doubleArray0[0]);
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
        regSMO0.findOptimalPointOnLine((-35), (-35), 4.9E-324, 2076243603, (-1449), 4.9E-324, 4.9E-324, 1568.2955151275028, (-2584), 1568.2955152843324, (-2584));
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
      String[] stringArray0 = regSMO0.getOptions();
      regSMO0.setOptions(stringArray0);
      assertEquals(6, stringArray0.length);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.getRevision();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.epsilonTipText();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("The epsilon for round-off error (shouldn't be changed).", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[0];
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = regSMO0.getEpsilon();
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.globalInfo();
      assertEquals("Implementation of SMO for support vector regression as described in :\n\nA.J. Smola, B. Schoelkopf (1998). A tutorial on support vector regression.", string0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
}
