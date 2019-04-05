/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:38:18 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import org.apache.derby.diag.ErrorMessages;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.jdbc.FBArray;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.tools.SimpleRowSource;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.postgresql.Driver;
import org.postgresql.ds.PGPooledConnection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = DBUtil.available("_d7", "t4eYK FU&bG/;[KFfe", "t4eYK FU&bG/;[KFfe", "select count(*) from ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Level level0 = Level.info;
      ErrorHandler errorHandler0 = new ErrorHandler("Unable to convert DOMResult SQLXML data to a string.", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("", 'e', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<PGPooledConnection> class0 = PGPooledConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("43X84.U", 'f', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryScalar("--<cT1Z", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.parseAndSimplifyResultSet(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.parseAndSimplifyResultSet((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DBUtil.checkReadOnly(")6ENT~r7`a0\n|cLN", false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("{A", jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.Trace", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("^HDr,4[oMekGBd", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBUtil.close((ResultSet) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "IgboXgY wjZ<PCgbRO", false, 2720, 1913, 2720);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        DBUtil.connect(" +", "--*~SOJykOcG|t?b", "'T=p\"2d*`CpI6", "-Pr=0", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting  + failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '`.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("user", (String) null, 'Q', (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: user
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.currentLine((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryLong("", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/databene/cE#>pdl9w`S#.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.h2.command.ddl.AlterView");
      try { 
        DBUtil.getMetaData("cE#>pdl9w`S#", false, true, true, true, "", false, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/apaniche/databene/cE#>pdl9w`S#.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.h2;command.ddl.AlterView");
      try { 
        DBUtil.getMetaData("cE#>pdl9w`S#", false, true, true, true, "", false, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("derby.storage.initialPages");
      String[] stringArray0 = new String[1];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("derby.storage.initialPages", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'derby.storage.initialPages'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.h2.expression.ExpressionColumn");
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "--OX", false, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(true);
      boolean boolean0 = true;
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      String string0 = "43X84.U";
      Class<PGPooledConnection> class0 = PGPooledConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("43X84.U", 'f', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Driver driver0 = new Driver();
      Properties properties0 = new Properties();
      properties0.propertyNames();
      driver0.connect("01", properties0);
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      DBUtil.assertAllDbResourcesClosed(false);
      FBArray fBArray0 = new FBArray();
      fBArray0.getResultSet((long) 4, (-850));
      // Undeclared exception!
      try { 
        DBUtil.format((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("'T=p\"2d*`CpI6");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      dBSchema0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("--hB#~#Gp[F");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "--43X84.U", true, 1907, 345, 345);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: --43X84.U
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow(":iA?7MW{", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("org.apache.derby.impl.sql.execute.GenericConstantActionFactory", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Result result0 = Result.newFreeStmtRequest(0);
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("^;zR}f", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("Ju3a^cq", '5', (Connection) jdbcConnection0, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("DROP ALIAS READ_CLOB;");
      // Undeclared exception!
      try { 
        DBUtil.runScript("DROP ALIAS READ_CLOB;", (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--hB#~#Gp[F", 'R', (Connection) null, true, (ErrorHandler) null);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.format(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("z4!:H}z#XU@ {O ");
      String[] stringArray0 = new String[0];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertEquals("\n", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.close((ResultSet) simpleResultSet0);
      assertEquals(1000, simpleResultSet0.getFetchDirection());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("jyxa>(XcMF^j@", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "s3.+dhp?V=T~F<~$", false, 481, (-4696), (int) (byte) (-2));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.close((Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.proxy.PooledConnectionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("/(&5e", "D/(8JU.", "", "&:uRgwMI@gk2Yjm");
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting D/(8JU. failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("N", (String) null, (String) null, "lyPFRA");
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC URL specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "uCn1Z(WqDF2FZ\"r", "--u'Qnic", (String) null, "--Unable to convert DOMResult SQLXML data to a string.", ",?-8g4)+(X3E");
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC driver class name specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("http://");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error reading environment data for 'http://'
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("cE#>pdl9w`S#.env.properties");
      FileSystemHandling.createFolder(evoSuiteFile0);
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("cE#>pdl9w`S#", false, true, true, true, "", false, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error reading environment data for 'cE#>pdl9w`S#'
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Level level0 = Level.info;
      ErrorHandler errorHandler0 = new ErrorHandler("Unable to convert DOMResult SQLXML data to a string.", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("Unable to convert DOMResult SQLXML data to a string.", (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("Ju3a^cq", (Throwable) null);
      Result result0 = new Result(mockThrowable0, "Ju3a^cq");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("^;zR}f", level0);
      DBUtil.runScript("Ju3a^cq", '5', (Connection) jdbcConnection0, false, errorHandler0);
      assertEquals("S1000 General error org.evosuite.runtime.mock.java.lang.MockThrowable: Ju3a^cq in statement [Ju3a^cq]", result0.getMainString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet(simpleResultSet0, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "IgboXgY wjZ<PCgbRO", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("a(", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'a(.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.nextLine(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = DBUtil.escape("select count(*) from ");
      assertEquals("select count(*) from ", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query("Y6Dm48tH}:l];'_eXA", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("derby.language.maxMemoryPerTable", "derby.language.maxMemoryPerTable", (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: derby.language.maxMemoryPerTable
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = DBUtil.available("N,", "\u0001\u00C0", "SET_NULL", "N,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.logMetaData((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, false);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.countRows("Un", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("rK!N");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.closeResultSetAndStatement((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "4^65<\"#5DS_Hp5", "8tGSL,2{EQTOZ7p^x", false, false, true, true, "--~=", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, (DBSchema) null);
      String[] stringArray0 = new String[0];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "n[~,d8", false, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.equivalent(dBUniqueConstraint0, (DBPrimaryKeyConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 result set(s), 1 statement(s)
         //
      }
  }
}