/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 02:27:38 GMT 2019
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
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
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition(4);
      assertEquals(4, propertyIterator0.getPosition());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.setPosition((-2397));
      propertyIterator0.getNodePointer();
      assertEquals((-2397), propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, "<<unknown namespace>>", jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = new BeanAttributeIterator(beanPointer0, qName0);
      beanAttributeIterator0.getNodePointer();
      beanAttributeIterator0.getPropertyPointer();
      assertEquals(1, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, true, beanPropertyPointer0);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      
      int int0 = propertyIterator0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.setPosition(Integer.MIN_VALUE);
      int int0 = propertyIterator0.getPosition();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      boolean boolean0 = propertyIterator0.setPosition(0);
      assertFalse(boolean0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.getNodePointer();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicVariables basicVariables0 = new BasicVariables();
      QName qName0 = new QName("Y'@ZH-X3F.e(m.U");
      VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
      Object object0 = new Object();
      JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, jXPathContext0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, variablePointer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // PropertyIerator startWith parameter is not a child of the supplied parent
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QName qName0 = new QName("Eh.");
      Object object0 = new Object();
      Class<Object> class0 = Object.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      BeanPointer beanPointer1 = new BeanPointer(beanPointer0, qName0, "Eh.", jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = null;
      try {
        propertyIterator0 = new PropertyIterator(beanPointer0, "5A'!t_sI-Ba6zn", false, beanPointer1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.jxpath.ri.model.beans.BeanPointer cannot be cast to org.apache.commons.jxpath.ri.model.beans.PropertyPointer
         //
         verifyException("org.apache.commons.jxpath.ri.model.beans.PropertyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "X8ulbBxq=M");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      BeanAttributeIterator beanAttributeIterator0 = (BeanAttributeIterator)beanPointer0.attributeIterator(qName0);
      beanAttributeIterator0.reset();
      assertEquals(0, beanAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "X8ulbBxq=M");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PropertyIterator propertyIterator0 = (PropertyIterator)beanPointer0.childIterator(nodeNameTest0, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      propertyIterator0.prepareForIndividualProperty("S$d1KVH/#r");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("parent");
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, true, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      // Undeclared exception!
      propertyIterator0.setPosition(5077);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, (String) null, false, beanPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("x}Ep|");
      propertyIterator0.setPosition(2);
      assertEquals(2, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      boolean boolean0 = propertyIterator0.setPosition((-441));
      assertEquals((-441), propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      QName qName0 = new QName("<<unknown namespace>>");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(1723);
      assertEquals(1723, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(1723);
      assertEquals(1723, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "PropertyIerator startWith parameter is not a child of the supplied parent", false, (NodePointer) null);
      propertyIterator0.prepareForIndividualProperty("bytes");
      boolean boolean0 = propertyIterator0.setPosition(449);
      assertEquals(449, propertyIterator0.getPosition());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "X8ulbBxq=M");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      NodeNameTest nodeNameTest0 = new NodeNameTest(qName0);
      PropertyIterator propertyIterator0 = (PropertyIterator)beanPointer0.childIterator(nodeNameTest0, true, propertyPointer0);
      propertyIterator0.prepareForIndividualProperty((String) null);
      NullPointer nullPointer1 = (NullPointer)propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
      assertNull(nullPointer1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "valuePointer", true, (NodePointer) null);
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertEquals(0, propertyIterator0.getPosition());
      assertNotNull(nodePointer0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      propertyIterator0.prepareForIndividualProperty("nA");
      NodePointer nodePointer0 = propertyIterator0.getNodePointer();
      assertNull(nodePointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "X8ulbBxq=M");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
      
      propertyIterator0.setPosition(1);
      propertyIterator0.getNodePointer();
      assertEquals(1, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      NullPointer nullPointer0 = new NullPointer(locale0, "");
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      nullPropertyPointer0.setIndex((-4177984));
      PropertyIterator propertyIterator0 = new PropertyIterator(nullPointer0, "<<unknown namespace>>", true, nullPropertyPointer0);
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      NullPointer nullPointer0 = new NullPointer(locale0, "X8ulbBxq=M");
      Class<String> class0 = String.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
      BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPointer0, jXPathBasicBeanInfo0);
      QName qName0 = beanPropertyPointer0.getName();
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
      BeanPointer beanPointer0 = new BeanPointer(qName0, nullPropertyPointer0, jXPathBasicBeanInfo0, locale0);
      PropertyPointer propertyPointer0 = beanPointer0.getPropertyPointer();
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, "<<unknown namespace>>", false, propertyPointer0);
      propertyIterator0.getPropertyPointer();
      assertEquals(0, propertyIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
      QName qName0 = nullPropertyPointer0.getName();
      Object object0 = new Object();
      Class<BeanPropertyPointer> class0 = BeanPropertyPointer.class;
      JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
      Locale locale0 = Locale.CANADA;
      BeanPointer beanPointer0 = new BeanPointer(qName0, object0, jXPathBasicBeanInfo0, locale0);
      PropertyIterator propertyIterator0 = new PropertyIterator(beanPointer0, (String) null, false, (NodePointer) null);
      int int0 = propertyIterator0.getPosition();
      assertEquals(0, int0);
  }
}
