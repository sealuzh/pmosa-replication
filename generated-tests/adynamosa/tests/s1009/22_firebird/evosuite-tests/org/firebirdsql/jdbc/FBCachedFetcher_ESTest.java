/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 11:51:50 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.DatabaseParameterBuffer;
import org.firebirdsql.gds.GDS;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.AbstractIscStmtHandle;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.isc_db_handle_impl;
import org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.add(byteArray0);
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(2212);
      fBCachedFetcher0.previous();
      linkedList0.add((byte[][]) null);
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      byte[][] byteArray0 = new byte[1][4];
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)55;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = 335544363;
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.last();
      boolean boolean1 = fBCachedFetcher0.isLast();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)116;
      linkedList0.add(byteArray0);
      byteArray0[0] = byteArray1;
      linkedList0.addFirst(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(2988);
      fBCachedFetcher0.previous();
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.add(byteArray0);
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.absolute((byte) (-44));
      fBCachedFetcher0.first();
      fBCachedFetcher0.isAfterLast();
      boolean boolean0 = fBCachedFetcher0.next();
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.first();
      fBCachedFetcher0.updateRow(fBResultSet0.row);
      fBCachedFetcher0.getRowNum();
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isFirst());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][7];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative((-376));
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.last();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      FileSystemHandling.shouldAllThrowIOExceptions();
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative((-376));
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.getFetchSize();
      fBCachedFetcher0.isEmpty();
      assertEquals(1, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      DatabaseParameterBuffer databaseParameterBuffer0 = databaseParameterBufferImp0.deepCopy();
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      databaseParameterBufferImp0.addArgument(85, "vZ8o[3_S6p0");
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper((GDS) null, databaseParameterBuffer0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      databaseParameterBufferImp0.addArgument(1082, 16384);
      databaseParameterBufferImp0.getLength();
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, 32766, 32766, (AbstractIscStmtHandle) null, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.relative((-1));
      assertTrue(fBCachedFetcher0.isFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][2];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.setFetchSize((byte)51);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(51, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.add(byteArray0);
      linkedList0.addFirst(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.absolute((-2));
      int int0 = fBCachedFetcher0.getRowNum();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow((byte[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((byte)0);
      assertEquals(0, fBCachedFetcher0.getFetchSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-1984));
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals((-1984), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[0][3];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      try { 
        fBCachedFetcher0.absolute(0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[6][7];
      linkedList0.addFirst(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative(85);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][1];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.previous();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][5];
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.first();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[1][2];
      linkedList0.addLast(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.afterLast();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)116;
      linkedList0.add(byteArray0);
      byteArray1[1] = (byte)55;
      byteArray1[2] = (byte) (-44);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.first();
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[1][4];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.getRowNum();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[5][5];
      linkedList0.add(byteArray0);
      FBObjectListener.FetcherListener fBObjectListener_FetcherListener0 = null;
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.updateRow(byteArray0);
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      FBManagedConnection fBManagedConnection1 = null;
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.first();
      byte[][] byteArray0 = new byte[0][7];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.addFirst(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(2988);
      fBCachedFetcher0.updateRow(byteArray0);
      fBCachedFetcher0.isAfterLast();
      boolean boolean0 = fBCachedFetcher0.last();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
      
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      linkedList0.add(byteArray0);
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.absolute((byte) (-44));
      fBCachedFetcher0.first();
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][5];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)116;
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      fBCachedFetcher0.absolute(322);
      fBCachedFetcher0.first();
      fBCachedFetcher0.isLast();
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.last();
      boolean boolean1 = fBCachedFetcher0.isFirst();
      boolean boolean2 = fBCachedFetcher0.isBeforeFirst();
      assertTrue(boolean2 == boolean0);
      
      byte[][] byteArray0 = new byte[0][7];
      boolean boolean3 = fBCachedFetcher0.previous();
      assertTrue(boolean3 == boolean1);
      assertFalse(boolean3);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][7];
      linkedList0.add(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.relative((-376));
      fBCachedFetcher0.last();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertEquals(1, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      try { 
        fBCachedFetcher0.absolute((-1));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative(0);
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative((-1246));
      boolean boolean1 = fBCachedFetcher0.next();
      assertFalse(boolean1);
      
      fBCachedFetcher0.first();
      boolean boolean2 = fBCachedFetcher0.previous();
      assertTrue(boolean2 == boolean0);
      assertFalse(fBCachedFetcher0.isFirst());
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.absolute(335544363);
      assertFalse(boolean0);
      
      fBCachedFetcher0.close();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.beforeFirst();
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
      
      fBCachedFetcher0.isEmpty();
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }
}
