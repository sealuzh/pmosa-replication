/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 17:42:31 GMT 2019
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
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(12);
      MnAlgebraicVector mnAlgebraicVector0 = mnAlgebraicSymMatrix0.eigenvalues();
      assertNotNull(mnAlgebraicVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(533);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-2716), 748, (-1429.95635482));
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
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-759), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(4);
      mnAlgebraicSymMatrix0.invert();
      mnAlgebraicSymMatrix0.invert();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      int int0 = mnAlgebraicSymMatrix0.size();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.nrow();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      int int0 = mnAlgebraicSymMatrix0.nrow();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.ncol();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(12);
      double double0 = mnAlgebraicSymMatrix0.get(0, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      double[] doubleArray0 = mnAlgebraicSymMatrix0.data();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(2, 0, 0);
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
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(12);
      mnAlgebraicSymMatrix0.set(0, 0, 1.0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(23);
      mnAlgebraicSymMatrix0.set(4, 5, 1.0E-35);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(0, (-443));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(837, 837);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1145);
      // Undeclared exception!
      mnAlgebraicSymMatrix0.toString();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(12);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(0, (-442), (-442));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -442
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-320), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-2716), 2, 2);
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
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      mnAlgebraicSymMatrix0.set(0, 2, 1926.613426);
      MnAlgebraicVector mnAlgebraicVector0 = mnAlgebraicSymMatrix0.eigenvalues();
      assertNotNull(mnAlgebraicVector0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(0, (-845), 1460.55);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-1641), 2840);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      mnAlgebraicSymMatrix0.invert();
      // Undeclared exception!
      mnAlgebraicSymMatrix0.eigenvalues();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = null;
      try {
        mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix((-470));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid matrix size: -470
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      assertNotSame(mnAlgebraicSymMatrix1, mnAlgebraicSymMatrix0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(14);
      int int0 = mnAlgebraicSymMatrix0.ncol();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      String string0 = mnAlgebraicSymMatrix0.toString();
      assertEquals("LASymMatrix parameters:\n\n   0.00000    0.00000    0.00000 \n   0.00000    0.00000    0.00000 \n   0.00000    0.00000    0.00000 \n", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      double[] doubleArray0 = mnAlgebraicSymMatrix0.data();
      assertEquals(6, doubleArray0.length);
  }
}
