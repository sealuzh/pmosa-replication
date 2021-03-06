/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:36:08 GMT 2019
 */

package org.apache.commons.imaging.common;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.imaging.common.RationalNumber;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RationalNumber_ESTest extends RationalNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-3032), (-3032));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(100000000, (-1126L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-88,809.947", string0);
      assertEquals(563, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1654, 1654);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-183L), 275L);
      String string0 = rationalNumber0.toString();
      assertEquals("-183/275 (-0.665)", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1947L), (-2147483648L));
      String string0 = rationalNumber0.toString();
      assertEquals("1947/-2147483648 (-0)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MIN_VALUE, (-2147483648L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2660);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.numerator);
      assertEquals(807324.6793233083, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals((-2147483647L), rationalNumber2.longValue());
      assertEquals(2.147483647E9, rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(917, 917);
      int int0 = rationalNumber0.intValue();
      assertEquals(917, rationalNumber0.numerator);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1345L));
      int int0 = rationalNumber0.intValue();
      assertEquals((-1345.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1345), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1345L));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-1345.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1345.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-183L), (-183L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 1229L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1345L), (-3403L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1345, rationalNumber0.numerator);
      assertEquals(0.39523949456362034, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      // Undeclared exception!
      try { 
        rationalNumber0.toDisplayString();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1345L), (-3403L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-0.3952395F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(3403, rationalNumber0.divisor);
      assertEquals(1345, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1947L), (-2147483648L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-9.066425263881683E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1852876.3140638482));
      assertEquals((-1852876.3140625), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1504.982450756);
      assertEquals(3858775, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(4.1843971700927796E-6);
      assertEquals(4.184398053418026E-6, rationalNumber0.doubleValue(), 0.01);
      assertEquals(238983, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-2147483647L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1345L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-1345", string0);
      assertEquals((-1345.0), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1345L), (-3403L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("0.395", string0);
      assertEquals(0.39523949456362034, rationalNumber0.doubleValue(), 0.01);
      assertEquals(3403, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (0/0)", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483651L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483651, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1449L), (-2147483651L));
      assertEquals(6.752088653385474E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(725, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 2147483651L);
      assertEquals((-2147483645), rationalNumber0.divisor);
      assertEquals((-4.656612879582606E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483651L), 1);
      assertEquals(2147483645, rationalNumber0.numerator);
      assertEquals(2.147483645E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483610982159E9));
      assertEquals((-2.147483611E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1345L), (-3403L));
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(0.39523949456362034, rationalNumber0.doubleValue(), 0.01);
      assertEquals(3403, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1345L), (-3403L));
      int int0 = rationalNumber0.intValue();
      assertEquals(3403, rationalNumber0.divisor);
      assertEquals(0.39523949456362034, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1345L), (-3403L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(3403, rationalNumber0.divisor);
      assertEquals(0.3952395F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1345L));
      String string0 = rationalNumber0.toString();
      assertEquals("-1,345", string0);
      assertEquals((-1345.0), rationalNumber0.doubleValue(), 0.01);
  }
}
