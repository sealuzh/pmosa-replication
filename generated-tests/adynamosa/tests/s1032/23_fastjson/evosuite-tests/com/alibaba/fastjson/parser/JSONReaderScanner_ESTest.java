/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 04:07:46 GMT 2019
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2706);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")8|7");
      jSONReaderScanner0.next();
      jSONReaderScanner0.scanNumber();
      jSONReaderScanner0.numberString();
      assertEquals('|', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("|.c3", 6);
      jSONReaderScanner0.setToken(66);
      byte[] byteArray0 = jSONReaderScanner0.bytesValue();
      assertEquals(0, byteArray0.length);
      assertEquals('|', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"");
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1530, 26);
      jSONReaderScanner0.bp = 1530;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanFieldInt(charArray0);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("*~X[hN&Y4'SX*G^y");
      jSONReaderScanner0.scanIdent();
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("*", string0);
      assertEquals('~', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals('!', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 1087);
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u001A', char0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")8|7");
      jSONReaderScanner0.next();
      int int0 = jSONReaderScanner0.indexOf('8', 1);
      assertEquals('8', jSONReaderScanner0.getCurrent());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("6O");
      assertEquals('6', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('O', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('!', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("3o");
      jSONReaderScanner0.nextIdent();
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((short)3, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("BeanToArray");
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('B', char0);
      assertEquals('B', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'x';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 68);
      SymbolTable symbolTable0 = new SymbolTable(1);
      jSONReaderScanner0.scanSymbol(symbolTable0);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals(18, jSONReaderScanner0.token());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("3o");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.bytesValue();
      assertEquals(18, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("6O");
      jSONReaderScanner0.subString(1596, 1596);
      assertEquals('6', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      int int0 = jSONReaderScanner0.indexOf('+', 0);
      assertEquals((-1), int0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("qh:4up'+pEe");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(0, (-525), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("2o|eo^71[ph's0");
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('2', jSONReaderScanner0.getCurrent());
      assertEquals('2', char0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 68);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o|eo^7$1[ph's0R");
      char[] charArray0 = new char[0];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('!', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("6O");
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, 0, (-5094));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")8|7", 1747);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-395), charArray0, 65536, (-395));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 1087);
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(1087, charArray0, (-2794), 1087);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 70);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(70, (-2129), (-2129), (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0>dkl0S\"c7K", 460);
      SymbolTable symbolTable0 = new SymbolTable(78);
      String string0 = jSONReaderScanner0.addSymbol(34, 115, 76, symbolTable0);
      assertEquals('0', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("R2M BP+~D<rCOeQ/V1");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1427), 575);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-848), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(",");
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
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 161);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.isEOF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("/");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('6', (-2219));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2219
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("X0n");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(3731, 1320, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 23);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-3362));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3362
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("+6`) ?-=", 1689);
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
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-519));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-519), (char[]) null, (-519), (-1211));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 68, 68);
      SymbolTable symbolTable0 = new SymbolTable(1);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1865), (-2010), 0, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#?_?");
      jSONReaderScanner0.close();
      SymbolTable symbolTable0 = new SymbolTable(78);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(0, 0, (-250), symbolTable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, (-147));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      jSONReaderScanner0.nextIdent();
      char char0 = jSONReaderScanner0.charAt(72);
      assertEquals(1, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.integerValue();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("InternFieldNames");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals('I', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":EMdh=x%#", 1);
      jSONReaderScanner0.indexOf('w', 1);
      assertTrue(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.close();
      assertEquals(':', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("3o");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.nextIdent();
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
  public void test46()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")8|7");
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
  public void test47()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")8|7");
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
  public void test48()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      assertEquals(16384, charArray0.length);
      assertEquals('!', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("#?_?");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-2147483647), (-2147483647));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2147483647
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      char[] charArray0 = jSONReaderScanner0.sub_chars(21, 0);
      assertEquals('!', jSONReaderScanner0.getCurrent());
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")8|7", (-2172));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-449), (-2172));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -2172
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1305);
      String string0 = jSONReaderScanner0.subString(0, 0);
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      jSONReaderScanner0.sp = 16384;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.stringVal();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":EMdh=x%#", 1);
      char[] charArray0 = new char[1];
      jSONReaderScanner0.scanFieldLong(charArray0);
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("~");
      jSONReaderScanner0.nextIdent();
      assertEquals(1, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(",");
      jSONReaderScanner0.indexOf('A', 2094);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals(',', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[4];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 883, 0);
      boolean boolean0 = jSONReaderScanner0.matchField(charArray0);
      assertEquals(20, jSONReaderScanner0.token());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("3o");
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.nextIdent();
      char char0 = jSONReaderScanner0.charAt(1507);
      assertEquals(18, jSONReaderScanner0.token());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\"");
      jSONReaderScanner0.longValue();
      jSONReaderScanner0.scanLong('e');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanIdent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
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
  public void test61()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!o]|eo^7$=1[ph's0R");
      SymbolTable symbolTable0 = new SymbolTable(26);
      String string0 = jSONReaderScanner0.addSymbol(0, 0, 26, symbolTable0);
      assertEquals('!', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, (-403), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2781);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-2220), 76, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("InternFieldNames");
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("InternFieldNames", string0);
  }
}
