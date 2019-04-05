/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:52:34 GMT 2019
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
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      regexp0.min = (-14);
      Regexp regexp2 = Simplify.simplify(regexp0);
      Regexp[] regexpArray1 = new Regexp[6];
      regexpArray1[0] = regexp0;
      regexp2.subs = regexpArray1;
      regexp2.flags = (-14);
      Regexp regexp3 = Simplify.simplify(regexp2);
      assertNotSame(regexp3, regexp2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      regexp0.min = (-14);
      Regexp regexp2 = Simplify.simplify(regexp0);
      Regexp[] regexpArray1 = new Regexp[6];
      regexpArray1[0] = regexp0;
      regexp2.subs = regexpArray1;
      Regexp regexp3 = Simplify.simplify(regexp2);
      assertNotSame(regexp3, regexp2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      regexp0.max = (-3);
      regexp0.subs = regexpArray0;
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertNotSame(regexp1, regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp0.max = 946;
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      regexp0.min = 13;
      Regexp regexp2 = Simplify.simplify(regexp0);
      assertNotSame(regexp2, regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 6;
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
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.min = 13;
      Regexp regexp2 = Simplify.simplify(regexp0);
      regexp2.subs = regexp0.subs;
      Regexp regexp3 = Simplify.simplify(regexp2);
      assertFalse(regexp3.equals((Object)regexp0));
      assertNotSame(regexp3, regexp2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
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
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      regexp0.min = (-14);
      Regexp regexp2 = Simplify.simplify(regexp0);
      Regexp regexp3 = Simplify.simplify(regexp2);
      assertSame(regexp3, regexp2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
  public void test11()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[9];
      Regexp regexp0 = Simplify.simplify(regexpArray0[4]);
      assertNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertSame(regexp1, regexp2);
  }
}