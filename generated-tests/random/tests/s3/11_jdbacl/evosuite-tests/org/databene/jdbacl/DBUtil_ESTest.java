/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:25:31 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
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
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.databene.jdbacl.model.TableHolder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Result;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.postgresql.ds.PGPooledConnection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object[] objectArray0 = DBUtil.parseResultRow(simpleResultSet0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      String string0 = DBUtil.format(simpleResultSet0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        DBUtil.runScript("", "", (Connection) null, false, (ErrorHandler) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      // Undeclared exception!
      try { 
        DBUtil.runScript(":E", 'E', (Connection) null, false, errorHandler0);
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
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("org.databene.jdbacl.DBUtil", true, true, true, true, "org.databene.jdbacl.DBUtil", true, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'org.databene.jdbacl.DBUtil.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("No row available for wasNull.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'No row available for wasNull..env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getMetaData("Z_d3hD7>&o9#+_rw{OM", false, true, false, true, (String) null, true, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition 'Z_d3hD7>&o9#+_rw{OM.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.dependencyOrderedTables((TableHolder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DBUtil.checkReadOnly("\"jH]~dXKHS", false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryAndSimplify("{h[oFYbk&6?V", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("Xa,j}[6nu|13l?!4", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.parseResultSet(errorMessages0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // getObject
         //
         verifyException("org.apache.derby.vti.VTITemplate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      List<Object[]> list0 = DBUtil.parseResultSet(simpleResultSet0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DBUtil.close((ResultSet) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        DBUtil.connect("m>Cb_dbV9:", "m>Cb_dbV9:", "T!>l&KcK}", "m>Cb_dbV9:", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting m>Cb_dbV9: failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = DBUtil.getOpenConnectionCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = DBUtil.getOpenPreparedStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = DBUtil.getOpenResultSetCount();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.queryLong("o-inSa}=e#2nm{Jll(", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--:E", (DBSchema) null);
      String[] stringArray0 = new String[8];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "--:E", false, stringArray0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table '--:E'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("''", false, defaultDBTable0, "''");
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBCheckConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DBUtil.wrapWithPooledConnection((Connection) null, false);
      DBUtil.assertAllDbResourcesClosed(false);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("--0G");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--0G", dBSchema0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(dBSchema0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("Uw");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.checkReadOnly("' found", true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: ' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("n", (Connection) null);
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
        DBUtil.query("org.apache.derby.impl.sql.compile.QueryTreeNode", (Connection) null);
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
      Class<PGPooledConnection> class0 = PGPooledConnection.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("6h7+?]ZG53+,*F\"cI", 'R', (Connection) null, true, errorHandler0);
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
      ErrorHandler errorHandler0 = new ErrorHandler("--`%M$`zq+,TsXNl~\"(s");
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript("--`%M$`zq+,TsXNl~\"(s", 't', (Connection) null, true, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Result result0 = new Result((-1677));
      Session session0 = mock(Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Level level0 = Level.warn;
      ErrorHandler errorHandler0 = new ErrorHandler("N*7aLi\u0007", level0);
      DBExecutionResult dBExecutionResult0 = DBUtil.runScript(" failed: ", ':', (Connection) jdbcConnection0, false, errorHandler0);
      assertNotNull(dBExecutionResult0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet(simpleResultSet0, (Statement) null);
      Object[] objectArray0 = DBUtil.nextLine((ResultSet) proxy0);
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("SO{(r");
      String[] stringArray0 = new String[1];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      Object object0 = DBUtil.parseAndSimplifyResultSet(resultSet0);
      assertEquals("SO{(r", object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      StringReader stringReader0 = new StringReader("}j*.");
      String[] stringArray0 = new String[7];
      ResultSet resultSet0 = csv0.read((Reader) stringReader0, stringArray0);
      String string0 = DBUtil.format(resultSet0);
      assertTrue(resultSet0.wasNull());
      assertEquals("C1, C2, C3, C4, C5, C6, C7\n}j*., , , , , , \n", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<jdbcConnection> class0 = jdbcConnection.class;
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try { 
        DBUtil.queryScalarArray("Ku", class0, (Connection) jdbcConnection0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.hsqldb.jdbc.jdbcStatement", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      ErrorHandler errorHandler0 = new ErrorHandler(" bU");
      // Undeclared exception!
      try { 
        DBUtil.runScript("\"jH]~dXKHS", 'B', (Connection) jdbcConnection0, false, errorHandler0);
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
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      assertEquals(1000, simpleResultSet0.getFetchDirection());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "rR", false, 1, 74, 2);
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
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      DBUtil.close((Connection) jdbcConnection0);
      assertFalse(jdbcConnection0.isClosed());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "Xxv0zgC!", (String) null, "CSUa%TD#<");
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
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("@VJr+", "", "`+CNbw3qmwKZ", "\"", "-- ", "");
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
  public void test49()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("u", "org.postgresql.jdbc4.Jdbc4ResultSet", "", "org.postgresql.jdbc4.Jdbc4ResultSet");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting org.postgresql.jdbc4.Jdbc4ResultSet failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".env.properties");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JDBCConnectData jDBCConnectData0 = DBUtil.getConnectData("");
      assertNotNull(jDBCConnectData0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.runScript((String) null, (Connection) null, true, (ErrorHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Proxy proxy0 = (Proxy)DBUtil.createLoggingResultSet(simpleResultSet0, (Statement) null);
      Object object0 = DBUtil.parseAndSimplifyResultSet((ResultSet) proxy0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "select count(*) from ", true);
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
        DBUtil.connect("-tuL1BQ+P", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '-tuL1BQ+P.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      String string0 = DBUtil.escape("VzL@HG}");
      assertEquals("VzL@HG}", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Level level0 = Level.debug;
      ErrorHandler errorHandler0 = new ErrorHandler("Yc3\"", level0);
      // Undeclared exception!
      try { 
        DBUtil.runScript("select count(*) from ", 'f', (Connection) null, false, errorHandler0);
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
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      ErrorHandler errorHandler0 = new ErrorHandler("MTu$");
      try { 
        DBUtil.runScript("", "", (Connection) proxy0, false, errorHandler0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = DBUtil.available("'[cb+IlHVuE*B&3", "'[cb+IlHVuE*B&3", "java.lang.StrictMath", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, false);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("%[^gI.c\".&u+r2y@", (Connection) null);
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
      boolean boolean0 = DBUtil.existsEnvironment("%[^gI.c\".&u+r2y@");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
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
  public void test66()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "No environment definition '", "4<VH#lXN4DW\"`?&)tm", false, true, true, true, "8;q*A-lN 7", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
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
  public void test68()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
  }
}