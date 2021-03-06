/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:41:25 GMT 2019
 */

package us.codecraft.webmagic.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.util.List;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.model.PageModelExtractor;
import us.codecraft.webmagic.model.samples.DianpingFtlDataScanner;
import us.codecraft.webmagic.model.samples.OschinaAnswer;
import us.codecraft.webmagic.selector.Selector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PageModelExtractor_ESTest extends PageModelExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Selector> class0 = Selector.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Class class1 = pageModelExtractor0.getClazz();
      assertFalse(class1.isArray());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Page page0 = new Page();
      // Undeclared exception!
      try { 
        pageModelExtractor0.process(page0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Selector> class0 = Selector.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      // Undeclared exception!
      try { 
        pageModelExtractor0.process((Page) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      Page page0 = Page.fail();
      Object object0 = pageModelExtractor0.process(page0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<OschinaAnswer> class0 = OschinaAnswer.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.create(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/jsoup/nodes/Element
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<DianpingFtlDataScanner> class0 = DianpingFtlDataScanner.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.create(class0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/lang3/StringUtils
         //
         verifyException("us.codecraft.webmagic.selector.RegexSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Class class1 = pageModelExtractor0.getClazz();
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Selector selector0 = pageModelExtractor0.getTargetUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      Selector selector0 = pageModelExtractor0.getHelpUrlRegionSelector();
      assertNull(selector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PageModelExtractor pageModelExtractor0 = new PageModelExtractor();
      List<Pattern> list0 = pageModelExtractor0.getTargetUrlPatterns();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        PageModelExtractor.getSetterMethod(class0, (Field) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.model.PageModelExtractor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      PageModelExtractor pageModelExtractor0 = PageModelExtractor.create(class0);
      List<Pattern> list0 = pageModelExtractor0.getHelpUrlPatterns();
      assertEquals(0, list0.size());
  }
}
