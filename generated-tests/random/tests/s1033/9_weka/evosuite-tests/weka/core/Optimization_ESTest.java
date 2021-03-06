/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:21:37 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(30);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(2560);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(93, 93);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 93;
      boolean[] booleanArray0 = new boolean[7];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {93.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeElementAt(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(30);
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(98, 92);
      double[] doubleArray0 = new double[8];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(98, 92);
      double[] doubleArray0 = new double[8];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[7] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertEquals(8, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[8][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[1] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2808, 7);
      boolean[] booleanArray0 = new boolean[7];
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray0[1], false, booleanArray0);
      assertNotSame(doubleArray2, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(93, 93);
      double[] doubleArray0 = new double[7];
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[4] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 0, 1400);
      double[] doubleArray1 = new double[1];
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1);
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 0, 1400);
      boolean[] booleanArray0 = new boolean[5];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertEquals(0, optimization_DynamicIntArray1.size());
      assertNotSame(optimization_DynamicIntArray1, optimization_DynamicIntArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      String string0 = optimization_DynamicIntArray0.getRevision();
      assertEquals(0, optimization_DynamicIntArray0.size());
      assertEquals("8076", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(30);
      optimization_DynamicIntArray0.elementAt(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }
}
