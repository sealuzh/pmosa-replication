/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:34:32 GMT 2019
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
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp0.op = regexp_Op1;
      regexp0.reinit();
      regexp0.max = 5;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op1;
      regexp0.op = regexp1.op;
      Regexp regexp2 = Simplify.simplify(regexp0);
      assertNotSame(regexp2, regexp1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Simplify.simplify((Regexp) null);
      assertNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp[] regexpArray0 = new Regexp[6];
      regexp2.max = (-335);
      regexp2.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op1;
      Regexp regexp3 = Simplify.simplify(regexp2);
      assertNotSame(regexp3, regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.min = 32;
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp[] regexpArray0 = new Regexp[6];
      regexp2.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op1;
      Regexp regexp3 = Simplify.simplify(regexp1);
      assertNotSame(regexp3, regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op1;
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.min = (-335);
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
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp0;
      regexp2.max = 15;
      regexp2.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op1;
      Regexp regexp3 = Simplify.simplify(regexp1);
      regexp0.op = regexp1.op;
      Regexp regexp4 = Simplify.simplify(regexp3);
      assertNotSame(regexp4, regexp3);
      assertFalse(regexp4.equals((Object)regexp3));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertNotNull(regexp2);
      
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp0;
      regexp2.max = 15;
      regexp2.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      regexp1.op = regexp_Op1;
      Regexp regexp3 = Simplify.simplify(regexp1);
      Regexp regexp4 = Simplify.simplify(regexp3);
      Regexp[] regexpArray1 = new Regexp[2];
      regexpArray1[0] = regexp2;
      regexp4.subs = regexpArray1;
      Regexp regexp5 = Simplify.simplify(regexp3);
      assertSame(regexp3, regexp4);
      assertNotSame(regexp5, regexp4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
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
  public void test09()  throws Throwable  {
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
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[3];
      regexp1.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertNotNull(regexp2);
      assertSame(regexp2, regexp1);
  }
}
