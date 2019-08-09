/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 10:59:10 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyIterator;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "9);RLjSIz/:");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(929);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "L");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, class0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(1006);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QName qName0 = new QName("index", "index");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("index");
      boolean boolean0 = propertyIterator0.setPosition(19);
      assertEquals(19, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QName qName0 = new QName("J)o(z{0Xlv45gWQ n?");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName((String) null, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.ITALIAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, ">`7Yt}kPU?iO%k", jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "L");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.setPosition(1752);
      int int0 = propertyIterator0.getPosition();
      assertEquals(1752, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4:y\"l5", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4:y\"l5", false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "META-INF/services/");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = (BeanAttributeIterator)nullPointer0.attributeIterator(qName0);
      beanAttributeIterator0.prepareForIndividualProperty("");
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.propertyIndex = 1090;
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      // Undeclared exception!
      try { 
        propertyIterator0.prepareForIndividualProperty("!29XhK");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1090
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.reset();
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QName qName0 = new QName("J)o(z{0Xlv45gWQ n?", "J)o(z{0Xlv45gWQ n?");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("!29XhK");
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QName qName0 = new QName((String) null, ">`7Yt}kPU?iO%k");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Object object0 = new Object();
      Locale locale0 = Locale.UK;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("bytes");
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, ";[h/t!", false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<Locale> class0 = Locale.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.KOREAN;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.propertyIndex = 1090;
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.setPosition(1750);
      assertEquals(1750, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("!29XhK");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "L");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, class0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(8);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Locale locale0 = jXPathContext0.getLocale();
      NullPointer nullPointer0 = new NullPointer(locale0, "PropertyIerator startWith parameter is not a child of the supplied parent");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      BeanPointer beanPointer0 = new BeanPointer(beanPropertyPointer0, qName0, nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      Locale locale0 = jXPathContext0.getLocale();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("leaf");
      boolean boolean0 = beanAttributeIterator0.setPosition(18);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      Locale locale0 = Locale.FRENCH;
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("leaf");
      boolean boolean0 = beanAttributeIterator0.setPosition(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "9);RLjSIz/:");
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setPropertyIndex(929);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      Locale locale0 = jXPathContext0.getLocale();
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("leaf");
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty(" but object was null.  Terminating to avoid stack recursion.");
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      Locale locale0 = Locale.FRENCH;
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.setPosition(1);
      NodePointer nodePointer0 = beanAttributeIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      NullPointer nullPointer0 = new NullPointer(locale0, "!29XhK");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.setIndex(6);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4:y\"l5", false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator1 = null;
      try {
        propertyIterator1 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, beanPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "META-INF/services/");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, beanPropertyPointer0);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }
}