/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 01:26:04 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.EventSetDescriptor;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;
import weka.associations.FilteredAssociator;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.ManhattanDistance;
import weka.core.SparseInstance;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.AllFilter;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.ClassOrder;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.supervised.instance.Resample;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Associator;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.ClassValuePicker;
import weka.gui.beans.Classifier;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CostBenefitAnalysis;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.Filter;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.Loader;
import weka.gui.beans.SerializedModelSaver;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringReplacer;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TestSetMaker;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;
import weka.gui.beans.TrainingSetMaker;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ] not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      Resample resample0 = new Resample();
      filter0.setFilter(resample0);
      AllFilter allFilter0 = new AllFilter();
      filter0.setWrappedAlgorithm(allFilter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.Object : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      assertFalse(filter0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Filter filter0 = new Filter();
      Classifier classifier0 = new Classifier();
      BeanVisual beanVisual0 = classifier0.m_visual;
      beanVisual0.setFocusTraversalKeysEnabled(false);
      filter0.setVisual(beanVisual0);
      assertEquals("ZeroR", filter0.getCustomName());
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
      filter0.setCustomName((String) null);
      assertFalse(filter0.isFocusCycleRoot());
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
      filter0.removeTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeConfigurationListener((ConfigurationListener) null);
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
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0, (Instances) null);
      instanceEvent0.setStatus(2394);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      Discretize discretize0 = new Discretize();
      InstanceEvent instanceEvent0 = new InstanceEvent(discretize0, (Instance) null, (-42));
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("", (Object) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      filter0.connectionNotification("8kvP", defaultTableModel0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      CostBenefitAnalysis costBenefitAnalysis0 = new CostBenefitAnalysis();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(costBenefitAnalysis0, (Instances) null, (-2003), (-1), 3983, 0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetEvent testSetEvent0 = new TestSetEvent("The base associator to be used.", (Instances) null, (-2151), (-2151), (-5), (-5));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      TestSetEvent testSetEvent0 = new TestSetEvent(serializedModelSaver0, (Instances) null, 0, (-37), 11, 1246);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
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
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.addInstanceListener(sorter0);
      // Undeclared exception!
      try { 
        filter0.notifyInstanceListeners((InstanceEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Sorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.eventGeneratable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.connectionNotification((String) null, filter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTrainingSetListener((TrainingSetListener) null);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      ClassValuePicker classValuePicker0 = new ClassValuePicker();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(classValuePicker0, instances0);
      // Undeclared exception!
      try { 
        filter0.acceptTrainingSet(trainingSetEvent0);
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
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter0 = filteredAssociator0.getFilter();
      Filter filter1 = new Filter();
      filter1.setFilter(filter0);
      // Undeclared exception!
      try { 
        filter1.acceptInstance((InstanceEvent) null);
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
      filter0.connectionNotification("thai-buddhist-era", "dataSet");
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      ManhattanDistance manhattanDistance0 = new ManhattanDistance((Instances) null);
      DataSetEvent dataSetEvent0 = new DataSetEvent(manhattanDistance0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.connectionNotification("dataSet", sorter0);
      boolean boolean0 = filter0.connectionAllowed("wqn!~\u0003Y.Q'@Y hUc");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.connectionNotification("dataSet", sorter0);
      boolean boolean0 = filter0.connectionAllowed("dataSet");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Filter filter0 = new Filter();
      Discretize discretize0 = new Discretize();
      filter0.setWrappedAlgorithm(discretize0);
      filter0.setFilter(discretize0);
      assertEquals("Discretize", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getFilter();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter0 = filteredAssociator0.getFilter();
      Filter filter1 = new Filter();
      filter1.setFilter(filter0);
      MockThread mockThread0 = new MockThread();
      filter1.m_filterThread = (Thread) mockThread0;
      InstanceEvent instanceEvent0 = new InstanceEvent(filter0, (Instance) null, 1);
      filter1.acceptInstance(instanceEvent0);
      assertTrue(filter1.isBusy());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      Filter filter1 = new Filter();
      filter1.connectionNotification("dataSet", filter0);
      boolean boolean0 = filter1.eventGeneratable("dataSet");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter1.getCustomName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      Loader loader0 = new Loader();
      filter0.connectionNotification("{A;eayiUT.F", loader0);
      boolean boolean0 = filter0.eventGeneratable("{A;eayiUT.F");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("Filter", "Filter");
      boolean boolean0 = filter0.eventGeneratable("Filter");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.performRequest("Stop");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Filter filter0 = new Filter();
      Enumeration enumeration0 = filter0.enumerateRequests();
      filter0.disconnectionNotification("+3YJI]}w(h$&N>}", enumeration0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setLog((Logger) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread(".gif");
      filter0.m_filterThread = (Thread) mockThread0;
      boolean boolean0 = filter0.isBusy();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Filter filter0 = new Filter();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, (Runnable) null);
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.connectionNotification("dataSet", sorter0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filter0, (Instances) null, 1, 1);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      filter0.connectionNotification("instance", filteredAssociator0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("instance");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.connectionNotification("dataSet", sorter0);
      filter0.connectionNotification("hA<9]0\u0007E5PSA", sorter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("dataSet", "dataSet");
      filter0.connectionNotification("dataSet", "dataSet");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.connectionNotification("PD7^", "PD7^");
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener(filter0);
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringReplacer substringReplacer0 = new SubstringReplacer();
      InstanceEvent instanceEvent0 = substringReplacer0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      filter0.addTrainingSetListener(sorter0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(sorter0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Filter filter0 = new Filter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetMaker trainingSetMaker0 = new TrainingSetMaker();
      TestSetEvent testSetEvent0 = new TestSetEvent(trainingSetMaker0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      TestSetEvent testSetEvent0 = new TestSetEvent(serializedModelSaver0, (Instances) null, 2, 0, 91, 1);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      ClassOrder classOrder0 = new ClassOrder();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(classOrder0.FREQ_ASCEND, (Instances) null, (-2232), 0, (-2232), (-575));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(filteredAssociator0, instances0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      InstanceEvent instanceEvent0 = new InstanceEvent(filter1, (Instance) null, 879);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      double[] doubleArray0 = new double[5];
      TestSetMaker testSetMaker0 = new TestSetMaker();
      SparseInstance sparseInstance0 = new SparseInstance(1036.214433428, doubleArray0);
      InstanceEvent instanceEvent0 = new InstanceEvent(testSetMaker0, sparseInstance0, 2);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      double[] doubleArray0 = new double[8];
      SparseInstance sparseInstance0 = new SparseInstance(0.0, doubleArray0);
      InstanceEvent instanceEvent0 = new InstanceEvent(filteredAssociator0, sparseInstance0, (-1));
      instanceEvent0.setStructure((Instances) null);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Filter filter0 = new Filter();
      MockThread mockThread0 = new MockThread();
      filter0.m_filterThread = (Thread) mockThread0;
      filter0.acceptInstance((InstanceEvent) null);
      assertTrue(filter0.isBusy());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Filter filter0 = new Filter();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("weka.classifiers.RandomizableMultipleClassifiersCombiner", arrayList0, 26);
      Associator associator0 = new Associator();
      DataSetEvent dataSetEvent0 = new DataSetEvent(associator0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.getCustomName();
      assertEquals("AllFilter", string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
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
  public void test79()  throws Throwable  {
      Filter filter0 = new Filter();
      String string0 = filter0.globalInfo();
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("AllFilter", beanVisual0.getText());
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getWrappedAlgorithm();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("cnfiguratQon");
      assertEquals("cnfiguratQon", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Filter filter0 = new Filter();
      TestSetMaker testSetMaker0 = new TestSetMaker();
      BeanVisual beanVisual0 = testSetMaker0.getVisual();
      filter0.setVisual(beanVisual0);
      assertEquals("TestSetMaker", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredAssociator filteredAssociator0 = new FilteredAssociator();
      weka.filters.Filter filter1 = filteredAssociator0.getFilter();
      filter0.setFilter(filter1);
      double[] doubleArray0 = new double[8];
      SparseInstance sparseInstance0 = new SparseInstance(0.0, doubleArray0);
      InstanceEvent instanceEvent0 = new InstanceEvent(filteredAssociator0, sparseInstance0, (-1));
      filter0.acceptInstance(instanceEvent0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Filter filter0 = new Filter();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent("dataSet", (Instances) null, 0, 0, 0, 0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }
}
