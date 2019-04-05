/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 19:12:22 GMT 2019
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
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp2);
      Regexp regexp4 = Simplify.simplify(regexp3);
      Regexp regexp5 = Simplify.simplify(regexp2);
      Regexp regexp6 = Simplify.simplify(regexp5);
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp4;
      Regexp regexp7 = Simplify.simplify(regexp4);
      regexpArray0[1] = regexp7;
      regexpArray0[2] = regexp2;
      regexpArray0[3] = regexp3;
      regexpArray0[4] = regexp6;
      regexpArray0[5] = regexp5;
      regexpArray0[6] = regexp1;
      regexp3.subs = regexpArray0;
      Simplify.simplify(regexp1);
      Regexp regexp8 = new Regexp(regexp6);
      Regexp regexp9 = Simplify.simplify(regexp8);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      regexp9.op = regexp_Op1;
      regexp8.cap = 36;
      Regexp.Op regexp_Op2 = Regexp.Op.PLUS;
      regexp9.op = regexp_Op2;
      Regexp regexp10 = Simplify.simplify(regexp9);
      regexp1.cap = 36;
      Simplify.simplify(regexp10);
      Simplify.simplify(regexp5);
      Simplify.simplify(regexp3);
      Regexp regexp11 = new Regexp(regexp8);
      Regexp regexp12 = Simplify.simplify(regexp11);
      assertSame(regexp11, regexp12);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 1895;
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp3);
      Regexp regexp4 = Simplify.simplify(regexp2);
      Regexp regexp5 = Simplify.simplify(regexp4);
      Simplify.simplify(regexp1);
      Regexp regexp6 = new Regexp(regexp5);
      Regexp regexp7 = Simplify.simplify(regexp6);
      int int0 = 36;
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      regexp7.op = regexp_Op1;
      regexp6.cap = 36;
      Regexp.Op regexp_Op2 = Regexp.Op.PLUS;
      regexp7.op = regexp_Op2;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 189;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 189;
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.toString();
      regexp2.flags = 189;
      regexp2.min = 189;
      Simplify.simplify(regexp2);
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp2.op = regexp_Op1;
      Simplify.simplify(regexp0);
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
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
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
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp2);
      regexp0.name = null;
      regexp3.equals(regexp0);
      Regexp regexp4 = Simplify.simplify(regexp3);
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp4);
      Regexp regexp5 = Simplify.simplify(regexp3);
      assertNotSame(regexp5, regexp1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp_Op0);
      regexp0.flags = 7;
      Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
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
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      regexp0.flags = (-8);
      regexp0.op = regexp_Op1;
      regexp1.name = "";
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp2;
      regexp0.name = "";
      regexpArray0[1] = regexp2;
      regexp2.toString();
      regexpArray0[2] = regexp2;
      regexp1.subs = regexpArray0;
      Regexp regexp3 = Simplify.simplify(regexp2);
      Object object0 = new Object();
      regexp3.equals(object0);
      regexp1.max = 860;
      Regexp regexp4 = Simplify.simplify(regexp3);
      regexp3.flags = 860;
      Regexp regexp5 = Simplify.simplify(regexp1);
      regexp4.reinit();
      Regexp regexp6 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp4);
      regexp2.min = 860;
      regexp0.toString();
      regexp6.flags = 5;
      Simplify.simplify(regexp2);
      Regexp regexp7 = Simplify.simplify(regexp6);
      Simplify.simplify(regexp4);
      Regexp regexp8 = Simplify.simplify(regexp4);
      assertSame(regexp8, regexp7);
      assertNotSame(regexp8, regexp5);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 32;
      regexp0.name = "com.google.re2j.Simplify$1";
      regexp0.reinit();
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertSame(regexp1, regexp0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp2.flags = 856;
      Simplify.simplify(regexp2);
      Regexp regexp3 = Simplify.simplify((Regexp) null);
      assertNull(regexp3);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.name = "oAPW_pexHAd~Z@";
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp2;
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      regexp2.op = regexp_Op1;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp2;
      regexp2.subs = regexpArray0;
      regexp0.max = 4;
      regexp2.name = null;
      regexp0.max = 895;
      regexp1.cap = 3;
      regexp0.flags = 5;
      regexp1.cap = 826;
      Regexp regexp3 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp1);
      Regexp regexp4 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp4);
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp4);
      Regexp.Op regexp_Op2 = Regexp.Op.END_LINE;
      regexp3.op = regexp_Op2;
      Regexp regexp5 = Simplify.simplify(regexp1);
      Simplify.simplify(regexp3);
      Simplify.simplify(regexp0);
      Regexp regexp6 = Simplify.simplify(regexp2);
      assertSame(regexp6, regexp5);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      intArray0[0] = 32;
      regexp0.reinit();
      intArray0[1] = 4;
      intArray0[2] = 1718;
      intArray0[3] = (-304);
      intArray0[4] = 3;
      intArray0[5] = 893;
      intArray0[6] = (-705);
      regexp0.runes = intArray0;
      regexp0.cap = 5;
      Simplify.simplify(regexp0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_LINE;
      regexp2.op = regexp_Op1;
      regexp2.max = 2;
      Regexp regexp3 = Simplify.simplify(regexp2);
      regexp3.reinit();
      Regexp regexp4 = Simplify.simplify(regexp3);
      Regexp regexp5 = Simplify.simplify(regexp4);
      regexp5.toString();
      Regexp regexp6 = Simplify.simplify(regexp5);
      assertSame(regexp6, regexp1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp0.min = 826;
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexp1.subs = regexpArray0;
      regexp1.min = 826;
      Regexp regexp2 = new Regexp(regexp1);
      Regexp[] regexpArray1 = new Regexp[1];
      regexpArray1[0] = regexp0;
      regexp1.subs = regexpArray1;
      Regexp regexp3 = Simplify.simplify(regexp2);
      Simplify.simplify(regexp3);
      Regexp regexp4 = Simplify.simplify(regexp0);
      Simplify.simplify((Regexp) null);
      Regexp regexp5 = new Regexp(regexp0);
      int[] intArray0 = new int[8];
      intArray0[0] = 826;
      intArray0[1] = 826;
      intArray0[2] = 826;
      intArray0[3] = 826;
      intArray0[4] = 826;
      intArray0[5] = 826;
      intArray0[6] = 826;
      intArray0[7] = 826;
      regexp4.runes = intArray0;
      Regexp regexp6 = Simplify.simplify(regexp5);
      Regexp regexp7 = Simplify.simplify(regexp4);
      assertNotSame(regexp7, regexp6);
  }
}