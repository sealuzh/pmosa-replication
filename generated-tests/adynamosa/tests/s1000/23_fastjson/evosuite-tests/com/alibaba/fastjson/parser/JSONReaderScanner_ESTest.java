/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 19:44:21 GMT 2019
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("toJSON error", (-3210));
      jSONReaderScanner0.putChar('!');
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
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'W';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 3678080);
      jSONReaderScanner0.putChar(')');
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("W", string0);
      assertEquals('W', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\":\"");
      jSONReaderScanner0.setToken(1276);
      jSONReaderScanner0.bytesValue();
      assertEquals('\"', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1);
      char[] charArray0 = new char[8];
      charArray0[0] = '\\';
      jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 18, 2125);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed string : \u001A
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")");
      char[] charArray0 = jSONReaderScanner0.sub_chars(3992, 3079);
      jSONReaderScanner0.arrayCopy(26, charArray0, 106, 65);
      assertEquals(3079, charArray0.length);
      assertEquals(')', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("dqxfKR^");
      assertEquals('d', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('q', char0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 0);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\":\"");
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
      assertEquals('\"', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("62|u-|'");
      jSONReaderScanner0.putChar(':');
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals('6', jSONReaderScanner0.getCurrent());
      assertEquals((byte)6, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1);
      char[] charArray0 = new char[8];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.bytesValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 101);
      SymbolTable symbolTable0 = new SymbolTable(95);
      String string0 = jSONReaderScanner0.addSymbol(306, 0, (-2127), symbolTable0);
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("gxi7X{+hm_kv");
      String string0 = jSONReaderScanner0.subString(70, 0);
      assertEquals('g', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 881);
      String string0 = jSONReaderScanner0.subString(0, 58);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("hjF5'H':T5");
      int int0 = jSONReaderScanner0.indexOf(':', 0);
      assertEquals(7, int0);
      assertEquals('h', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 7);
      jSONReaderScanner0.copyTo(7, 0, charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1786, 1786);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(0, (-4294), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-1282), 27, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("GFn(q7+", 0);
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('G', jSONReaderScanner0.getCurrent());
      assertEquals('G', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[0];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2407, 2407);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(59, (char[]) null, (-1693), 2407);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(27, charArray0, 1742, 27);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 13);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, (-1950), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 2540);
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(2540, charArray0, (-2239), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 1);
      SymbolTable symbolTable0 = new SymbolTable(23);
      String string0 = jSONReaderScanner0.addSymbol(1, 23, 1, symbolTable0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      SymbolTable symbolTable0 = new SymbolTable(27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-1287), (-1287), 27, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-1), 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("TODO", 105);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(3678080, 3678080);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(102, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 42, 42);
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
  public void test31()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("yG", 2756);
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
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 42, 42);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('9', 763);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 7);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('/', (-1195));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1195
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 3);
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
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(2393, 68, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '@');
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-1124));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1124
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("`9a[", 3390);
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
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = new char[9];
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-283), charArray0, 0, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-3140));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 2540);
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("v~SAv1Oy6");
      assertEquals('v', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.next();
      char char0 = jSONReaderScanner0.charAt(1148);
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = ':';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 51, 68);
      jSONReaderScanner0.scanBoolean(':');
      assertEquals(3, jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[0];
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
  public void test45()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = ' ';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 42, 42);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals(' ', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\":\"");
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
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 8, 42);
      jSONReaderScanner0.indexOf('%', 76);
      assertTrue(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.close();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'L';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4274);
      jSONReaderScanner0.putChar('X');
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
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("62|u-|'");
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
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'B';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 26);
      jSONReaderScanner0.putChar('~');
      String string0 = jSONReaderScanner0.numberString();
      assertEquals('B', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      char[] charArray1 = jSONReaderScanner0.sub_chars(0, 32);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals(16384, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0, 881);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(3300, (-1115));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1115
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 7, 7);
      char[] charArray1 = jSONReaderScanner0.sub_chars(7, 0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 301);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-2240), (-1703));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1703
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("J6^m-6(A3Q)a");
      jSONReaderScanner0.np = (-31);
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
  public void test57()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.hasSpecial = true;
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 8, 42);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\":\"");
      jSONReaderScanner0.sp = 2136;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\":\"");
      jSONReaderScanner0.scanString();
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
  public void test61()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 3);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.nextToken();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("73,\"] i;!,~B:9._", 2368);
      char[] charArray0 = new char[2];
      jSONReaderScanner0.bp = 59;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanFieldFloatArray(charArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 42, 42);
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u0000', char0);
      
      int int0 = jSONReaderScanner0.indexOf('9', 763);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.intValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[0] = '3';
      charArray0[1] = '3';
      charArray0[2] = '3';
      charArray0[3] = '3';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 34);
      jSONReaderScanner0.scanType("=p48[,`O*j8A<G");
      jSONReaderScanner0.next();
      jSONReaderScanner0.nextToken((-2327));
      jSONReaderScanner0.stringVal();
      jSONReaderScanner0.bytesValue();
      jSONReaderScanner0.bytesValue();
      assertEquals(1, jSONReaderScanner0.pos());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("333", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StringReader stringReader0 = new StringReader("l)s^*n");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      int int0 = jSONReaderScanner0.indexOf('z', 8192);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('l', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(0, 0, 0, (SymbolTable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("%Ol$DmWQ,DMV");
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-4337), charArray0, 3675, (-1162));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("\":\"");
      String string0 = jSONReaderScanner0.scanString('\\');
      assertFalse(jSONReaderScanner0.isEOF());
      assertEquals('\"', jSONReaderScanner0.getCurrent());
      assertEquals(":", string0);
  }
}
