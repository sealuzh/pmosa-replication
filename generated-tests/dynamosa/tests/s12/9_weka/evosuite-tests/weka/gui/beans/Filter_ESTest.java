/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:39:32 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.DefaultFocusTraversalPolicy;
import java.beans.EventSetDescriptor;
import java.beans.MethodDescriptor;
import java.io.CharArrayWriter;
import java.lang.reflect.Method;
import java.text.AttributedCharacterIterator;
import javax.swing.KeyStroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import weka.core.BinarySparseInstance;
import weka.core.CheckGOE;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.AllFilter;
import weka.filters.MultiFilter;
import weka.filters.supervised.instance.Resample;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassValuePicker;
import weka.gui.beans.Clusterer;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CostBenefitAnalysis;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.DataVisualizer;
import weka.gui.beans.Filter;
import weka.gui.beans.GraphViewer;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.SerializedModelSaver;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("|~XOS{{!*JpDn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // |~XOS{{!*JpDn not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      filter0.addInstanceListener(appender0);
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.addInstanceListener(appender0);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributedCharacterIterator.Attribute attributedCharacterIterator_Attribute0 = AttributedCharacterIterator.Attribute.READING;
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(attributedCharacterIterator_Attribute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.text.AttributedCharacterIterator$Attribute : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      BeanVisual beanVisual0 = crossValidationFoldMaker0.m_visual;
      DefaultFocusTraversalPolicy defaultFocusTraversalPolicy0 = new DefaultFocusTraversalPolicy();
      beanVisual0.setFocusTraversalPolicy(defaultFocusTraversalPolicy0);
      filter0.setVisual(beanVisual0);
      assertEquals("CrossValidationFoldMaker", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      BeanVisual beanVisual0 = crossValidationFoldMaker0.m_visual;
      filter0.setVisual(beanVisual0);
      assertEquals("CrossValidationFoldMaker", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName((String) null);
      assertFalse(filter0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      assertEquals("AllFilter", filter0.getCustomName());
      
      filter0.setCustomName("");
      assertEquals("", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      InstanceEvent instanceEvent0 = new InstanceEvent(classValuePicker0, (Instance) null, 263);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      instanceEvent0.setStatus((-1585));
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      Object object0 = new Object();
      filter0.disconnectionNotification("sg", object0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      CostBenefitAnalysis costBenefitAnalysis0 = new CostBenefitAnalysis();
      filter0.disconnectionNotification("", costBenefitAnalysis0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0);
      filter0.connectionNotification(":", mockPrintWriter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("", "header has been modified\n");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
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
      filter0.addDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(serializedModelSaver0, (Instances) null, 0, 91, 3930, 3930);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      CheckGOE checkGOE0 = new CheckGOE();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(checkGOE0, (Instances) null, 2, 0, 2, 2);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null, (-440), (-440), (-440), (-440));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      Clusterer clusterer0 = new Clusterer();
      TestSetEvent testSetEvent0 = new TestSetEvent(clusterer0, (Instances) null, (-927), 35, 35, 1324);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, instances0, 0, 0, 0, 0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, (Instances) null, 1, (-785), 2, 2);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, instances0);
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0);
      InstanceEvent instanceEvent0 = new InstanceEvent(testSetEvent0, binarySparseInstance0, 1198);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      instanceEvent0.setStatus((-583));
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.setFilter((weka.filters.Filter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.m_visual = null;
      // Undeclared exception!
      try { 
        filter0.setCustomName("weka.core.Capabilities");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener((InstanceListener) null);
      // Undeclared exception!
      try { 
        filter0.notifyInstanceListeners((InstanceEvent) null);
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
      filter0.connectionNotification("P#C", filter0);
      // Undeclared exception!
      try { 
        filter0.eventGeneratable("P#C");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.eventGeneratable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.disconnectionNotification((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionNotification((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  public void test44()  throws Throwable  {
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
  public void test45()  throws Throwable  {
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
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("model", "model");
      boolean boolean0 = filter0.connectionAllowed("model");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      filter0.setFilter(stratifiedRemoveFolds0);
      assertEquals("StratifiedRemoveFolds", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      Clusterer clusterer0 = new Clusterer();
      filter0.connectionNotification("weka/gui/beans/icons/", clusterer0);
      boolean boolean0 = filter0.eventGeneratable("weka/gui/beans/icons/");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("Filter", "Filter");
      boolean boolean0 = filter0.eventGeneratable("Filter");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      DataVisualizer dataVisualizer0 = new DataVisualizer();
      filter0.connectionNotification("o}j;q#uKz?Z${|", dataVisualizer0);
      boolean boolean0 = filter0.eventGeneratable("o}j;q#uKz?Z${|");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread((Runnable) null);
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread((Runnable) null);
      filter0.m_filterThread = (Thread) mockThread0;
      boolean boolean0 = filter0.isBusy();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread((Runnable) null);
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("model", "model");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      filter0.connectionNotification(")<Sj=4", appender0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("Filter", "Filter");
      GraphViewer graphViewer0 = new GraphViewer();
      filter0.connectionNotification("Filter", graphViewer0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Filter filter0 = new Filter();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      TestSetEvent testSetEvent0 = new TestSetEvent(scatterPlotMatrix0, (Instances) null, (-1526202980), (-705));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread((Runnable) null);
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(textDirectoryLoader0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Filter filter0 = new Filter();
      KeyStroke keyStroke0 = KeyStroke.getKeyStroke((-566564767), (-566564767));
      InstanceEvent instanceEvent0 = new InstanceEvent(keyStroke0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
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
  public void test69()  throws Throwable  {
      Filter filter0 = new Filter();
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      filter0.setWrappedAlgorithm(stratifiedRemoveFolds0);
      assertEquals("StratifiedRemoveFolds", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Filter filter0 = new Filter();
      AllFilter allFilter0 = (AllFilter)filter0.getWrappedAlgorithm();
      filter0.setFilter(allFilter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.gui.LogPanel logPanel0 = new weka.gui.LogPanel();
      filter0.setLog(logPanel0);
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<Resample> class0 = Resample.class;
      EventSetDescriptor eventSetDescriptor0 = new EventSetDescriptor("A,6R$@<t?1;$>C}.", class0, (MethodDescriptor[]) null, (Method) null, (Method) null);
      boolean boolean0 = filter0.connectionAllowed(eventSetDescriptor0);
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getFilter();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      BeanVisual beanVisual0 = filter0.getVisual();
      assertNull(beanVisual0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(substringReplacer0, (Instances) null);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }
}