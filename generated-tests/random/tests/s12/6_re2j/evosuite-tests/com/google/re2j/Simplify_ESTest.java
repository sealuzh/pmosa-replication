/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:43:27 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Regexp;
import com.google.re2j.Simplify;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Simplify_ESTest extends Simplify_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp3);
      Simplify.simplify(regexp4);
      regexp3.op = regexp_Op0;
      Regexp regexp5 = Simplify.simplify(regexp3);
      Simplify.simplify(regexp5);
      regexp1.max = 2;
      Regexp regexp6 = Simplify.simplify(regexp1);
      Simplify.simplify(regexp2);
      Regexp regexp7 = Simplify.simplify(regexp1);
      Regexp regexp8 = Simplify.simplify(regexp6);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      regexp8.op = regexp_Op1;
      Simplify.simplify(regexp8);
      regexp4.min = 8257;
      regexp6.min = (-3203);
      Regexp regexp9 = Simplify.simplify(regexp4);
      Simplify.simplify(regexp6);
      Regexp regexp10 = Simplify.simplify(regexp7);
      Simplify.simplify(regexp7);
      Simplify.simplify(regexp10);
      regexp9.cap = 2;
      Simplify.simplify(regexp6);
      Simplify.simplify(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op2;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp1.reinit();
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      regexp0.name = "^\u0004qS";
      regexp0.op = regexp_Op1;
      regexp1.op = regexp_Op0;
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp0;
      regexp1.toString();
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexpArray0[6] = regexp1;
      regexp0.subs = regexpArray0;
      Simplify.simplify(regexp1);
      regexp1.flags = 102;
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.name = "7A%4e#L-^I41W\"CB<f";
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp2);
      Regexp.Op regexp_Op2 = Regexp.Op.REPEAT;
      Regexp regexp3 = new Regexp(regexp_Op2);
      regexp3.max = (-1781);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp0.op = regexp_Op1;
      regexp0.op = regexp_Op1;
      regexp0.max = 2667;
      regexp0.max = 1265;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int int0 = (-1103);
      regexp0.flags = (-1103);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = (-822);
      regexp0.name = "VJ2u1qWtn";
      regexp0.cap = (-3060);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Simplify.simplify((Regexp) null);
      Simplify.simplify((Regexp) null);
      Simplify.simplify((Regexp) null);
      Simplify.simplify((Regexp) null);
      Simplify.simplify((Regexp) null);
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Simplify.simplify(regexp0);
      Simplify.simplify((Regexp) null);
      Regexp regexp1 = Simplify.simplify((Regexp) null);
      assertNull(regexp1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp1;
      regexp0.subs = regexpArray0;
      regexp1.cap = (-3363);
      regexp1.cap = 8;
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.name = "SxDk?ef6}K?C/O.";
      Simplify.simplify(regexp2);
      Simplify.simplify(regexp1);
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp regexp4 = Simplify.simplify(regexp3);
      Regexp regexp5 = Simplify.simplify(regexp4);
      assertSame(regexp4, regexp5);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.max = 449;
      Regexp regexp3 = Simplify.simplify(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp3);
      Simplify.simplify(regexp4);
      Regexp regexp5 = Simplify.simplify(regexp4);
      Regexp regexp6 = Simplify.simplify(regexp4);
      regexp1.cap = 3512;
      Regexp regexp7 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp7);
      Regexp regexp8 = Simplify.simplify(regexp2);
      regexp8.cap = (-2237);
      regexp7.op = regexp_Op0;
      Simplify.simplify(regexp8);
      Simplify.simplify(regexp7);
      Regexp regexp9 = new Regexp(regexp_Op0);
      Simplify.simplify(regexp9);
      Regexp regexp10 = Simplify.simplify(regexp6);
      Regexp regexp11 = Simplify.simplify(regexp10);
      assertSame(regexp11, regexp5);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.cap = 7;
      regexp1.name = "";
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp regexp3 = Simplify.simplify(regexp2);
      regexp1.equals(regexp3);
      Regexp regexp4 = Simplify.simplify(regexp1);
      assertFalse(regexp4.equals((Object)regexp2));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.cap = 5;
      regexp0.name = "\\";
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      regexp1.op = regexp_Op1;
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp1);
      regexp0.max = 5;
      Regexp regexp4 = new Regexp(regexp0);
      Regexp regexp5 = Simplify.simplify(regexp4);
      regexp2.max = 5;
      Regexp regexp6 = Simplify.simplify(regexp5);
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      regexp5.op = regexp_Op2;
      Regexp regexp7 = Simplify.simplify(regexp2);
      regexp4.cap = 5;
      Simplify.simplify(regexp0);
      regexp4.subs = regexpArray0;
      regexp2.flags = 5;
      regexp0.cap = 3150;
      Simplify.simplify(regexp2);
      Simplify.simplify(regexp5);
      Regexp regexp8 = Simplify.simplify(regexp0);
      Regexp regexp9 = Simplify.simplify(regexp7);
      Regexp regexp10 = Simplify.simplify(regexp3);
      Simplify.simplify(regexp6);
      Simplify.simplify(regexp0);
      Simplify.simplify(regexp5);
      Simplify.simplify(regexp6);
      Simplify.simplify(regexp8);
      Regexp regexp11 = Simplify.simplify(regexp10);
      assertSame(regexp11, regexp9);
  }
}
