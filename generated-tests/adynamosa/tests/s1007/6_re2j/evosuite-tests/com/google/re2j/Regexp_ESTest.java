/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 07:57:12 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Regexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Regexp_ESTest extends Regexp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.max = 11802;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.min = (-3557);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.cap = 9;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.flags = 17;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexp1.subs = regexpArray0;
      regexp0.reinit();
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 18;
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(regexp0.equals((Object)regexp1));
      assertTrue(regexp1.equals((Object)regexp0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 5;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 1044;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 4167;
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp0;
      regexp1.flags = 42886;
      regexp1.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp1.maxCap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[20];
      intArray0[3] = 689;
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[\\x00\\x00-\u02B1\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      boolean boolean0 = regexp_Op0.isPseudo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 65288;
      int int0 = regexp0.maxCap();
      assertEquals(65288, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.cap = (-2735);
      int int0 = regexp1.maxCap();
      assertEquals((-2735), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "ZyXEjCyX3Sm!p";
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.cap = (-2735);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.max = 11802;
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 45;
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      Regexp[] regexpArray0 = new Regexp[4];
      regexp1.subs = regexpArray0;
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      assertFalse(regexp1.equals((Object)regexp0));
      
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      assertFalse(regexp1.equals((Object)regexp0));
      
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp0.op = regexp_Op1;
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[5];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[invalid char class]", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      String string0 = regexp0.toString();
      assertEquals("()", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "ZyXEjCyX3Sm!p";
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "";
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      regexp0.flags = 4631;
      String string0 = regexp0.toString();
      assertEquals("(?i:)", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("\\x00\\x00", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexp1.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      String string0 = regexp0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      String string0 = regexp0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("\\B", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("\\b", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("^", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      String string0 = regexp0.toString();
      assertEquals("\\z*", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("\\A", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("(?s:.)", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("(?-s:.)", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("(?:)", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      regexp0.runes = intArray0;
      intArray0[0] = 45;
      String string0 = regexp0.toString();
      assertEquals("[\\--\\x00\\x00]", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      boolean boolean0 = regexp_Op0.isPseudo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      boolean boolean0 = regexp_Op0.isPseudo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("LEFT_PAREN", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }
}
