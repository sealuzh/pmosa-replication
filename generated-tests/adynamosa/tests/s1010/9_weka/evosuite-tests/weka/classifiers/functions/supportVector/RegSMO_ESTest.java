/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 12:57:21 GMT 2019
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
import weka.classifiers.functions.supportVector.SMOset;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RegSMO_ESTest extends RegSMO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[32];
      regSMO0.m_alphaStar = doubleArray0;
      SMOset sMOset0 = new SMOset(3642);
      regSMO0.m_supportVectors = sMOset0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_target = regSMO0.m_alphaStar;
      regSMO0.findOptimalPointOnLine(2, 0.0, 27, 27, 2, 2, 3854.974261393296, (-1022.54), 0.0, 785.2190773662387, 27);
      regSMO0.optimize();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (double) (-13);
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic((-13));
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_C = (double) 2256L;
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2256.0;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic(1879);
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
        regSMO0.findOptimalPointOnLine(88, 717.0343243257412, 2145794014, (-3041.8), 88, (-3715.0), 0.0, (-1884.5), 0.0, 2145794014, 1.3);
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
        regSMO0.findOptimalPointOnLine(82, (-2164.1329795), (-0.002), 1763.0546, 82, (-2824), 15.0, 5673.98, 3419.4, 2279.73987, 2968.1);
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
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_target = regSMO0.m_alphaStar;
      try { 
        regSMO0.examineExample(1);
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
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      
      regSMO0.m_eps = 0.0;
      double double0 = regSMO0.getEpsilon();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_eps = (-5920.888638357366);
      double double0 = regSMO0.getEpsilon();
      assertEquals((-5920.888638357366), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep(3267, 3267, 0.0, 907.64701614, 3267);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep(0, 0, 0, 0, 2.0);
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep(531, 0, 0.1, 0.1, 4156.40630265878);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setOptions((String[]) null);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      
      regSMO0.setEpsilon(0.0);
      assertEquals(0.0, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon((-326.7415330649));
      assertEquals((-326.7415330649), regSMO0.getEpsilon(), 0.01);
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
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_target = regSMO0.m_alphaStar;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("SMOreg\n\nSupport vectors:\n +       0     \n\n\n\nNumber of kernel evaluations: 0", arrayList0, 2);
      SparseInstance sparseInstance0 = new SparseInstance(2.0, regSMO0.m_target);
      instances0.add((Instance) sparseInstance0);
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
  public void test17()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      boolean boolean0 = regSMO0.findOptimalPointOnLine(0, 872.726436, 0, (-1717.3), (-1), 0.0, (-2417.7526), (-1), 0.0, 0.0, 2384.6241926);
      assertFalse(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
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
        regSMO0.examineExample((-1));
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
  public void test21()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      SMOreg sMOreg0 = new SMOreg();
      regSMO0.m_SVM = sMOreg0;
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("V", arrayList0, 2);
      try { 
        regSMO0.init(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // weka.classifiers.functions.supportVector.PolyKernel: No attributes!
         //
         verifyException("weka.core.Capabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.setEpsilon(1763.0546);
      assertEquals(1763.0546, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[32];
      doubleArray0[10] = (double) 27;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_target = regSMO0.m_alphaStar;
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
  public void test24()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[0];
      regSMO0.m_target = doubleArray0;
      regSMO0.optimize();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_nInstances = 2302;
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
  public void test26()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.m_C = (double) 2257L;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1331;
      regSMO0.m_alpha = doubleArray0;
      int int0 = regSMO0.secondChoiceHeuristic(32);
      assertEquals(0, int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (double) 27;
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      int int0 = regSMO0.secondChoiceHeuristic(27);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.secondChoiceHeuristic((byte)0);
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
      double[] doubleArray0 = new double[32];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      int int0 = regSMO0.secondChoiceHeuristic(27);
      assertEquals((-1), int0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      int int0 = regSMO0.takeStep((-3446), (-3446), (-1037.29495505721), 3000.250120217572, (-1057.47));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      try { 
        regSMO0.takeStep((-2824), (-1897), (-381.789), (-381.789), 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      SMOset sMOset0 = new SMOset(4059);
      regSMO0.m_supportVectors = sMOset0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(2, 0.0, 0, 0, 2, 2, 3869.197514, 4, 0.0, 785.2190773662387, 0);
      assertTrue(boolean0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 1534.209650458016, 0.0, (-1524.2527850209692), 2, (-1989.9), 3869.197513636, (-1022.54), 27.0, 785.2190773662387, 1.0);
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
      double[] doubleArray0 = new double[15];
      regSMO0.m_alpha = doubleArray0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((byte)0, 27.0, 0, (-1270.818838181), 0, 27.0, (-0.5), 27.0, 0, 7.861879820100352, 402.950447);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_eps = 785.0;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 0.0, 0, 0, 2, 2, 3869.197514, 4, 0.0, 785.2190773662387, 0);
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
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      regSMO0.m_eps = 785.0;
      boolean boolean0 = regSMO0.findOptimalPointOnLine(2, 0.0, 0, 0, 2, 2, 27.0, 4, 0.0, 799.6431150069081, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double[] doubleArray0 = new double[15];
      regSMO0.m_alphaStar = doubleArray0;
      regSMO0.m_alpha = regSMO0.m_alphaStar;
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(2, 1, 583, 2185.516436212038, 80, 2, 4, 2901, 0.0, 80, 1171.4848);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 80
         //
         verifyException("weka.classifiers.functions.supportVector.RegSMO", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(85, (-2010.5514789), 85, 1164.9999998835, 85, (-2010.5514789), 85, 1164.9999998835, (-433.34720698138), 1164.9999998835, 0.9999999999);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine(10, (-2011.389), 10, 1165.0146819071078, 10, (-2011.389), 10, 1165.0146819071078, (-2011.389), 1165.0146819071078, 1830);
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
      // Undeclared exception!
      try { 
        regSMO0.findOptimalPointOnLine((-1387), 0.0, 1.7976931348623157E308, (-3195.576887), 935, 0.0, 0.0, 0.0, 0.0, 935, 0.0);
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
        regSMO0.findOptimalPointOnLine(3, (-1980.575), 935, 59, 59, 0.0, (-1780.47342), (-0.002), 1.7976931348623157E308, 59.0, 59);
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
        regSMO0.findOptimalPointOnLine((-4286395), 0.0, 0.0, (-446.99985), (-1), (-4286395), 717.0343243257412, 1071.9, (-446.99985), 717.0343243257412, (-446.99985));
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
        regSMO0.findOptimalPointOnLine((-2824), (-3506.0), 598.0, 583.7336078027, (-2824), (-3506.0), 2287.49533430378, 1742.90634, (-499.985253079873), 1.0, (-2824));
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
        regSMO0.findOptimalPointOnLine(2145987162, (-1368.984638), 2145987162, 3445.810166301079, 2145987162, 1177.14567, 3445.810166301079, 3.003249362739144, (-1368.984638), 2.1465782681702354E9, 3.003249362739144);
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
        regSMO0.findOptimalPointOnLine(1057, 1136.741231, 1.0E-12, 2287.49533430378, 2599, 0.9999999999, 1.0E-12, 1.0E-12, 0.9999999999, 1.0E-12, (-1.0E-6));
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
        regSMO0.findOptimalPointOnLine(80, 6.7, 135.3291732, 1033.680449341, 80, 2287.49533430378, 1033.680449341, 135.3291732, 478.8129852461625, 35.582965378178145, 1.2);
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
        regSMO0.findOptimalPointOnLine((-1077371168), 951.920431, 1.0E10, 1.0E-12, 220, (-1.0), 2.0, 2145987143, (-3385.74), 477.0, 1746.9757294147);
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
        regSMO0.findOptimalPointOnLine(2146578270, 2146578270, 2146578270, 1164.9999998835, 2146578270, (-62.01040800146), 2146578270, 1164.9999998835, (-433.34720698138), 1164.9999998835, 0.9999999999);
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
        regSMO0.findOptimalPointOnLine(967, 2.0E-13, 917, 4058.1581454348448, 0, 0, (-433.34720698138), (-2011.389), (-2011.389), 1075.904948, 1);
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
        regSMO0.findOptimalPointOnLine(2145641918, 10, (-2197.15846669), (-883.8860462034648), 10, 0.0, (-6317.7542926858), 1.0E-10, 0.0, 626.7514765817233, (-6317.7542926858));
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
        regSMO0.findOptimalPointOnLine((-2146723476), 477.0, 135.3291732, 477.0, 1165, 1165, (-1.0), 1165, 1.0E-10, 1165, 135.3291732);
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
        regSMO0.findOptimalPointOnLine((-2723), 474.18824326486265, 0.002, 1746.9757294147, (-100), 1746.9757294147, (-1735.054202), 477.0, 476.9999999523, 1218.43401889978, 477.0);
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
        regSMO0.findOptimalPointOnLine((-2824), 1.165E-7, (-4300.813826), 1642.0, (-1), 1.0E-10, (-1133.316264865), 0.2, 1279.741, 1.0E-10, (-158.8));
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
        regSMO0.findOptimalPointOnLine(88, 717.0343243257412, 2145794014, 88, 88, (-3715.0), 0.0, (-1884.5), 0.0, 2145794014, 0.0);
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
        regSMO0.findOptimalPointOnLine(0, 8.100325371036162, 0, 1777.79549879, 573, (-1976.468754862), 0.0, 1.83E-7, Double.POSITIVE_INFINITY, 8.42920434530119, (-592.61016633));
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
        regSMO0.findOptimalPointOnLine((-2038), (-2038), 1081.396915, 1081.396915, 79, 1313.581, 1.0E-4, 0.002, (-627.6609), 0.21459871430000002, 1.7976931348623157E308);
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
      boolean boolean0 = regSMO0.findOptimalPointOnLine((-2824), (-0.002), 2287.49533430378, (-2384.0), (-2824), (-2824), 583.7336078027, (-3385.74), (-2080.7915504556395), (-2384.0), (-2384.0));
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = regSMO0.getOptions();
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.listOptions();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.globalInfo();
      assertEquals("Implementation of SMO for support vector regression as described in :\n\nA.J. Smola, B. Schoelkopf (1998). A tutorial on support vector regression.", string0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.getRevision();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String string0 = regSMO0.epsilonTipText();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
      assertEquals("The epsilon for round-off error (shouldn't be changed).", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      String[] stringArray0 = new String[0];
      regSMO0.setOptions(stringArray0);
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      double double0 = regSMO0.getEpsilon();
      assertEquals(1.0E-12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      regSMO0.getTechnicalInformation();
      assertEquals(1.0E-12, regSMO0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      RegSMO regSMO0 = new RegSMO();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Z_r", arrayList0, 121);
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
