/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 05:47:55 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.MnCross;
import org.freehep.math.minuit.MnFunctionCross;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserCovariance;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1710.74463, 919.91975517634, 1710.74463, (-2084.794554434), 4.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 800.755, mnStrategy0, 0.1);
      mnUserParameterState0.setUpperLimit(0, 0.1);
      int[] intArray0 = new int[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 6.057345906542361E171, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1486.3585321634216), mnStrategy0, (-1486.3585321634216));
      int[] intArray0 = new int[4];
      intArray0[1] = 410;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2306.264190113), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 410, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-2289.0431288646), (-2289.0431288646), (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-100.0));
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, (double[]) null, 100.0, 2338);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy((-5023));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 244.45188711062, mnStrategy0, (-2658.6));
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, doubleArray0, 0.0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.1103298178818624, mnStrategy0, 1.1103298178818624);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1053.19612908135), mnStrategy0, (-1053.19612908135));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, (-1053.19612908135), (-2021));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3169.2120397402286, 3169.2120397402286, 3169.2120397402286, 3169.2120397402286, 3169.2120397402286).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0, mnUserCovariance0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, Double.POSITIVE_INFINITY, mnStrategy0, (-2.841846273651047E21));
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-4, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3.0, 3.0).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      mnStrategy0.setHighStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 58.90742206867014, mnStrategy0, 58.90742206867014);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-15.852144331669571), (-15.852144331669571), (-15.852144331669571), (-1.0), (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("Dkp[", 1536.1466108025, (-1.0));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-15.852144331669571), mnStrategy0, 4.0E-7);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.0), 116);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 1.235841, (-2650.17766), (-292.1275866602), 1.235841).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 1.235841);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.0), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-379.3347662927731), (-379.3347662927731), 853.589, 853.589, 853.589).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 853.589, mnStrategy0, (-379.3347662927731));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.235841, 1.235841, 1.235841, 1.235841, 1.235841).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.235841, mnStrategy0, 1.235841);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-6.057345906542361E171), (-6.057345906542361E171), 1710.74463, (-6.057345906542361E171), 1710.74463).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[2];
      mnUserParameterState0.setUpperLimit(0, (double) 0);
      doubleArray1[0] = 0.4920329055750096;
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0, 0);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 1710.74463, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), (-0.5), (-2307.6), 1275.457281278055, 1662.69789907121).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 10.0, mnStrategy0, 1598.83778731948);
      int[] intArray0 = new int[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.2, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.2358409738685487, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.2358409738685487, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[0];
      mnUserParameterState0.add("", 1.2358409738685487);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      mnUserParameterState0.setUpperLimit(0, (double) 0);
      double[] doubleArray1 = new double[28];
      doubleArray1[0] = 853.1861502948842;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 853.1861502948842, 853.1861502948842, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 853.1861502948842, mnStrategy0, 853.1861502948842);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0, 1960);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1175.58514558, mnStrategy0, 1175.58514558);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-979649.36361534), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2161.89895, 2161.89895, 2161.89895, 2161.89895, 2161.89895).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2161.89895, mnStrategy0, 2161.89895);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 116);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      mnUserParameterState0.setUpperLimit(0, (double) 0);
      double[] doubleArray1 = new double[15];
      doubleArray1[0] = 853.589;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-353.5186916), (-353.5186916), 853.589, 853.589, (-353.5186916)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.6831055517722165), mnStrategy0, (-353.5186916));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-401.25), (-401.25), 853.589, 853.589, (-342.96578)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.5), mnStrategy0, (-401.25));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4.0, 15);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-342.96578), 15);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-6.057345906542361E171), (-6.057345906542361E171), 1710.74463, (-6.057345906542361E171), 1710.74463).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-6, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1710.74463, 0);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-2289.0431288646), (-2289.0431288646), (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-100.0));
      mnStrategy0.setHighStrategy();
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-100.0), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      mnUserParameterState0.setLowerLimit(0, (-401.25));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.5), mnStrategy0, (-401.25));
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-401.25);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 4.0, 15);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[15];
      doubleArray1[0] = 853.589;
      mnUserParameterState0.setLowerLimit(0, 3833.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-370.0215960878445), (-370.0215960878445), 853.589, 853.589, (-343.26071654358816)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.5), mnStrategy0, (-370.0215960878445));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-6.057345906542361E171), (-6.057345906542361E171), 1710.74463, (-6.057345906542361E171), 1710.74463).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[12];
      mnUserParameterState0.setUpperLimit(0, (double) 0);
      doubleArray1[0] = (-1.751658936192305);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      mnUserParameterState0.setUpperLimit(0, (double) 0);
      double[] doubleArray1 = new double[12];
      doubleArray1[0] = 853.589;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 853.589, 853.589, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 853.589, mnStrategy0, 0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }
}
