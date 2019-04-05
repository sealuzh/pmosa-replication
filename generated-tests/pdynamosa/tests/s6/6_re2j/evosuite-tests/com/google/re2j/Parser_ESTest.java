/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:37:46 GMT 2019
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
        Parser.parse("(<\u0000.lT6j&<()8", 88);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(<\u0000.lT6j&<()8`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp regexp0 = Parser.parse("S|I", 5996);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp regexp0 = Parser.parse("{9HX>Gnw", 188);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Y|yO:2@\u0002/r<>iE4|", (-3495));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      try { 
        Parser.parse(".+*?Q/()|[]{}^$", 124);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `+*?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        Parser.parse("(i(B|`", (-568));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(i(B|``
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", (-2383));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = new Parser("t", 115);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        Parser.parse("%f$}hzAV,HaW-|[}Z", 3352);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[}Z`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp regexp0 = Parser.parse("z_``MX.4!A", 52);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 0, 5);
      assertNotSame(regexpArray1, regexpArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[5];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 43455, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[1];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, (-616));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 4, 4);
      assertEquals(0, regexpArray1.length);
      assertNotSame(regexpArray1, regexpArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", 4);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, (-2337), 2160);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[1];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, (-1), 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse((String) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "\\pp&<ur";
      int int0 = 1773;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `\\pp`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "x\\iV]E";
      int int0 = 3424;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\i`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 0;
      String string0 = "_i I.[_dy\\";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: trailing backslash at end of expression
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        Parser.parse("[j^$- [{", (-447));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `$- `
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse("}s>44iKZj[$A-", (-2496));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[$A-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        Parser.parse("RvEcrPcfch=2'c[-", (-547));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("RvEcrPcfch=2'c[-", (-1480));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("=ZF@jAP[]'h\"rD{7A5[", 125);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]'h\"rD{7A5[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 85);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        Parser.parse("pPhA[", 2785);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = (-963);
      String string0 = "[>+jp\\@Y%?/k.5p7M";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[>+jp\\@Y%?/k.5p7M`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 1397;
      String string0 = "Xt\\2=<,c|VzC8RbAc";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\2`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(d1Kt$@CMk)<yU<zAk", (-2500));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-s:.)", 2785);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      try { 
        Parser.parse("(?i:", (-3495));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `(?i:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      try { 
        Parser.parse("(?U", (-1212));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?U`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 97);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        Parser.parse("(?P<", (-2316));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      try { 
        Parser.parse("(?PY<", (-3116));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?P`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("s8{1,y", 44);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp regexp0 = Parser.parse("%@OeKWGCf'}{1", 40);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("qFQ{ks.L!", 1644);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = "/''$'^y%)6ro9]kD$";
      int int0 = 948;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Parser.parse("D$Sk6%8,|/|(", 45);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `D$Sk6%8,|/|(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp regexp0 = Parser.parse("=!&T}FF-H74!|=x*q", 44);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      try { 
        Parser.parse("|)Ok*bW 5Rh", 193);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("@|$;CCsvMm", (-547));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::x00-xd10FFFF}[]", 88);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      try { 
        Parser.parse("(?P1<", (-712));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      try { 
        Parser.parse("??Pf", (-63));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `??`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      try { 
        Parser.parse("+", (-2316));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `+`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^x00-x{10FFFF}", 2353);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp regexp0 = Parser.parse("8[::]", 4257);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[v]P}", 2949);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      try { 
        Parser.parse("LtLg(B|m", 64);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `LtLg(B|m`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp regexp0 = Parser.parse("q55/.;56;c|SU_^8_", (-27));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = "[:\\x00-\\x{10FFFF}]";
      int int0 = 1588;
      Regexp regexp0 = Parser.parse(string0, int0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse("E'K*d.@/F8^PT\"/Z7|E", (-712));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?(F\"zb5>(", 44008);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<(?(F\"zb5`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?PY<", 107);
      assertNotNull(regexp0);
  }
}