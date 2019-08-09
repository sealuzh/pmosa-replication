/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 22:05:31 GMT 2019
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
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536);
      jSONReaderScanner0.bp = 65536;
      jSONReaderScanner0.nextIdent();
      assertNull(jSONReaderScanner0.stringDefaultValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("not match ");
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
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 5, 27);
      jSONReaderScanner0.sp = 5;
      String string0 = jSONReaderScanner0.numberString();
      assertNotNull(string0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableCircularReferenceDetect");
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("DisableCircularReferenceDetect", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84);
      jSONReaderScanner0.np = (-2);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.numberString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 36, 83);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-2040), 733);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 34, 34);
      jSONReaderScanner0.token = 34;
      jSONReaderScanner0.bytesValue();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84);
      int int0 = jSONReaderScanner0.scanType("k1yIT.z)c$");
      //  // Unstable assertion: assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      //  // Unstable assertion: assertTrue(jSONReaderScanner0.isEOF());
      //  // Unstable assertion: assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 36, 83);
      jSONReaderScanner0.scanFieldBigInteger(charArray0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.scanIdent();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[1] = 'C';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 856, 6);
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf('C', 1);
      assertEquals(1, jSONReaderScanner0.pos());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 'N', 'N');
      String string0 = jSONReaderScanner0.subString(16382, 0);
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 36, 83);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.stringVal();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84);
      String string0 = jSONReaderScanner0.stringVal();
      assertEquals("", string0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("1f3~j;x2-,Y$`3bh");
      jSONReaderScanner0.nextIdent();
      char char0 = jSONReaderScanner0.next();
      assertEquals(2, jSONReaderScanner0.token());
      assertEquals('3', char0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" e1*H[jp\"!`mvG");
      assertEquals(' ', jSONReaderScanner0.getCurrent());
      
      char char0 = jSONReaderScanner0.next();
      assertEquals('e', char0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableCircularReferenceDetect");
      jSONReaderScanner0.nextIdent();
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 9996);
      boolean boolean0 = jSONReaderScanner0.isEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'g';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 22);
      int int0 = jSONReaderScanner0.indexOf('g', 0);
      assertEquals('g', jSONReaderScanner0.getCurrent());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[2] = '6';
      charArray0[3] = 'E';
      charArray0[4] = '6';
      charArray0[5] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 15);
      jSONReaderScanner0.nextIdent();
      assertEquals(2, jSONReaderScanner0.pos());
      
      jSONReaderScanner0.decimalValue();
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!`W8PB[@Y#");
      char char0 = jSONReaderScanner0.charAt(2);
      assertEquals('!', jSONReaderScanner0.getCurrent());
      assertEquals('W', char0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84);
      jSONReaderScanner0.matchField(charArray0);
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray0);
      assertEquals(20, jSONReaderScanner0.token());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '6';
      charArray0[1] = 'E';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536);
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.bytesValue();
      assertEquals(3, jSONReaderScanner0.token());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 99999, 99999);
      SymbolTable symbolTable0 = new SymbolTable(3);
      String string0 = jSONReaderScanner0.addSymbol(3, 0, 3855, symbolTable0);
      assertEquals("", string0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[4];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 76);
      jSONReaderScanner0.subString(0, 2135);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!`W8PB[@Y#");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString((-1), 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 944);
      int int0 = jSONReaderScanner0.indexOf('T', 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      int int0 = jSONReaderScanner0.indexOf('6', 3);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 62);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.indexOf('A', (-1864));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1864
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536);
      jSONReaderScanner0.copyTo(0, 0, charArray0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536);
      char char0 = jSONReaderScanner0.charAt(0);
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 9, 9);
      char[] charArray1 = new char[0];
      boolean boolean0 = jSONReaderScanner0.charArrayCompare(charArray1);
      assertTrue(boolean0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(27, charArray0, 27, 992);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84);
      jSONReaderScanner0.arrayCopy(84, charArray0, 0, 0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 36);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(66, charArray0, 76, (-1582));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1321, 1321);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy((-1390), charArray0, (-1390), (-2310));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 51, 65536);
      SymbolTable symbolTable0 = new SymbolTable(34);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(4377, 65536, 0, symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 856, 6);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol(856, 0, (-367), (SymbolTable) null);
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
      SymbolTable symbolTable0 = new SymbolTable('\u0084');
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 54);
      String string0 = jSONReaderScanner0.addSymbol(0, 54, 9991, symbolTable0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0, 311);
      SymbolTable symbolTable0 = new SymbolTable(311);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.addSymbol((-10), (-399), (-399), symbolTable0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65492);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars(65492, 34);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65279, 65279);
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(65279, 76);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 9996);
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
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 15);
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
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 15);
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
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[10];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0084');
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
  public void test45()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("create asm deserializer error, ", 2);
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
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 124);
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
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 4567);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo((-966), 25, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
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
  public void test49()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L.u*ptmjK", (-563));
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
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '6';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536);
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.close();
      // Undeclared exception!
      try { 
        jSONReaderScanner0.bytesValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 5, 27);
      jSONReaderScanner0.sp = 5;
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
  public void test52()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("L.u*ptmjK", (-563));
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, (char[]) null, 1254, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, (-916), (-916));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-3332), (-3332));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((char[]) null, 64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[9];
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(charArray0, (-1044));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.CharArrayReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((String) null, 26);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
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
  public void test59()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner(pipedReader0, 3434);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = null;
      try {
        jSONReaderScanner0 = new JSONReaderScanner((Reader) null, 125);
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
  public void test62()  throws Throwable  {
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
  public void test63()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("", 62);
      char char0 = jSONReaderScanner0.next();
      assertEquals('\u001A', char0);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1321, 1321);
      char[] charArray1 = jSONReaderScanner0.sub_chars(0, 47);
      Class<Object> class0 = Object.class;
      jSONReaderScanner0.scanFieldStringArray(charArray1, class0);
      // Undeclared exception!
      try { 
        jSONReaderScanner0.charAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 36, 83);
      assertFalse(jSONReaderScanner0.isEOF());
      
      jSONReaderScanner0.scanIdent();
      jSONReaderScanner0.charAt(88);
      assertEquals('\u001A', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(" e1*H[jp\"!`mvG");
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertEquals(' ', jSONReaderScanner0.getCurrent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 65536);
      boolean boolean0 = jSONReaderScanner0.isBlankInput();
      assertFalse(jSONReaderScanner0.isEOF());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      char[] charArray0 = new char[7];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 15);
      jSONReaderScanner0.charArrayCompare(charArray0);
      jSONReaderScanner0.scanFieldDate(charArray0);
      jSONReaderScanner0.close();
      assertEquals((-1), jSONReaderScanner0.matchStat);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 'D', 'D');
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
  public void test70()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'F';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84, 84);
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
  public void test71()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("1B5lc");
      jSONReaderScanner0.nextIdent();
      BigDecimal bigDecimal0 = jSONReaderScanner0.decimalValue();
      assertEquals((short)1, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'F';
      charArray0[2] = 'S';
      charArray0[3] = 'T';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 116, (-2041));
      jSONReaderScanner0.nextToken();
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
  public void test73()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
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
  public void test74()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = 'D';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 'D', 'D');
      jSONReaderScanner0.nextIdent();
      jSONReaderScanner0.numberString();
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'F';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84, 84);
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      char[] charArray0 = new char[14];
      charArray0[0] = 'S';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 'S', 'S');
      jSONReaderScanner0.nextIdent();
      assertEquals(18, jSONReaderScanner0.token());
      
      String string0 = jSONReaderScanner0.numberString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 84);
      char[] charArray1 = jSONReaderScanner0.sub_chars(0, 0);
      assertEquals(16384, charArray1.length);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("sA");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.sub_chars((-4662), (-4662));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -4662
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[2];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 'E', 'E');
      char[] charArray1 = jSONReaderScanner0.sub_chars(3, 0);
      assertEquals(0, charArray1.length);
      assertFalse(jSONReaderScanner0.isEOF());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      // Undeclared exception!
      try { 
        jSONReaderScanner0.subString(76, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableCircularReferenceDetect");
      jSONReaderScanner0.nextIdent();
      int int0 = jSONReaderScanner0.indexOf('!', 3);
      assertEquals(18, jSONReaderScanner0.token());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      char[] charArray0 = new char[15];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 36, 83);
      jSONReaderScanner0.scanIdent();
      char char0 = jSONReaderScanner0.charAt(67);
      assertEquals('\u0000', jSONReaderScanner0.getCurrent());
      assertTrue(jSONReaderScanner0.isEOF());
      assertEquals('\u001A', char0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      StringReader stringReader0 = new StringReader("S|5");
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(stringReader0);
      assertEquals('S', jSONReaderScanner0.getCurrent());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("!`W8PB[@Y#");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.arrayCopy(0, charArray0, (-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("DisableCircularReferenceDetect");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        jSONReaderScanner0.copyTo(26, (-3381), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
