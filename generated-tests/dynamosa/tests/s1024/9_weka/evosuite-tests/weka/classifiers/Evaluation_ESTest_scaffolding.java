/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jul 04 14:03:28 GMT 2019
 */

package weka.classifiers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Evaluation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.Evaluation"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Evaluation_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.clusterers.AbstractClusterer",
      "weka.core.matrix.CholeskyDecomposition",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.core.converters.Saver",
      "weka.core.xml.XMLBasicSerialization",
      "weka.core.neighboursearch.BallTree",
      "weka.core.ClassCache",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.core.Optimization$DynamicIntArray",
      "weka.estimators.UnivariateIntervalEstimator",
      "weka.gui.GenericPropertiesCreator",
      "weka.filters.SimpleStreamFilter",
      "weka.gui.PropertyText",
      "weka.core.stemmers.NullStemmer",
      "weka.core.CustomDisplayStringProvider",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.rules.Rule",
      "weka.clusterers.SimpleKMeans",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.gui.PropertyValueSelector",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Optimization",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.experiment.ResultProducer",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.experiment.InstanceQueryAdapter",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.FindWithCapabilities",
      "weka.core.WekaException",
      "weka.classifiers.functions.neural.NeuralNode",
      "weka.gui.GenericObjectEditor$1",
      "weka.core.Attribute$1",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.PartitionGenerator",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.pmml.PMMLModel",
      "weka.classifiers.pmml.consumer.GeneralRegression",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.gui.CustomPanelSupplier",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.evaluation.TwoClassStats",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.converters.CSVSaver",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.estimators.KernelEstimator",
      "weka.core.converters.ArffSaver",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.UnassignedDatasetException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.StringLocator",
      "weka.filters.MultiFilter",
      "weka.core.GlobalInfoJavadoc",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.trees.LMT",
      "weka.core.Instances",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.DatabaseConnection",
      "weka.core.TechnicalInformation",
      "weka.core.RevisionHandler",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.pmml.consumer.GeneralRegression$ModelType",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.core.converters.AbstractFileSaver",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.CostMatrix",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.stemmers.Stemmer",
      "weka.gui.PropertyPanel",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.clusterers.FarthestFirst",
      "weka.filters.SimpleFilter",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.core.ChebyshevDistance",
      "weka.clusterers.HierarchicalClusterer",
      "weka.estimators.Estimator$Builder",
      "weka.experiment.ResultListener",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$SVM_representation",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.classifiers.functions.Logistic",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.classifiers.trees.m5.PreConstructedLinearModel",
      "weka.core.converters.XRFFLoader",
      "weka.core.tokenizers.Tokenizer",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.core.pmml.FieldMetaInfo",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.pmml.MiningSchema",
      "weka.classifiers.rules.part.ClassifierDecList",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.AbstractInstance",
      "weka.core.converters.LibSVMLoader",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.core.pmml.VectorInstance",
      "weka.core.converters.AbstractLoader",
      "weka.classifiers.trees.lmt.ResidualModelSelection",
      "weka.core.Tag",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.classifiers.trees.j48.Distribution",
      "weka.classifiers.trees.j48.EntropySplitCrit",
      "weka.classifiers.pmml.consumer.GeneralRegression$PCell",
      "weka.core.Range",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.evaluation.ConfusionMatrix",
      "weka.core.pmml.DefineFunction",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.gui.GenericObjectEditor",
      "weka.core.matrix.QRDecomposition",
      "weka.attributeSelection.ASSearch",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.functions.neural.NeuralMethod",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.Attribute",
      "weka.core.pmml.BuiltInMath",
      "weka.core.BatchPredictor",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.IntervalEstimator",
      "weka.core.WeightedInstancesHandler",
      "weka.core.TechnicalInformation$Field",
      "weka.core.converters.DatabaseLoader",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$2",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$1",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionEvent",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.rules.JRip$Antd",
      "weka.core.pmml.PMMLFactory",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.gui.GenericObjectEditor$GOEPanel",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.clusterers.MakeDensityBasedClusterer",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$TempNode",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.filters.UnsupervisedFilter",
      "weka.core.converters.XRFFSaver",
      "weka.classifiers.trees.J48",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.classifiers.functions.SimpleLinearRegression",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.trees.j48.BinC45Split",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.core.converters.JSONLoader",
      "weka.filters.unsupervised.attribute.Add",
      "weka.estimators.IncrementalEstimator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.neighboursearch.KDTree",
      "weka.classifiers.functions.SGDText",
      "weka.core.xml.KOML",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.classifiers.trees.lmt.ResidualSplit",
      "weka.classifiers.pmml.consumer.GeneralRegression$1",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.gui.PropertySheetPanel$CapabilitiesHelpDialog",
      "weka.core.Matrix",
      "weka.core.pmml.BuiltInArithmetic",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.core.converters.AbstractSaver",
      "weka.core.OptionHandlerJavadoc",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.Check",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction",
      "weka.gui.Logger",
      "weka.core.pmml.BuiltInString",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.meta.Stacking",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.gui.GenericObjectEditor$GOETreeNode",
      "weka.core.ClassDiscovery",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$3",
      "weka.filters.StreamableFilter",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$4",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SparseInstance",
      "weka.estimators.PoissonEstimator",
      "weka.attributeSelection.AttributeTransformer",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.trees.j48.C45Split",
      "weka.attributeSelection.PrincipalComponents",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionListener",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.core.converters.CSVLoader",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.clusterers.Clusterer",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$5",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$6",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$7",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$8",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$9",
      "weka.core.pmml.TransformationDictionary",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.pmml.PMMLFactory$PMMLClassifierRunner",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.RevisionUtils",
      "weka.classifiers.meta.RandomCommittee",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.core.converters.C45Loader",
      "weka.classifiers.meta.Vote",
      "weka.core.AttributeStats",
      "weka.clusterers.DensityBasedClusterer",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.converters.AbstractFileLoader",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.pmml.consumer.GeneralRegression$Predictor",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.experiment.Stats",
      "weka.core.pmml.Array$ArrayType",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.gui.HierarchyPropertyParser",
      "weka.core.CheckOptionHandler",
      "weka.core.TestInstances",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.rules.part.C45PruneableDecList",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.classifiers.rules.PART",
      "weka.core.RevisionUtils$Type",
      "weka.classifiers.pmml.consumer.NeuralNetwork$1",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.MinkowskiDistance",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "weka.core.pmml.Function",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel",
      "weka.classifiers.functions.SMO$BinarySMO",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.pmml.TargetMetaInfo",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$ListNode",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$MyIdxList",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.core.Drawable",
      "weka.gui.HierarchyPropertyParser$TreeNode",
      "weka.core.matrix.Matrix",
      "weka.core.ListOptions",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.SingleIndex",
      "weka.clusterers.Cobweb$CNode",
      "weka.gui.PropertySheetPanel",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.pmml.consumer.NeuralNetwork",
      "weka.gui.GenericObjectEditorHistory",
      "weka.core.pmml.VectorDictionary",
      "weka.core.SelectedTag",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$10",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$11",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$12",
      "weka.core.matrix.LUDecomposition",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction$13",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.bayes.BayesNet",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.clusterers.RandomizableClusterer",
      "weka.classifiers.evaluation.Prediction",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$classificationMethod",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.clusterers.Cobweb",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.classifiers.pmml.consumer.GeneralRegression$PPCell",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.classifiers.rules.JRip",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.classifiers.bayes.net.VaryNode",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.pmml.Array",
      "weka.core.pmml.FieldMetaInfo$Optype",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.core.WekaEnumeration",
      "weka.clusterers.HierarchicalClusterer$Node",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.meta.Bagging",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.classifiers.pmml.consumer.NeuralNetwork$Normalization",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.Option",
      "weka.core.pmml.SparseArray",
      "weka.estimators.NormalEstimator",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.filters.Sourcable",
      "weka.classifiers.pmml.consumer.NeuralNetwork$MiningFunction",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.classifiers.functions.MultilayerPerceptron$NodePanel",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.matrix.LinearRegression",
      "weka.core.FastVector",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.lazy.KStar",
      "weka.core.Matchable",
      "weka.classifiers.bayes.net.ADNode",
      "weka.clusterers.ClusterEvaluation",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.Javadoc",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.rules.part.PruneableDecList",
      "weka.core.UnassignedClassException",
      "weka.classifiers.trees.m5.SplitEvaluate",
      "weka.classifiers.rules.ZeroR",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.lazy.IBk"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Evaluation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.Evaluation",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.xml.KOML",
      "weka.core.Version",
      "weka.core.Utils",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.C45Loader",
      "weka.core.converters.CSVLoader",
      "weka.core.Range",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.Bagging",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.trees.REPTree",
      "weka.core.Option",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.converters.JSONLoader",
      "weka.core.Instances",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.classifiers.CostMatrix",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.clusterers.ClusterEvaluation",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.ArffLoader",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.gui.GenericPropertiesCreator",
      "weka.core.ClassDiscovery",
      "weka.core.ClassCache",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.core.TestInstances",
      "weka.experiment.InstanceQuery",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.converters.SVMLightLoader",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.Capabilities",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.core.converters.MatlabLoader",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.WekaException",
      "weka.classifiers.trees.J48",
      "weka.core.Tag",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.Capabilities$Capability",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.SelectedTag",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.SerializedObject",
      "weka.core.RevisionUtils",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Javadoc",
      "weka.core.TechnicalInformationHandlerJavadoc",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.estimators.Estimator",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.rules.JRip",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.UnassignedClassException",
      "weka.classifiers.functions.SMO",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.classifiers.rules.OneR",
      "weka.core.AttributeStats",
      "weka.experiment.Stats",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.clusterers.Cobweb",
      "weka.core.ListOptions",
      "weka.estimators.KernelEstimator",
      "weka.estimators.PoissonEstimator",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.trees.LMT",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.meta.Vote",
      "weka.clusterers.HierarchicalClusterer",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.trees.RandomForest",
      "weka.estimators.NormalEstimator",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.functions.SGD",
      "weka.core.GlobalInfoJavadoc",
      "weka.classifiers.functions.supportVector.Puk",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.core.MinkowskiDistance",
      "weka.clusterers.FarthestFirst",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.Check",
      "weka.core.CheckOptionHandler",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel",
      "weka.classifiers.pmml.consumer.NeuralNetwork$MiningFunction",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$classificationMethod",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel$SVM_representation",
      "weka.core.pmml.VectorDictionary",
      "weka.core.matrix.Matrix",
      "weka.classifiers.pmml.consumer.GeneralRegression$PPCell",
      "weka.classifiers.evaluation.NumericPrediction",
      "weka.classifiers.evaluation.Prediction",
      "weka.core.OptionHandlerJavadoc",
      "weka.core.ChebyshevDistance",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.classifiers.pmml.consumer.NeuralNetwork",
      "weka.classifiers.pmml.consumer.NeuralNetwork$ActivationFunction",
      "weka.classifiers.pmml.consumer.NeuralNetwork$Normalization",
      "weka.classifiers.evaluation.ThresholdCurve"
    );
  }
}
