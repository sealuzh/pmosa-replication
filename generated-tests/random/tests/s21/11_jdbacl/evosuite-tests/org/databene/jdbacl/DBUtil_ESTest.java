/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:42:50 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.derby.diag.ErrorMessages;
import org.apache.derby.impl.sql.conn.GenericLanguageConnectionFactory;
import org.databene.commons.ErrorHandler;
import org.databene.commons.Level;
import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.databene.jdbacl.model.TableContainerSupport;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBStatement;
import org.h2.engine.Session;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.hsqldb.Result;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.runner.RunWith;
import org.postgresql.Driver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DBUtil_ESTest extends DBUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DBUtil.available("Connected to ", "in*;ts:q3&", "Connected to ", "COMMENT");
      boolean boolean0 = true;
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, arrayList0);
      List<Object[]> list0 = DBUtil.parseResultSet(fBResultSet0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.getStatement(simpleResultSet0);
      DBUtil.close((Statement) null);
      DBUtil.getOpenStatementCount();
      Proxy proxy0 = (Proxy)DBUtil.createLoggingStatementHandler((Statement) null, true);
      assertNotNull(proxy0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("rc}}G/ACXx4yJisX");
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainer0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ErrorHandler errorHandler0 = new ErrorHandler("#.1*S!_jP");
      // Undeclared exception!
      try { 
        DBUtil.runScript("\"x)ag|>2!s", "\"x)ag|>2!s", (Connection) null, true, errorHandler0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Resource not found: \"x)ag|>2!s
         //
         verifyException("org.databene.commons.IOUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = DBUtil.existsEnvironment("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DBUtil.escape("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Connection connection0 = null;
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
  public void test09()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      try { 
        DBUtil.parseResultRow(errorMessages0);
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
  public void test11()  throws Throwable  {
      Connection connection0 = null;
      // Undeclared exception!
      try { 
        DBUtil.executeUpdate("JOYl[c|", (Connection) null);
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DBUtil.countRows("or", (Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.createLoggingStatementHandler((Statement) null, true);
      DBUtil.close((ResultSet) simpleResultSet0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DBUtil.getOpenPreparedStatementCount();
      // Undeclared exception!
      try { 
        DBUtil.getConnectData("|LOJ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '|LOJ.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      DBUtil.getStatement(simpleResultSet0);
      int int0 = DBUtil.getOpenStatementCount();
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ErrorMessages errorMessages0 = new ErrorMessages();
      DBUtil.createLoggingResultSet(errorMessages0, (Statement) null);
      DBUtil.getOpenPreparedStatementCount();
      String string0 = "4";
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.executeQuery("", (Connection) proxy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "H2~,";
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("or", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("H2~,", dBSchema0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "H2~,");
      String[] stringArray0 = new String[4];
      dBCatalog0.setName("or");
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "H2~,", true, stringArray0);
      dBUniqueConstraint0.setOwner(defaultDBTable0);
      // Undeclared exception!
      try { 
        DBUtil.containsMandatoryColumn(dBUniqueConstraint0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Column 'null' not found in table 'H2~,'
         //
         verifyException("org.databene.jdbacl.model.DefaultDBTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--(o${aU'");
      String[] stringArray0 = new String[0];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("M|\"k<XmuI2f,", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      boolean boolean0 = DBUtil.containsMandatoryColumn(dBForeignKeyConstraint0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBUtil.assertAllDbResourcesClosed(false);
      String string0 = null;
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DBUtil.assertAllDbResourcesClosed(false);
      String string0 = "'";
      String string1 = "@3UH4vTU,Sd-Cw%";
      // Undeclared exception!
      try { 
        DBUtil.connect("@3UH4vTU,Sd-Cw%", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No environment definition '@3UH4vTU,Sd-Cw%.env.properties' found
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.nextLine(simpleResultSet0);
      Session session0 = new Session();
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        session0.createConnection(true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.h2.engine.Session", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TableContainerSupport tableContainerSupport0 = new TableContainerSupport();
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--updateByte(");
      String[] stringArray0 = new String[9];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "--updateByte(", true, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("--updateByte(", false, dBUniqueConstraint0);
      DBTable dBTable0 = dBUniqueIndex0.getTable();
      tableContainerSupport0.addTable(dBTable0);
      List<DBTable> list0 = DBUtil.dependencyOrderedTables(tableContainerSupport0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "", true, 0, 2626, (-346));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Tried to mutate a database with read-only settings: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DBUtil.createLoggingStatementHandler((Statement) null, true);
      org.hsqldb.Session session0 = mock(org.hsqldb.Session.class, new ViolatedAssumptionAnswer());
      doReturn((Result) null).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, true);
      // Undeclared exception!
      try { 
        DBUtil.countRows("wm", (Connection) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal exception in method: public java.sql.ResultSet org.databene.jdbacl.proxy.LoggingStatementHandler.executeQuery(java.lang.String) throws java.sql.SQLException
         //
         verifyException("org.databene.commons.ExceptionMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "@p";
      // Undeclared exception!
      try { 
        DBUtil.querySingleRow("@p", (Connection) null);
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
      Connection connection0 = null;
      // Undeclared exception!
      try { 
        DBUtil.query("KxF@@gRSKcDoB~q", (Connection) null);
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
      String string0 = "";
      DBUtil.executeUpdate("", (Connection) null);
      GenericLanguageConnectionFactory genericLanguageConnectionFactory0 = new GenericLanguageConnectionFactory();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, true);
      DBUtil.executeUpdate((String) null, (Connection) proxy0);
      String string0 = null;
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Level level0 = Level.error;
      ErrorHandler errorHandler0 = new ErrorHandler("", level0);
      errorHandler0.setLoggingStackTrace(true);
      // Undeclared exception!
      try { 
        DBUtil.runScript("org.databene.jdbacl.DBUtil", '\\', (Connection) null, false, errorHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      DBUtil.runScript("--D!Y?+Etc4aC4", (Connection) null, true, errorHandler0);
      boolean boolean0 = false;
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "COMMENT";
      Class<FBStatement> class0 = FBStatement.class;
      ErrorHandler errorHandler0 = new ErrorHandler(class0);
      DBUtil.runScript("COMMENT", (Connection) null, true, errorHandler0);
      int int0 = 2075;
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.format(simpleResultSet0);
      boolean boolean0 = true;
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DBUtil.assertAllDbResourcesClosed(false);
      Csv csv0 = Csv.getInstance();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.nextLine(simpleResultSet0);
      int int0 = 90009;
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
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\"chSKQ-_,C6e5]bOYeD");
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      Object object0 = DBUtil.parseAndSimplifyResultSet(simpleResultSet0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DBUtil.close((ResultSet) null);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) null, "$)]", false);
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
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DBUtil.close((Connection) null);
      boolean boolean0 = true;
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
      String string0 = "n{+,t)";
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, "n{+,t)", "d879}+\"ySNIpV8| ", "I<WU2ydTg|u4D),`82", "Y.C:Ks(%Mkm6\\", "d879}+\"ySNIpV8| ");
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
  public void test45()  throws Throwable  {
      DBUtil.getOpenConnectionCount();
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("|07#?mQYWZh%'oCxRI", " statement(s)", " statement(s)", "getCharacterStream(long, long)", "org.apache.derby.iapi.services.info.ProductVersionHolder", "i~CYtZeZ:K.oU*+ ud");
      try { 
        DBUtil.connect(jDBCConnectData0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting  statement(s) failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DBUtil.existsEnvironment("L k*%Hopa7p");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("L k*%Hopa7p.env.properties");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "L k*%Hopa7p");
      // Undeclared exception!
      try { 
        DBUtil.connect("L k*%Hopa7p", false);
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
      Driver driver0 = new Driver();
      ErrorHandler errorHandler0 = new ErrorHandler("----D!Y?+Etc4aC4");
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
  public void test48()  throws Throwable  {
      DBUtil.resetMonitors();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("--org.databene.jdbacl.DBUtil", (Database) null);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      // Undeclared exception!
      try { 
        DBUtil.prepareStatement((Connection) proxy0, "1!.K:Su", false);
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
      Connection connection0 = null;
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
  public void test51()  throws Throwable  {
      String string0 = "=gE?9o";
      DBUtil.available("=gE?9o", "=gE?9o", "qzZ", "=gE?9o");
      boolean boolean0 = true;
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DBUtil.escape("lK0W 6(,4NSaSnXYlSS");
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
  public void test53()  throws Throwable  {
      Result result0 = Result.newFreeStmtRequest(2);
      org.hsqldb.Session session0 = mock(org.hsqldb.Session.class, new ViolatedAssumptionAnswer());
      doReturn(result0).when(session0).execute(any(org.hsqldb.Result.class));
      jdbcConnection jdbcConnection0 = new jdbcConnection(session0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection(jdbcConnection0, false);
      // Undeclared exception!
      try { 
        DBUtil.countRows("wm", (Connection) proxy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a row.
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DBUtil.existsEnvironment("L k*%Hopa7p");
      Csv csv0 = Csv.getInstance();
      csv0.setFieldDelimiter('F');
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      DBUtil.parseResultRow(simpleResultSet0);
      DBUtil.closeResultSetAndStatement(simpleResultSet0);
      ErrorHandler errorHandler0 = ErrorHandler.getDefault();
      assertTrue(errorHandler0.isLoggingStackTrace());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      try { 
        DBUtil.getMetaData((Connection) null, "", "", false, false, true, true, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Connecting null failed: 
         //
         verifyException("org.databene.jdbacl.DBUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("--org.databene.jdbacl.DBUtil", (Database) null);
      DBSchema dBSchema0 = new DBSchema("--org.databene.jdbacl.DBUtil", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("--org.databene.jdbacl.DBUtil", dBSchema0);
      String[] stringArray0 = new String[9];
      stringArray0[8] = "_B#}$x)";
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "0?Ml}=QN", false, stringArray0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "--or", false, stringArray0);
      DBUtil.equivalent(dBUniqueConstraint0, dBPrimaryKeyConstraint0);
      Proxy proxy0 = (Proxy)DBUtil.wrapWithPooledConnection((Connection) null, false);
      assertNotNull(proxy0);
  }
}