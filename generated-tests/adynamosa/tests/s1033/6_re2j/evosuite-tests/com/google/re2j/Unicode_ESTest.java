/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 05:29:27 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.re2j.Unicode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Unicode_ESTest extends Unicode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = Unicode.simpleFold(8072);
      assertEquals(8064, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Unicode.toLower(90);
      assertEquals(122, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Unicode.simpleFold(65);
      assertEquals(97, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Unicode.toUpper(122);
      assertEquals(90, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Unicode.simpleFold(127);
      assertEquals(127, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Unicode.simpleFold(309);
      assertEquals(308, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(255);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(255);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(453);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Unicode.toUpper(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Unicode.toUpper((-407));
      assertEquals((-407), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Unicode.toLower(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Unicode.toLower((-579));
      assertEquals((-579), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Unicode.simpleFold(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper((-2));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle((-337));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Unicode.isLower((-407));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = Unicode.simpleFold(499);
      assertEquals(497, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = Unicode.simpleFold(120714);
      assertEquals(120714, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = Unicode.simpleFold(97);
      assertEquals(65, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = Unicode.simpleFold((-1363));
      assertEquals((-1363), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = Unicode.toLower(1007);
      assertEquals(1007, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(1114111);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(10626);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(6470);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(805);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(2004);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(173);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(161);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(127);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint((-1898));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(255);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Unicode.isUpper(1364);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(404);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = Unicode.isPrint(8275);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = Unicode.isTitle(1447);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = Unicode.isLower(5905);
      assertFalse(boolean0);
  }
}