/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 08:36:13 GMT 2019
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
import org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PropertyIterator_ESTest extends PropertyIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = new Locale("kF.8AN[0miy.kyA", "kF.8AN[0miy.kyA");
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.propertyIndex = 147;
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "U=te.lhG^", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("kF.8AN[0miy.kyA");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      propertyIterator0.getNodePointer();
      assertEquals(Integer.MIN_VALUE, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      nodePointer0.setAttribute(true);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QName qName0 = new QName("\"\r\"", "\"\r\"");
      Locale locale0 = Locale.CHINA;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, "\"\r\"", jXPathBasicBeanInfo0, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
      QName qName1 = nullPropertyPointer0.getName();
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName1);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.setPosition(12);
      int int0 = propertyIterator0.getPosition();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "T");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", true, nullPropertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", false, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertEquals(0, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "[Q?");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(1775);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator((PropertyOwnerPointer) null, "<<unknown namespace>>", false, beanPointer0);
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
      NullPointer nullPointer0 = new NullPointer((Locale) null, (String) null);
      QName qName0 = new QName((String) null, "#4kn>s}4V");
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(nullPointer0, qName0, (Object) null, jXPathBasicBeanInfo0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", false, propertyPointer0);
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
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.reset();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("l%*PuzyfBpq");
      propertyIterator0.prepareForIndividualProperty("^w$5Sc|^Q:");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.US;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(596);
      assertEquals(596, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("collection");
      boolean boolean0 = propertyIterator0.setPosition(34);
      assertEquals(34, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("actual");
      boolean boolean0 = propertyIterator0.setPosition(47);
      assertEquals(47, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("collection");
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("<<unknown namespace>>");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
      
      propertyIterator0.setPosition(1);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.UK;
      NullPointer nullPointer0 = new NullPointer((QName) null, locale0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setIndex((-2147483623));
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNotNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, nullPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getPropertyPointer();
      NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nodePointer0);
      PropertyIterator propertyIterator1 = null;
      try {
        propertyIterator1 = new PropertyIterator(beanPointer0, "l^h", false, nullPropertyPointer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<NullPropertyPointer> class0 = NullPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, (Object) null, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      QName qName0 = nullPropertyPointer0.getName();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
      BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, beanPropertyPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("collection");
      assertEquals(0, propertyIterator0.getPosition());
      
      boolean boolean0 = propertyIterator0.setPosition(1);
      assertEquals(1, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }
}
