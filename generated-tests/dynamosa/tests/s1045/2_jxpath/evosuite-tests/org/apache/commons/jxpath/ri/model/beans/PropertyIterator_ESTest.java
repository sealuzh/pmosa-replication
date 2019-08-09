/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 06 01:17:59 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      QName qName0 = new QName("sdB[gprY<+t7", (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(beanPropertyPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(15);
      assertEquals(15, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(1480);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "~,");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition((-1270));
      propertyIterator0.getNodePointer();
      assertEquals((-1270), propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "", true, (NodePointer) null);
      propertyIterator0.setPosition(5835);
      int int0 = propertyIterator0.getPosition();
      assertEquals(5835, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "~,");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition((-1270));
      int int0 = propertyIterator0.getPosition();
      assertEquals((-1270), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "~,");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      QName qName0 = new QName("<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, locale0, (JXPathBeanInfo) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      // Undeclared exception!
      try { 
        propertyIterator0.prepareForIndividualProperty("|]PI'8V");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "U~(?[c\u0002Xl X`6");
      Class<Object> class0 = Object.class;
      QName qName0 = new QName("<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, class0, (JXPathBeanInfo) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, " No root element", false, (NodePointer) null);
      // Undeclared exception!
      try { 
        propertyIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex((-346));
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "3f", false, beanPropertyPointer0);
      // Undeclared exception!
      try { 
        propertyIterator0.getNodePointer();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -346
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "JXPath: found system property", false, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, "\u0004_`t0n7d}n,M");
      QName qName0 = new QName("<<unknown namespace>>");
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, qName0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.MapDynamicPropertyHandler", false, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator", true, (NodePointer) null);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      QName qName0 = new QName((String) null, (String) null);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, class0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("empty");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "~(,");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = (PropertyIterator)nullPointer0.childIterator((NodeTest) null, true, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      QName qName0 = new QName("R=M>>");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("bytes");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      QName qName0 = new QName((String) null, (String) null);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, class0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      QName qName0 = new QName("sdB[gprY<+t7", (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(beanPropertyPointer0, qName0, "\"(\"", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(27);
      assertEquals(27, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "~(,");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = (PropertyIterator)nullPointer0.childIterator((NodeTest) null, true, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NullPointer nullPointer1 = (NullPointer)propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nullPointer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, "T+eN=Q=hsbC:(l%Qu9g");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.setPosition(1898);
      assertEquals(1898, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
      Locale locale0 = jXPathContext0.getLocale();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "", jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("leaf");
      boolean boolean0 = propertyIterator0.setPosition(18);
      assertEquals(18, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("leaf");
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer(nullPropertyPointer0, qName0, nullPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("leaf");
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("leaf");
      boolean boolean0 = propertyIterator0.setPosition(18);
      assertEquals(18, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      QName qName0 = new QName("sdB[gprY<+t7", (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "bytes", true, beanPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition((-4405));
      assertEquals((-4405), propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("leaf");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String> class0 = String.class;
      QName qName0 = new QName("sdB[gprY<+t7", (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "bytes", true, beanPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(propertyPointer0, qName0, propertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition(18);
      propertyIterator0.getNodePointer();
      assertEquals(18, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "*");
      Class<String> class0 = String.class;
      Class<Integer> class1 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "1@\"\";s%-S+", false, beanPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(1097);
      assertEquals(1097, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      NullPointer nullPointer0 = new NullPointer(locale0, ");<5i(smrC$X`d2");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer1.setIndex((-2028824321));
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "index", true, beanPropertyPointer1);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "7I+'xxQ0TvA uB", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<String> class0 = String.class;
      QName qName0 = new QName("sdB[gprY<+t7", (String) null);
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      Class<NullPropertyPointer> class1 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class1, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(propertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(beanPropertyPointer0, qName0, "\"(\"", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer(locale0, "~,");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }
}
