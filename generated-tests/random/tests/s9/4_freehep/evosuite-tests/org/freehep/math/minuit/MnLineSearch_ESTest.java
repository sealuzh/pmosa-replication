/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:02:18 GMT 2019
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
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnLineSearch;
import org.freehep.math.minuit.MnMachinePrecision;
import org.freehep.math.minuit.MnParabolaPoint;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnLineSearch_ESTest extends MnLineSearch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1.0));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 3, mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, 0);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 290.247, mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-0.13547405640983473));
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(940);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2890.333183), mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-51.688849), (-51.688849), (-51.688849), (-51.688849), (-51.688849)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1002.518779));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(8);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.05);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-0.47943930691945436));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.05, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1910.981984057), (-100.0), 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 927.915211467);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4.9, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1665.976717645236, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4.9, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, 3187.93557, 427.19, 427.19, 4864.4).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2, mnMachinePrecision0);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 927.915211467);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector0, (-1910.981984057), mnMachinePrecision0);
      assertFalse(mnParabolaPoint1.equals((Object)mnParabolaPoint0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1231.42659661, 4.0, 2074.4579, 4.0, (-1357.2978759774)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-513.0502228990457));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2485.34, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-51.688849)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1002.518779));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(8);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.05);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-100.0), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1307.03444);
      MinimumParameters minimumParameters0 = new MinimumParameters(2728);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2728);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(2728);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1307.03444, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 892.6372882505, 892.6372882505).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1307.03444);
      MinimumParameters minimumParameters0 = new MinimumParameters(2728);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2728);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2728, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4480.883185272771), 8.0, 0.96875, 8.0, 0.96875).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1.0));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(976);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 976);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-659.0), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2.0), (-2.0), (-2.0), 5.293955920339377E-23, (-3747.64654320044)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }
}