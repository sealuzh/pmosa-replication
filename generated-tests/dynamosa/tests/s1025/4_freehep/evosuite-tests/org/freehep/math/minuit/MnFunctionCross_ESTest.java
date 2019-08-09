/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 15:51:02 GMT 2019
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, (MnStrategy) null, 0.0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1758.0), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[0];
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.033748355564916954, mnStrategy0, 0.033748355564916954);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.033748355564916954, 3753);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 6.6000000000000005, (MnStrategy) null, 6.6000000000000005);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, 6.6000000000000005, (-2630));
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
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2185.7569031), mnStrategy0, (-2185.7569031));
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2185.7569031), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(3);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0, mnUserCovariance0);
      MnStrategy mnStrategy0 = new MnStrategy((-2125791893));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4770.414475945275), mnStrategy0, (-3622.2702635855));
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-4770.414475945275), 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 1.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 0.5);
      mnStrategy0.setHighStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[22];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, (-4284));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2185.7569031), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2185.7569031), mnStrategy0, Double.POSITIVE_INFINITY);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2185.7569031), 2126115651);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, (-3524.3), 2.2, 2.2, (-1500.0615920282994)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-3524.3), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-3524.3), 1599);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 1.0, 2.2, 2.2, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 1.4635358135026884);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[24];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-433.508), (-704534343));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[24];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 2.2, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, (-1582.586));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4.0, (-704534343));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[24];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1544.48348695043, 0.5, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.2, mnStrategy0, 10.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 1599);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.58248741303496, 7.58248741303496, 7.58248741303496, 7.58248741303496, (-1504.6061253327043)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      mnUserParameters0.setLowerLimit(0, (-1509.5762094923105));
      double[] doubleArray1 = new double[4];
      doubleArray1[2] = (-1509.5762094923105);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1509.5762094923105), mnStrategy0, 7.58248741303496);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, (double[]) null);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, (-617.942), (-617.942), (-2185.7569031), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2185.7569031), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.5, (-1467));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(136.768234554, 136.768234554, 136.768234554, (-245.46182317), 4310.131390199).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 4310.131390199);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 3382);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(8.200000000000001, 8.200000000000001, 8.200000000000001, 8.200000000000001, (-1504.6061253327043)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      mnUserParameters0.setLowerLimit(0, (-1504.6061253327043));
      double[] doubleArray1 = new double[4];
      doubleArray1[2] = (-1504.6061253327043);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1504.6061253327043), mnStrategy0, 8.200000000000001);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(8.200000000000001, 8.200000000000001, 8.200000000000001, 8.200000000000001, (-1504.6061253327043)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1504.6061253327043);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      mnUserParameters0.setLowerLimit(0, (-1516.6724375900405));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.4962110993741555), mnStrategy0, (-1504.6061253327043));
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, 0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 1.0, 2.2, 2.2, (-1499.7708052675464)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.680379287010151E-17, (-1085));
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1753.4853), (-3620));
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 2.2, 2.2, 2.2, (-1504.6061253327043)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1504.6061253327043);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[3];
      mnUserParameters0.setLowerLimit(0, (-1504.6061253327043));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1504.6061253327043), mnStrategy0, 2.2);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      int[] intArray0 = new int[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1073745844, mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1530.35564743252), 1073745844);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5, 0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 98);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 1.0, 2.2, 2.2, (-1500.0615920282994)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[24];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, 1599);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, (-1388));
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1442.310186986929), 3247.0, 3247.0, 3247.0, 3247.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2227.651390221, mnStrategy0, 2.0);
      int[] intArray0 = new int[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2227.651390221, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5, 0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      mnStrategy0.setHighStrategy();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 1073745844);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 2.2, 2.2, 2.2, (-1504.6061253327043)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1504.6061253327043);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      mnUserParameterState0.setUpperLimit(0, 2.2);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1516.6724375900405), mnStrategy0, 2.2);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1504.6061253327043), 0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 0.5;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2227.651390221), mnStrategy0, 0.0);
      int[] intArray0 = new int[4];
      mnUserParameters0.setLimits(0, 7.993605777301127E-16, (-106.9223));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.05, 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 0.5;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.5, 0.5, 3287.320307417461, 1308.69956034).when(fCNBase0).valueOf(any(double[].class));
      mnUserParameters0.setLowerLimit(0, (-1523.3824381));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 2125344641);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, 2.2, 2.2, 2.2, (-1504.6061253327043)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1504.6061253327043);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      mnUserParameters0.setLowerLimit(0, (-1516.6724375900405));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2735.0068018254915), mnStrategy0, 0);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2735.0068018254915), 0);
  }
}
