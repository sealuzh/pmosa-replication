/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jul 25 00:40:07 GMT 2019
 */

package weka.classifiers.rules;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JRip_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.rules.JRip"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/9_weka"); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JRip_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$TempNode",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel",
      "weka.core.matrix.CholeskyDecomposition",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.converters.Saver",
      "weka.core.xml.XMLBasicSerialization",
      "weka.filters.UnsupervisedFilter",
      "weka.core.neighboursearch.BallTree",
      "weka.core.converters.XRFFSaver",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Optimization$DynamicIntArray",
      "weka.gui.GenericPropertiesCreator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.trees.j48.BinC45Split",
      "weka.filters.SimpleStreamFilter",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.gui.PropertyText",
      "weka.estimators.IncrementalEstimator",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.classifiers.rules.Rule",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.core.TechnicalInformation$Type",
      "weka.classifiers.trees.lmt.ResidualSplit",
      "weka.core.Copyable",
      "weka.gui.PropertyValueSelector",
      "weka.core.BinarySparseInstance",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.gui.PropertySheetPanel$CapabilitiesHelpDialog",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.core.converters.AbstractSaver",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.Optimization",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.filters.unsupervised.attribute.Center",
      "weka.gui.GenericObjectEditor$GOETreeNode",
      "weka.core.WekaException",
      "weka.classifiers.functions.neural.NeuralNode",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.filters.StreamableFilter",
      "weka.gui.GenericObjectEditor$1",
      "weka.core.Attribute$1",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.PartitionGenerator",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SparseInstance",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.attributeSelection.AttributeTransformer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.trees.j48.C45Split",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionListener",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.gui.CustomPanelSupplier",
      "weka.core.converters.CSVLoader",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.converters.CSVSaver",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.converters.ArffSaver",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.UnassignedDatasetException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.RevisionUtils",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.classifiers.meta.Vote",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ConverterUtils$DataSink",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.xml.XMLInstances",
      "weka.attributeSelection.Ranker",
      "weka.core.TechnicalInformation",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.core.RevisionHandler",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.gui.HierarchyPropertyParser",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.core.converters.AbstractFileSaver",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.RuleStats",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.rules.PART",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.RevisionUtils$Type",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.stemmers.Stemmer",
      "weka.gui.PropertyPanel",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.filters.SimpleFilter",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.estimators.Estimator$Builder",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.converters.XRFFLoader",
      "weka.classifiers.trees.m5.PreConstructedLinearModel",
      "weka.core.tokenizers.Tokenizer",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$ListNode",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$MyIdxList",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.gui.HierarchyPropertyParser$TreeNode",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.gui.PropertySheetPanel",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.gui.GenericObjectEditorHistory",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.matrix.LUDecomposition",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.core.converters.AbstractLoader",
      "weka.classifiers.trees.lmt.ResidualModelSelection",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.classifiers.trees.j48.Distribution",
      "weka.classifiers.rules.JRip",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.core.Range",
      "weka.classifiers.bayes.net.VaryNode",
      "weka.classifiers.Classifier",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.trees.M5P",
      "weka.gui.GenericObjectEditor",
      "weka.core.matrix.QRDecomposition",
      "weka.core.WekaPackageManager",
      "weka.attributeSelection.ASSearch",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.Option",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.functions.neural.NeuralMethod",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.core.Attribute",
      "weka.classifiers.functions.MultilayerPerceptron$NodePanel",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.matrix.LinearRegression",
      "weka.core.FastVector",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.IntervalEstimator",
      "weka.classifiers.rules.DecisionTable$1",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.Matchable",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$2",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$1",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionEvent",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.classifiers.rules.OneR",
      "weka.core.UnassignedClassException",
      "weka.classifiers.trees.m5.SplitEvaluate",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.rules.JRip$Antd",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.gui.GenericObjectEditor$GOEPanel",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.lazy.IBk"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JRip_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.rules.Rule",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.classifiers.rules.JRip$Antd",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.Capabilities$Capability",
      "weka.core.Utils",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.Tag",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.Range",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.TechnicalInformation",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.FastVector",
      "weka.classifiers.rules.RuleStats",
      "weka.core.RevisionUtils",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.Evaluation",
      "weka.core.Option",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.CostMatrix",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.ArffLoader",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.SerializedObject",
      "weka.core.Instances",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.DenseInstance",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.trees.J48",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.SelectedTag",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.WekaException",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.core.AttributeStats",
      "weka.classifiers.trees.LMT",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.estimators.Estimator",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.rules.PART",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.lazy.LWL"
    );
  }
}
