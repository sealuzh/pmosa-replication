/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 11:03:59 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Compiler;
import com.google.re2j.Prog;
import com.google.re2j.Regexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Compiler_ESTest extends Compiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      int[] intArray0 = new int[2];
      intArray0[0] = 535;
      intArray0[1] = 1114111;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexp0.op = regexp_Op1;
      regexp0.equals(regexp_Op0);
      Object object0 = new Object();
      Regexp.Op regexp_Op2 = Regexp.Op.ALTERNATE;
      regexp0.reinit();
      Regexp.Op regexp_Op3 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op3;
      regexp0.min = 3642;
      regexp0.op = regexp_Op2;
      regexp0.equals(object0);
      regexp0.flags = 3642;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      Prog prog2 = Compiler.compileRegexp(regexp0);
      assertFalse(prog2.equals((Object)prog1));
      
      Compiler.compileRegexp(regexp0);
      Prog prog3 = Compiler.compileRegexp(regexp0);
      assertFalse(prog3.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op1;
      regexp1.toString();
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // regexp: unhandled case in compile
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[9];
      intArray0[0] = (-4973);
      intArray0[1] = (-1168);
      intArray0[2] = 0;
      intArray0[3] = 636;
      intArray0[4] = 5080;
      intArray0[5] = 99;
      intArray0[6] = 2295;
      intArray0[7] = 0;
      intArray0[8] = (-1620);
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      regexp0.min = 1598;
      regexp0.min = 1598;
      regexp0.op = regexp_Op0;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[6];
      intArray0[0] = 2522;
      intArray0[1] = 2522;
      intArray0[2] = 2522;
      intArray0[3] = 2522;
      intArray0[4] = 2522;
      intArray0[5] = 2522;
      regexp0.runes = intArray0;
      regexp0.min = 2522;
      regexp0.max = 2522;
      regexp0.min = 0;
      regexp0.max = 3296;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "UK:~:dwpPCcT?a:O";
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      regexp1.op = regexp_Op1;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.flags = (-2546);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[2];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp0.flags = 4457;
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 963;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp_Op0);
      regexp1.flags = 0;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexp1.subs = regexpArray0;
      regexp0.cap = 0;
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      regexp1.op = regexp_Op1;
      Compiler.compileRegexp(regexp1);
      Regexp regexp2 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp2);
      Regexp regexp3 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp3);
      Prog prog1 = Compiler.compileRegexp(regexp2);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      int[] intArray0 = new int[9];
      intArray0[0] = (-1894);
      regexp0.max = 13;
      intArray0[1] = 18;
      intArray0[2] = (-321);
      intArray0[3] = 3971;
      intArray0[4] = 15;
      intArray0[5] = (-1201);
      intArray0[6] = 11;
      intArray0[7] = 2886;
      intArray0[8] = (-1511);
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 8348;
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Object object0 = new Object();
      regexp0.equals(object0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      intArray0[0] = 0;
      intArray0[1] = 108;
      intArray0[2] = 108;
      intArray0[3] = 108;
      intArray0[4] = 108;
      intArray0[5] = 108;
      intArray0[6] = 108;
      regexp0.runes = intArray0;
      regexp0.max = 108;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      regexp0.cap = 0;
      intArray0[1] = 1975;
      intArray0[2] = (-2596);
      intArray0[3] = 5690;
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.op = regexp_Op0;
      regexp1.cap = 5690;
      regexp1.flags = 0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp2.equals(prog0);
      Compiler.compileRegexp(regexp2);
      Prog prog2 = Compiler.compileRegexp(regexp0);
      assertFalse(prog2.equals((Object)prog1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[2];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexp0.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexp0.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp[] regexpArray1 = new Regexp[2];
      Regexp.Op regexp_Op2 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexpArray1[0] = regexp2;
      regexp0.subs = regexpArray1;
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp2);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[3] = regexp2;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      regexp1.op = regexp_Op1;
      regexp0.max = (-571);
      regexp0.max = 0;
      regexp0.flags = (-1729);
      regexp0.reinit();
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // regexp: unhandled case in compile
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      intArray0[0] = 13;
      intArray0[1] = (-737);
      intArray0[2] = (-3693);
      intArray0[3] = 6977;
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexp0.op = regexp_Op1;
      regexp0.equals(regexp_Op0);
      Object object0 = new Object();
      regexp0.reinit();
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.max = 0;
      regexp0.cap = 0;
      regexp0.reinit();
      regexp0.flags = 477;
      regexp0.max = 102;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexp1.op = regexp_Op0;
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexpArray0[3] = regexp0;
      regexp1.subs = regexpArray0;
      regexp0.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      regexp0.op = regexp_Op1;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      regexp1.flags = 567;
      int[] intArray0 = new int[7];
      intArray0[0] = 270;
      regexp0.reinit();
      intArray0[1] = 567;
      intArray0[2] = (-573);
      intArray0[3] = 567;
      intArray0[4] = 6440;
      intArray0[5] = 567;
      intArray0[6] = 567;
      regexp1.toString();
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0.op);
      Prog prog0 = Compiler.compileRegexp(regexp2);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp regexp0 = null;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp((Regexp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.equals(regexp_Op1);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 0;
      regexp0.name = "c$";
      regexp0.min = 0;
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      regexp0.op = regexp_Op1;
      int[] intArray0 = new int[7];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      regexp0.flags = 0;
      intArray0[4] = 1280;
      intArray0[5] = 0;
      intArray0[6] = 0;
      regexp0.runes = intArray0;
      regexp0.max = 0;
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Compiler.compileRegexp(regexp1);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Prog prog1 = Compiler.compileRegexp(regexp2);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "";
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      regexp0.runes = intArray0;
      regexp1.toString();
      regexp0.min = (-1455);
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      regexp1.op = regexp_Op1;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp2);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[9];
      intArray0[0] = (-4973);
      intArray0[1] = (-1168);
      regexp0.equals(regexp_Op0);
      intArray0[2] = 0;
      regexp0.reinit();
      regexp0.equals("o%U9HnMT9/@?,v");
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 8348;
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp2.cap = 161;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }
}