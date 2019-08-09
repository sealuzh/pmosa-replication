/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 14:06:55 GMT 2019
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
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MinimumParameters minimumParameters0 = new MinimumParameters(441);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1430.7892602));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, (MnMachinePrecision) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumParameters minimumParameters0 = new MinimumParameters((MnAlgebraicVector) null, (MnAlgebraicVector) null, (-915.7126464183));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, (MnAlgebraicVector) null, (-915.7126464183), mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(680);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, (MinimumParameters) null, mnAlgebraicVector0, (-2994.15878517725), mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MinimumParameters minimumParameters0 = new MinimumParameters(441);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 441, mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(401);
      MinimumParameters minimumParameters0 = new MinimumParameters(399);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 401, mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(573.465580777351, 573.465580777351, (-117.259), 8.0, 154.6901594711181).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(302);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1244.3));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 302, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3355.1948206), (-3355.1948206), (-0.1), 2088.421201739, (-2814.028304)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(302);
      mnFcn0.valueOf(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1244.3));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 302, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(953.10375, (-3958.57), 1215.44, 953.10375, 953.10375).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(302);
      mnFcn0.valueOf(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-3958.57));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 302, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MinimumParameters minimumParameters0 = new MinimumParameters(441);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)441, (double)441, (double)441, (-2003.6018415), (double)441).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 441);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 441, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3355.1948206), (-3355.1948206), (-0.1), 2088.421201739, (-2814.028304)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(302);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1244.3));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 302, mnMachinePrecision0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1244.3), mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2108.15), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1590);
      MinimumParameters minimumParameters0 = new MinimumParameters(1590);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2108.15));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1207);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1501.3);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3104.2707), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MinimumParameters minimumParameters0 = new MinimumParameters(441);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)441, (double)441, (double)441, (double)441, 0.20372652328203508).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 441);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 441, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MinimumParameters minimumParameters0 = new MinimumParameters(441);
      mnMachinePrecision0.setPrecision(441);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)441).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 441);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 441, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(400);
      MinimumParameters minimumParameters0 = new MinimumParameters(400);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)400, (double)400, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 400);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 400, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(441);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)441, 0.0296875, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      mnMachinePrecision0.setPrecision((-2550.284626932396));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2550.284626932396));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(441);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 512.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }
}