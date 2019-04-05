/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:15:57 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.plaf.multi.MultiTextUI;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.classifiers.misc.InputMappedClassifier;
import weka.core.Attribute;
import weka.core.ChebyshevDistance;
import weka.core.EuclideanDistance;
import weka.core.Instances;
import weka.core.ManhattanDistance;
import weka.core.TestInstances;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.AttributeSelection;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.Associator;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassAssigner;
import weka.gui.beans.ClassifierPerformanceEvaluator;
import weka.gui.beans.Clusterer;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.Filter;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.InstanceStreamToBatchMaker;
import weka.gui.beans.Loader;
import weka.gui.beans.Saver;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
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
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      instanceEvent0.setStatus(50);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      BeanVisual beanVisual0 = filter0.getVisual();
      assertNull(beanVisual0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      BeanVisual beanVisual0 = appender0.getVisual();
      beanVisual0.setFocusCycleRoot(true);
      filter0.setVisual(beanVisual0);
      assertEquals("Appender", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("[irGD+v");
      assertEquals("[irGD+v", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Filter filter0 = new Filter();
      assertEquals("AllFilter", filter0.getCustomName());
      
      filter0.setCustomName("");
      String string0 = filter0.getCustomName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      instanceEvent0.setStatus(2504);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("Jd-Cic!q1S){", (Object) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      Associator associator0 = new Associator();
      filter0.disconnectionNotification("", associator0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionNotification("ERROR (See log for details.", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("", "");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<ClassifierPerformanceEvaluator> class0 = ClassifierPerformanceEvaluator.class;
      Method[] methodArray0 = new Method[0];
      EventSetDescriptor eventSetDescriptor0 = new EventSetDescriptor("doRegression(", class0, methodArray0, (Method) null, (Method) null, (Method) null);
      boolean boolean0 = filter0.connectionAllowed(eventSetDescriptor0);
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null, 0, 408, 408, (-333));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null, 2872, 2);
      trainingSetEvent0.m_runNumber = (-1);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      EuclideanDistance euclideanDistance0 = new EuclideanDistance((Instances) null);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(euclideanDistance0, (Instances) null, 1, 0, 0, 0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.filters.Filter filter1 = filter0.getFilter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter1, instances0, (-295), (-63), (-63), 14);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      TestSetEvent testSetEvent0 = new TestSetEvent(dataSetEvent0, (Instances) null, 345, 345);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      TestSetEvent testSetEvent0 = new TestSetEvent(instanceEvent0, (Instances) null, 2, 0, 1, (-1544));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      instanceEvent0.setStatus(50);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiTextUI multiTextUI0 = new MultiTextUI();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(multiTextUI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class javax.swing.plaf.multi.MultiTextUI : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.eventGeneratable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      // Undeclared exception!
      try { 
        filter0.disconnectionNotification((String) null, loader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      // Undeclared exception!
      try { 
        filter0.connectionNotification((String) null, defaultTableModel0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("CN*nrSfrZ'f+>i5)");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.setVisual((BeanVisual) null);
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      // Undeclared exception!
      try { 
        filter0.acceptInstance(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Filter filter0 = new Filter();
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance((Instances) null);
      filter0.connectionNotification("(C6#;%>", chebyshevDistance0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      Clusterer clusterer0 = new Clusterer();
      filter0.connectionNotification(" as either a named attribute or as a valid ", clusterer0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("weka/gui/beans/icons/");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      filter0.connectionNotification("&", instanceStreamToBatchMaker0);
      boolean boolean0 = filter0.eventGeneratable("&");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      Associator associator0 = new Associator();
      filter0.connectionNotification("omN|-*G8%", associator0);
      boolean boolean0 = filter0.eventGeneratable("omN|-*G8%");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification(".DbQ+Ff8<", ".DbQ+Ff8<");
      boolean boolean0 = filter0.eventGeneratable(".DbQ+Ff8<");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("configuration");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // configuration not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("CN*nrSfrZ'f+>i5)");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      Enumeration enumeration0 = filter0.enumerateRequests();
      filter0.disconnectionNotification("'S4{@", enumeration0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("CN*nrSfrZ'f+>i5)");
      filter0.m_filterThread = (Thread) mockThread0;
      boolean boolean0 = filter0.isBusy();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("CN*nrSfSrZ'f+>i5)");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      Saver saver0 = new Saver();
      filter0.connectionNotification("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", saver0);
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null, (-11), (-11));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("instance", "instance");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Filter filter0 = new Filter();
      Add add0 = new Add();
      filter0.setFilter(add0);
      filter0.connectionNotification("instance", add0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", "<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>");
      boolean boolean0 = filter0.connectionAllowed("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("instance");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassAssigner classAssigner0 = new ClassAssigner();
      filter0.addInstanceListener(classAssigner0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      instanceEvent0.setStatus((-1299439917));
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Filter filter0 = new Filter();
      ClassAssigner classAssigner0 = new ClassAssigner();
      filter0.addInstanceListener(classAssigner0);
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      // Undeclared exception!
      try { 
        filter0.notifyInstanceListeners(instanceEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.ClassAssigner", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Filter filter0 = new Filter();
      Saver saver0 = new Saver();
      filter0.addTestSetListener(saver0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      TestSetEvent testSetEvent0 = new TestSetEvent(filter0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Filter filter0 = new Filter();
      Filter filter1 = new Filter();
      filter0.addDataSourceListener(filter1);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("CN*nrSfrZ'f+>i5)");
      filter0.m_filterThread = (Thread) mockThread0;
      ManhattanDistance manhattanDistance0 = new ManhattanDistance((Instances) null);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(manhattanDistance0, (Instances) null);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      ClassifierPerformanceEvaluator classifierPerformanceEvaluator0 = new ClassifierPerformanceEvaluator();
      DataSetEvent dataSetEvent0 = new DataSetEvent(classifierPerformanceEvaluator0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Filter filter0 = new Filter();
      InputMappedClassifier inputMappedClassifier0 = new InputMappedClassifier();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("<!-- globalinfo-end -->", arrayList0, 911);
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(inputMappedClassifier0, instances0, 1, (-983), 1, 1);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      instanceEvent0.setStatus((-8));
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
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
  public void test71()  throws Throwable  {
      Filter filter0 = new Filter();
      AttributeSelection attributeSelection0 = new AttributeSelection();
      filter0.setWrappedAlgorithm(attributeSelection0);
      assertEquals("AttributeSelection", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread("CN*nrSfrZ'f+>i5)");
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.acceptInstance((InstanceEvent) null);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
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
  public void test76()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("AllFilter", filter0.getCustomName());
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeConfigurationListener((ConfigurationListener) null);
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
      filter0.disconnectionNotification("weka/gui/beans/icons/", beanVisual0);
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Filter filter0 = new Filter();
      weka.filters.Filter filter1 = filter0.getFilter();
      filter0.setFilter(filter1);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName((String) null);
      assertNull(filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Filter filter0 = new Filter();
      Appender appender0 = new Appender();
      BeanVisual beanVisual0 = appender0.getVisual();
      filter0.setVisual(beanVisual0);
      assertEquals("Appender", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addDataSourceListener(filter0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, instances0);
      // Undeclared exception!
      try { 
        filter0.acceptDataSet(dataSetEvent0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Filter filter0 = new Filter();
      TestInstances testInstances0 = new TestInstances();
      Instances instances0 = testInstances0.generate();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      weka.filters.Filter filter1 = filter0.getFilter();
      assertTrue(filter1.isFirstBatchDone());
      assertEquals("AllFilter", filter0.getCustomName());
  }
}