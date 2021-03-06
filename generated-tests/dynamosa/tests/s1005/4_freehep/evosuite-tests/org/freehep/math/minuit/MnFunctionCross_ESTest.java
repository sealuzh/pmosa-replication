/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 05:27:51 GMT 2019
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
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-918.607245672), mnStrategy0, (-875.15771558649));
      int[] intArray0 = new int[4];
      intArray0[0] = (-2019);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2477.0), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2238.92), (-2238.92), 8.200000000000001, (-2238.92), 8.200000000000001).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 8.200000000000001, mnStrategy0, 8.200000000000001);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2238.92), 13);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 1.0, (-4361.801119106434), 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 1.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 1.0, 12);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, (MnUserParameterState) null, 1.0, mnStrategy0, 1.0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, (double[]) null, (double[]) null, 1.0, 2126221433);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0, mnUserCovariance0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 5.0, mnStrategy0, 8.881784197001252E-16);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 8.881784197001252E-16, (-2108));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(33.219350253189205, 33.219350253189205).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 33.219350253189205, mnStrategy0, 33.219350253189205);
      int[] intArray0 = new int[0];
      mnStrategy0.setHighStrategy();
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 33.219350253189205, (-2123622718));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 1.0, (-4361.61), 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1560.773822923063), mnStrategy0, 1295.4);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.6033283793521618), (-1781));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2, mnStrategy0, -0.0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, -0.0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, (-4362.79996218567));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.12629999999999997, 1118);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(12.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4361.61), mnStrategy0, 12.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 12.0, 1118);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.4603651301433044), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.4603651301433044), mnStrategy0, (-4336.581759612902));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 1115, 1115);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("", 1.0E-6, 0.0, 0.0, 1.0E-6);
      int[] intArray0 = new int[3];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1.0E-6;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1526.5848712, (-0.8333333333333334), (-786.126), 1526.5848712, 1.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 10.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.0, 2391);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3616.41119, 0.51, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3616.41119, mnStrategy0, 3616.41119);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, (-45), (-45));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 1.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.12629999999999997, 1118);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("GvK![BS1pwK#x6E", (-2172.47), (-2172.47), (-2172.47), (double) 0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2172.47), (-0.6033283793521618), (-1159.0), (-2172.47), (-2172.47)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2172.47), mnStrategy0, 1295.4);
      int[] intArray0 = new int[4];
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (-879.2219865354972);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.775287576534935E-11, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("lr|", 1.0, 1.0, (-934.5184494737069), 1.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 1.0, 1.0, (-934.5184494737069)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-12.05), mnStrategy0, 1.0);
      int[] intArray0 = new int[2];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-934.5184494737069), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1560.773822923063), mnStrategy0, 0.39667162064783823);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-4361.61), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("", 1.0, 0.0, (-934.5184494737069), 1.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1416.016, (double)0, (-1.0), 0.0, (-8.0724817572507)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-12.05), mnStrategy0, 0.0);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-8.0724817572507), 2126179246);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-8.0724817572507), 11);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 1.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 1.0, (-1390));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("2]}hN7VTJU", (double) 0, 1.0, (double) 0, 4599.665738737658);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-786.126), mnStrategy0, 4599.665738737658);
      int[] intArray0 = new int[5];
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = (-1.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1127;
      doubleArray0[1] = (double) 1127;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, (-661.9));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-661.9), 1127);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2172.47), (-2172.47), (-2172.47), (-2172.47), (-2172.47)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2172.47);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("vK![BS1pwKx6E", (-2172.47), (-2172.47), (-2172.47), (double) 1);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2172.47), mnStrategy0, 0.6436571273437989);
      mnUserParameterState0.setUpperLimit("vK![BS1pwKx6E", 0.6436571273437989);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2172.47), 1);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2172.2512291537123), (-2172.2512291537123), (-2172.2512291537123), 3450.504308172, 3450.504308172).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-2172.2512291537123);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("GrK![S1pwK#x-E", (-2172.2512291537123), 4.0, (-2172.2512291537123), (double) 0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, (-2172.2512291537123));
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 3450.504308172, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("lr|", 1.0, 1.0, (-934.3661000275431), 1.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 1.0, 1.0, (-8.0724817572507)).when(fCNBase0).valueOf(any(double[].class));
      mnUserParameterState0.setLowerLimit("lr|", (-934.3661000275431));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-12.05), mnStrategy0, 1.0);
      int[] intArray0 = new int[1];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-934.3661000275431), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("lr|", 1.0, 1.0, (-934.5184494737069), 1.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 1.0, 1.0, (-8.0724817572507)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-12.05), mnStrategy0, 1.0);
      int[] intArray0 = new int[2];
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 1.0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-934.5184494737069), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 1.0, (-4266.342389713), 1.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnUserParameterState0.add("n", 1.0E-6, (double) 0, 0.0, 1.0E-6);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4266.342389713), mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-6, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4007.3369), mnStrategy0, 1.0E-6);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 975.6578, 3);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4266.342389713), mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-6, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1117.25498973885), mnStrategy0, 2567.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, (-1117.25498973885), 0);
      assertNotNull(mnCross0);
  }
}
