/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:11:52 GMT 2019
 */

package com.alibaba.fastjson.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.SymbolTable;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReaderScanner_ESTest extends JSONReaderScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'V';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 2);
      jSONReaderScanner0.nextToken((-528));
      assertEquals(1, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[1];
      charArray0[0] = '>';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1074, 1074);
      jSONReaderScanner0.matchField(charArray0);
      jSONReaderScanner0.scanFieldBigInteger(charArray0);
      assertEquals((-2), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[4] = 'K';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 279);
      SymbolTable symbolTable0 = new SymbolTable(279);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanSymbol(symbolTable0, 'C');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unclosed.str
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '7';
      charArray0[6] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, (-994));
      assertEquals('7', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanNumber();
      int int0 = jSONReaderScanner0.indexOf('D', 1);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = '\\';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, (-994));
      int int0 = jSONReaderScanner0.indexOf('D', 1);
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1074, 1074);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.stringVal();
      assertTrue(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u001A', char0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, (-994));
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("JVz-M8ds", 38);
      char[] charArray0 = new char[5];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertFalse(boolean0);
      assertEquals('J', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, (-994));
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.indexOf('|', 1);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 118, 118);
      char char0 = jSONReaderScanner0.charAt(118);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 59);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 118, 118);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" [M*YMuFCQ<!dA", (-2445));
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-2855), charArray0, (-2855), (-2445));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, (-994));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-2717), 1673);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 70);
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
  public void test16()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 854);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[5];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-943));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 634);
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
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      char[] charArray0 = jSONReaderScanner0.sub_chars(110, 110);
      assertEquals(110, charArray0.length);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 2);
      jSONReaderScanner0.scanFieldInt(charArray0);
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1074, 1074);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      int int0 = jSONReaderScanner0.intValue();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
      assertEquals((-48), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" [M*YMuFCQ<!dA", (-2445));
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(boolean0);
      assertEquals(' ', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", (-4563));
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
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("T:r'", 125);
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
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1074, 1074);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.numberString();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(";=vT");
      char[] charArray0 = jSONReaderScanner0.sub_chars(0, 0);
      assertEquals(';', jSONReaderScanner0.getCurrent());
      assertEquals(16384, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 2);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(2, (-720));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -720
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 118, 118);
      String string0 = jSONReaderScanner0.subString(118, 118);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 2);
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("", string0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2, 2);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.nextToken((-528));
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '7';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, (-994));
      assertEquals('7', jSONReaderScanner0.getCurrent());
      
      jSONReaderScanner0.scanNumber();
      int int0 = jSONReaderScanner0.indexOf('C', 1673);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1074, 1074);
      jSONReaderScanner0.matchField(charArray0);
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
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 70);
      jSONReaderScanner0.indexOf('B', 70);
      assertTrue(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.close();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" tc:z.V", 68);
      char char0 = 'B';
      jSONReaderScanner0.scanString('B');
      int int0 = 16384;
      int int1 = 45;
      SymbolTable symbolTable0 = new SymbolTable(45);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(65279, 1037, 16384, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Q<^W<cqWA6P3+$");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      assertEquals('Q', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1074, 1074);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(1074, charArray0, 1074, 2751);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Fx oJ]}&'L");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(3803, 3803, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      jSONReaderScanner0.bp = 65279;
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanIdent();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[0];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 1);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(1, (-1036));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1036
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }
}