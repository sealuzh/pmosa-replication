/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 00:19:55 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.ForwardBackSubstitutionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Matrix matrix0 = Matrix.from1DArray(1180, 20, doubleArray0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(10);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.random(10, 10, 0.0, (Random) mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      SparseVector sparseVector0 = SparseVector.random(10, 0.0, (Random) mockRandom0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can not be solved: coefficient matrix is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(16);
      Matrix matrix0 = columnMajorSparseMatrix0.transpose();
      Vector vector0 = columnMajorSparseMatrix0.getRow(4);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertTrue(vector1.equals((Object)vector0));
  }
}