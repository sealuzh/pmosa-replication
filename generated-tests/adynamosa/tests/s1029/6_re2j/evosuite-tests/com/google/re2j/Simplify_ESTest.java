/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 21:42:11 GMT 2019
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
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      int[] intArray0 = new int[1];
      regexp1.runes = intArray0;
      regexpArray0[0] = regexp0;
      regexp1.min = 2250;
      regexpArray0[1] = regexp1;
      regexp1.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.subs = regexp1.subs;
      Regexp regexp3 = new Regexp(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp2);
      regexp0.op = regexp_Op0;
      regexp1.max = (-1);
      Regexp regexp5 = new Regexp(regexp_Op0);
      Regexp regexp6 = Simplify.simplify(regexp5);
      Regexp regexp7 = Simplify.simplify(regexp1);
      Regexp regexp8 = Simplify.simplify(regexp2);
      assertTrue(regexp8.equals((Object)regexp4));
      
      Regexp regexp9 = Simplify.simplify(regexp7);
      Simplify.simplify(regexp9);
      Simplify.simplify(regexp6);
      Regexp regexp10 = new Regexp(regexp3);
      Regexp regexp11 = Simplify.simplify(regexp10);
      assertNotSame(regexp11, regexp10);
      
      Regexp regexp12 = Simplify.simplify(regexp9);
      assertSame(regexp12, regexp7);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      int[] intArray0 = new int[1];
      regexp1.runes = intArray0;
      regexpArray0[0] = regexp0;
      regexp1.min = 2250;
      regexpArray0[1] = regexp1;
      regexp1.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.subs = regexp1.subs;
      Regexp regexp3 = new Regexp(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp1);
      Regexp regexp5 = Simplify.simplify(regexp3);
      assertNotSame(regexp2, regexp4);
      assertNotSame(regexp3, regexp5);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = (-3614);
      int[] intArray0 = new int[6];
      regexp1.runes = intArray0;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      int[] intArray0 = new int[1];
      regexp1.runes = intArray0;
      regexpArray0[0] = regexp0;
      regexp1.min = 2250;
      regexpArray0[1] = regexp1;
      regexp1.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = new Regexp(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp2);
      regexp4.flags = 2250;
      Regexp regexp5 = new Regexp(regexp1);
      Regexp regexp6 = Simplify.simplify(regexp4);
      assertSame(regexp6, regexp2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      int[] intArray0 = new int[1];
      regexp1.runes = intArray0;
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexp1.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = new Regexp(regexp0);
      Regexp regexp4 = Simplify.simplify(regexp2);
      Regexp regexp5 = Simplify.simplify(regexp1);
      regexp0.min = (-1204);
      Regexp regexp6 = new Regexp(regexp0);
      Simplify.simplify(regexp4);
      Simplify.simplify(regexp1);
      Regexp regexp7 = new Regexp(regexp0);
      Regexp[] regexpArray1 = new Regexp[2];
      regexpArray1[0] = regexp3;
      regexpArray1[1] = regexp1;
      regexp7.subs = regexpArray1;
      Simplify.simplify(regexp1);
      Regexp regexp8 = Simplify.simplify(regexp7);
      assertFalse(regexp8.equals((Object)regexp5));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = (-10);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertSame(regexp0, regexp1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp0);
      Regexp regexp4 = new Regexp(regexp_Op0);
      Regexp regexp5 = Simplify.simplify(regexp4);
      regexp4.min = 1304;
      regexp0.subs = null;
      Simplify.simplify((Regexp) null);
      Simplify.simplify(regexp2);
      Simplify.simplify((Regexp) null);
      Regexp regexp6 = Simplify.simplify(regexp5);
      Regexp regexp7 = Simplify.simplify(regexp4);
      Regexp[] regexpArray0 = new Regexp[9];
      regexpArray0[0] = regexp2;
      regexpArray0[1] = regexp3;
      regexpArray0[2] = null;
      regexpArray0[3] = regexp6;
      regexpArray0[4] = regexp5;
      regexpArray0[5] = regexp3;
      regexpArray0[6] = regexp6;
      regexp6.op = regexp_Op0;
      regexpArray0[7] = null;
      regexpArray0[8] = regexp7;
      regexp7.subs = regexpArray0;
      Simplify.simplify(regexp7);
      Simplify.simplify((Regexp) null);
      Regexp regexp8 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp8);
      Simplify.simplify(regexp3);
      Simplify.simplify(regexp4);
      Simplify.simplify(regexp4);
      Regexp regexp9 = Simplify.simplify(regexp0);
      assertSame(regexp9, regexp1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp1;
      regexp1.subs = regexpArray0;
      regexp1.min = 41;
      regexp1.equals(regexp0);
      int[] intArray0 = new int[4];
      intArray0[0] = 41;
      intArray0[1] = 41;
      intArray0[2] = 41;
      intArray0[3] = 0;
      regexp2.runes = intArray0;
      regexp1.max = 0;
      Simplify.simplify(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp0);
      Regexp regexp4 = Simplify.simplify(regexp3);
      regexp4.equals(regexp2);
      Simplify.simplify(regexp4);
      Simplify.simplify(regexp1);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp0.op = regexp_Op1;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 8;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      int[] intArray0 = new int[1];
      intArray0[0] = (-1472);
      regexp1.runes = intArray0;
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexp1.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp1);
      Simplify.simplify(regexp2);
      Regexp regexp3 = Simplify.simplify(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp1);
      regexp0.flags = 1114111;
      regexp4.max = (-1472);
      Simplify.simplify(regexp1);
      Regexp regexp5 = Simplify.simplify(regexp4);
      Regexp regexp6 = new Regexp(regexp0);
      regexp6.cap = (-1472);
      regexp0.cap = (-1472);
      Simplify.simplify(regexp6);
      Regexp regexp7 = Simplify.simplify(regexp4);
      Regexp regexp8 = Simplify.simplify(regexp0);
      regexp4.runes = intArray0;
      regexp8.toString();
      Simplify.simplify(regexp3);
      Simplify.simplify(regexp8);
      Regexp regexp9 = Simplify.simplify(regexp1);
      Simplify.simplify(regexp7);
      Simplify.simplify(regexp3);
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp10 = new Regexp(regexp_Op1);
      Simplify.simplify(regexp10);
      Simplify.simplify(regexp5);
      Simplify.simplify(regexp4);
      Regexp regexp11 = Simplify.simplify(regexp9);
      assertNotSame(regexp11, regexp5);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      regexp0.name = "/;3',TyJsCsJY{`lWJ7";
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp1;
      regexp1.subs = regexpArray0;
      Regexp regexp3 = Simplify.simplify(regexp1);
      assertSame(regexp0, regexp3);
  }
}
