/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 02:47:54 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.functor.MatrixFunction;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication;
import org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.dense.BasicVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-70.5);
      doubleArray1[2] = (-1842.46);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 299;
      doubleArray2[2] = (double) 77;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = 2574.2758;
      doubleArray0[2] = doubleArray3;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.fromArray(doubleArray2);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertEquals(3, vector1.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-70.5);
      doubleArray1[2] = (-1842.46);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[2] = (double) 77;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = 2574.2758;
      doubleArray0[2] = doubleArray3;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.fromArray(doubleArray2);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      DenseMatrix denseMatrix0 = DenseMatrix.unit(113, 113);
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(113);
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)ooPlaceMatricesSubtraction0.applySimple(denseMatrix0, sparseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(basic2DMatrix0);
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      CompressedVector compressedVector0 = (CompressedVector)SparseVector.zero(113, 113);
      BasicVector basicVector0 = (BasicVector)ooPlaceVectorByMatrixMultiplication0.apply((SparseVector) compressedVector0, (DenseMatrix) basic2DMatrix0);
      // Undeclared exception!
      gaussianSolver0.solve(basicVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      Vector vector0 = rowMajorSparseMatrix0.getColumn(14);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
      assertEquals(0, vector1.length());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[1][2];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(denseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(113, 113);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      SparseVector sparseVector0 = SparseVector.zero(113, 113);
      Vector vector0 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, denseMatrix0);
      // Undeclared exception!
      gaussianSolver0.solve(vector0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(6);
      Vector vector0 = rowMajorSparseMatrix0.getColumn(1);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NEGATIVE_INFINITY, 1.1102230246251565E-14, (double)6, 0.0, Double.NEGATIVE_INFINITY).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      rowMajorSparseMatrix0.update(matrixFunction0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(190);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.zero(0);
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(190);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[18][2];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)ooPlaceMatrixByItsTransposeMultiplication0.apply(denseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(basic2DMatrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      BasicVector basicVector0 = (BasicVector)DenseVector.zero(89);
      BasicVector basicVector1 = (BasicVector)ooPlaceMatrixByVectorMultiplication0.apply((DenseMatrix) basic2DMatrix0, (DenseVector) basicVector0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(basicVector1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[4];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)ooPlaceMatrixByItsTransposeMultiplication0.apply(denseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(basic2DMatrix0);
      BasicVector basicVector0 = (BasicVector)Vector.fromArray(doubleArray1);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      BasicVector basicVector1 = (BasicVector)ooPlaceMatrixByVectorMultiplication0.apply((DenseMatrix) basic2DMatrix0, (DenseVector) basicVector0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(basicVector1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}
