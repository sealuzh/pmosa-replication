/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 21:04:18 GMT 2019
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
      assertEquals(1L, rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2147483667L);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-2025), (-2025));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1152333, 1);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("1152333", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, 2147483647L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toDisplayString();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
      assertEquals((-1), rationalNumber1.numerator);
      assertEquals("-0", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-3091), (-3091));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1488L, 1L);
      String string0 = rationalNumber0.toString();
      assertEquals("1,488", string0);
      assertEquals(1488, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483653L), 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((short) (-5), rationalNumber0.shortValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0, 2147483648L);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 2147483667L);
      String string0 = rationalNumber0.toString();
      assertEquals("1073741824/-1073741833 (-1)", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2147483647L, (-2147483669L));
      assertEquals((-0.9999999888241292), rationalNumber0.doubleValue(), 0.01);
      assertEquals(357913941, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0, rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483653L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-4.656612883919414E-10), rationalNumber1.doubleValue(), 0.01);
      assertEquals(2147483643, rationalNumber0.divisor);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(1, 32893623);
      long long0 = rationalNumber0.longValue();
      assertEquals(3.0401029403176415E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-162L), 1);
      long long0 = rationalNumber0.longValue();
      assertEquals((-162L), long0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 161L);
      int int0 = rationalNumber0.intValue();
      assertEquals((-161), rationalNumber0.divisor);
      assertEquals(0, int0);
      assertEquals((-0.0062111802F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-189.679086432));
      int int0 = rationalNumber0.intValue();
      assertEquals((-189), int0);
      assertEquals((-189.67908642214266), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 1851);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1851, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-189.679086432));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals(189.6791F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1487.976));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-1487.976), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(4061L, 0L);
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
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-3779L), (-3779L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-3779L), (-3779L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836444451993E9));
      assertEquals((-2.147483644E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-137.9892285));
      assertEquals((-137.98923F), rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1152333);
      assertEquals(1152333.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1152333, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.837055035342928E-10);
      assertEquals(4.656612875245797E-10, rationalNumber0.doubleValue(), 0.01);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(507, 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (507/0)", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483648L));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483653L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(4.656612883919414E-10, rationalNumber0.doubleValue(), 0.01);
      assertEquals("0", string0);
      assertEquals(2147483643, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(694L, (-2147483653L));
      String string0 = rationalNumber0.toString();
      assertEquals("-347/1073741827 (-0)", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-591L), (-591L));
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483653L), (-2147483653L));
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-189.679086432));
      float float0 = rationalNumber0.floatValue();
      assertEquals((-189.6791F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(385.78272514228325);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-385.78272514228325), rationalNumber1.doubleValue(), 0.01);
  }
}
