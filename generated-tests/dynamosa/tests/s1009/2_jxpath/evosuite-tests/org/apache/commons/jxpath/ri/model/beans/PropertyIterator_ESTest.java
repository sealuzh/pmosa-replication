/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 11:55:17 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.ri.QName;
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
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer(nullPropertyPointer0, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(23);
      assertEquals(23, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.setPosition(6);
      propertyIterator0.getPropertyPointer();
      assertEquals(6, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4:y\"l5", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QName qName0 = new QName("/@", "/@");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(65536);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("/yrOjRXQLK");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, (JXPathBeanInfo) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      // Undeclared exception!
      try { 
        propertyIterator0.prepareForIndividualProperty("org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QName qName0 = new QName("/yrOjRXQLK");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, (JXPathBeanInfo) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
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
  public void test11()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "nodeValue", false, (NodePointer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      NodePointer nodePointer0 = NodePointer.newChildNodePointer(nullPointer0, (QName) null, (Object) null);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nodePointer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("valuePointer");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("|}n'h{?");
      propertyIterator0.prepareForIndividualProperty("|}n'h{?");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, ")`iS]h");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, "<<unknown namespace>>", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Object object0 = new Object();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      NullPointer nullPointer0 = (NullPointer)propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nullPointer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("nodeValue");
      boolean boolean0 = propertyIterator0.setPosition(5442);
      assertEquals(5442, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("nodeValue");
      boolean boolean0 = propertyIterator0.setPosition(5399);
      assertEquals(5399, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer((QName) null, object0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("nodeValue");
      boolean boolean0 = propertyIterator0.setPosition(5399);
      assertEquals(5399, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPropertyPointer0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "collection", true, (NodePointer) null);
      BeanPointer beanPointer1 = (BeanPointer)propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "k6B_1~')9b U+z#8s", false, (NodePointer) null);
      propertyIterator0.setPosition(8);
      propertyIterator0.getNodePointer();
      assertEquals(8, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      QName qName0 = new QName("/@", "/@");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, beanPropertyPointer0);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      QName qName0 = new QName("/@", "/@");
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, nullPointer0);
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
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4:y\"l5", false, (NodePointer) null);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "4:y\"l5", false, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Object object0 = new Object();
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, object0, locale0);
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      Class<Object> class1 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, (QName) null, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, propertyIterator0.getPosition());
  }
}