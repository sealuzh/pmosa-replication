/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 08:54:24 GMT 2019
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.PipedReader;
import java.io.StringReader;
import java.math.BigDecimal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 76, 59);
      jSONReaderScanner0.token = 76;
      jSONReaderScanner0.bytesValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4432));
      char[] charArray0 = new char[3];
      charArray0[0] = 'x';
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 293, 71);
      SymbolTable symbolTable0 = new SymbolTable(293);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanSymbol(symbolTable0, '^');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed.str
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("T9`VIl");
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf('\u001A', 2870);
      assertEquals('`', jSONReaderScanner0.getCurrent());
      assertEquals(2870, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("'28p}");
      int int0 = jSONReaderScanner0.indexOf('G', 0);
      assertEquals('\'', jSONReaderScanner0.getCurrent());
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|5|e863~97J2i`^");
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf('h', 125);
      assertEquals(1, jSONReaderScanner0.token());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 114, (-3347));
      boolean boolean0 = jSONReaderScanner0.matchField(charArray0);
      assertEquals(20, jSONReaderScanner0.token());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 0);
      char[] charArray1 = jSONReaderScanner0.sub_chars(2256, 0);
      assertEquals(0, charArray1.length);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 70);
      jSONReaderScanner0.subString(0, 1683);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("*u?|@aCU{M");
      jSONReaderScanner0.putChar('/');
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("u", string0);
      assertEquals('*', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.stringVal();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.np = 1535;
      String string0 = jSONReaderScanner0.numberString();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[1] = '2';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4, 15);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('2', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO");
      assertEquals('T', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('O', char0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '&';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 468, 468);
      int int0 = jSONReaderScanner0.indexOf('&', 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|5|e863~97J2i`^");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.nextIdent();
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((byte)5, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|5|e63~97J2i`^");
      char char0 = jSONReaderScanner0.charAt(10);
      assertEquals('2', char0);
      assertEquals('|', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("WriteSlashAsSpecial");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.bytesValue();
      assertEquals(18, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("=[0IvEn5");
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertEquals('=', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 114, (-3347));
      int int0 = jSONReaderScanner0.indexOf('5', 9);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 468, 468);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.indexOf('z', 892);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("wW`ggqF#4P}2g1oc-vZ", 12);
      char[] charArray0 = new char[8];
      jSONReaderScanner0.copyTo(12, 0, charArray0);
      assertEquals('w', jSONReaderScanner0.getCurrent());
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-749), 66, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4432));
      char[] charArray0 = new char[3];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[0];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, 612, 1655);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 114, (-3334));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-3334), charArray0, (-40), (-40));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-3347));
      SymbolTable symbolTable0 = new SymbolTable(114);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-3347), 1955, (-3347), symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      SymbolTable symbolTable0 = new SymbolTable(578);
      String string0 = jSONReaderScanner0.addSymbol(0, 101, 0, symbolTable0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[14];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0085', '\u0085');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1203), 1601);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, 65279);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-721), 65279);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
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
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 114, (-3347));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('r', (-652));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -652
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.np = 83;
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
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("L");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 4);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(3180, (-2), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[14];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0085', (-3347));
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
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4, 34);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-2138));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2138
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("&$has_]i@46[");
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
  public void test40()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("ident");
      jSONReaderScanner0.sp = 44;
      jSONReaderScanner0.np = 44;
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
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("java.time.Duration", 2);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(2, (char[]) null, 56320, 258);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279);
      SymbolTable symbolTable0 = new SymbolTable(65279);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1), (-1), 70, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("'28p}");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1602), 0, 0, (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-2274), 70);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(911);
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, 110);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(514);
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
  public void test47()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4432));
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u001A', char0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      jSONReaderScanner0.putChar('L');
      jSONReaderScanner0.scanFieldFloat(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4, 2467);
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '!';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("T9`VIl");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.np = (-1347);
      jSONReaderScanner0.isEOF();
      jSONReaderScanner0.charAt(125);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1346
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TaFl");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals('T', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 468, 468);
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
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[8] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 468, 468);
      jSONReaderScanner0.scanFieldBoolean(charArray0);
      jSONReaderScanner0.indexOf('D', 0);
      jSONReaderScanner0.close();
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|5|e863~97J2i`^");
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
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = 'r';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 425);
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("r", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 425);
      jSONReaderScanner0.nextIdent();
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
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      char[] charArray1 = jSONReaderScanner0.sub_chars(0, 0);
      assertEquals(16384, charArray1.length);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4432));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-4432), (-1028));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1028
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 538, 538);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(538, (-2933));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2933
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[1] = '0';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '0');
      jSONReaderScanner0.nextIdent();
      assertEquals(2, jSONReaderScanner0.token());
      
      jSONReaderScanner0.decimalValue();
      assertTrue(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO");
      jSONReaderScanner0.bp = 1150;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanDate('\'');
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("T9`VIl");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.charAt(125);
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
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 425);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.nextIdent();
      char char0 = jSONReaderScanner0.charAt(125);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StringReader stringReader0 = new StringReader("BeanToArray");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('B', char0);
      assertEquals('B', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|5|e863~97J2i`^");
      char[] charArray0 = new char[5];
      jSONReaderScanner0.arrayCopy(0, charArray0, 0, 0);
      assertEquals('|', jSONReaderScanner0.getCurrent());
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TaFl");
      SymbolTable symbolTable0 = new SymbolTable(65536);
      String string0 = jSONReaderScanner0.addSymbol(125, 0, 52, symbolTable0);
      assertEquals('T', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }
}
