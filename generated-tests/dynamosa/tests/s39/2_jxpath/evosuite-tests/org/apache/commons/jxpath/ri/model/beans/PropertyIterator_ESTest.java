/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:48:19 GMT 2019
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
import org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator;
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
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "bytes");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.propertyIndex = 18;
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer((QName) null, nullPointer0, jXPathBasicBeanInfo0, locale0);
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.KOREAN;
      QName qName0 = nullPropertyPointer0.getName();
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.setPosition((-4165));
      int int0 = propertyIterator0.getPosition();
      assertEquals((-4165), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.KOREAN;
      QName qName0 = nullPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.KOREAN;
      QName qName0 = nullPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPointer0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("");
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      NullPointer nullPointer0 = new NullPointer(locale0, "Z)");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(6);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QName qName0 = new QName("R5Nk(CNT8x}<j|odFvI");
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, qName0, (JXPathBeanInfo) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      // Undeclared exception!
      try { 
        beanAttributeIterator0.prepareForIndividualProperty("PropertyIerator startWith parameter is not a child of the supplied parent");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NodePointer nodePointer0 = nullPropertyPointer0.getValuePointer();
      QName qName0 = nullPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(nullPropertyPointer0, qName0, nodePointer0, (JXPathBeanInfo) null);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      // Undeclared exception!
      try { 
        beanAttributeIterator0.getNodePointer();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "!GU49<Pzd?0A", false, (NodePointer) null);
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
      Locale locale0 = Locale.GERMAN;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NullPointer nullPointer1 = new NullPointer(nullPointer0, (QName) null);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.NullPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NullPointer nullPointer0 = (NullPointer)nullPropertyPointer0.getValuePointer();
      QName qName0 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(nullPointer0, qName0);
      beanAttributeIterator0.reset();
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((QName) null, nullPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "NK45sI;", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("empty");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NodePointer nodePointer0 = nullPropertyPointer0.getValuePointer();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(nodePointer0, qName0, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "bean", true, (NodePointer) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      
      propertyIterator0.prepareForIndividualProperty("bean");
      assertFalse(nodePointer0.equals((Object)nodePointer1));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.KOREAN;
      QName qName0 = nullPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPointer0, locale0);
      QName qName1 = new QName("actual");
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName1);
      BeanPointer beanPointer1 = (BeanPointer)beanAttributeIterator0.getNodePointer();
      assertNotNull(beanPointer1);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.setPosition(2143);
      int int0 = propertyIterator0.getPosition();
      assertEquals(2143, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NodePointer nodePointer0 = nullPropertyPointer0.getValuePointer();
      QName qName0 = nullPropertyPointer0.getName();
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer1 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(nodePointer1.equals((Object)nodePointer0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.KOREAN;
      QName qName0 = nullPropertyPointer0.getName();
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPointer0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      boolean boolean0 = beanAttributeIterator0.setPosition(325);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      QName qName0 = new QName("<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPointer0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("attribute");
      boolean boolean0 = beanAttributeIterator0.setPosition(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      QName qName0 = new QName("<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPointer0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("attribute");
      boolean boolean0 = beanAttributeIterator0.setPosition(26);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "bytes");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.propertyIndex = 18;
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NodePointer nodePointer0 = nullPropertyPointer0.getValuePointer();
      Locale locale0 = new Locale("<<unknown namespace>>", "<<unknown namespace>>");
      QName qName0 = new QName("<<unknown namespace>>");
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nodePointer0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      NullPointer nullPointer0 = (NullPointer)beanAttributeIterator0.getNodePointer();
      assertNull(nullPointer0);
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      QName qName0 = new QName("<<unknown namespace>>");
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      BeanPointer beanPointer0 = (BeanPointer)NodePointer.newNodePointer(qName0, nullPointer0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.prepareForIndividualProperty("attribute");
      BeanPointer beanPointer1 = (BeanPointer)beanAttributeIterator0.getNodePointer();
      assertEquals(0, beanAttributeIterator0.getPosition());
      assertNotNull(beanPointer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      NodePointer nodePointer0 = nullPropertyPointer0.getValuePointer();
      QName qName0 = nullPropertyPointer0.getName();
      Class<Locale.LanguageRange> class0 = Locale.LanguageRange.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, nodePointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.setPosition(1752);
      propertyIterator0.getNodePointer();
      assertEquals(1752, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      propertyPointer0.setIndex((-511));
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "org.apache.commons.jxpath.ri.model.beans.PropertyIterator", true, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      NullPointer nullPointer0 = new NullPointer(locale0, "Z[");
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "Z[", false, nullPointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      NullPointer nullPointer0 = new NullPointer(locale0, "bytes");
      PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, propertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Locale locale0 = Locale.KOREAN;
      QName qName0 = nullPropertyPointer0.getName();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      NodePointer nodePointer0 = beanAttributeIterator0.getPropertyPointer();
      assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }
}