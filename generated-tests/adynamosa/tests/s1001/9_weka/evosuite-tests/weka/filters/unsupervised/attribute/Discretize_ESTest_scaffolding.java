/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jul 21 22:45:52 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Discretize_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.filters.unsupervised.attribute.Discretize"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/9_weka"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Discretize_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.core.converters.ConverterUtils",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.Saver",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.filters.UnsupervisedFilter",
      "weka.core.logging.Logger$Level",
      "weka.core.converters.XRFFSaver",
      "weka.core.ClassCache",
      "weka.core.DenseInstance",
      "weka.core.RevisionUtils$Type",
      "weka.core.converters.DatabaseConverter",
      "weka.gui.PropertyPanel",
      "weka.core.converters.IncrementalConverter",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.gui.GenericPropertiesCreator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.gui.PropertyText",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.core.EnvironmentHandler",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.converters.XRFFLoader",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.gui.PropertyValueSelector",
      "weka.core.AttributeLocator",
      "weka.core.BinarySparseInstance",
      "weka.gui.PropertySheetPanel$CapabilitiesHelpDialog",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.converters.AbstractSaver",
      "weka.gui.PropertySheetPanel",
      "weka.core.CapabilitiesHandler",
      "weka.core.AbstractInstance",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.core.Queue",
      "weka.core.Version",
      "weka.core.converters.AbstractLoader",
      "weka.filters.AllFilter",
      "weka.core.converters.BatchConverter",
      "weka.core.converters.ArffLoader$ArffReader",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.core.converters.ArffLoader",
      "weka.core.OptionHandler",
      "weka.core.WekaException",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "weka.core.ClassDiscovery",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.filters.StreamableFilter",
      "weka.gui.GenericObjectEditor$1",
      "weka.core.Range",
      "weka.core.Attribute$1",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.core.Capabilities$Capability",
      "weka.core.SparseInstance",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.gui.GenericObjectEditor",
      "weka.core.WekaPackageManager",
      "weka.core.converters.CSVLoader",
      "weka.gui.CustomPanelSupplier",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.converters.CSVSaver",
      "weka.filters.Sourcable",
      "weka.core.converters.ArffSaver",
      "weka.core.Attribute",
      "weka.core.FastVector",
      "weka.core.xml.XMLDocument",
      "weka.core.UnassignedDatasetException",
      "weka.core.Queue$QueueNode",
      "weka.core.RevisionUtils",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.core.WeightedInstancesHandler",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.core.UnassignedClassException",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.core.xml.XMLInstances",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.RevisionHandler",
      "weka.experiment.Stats",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.gui.GenericObjectEditor$GOEPanel",
      "weka.filters.Filter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Discretize_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.filters.Filter",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Capabilities$Capability",
      "weka.core.Range",
      "weka.core.Utils",
      "weka.core.Option",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.Queue",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.filters.AllFilter",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.SerializedObject",
      "weka.core.RevisionUtils",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.DenseInstance",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.ProtectedProperties",
      "weka.core.Attribute",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.core.FastVector",
      "weka.core.WekaException",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.AttributeLocator",
      "weka.core.StringLocator",
      "weka.core.RelationalLocator",
      "weka.core.UnassignedClassException",
      "weka.core.Queue$QueueNode",
      "weka.core.AttributeStats",
      "weka.experiment.Stats"
    );
  }
}
