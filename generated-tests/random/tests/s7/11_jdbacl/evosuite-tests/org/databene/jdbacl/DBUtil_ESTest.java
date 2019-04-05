/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:43:58 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.apache.derby.diag.ErrorMessages;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.ResultsWithMetadata;
import org.databene.jdbacl.model.CompositeDBObject;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.tools.SimpleRowSource;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcClob;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.postgresql.ds.PGConnectionPoolDataSource;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = DBUtil.available("FKSCHEMANAME", "FKSCHEMANAME", "Qi-9#xYGjcsH7Co", "FKSCHEMANAME");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DBUtil.getOpenStatementCount();
      String string0 = "--";
      DBUtil.existsEnvironment("--");
      String string1 = "";
      String string2 = "DOMAIN_SCHEMA";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      // Undeclared exception!
      try { 
        VersionNumber.valueOf("--");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<DBUtil> class0 = DBUtil.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      errorHandler0.setLoggingStackTrace(false);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--", 'A', (Connection) null, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, false);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.nextLine((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("", true, true, false, true, "REGEXP_REPLACE", true, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn((DBConstraint) null);
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
      DBUtil.checkReadOnly((String) null, false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("--K5TC.{3;56~6nNMo", (Connection) null);
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
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      List<Object[]> list0 = DBUtil.parseResultSet(simpleResultSet0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      Statement statement0 = DBUtil.getStatement(simpleResultSet0);
      assertNull(statement0);
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
      ErrorHandler errorHandler0 = new ErrorHandler("");
      // Undeclared exception!
      try { 
        DBUtil.runScript("--", "F8)}Y2_^", '+', (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: --
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("or", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[5];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "preparing statement: ", false, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'null'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[0];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "v+H(y", true, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBPrimaryKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)29;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      DBUtil.getOpenStatementCount();
      boolean boolean0 = true;
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 statement(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("qZ|x:q$aT]", (CompositeDBObject<? extends DBObject>) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("qZ|x:q$aT]");
      tableContainer0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("qZ|x:q$aT]", (CompositeDBObject<? extends DBObject>) null);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "select count(*) from ", true, 14, 564, 14);
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
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("n(B^b%hs-WK~'", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: n(B^b%hs-WK~'
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Result result0 = Result.newReleaseSavepointRequest("*A2");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      Object[] objectArray0 = new Object[3];
      result0.setParameterData(objectArray0);
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      ResultsWithMetadata resultsWithMetadata0 = DBUtil.queryWithMetadata("org.apache.derby.impl.store.raw.data.LoggableActions", jdbcConnection0);
      assertNotNull(resultsWithMetadata0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("org.firebirdsql.gds.impl.GDSHelper", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query("S8.d>p", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("UMd3SbXcv`", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Result result0 = new Result((Throwable) null, "7");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("7", level0);
      DBUtil.runScript("7", (Connection) jdbcConnection0, false, errorHandler0);
      assertEquals("S1000 General error null in statement [7]", result0.getMainString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("KotD;", (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<DBUtil> class0 = DBUtil.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--", 'A', (Connection) null, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      String string0 = DBUtil.format(simpleResultSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("Sz");
      Reader reader0 = jdbcClob0.getCharacterStream();
      String[] stringArray0 = new String[1];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertEquals("C1\nSz", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryWithMetadata("", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, ") or wrong URL format (", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
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
  public void test45()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("b:$4?8>/t_jw", "@u", "AJ", "MH0Fh/( @");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting @u failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("", "", "There are unclosed database resources", "cK{GY.)W6R{&`{", "", "");
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC URL specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "c6G", (String) null, "c6G", "BUFFER_LENGTH", "VRqKLnSTft%D3TEh9u9");
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
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("?(1a6ApXTlhaL$swBG");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '?(1a6ApXTlhaL$swBG.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int[] intArray0 = new int[5];
      Result result0 = new Result((-373957723), intArray0, (-373957723));
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("7", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("7", (Connection) jdbcConnection0, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler(";1t7wC6YJs#iJp");
      // Undeclared exception!
      try { 
        DBUtil.runScript(";1t7wC6YJs#iJp", 'N', (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "DELETE FROM INFORMATION_SCHEMA.LOBS WHERE TABLE = -2;", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: DELETE FROM INFORMATION_SCHEMA.LOBS WHERE TABLE = -2;
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect("Qi-9#xYGjcsH7Co", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'Qi-9#xYGjcsH7Co.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      Object[] objectArray0 = DBUtil.currentLine(simpleResultSet0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = DBUtil.escape("KQf");
      assertEquals("KQf", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Level level0 = Level.ignore;
      ErrorHandler errorHandler0 = new ErrorHandler("7", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("Expected a row.", "Expected a row.", (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: Expected a row.
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = DBUtil.available("7qmLS6 qQft/<>~\"c%", "7qmLS6 qQft/<>~\"c%", "7qmLS6 qQft/<>~\"c%", ";1t7wC6YJs#iJp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("Trie8 to m!tate a database with read-only settings: ", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int[] intArray0 = new int[5];
      Result result0 = new Result((-373957723), intArray0, (-373957723));
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Object object0 = DBUtil.queryAndSimplify("7", jdbcConnection0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "qZ|x:q$aT]", "qZ|x:q$aT]", false, false, true, true, "org.h2.index.TreeNode", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("P<nd?}/]");
      DBSchema dBSchema0 = new DBSchema("P<nd?}/]", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("Connecting the database failed silently - probably due to wrong driver (", dBSchema0);
      String[] stringArray0 = new String[5];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, " parent:", true, stringArray0);
      boolean boolean0 = DBUtil.equivalent(dBPrimaryKeyConstraint0, dBPrimaryKeyConstraint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }
}