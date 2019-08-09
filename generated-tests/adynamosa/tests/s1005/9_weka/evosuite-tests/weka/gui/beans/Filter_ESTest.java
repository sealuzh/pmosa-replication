/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 05:45:22 GMT 2019
 */

package weka.gui.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.AWTEventMulticaster;
import java.awt.event.MouseWheelListener;
import java.beans.EventSetDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.attributeSelection.ReliefFAttributeEval;
import weka.clusterers.FilteredClusterer;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.Capabilities;
import weka.core.CheckGOE;
import weka.core.Instances;
import weka.core.ListOptions;
import weka.core.TechnicalInformationHandlerJavadoc;
import weka.core.TestInstances;
import weka.core.converters.TextDirectoryLoader;
import weka.filters.AllFilter;
import weka.filters.MultiFilter;
import weka.filters.supervised.attribute.Discretize;
import weka.filters.supervised.attribute.NominalToBinary;
import weka.filters.supervised.instance.Resample;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.filters.unsupervised.attribute.Add;
import weka.gui.Logger;
import weka.gui.SysErrLog;
import weka.gui.beans.Appender;
import weka.gui.beans.AttributeSummarizer;
import weka.gui.beans.BeanVisual;
import weka.gui.beans.Clusterer;
import weka.gui.beans.ClustererPerformanceEvaluator;
import weka.gui.beans.ConfigurationListener;
import weka.gui.beans.CrossValidationFoldMaker;
import weka.gui.beans.DataSetEvent;
import weka.gui.beans.DataSourceListener;
import weka.gui.beans.Filter;
import weka.gui.beans.FlowByExpression;
import weka.gui.beans.ImageSaver;
import weka.gui.beans.InstanceEvent;
import weka.gui.beans.InstanceListener;
import weka.gui.beans.InstanceStreamToBatchMaker;
import weka.gui.beans.PredictionAppender;
import weka.gui.beans.ScatterPlotMatrix;
import weka.gui.beans.SerializedModelSaver;
import weka.gui.beans.Sorter;
import weka.gui.beans.SubstringLabeler;
import weka.gui.beans.TestSetEvent;
import weka.gui.beans.TestSetListener;
import weka.gui.beans.TrainingSetEvent;
import weka.gui.beans.TrainingSetListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Filter_ESTest extends Filter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<Clusterer> class0 = Clusterer.class;
      filter0.connectionNotification("trainingSet", class0);
      boolean boolean0 = filter0.connectionAllowed("Cannot get primitive for class '");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener(filter0);
      filter0.addInstanceListener(filter0);
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setVisual((BeanVisual) null);
      assertFalse(filter0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = new BeanVisual("E%u6=JPk", "E%u6=JPk", "nD-");
      beanVisual0.setFocusTraversalKeysEnabled(false);
      filter0.setVisual(beanVisual0);
      assertEquals("E%u6=JPk", filter0.getCustomName());
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
      filter0.setCustomName((String) null);
      assertFalse(filter0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Filter filter0 = new Filter();
      assertEquals("AllFilter", filter0.getCustomName());
      
      filter0.setCustomName("");
      assertEquals("", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeTestSetListener((TestSetListener) null);
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
      filter0.removeConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Filter filter0 = new Filter();
      InstanceStreamToBatchMaker instanceStreamToBatchMaker0 = new InstanceStreamToBatchMaker();
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(0.5F, (int[]) null, 830);
      InstanceEvent instanceEvent0 = new InstanceEvent(instanceStreamToBatchMaker0, binarySparseInstance0, 830);
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      InstanceEvent instanceEvent0 = sorter0.m_ie;
      instanceEvent0.setStatus((-1742));
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("");
      assertFalse(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("model", (Object) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Filter filter0 = new Filter();
      MouseWheelListener mouseWheelListener0 = mock(MouseWheelListener.class, new ViolatedAssumptionAnswer());
      MouseWheelListener mouseWheelListener1 = AWTEventMulticaster.add(mouseWheelListener0, mouseWheelListener0);
      filter0.disconnectionNotification("model", mouseWheelListener1);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.disconnectionNotification("", "");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.connectionNotification("W+o|lSi<}8l[S", sysErrLog0);
      boolean boolean0 = filter0.eventGeneratable("W+o|lSi<}8l[S");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.connectionAllowed("");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<PredictionAppender> class0 = PredictionAppender.class;
      EventSetDescriptor eventSetDescriptor0 = new EventSetDescriptor((String) null, class0, (Method[]) null, (Method) null, (Method) null, (Method) null);
      // Undeclared exception!
      try { 
        filter0.connectionAllowed(eventSetDescriptor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTrainingSetListener((TrainingSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addTestSetListener((TestSetListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener((InstanceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addConfigurationListener((ConfigurationListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet((TrainingSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Filter filter0 = new Filter();
      ImageSaver imageSaver0 = new ImageSaver();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(imageSaver0, (Instances) null, 0, 1, 0, (-1653));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImageSaver imageSaver0 = new ImageSaver();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(imageSaver0, (Instances) null, 1895, 0, 85, 1316);
      Filter filter0 = new Filter();
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Filter filter0 = new Filter();
      CheckGOE checkGOE0 = new CheckGOE();
      TestSetEvent testSetEvent0 = new TestSetEvent(checkGOE0, (Instances) null, 0, 10000, 0, 10000);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      TestSetEvent testSetEvent0 = new TestSetEvent(serializedModelSaver0, (Instances) null, 890, 0, 1, 890);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptInstance((InstanceEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.eventGeneratable((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Filter filter0 = new Filter();
      SerializedModelSaver serializedModelSaver0 = new SerializedModelSaver();
      // Undeclared exception!
      try { 
        filter0.disconnectionNotification((String) null, serializedModelSaver0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      Filter filter0 = new Filter();
      Stack<ClustererPerformanceEvaluator> stack0 = new Stack<ClustererPerformanceEvaluator>();
      filter0.connectionNotification(".)U!Ao<L_r!lQi).Xj", stack0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Filter filter0 = new Filter();
      FilteredClusterer filteredClusterer0 = new FilteredClusterer();
      weka.filters.Filter filter1 = filteredClusterer0.getFilter();
      filter0.setFilter(filter1);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.getFilter();
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
      filter0.addInstanceListener(filter0);
      NominalToBinary nominalToBinary0 = new NominalToBinary();
      nominalToBinary0.setBinaryAttributesNominal(true);
      filter0.setFilter(nominalToBinary0);
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      Appender appender0 = new Appender();
      InstanceEvent instanceEvent0 = appender0.m_ie;
      filter0.notifyInstanceListeners(instanceEvent0);
      assertEquals("NominalToBinary", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addInstanceListener(filter0);
      NominalToBinary nominalToBinary0 = new NominalToBinary();
      filter0.setFilter(nominalToBinary0);
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      filter0.notifyInstanceListeners((InstanceEvent) null);
      assertEquals("NominalToBinary", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Filter filter0 = new Filter();
      CrossValidationFoldMaker crossValidationFoldMaker0 = new CrossValidationFoldMaker();
      filter0.connectionNotification("!V`uhqh-(51N", crossValidationFoldMaker0);
      boolean boolean0 = filter0.eventGeneratable("!V`uhqh-(51N");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<Clusterer> class0 = Clusterer.class;
      filter0.connectionNotification("trainingSet", class0);
      boolean boolean0 = filter0.eventGeneratable("trainingSet");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.eventGeneratable("configuration");
      assertTrue(boolean0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.performRequest("Stop");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Filter filter0 = new Filter();
      // Undeclared exception!
      try { 
        filter0.performRequest("model");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // model not supported (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.enumerateRequests();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Filter filter0 = new Filter();
      boolean boolean0 = filter0.isBusy();
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      filter0.connectionNotification(".)U!Ao<L_r!lQi).Xj", substringLabeler0);
      filter0.stop();
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<Clusterer> class0 = Clusterer.class;
      filter0.connectionNotification("trainingSet", class0);
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Filter filter0 = new Filter();
      ClustererPerformanceEvaluator clustererPerformanceEvaluator0 = new ClustererPerformanceEvaluator();
      DataSetEvent dataSetEvent0 = new DataSetEvent(clustererPerformanceEvaluator0, (Instances) null);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Filter filter0 = new Filter();
      TechnicalInformationHandlerJavadoc technicalInformationHandlerJavadoc0 = new TechnicalInformationHandlerJavadoc();
      filter0.connectionNotification("instance", technicalInformationHandlerJavadoc0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<Clusterer> class0 = Clusterer.class;
      filter0.connectionNotification("trainingSet", class0);
      filter0.connectionNotification("instance", "ERROR (See log for details).");
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Filter filter0 = new Filter();
      ListOptions listOptions0 = new ListOptions();
      filter0.connectionNotification("trainingSet", listOptions0);
      boolean boolean0 = filter0.connectionAllowed("weka.gui.beans.KnowledgeFlowApp$BeanLayout");
      assertEquals("AllFilter", filter0.getCustomName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Filter filter0 = new Filter();
      Class<Clusterer> class0 = Clusterer.class;
      filter0.connectionNotification("trainingSet", class0);
      boolean boolean0 = filter0.connectionAllowed("trainingSet");
      assertEquals("AllFilter", filter0.getCustomName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Filter filter0 = new Filter();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ScatterPlotMatrix scatterPlotMatrix0 = new ScatterPlotMatrix();
      filter0.addTestSetListener(scatterPlotMatrix0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(fileSystemHandling0, instances0, 1, (-4));
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      BeanVisual beanVisual0 = substringLabeler0.getVisual();
      filter0.addTrainingSetListener(substringLabeler0);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(beanVisual0, instances0, 2687, 3, 2, 0);
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Filter filter0 = new Filter();
      Sorter sorter0 = new Sorter();
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getStructure();
      TestSetEvent testSetEvent0 = new TestSetEvent(sorter0, instances0);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Filter filter0 = new Filter();
      DataSetEvent dataSetEvent0 = new DataSetEvent(filter0, (Instances) null);
      TestSetEvent testSetEvent0 = new TestSetEvent(dataSetEvent0, (Instances) null, (-11), (-11), (-11), 109);
      filter0.acceptTestSet(testSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.acceptDataSet((DataSetEvent) null);
      filter0.acceptDataSet((DataSetEvent) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Filter filter0 = new Filter();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("205", arrayList0, 300);
      Discretize discretize0 = new Discretize();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(discretize0, instances0, (-1883484081), (-51), (-2035862637), (-869));
      filter0.acceptTrainingSet(trainingSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Filter filter0 = new Filter();
      Resample resample0 = new Resample();
      TrainingSetEvent trainingSetEvent0 = new TrainingSetEvent(resample0, (Instances) null, 4167, 4167);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      DataSetEvent dataSetEvent0 = new DataSetEvent(trainingSetEvent0, instances0);
      filter0.acceptDataSet(dataSetEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Add add0 = new Add();
      filter0.setFilter(add0);
      instanceEvent0.setStatus(2);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Add add0 = new Add();
      filter0.setFilter(add0);
      ReliefFAttributeEval reliefFAttributeEval0 = new ReliefFAttributeEval();
      Capabilities capabilities0 = reliefFAttributeEval0.getCapabilities();
      TestInstances testInstances0 = TestInstances.forCapabilities(capabilities0);
      Instances instances0 = testInstances0.generate();
      instanceEvent0.setStructure(instances0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Add add0 = new Add();
      filter0.setFilter(add0);
      instanceEvent0.setStatus((-512));
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Filter filter0 = new Filter();
      SubstringLabeler substringLabeler0 = new SubstringLabeler();
      InstanceEvent instanceEvent0 = substringLabeler0.m_ie;
      Add add0 = new Add();
      filter0.setFilter(add0);
      filter0.acceptInstance(instanceEvent0);
      assertEquals("Add", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Filter filter0 = new Filter();
      Object object0 = filter0.getTreeLock();
      // Undeclared exception!
      try { 
        filter0.setWrappedAlgorithm(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.awt.Component$AWTTreeLock : incorrect type of algorithm (Filter)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Filter filter0 = new Filter();
      Discretize discretize0 = new Discretize();
      filter0.setWrappedAlgorithm(discretize0);
      assertEquals("Discretize", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Filter filter0 = new Filter();
      MultiFilter multiFilter0 = new MultiFilter();
      filter0.setFilter(multiFilter0);
      assertEquals("MultiFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Filter filter0 = new Filter();
      SysErrLog sysErrLog0 = new SysErrLog();
      filter0.setLog(sysErrLog0);
      FlowByExpression flowByExpression0 = new FlowByExpression();
      InstanceEvent instanceEvent0 = flowByExpression0.m_ie;
      filter0.acceptInstance(instanceEvent0);
      assertEquals("AllFilter", filter0.getCustomName());
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
      assertEquals("<html><font color=blue>An instance filter that passes all instances through unmodified</font><br><br> Primarily for testing purposes.<br></html>", string0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.removeConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Filter filter0 = new Filter();
      ConfigurationListener configurationListener0 = mock(ConfigurationListener.class, new ViolatedAssumptionAnswer());
      filter0.addConfigurationListener(configurationListener0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = filter0.getVisual();
      assertEquals("weka/gui/beans/icons/DefaultFilter_animated.gif", beanVisual0.getAnimatedIconPath());
      assertEquals("weka/gui/beans/icons/DefaultFilter.gif", beanVisual0.getIconPath());
      assertEquals("AllFilter", beanVisual0.getText());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Filter filter0 = new Filter();
      AllFilter allFilter0 = (AllFilter)filter0.getWrappedAlgorithm();
      StratifiedRemoveFolds stratifiedRemoveFolds0 = new StratifiedRemoveFolds();
      filter0.setFilter(stratifiedRemoveFolds0);
      assertEquals("StratifiedRemoveFolds", filter0.getCustomName());
      
      filter0.setFilter(allFilter0);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.setCustomName("A document having an author and title, but not formally published.");
      assertEquals("A document having an author and title, but not formally published.", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Filter filter0 = new Filter();
      BeanVisual beanVisual0 = new BeanVisual("E%u6=JPk", "E%u6=JPk", "nD-");
      filter0.setVisual(beanVisual0);
      assertEquals("E%u6=JPk", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.addDataSourceListener((DataSourceListener) null);
      TextDirectoryLoader textDirectoryLoader0 = new TextDirectoryLoader();
      Instances instances0 = textDirectoryLoader0.getDataSet();
      AttributeSummarizer attributeSummarizer0 = new AttributeSummarizer();
      DataSetEvent dataSetEvent0 = new DataSetEvent(attributeSummarizer0, instances0);
      // Undeclared exception!
      try { 
        filter0.acceptDataSet(dataSetEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.gui.beans.Filter", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.removeDataSourceListener((DataSourceListener) null);
      assertEquals("AllFilter", filter0.getCustomName());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Filter filter0 = new Filter();
      filter0.useDefaultVisual();
      assertEquals("AllFilter", filter0.getCustomName());
  }
}
