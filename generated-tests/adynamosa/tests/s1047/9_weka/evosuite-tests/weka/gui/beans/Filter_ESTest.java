/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:36:07 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import java.lang.reflect.Method;
import java.text.AttributedCharacterIterator;
import javax.swing.JRadioButton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.core.Capabilities;
import weka.core.CheckGOE;
import weka.core.CheckOptionHandler;
import weka.core.FindWithCapabilities;
import weka.core.Instances;
import weka.core.OptionHandlerJavadoc;
import weka.core.TestInstances;
import weka.core.converters.C45Saver;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.supervised.attribute.NominalToBinary;
import weka.filters.supervised.instance.Resample;
import weka.filters.supervised.instance.SpreadSubsample;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.Filter;
import weka.gui.beans.ImageSaver;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.Loader;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.Saver;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TestSetMaker;
import weka.gui.beans.TextViewer;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("weka/gui/beans/icons/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weka/gui/beans/icons/ not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appender appender0 = new Appender();
      Filter filter0 = new Filter();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("kH7ad");
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(appender0, instances0, (-2), (-2), 0, (-1));
      filter0.acceptTrainingSet(trainingSetEvent0);
      weka.filters.Filter filter1 = filter0.getFilter();
      assertTrue(filter1.isOutputFormatDefined());
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<CheckOptionHandler> class0 = CheckOptionHandler.class;
      Method[] methodArray0 = new Method[0];
      EventSetDescriptor eventSetDescriptor0 = new EventSetDescriptor("tsxWVmApDVO", class0, methodArray0, (Method) null, (Method) null);
      boolean boolean0 = filter0.connectionAllowed(eventSetDescriptor0);
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter.InstanceHolder sorter_InstanceHolder0 = new Sorter.InstanceHolder();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(sorter_InstanceHolder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class weka.gui.beans.Sorter$InstanceHolder : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("[Filter] ");
      assertEquals("[Filter] ", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      assertEquals("AllFilter", filter0.getCustomName());
      
      filter0.setCustomName("");
      assertEquals("", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      instanceEvent0.setStatus(1);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      instanceEvent0.setStatus((-1235886446));
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("@relation", (Object) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      filter0.disconnectionNotification("gis^#[IY5.70o_", attributedCharacterIterator_Attribute0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("", "");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionNotification("", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionAllowed((EventSetDescriptor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      Saver saver0 = new Saver();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(saver0, (Instances) null, 17, 21, 17, 21);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(findWithCapabilities0, (Instances) null, 0, 0);
      trainingSetEvent0.m_maxRunNumber = 0;
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.LANGUAGE;
      TestSetEvent testSetEvent0 = new TestSetEvent(attributedCharacterIterator_Attribute0, (Instances) null, 0, 67, 80, 23);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null, (-458), (-63), (-63), (-63));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      ImageSaver imageSaver0 = new ImageSaver();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(imageSaver0, instances0, 33, 33, 33, 33);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      OptionHandlerJavadoc optionHandlerJavadoc0 = new OptionHandlerJavadoc();
      TestSetEvent testSetEvent0 = new TestSetEvent(optionHandlerJavadoc0, (Instances) null, 1, 0, (-2053), (-574));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0);
      instanceEvent0.setStatus(1320);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Filter filter0 = new Filter();
      JRadioButton jRadioButton0 = new JRadioButton();
      InstanceEvent instanceEvent0 = new InstanceEvent(jRadioButton0);
      instanceEvent0.setStatus((-2342));
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      // Undeclared exception!
      try { 
        filter0.useDefaultVisual();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.setFilter((weka.filters.Filter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.eventGeneratable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      // Undeclared exception!
      try { 
        filter0.disconnectionNotification((String) null, sorter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      Resample resample0 = new Resample();
      // Undeclared exception!
      try { 
        filter0.connectionNotification((String) null, resample0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionAllowed((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.acceptTestSet((TestSetEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification("hQF[iWy.neCnW", loader0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("hQF[iWy.neCnW", "hQF[iWy.neCnW");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("@relation");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("gAYISHv<lbmoVj\\", "gAYISHv<lbmoVj\\");
      boolean boolean0 = filter0.connectionAllowed("gAYISHv<lbmoVj\\");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.filters.Filter filter1 = filter0.getFilter();
      filter0.setFilter(filter1);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetMaker testSetMaker0 = new TestSetMaker();
      filter0.connectionNotification("weka.gui.beans.Filter", testSetMaker0);
      boolean boolean0 = filter0.eventGeneratable("weka.gui.beans.Filter");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("wpgNP!VK>wOC8r", "wpgNP!VK>wOC8r");
      boolean boolean0 = filter0.eventGeneratable("wpgNP!VK>wOC8r");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification("hQF[iWy.neCnW", loader0);
      boolean boolean0 = filter0.eventGeneratable("hQF[iWy.neCnW");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.performRequest("Stop");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification("hQF[iWy.neCnW", loader0);
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(loader0, (Instances) null, (-879), (-879));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("instance");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("gAYISHv<lbmoVj\\", "gAYISHv<lbmoVj\\");
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.INPUT_METHOD_SEGMENT;
      filter0.connectionNotification("gAYISHv<lbmoVj\\", attributedCharacterIterator_Attribute0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      filter0.addInstanceListener(appender0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      filter0.addTestSetListener(attributeSummarizer0);
      TestSetEvent testSetEvent0 = new TestSetEvent(scatterPlotMatrix0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      filter0.addDataSourceListener(attributeSummarizer0);
      DataSetEvent dataSetEvent0 = new DataSetEvent(textDirectoryLoader0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      TextViewer textViewer0 = new TextViewer();
      filter0.setFilter(filter1);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(textViewer0, instances0, (-1620), (-32));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("Ry)Zy%!<+7'yY-C]");
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStructure(instances0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel();
      filter0.setLog(logPanel0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Filter filter0 = new Filter();
      SpreadSubsample spreadSubsample0 = new SpreadSubsample();
      filter0.setWrappedAlgorithm(spreadSubsample0);
      NominalToBinary nominalToBinary0 = new NominalToBinary();
      filter0.setWrappedAlgorithm(nominalToBinary0);
      assertEquals("NominalToBinary", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      DataSetEvent dataSetEvent0 = new DataSetEvent(attributeSummarizer0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("AllFilter", beanVisual0.getText());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName((String) null);
      String string0 = filter0.getCustomName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Filter filter0 = new Filter();
      PredictionAppender predictionAppender0 = new PredictionAppender();
      BeanVisual beanVisual0 = predictionAppender0.m_visual;
      filter0.setVisual(beanVisual0);
      assertEquals("PredictionAppender", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Filter filter0 = new Filter();
      ImageSaver imageSaver0 = new ImageSaver();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate("Ry)Zy%!<+7'yY-C]");
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(imageSaver0, instances0, (-2), (-1), (-2), (-1));
      filter0.acceptTrainingSet(trainingSetEvent0);
      CheckGOE checkGOE0 = new CheckGOE();
      TestSetEvent testSetEvent0 = new TestSetEvent(checkGOE0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Filter filter0 = new Filter();
      C45Saver c45Saver0 = new C45Saver();
      Capabilities capabilities0 = c45Saver0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(testInstances0, (Instances) null, 0, (-1), 1, 0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }
}
