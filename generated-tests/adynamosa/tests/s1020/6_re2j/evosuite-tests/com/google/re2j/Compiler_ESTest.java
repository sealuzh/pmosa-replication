/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 06:18:55 GMT 2019
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
      regexp0.equals(regexp_Op0);
      int[] intArray0 = new int[9];
      intArray0[0] = 441;
      intArray0[1] = (-1997);
      intArray0[2] = (-407);
      intArray0[3] = 8;
      intArray0[4] = 0;
      intArray0[5] = 43274;
      intArray0[6] = 3862;
      intArray0[7] = 139;
      intArray0[8] = (-699);
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = null;
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
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      int[] intArray0 = new int[8];
      intArray0[0] = (-361);
      intArray0[1] = (-2482);
      intArray0[2] = 682;
      regexp0.flags = 566;
      intArray0[3] = 682;
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp0.op = regexp_Op1;
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexp0.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp2);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-361);
      intArray0[1] = (-2482);
      regexp0.flags = 682;
      intArray0[0] = 682;
      intArray0[3] = (-114);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      intArray0[2] = 341;
      regexp0.cap = 682;
      intArray0[5] = 4;
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp0.op = regexp_Op1;
      intArray0[6] = (-1087);
      intArray0[7] = (-114);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp3);
      Regexp.Op regexp_Op2 = Regexp.Op.STAR;
      Regexp regexp4 = new Regexp(regexp0.op);
      Regexp regexp5 = new Regexp(regexp0);
      Regexp regexp6 = new Regexp(regexp_Op2);
      regexp1.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-361);
      intArray0[1] = (-2482);
      intArray0[2] = 682;
      intArray0[3] = (-114);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp0.op = regexp_Op1;
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      intArray0[4] = 341;
      regexp0.cap = 682;
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp regexp3 = new Regexp(regexp0);
      Regexp regexp4 = new Regexp(regexp0);
      Regexp regexp5 = new Regexp(regexp_Op2);
      Regexp regexp6 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp6);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp3);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp4);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      regexp1.op = regexp_Op1;
      Regexp regexp2 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Regexp regexp3 = new Regexp(regexp_Op0);
      regexp3.min = 3133;
      Regexp regexp4 = new Regexp(regexp3);
      Regexp.Op regexp_Op2 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp5 = new Regexp(regexp_Op2);
      Compiler.compileRegexp(regexp5);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Prog prog1 = Compiler.compileRegexp(regexp5);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-361);
      intArray0[1] = (-2482);
      intArray0[2] = 682;
      intArray0[3] = (-114);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      intArray0[4] = 341;
      regexp0.cap = 682;
      intArray0[5] = 4;
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp0.op = regexp_Op1;
      intArray0[6] = (-1087);
      intArray0[7] = (-1);
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      int[] intArray0 = new int[5];
      intArray0[0] = 1114111;
      intArray0[1] = 6;
      intArray0[2] = 1126;
      intArray0[3] = 3170;
      regexp0.cap = (-502);
      intArray0[4] = 597;
      regexp0.runes = intArray0;
      Regexp.Op regexp_Op2 = Regexp.Op.CHAR_CLASS;
      regexp0.op = regexp_Op2;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-361);
      intArray0[1] = (-2482);
      intArray0[2] = 682;
      intArray0[3] = (-114);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      intArray0[4] = 341;
      regexp0.cap = 682;
      intArray0[5] = 4;
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.op = regexp_Op1;
      intArray0[6] = (-1087);
      intArray0[7] = (-1);
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      regexp0.toString();
      regexp0.toString();
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.flags = (-2351);
      Compiler.compileRegexp(regexp0);
      regexp0.cap = (-2351);
      regexp0.toString();
      regexp0.cap = 5;
      regexp0.name = ">";
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      regexp0.max = 5;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = null;
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
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp2 = new Regexp(regexp0);
      Object object0 = new Object();
      regexp0.equals(regexp2);
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      regexp0.equals(prog1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog2 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog2, prog0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      int[] intArray0 = new int[7];
      regexp0.cap = 1930;
      intArray0[0] = 1930;
      intArray0[1] = (-121);
      intArray0[3] = (-2737);
      intArray0[4] = 110593;
      intArray0[5] = 1524;
      intArray0[6] = 685;
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      Compiler.compileRegexp(regexp1);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      regexp0.equals(prog0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
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
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
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
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.op = regexp_Op0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Compiler.compileRegexp(regexp2);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
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
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.toString();
      regexp0.cap = (-4568);
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op2 = Regexp.Op.LITERAL;
      regexp0.op = regexp_Op2;
      regexpArray0[3] = regexp2;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.min = 16;
      Regexp regexp3 = new Regexp(regexp0);
      int[] intArray0 = new int[1];
      intArray0[0] = (-4568);
      regexp3.runes = intArray0;
      Compiler.compileRegexp(regexp3);
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
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      regexp0.cap = 1930;
      intArray0[0] = 1930;
      intArray0[1] = (-121);
      intArray0[3] = (-2737);
      intArray0[4] = 110593;
      intArray0[5] = 1524;
      intArray0[6] = 685;
      regexp0.runes = intArray0;
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexp0.toString();
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp0;
      regexp1.flags = 0;
      regexp1.subs = regexpArray0;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      regexp1.equals(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp2.subs = regexp1.subs;
      regexp2.name = "";
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp regexp3 = new Regexp(regexp_Op1);
      Prog prog1 = Compiler.compileRegexp(regexp3);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 1907;
      regexp0.toString();
      regexp0.reinit();
      regexp0.op = regexp_Op0;
      regexp0.min = 426;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      regexp0.flags = 0;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      regexp0.equals(prog0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[9];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexpArray0[8] = regexp0;
      regexp0.subs = regexpArray0;
      Prog prog1 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog2 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog2, prog1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = (-1026);
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
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[7];
      intArray0[0] = (-3462);
      intArray0[1] = 0;
      regexp1.name = "Uugse";
      intArray0[2] = 0;
      regexp1.equals(regexp0);
      intArray0[3] = (-1180);
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[2] = regexp2;
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexp1.subs = regexpArray0;
      intArray0[4] = 7;
      intArray0[5] = 1015;
      intArray0[6] = 14;
      regexp1.runes = intArray0;
      Compiler.compileRegexp(regexp1);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
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
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 0;
      regexp0.toString();
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 2951;
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexp0.name = null;
      Regexp regexp2 = new Regexp(regexp1);
      regexpArray0[3] = regexp2;
      regexpArray0[4] = regexp1;
      Object object0 = new Object();
      regexp1.equals(object0);
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp1.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      regexp2.subs = regexpArray0;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int int0 = 0;
      regexp1.max = 0;
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
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
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
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
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
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      regexp0.cap = (-493);
      intArray0[0] = (-415);
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexp0.max = 0;
      regexp0.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 1486;
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.cap = 1486;
      regexp1.toString();
      regexp1.toString();
      regexp1.reinit();
      regexp1.max = (-650);
      regexp1.cap = (-650);
      regexp1.cap = 1486;
      regexp1.toString();
      Prog prog0 = Compiler.compileRegexp(regexp1);
      regexp0.subs = null;
      Regexp regexp2 = new Regexp(regexp0);
      Object object0 = new Object();
      regexp1.equals(object0);
      Compiler.compileRegexp(regexp2);
      regexp0.subs = null;
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp2);
      regexp0.toString();
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Prog prog1 = Compiler.compileRegexp(regexp2);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.toString();
      regexp0.reinit();
      regexp0.equals("com.google.re2j.Compiler");
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Compiler.compileRegexp(regexp1);
      regexp1.op = regexp_Op0;
      Compiler.compileRegexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[9];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexpArray0[8] = regexp1;
      regexp1.subs = regexpArray0;
      regexp1.name = "";
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      intArray0[0] = 1930;
      intArray0[1] = (-121);
      intArray0[2] = 0;
      intArray0[3] = (-2737);
      intArray0[4] = 110593;
      intArray0[5] = 1524;
      intArray0[6] = 685;
      regexp0.runes = intArray0;
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
}
