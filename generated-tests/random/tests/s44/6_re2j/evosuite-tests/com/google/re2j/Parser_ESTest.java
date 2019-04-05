/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:29:59 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Parser;
import com.google.re2j.Regexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        Parser.parse("s(;'W~`y(3Z{%=", 43741);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `s(;'W~`y(3Z{%=`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = new Parser("", 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, (-1758), (-1758));
      assertEquals(0, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, 2576);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 116, 116);
      assertNotSame(regexpArray1, regexpArray0);
      assertEquals(0, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, (-2156), 4203);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 957, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse((String) null, (-2160));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 2521;
      String string0 = "\\p";
      // Undeclared exception!
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        Parser.parse("~neYC[X;-$SGSiuP;+", 1893);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `;-$`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      try { 
        Parser.parse("[:-", 413);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      try { 
        Parser.parse("[-", 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      try { 
        Parser.parse("6$}&Di]h+uHxE[-id9", 468);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-id9`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 40);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 2821);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        Parser.parse("]OJqm|=?[", 5);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 6433;
      String string0 = "\\p";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\p`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "\\x{";
      int int0 = 13;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\x{`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "\\1M6fq=";
      int int0 = 3269;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\1`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp regexp0 = Parser.parse("n(7)-]OLU`iyR", 1305);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp regexp0 = Parser.parse("p|.", 1269);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp regexp0 = Parser.parse("2|w|bqy", 1724);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp regexp0 = Parser.parse("r9Kod{05%}", 7376);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp regexp0 = Parser.parse("&|{9y2", 45);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("(?(PW3?F4Bm{", 761);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?s:.)", 177984);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      try { 
        Parser.parse("(?i:", (-448));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("cO(?)o|)~QKiC1Vy_x", 92);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      try { 
        Parser.parse("(?", 127569);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 3652);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("cS`%l;dV{61", (-1492));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp regexp0 = Parser.parse("iCFA.yd<N!tHry", 2653);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:it:]", 1724);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = "\\C";
      int int0 = 2404;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\C`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = "\\\"";
      int int0 = 348;
      Regexp regexp0 = Parser.parse(string0, int0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp regexp0 = Parser.parse("zvx.|<ma#", 805);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("wRx,2^,#zG", 348);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("M8-A>,+q|M}st0_aDx", 4);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|", 801);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|P4Of{F0LL$a", (-4448));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp regexp0 = Parser.parse("PX7f]RGfgR|>5Q`!*,", (-1291));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 40);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = "(?s:.)";
      int int0 = 1;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Parser.parse("*]5,@ S fdu },:", (-1135));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      try { 
        Parser.parse(".+*?()|[]{}^$", (-2616));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse(";WI#%%r$gn+?;4YD", 109);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp regexp0 = Parser.parse("k*", (-276));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 1349);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp regexp0 = Parser.parse("X/[V]", 3765);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[:r:]", (-2156));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp regexp0 = Parser.parse("xN3wG;0[V],\"mL", 508);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        Parser.parse("lwK([]]5DrHAoS%,", 93);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `lwK([]]5DrHAoS%,`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp regexp0 = Parser.parse("i/bt|I", (-1623));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse("`g@66|.", 40);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", (-2089));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 9449);
      assertNotNull(regexp0);
  }
}