/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:40:00 GMT 2019
 */

package org.databene.jdbacl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.management.remote.JMXPrincipal;
import org.apache.derby.iapi.sql.dictionary.GenericDescriptorList;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.h2.value.ValueLob;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = SQLUtil.substituteMarkers("result", "WGx+[5`DZ", (Object) null);
      assertEquals("result", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.renderColumnListWithTableName("}w{9U!X+*UY&bug&R", stringArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = SQLUtil.leftJoin("|z{54MLE9#", stringArray0, "|_Rq~+1!{n#k", (String) null, stringArray0);
      assertEquals("left join |_Rq~+1!{n#k as null on |z{54MLE9#.null = null.null", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.leftJoin("insert", stringArray0, "resultset ", "resultset ", stringArray0);
      assertEquals("left join resultset  as resultset  on ", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[7];
      String string0 = SQLUtil.leftJoin("", stringArray0, "", "AF]h/", stringArray0);
      assertEquals("left join  as AF]h/ on .null = AF]h/.null and .null = AF]h/.null and .null = AF]h/.null and .null = AF]h/.null and .null = AF]h/.null and .null = AF]h/.null and .null = AF]h/.null", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[7];
      String string0 = SQLUtil.join((String) null, (String) null, stringArray0, "H+_+(<ZS#aT|'}xG", stringArray0[2], stringArray0);
      assertEquals("H+_+(<ZS#aT|'}xG as null on null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null and null.null = null.null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = SQLUtil.innerJoin("resultset ", stringArray0, ")", "tE5;AUl*/m2h_V84~1]", stringArray0);
      assertEquals(") as tE5;AUl*/m2h_V84~1] on ", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = SQLUtil.innerJoin(">ec<3d,dI#g{k3v", stringArray0, "(-jXx", "(-JXX", stringArray0);
      assertEquals("(-jXx as (-JXX on >ec<3d,dI#g{k3v.null = (-JXX.null", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = SQLUtil.innerJoin("", stringArray0, "ALTER TABLE ", "D6+^WK_}", stringArray0);
      assertEquals("ALTER TABLE  as D6+^WK_} on .null = D6+^WK_}.null and .null = D6+^WK_}.null and .null = D6+^WK_}.null and .null = D6+^WK_}.null and .null = D6+^WK_}.null and .null = D6+^WK_}.null and .null = D6+^WK_}.null and .null = D6+^WK_}.null", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
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
  public void test14()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance((-3931), ",'MR$Ve(yX/H");
      Integer integer0 = RawTransaction.SAVEPOINT_ROLLBACK;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn(",'MR$Ve(yX/H", defaultDBTable0, dBDataType0, integer0);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0, (StringBuilder) null);
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
  public void test16()  throws Throwable  {
      LinkedList<DBColumn> linkedList0 = new LinkedList<DBColumn>();
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames((List<DBColumn>) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GenericDescriptorList genericDescriptorList0 = new GenericDescriptorList();
      JMXPrincipal jMXPrincipal0 = new JMXPrincipal("$RP&0u");
      genericDescriptorList0.add((Object) jMXPrincipal0);
      // Undeclared exception!
      try { 
        SQLUtil.renderColumnNames((List<DBColumn>) genericDescriptorList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.management.remote.JMXPrincipal cannot be cast to org.databene.jdbacl.model.DBColumn
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.normalize((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.isQuery((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      SQLUtil.isDML("/*");
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String[] stringArray1 = new String[0];
      // Undeclared exception!
      try { 
        SQLUtil.innerJoin((String) null, stringArray0, "", "C^", stringArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.NEVER;
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
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.constraintName((DBConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "create unique index");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      // Undeclared exception!
      try { 
        SQLUtil.appendConstraintName((DBConstraint) null, stringBuilder0, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.addRequiredCondition(" NOT NULL", (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[9];
      String string0 = SQLUtil.join("y / & e } + (N", (String) null, stringArray0, stringArray0[8], "|", stringArray0);
      assertEquals("y / & e } + (N join null as | on null.null = |.null and null.null = |.null and null.null = |.null and null.null = |.null and null.null = |.null and null.null = |.null and null.null = |.null and null.null = |.null and null.null = |.null", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = SQLUtil.isQuery("TI");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = SQLUtil.isProcedureCall("create materialized view");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDML("\"G6.De");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = SQLUtil.isDDL("alter index");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure(">ec<3d,dI#g{k3v");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = SQLUtil.renderValue("CONSTRAINT 0C[ ");
      assertEquals("'CONSTRAINT 0C[ '", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = SQLUtil.renderValue((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String string0 = SQLUtil.renderColumnNames(stringArray0);
      assertEquals("(, , , )", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NameSpec nameSpec0 = NameSpec.NEVER;
      // Undeclared exception!
      try { 
        SQLUtil.fkSpec((DBForeignKeyConstraint) null, nameSpec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("drop materialized viewselect into");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.nval = (-81.283);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 81.283", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ValueLob valueLob0 = ValueLob.createSmallLob(4237, byteArray0);
      Reader reader0 = valueLob0.getReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(reader0);
      streamTokenizer0.nval = 1.0;
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[6];
      String string0 = SQLUtil.renderColumnListWithTableName((String) null, stringArray0);
      assertEquals("null.null, null.null, null.null, null.null, null.null, null.null", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ValueLob valueLob0 = ValueLob.createSmallLob(4237, byteArray0);
      Reader reader0 = valueLob0.getReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(reader0);
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("- 0", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ValueLob valueLob0 = ValueLob.createSmallLob(4237, byteArray0);
      Reader reader0 = valueLob0.getReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(reader0);
      streamTokenizer0.nval = 0.1;
      String string0 = SQLUtil.renderNumber(streamTokenizer0);
      assertEquals("0.1", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = SQLUtil.normalize("\"I6", true);
      assertEquals("\"I6\"", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = SQLUtil.normalize("Me]lBV-*Vr=b 'AH<]R", false);
      assertEquals("Me ] lBV - * Vr = b 'AH<]R'", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = SQLUtil.normalize("/*", false);
      assertEquals("/*", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = SQLUtil.normalize("create materialized view-- h2 0.5/b --", false);
      assertEquals("create materialized view -- h2 0.5 / b --", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = SQLUtil.normalize(",Q&RBdh_,)0jY{u(", true);
      assertEquals(", Q & RBdh_,) 0jY { u (", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = SQLUtil.normalize("b(u)8FaK`;HH9O{;", false);
      assertEquals("b (u) 8FaK ` ; HH9O { ;", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = SQLUtil.removeComments("@\"\"~cF1");
      assertEquals("@\"\"~cF1", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      String string0 = SQLUtil.typeAndName(dBForeignKeyConstraint0);
      assertEquals("foreign key constraint constraint", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("", (DBTable) null, (-930), "' not found in table '");
      String string0 = SQLUtil.typeAndName(defaultDBColumn0);
      assertEquals("column ", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = SQLUtil.typeAndName((DBObject) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null);
      String string0 = SQLUtil.typeAndName(dBSchema0);
      assertNotNull(string0);
      assertEquals("schema null", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "throwIfMissingParms", true, stringArray0);
      String string0 = SQLUtil.constraintName(dBPrimaryKeyConstraint0);
      assertEquals("CONSTRAINT throwIfMissingParms ", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, (String) null, true, stringArray0);
      String string0 = SQLUtil.constraintName(dBUniqueConstraint0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[3];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("alter table");
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, " on ", true, stringArray0);
      StringBuilder stringBuilder0 = new StringBuilder(" xh&/d{?'|)");
      SQLUtil.appendConstraintName((DBConstraint) dBUniqueConstraint0, stringBuilder0);
      assertEquals(" xh&/d{?'|)CONSTRAINT \" on \" ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      SQLUtil.appendConstraintName((DBConstraint) dBForeignKeyConstraint0, (StringBuilder) null);
      assertNull(dBForeignKeyConstraint0.getName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String[] stringArray0 = new String[2];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("alter tablehh:mm");
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "vD>%`BARf3Y8x%k", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, (String) null, false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.ukSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("UNIQUE ()", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog(" DEFAULT ");
      DBSchema dBSchema0 = new DBSchema("alter session", dBCatalog0);
      String string0 = SQLUtil.ownerDotComponent(dBSchema0);
      assertEquals(" DEFAULT .alter session", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null);
      String string0 = SQLUtil.ownerDotComponent(dBSchema0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "org.apache.derby.impl.sql.execute.ColumnInfo");
      SQLUtil.addOptionalCondition("org.apache.derby.impl.sql.execute.ColumnInfo", stringBuilder0);
      assertEquals("org.apache.derby.impl.sql.execute.ColumnInfo or org.apache.derby.impl.sql.execute.ColumnInfo", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addOptionalCondition((String) null, stringBuilder0);
      assertEquals("null", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable(" P WHERE ");
      String[] stringArray0 = new String[4];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("selectx0y28.s", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      StringBuilder stringBuilder0 = SQLUtil.createConstraintSpecBuilder(dBForeignKeyConstraint0, nameSpec0);
      SQLUtil.addRequiredCondition(" P WHERE ", stringBuilder0);
      assertEquals("CONSTRAINT selectx0y28.s  and  P WHERE ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      SQLUtil.addRequiredCondition((String) null, stringBuilder0);
      assertEquals("null", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String[] stringArray0 = new String[3];
      String string0 = SQLUtil.join((String) null, "alter index", stringArray0, "Y&u]e7Ez~", "Y&u]e7Ez~", stringArray0);
      assertEquals("Y&u]e7Ez~ as Y&u]e7Ez~ on alter index.null = Y&u]e7Ez~.null and alter index.null = Y&u]e7Ez~.null and alter index.null = Y&u]e7Ez~.null", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("select into", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBForeignKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT \"select into\" FOREIGN KEY (, , , , ) REFERENCES null(, , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DBSchema dBSchema0 = new DBSchema("|z{54MLE9#");
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("|_Rq~+1!{n#k", dBSchema0);
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "|z{54MLE9#", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      String string0 = SQLUtil.constraintSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("CONSTRAINT |z{54MLE9# PRIMARY KEY ()", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      // Undeclared exception!
      SQLUtil.mutatesDataOrStructure("/*");
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesStructure("calllchju4: ph^utif2q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select into");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("select");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("ALTER TABLE ");
      assertTrue(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Boolean boolean0 = SQLUtil.mutatesDataOrStructure("alter session");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Character character0 = Character.valueOf('X');
      String string0 = SQLUtil.renderValue(character0);
      assertEquals("'X'", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = SQLUtil.renderWhereClause(stringArray0, stringArray0);
      assertEquals("null = null AND null = null", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DBDataType dBDataType0 = DBDataType.getInstance((int) (byte)104, "VALUE_LIST");
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("Dl3$=]bKJ8@6ZF3%", (DBTable) null, dBDataType0, integer0);
      String string0 = defaultDBColumn0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog(" DEFAULT ");
      DBSchema dBSchema0 = new DBSchema("alter session", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.apache.derby.impl.sql.compile.CharTypeCompiler", dBSchema0);
      DBDataType dBDataType0 = DBDataType.getInstance(13, "alter session");
      Integer integer0 = new Integer(13);
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("org.apache.derby.impl.sql.compile.CharTypeCompiler", defaultDBTable0, dBDataType0, integer0, integer0);
      String string0 = SQLUtil.renderColumnTypeWithSize((DBColumn) defaultDBColumn0);
      assertEquals("ALTER SESSION(13,13)", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("0D@s$*>oz");
      DBDataType dBDataType0 = DBDataType.getInstance(93, "DATE");
      Integer integer0 = RawTransaction.LOCK_ESCALATE;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("erM2\"4br|.%", defaultDBTable0, dBDataType0, integer0);
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("erM2\"4br|.% DATE NULL", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("D0aTF", (DBTable) null, (-349), "CLOB");
      defaultDBColumn0.setDefaultValue("D0aTF");
      String string0 = SQLUtil.renderColumn(defaultDBColumn0);
      assertEquals("D0aTF CLOB DEFAULT D0aTF NULL", string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Vector<DBColumn> vector0 = new Vector<DBColumn>();
      DBDataType dBDataType0 = DBDataType.getInstance((-1336), "truncate");
      Integer integer0 = RawTransaction.ABORT;
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("truncate", (DBTable) null, dBDataType0, integer0, integer0);
      vector0.add((DBColumn) defaultDBColumn0);
      String string0 = SQLUtil.renderColumnNames((List<DBColumn>) vector0);
      assertEquals("truncate", string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      DBColumn[] dBColumnArray0 = new DBColumn[3];
      DBDataType dBDataType0 = DBDataType.getInstance(438, "V#k,S");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("create materialized viewdefault", (DBTable) null, dBDataType0);
      dBColumnArray0[0] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[1] = (DBColumn) defaultDBColumn0;
      dBColumnArray0[2] = (DBColumn) defaultDBColumn0;
      String string0 = SQLUtil.renderColumnNames(dBColumnArray0);
      assertEquals("create materialized viewdefault, create materialized viewdefault, create materialized viewdefault", string0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory");
      String[] stringArray0 = new String[6];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("truncateunknown constraint", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory");
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertNull(defaultDBTable0.getDoc());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("xU+>w+4v:~]K]Z&UL");
      String[] stringArray0 = new String[4];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "xU+>w+4v:~]K]Z&UL", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      MockFile mockFile0 = new MockFile("alter indexsoi&z.h+zvxmm$p0'^o");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      SQLUtil.renderCreateTable(defaultDBTable0, true, nameSpec0, mockPrintWriter0);
      assertNull(defaultDBTable0.getDoc());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "alter materialized view", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("alter materialized view");
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBDataType dBDataType0 = DBDataType.getInstance((-5016), "renamedrop materialized view");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("renamedrop materialized view", defaultDBTable0, dBDataType0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("[hrXK$1");
      SQLUtil.renderCreateTable(defaultDBTable0, false, nameSpec0, mockPrintWriter0);
      assertNull(defaultDBTable0.getName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("b (u) 8FaK ` ; HH9O { ;");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"u\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      // Undeclared exception!
      try { 
        SQLUtil.parseColumnTypeAndSize("[8E`-m(jA#j");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Illegal column type format: [8E`-m(jA#j
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Object[] objectArray0 = SQLUtil.parseColumnTypeAndSize("[D'Fxw$");
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("alter tablehh:mm");
      DefaultDBColumn defaultDBColumn0 = null;
      try {
        defaultDBColumn0 = new DefaultDBColumn("<%8yaVCCSJO'v,", defaultDBTable0, (-1913734716), "PRIMARY KEY (>.Dv0R9j$E8J+P&:,, <%8yaVCCSJO'v,)");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \">.Dv0R9j$E8J+P&:\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("eD D{P,[x%B^brmaL", true, "XBM0W.S", "Mb");
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBCheckConstraint0, nameSpec0);
      assertEquals("CONSTRAINT \"eD D{P,[x%B^brmaL\" CHECK Mb", string0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint(defaultDBTable0, "(-jXx", false, stringArray0);
      NameSpec nameSpec0 = NameSpec.NEVER;
      String string0 = SQLUtil.pkSpec(dBPrimaryKeyConstraint0, nameSpec0);
      assertEquals("PRIMARY KEY ()", string0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = SQLUtil.innerJoin((String) null, stringArray0, (String) null, stringArray0[0], stringArray0);
      assertEquals("null as null on null.null = null.null and null.null = null.null", string0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        SQLUtil.renderQuery((DBTable) null, stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.databene.jdbacl.SQLUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory");
      String[] stringArray0 = new String[6];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("truncateunknown constraint", false, defaultDBTable0, stringArray0, defaultDBTable0, stringArray0);
      NameSpec nameSpec0 = NameSpec.ALWAYS;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("org.apache.derby.impl.sql.catalog.SYSALIASESRowFactory");
      SQLUtil.renderAddForeignKey(dBForeignKeyConstraint0, nameSpec0, mockPrintWriter0);
      assertFalse(dBForeignKeyConstraint0.isNameDeterministic());
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("HF(9cJhF<Y=+[sJ");
      String[] stringArray0 = new String[7];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint(defaultDBTable0, "", true, stringArray0);
      NameSpec nameSpec0 = NameSpec.IF_REPRODUCIBLE;
      String string0 = SQLUtil.constraintSpec(dBUniqueConstraint0, nameSpec0);
      assertEquals("CONSTRAINT  UNIQUE (, , , , , , )", string0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      SQLUtil sQLUtil0 = new SQLUtil();
  }
}