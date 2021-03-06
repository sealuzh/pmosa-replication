/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 02:00:58 GMT 2019
 */

package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.util.MethodLookupUtils;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodLookupUtils_ESTest extends MethodLookupUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) "min";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, (String) null, objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[7];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Method method0 = MethodLookupUtils.lookupMethod((Class) null, (String) null, (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod((Class) null, "BB!qvLK2UyU", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) class0;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "Cannot convert ", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor((Class) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "codePoints";
      Class<Integer> class0 = Integer.class;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "hashCode", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "trim";
      objectArray0[1] = (Object) class0;
      Class<Object> class1 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class1, "compareTo", objectArray0);
      assertTrue(method0.isBridge());
      assertNotNull(method0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "trim";
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: compareTo
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "trim";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "trim", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "codePoints";
      Class<Integer> class0 = Integer.class;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "codePoints", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "trim", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "BB!qvLK2UyU", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "codePoints";
      MethodLookupUtils.lookupMethod(class0, "codePoints", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "codePoints", objectArray0);
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class2, "codePoints", objectArray0);
      Object object0 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class3 = String.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class3, "valueOf", objectArray0);
      assertEquals("public static java.lang.String java.lang.String.valueOf(java.lang.Object)", method0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: valueOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[3];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "format", objectArray0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "hashCode", objectArray0);
      assertNotNull(method0);
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "codePoints";
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "codePoints", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous constructor [null, null]
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }
}
