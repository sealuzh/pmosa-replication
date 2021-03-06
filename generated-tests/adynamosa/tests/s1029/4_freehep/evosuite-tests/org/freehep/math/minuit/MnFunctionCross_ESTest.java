/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 22:36:30 GMT 2019
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
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4950.2, mnStrategy0, (-2450.0119085802044));
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, (double[]) null, 7300690.25642704, 1166);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4950.2, mnStrategy0, (-2450.0119085802044));
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, doubleArray0, (-1526.991251708188), (-639));
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
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4950.2, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1), 109);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0042645091352704, mnStrategy0, 2.0042645091352704);
      double[] doubleArray0 = new double[10];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, (-2971), (-2971));
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
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-35, (MnStrategy) null, 0.0);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, (-792));
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
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy((-1640));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1054.0), mnStrategy0, (-1640));
      int[] intArray0 = new int[7];
      intArray0[0] = (-1640);
      double[] doubleArray0 = new double[6];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2214.182), (-160));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("C>S&", 10.0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      int[] intArray0 = new int[2];
      double[] doubleArray0 = new double[2];
      mnStrategy0.setHighStrategy();
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-101.79725325489001), 0);
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
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnWo>,EtS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[2];
      mnUserParameterState0.setLimits("HnWo>,EtS", 0.1, 0.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)660, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-45.3040721310767), mnStrategy0, 0.0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-45.3040721310767);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 616.0078592742123, 1);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), (-3651.42293527), 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnD;Wo>,EtSS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-45.3040721310767));
      int[] intArray0 = new int[5];
      mnUserParameterState0.setLimits("HnD;Wo>,EtSS", 1270.110888865049, 4.0);
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = new double[16];
      doubleArray1[2] = 1270.110888865049;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 1270.110888865049, (-1014));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnWo>,EtS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[2];
      double[] doubleArray0 = new double[15];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)660, (-45.3040721310767), (-3184.803255951812), (-319.9161), (double)(-1014)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-45.3040721310767), mnStrategy0, 0.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 40.77366491796903, 325328);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(493.240597, 493.240597, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("7MEQT?Zh", 6977.870641661214);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0042645091352704, mnStrategy0, 2.0042645091352704);
      double[] doubleArray0 = new double[9];
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 34, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnD;Wo>,EtSS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[5];
      double[] doubleArray0 = new double[8];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1270.110888865049, 0.0, (-0.5), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.830743904316143E-5), mnStrategy0, 0.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 1098);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("7MEQT?Zh", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[2];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1023.6), 1475.962916202, (-1027.625492), 9.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7305640.4564270405, mnStrategy0, 2.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-834.0549067), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnWo>,EtS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[2];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(6.6000000000000005, 3384.252922759319, (double)660, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[15];
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-4, mnStrategy0, 660);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.5), 660);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnD;Wo>,EtSS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[5];
      mnUserParameterState0.setLimits("HnD;Wo>,EtSS", 1270.110888865049, 4.0);
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (double) 660;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.0, 1270.110888865049, (-20.8927994561213), (-3651.42293527), (-0.09466050015751142)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.830743904316143E-5), mnStrategy0, 0.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-45.3040721310767), 660);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.270809648050802, 2.0042645091352704).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("7MEQT?Zh", 6977.870641661214);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0042645091352704, mnStrategy0, 2.0042645091352704);
      double[] doubleArray0 = new double[6];
      int[] intArray0 = new int[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.7945212695803714, 34);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.238811968809753, 3.0, 3.0, 10.0, 3.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("7MEQT?Zh", 6989.4247);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3.0, mnStrategy0, 3.0);
      mnUserParameterState0.setLimits(0, 10.0, 0.0);
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (-362.514937948);
      int[] intArray0 = new int[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.51, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-362.514937948), 0);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), (-3651.42293527), (-0.5), 4.0, (-45.3040721310767)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnD;Wo>,EtSS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-45.3040721310767));
      int[] intArray0 = new int[5];
      mnUserParameterState0.setLimits("HnD;Wo>,EtSS", 1270.110888865049, 4.0);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 660;
      double[] doubleArray1 = new double[16];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 1270.110888865049, (-1014));
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, 4.0, 2147483598);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnWo>,EtS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-45.3040721310767));
      int[] intArray0 = new int[2];
      mnUserParameterState0.setLimits("HnWo>,EtS", 0.1, 0.0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-45.3040721310767);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 616.0078592742123, 1);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0042645091352704, 2.0042645091352704, 2.0042645091352704, 1842.0, 2.0042645091352704).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0042645091352704, mnStrategy0, 2.0042645091352704);
      double[] doubleArray0 = new double[10];
      int[] intArray0 = new int[0];
      mnUserParameterState0.add((String) null, 2.162277660168378, 0.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 34);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnD;Wo>,EtSS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-45.3040721310767));
      int[] intArray0 = new int[5];
      double[] doubleArray0 = new double[5];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-4.5304072131076705), 660);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy(3111);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1758.0, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 3111);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 3.0, 3.0, 10.0, (-0.5)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnUserParameterState0.add("L-W;l_sDO& }!&z", 3.0, 1971.7293392977208, 3619.96344526, 2450.369334560961);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3.0, mnStrategy0, 3.0);
      int[] intArray0 = new int[3];
      double[] doubleArray0 = new double[6];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, (-4656));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), (-0.5), (-0.5), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnWo>,EtS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-45.3040721310767));
      int[] intArray0 = new int[2];
      double[] doubleArray0 = new double[15];
      mnUserParameterState0.setUpperLimit("HnWo>,EtS", 0.1);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-319.9161);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 2, (-3927));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("HnWo>,EtS", 0.0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-1986.2987625));
      int[] intArray0 = new int[5];
      double[] doubleArray0 = new double[5];
      mnUserParameterState0.setLowerLimit("HnWo>,EtS", (-1416.573137482592));
      double[] doubleArray1 = new double[16];
      doubleArray1[0] = 1.0E-4;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 5046.4, (-1014));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 10.0, (-566.2572439015499), (-566.2572439015499)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("C>S&", 10.0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      int[] intArray0 = new int[2];
      double[] doubleArray0 = new double[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 2089443549);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 5868.4126, 0);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-45.3040721310767));
      int[] intArray0 = new int[5];
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1270.110888865049, (-1014));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
