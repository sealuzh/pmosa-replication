/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:39:03 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.jdbc.FBProcedureCall;
import org.firebirdsql.jdbc.FBProcedureParam;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBProcedureCall_ESTest extends FBProcedureCall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(46, "jN_J?^ccPe8$d/=h");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(46, "pVuNz)hO@1&.3>.5v");
      assertEquals(46, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(887);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(1);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-694), true);
      assertEquals((-694), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "N_`?^ccPe8$d/=h");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(41, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "N_`?^ccPe8$d/=h");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureParam0.setIndex(40);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(40);
      assertEquals(40, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertNull(fBProcedureParam1.getParamValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1, "{f");
      fBProcedureCall0.registerOutParam((-1), (-1));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals((-1), fBProcedureParam0.getType());
      assertEquals(1, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("SELECT * FROM null");
      String string0 = fBProcedureCall0.getName();
      assertEquals("SELECT * FROM null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(1);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      fBProcedureParam0.setValue("jN_J?^ccPe8$d/=[");
      fBProcedureParam0.setIndex(44);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(44);
      assertEquals(44, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "?22");
      fBProcedureParam0.setType(2);
      fBProcedureParam0.setIndex(2);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(2);
      assertEquals(2, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      fBProcedureParam0.setIndex(44);
      fBProcedureParam0.setType((-1));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(44);
      assertEquals(44, fBProcedureParam1.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      assertEquals((-1), fBProcedureParam1.getIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName((String) null);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      String string0 = fBProcedureCall0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(31, 0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-66072936));
      assertEquals((-66072936), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      assertFalse(fBProcedureParam0.isValueSet());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1);
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureParam0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2263, "");
      assertEquals(2263, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "N_`?^ccPe8$d/=h");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "y&G=GO");
      fBProcedureParam0.setType(1917);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "va");
      fBProcedureParam0.setType((-56));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(44, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "jN_J?^ccPe8$d/=[");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-694), true);
      assertEquals((-694), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(46, "jN_J?^ccPe8$d/=h");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(46, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertFalse(fBProcedureParam0.isValueSet());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      Object object0 = new Object();
      fBProcedureParam0.setValue(object0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(44, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(31);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "{f");
      fBProcedureCall0.registerOutParam((-1), (-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals((-1), fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(1934);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertFalse(fBProcedureParam0.isValueSet());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(2, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-136), "|*+V`B5jSe]_b?");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -136
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1), "EXECUTE PROCEDURE null");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "jN_J?^ccPe8$d/=h");
      assertEquals(40, fBProcedureParam0.getPosition());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(31);
      assertFalse(fBProcedureParam1.isParam());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("org.firebirdsql.jdbc.FBProcedureCall");
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("pVuNz)hO@1&.3>.5v");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      //  // Unstable assertion: assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.setName("org.firebirdsql.jdbc.FBProcedureCall");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      //  // Unstable assertion: assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(46, "jN_J?^ccPe8$d/=h");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1688, "SELECT * FROM null(jN_J?^ccPe8$d/=h)");
      assertEquals(1688, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(jN_J?^ccPe8$d/=h, SELECT * FROM null(jN_J?^ccPe8$d/=h))", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(301, "jN_J?^ccPe8$d/=[");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "N_`?^ccPe8$d/=h");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(N_`?^ccPe8$d/=h)", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1, "pVuNz)hO@1&.3>.5v");
      String string0 = fBProcedureCall0.getSQL(true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "N_`?^ccPe8$d/=h");
      fBProcedureParam0.setValue(fBProcedureCall0);
      assertEquals(40, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(N_`?^ccPe8$d/=h)", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      assertEquals(44, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(jN_J?^ccPe8$d/=[)", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      Object object0 = new Object();
      fBProcedureParam0.setValue(object0);
      fBProcedureCall0.registerOutParam((-1), 44);
      assertNull(fBProcedureCall0.getName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(44, "jN_J?^ccPe8$d/=[");
      fBProcedureCall0.registerOutParam((-1), 4);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(44, fBProcedureParam0.getPosition());
      assertEquals(4, fBProcedureParam0.getType());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "pVuNz)hO@1&.3>.5v");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), 547);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1249), "pVuNz)hO@1&.3>.5v");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1249
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(44, "org.firebirdsql.jdbc.FBProcedureCall$NullParam");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(44, fBProcedureParam0.getPosition());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-2337), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "jN_J?^ccPe8$d/=h");
      fBProcedureParam0.setIndex(40);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(40, true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "pVuNz)hO@1&.3>.5v");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(46, true);
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "jN_J?^ccPe8$d/=h");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(40, true);
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(40, "N_`?^ccPe8$d/=h");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(40, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "SELECT * FROM null");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1060);
      try { 
        fBProcedureParam1.setValue(fBProcedureParam0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.isEmpty());
  }
}
