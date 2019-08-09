/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 04:10:38 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483663L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-152), (-152));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(5L, 5L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals("-1", string0);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-980.154493));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals((-5944637), rationalNumber0.numerator);
      assertEquals("-980.154", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-152), (-152));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-980.154493));
      String string0 = rationalNumber0.toString();
      assertEquals("-5944637/6065 (-980.154)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483650L));
      assertEquals(0.9999999990686774, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1073741824, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483663L);
      assertEquals(1073741831, rationalNumber0.divisor);
      assertEquals(0.9999999925494194, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(625L, (-2147483648L));
      assertEquals((-2.9103830456733704E-7), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 1L);
      assertEquals((-2147483648L), rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2561L), 5L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(2561, rationalNumber0.numerator);
      assertEquals(512.2F, rationalNumber1.floatValue(), 0.01F);
      assertEquals((-5), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483647));
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals((-2147483647), rationalNumber0.divisor);
      assertEquals((-4.656612875245797E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(650.433969012);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals((-650.4339690107271), rationalNumber1.doubleValue(), 0.01);
      assertEquals((-650L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-1));
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals((-1), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(3445L, (-1241L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals(3445, rationalNumber0.numerator);
      assertEquals((-1241), rationalNumber0.divisor);
      assertEquals(2.7759871F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483648L);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-152), (-152));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0);
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
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(8L, 0L);
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483659L), (-2147483659L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1374L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-1374), rationalNumber0.numerator);
      assertEquals((-1374.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836314613824E9);
      assertEquals(2.147483631E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483631, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(337.771712187);
      assertEquals(403, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1L);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1873347577638924E-9);
      assertEquals(457177392, rationalNumber0.divisor);
      assertEquals(2.1873347577957223E-9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(18.416351421619535);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("18.416", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2964.4756643);
      String string0 = rationalNumber0.toString();
      assertEquals("11267972/3801 (2,964.476)", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483647L);
      String string0 = rationalNumber0.toString();
      assertEquals("2,147,483,647", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483650L));
      assertEquals(4.656612877414201E-10, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483646, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483650L), 1L);
      assertEquals(2147483646, rationalNumber0.numerator);
      assertEquals((byte) (-2), rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(249L, 1L);
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(249L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1767, (-1004));
      int int0 = rationalNumber0.intValue();
      assertEquals((-1.7599601593625498), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, (-1374L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(Integer.MAX_VALUE, rationalNumber0.numerator);
      assertEquals((-1562943.0F), float0, 0.01F);
  }
}
