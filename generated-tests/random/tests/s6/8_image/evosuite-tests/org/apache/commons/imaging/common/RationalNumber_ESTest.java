/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:30:15 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1073741839);
      assertEquals(1073741839, rationalNumber0.numerator);
      assertEquals(1.073741839E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(736.0034);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(736.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals("736", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(416.180676741707);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("416.181", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), Integer.MIN_VALUE);
      String string0 = rationalNumber0.toString();
      assertEquals("1/-2147483648 (-0)", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2331), 2147483678L);
      assertEquals((-1.0859221068314914E-6), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1073741839, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, (-5451L));
      assertEquals((-5451), rationalNumber0.divisor);
      assertEquals((-393961.4101999633), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-55L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-3.9045157236363634E7), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-3.9045157236363634E7), rationalNumber1.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 6959L);
      long long0 = rationalNumber0.longValue();
      assertEquals(6959, rationalNumber0.divisor);
      assertEquals(1.4369881E-4F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), Integer.MIN_VALUE);
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals((-4.6566128730773926E-10), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-812.094926185));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals(812.0949F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(462L, 462L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      String string0 = rationalNumber1.toString();
      assertEquals(1, rationalNumber0.numerator);
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(61L, 67L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(67, rationalNumber0.divisor);
      assertEquals(0.9104477611940298, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-312L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-55L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-3.9045157236363634E7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483645651682E9));
      assertEquals((-2.147483646E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.5848672774154693E-7);
      assertEquals(1.5848671809983301E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(6309677, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(Integer.MAX_VALUE);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-55L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-39,045,157.236", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-55L));
      String string0 = rationalNumber0.toString();
      assertEquals("-2147483648/55 (-39,045,157.236)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1707), 0);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (-1707/0)", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(2147483678L, 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: 2147483678, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483678L));
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(4.656612938129524E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(182L, (-2147483678L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-1073741839), rationalNumber0.divisor);
      assertEquals(8.475035310605979E-8, rationalNumber1.doubleValue(), 0.01);
      assertEquals(91, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483678L), (-1L));
      assertEquals((-2.147483618E9), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-3.9045157236363634E7));
      assertEquals((-3.90451572368421E7), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(736.0034);
      long long0 = rationalNumber0.longValue();
      assertEquals(736L, long0);
      assertEquals(736.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-55L));
      int int0 = rationalNumber0.intValue();
      assertEquals((-3.9045157236363634E7), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-39045157), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-55L));
      float float0 = rationalNumber0.floatValue();
      assertEquals(Integer.MIN_VALUE, rationalNumber0.numerator);
      assertEquals((-3.9045156E7F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(416.180676741707);
      int int0 = rationalNumber0.intValue();
      assertEquals(1955633, rationalNumber0.numerator);
      assertEquals(416, int0);
  }
}
