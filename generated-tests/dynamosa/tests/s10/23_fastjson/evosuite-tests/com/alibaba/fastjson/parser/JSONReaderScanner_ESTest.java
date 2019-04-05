/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:37:45 GMT 2019
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("G", 1289);
      jSONReaderScanner0.indexOf('}', 34);
      jSONReaderScanner0.isBlankInput();
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('G', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",1oF`I8(@TQ");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.scanIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("k):J_ZZJg_e}b]");
      assertEquals('k', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
      assertEquals(')', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '0';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '0');
      jSONReaderScanner0.scanFieldDouble(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanNumber();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal stat, textLength is zero", 0);
      assertEquals('i', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.next();
      int int0 = jSONReaderScanner0.indexOf('l', 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 58, 58);
      jSONReaderScanner0.scanFieldString(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.matchField(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 28);
      String string0 = jSONReaderScanner0.subString(1518, 121);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".&@e\"aF4=n8O.90_?");
      jSONReaderScanner0.scanIdent();
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals(".", string0);
      assertEquals('&', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 0);
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("F$?I;l|Ih0a{PXZ0");
      assertEquals('F', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
      assertEquals('$', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '2';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 3845);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('2', jSONReaderScanner0.getCurrent());
      assertEquals('2', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '0';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 33);
      assertEquals('0', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanNumber();
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("w#.0$*E_?SV");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("C");
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.next();
      int int0 = jSONReaderScanner0.indexOf('\u001A', 0);
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '0';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 33);
      jSONReaderScanner0.scanNumber();
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((short)0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-4}VHNrpd<qb", 0);
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.decimalValue();
      assertEquals('}', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#>dux,<5j+Wig2q");
      char char0 = jSONReaderScanner0.charAt(13);
      assertEquals('2', char0);
      assertEquals('#', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".cJ fcqgU<X{h");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.bytesValue();
      assertEquals(' ', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|1,#i24)R{lPgKzp");
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertEquals("", string0);
      assertEquals('|', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".&@e\"aF4=n8O.90_?");
      jSONReaderScanner0.scanIdent();
      int int0 = jSONReaderScanner0.indexOf('4', 34);
      assertEquals('&', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ydZ{Q_y*XcjoVnH");
      assertEquals('y', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.next();
      int int0 = jSONReaderScanner0.indexOf('A', 590);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".&@e\"aF4=n8O.90_?");
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(16384, (-517), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|1,#i24)R{lPgKzp");
      char[] charArray0 = new char[6];
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals('|', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ydZ{Q_y*XcjoVnH");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-3672), 37, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".&@e\"aF4=n8O.90_?");
      char[] charArray0 = new char[6];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('.', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[0];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#>dux,<5j+Wi)g2q", 889);
      char[] charArray0 = jSONReaderScanner0.sub_chars(889, 0);
      jSONReaderScanner0.arrayCopy(0, charArray0, 0, 0);
      assertEquals(0, charArray0.length);
      assertEquals('#', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal stat, textLength is zero", 0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, 1, (-130));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 83, (-1242));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-3487), (-3487), (-1242), (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 28);
      SymbolTable symbolTable0 = new SymbolTable(28);
      String string0 = jSONReaderScanner0.addSymbol(0, 0, 0, symbolTable0);
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[19];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '0');
      SymbolTable symbolTable0 = new SymbolTable(16384);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1950), 2231, 16384, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".&@e\"aF4=n8O.90_?");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(1266, 70);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("~-M>=jrYa<g");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1630), 2529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("*~`6n");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(41, 33);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 16376, 16376);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.stringVal();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 41);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 41);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ydZ{Q_y*XcjoVnH");
      jSONReaderScanner0.bp = (-2001);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.next();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2000
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#>dux,<5j+Wi)g2q", 889);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isEOF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#>dux,<5j+Wi)g2q", 889);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isBlankInput();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ydZ{Q_y*XcjoVnH");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('d', 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#>dux,<5j+Wi)g2q", 877);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('H', (-1211));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1211
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 41);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 11, (-513));
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(11, 11, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",1oF`I8(@TQ");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charArrayCompare((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableOpecialKeyDetect");
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.scanNumber();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.bytesValue();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("C");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(16384, (char[]) null, 1, 123);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 2);
      SymbolTable symbolTable0 = new SymbolTable(16384);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(2, (-2796), (-2796), symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-1193), 35);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 4350);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((String) null, 785);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, 26);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.scanIdent();
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("\u0000", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("illegal stat, textLength is zero", 0);
      assertEquals('i', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.next();
      char char0 = jSONReaderScanner0.charAt(49);
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("C");
      assertEquals('C', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanIdent();
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('C', char0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-1268));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1268
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("C");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals('C', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 41);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 16376, 16376);
      jSONReaderScanner0.scanFieldFloat(charArray0);
      jSONReaderScanner0.scanFieldDate(charArray0);
      jSONReaderScanner0.close();
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader(",1oF`I8(@TQ");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      jSONReaderScanner0.scanIdent();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '2';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '2');
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanNumber();
      jSONReaderScanner0.decimalValue();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ydZ{Q_y*XcjoVnH");
      char[] charArray0 = jSONReaderScanner0.sub_chars(781, 781);
      JSONReaderScanner jSONReaderScanner1 = new JSONReaderScanner(charArray0, 50, 116);
      SymbolTable symbolTable0 = new SymbolTable(625);
      // Undeclared exception!
      try { 
        jSONReaderScanner1.scanSymbol(symbolTable0, 'd');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed.str
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.parser.JSONReaderScanner");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1), (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals(16384, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-6374));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-2369), (-6374));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -6374
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(",1oF`I8(@TQ");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-1425), 2878);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(".cJ fcqgU<X{h");
      byte[] byteArray0 = jSONReaderScanner0.bytesValue();
      assertEquals(0, byteArray0.length);
      assertEquals('.', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '2';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '2');
      jSONReaderScanner0.scanNumber();
      jSONReaderScanner0.scanFieldFloat(charArray0);
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 41);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.nextToken();
      char char0 = jSONReaderScanner0.charAt(41);
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("C");
      int int0 = jSONReaderScanner0.indexOf('\u001A', 0);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 41, 41);
      boolean boolean0 = jSONReaderScanner0.matchField(charArray0);
      assertEquals(20, jSONReaderScanner0.token());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("-4}VHNrpd<qb", 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.decimalValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      SymbolTable symbolTable0 = new SymbolTable(119);
      String string0 = jSONReaderScanner0.addSymbol(119, 7, 2610, symbolTable0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 37, 37);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-1), charArray0, (-538), 2585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}