/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:39:03 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-27611307));
      assertEquals((-2.7611307E7), rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2147483647L), rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1742), (-1742));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2147483647", string0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1552L, (-234L));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals((-776), rationalNumber0.numerator);
      assertEquals("-6.632", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber((-1742), (-1742));
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2809L));
      String string0 = rationalNumber0.toString();
      assertEquals("-2147483648/2809 (-764,501.121)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(2217, (-2903489));
      String string0 = rationalNumber0.toString();
      assertEquals("2217/-2903489 (-0.001)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483714L), 1);
      assertEquals(2.147483582E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483582, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483668L));
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483669L), 4294967294L);
      assertEquals((-0.5000000053551048), rationalNumber0.doubleValue(), 0.01);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), 4294967291L);
      assertEquals((-0.5000000006984919), rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483645, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2147483648L));
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1552L, (-234L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(6.632478632478633, rationalNumber1.doubleValue(), 0.01);
      assertEquals((-776), rationalNumber0.numerator);
      assertEquals((short) (-6), rationalNumber0.shortValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, 1L);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2809L));
      int int0 = rationalNumber0.intValue();
      assertEquals((-764501), int0);
      assertEquals(Integer.MIN_VALUE, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(0, 204);
      float float0 = rationalNumber0.floatValue();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(204, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2626.0948158307);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      float float0 = rationalNumber1.floatValue();
      assertEquals((-2626.0947F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1552L, (-234L));
      long long0 = rationalNumber0.longValue();
      assertEquals((-6L), long0);
      assertEquals((-776), rationalNumber0.numerator);
      assertEquals((-6.632478632478633), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2809L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-764501.1206835173), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-3670L), 0L);
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
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod(0L, 0);
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1576.1709553);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1576.1709552910904, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-0.9952406207714865));
      assertEquals((-1), rationalNumber0.numerator);
      assertEquals((-1), rationalNumber0.intValue());
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483648L));
      String string0 = rationalNumber0.toString();
      assertEquals("-2,147,483,647", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647482745E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(3295L, 2147483647L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1.53435394239349E-6, rationalNumber0.doubleValue(), 0.01);
      assertEquals("0", string0);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(3070948, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1L, (-2147483668L));
      assertEquals(2147483628, rationalNumber0.divisor);
      assertEquals(4.656612916445479E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, (-2147483649L));
      assertEquals((-0.9999999981373549), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1073741825), rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483668L), 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483668, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836444454143E9);
      assertEquals(2.147483644E9, rationalNumber0.doubleValue(), 0.01);
      assertEquals(2147483644, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0, rationalNumber1.doubleValue(), 0.01);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1576.1709553);
      long long0 = rationalNumber0.longValue();
      assertEquals(1576L, long0);
      assertEquals(9800631, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(438.36242952255);
      float float0 = rationalNumber0.floatValue();
      assertEquals(438.36243F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }
}
