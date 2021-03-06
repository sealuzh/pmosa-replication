/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 17:25:50 GMT 2019
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
      int int0 = 2521;
      String string0 = "[:1D";
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:1D`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        Parser.parse(",e..fB7S%5MP{z(g|v", 256);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `,e..fB7S%5MP{z(g|v`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      try { 
        Parser.parse("&xaoD!;^e(1NT|q", 1000);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `&xaoD!;^e(1NT|q`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp regexp0 = Parser.parse("E|m", (-1727));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp regexp0 = Parser.parse("D", (-44));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        Parser.parse("ZXDg(d,sp%boF", 1633);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `ZXDg(d,sp%boF`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = new Parser("~D+J:9,", (-59));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        Parser.parse("UoUU'B+h@oej[G{cj", (-364));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[G{cj`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      try { 
        Parser.parse("[:}K", 728);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[:}K`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp regexp0 = Parser.parse("^A.", 93);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 0, 3);
      assertEquals(3, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 0, 0);
      assertEquals(0, regexpArray1.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, (-492), (-492));
      assertNotSame(regexpArray1, regexpArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[0];
      Regexp[] regexpArray1 = Parser.subarray(regexpArray0, 2424, 2424);
      assertEquals(0, regexpArray1.length);
      assertNotSame(regexpArray1, regexpArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp regexp0 = Parser.parse("8@N}Tz0TC?", 0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, (-1301), 166);
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
      // Undeclared exception!
      try { 
        Parser.subarray((Regexp[]) null, 65973, 2521);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[5];
      // Undeclared exception!
      try { 
        Parser.subarray(regexpArray0, 0, 44);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Parser.parse((String) null, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = "\\p6Ar";
      int int0 = 1741;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `\\p6`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = "\\S";
      int int0 = 66044;
      Regexp regexp0 = Parser.parse(string0, int0);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Q@TQO8[mIl]", (-484));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Parser.parse(">N[?-)qL(D2", 2277);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid character class range: `?-)`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        Parser.parse("{]S[V\"D&2g-", 764);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[V\"D&2g-`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        Parser.parse("2tc_:RL4[-t", 120069);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-t`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      try { 
        Parser.parse("2tc_:RL4[-t", 3392);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[-t`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      try { 
        Parser.parse("E<A[]1ng*&", (-1476));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[]1ng*&`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 932);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[^x00-x{10FFFF}]", 240);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        Parser.parse("C49MgclP9aazQ[", 2168);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ]: `[`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "ZiS\"!}$Z\\3";
      int int0 = 16;
      try { 
        Parser.parse(string0, int0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid escape sequence: `\\3`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      try { 
        Parser.parse("Z+F@|y*.&$'{)PIM", 508);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: regexp/syntax: internal error: `stack underflow`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|2", 508);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".|PbY", 41);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp regexp0 = Parser.parse(".|PbY", (-44));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      try { 
        Parser.parse("!,+,=B|{09{O(sSb}", 1529);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing closing ): `!,+,=B|{09{O(sSb}`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp regexp0 = Parser.parse("1x.^V3zx{0zZdm<", 508);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?s:.)", 372);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      try { 
        Parser.parse("(?()A[bRQQ1D", (-395));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?(`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp regexp0 = Parser.parse("(?-m:$)", 92);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      try { 
        Parser.parse("(?i-:", (-44));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?i-:`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      try { 
        Parser.parse("(?", 2147483645);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid or unsupported Perl syntax: `(?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      try { 
        Parser.parse("(?P<", 2381);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp regexp0 = Parser.parse("CNq{*vU.{11", 540);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp regexp0 = Parser.parse("564J|=kBlT$$t&`", 1224);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp regexp0 = Parser.parse("", (-3851));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp regexp0 = Parser.parse(" gXZE%.EYN^g7e| o_", 6468);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp regexp0 = Parser.parse("`.3eQ|`", (-3844));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp regexp0 = Parser.parse("||", 508);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp regexp0 = Parser.parse("|B", 2381);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp regexp0 = Parser.parse("?(?-s:. )", 64);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      try { 
        Parser.parse("(?()A[bRQQ1D", 52);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      try { 
        Parser.parse("*l`", 2336);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: missing argument to repetition operator: `*`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      try { 
        Parser.parse(".gz(s<@R){?8", 66012);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid nested repetition operator: `{?`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp regexp0 = Parser.parse("_;44%Od9vnx[$]q|@6f|", 469);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[A]t", (-3051));
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp regexp0 = Parser.parse("&_[y]t", 53);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp regexp0 = Parser.parse("[::]", 97);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Regexp regexp0 = Parser.parse("_44%Qd9vnx[$]q|@6f|", 508);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Regexp regexp0 = Parser.parse("2U;`>luwrw# ;eA+?", 112);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Regexp regexp0 = Parser.parse("Az|AG+", 80);
      assertNotNull(regexp0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      try { 
        Parser.parse("(?P<(?i>:", (-1727));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parsing regexp: invalid named capture: `(?P<(?i`
         //
         verifyException("com.google.re2j.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = "ZiS\"!}$Z\\3";
      int int0 = 67;
      Regexp regexp0 = Parser.parse(string0, int0);
      assertNotNull(regexp0);
  }
}
