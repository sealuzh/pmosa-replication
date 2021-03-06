/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:23:37 GMT 2019
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
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(18, 18);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 18;
      boolean[] booleanArray0 = new boolean[6];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(0, 1621);
      double[] doubleArray0 = new double[9];
      boolean[] booleanArray0 = new boolean[4];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[9];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, (double[]) null, true, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.addElement(1646);
      optimization_DynamicIntArray0.addElement(200);
      assertEquals(2, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(21, 46, 46);
      double[] doubleArray0 = new double[6];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      double[] doubleArray1 = new double[2];
      doubleArray0[2] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 6, (-1355));
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[1] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray0[2], false, booleanArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(18, 18);
      double[] doubleArray0 = new double[9];
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[3] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[5][1];
      double[] doubleArray1 = new double[7];
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-1251), (-1251));
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray2, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray3, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(87, 87);
      double[] doubleArray0 = new double[5];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[6][0];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 195, 42);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0[0], false, (boolean[]) null);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3037);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt((-956));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertEquals(0, optimization_DynamicIntArray1.size());
      assertNotSame(optimization_DynamicIntArray1, optimization_DynamicIntArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      String string0 = optimization_DynamicIntArray0.getRevision();
      assertEquals("8076", string0);
      assertEquals(0, optimization_DynamicIntArray0.size());
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
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(200);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 200
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2135);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }
}
