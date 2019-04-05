/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:08:13 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483647));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-3935), (-3935));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("0", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1687.3151258897847);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      RationalNumber rationalNumber3 = rationalNumber2.negate();
      String string0 = rationalNumber3.toDisplayString();
      assertEquals("-1,687.315", string0);
      assertEquals((-34659140), rationalNumber3.numerator);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(234, 234);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-510L));
      String string0 = rationalNumber0.toString();
      assertEquals((-510.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals("-510", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-795L), (-1133L));
      String string0 = rationalNumber0.toString();
      assertEquals("795/1133 (0.702)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2147483647), (-2147483647));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483656L, 1L);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-2.14748364E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 2147483656L);
      assertEquals((-0.9999999962747097), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-268435456), rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1967L, Integer.MIN_VALUE);
      assertEquals((-9.159557521343231E-7), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((byte)1, rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2350L);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-3887.4691042337045));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      int int0 = rationalNumber1.intValue();
      assertEquals(3887, int0);
      assertEquals((-3887.469104235916), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2350L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483675L);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2940L, (-510L));
      assertEquals((-17), rationalNumber0.divisor);
      assertEquals((-5.7647057F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836470165236E9);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(2.147483647E9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1687.3151258897847);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals((-1687.3151258458693), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2075L), 0);
      // Undeclared exception!
      try { 
        rationalNumber0.intValue();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483660L), (-2147483660L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(2436, Integer.MAX_VALUE);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1.1343509E-6F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(8.271090337075293E-7);
      assertEquals(8.271093355830708E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1209030, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1);
      long long0 = rationalNumber0.longValue();
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(796L, 2147483649L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(3.7066638469696045E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals("0", string0);
      assertEquals(199, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(23444091L, (-2147483653L));
      String string0 = rationalNumber0.toString();
      assertEquals("-11722045/1073741827 (-0.011)", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483648L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483648, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, (-2147483657L));
      assertEquals((-0.9999999944120646), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, 2147483648L);
      assertEquals((-4.6566128730773926E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-3887.4691042337045));
      long long0 = rationalNumber0.longValue();
      assertEquals((-3887L), long0);
      assertEquals((-3887.469104235916), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 1L);
      int int0 = rationalNumber0.intValue();
      assertEquals((-2.147483648E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 1L);
      float float0 = rationalNumber0.floatValue();
      assertEquals((-2.14748365E9F), float0, 0.01F);
      assertEquals(Integer.MIN_VALUE, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483646387654E9));
      assertEquals((-2.147483646E9), rationalNumber0.doubleValue(), 0.01);
  }
}