/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:54:30 GMT 2019
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
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnCross;
import org.freehep.math.minuit.MnFunctionCross;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross((FCNBase) null, mnUserParameterState0, 2.0, (MnStrategy) null, 2163.0764);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-3818.57928), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1200.0108, mnStrategy0, 1.0E-35);
      int[] intArray0 = new int[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 1);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-114.8890818782), mnStrategy0, (-114.8890818782));
      int[] intArray0 = new int[4];
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-1.0), (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-114.8890818782), mnStrategy0, (-114.8890818782));
      int[] intArray0 = new int[4];
      intArray0[0] = (-1);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.0), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1263.605706, (-786.9936729709473), 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-722.205987696), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, doubleArray0, 11.127283070192457, 3207);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2856.908816000569, 2856.908816000569, (-3635.0139014027), 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-928.0), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, (-1));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 154.73603, 0.3, 1329.96979583277, 1329.96979583277).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-928.0), mnStrategy0, 1329.96979583277);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.9767880827278685), (-1980));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1497.1912185, (-1171.9720974519746), (-1171.9720974519746), 1497.1912185, (-143.36094475818396)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1171.9720974519746), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, (-1));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.0E-7, 926.5, 0.51, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-928.0), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, (-1));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1497.1912185, (-1171.9720974519746)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1171.9720974519746), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1185.8092, (-53));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 70.21626, 756.5104, 0.0, 118.02).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-928.0), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, (-1));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 3473.314201207, (-133.5)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-2001.04881988605);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1200.0108, mnStrategy0, 1.0E-35);
      int[] intArray0 = new int[2];
      mnUserParameterState0.setLowerLimit(2, 4.0);
      intArray0[0] = 2;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-6286.86), 1597);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1200.0108, mnStrategy0, 1.0E-35);
      int[] intArray0 = new int[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-6295.455725796891), 1597);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(100);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 100, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2728.35), mnStrategy0, 2.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 100);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 3473.314201207, (-133.5)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1200.0108, mnStrategy0, 1.0E-35);
      int[] intArray0 = new int[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-6286.86), 1597);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1310.68)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-928.0), mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1376.03781, 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy(1305);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 1305);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 10.0, 1305);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1200.0108, mnStrategy0, 1.0E-35);
      mnUserParameterState0.setLowerLimit(2, 4.0);
      int[] intArray0 = new int[6];
      intArray0[3] = 2;
      double[] doubleArray1 = new double[5];
      doubleArray1[3] = 10.0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 5, 665);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.7179115792035974), (-43.22), 92.97903, 577.066899122644, (-43.22)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 2.0;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLimits(2, 2992.108944, 129.5953514);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-7379.800649999999), mnStrategy0, 2.0);
      int[] intArray0 = new int[2];
      intArray0[1] = 2;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 2483);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.7179115792035974), (-43.22), 92.97903, 577.066899122644, (-43.22)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-2.0);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLimits(2, 2992.108944, 129.5953514);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-7379.800649999999), mnStrategy0, 2.0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 2483);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.7179115792035974), (-43.22), 92.97903, 577.066899122644, (-43.22)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLimits(2, 2992.108944, 129.5953514);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-7379.800649999999), mnStrategy0, 2.0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 2483);
  }
}