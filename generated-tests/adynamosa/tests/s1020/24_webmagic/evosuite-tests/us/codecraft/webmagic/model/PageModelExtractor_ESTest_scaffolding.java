/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 23 06:25:05 GMT 2019
 */

package us.codecraft.webmagic.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PageModelExtractor_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "us.codecraft.webmagic.model.PageModelExtractor"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/24_webmagic"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PageModelExtractor_ESTest_scaffolding.class.getClassLoader() ,
      "us.codecraft.webmagic.scheduler.Scheduler",
      "us.codecraft.webmagic.model.annotation.ExtractBy$Type",
      "us.codecraft.webmagic.model.annotation.ComboExtract$Source",
      "us.codecraft.webmagic.model.HttpRequestBody",
      "us.codecraft.webmagic.selector.Selectors",
      "us.codecraft.webmagic.pipeline.Pipeline",
      "us.codecraft.webmagic.utils.ExtractorUtils$1",
      "us.codecraft.webmagic.selector.Selector",
      "us.codecraft.webmagic.Spider$Status",
      "us.codecraft.webmagic.selector.RegexResult",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$CharactorFormatter",
      "us.codecraft.webmagic.model.annotation.HelpUrl",
      "us.codecraft.webmagic.selector.CssSelector",
      "us.codecraft.webmagic.model.Extractor$Source",
      "us.codecraft.webmagic.selector.BaseElementSelector",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$ShortFormatter",
      "us.codecraft.webmagic.selector.HtmlNode",
      "us.codecraft.webmagic.selector.Html",
      "us.codecraft.webmagic.selector.OrSelector",
      "us.codecraft.webmagic.model.annotation.ExtractBy",
      "us.codecraft.webmagic.model.annotation.ExtractByUrl",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$FloatFormatter",
      "us.codecraft.webmagic.model.formatter.ObjectFormatter",
      "us.codecraft.webmagic.model.AfterExtractor",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$ByteFormatter",
      "us.codecraft.webmagic.Site",
      "us.codecraft.webmagic.model.annotation.ExtractBy$Source",
      "us.codecraft.webmagic.Request",
      "us.codecraft.webmagic.utils.ExtractorUtils",
      "us.codecraft.webmagic.model.PageModelExtractor$1",
      "us.codecraft.webmagic.model.ModelPageProcessor",
      "us.codecraft.webmagic.selector.ElementSelector",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$IntegerFormatter",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$DoubleFormatter",
      "us.codecraft.webmagic.selector.AbstractSelectable",
      "us.codecraft.webmagic.selector.AndSelector",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$LongFormatter",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$BooleanFormatter",
      "us.codecraft.webmagic.selector.SmartContentSelector",
      "us.codecraft.webmagic.selector.ReplaceSelector",
      "us.codecraft.webmagic.model.FieldExtractor",
      "us.codecraft.webmagic.processor.PageProcessor",
      "us.codecraft.webmagic.model.annotation.ComboExtract",
      "us.codecraft.webmagic.model.Extractor",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter",
      "us.codecraft.webmagic.selector.Json",
      "us.codecraft.webmagic.selector.Selectable",
      "us.codecraft.webmagic.model.PageModelExtractor",
      "us.codecraft.webmagic.selector.PlainText",
      "us.codecraft.webmagic.pipeline.CollectorPipeline",
      "us.codecraft.webmagic.Spider",
      "us.codecraft.webmagic.model.OOSpider",
      "us.codecraft.webmagic.utils.ClassUtils",
      "us.codecraft.webmagic.selector.XpathSelector",
      "us.codecraft.webmagic.downloader.Downloader",
      "us.codecraft.webmagic.model.samples.OschinaAnswer",
      "us.codecraft.webmagic.Page",
      "us.codecraft.webmagic.selector.RegexSelector",
      "us.codecraft.webmagic.model.annotation.ComboExtract$Op",
      "us.codecraft.webmagic.pipeline.PageModelPipeline",
      "us.codecraft.webmagic.ResultItems",
      "us.codecraft.webmagic.model.samples.DianpingFtlDataScanner",
      "us.codecraft.webmagic.model.annotation.TargetUrl",
      "us.codecraft.webmagic.selector.JsonPathSelector",
      "us.codecraft.webmagic.Task"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PageModelExtractor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "us.codecraft.webmagic.model.PageModelExtractor",
      "us.codecraft.webmagic.model.annotation.ExtractBy$Type",
      "us.codecraft.webmagic.model.annotation.ExtractBy$Source",
      "us.codecraft.webmagic.model.Extractor$Source",
      "us.codecraft.webmagic.model.annotation.ComboExtract$Op",
      "us.codecraft.webmagic.model.PageModelExtractor$1",
      "us.codecraft.webmagic.utils.ExtractorUtils$1",
      "us.codecraft.webmagic.model.annotation.ComboExtract$Source",
      "us.codecraft.webmagic.utils.ClassUtils",
      "us.codecraft.webmagic.Page",
      "us.codecraft.webmagic.ResultItems",
      "us.codecraft.webmagic.model.Extractor",
      "us.codecraft.webmagic.selector.AndSelector",
      "us.codecraft.webmagic.selector.JsonPathSelector",
      "us.codecraft.webmagic.utils.ExtractorUtils",
      "us.codecraft.webmagic.selector.RegexSelector",
      "us.codecraft.webmagic.Request",
      "us.codecraft.webmagic.selector.SmartContentSelector",
      "us.codecraft.webmagic.selector.OrSelector",
      "us.codecraft.webmagic.selector.AbstractSelectable",
      "us.codecraft.webmagic.selector.PlainText",
      "us.codecraft.webmagic.selector.Json",
      "us.codecraft.webmagic.selector.ReplaceSelector",
      "us.codecraft.webmagic.model.samples.OschinaAnswer",
      "us.codecraft.webmagic.model.samples.DianpingFtlDataScanner",
      "us.codecraft.webmagic.model.HttpRequestBody",
      "us.codecraft.webmagic.model.FieldExtractor",
      "us.codecraft.webmagic.Site",
      "us.codecraft.webmagic.Spider",
      "us.codecraft.webmagic.model.OOSpider",
      "us.codecraft.webmagic.model.ModelPageProcessor",
      "us.codecraft.webmagic.selector.Selectors",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter",
      "us.codecraft.webmagic.model.formatter.BasicTypeFormatter$IntegerFormatter"
    );
  }
}
