/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jul 04 18:03:56 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TiffField_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.imaging.formats.tiff.TiffField"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/8_image"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TiffField_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.util.Debug",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.tiff.TiffTags",
      "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.common.RationalNumber$Option",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.formats.tiff.constants.WangTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.common.ByteConversions",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns",
      "org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement",
      "org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.TiffElement$1",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TiffField_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.formats.tiff.TiffElement$1",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement",
      "org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny",
      "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.WangTagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffTags",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.common.ByteConversions",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.common.RationalNumber$Option",
      "org.apache.commons.imaging.util.Debug"
    );
  }
}
