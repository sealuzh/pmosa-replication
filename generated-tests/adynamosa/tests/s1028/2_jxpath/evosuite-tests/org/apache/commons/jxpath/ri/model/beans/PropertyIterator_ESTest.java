/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 19:52:52 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
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
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, nullPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(35);
      assertEquals(35, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.GERMAN;
      Object object0 = new Object();
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      nullPropertyPointer0.setIndex((-2028962945));
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, (Locale) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "\" could not be added to the top level of the document: ", true, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, nullPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribuve", false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      nodePointer0.setAttribute(true);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("l=3");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "l=3", false, (NodePointer) null);
      propertyIterator0.setPosition(34);
      int int0 = propertyIterator0.getPosition();
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Locale locale0 = Locale.JAPAN;
      NullPointer nullPointer0 = new NullPointer(qName0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", false, (NodePointer) null);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, (QName) null);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", true, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<Vj", jXPathBasicBeanInfo0, (Locale) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = new Locale("", "");
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<Integer> class0 = Integer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "org.apache.commons.jxpath.ri.model.NodePointer", true, (NodePointer) null);
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
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("org.apache.commons.jxpath.ri.model.beans.PropertyIterator");
      propertyIterator0.prepareForIndividualProperty("PropertyIerator startWith parameter is not a child of the supplied parent");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("arent");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, nullPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("uU0#FL!");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NodeIterator nodeIterator0 = beanPointer0.attributeIterator(qName0);
      boolean boolean0 = nodeIterator0.setPosition(Integer.MIN_VALUE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, nullPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", true, (NodePointer) null);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<Vj", jXPathBasicBeanInfo0, (Locale) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(1389);
      assertEquals(1389, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, nullPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "attribute", false, (NodePointer) null);
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      QName qName0 = new QName("<<unknown namespace>>", "<<unknown namespace>>");
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<Vj", jXPathBasicBeanInfo0, (Locale) null);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", false, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(1389);
      assertEquals(1389, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(173);
      assertEquals(173, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "'s@XUt[^8]MDoNa", true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("namespaceURI");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      QName qName0 = new QName("l=3");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "l=3", false, (NodePointer) null);
      propertyIterator0.getNodePointer();
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, class0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      PropertyIterator propertyIterator1 = null;
      try {
        propertyIterator1 = new PropertyIterator(beanPointer0, "parent", false, nodePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(19);
      assertEquals(19, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      QName qName0 = new QName("l=3");
      NullPointer nullPointer0 = new NullPointer((NodePointer) null, qName0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "l=3", false, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      Locale locale0 = Locale.ROOT;
      BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
      NodeIterator nodeIterator0 = beanPointer0.attributeIterator(qName0);
      nodeIterator0.getNodePointer();
      assertEquals(1, nodeIterator0.getPosition());
  }
}
