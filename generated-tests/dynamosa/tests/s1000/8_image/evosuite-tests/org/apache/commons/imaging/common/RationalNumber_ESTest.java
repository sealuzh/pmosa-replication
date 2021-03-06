/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 19:21:45 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(631L);
      assertEquals(631.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(631, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483647));
      assertEquals((-2147483647), rationalNumber0.intValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483671L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1377, 1377);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483648L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals(4.6566128730773926E-10, rationalNumber1.doubleValue(), 0.01);
      assertEquals("0", string0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-261), (-261));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals("-1", string0);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1183.7771523));
      String string0 = rationalNumber0.toString();
      assertEquals("-15771463/13323 (-1,183.777)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3539, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (3539/0)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483649L));
      assertEquals(1073741825, rationalNumber0.divisor);
      assertEquals(0.9999999990686774, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1377, 1377);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(1.0F, rationalNumber2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 2147483647L);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals((-4.656612875245797E-10), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1377, 1377);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals((-1L), long0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1L, rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483648L));
      int int0 = rationalNumber0.intValue();
      assertEquals((-4.6566128730773926E-10), rationalNumber0.doubleValue(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-261), (-261));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      int int0 = rationalNumber1.intValue();
      assertEquals((-261), rationalNumber0.numerator);
      assertEquals((-1), int0);
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals((byte)1, rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 2147483647L);
      float float0 = rationalNumber0.floatValue();
      assertEquals((-4.656613E-10F), float0, 0.01F);
      assertEquals((-2147483647), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-1));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-2.147483648E9), rationalNumber1.doubleValue(), 0.01);
      assertEquals((-2.147483648E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483663L);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483651L), 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(2.147483645E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1170.1));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-1170.1), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1851L, 0L);
      // Undeclared exception!
      try { 
        rationalNumber0.longValue();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 0);
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
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0L, 0L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2122.346149446362);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(2122.346153846154, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1L));
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.4567831385647878E-8);
      assertEquals(1.4567831370126246E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(68644397, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("-2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.7116830201807045);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("2.712", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(639.3043981887765);
      String string0 = rationalNumber0.toString();
      assertEquals("14898989/23305 (639.304)", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483660L));
      assertEquals(2147483636, rationalNumber0.divisor);
      assertEquals(4.656612899098245E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, (-2147483660L));
      assertEquals((-0.999999993480742), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483649L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483649, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836462610085E9);
      assertEquals(2147483646, rationalNumber0.numerator);
      assertEquals(2.147483646E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(639.3043981887765);
      long long0 = rationalNumber0.longValue();
      assertEquals(14898989, rationalNumber0.numerator);
      assertEquals(639L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-1));
      int int0 = rationalNumber0.intValue();
      assertEquals((-1), rationalNumber0.divisor);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-6L), (-6L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1.0F, float0, 0.01F);
  }
}
