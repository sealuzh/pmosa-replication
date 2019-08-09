/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 03 11:40:10 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TiffImageWriterBase_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TiffImageWriterBase_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.common.itu_t4.T4_T6_Tables$Entry",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants",
      "org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream",
      "org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants",
      "org.apache.commons.imaging.common.itu_t4.HuffmanTree$1",
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.common.mylzw.MyBitOutputStream",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.formats.tiff.TiffImageData",
      "org.apache.commons.imaging.formats.tiff.TiffImageData$Data",
      "org.apache.commons.imaging.common.ImageBuilder",
      "org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.common.mylzw.MyLzwCompressor$ByteArray",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.formats.tiff.JpegImageData",
      "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants",
      "org.apache.commons.imaging.common.itu_t4.HuffmanTreeException",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSet",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.common.mylzw.MyLzwCompressor$Listener",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs",
      "org.apache.commons.imaging.common.RationalNumber$Option",
      "org.apache.commons.imaging.common.itu_t4.HuffmanTree",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.tiff.constants.WangTagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffImageData$Tiles",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.FormatCompliance",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.common.ByteConversions",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte",
      "org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns",
      "org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.formats.tiff.TiffReader$Listener",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem$Value",
      "org.apache.commons.imaging.formats.tiff.TiffImageData$Strips",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.TiffElement$1",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary",
      "org.apache.commons.imaging.util.Debug",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory$ImageDataElement",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless",
      "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy",
      "org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$2",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$1",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary$OffsetItem",
      "org.apache.commons.imaging.formats.tiff.constants.TiffConstants",
      "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled",
      "org.apache.commons.imaging.formats.tiff.TiffElement$DataElement",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase",
      "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.tiff.TiffTags",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.tiff.TiffHeader",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny",
      "org.apache.commons.imaging.common.itu_t4.HuffmanTree$Node",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$BufferOutputStream",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.TiffReader$FirstDirectoryCollector",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.common.mylzw.MyLzwCompressor",
      "org.apache.commons.imaging.common.BinaryOutputStream",
      "org.apache.commons.imaging.formats.tiff.TiffElement$Stub",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.common.itu_t4.T4_T6_Tables",
      "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputField",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants",
      "org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.TiffReader$Collector",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.formats.tiff.TiffImageData$ByteSourceData",
      "org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants",
      "org.apache.commons.imaging.common.itu_t4.T4AndT6Compression",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants",
      "org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets",
      "org.apache.commons.imaging.formats.tiff.TiffContents",
      "org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$2",
      "org.apache.commons.imaging.formats.tiff.TiffReader",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$1",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TiffImageWriterBase_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase",
      "org.apache.commons.imaging.formats.tiff.constants.TiffConstants",
      "org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefined",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUnknowns",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDirectory",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.constants.ExifTagConstants",
      "org.apache.commons.imaging.common.itu_t4.T4_T6_Tables$Entry",
      "org.apache.commons.imaging.common.itu_t4.T4_T6_Tables",
      "org.apache.commons.imaging.common.itu_t4.HuffmanTree",
      "org.apache.commons.imaging.common.itu_t4.HuffmanTree$Node",
      "org.apache.commons.imaging.common.itu_t4.T4AndT6Compression",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAny",
      "org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$1",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$1",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless$2",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless",
      "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSet",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.common.BinaryOutputStream",
      "org.apache.commons.imaging.common.ImageBuilder",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.FormatCompliance",
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.formats.tiff.TiffReader",
      "org.apache.commons.imaging.formats.tiff.TiffReader$Collector",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.tiff.TiffElement$1",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputField",
      "org.apache.commons.imaging.common.ByteConversions",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary$OffsetItem",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$2",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.util.Debug",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem$Value",
      "org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.common.RationalNumber$Option",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte",
      "org.apache.commons.imaging.formats.tiff.TiffElement$DataElement",
      "org.apache.commons.imaging.formats.tiff.TiffImageData$Data",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs",
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongOrIFD",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePageMaker6TagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AdobePhotoshopTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.AliasSketchbookProTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.DcfTagConstants",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.formats.tiff.constants.DngTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GeoTiffTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.GdalLibraryTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.HylaFaxTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftTagConstants",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.formats.tiff.constants.MicrosoftHdPhotoTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.MolecularDynamicsGelTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.Rfc2301TagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.Tiff4TagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.TiffEpTagConstants",
      "org.apache.commons.imaging.formats.tiff.constants.WangTagConstants",
      "org.apache.commons.imaging.formats.tiff.TiffTags",
      "org.apache.commons.imaging.common.mylzw.MyLzwCompressor",
      "org.apache.commons.imaging.common.mylzw.MyLzwCompressor$ByteArray",
      "org.apache.commons.imaging.common.mylzw.MyBitOutputStream",
      "org.apache.commons.imaging.formats.tiff.TiffImageData",
      "org.apache.commons.imaging.formats.tiff.TiffImageData$Strips",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets",
      "org.apache.commons.imaging.formats.tiff.JpegImageData",
      "org.apache.commons.imaging.common.itu_t4.BitInputStreamFlexible",
      "org.apache.commons.imaging.common.itu_t4.BitArrayOutputStream"
    );
  }
}