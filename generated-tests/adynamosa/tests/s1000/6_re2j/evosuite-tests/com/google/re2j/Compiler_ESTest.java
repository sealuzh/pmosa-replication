/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 21 20:14:12 GMT 2019
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
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.op = regexp_Op1;
      regexp0.reinit();
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
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
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
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_LINE;
      regexp0.op = regexp_Op1;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      regexp1.op = regexp_Op1;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      int[] intArray0 = new int[7];
      intArray0[0] = 87;
      regexp1.flags = 2221;
      regexp1.runes = intArray0;
      regexp1.op = regexp_Op1;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexp1.flags = (-1692);
      regexp1.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 9;
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
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      regexp0.op = regexp_Op1;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      regexp1.op = regexp_Op1;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
}
