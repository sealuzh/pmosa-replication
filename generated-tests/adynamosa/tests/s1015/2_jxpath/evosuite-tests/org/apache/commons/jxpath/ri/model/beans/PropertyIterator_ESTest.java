/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 22:29:07 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
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
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, locale0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(28);
      assertEquals(28, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, locale0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "rootNode", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(28);
      assertEquals(28, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Object object0 = new Object();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "", false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      nodePointer0.setAttribute(true);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("N8aa>S~.t3h^eH=[c");
      Class<String> class0 = String.class;
      Object object0 = new Object();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer1 = new BeanPointer(beanPropertyPointer0, qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
      QName qName1 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer1, qName1);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPAN;
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      nodePointer0.setIndex(16);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Object object0 = new Object();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("EU&\"7pgUeUXrqAJ", "PBN");
      BeanPointer beanPointer0 = new BeanPointer((QName) null, "HrNA{E1=zoDxVRe^", jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Object object0 = new Object();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = (PropertyIterator)nullPointer0.createNodeIterator("h|o", false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((Locale) null, "");
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, object0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "", true, beanPointer0);
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
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPAN;
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("propertyCount");
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("org.jdom.Content");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, locale0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      NullPointer nullPointer0 = new NullPointer(locale0, "immediateValuePointer");
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("actual");
      boolean boolean0 = propertyIterator0.setPosition(2);
      assertEquals(2, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("actual");
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.CHINA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("actual");
      boolean boolean0 = propertyIterator0.setPosition(2);
      assertEquals(2, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      Locale locale0 = Locale.JAPAN;
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("propertyCount");
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "nodeValue", false, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(2069);
      assertEquals(2069, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "nodeValue", false, beanPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(2069);
      assertEquals(2069, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, locale0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "rootNode", false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "", false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer0);
      propertyIterator0.setPosition(2069);
      propertyIterator0.getNodePointer();
      assertEquals(2069, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      NullPointer nullPointer0 = new NullPointer(locale0, "immediateValuePointer");
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      beanPropertyPointer0.setIndex(56);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Object object0 = new Object();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(beanPointer0, "", true, beanPropertyPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer0);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      QName qName0 = new QName((String) null, (String) null);
      Object object0 = new Object();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(beanPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, beanPropertyPointer0);
      NullPointer nullPointer0 = (NullPointer)propertyIterator0.getNodePointer();
      assertNotNull(nullPointer0);
      
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }
}
