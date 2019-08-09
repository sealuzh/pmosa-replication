/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 15:38:16 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.firebirdsql.gds.DatabaseParameterBuffer;
import org.firebirdsql.gds.IscDbHandle;
import org.firebirdsql.gds.XSQLDA;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp;
import org.firebirdsql.gds.impl.wire.JavaGDSImpl;
import org.firebirdsql.gds.impl.wire.isc_db_handle_impl;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBDriverNotCapableException;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      linkedList0.remove();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.previous();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.absolute(3153);
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isFirst());
      
      boolean boolean1 = fBCachedFetcher0.last();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[8][3];
      byteArray0[7] = byteArray0[0];
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(2, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      linkedList0.remove();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.next();
      fBResultSet0.isLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.next();
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      assertTrue(fBCachedFetcher0.isFirst());
      
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.relative(915);
      assertEquals(2, fBCachedFetcher0.getRowNum());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.relative((-1148));
      assertTrue(fBCachedFetcher0.isBeforeFirst());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      xSQLDA0.ioLength = xSQLDA0.ioLength;
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBuffer databaseParameterBuffer0 = javaGDSImpl0.createDatabaseParameterBuffer();
      IscDbHandle iscDbHandle0 = javaGDSImpl0.createIscDbHandle();
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, databaseParameterBuffer0, iscDbHandle0, (GDSHelper.GDSHelperErrorListener) null);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, 361, 0, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(Throwable e) {
         //
         // GDS Exception. 335544324. invalid database handle (no active connection)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.relative((-1));
      assertTrue(fBCachedFetcher0.isFirst());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      int int0 = fBCachedFetcher0.getRowNum();
      assertTrue(fBCachedFetcher0.isLast());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.first();
      assertTrue(fBCachedFetcher0.isFirst());
      assertEquals(0, fBResultSet0.getRow());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.absolute((-1));
      assertEquals(0, fBResultSet0.getRow());
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[0][9];
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
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(0);
      assertEquals(0, fBCachedFetcher0.getFetchSize());
      assertTrue(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.setFetchSize(1387);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(1387, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-3356), 0, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
      boolean boolean0 = fBCachedFetcher0.relative(0);
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
      assertEquals((-3356), fBCachedFetcher0.getFetchSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative((-101));
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[3][8];
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
  public void test17()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-778), (-2503), isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
      byte[][] byteArray0 = new byte[4][4];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, 0, 16384, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      try { 
        fBCachedFetcher0.relative(1);
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.addFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative(5);
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
      byte[][] byteArray0 = new byte[0][2];
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
  public void test21()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.last();
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
      byte[][] byteArray0 = new byte[0][6];
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
  public void test23()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.close();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow((byte[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-778), (-2503), isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      try { 
        fBCachedFetcher0.first();
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][9];
      linkedList0.addFirst(byteArray0);
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
  public void test26()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-3356), 0, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][0];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.beforeFirst();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
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
  public void test30()  throws Throwable  {
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((List<byte[][]>) null, (FBObjectListener.FetcherListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isAfterLast();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
      
      boolean boolean1 = fBCachedFetcher0.isAfterLast();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.last();
      linkedList0.add((byte[][]) null);
      fBCachedFetcher0.isFirst();
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.isBeforeFirst();
      fBCachedFetcher0.isEmpty();
      assertTrue(fBCachedFetcher0.isLast());
      assertEquals(0, fBResultSet0.getRow());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      boolean boolean0 = fBResultSet0.isBeforeFirst();
      assertEquals(0, fBResultSet0.getRow());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      FBCachedFetcher fBCachedFetcher1 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.isEmpty();
      boolean boolean0 = fBCachedFetcher0.last();
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      linkedList0.add((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.first();
      boolean boolean1 = fBCachedFetcher0.next();
      assertTrue(boolean1 == boolean0);
      assertFalse(fBCachedFetcher0.isAfterLast());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      fBResultSet0.isLast();
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 4462, 0, isc_stmt_handle_impl0, fBResultSet0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      XSQLDA xSQLDA0 = new XSQLDA(794);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[2];
      XSQLVAR xSQLVAR0 = new XSQLVAR();
      xSQLVARArray0[0] = xSQLVAR0;
      xSQLVAR0.deepCopy();
      xSQLDA0.sqlvar = xSQLVARArray0;
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 1, 794, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertFalse(fBCachedFetcher0.isBeforeFirst());
      
      fBCachedFetcher0.beforeFirst();
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
      
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow(fBResultSet0.row);
      fBCachedFetcher0.close();
      int int0 = fBCachedFetcher0.getFetchSize();
      assertTrue(fBCachedFetcher0.isEmpty());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.updateRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      assertFalse(fBCachedFetcher0.isAfterLast());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-778), (-2503), isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
      assertEquals((-778), fBCachedFetcher0.getFetchSize());
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setAllRowsFetched(true);
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      JavaGDSImpl javaGDSImpl0 = new JavaGDSImpl();
      DatabaseParameterBufferImp databaseParameterBufferImp0 = new DatabaseParameterBufferImp();
      FBConnectionRequestInfo fBConnectionRequestInfo0 = new FBConnectionRequestInfo(databaseParameterBufferImp0);
      isc_db_handle_impl isc_db_handle_impl0 = new isc_db_handle_impl();
      GDSHelper.GDSHelperErrorListener gDSHelper_GDSHelperErrorListener0 = mock(GDSHelper.GDSHelperErrorListener.class, new ViolatedAssumptionAnswer());
      GDSHelper gDSHelper0 = new GDSHelper(javaGDSImpl0, fBConnectionRequestInfo0, isc_db_handle_impl0, gDSHelper_GDSHelperErrorListener0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(gDSHelper0, (-778), (-2503), isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, true);
      try { 
        fBCachedFetcher0.last();
        fail("Expecting exception: FBDriverNotCapableException");
      
      } catch(FBDriverNotCapableException e) {
         //
         // Result set is TYPE_FORWARD_ONLY
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute(800);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  public void test49()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
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
  public void test50()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 0, 1, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XSQLDA xSQLDA0 = new XSQLDA(0);
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      isc_stmt_handle_impl0.setOutSqlda(xSQLDA0);
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 1, 1, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-1452));
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals((-1452), int0);
  }
}
