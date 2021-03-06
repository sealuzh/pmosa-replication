/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:00:40 GMT 2019
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
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2677.724, 2677.724, 2677.724, 2677.724, 3742.44207).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2347.331;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setUpperLimit(0, 2677.724);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2347.331, mnStrategy0, 0);
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 1160.02801139, 5);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy((-311));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 8.0, mnStrategy0, (-311));
      int[] intArray0 = new int[7];
      intArray0[0] = (-311);
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, (-285));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy((-3507));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, (MnUserParameterState) null, 0.3, mnStrategy0, (-1875.3094019537602));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, (-3507), (-3507));
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
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross((FCNBase) null, mnUserParameterState0, (-0.5), mnStrategy0, 4.0E-7);
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 585.308, 1218);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2677.724, 2677.724, 2677.724, 2677.724, 3742.44207).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1382.3678555204, mnStrategy0, 2347.331);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-35, 0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setPrecision(1.0873411335221527E61);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[6];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1501.1049024663776, 1501.1049024663776, 1501.1049024663776, 2678.7287420603757, 2678.7287420603757).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 125.0976916, mnStrategy0, 1501.1049024663776);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-21), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-668.51945106), 1.6, 2677.7242821, 2677.7242821, 2677.7242821).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.2222109805492347, mnStrategy0, (-5623.587860953072));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.1, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0680494766899044E-11, 2.0680494766899044E-11, 2677.7242821, 1118.9491, (-994.827831)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-341.9), mnStrategy0, 0);
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-948.085732), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2347.331;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setUpperLimit(0, 2677.7242821);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      int[] intArray0 = new int[4];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2323.221442, (-1722.02170496757), 2323.221442, 2347.331, 1487.48365).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 100.0, mnStrategy0, 1487.48365);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2677.7242821, 2677.7242821, 2677.7242821, 2677.7242821, 3742.44207).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2347.331;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setUpperLimit(0, 2677.7242821);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-341.9), mnStrategy0, 0);
      int[] intArray0 = new int[4];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2347.331, (-2147483603));
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2.147483603E9), 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 2677.7242821, (-0.5), 2677.7242821).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1106.341566, mnStrategy0, 2347.331);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.5), 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 2677.7242821, (-0.5), 2677.7242821).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1106.341566, mnStrategy0, 2347.331);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.001, 0.001, 2722.526301122531, (-0.5), 2722.526301122531).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7.622570075874138, mnStrategy0, 0.001);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.05, 0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2677.724, 2677.724, 2677.724, 2677.724, 3742.44207).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2677.724;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-341.9), mnStrategy0, 0);
      int[] intArray0 = new int[4];
      mnUserParameterState0.setUpperLimit(0, (-268.9157043675635));
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2347.331, 3.0, 1.0E-35, 380.1, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-6, mnStrategy0, 2347.331);
      int[] intArray0 = new int[6];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2347.331;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setUpperLimit(0, 2677.7242821);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      int[] intArray0 = new int[4];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 100.0, mnStrategy0, 1487.48365);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-668.51945106), mnStrategy0, 1487.48365);
      int[] intArray0 = new int[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.05), 2126158090);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 2675.1033462381674, (-0.5), 2675.1033462381674).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int[] intArray0 = new int[4];
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, (-194.0));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1106.341566, 200);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.2, mnStrategy0, 7.622570075874138);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 169.1172, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 2677.7242821, (-0.5), 2677.7242821).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy((-2124342660));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2813.0295226), mnStrategy0, (-3028.30240284));
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, (double[]) null, (-541.36561694), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 0.51, 0.51, (-247.238614386)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.add("org.freehep.math.minuit.MnAlgebraicSymMatrix", (double) 0, (double) 0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2455.5), mnStrategy0, 1817.5135793);
      int[] intArray0 = new int[3];
      mnUserParameterState0.setLowerLimit("org.freehep.math.minuit.MnAlgebraicSymMatrix", 0.5);
      double[] doubleArray1 = new double[7];
      doubleArray1[2] = (-2455.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 3450.371514985, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.6;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-668.51945106), mnStrategy0, 1487.48365);
      int[] intArray0 = new int[3];
      mnUserParameterState0.setLowerLimit(0, 1.6);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 8);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setUpperLimit(0, 2677.7242821);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-341.9), mnStrategy0, 0);
      int[] intArray0 = new int[4];
      doubleArray0[0] = (double) (-2147483603);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2347.331, (-2147483603));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.001, 0.001, 2719.371696771464, 0.001, 2719.371696771464).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.001, mnStrategy0, 0.001);
      int[] intArray0 = new int[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-35, 3843);
      assertNotNull(mnCross0);
  }
}
