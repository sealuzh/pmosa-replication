/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 02:10:58 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1683, 1683);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483669L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("2147483647", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1683, 1683);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2028L, 2028L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals("-1", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(57916L, 104L);
      String string0 = rationalNumber0.toString();
      assertEquals("14479/26 (556.885)", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1219), (-639));
      String string0 = rationalNumber0.toString();
      assertEquals("-1219/-639 (1.908)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483653L));
      assertEquals(2147483643, rationalNumber0.divisor);
      assertEquals(4.656612883919414E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483661L));
      assertEquals(1073741824, rationalNumber0.numerator);
      assertEquals(0.999999993480742, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, (-2147483661L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals((-1073741823), rationalNumber0.numerator);
      assertEquals(1073741831, rationalNumber0.divisor);
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483697L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0, rationalNumber0.numerator);
      assertEquals(0.0, rationalNumber1.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.divisor);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2028L, 2028L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals((-1), rationalNumber1.numerator);
      assertEquals(1L, rationalNumber2.longValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-467L));
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2028L, 2028L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals((-1L), long0);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((short)1, rationalNumber0.shortValue());
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1205L, 2323L);
      int int0 = rationalNumber0.intValue();
      assertEquals(0.5187257856220404, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1205, rationalNumber0.numerator);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1683, 1683);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      int int0 = rationalNumber1.intValue();
      assertEquals((short)1, rationalNumber0.shortValue());
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals((-1), int0);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-467L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2530), (-1));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-2530.0F), float0, 0.01F);
      assertEquals((byte) (-30), rationalNumber0.byteValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483669L, 1);
      assertEquals((-2147483627), rationalNumber0.numerator);
      assertEquals((-2.147483627E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483661L), 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(2.147483635E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 864);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(864, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1), (-3575));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      double double0 = rationalNumber1.doubleValue();
      assertEquals(2.797202797202797E-4, rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2.797202797202797E-4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 0L);
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
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0L);
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
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1, 0);
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483645212049E9);
      assertEquals(2.147483645E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483645, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1012.7776742711084));
      assertEquals((-1012.7776484284051), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1553.2839465971997);
      assertEquals(4770135, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483661L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483647L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(100000000, rationalNumber0.divisor);
      assertEquals("0", string0);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483650L);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483653L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483653, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1192L);
      long long0 = rationalNumber0.longValue();
      assertEquals(1192L, long0);
      assertEquals(1192.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, 2147483647L);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(57916L, 104L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(14479, rationalNumber0.numerator);
      assertEquals(556.88464F, float0, 0.01F);
  }
}
