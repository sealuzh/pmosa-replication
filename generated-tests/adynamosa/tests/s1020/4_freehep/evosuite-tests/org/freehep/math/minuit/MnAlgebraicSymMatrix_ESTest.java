/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 06:43:36 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnAlgebraicSymMatrix_ESTest extends MnAlgebraicSymMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-5341), 1256, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(0, 1930);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.nrow();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      int int0 = mnAlgebraicSymMatrix0.nrow();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.ncol();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(14);
      double double0 = mnAlgebraicSymMatrix0.get(4, 4);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      double[] doubleArray0 = mnAlgebraicSymMatrix0.data();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(0, (-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(890);
      // Undeclared exception!
      mnAlgebraicSymMatrix0.toString();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-1), (-166), 1.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -166
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-2901), (-2901));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.eigenvalues();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(9);
      mnAlgebraicSymMatrix0.set(8, 8, (-2641));
      MnAlgebraicVector mnAlgebraicVector0 = mnAlgebraicSymMatrix0.eigenvalues();
      assertNotNull(mnAlgebraicVector0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(15);
      mnAlgebraicSymMatrix0.invert();
      // Undeclared exception!
      mnAlgebraicSymMatrix0.eigenvalues();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(118);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-166), 118, (-166));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(14);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(105, 1, (-3787.8625));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-32), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(80, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(9);
      mnAlgebraicSymMatrix0.set(8, 8, (-2641));
      try { 
        mnAlgebraicSymMatrix0.invert();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      try { 
        mnAlgebraicSymMatrix0.invert();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(17);
      mnAlgebraicSymMatrix0.invert();
      mnAlgebraicSymMatrix0.invert();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = null;
      try {
        mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix((-1480));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid matrix size: -1480
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(17);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      assertNotSame(mnAlgebraicSymMatrix1, mnAlgebraicSymMatrix0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(17);
      int int0 = mnAlgebraicSymMatrix0.size();
      assertEquals(153, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      int int0 = mnAlgebraicSymMatrix0.ncol();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(17);
      String string0 = mnAlgebraicSymMatrix0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(17);
      double[] doubleArray0 = mnAlgebraicSymMatrix0.data();
      assertEquals(153, doubleArray0.length);
  }
}
