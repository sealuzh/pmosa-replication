/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:27:10 GMT 2019
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.jdbc.FBResultSet;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcClob;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.postgresql.Driver;
import org.postgresql.xa.PGXAConnection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Object[] objectArray0 = DBUtil.parseResultRow(simpleResultSet0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      Statement statement0 = DBUtil.getStatement(simpleResultSet0);
      assertNull(statement0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("F`v*Fo\"g]");
      errorHandler0.setLoggingStackTrace(false);
      // Undeclared exception!
      try { 
        DBUtil.runScript("Closing statement failed", (Connection) null, false, errorHandler0);
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
        DBUtil.queryAndSimplify("", (Connection) null);
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
      boolean boolean0 = DBUtil.existsEnvironment((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("*G* FeYy%_qWK-", (Connection) null);
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
        DBUtil.connect("--^6f", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '--^6f.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.connect((String) null, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'null.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.parseResultRow((ResultSet) null);
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
        DBUtil.getMetaData("Q8P7$#bT*xT", true, true, true, false, "vx{=B=lNQgG9ub\"Wu", true, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'Q8P7$#bT*xT.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DBUtil.checkReadOnly("getBlob", false);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("D:'1/-", (Connection) null);
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
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      List<Object[]> list0 = DBUtil.parseResultSet(simpleResultSet0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DBUtil.close((Statement) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getStatement((ResultSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Driver> class0 = Driver.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("WT7.", "WT7.", '?', (Connection) null, false, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: WT7.
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[5];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "--Closing statement failed", true, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'null'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("NT*sH5$[wX^Z");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.databene.JDBC", dBSchema0);
      String[] stringArray0 = new String[0];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("NT*sH5$[wX^Z", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = false;
      DBUtil.assertAllDbResourcesClosed(false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBUtil.createLoggingResultSet((ResultSet) null, (Statement) null);
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("7yuIu: t&gUb");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '7yuIu: t&gUb.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DBUtil.getOpenStatementCount();
      DBUtil.assertAllDbResourcesClosed(false);
      Random.setNextRandom(326);
      // Undeclared exception!
      try { 
        DBUtil.getConnectData((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'null.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.assertAllDbResourcesClosed(true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There are unclosed database resources: 1 connection(s), 2 result set(s), 1 statement(s)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer(":!=QX$eNpaf /5");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(":!=QX$eNpaf /5");
      tableContainer0.addTable(defaultDBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("r<");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("joinOrder", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: joinOrder
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DBUtil.checkReadOnly("select count(*) from ", true);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("O{a&RK8w%ib\"soD@B", (Connection) null);
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
        DBUtil.query("' found", (Connection) null);
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
      MockException mockException0 = new MockException(">YKX-,sXmDCve+F");
      Result result0 = new Result(mockException0, ">YKX-,sXmDCve+F");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Class<Driver> class0 = Driver.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript(">YKX-,sXmDCve+F", 'q', (Connection) jdbcConnection0, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.sql.SQLException: null org.evosuite.runtime.mock.java.lang.MockThrowable: >YKX-,sXmDCve+F in statement [>YKX-,sXmDCve+F]
         //
         verifyException("org.databene.commons.ErrorHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("select count(*) from ");
      // Undeclared exception!
      try { 
        DBUtil.runScript("select count(*) from ", '5', (Connection) null, true, errorHandler0);
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
      ErrorHandler errorHandler0 = new ErrorHandler("F`v*Fo\"g]");
      // Undeclared exception!
      try { 
        DBUtil.runScript("Closing statement failed", (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript("+~Q;V?_P#'7TiAJ=o8", '8', (Connection) null, true, errorHandler0);
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
      Class<PGXAConnection> class0 = PGXAConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--", 'p', (Connection) null, true, errorHandler0);
      try { 
        DBUtil.connect("--", "--", "Ub, V", "--", (boolean) dBExecutionResult0.changedStructure);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting -- failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
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
  public void test40()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      String string0 = DBUtil.format(simpleResultSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DBUtil.close((ResultSet) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Result.newReleaseSavepointRequest("COLUMNS=[");
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Class<Driver> class0 = Driver.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript(">YKX-,sXmDCve+F", 'q', (Connection) jdbcConnection0, true, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      assertTrue(simpleResultSet0.isClosed());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, (String) null, false, 1733, 16384, 16384);
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
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "''", (String) null, "DAY_OF_YEAR");
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
  public void test48()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("n)Mg8X:n-", "", "VU#gV1zn2WM[`]ccDdg", "Protocol not supported, abandoning connection.");
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
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData(">YKX-,sXmDCve+F", "i", "--", "--", "preparing statement: ", "2sYZxa2.");
      try { 
        DBUtil.connect(jDBCConnectData0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting i failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<FBResultSet> class0 = FBResultSet.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("", (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "--G1u,)O}=Zl'3!Vk", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcPreparedStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      jdbcClob jdbcClob0 = new jdbcClob("ft`.d%\"6?0n5A %<");
      Reader reader0 = jdbcClob0.getCharacterStream();
      String[] stringArray0 = new String[4];
      ResultSet resultSet0 = csv0.read(reader0, stringArray0);
      DBUtil.nextLine(resultSet0);
      assertTrue(resultSet0.wasNull());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = DBUtil.escape("getBlob");
      assertEquals("getBlob", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Level level0 = Level.trace;
      ErrorHandler errorHandler0 = new ErrorHandler("T[+t(02i>#", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("--^6f", "T[+t(02i>#", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: --^6f
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = DBUtil.available("n)Mg8X:n-", "8W}P$LF8+", "8W}P$LF8+", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("", (Connection) null);
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
      boolean boolean0 = DBUtil.existsEnvironment("]~z{4Ts%UUz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
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
  public void test63()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "", "", false, true, true, false, "", true);
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
      // Undeclared exception!
      try { 
        DBUtil.equivalent((DBUniqueConstraint) null, (DBPrimaryKeyConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }
}
