/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:12:04 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Vector;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBNotNullConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBTrigger;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.hsqldb.rowio.RowOutputBinary;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint(" = ", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT \" = \" FOREIGN KEY (, , , , , , , , ) REFERENCES null(, , , , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = SQLUtil.parseColumnTypeAndSize("3%eN2`LBv");
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("'}Z");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(" ADD ", dBSchema0);
      String[] stringArray0 = new String[5];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, " ADD ", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.ukSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("UNIQUE (, , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      String string0 = SQLUtil.renderValue(object0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = SQLUtil.renderColumnNames((String[]) null);
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnListWithTableName("+wRDKMI?l,a", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "U*T68MZNh>{i", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.NEVER;
      // Undeclared exception!
      try { 
        SQLUtil.ukSpec((DBUniqueConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.renderWhereClause((String[]) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnTypeWithSize((DBColumn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      // Undeclared exception!
      try { 
        SQLUtil.pkSpec((DBPrimaryKeyConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.ownerDotComponent((DBObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        SQLUtil.leftJoin("", (String[]) null, "FOREIGN KEY ", "", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.isDML((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      // Undeclared exception!
      try { 
        SQLUtil.createConstraintSpecBuilder((DBConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.join("jP%L!Tyf z[", "F9}w;Dmbxv~S@q8ja", stringArray0, "create materialized viewexec", "renameselectselect into", stringArray0);
      assertEquals("jP%L!Tyf z[ join create materialized viewexec as renameselectselect into on F9}w;Dmbxv~S@q8ja.null = renameselectselect into.null and F9}w;Dmbxv~S@q8ja.null = renameselectselect into.null and F9}w;Dmbxv~S@q8ja.null = renameselectselect into.null and F9}w;Dmbxv~S@q8ja.null = renameselectselect into.null", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("select r");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("executedrop materialized view#i)?");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("^h[aftE1;^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML("truncate<m9h,hhhzduq");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML("//");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("exec");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("alter table_gv)vh.'e.yrd['");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("@VD<1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("create unique indexselect into");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = SQLUtil.renderValue("create");
      assertEquals("'create'", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("null = null AND null = null AND null = null AND null = null", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("create", (DBSchema) null);
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("W3w } ` ! 5 ~", defaultDBTable0, (-1730), "'create'");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("W3w } ` ! 5 ~ 'CREATE' NULL", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("(, , , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[4];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("renamecallnivgaivdg ` w (f ~ re ", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT \"renamecallnivgaivdg ` w (f ~ re \" FOREIGN KEY (, , , ) REFERENCES null(, , , )", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.renderColumnListWithTableName("@VD<1", stringArray0);
      assertEquals("@VD<1.null, @VD<1.null, @VD<1.null, @VD<1.null", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("select into");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 0", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">elecl into");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = 2250.933694139168;
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("2250.933694139168", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = SQLUtil.normalize("create table4[!\"r>(|sint_xr&c]+", false);
      assertEquals("create table4 [ ! \"r>(|sint_xr&c]+\"", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = SQLUtil.normalize("---- Schema ----------", false);
      assertEquals("---- Schema ----------", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = SQLUtil.normalize("W&DA/:s0#", true);
      assertEquals("W & DA / : s0 #", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = SQLUtil.normalize("\n/* index sorted */", false);
      assertEquals("/* index sorted */", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = SQLUtil.normalize("org.apache.derby.impl.sql.compile.UpdateNode", false);
      assertEquals("org.apache.derby.impl.sql.compile.UpdateNode", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = SQLUtil.normalize("renamecallnivgaivdg`w(f~re", false);
      assertEquals("renamecallnivgaivdg ` w (f ~ re ", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = SQLUtil.normalize("drop tablelk,+$ori&)a';hp7", false);
      assertEquals("drop tablelk, + $ ori &) a ';hp7'", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = SQLUtil.removeComments("alter table");
      assertEquals("alter table", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[9];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      String string0 = SQLUtil.typeAndName(dBUniqueConstraint0);
      assertEquals("unique constraint constraint", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("XBCX9.S");
      String string0 = SQLUtil.typeAndName(dBSchema0);
      assertEquals("schema XBCX9.S", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String string0 = SQLUtil.typeAndName(defaultDBTable0);
      assertEquals("table null", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "//", false, stringArray0);
      String string0 = SQLUtil.constraintName(dBUniqueConstraint0);
      assertEquals("CONSTRAINT // ", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[9];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, false, stringArray0);
      String string0 = SQLUtil.constraintName(dBUniqueConstraint0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.apache.derby.impl.sql.compile.GrantRoleNode");
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "org.apache.derby.impl.sql.compile.GrantRoleNode", false, stringArray0);
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) dBPrimaryKeyConstraint0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("!2@+$R |%}e>y");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, dBSchema0);
      String[] stringArray0 = new String[0];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.appendConstraintName((DBConstraint) dBForeignKeyConstraint0, stringBuilder0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "U*T68MZNh>{i", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, )", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[4];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("truncate_gv)vh.'e.yrd['", (DBSchema) null);
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.fkSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY (, , , ) REFERENCES truncate_gv)vh.'e.yrd['(, , , )", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("nIVgAIvDg`w(F~RE", dBCatalog0);
      DBTrigger dBTrigger0 = new DBTrigger("nIVgAIvDg`w(F~RE", dBSchema0);
      String string0 = SQLUtil.ownerDotComponent(dBTrigger0);
      assertEquals("nIVgAIvDg`w(F~RE.nIVgAIvDg`w(F~RE", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema(")2yD");
      String string0 = SQLUtil.ownerDotComponent(dBSchema0);
      assertEquals(")2yD", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("Ikia");
      SQLUtil.addOptionalCondition(" proname = 'lo_open' or proname = 'lo_close' or proname = 'lo_creat' or proname = 'lo_unlink' or proname = 'lo_lseek' or proname = 'lo_tell' or proname = 'loread' or proname = 'lowrite' or proname = 'lo_truncate'", stringBuilder0);
      assertEquals("Ikia or  proname = 'lo_open' or proname = 'lo_close' or proname = 'lo_creat' or proname = 'lo_unlink' or proname = 'lo_lseek' or proname = 'lo_tell' or proname = 'loread' or proname = 'lowrite' or proname = 'lo_truncate'", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition("select into", stringBuilder0);
      assertEquals("select into", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) ":*");
      SQLUtil.addRequiredCondition(":*", stringBuilder0);
      assertEquals(":* and :*", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(44);
      SQLUtil.addRequiredCondition("yM'`375xSB)p", stringBuilder0);
      assertEquals("yM'`375xSB)p", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.join("", "+wRDKMI?l,a", stringArray0, "org.firebirdsql.gds.impl.wire.EventHandleImp", "r4fmE.VI5HB,hG", stringArray0);
      assertEquals("org.firebirdsql.gds.impl.wire.EventHandleImp as r4fmE.VI5HB,hG on ", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      // Undeclared exception!
      try { 
        SQLUtil.constraintSpec((DBConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[4];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("^h[aftE1;^", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("FOREIGN KEY (, , , ) REFERENCES null(, , , )", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[4];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "_lP7M9E1,A_", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("CONSTRAINT _lP7M9E1,A_ UNIQUE (, , , )", string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("\n/* index sorted */");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("select into");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("callnivgaivdg`w(f~re");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("insert;7h\"66]\"f@)[\"<g");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select intoy7-fmtdu*wz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("drop tablelk,+$ori&)a';hp7");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter session|irkiksvlqvb)m");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Character character0 = Character.valueOf('_');
      String string0 = SQLUtil.substituteMarkers("}\"rV:Ba,F zjV", "delete//", character0);
      assertEquals("}\"rV:Ba,F zjV", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("truncatec1.kntq");
      DBDataType dBDataType0 = DBDataType.getInstance((-200256657), "callm!wze?cys5'rmd)la");
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("truncatec1.kntq", defaultDBTable0, dBDataType0, integer0, integer0);
      String string0 = defaultDBColumn0.toString();
      assertEquals("truncatec1.kntq : CALLM!WZE?CYS5'RMD)LA(1,1)", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance((-1763), "DATE");
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("eXy?57'V]>j{fG&", defaultDBTable0, dBDataType0, integer0, integer0);
      String string0 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("DATE", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("'}Z");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(" ADD ", dBSchema0);
      DBDataType dBDataType0 = DBDataType.getInstance((-846), " ADD ");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("wt|z)-[Xd9x", defaultDBTable0, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals(" ADD (2)", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Vector<DBColumn> vector0 = new Vector<DBColumn>();
      DBSchema dBSchema0 = new DBSchema("execute#i)?");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("execute#i)?", dBSchema0);
      DBDataType dBDataType0 = DBDataType.getInstance("DATE");
      Integer integer0 = new Integer((-2943));
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("/*", defaultDBTable0, dBDataType0, integer0, integer0);
      vector0.add((DBColumn) defaultDBColumn0);
      vector0.add((DBColumn) defaultDBColumn0);
      String string0 = SQLUtil.renderColumnNames((List<DBColumn>) vector0);
      assertEquals("/*, /*", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DBColumn[] dBColumnArray0 = new DBColumn[3];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(4, "$N9bVFN6Y)sNzu");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("$N9bVFN6Y)sNzu", defaultDBTable0, dBDataType0);
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames(dBColumnArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create unique indexselect into", defaultDBTable0, 44, "create unique indexselect into");
      DBColumn[] dBColumnArray0 = new DBColumn[1];
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("create unique indexselect into", string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "exec", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("U*T68MZNh>{i");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertNull(defaultDBTable0.getName());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[6];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "selectdefault_table_type", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("mJmCXE");
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("selectdefault_table_type", defaultDBTable0, 7, "2200L");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("mJmCXE");
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertNull(defaultDBTable0.getDoc());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("()");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("He1((@{:Aep");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: He1((@{:Aep
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn("u#^(M',R0)v+gTl", (DBTable) null, 10, "u#^(M',R0)v+gTl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"M'\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("BINARY_DOUBLE", true, defaultDBTable0, "BINARY_DOUBLE");
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CHECK BINARY_DOUBLE", string0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[8];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "create unique indexselect into", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY (, , , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = SQLUtil.innerJoin("j?L=,>", stringArray0, "create unique indexselect into", "PRIMARY KEY (create unique indexselect into, create unique indexselect into CREATE UNIQUE INDEXSELECT INTO NULL, create unique indexselect into, create unique indexselect into, create unique indexselect into CREATE UNIQUE INDEXSELECT INTO NULL, create unique indexselect into CREATE UNIQUE INDEXSELECT INTO NULL, create unique indexselect into CREATE UNIQUE INDEXSELECT INTO NULL, create unique indexselect into)", stringArray0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      String string0 = SQLUtil.substituteMarkers("", "", "");
      assertEquals("''", string0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.leftJoin("drop index", stringArray0, "CONSTRAINT \"renamecallnivgaivdg ` w (f ~ re \" FOREIGN KEY (renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg`w(f~re, renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg ` w (f ~ re ) REFERENCES null(renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg`w(f~re, renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg ` w (f ~ re )", "callnivgaivdg`w(f~r", stringArray0);
      assertEquals("left join CONSTRAINT \"renamecallnivgaivdg ` w (f ~ re \" FOREIGN KEY (renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg`w(f~re, renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg ` w (f ~ re ) REFERENCES null(renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg`w(f~re, renamecallnivgaivdg ` w (f ~ re , renamecallnivgaivdg ` w (f ~ re ) as callnivgaivdg`w(f~r on drop index.null = callnivgaivdg`w(f~r.null and drop index.null = callnivgaivdg`w(f~r.null and drop index.null = callnivgaivdg`w(f~r.null and drop index.null = callnivgaivdg`w(f~r.null", string0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[4];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("^h[aftE1;^", true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      RowOutputBinary rowOutputBinary0 = new RowOutputBinary(4);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(rowOutputBinary0, true);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertEquals(67, rowOutputBinary0.size());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance(277, "Lock mode set to MODE_TABLE because no start or stop position");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("@M9]Q/JSLJf", defaultDBTable0, dBDataType0);
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint(defaultDBTable0, " = ", false, "@M9]Q/JSLJf");
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBNotNullConstraint0, nameSpec0);
      assertEquals("@M9]Q/JSLJf NOT NULL", string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[5];
      String string0 = SQLUtil.renderQuery(defaultDBTable0, stringArray0, stringArray0);
      assertEquals("SELECT * FROM null WHERE null = null AND null = null AND null = null AND null = null AND null = null", string0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      StringWriter stringWriter0 = new StringWriter(40);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, false);
      // Undeclared exception!
      try { 
        SQLUtil.renderAddForeignKey((DBForeignKeyConstraint) null, nameSpec0, mockPrintWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[4];
      NameSpec nameSpec0 = NameSpec.NEVER;
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "execute", true, stringArray0);
      String string0 = SQLUtil.ukSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("UNIQUE (, , , )", string0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      SQLUtil sQLUtil0 = new SQLUtil();
  }
}
