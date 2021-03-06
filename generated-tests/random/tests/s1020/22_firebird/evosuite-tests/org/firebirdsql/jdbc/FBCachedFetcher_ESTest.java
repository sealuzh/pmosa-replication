/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 12:56:46 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.jca.FBConnectionRequestInfo;
import org.firebirdsql.jca.FBManagedConnection;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBConnection;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      fBCachedFetcher0.last();
      fBCachedFetcher0.setFetchSize(2004);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      fBCachedFetcher0.getFetchSize();
      fBCachedFetcher0.getFetchSize();
      fBCachedFetcher0.first();
      fBCachedFetcher0.isEmpty();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isLast());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      System.setCurrentTimeMillis((-131L));
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList1);
      byte[][] byteArray0 = new byte[1][4];
      byte[] byteArray1 = new byte[0];
      byteArray0[0] = byteArray1;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      System.setCurrentTimeMillis((-131L));
      fBCachedFetcher0.first();
      fBCachedFetcher0.relative(2757);
      fBCachedFetcher0.relative(2757);
      fBCachedFetcher0.next();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.getFetchSize();
      System.setCurrentTimeMillis(1767L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[2][2];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-74);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-7);
      byteArray1[3] = (byte)51;
      byteArray1[4] = (byte)14;
      byteArray1[5] = (byte) (-53);
      byteArray1[6] = (byte) (-92);
      byteArray1[7] = (byte)88;
      byteArray1[8] = (byte) (-13);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)88;
      byteArray2[1] = (byte) (-92);
      byteArray2[2] = (byte) (-71);
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte)88;
      byteArray2[5] = (byte)14;
      byteArray2[6] = (byte)0;
      byteArray2[7] = (byte)88;
      byteArray0[1] = byteArray2;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute((-421));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[1][3];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)127;
      byteArray1[1] = (byte) (-112);
      byteArray1[2] = (byte) (-2);
      byteArray1[3] = (byte)5;
      byteArray0[0] = byteArray1;
      linkedList0.offer(byteArray0);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertEquals(0, fBResultSet0.getRow());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.updateRow((byte[][]) null);
      String string0 = "org.firebirdsql.jdbc.FBCachedFetcher$1";
      try { 
        fBResultSet0.getByte("org.firebirdsql.jdbc.FBCachedFetcher$1");
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // The resultSet is not in a row, use next
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.iterator();
      byte[][] byteArray0 = new byte[4][6];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-111);
      byteArray1[1] = (byte) (-6);
      byteArray1[2] = (byte)71;
      byteArray1[3] = (byte)81;
      byteArray1[4] = (byte)2;
      byteArray1[5] = (byte) (-44);
      byteArray1[6] = (byte) (-1);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte) (-1);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[7];
      byteArray3[0] = (byte)71;
      byteArray3[1] = (byte) (-113);
      byteArray3[2] = (byte)81;
      byteArray3[3] = (byte) (-1);
      byteArray3[4] = (byte) (-111);
      byteArray3[5] = (byte)81;
      byteArray3[6] = (byte)81;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[6];
      byteArray4[0] = (byte)81;
      byteArray4[1] = (byte) (-44);
      byteArray4[2] = (byte)2;
      byteArray4[3] = (byte)71;
      byteArray4[4] = (byte) (-1);
      byteArray4[5] = (byte) (-44);
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      linkedList0.offerLast((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
      
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.iterator();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative((-3553));
      fBCachedFetcher0.first();
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
  public void test07()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertTrue(fBCachedFetcher0.isLast());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[3][8];
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-3);
      byteArray1[1] = (byte)31;
      byteArray1[2] = (byte) (-16);
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)4;
      byteArray1[5] = (byte)49;
      byteArray1[6] = (byte)43;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[8];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)49;
      byteArray2[2] = (byte)49;
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte) (-16);
      byteArray2[5] = (byte)31;
      byteArray2[6] = (byte) (-3);
      byteArray2[7] = (byte)96;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[9];
      byteArray3[0] = (byte) (-3);
      byteArray3[1] = (byte)49;
      byteArray3[2] = (byte) (-16);
      byteArray3[3] = (byte)49;
      byteArray3[4] = (byte)31;
      byteArray3[5] = (byte)4;
      byteArray3[6] = (byte) (-16);
      byteArray3[7] = (byte)0;
      byteArray3[8] = (byte)31;
      byteArray0[2] = byteArray3;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[1][0];
      linkedList0.addLast((byte[][]) null);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)33;
      byteArray1[1] = (byte)0;
      linkedList0.addLast(byteArray0);
      byteArray1[2] = (byte)110;
      byteArray1[3] = (byte)67;
      byteArray0[0] = byteArray1;
      linkedList1.push(byteArray0);
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = null;
      try {
        fBResultSet0 = new FBResultSet((XSQLVAR[]) null, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractResultSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      linkedList0.poll();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.removeFirstOccurrence(fBResultSet0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      byte[][] byteArray0 = new byte[2][6];
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)83;
      byteArray1[1] = (byte) (-99);
      byteArray1[2] = (byte)124;
      byteArray1[3] = (byte)1;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[5];
      linkedList0.add((byte[][]) null);
      byteArray2[0] = (byte)1;
      byteArray2[1] = (byte) (-99);
      byteArray2[2] = (byte)83;
      byteArray2[3] = (byte)83;
      byteArray2[4] = (byte)1;
      byteArray0[1] = byteArray2;
      fBCachedFetcher0.insertRow(byteArray0);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.isLast();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.first();
      assertFalse(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[6];
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection(fBManagedConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      byte[][] byteArray0 = new byte[7][4];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)100;
      byteArray1[1] = (byte)5;
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte)100;
      byteArray1[4] = (byte)87;
      byteArray1[5] = (byte) (-2);
      byteArray1[6] = (byte) (-115);
      byteArray1[7] = (byte)108;
      byteArray1[8] = (byte)115;
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)115;
      byteArray2[1] = (byte)87;
      byteArray2[2] = (byte)100;
      byteArray2[3] = (byte) (-128);
      byteArray2[4] = (byte) (-1);
      byteArray2[5] = (byte) (-115);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[3];
      byteArray3[0] = (byte) (-2);
      byteArray3[1] = (byte)87;
      byteArray3[2] = (byte) (-1);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[2];
      byteArray4[0] = (byte)108;
      byteArray4[1] = (byte) (-1);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[9];
      byteArray5[0] = (byte) (-2);
      byteArray5[1] = (byte)37;
      byteArray5[2] = (byte) (-115);
      byteArray5[3] = (byte)100;
      byteArray5[4] = (byte)100;
      byteArray5[5] = (byte)5;
      byteArray5[6] = (byte)108;
      byteArray5[7] = (byte)87;
      byteArray5[8] = (byte)100;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[1];
      byteArray6[0] = (byte)37;
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[1];
      byteArray7[0] = (byte)115;
      byteArray0[6] = byteArray7;
      linkedList0.add(byteArray0);
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.next();
      linkedList0.parallelStream();
      fBCachedFetcher0.setFetchSize(962);
      fBCachedFetcher0.updateRow(fBResultSet0.row);
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.previous();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      fBCachedFetcher0.isAfterLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.relative(25165824);
      boolean boolean0 = fBCachedFetcher0.next();
      assertEquals(962, fBCachedFetcher0.getFetchSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GDSHelper gDSHelper0 = null;
      int int0 = (-1098);
      int int1 = 115;
      String string0 = null;
      int int2 = (-6863);
      int int3 = 756;
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection(fBManagedConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][0];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-45);
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte) (-45);
      byteArray2[1] = (byte) (-45);
      byteArray2[2] = (byte) (-45);
      byteArray2[3] = (byte) (-45);
      byteArray2[4] = (byte) (-45);
      byteArray2[5] = (byte) (-45);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[6];
      byteArray3[0] = (byte) (-45);
      byteArray3[1] = (byte) (-45);
      byteArray3[2] = (byte) (-45);
      byteArray3[3] = (byte) (-45);
      byteArray3[4] = (byte) (-45);
      byteArray3[5] = (byte) (-45);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[3];
      byteArray4[0] = (byte) (-45);
      byteArray4[1] = (byte) (-45);
      byteArray4[2] = (byte) (-45);
      byteArray0[3] = byteArray4;
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      fBCachedFetcher0.next();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.beforeFirst();
      fBCachedFetcher0.setFetchSize(2215);
      fBCachedFetcher0.close();
      fBCachedFetcher0.next();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.isLast();
      boolean boolean0 = fBCachedFetcher0.previous();
      assertEquals(2215, fBCachedFetcher0.getFetchSize());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBManagedConnection fBManagedConnection0 = mock(FBManagedConnection.class, new ViolatedAssumptionAnswer());
      doReturn((FBConnectionRequestInfo) null).when(fBManagedConnection0).getConnectionRequestInfo();
      FBConnection fBConnection0 = null;
      try {
        fBConnection0 = new FBConnection(fBManagedConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.AbstractConnection", e);
      }
  }
}
