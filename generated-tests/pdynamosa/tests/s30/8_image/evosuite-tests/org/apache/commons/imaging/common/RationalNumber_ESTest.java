/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 17:44:15 GMT 2019
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
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-1L));
      assertEquals((-1.0), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-1.0F), rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2147483650L));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.1474836472719762E9);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3, 3);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2496.762704401057));
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-2,496.763", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3, 3);
      String string0 = rationalNumber0.toString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2496.762704401057));
      String string0 = rationalNumber0.toString();
      assertEquals("-34048353/13637 (-2,496.763)", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, (-2147483670L));
      assertEquals(2147483626, rationalNumber0.divisor);
      assertEquals(4.656612920782288E-10, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(4294967295L, 4294967295L);
      assertEquals(1, rationalNumber0.numerator);
      assertEquals(1.0, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-486L), (-2147483648L));
      assertEquals(2.2631138563156128E-7, rationalNumber0.doubleValue(), 0.01);
      assertEquals(243, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(Integer.MAX_VALUE, 1);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(2.147483647E9, rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483647L);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals(1, rationalNumber1.divisor);
      assertEquals(0.0F, rationalNumber1.floatValue(), 0.01F);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3, 3);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      RationalNumber rationalNumber2 = rationalNumber1.negate();
      assertEquals((-1.0F), rationalNumber1.floatValue(), 0.01F);
      assertEquals(1.0F, rationalNumber2.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(964L, 964L);
      long long0 = rationalNumber0.longValue();
      assertEquals(1L, long0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RationalNumber rationalNumber0 = new RationalNumber(3, 3);
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      long long0 = rationalNumber1.longValue();
      assertEquals((-1L), long0);
      assertEquals(1L, rationalNumber0.longValue());
      assertEquals((-1.0), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, (-2446L));
      int int0 = rationalNumber0.intValue();
      assertEquals(0, int0);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2496.762704401057));
      int int0 = rationalNumber0.intValue();
      assertEquals((-2496.762704407128), rationalNumber0.doubleValue(), 0.01);
      assertEquals((-2496), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 2147483647L);
      float float0 = rationalNumber0.floatValue();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-553.8018));
      float float0 = rationalNumber0.floatValue();
      assertEquals(5000, rationalNumber0.divisor);
      assertEquals((-553.8018F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(637L, (-351L));
      double double0 = rationalNumber0.doubleValue();
      assertEquals((-1.8148148148148149), double0, 0.01);
      assertEquals(27, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(1, 0);
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
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-1L), 0L);
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(964L, 964L);
      double double0 = rationalNumber0.doubleValue();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2229.4883746));
      assertEquals((-2229.4883720930234), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.1474836442199903E9));
      assertEquals((-2.147483644E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(5);
      assertEquals(5.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(5L, rationalNumber0.longValue());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(1.0E-8);
      assertEquals(1.0E-8, rationalNumber0.doubleValue(), 0.01);
      assertEquals(100000000, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf((-2.147483647E9));
      assertEquals((-2.147483647E9), rationalNumber0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483654L), 1L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals(1, rationalNumber0.divisor);
      assertEquals("2147483642", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483650L), 30L);
      String string0 = rationalNumber0.toDisplayString();
      assertEquals("-71,582,788.333", string0);
      assertEquals(214748365, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-895L), (-1L));
      String string0 = rationalNumber0.toString();
      assertEquals("895", string0);
      assertEquals(895, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(27, 0L);
      String string0 = rationalNumber0.toString();
      assertEquals("Invalid rational (1/0)", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483650L), 30L);
      String string0 = rationalNumber0.toString();
      assertEquals("214748365/-3 (-71,582,788.333)", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        RationalNumber.factoryMethod((-2147483654L), 0L);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Invalid value, numerator: -2147483654, divisor: 0
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(0L, 4294967291L);
      assertEquals(1, rationalNumber0.divisor);
      assertEquals(0.0F, rationalNumber0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod((-2147483648L), (-2147483673L));
      RationalNumber rationalNumber1 = rationalNumber0.negate();
      assertEquals((-0.9999999878928066), rationalNumber1.doubleValue(), 0.01);
      assertEquals(1073741824, rationalNumber0.numerator);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(0.0);
      long long0 = rationalNumber0.longValue();
      assertEquals(0L, long0);
      assertEquals(0.0, rationalNumber0.doubleValue(), 0.01);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.factoryMethod(964L, 964L);
      int int0 = rationalNumber0.intValue();
      assertEquals(1, int0);
      assertEquals(1, rationalNumber0.divisor);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RationalNumber rationalNumber0 = RationalNumber.valueOf(2.147483647E9);
      float float0 = rationalNumber0.floatValue();
      assertEquals(2.14748365E9F, float0, 0.01F);
      assertEquals(Integer.MAX_VALUE, rationalNumber0.numerator);
  }
}