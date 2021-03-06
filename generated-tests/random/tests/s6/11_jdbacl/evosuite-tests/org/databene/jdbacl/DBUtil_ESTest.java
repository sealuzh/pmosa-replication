/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:55:26 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import org.apache.derby.diag.ErrorMessages;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBExecutionResult;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBNotNullConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.h2.engine.Session;
import org.h2.jdbc.JdbcPreparedStatement;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.tools.SimpleRowSource;
import org.h2.value.ValueLob;
import org.hsqldb.jdbc.jdbcCallableStatement;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.jdbc.jdbcResultSet;
import org.junit.runner.RunWith;
import org.postgresql.xa.PGXAConnection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet((SimpleRowSource) null);
      simpleResultSet0.getStatement();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "vOtfd&");
      DBUtil.createLoggingStatementHandler((Statement) null, false);
      DBUtil.format(simpleResultSet0);
      DBUtil.parseResultSet(simpleResultSet0);
      DBUtil.getOpenResultSetCount();
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<jdbcResultSet> class0 = jdbcResultSet.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("Empty SQL string in executeUpdate()", class0, (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'null'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte)1;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      DBUtil.wrapWithPooledConnection((Connection) null, true);
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 connection(s), 1 statement(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      DBUtil.close((Statement) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "eR", false, 1003, 1003, 1003);
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
        DBUtil.getConnectData("org.apache.derby.impl.store.raw.data.PageVersion");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'org.apache.derby.impl.store.raw.data.PageVersion.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.runScript("9n:y6S", "--", 'c', (Connection) null, true, (ErrorHandler) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: 9n:y6S
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBUtil.getOpenStatementCount();
      String string0 = "g~XBrd!f8L[eG\\\\^K.U";
      boolean boolean0 = false;
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("g~XBrd!f8L[eG\\^K.U", false, "r&= dc$tK0Z", "''");
      DBUtil.containsMandatoryColumn(dBCheckConstraint0);
      Session session0 = new Session();
      // Undeclared exception!
      try { 
        session0.createConnection(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.h2.engine.Session", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("se", (DBCatalog) null);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("w", dBSchema0);
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("6H7+/", defaultDBTable0, 12, "w");
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint(defaultDBTable0, "se", true, "6H7+/");
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBNotNullConstraint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.firebirdsql.jdbc.AbstractCallableStatement");
      tableContainerSupport0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainerSupport0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainerSupport0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DBUtil.checkReadOnly("select count(*) from ", true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "org.databene.JDBC", true, (-171377078), 1149, 126);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: org.databene.JDBC
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("--eR;IH.\"q,P}+q~", (Connection) null);
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
      int int0 = DBUtil.executeUpdate("", (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = DBUtil.executeUpdate((String) null, (Connection) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Level level0 = Level.info;
      ErrorHandler errorHandler0 = new ErrorHandler("--Jl", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("select count(*) from ", (Connection) null, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<JdbcPreparedStatement> class0 = JdbcPreparedStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("SESSION_START", 'T', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.nextLine(simpleResultSet0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-15);
      ValueLob valueLob0 = ValueLob.createSmallLob(38, byteArray0);
      Reader reader0 = valueLob0.getReader();
      String[] stringArray0 = new String[5];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertTrue(resultSet0.wasNull());
      assertEquals("C1, C2, C3, C4, C5\n\uFFFD, , , , \n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<PGXAConnection> class0 = PGXAConnection.class;
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray((String) null, class0, (Connection) null);
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
      jdbcConnection jdbcConnection0 = new jdbcConnection((org.hsqldb.Session) null);
      Class<jdbcCallableStatement> class0 = jdbcCallableStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("JDBC version ", 'O', (Connection) jdbcConnection0, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      assertTrue(simpleResultSet0.isClosed());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "----ku$M'z_Kld+)e&#", false, 158, (-171377078), 2);
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
      DBUtil.close((Connection) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      try { 
        DBUtil.connect((String) null, (String) null, (String) null, (String) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "6E&&9 .2-U!F<onJS", "=6Qm`-^m].\"o>", "--VM18|H~vWY]M6RWr", "=6Qm`-^m].\"o>", "MxvmkB/ysHS_e5*");
      // Undeclared exception!
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No JDBC driver class name specified
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("}", (String) null, "[<%8~Q}>}", "f", "eR", "");
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
  public void test34()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("--ku$M'z_Kld+)e&#", "--ku$M'z_Kld+)e&#", "ixNJ@", "TO,/F?Bc]<)>)snU$");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting --ku$M'z_Kld+)e&# failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.derby.impl.store.raw.data.PageVersion.env.properties");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.apache.derby.impl.store.raw.data.PageVersion");
      JDBCConnectData jDBCConnectData0 = DBUtil.getConnectData("org.apache.derby.impl.store.raw.data.PageVersion");
      assertNotNull(jDBCConnectData0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify(" prepared statement(s)", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("TABLE_SCHEMA", (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("jN-");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--JDBC version", 'M', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet(simpleResultSet0, (Statement) null);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "", false);
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
        DBUtil.connect("L015", true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'L015.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      String string0 = DBUtil.escape("jN-");
      assertEquals("jN-", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.query((String) null, (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.runScript("aZH(`&Q*", "aZH(`&Q*", (Connection) null, true, (ErrorHandler) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: aZH(`&Q*
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = DBUtil.available("COMMENT", "COMMENT", "COMMENT", "COMMENT");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  public void test49()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("COMMENT", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("'ds4t{=h[/#e'7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData((Connection) null, "", "itQ", true, true, true, true, "@c28%*lTXUD)y#q@", true);
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 10
         // @c28%*lTXUD)y#q@
         //           ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[6];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "Failed to fetch metadata from connection ", true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.equivalent((DBUniqueConstraint) null, dBPrimaryKeyConstraint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
