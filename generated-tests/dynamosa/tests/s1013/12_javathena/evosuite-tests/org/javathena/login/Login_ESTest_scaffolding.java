/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 03 19:02:47 GMT 2019
 */

package org.javathena.login;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Login_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.javathena.login.Login"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/12_javathena"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Login_ESTest_scaffolding.class.getClassLoader() ,
      "com.thoughtworks.xstream.XStream",
      "org.javathena.core.utiles.Functions",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "javolution.lang.Reflection$1",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$1",
      "org.javathena.login.Login$ConnectionListener",
      "javolution.lang.Reflection$3",
      "javolution.lang.Reflection$2",
      "javolution.lang.Reflection$4",
      "org.javathena.data.XMLDBManagementLogin",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "javolution.util.FastMap$KeySet",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "javolution.util.FastMap$EntrySet$1",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "org.javathena.utiles.sql.MySQLConfig",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "javolution.lang.Configurable$1",
      "com.mysql.jdbc.CachedResultSetMetaData",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.mysql.jdbc.ConnectionFeatureNotAvailableException",
      "com.thoughtworks.xstream.alias.ClassMapper",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "javolution.lang.Reference",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider$Visitor",
      "com.thoughtworks.xstream.converters.MarshallingContext",
      "com.mysql.jdbc.MysqlIO",
      "com.mysql.jdbc.Connection",
      "com.mysql.jdbc.NotUpdatable",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "org.javathena.conf.LoginAthena",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "org.javathena.login.Login$Timer_interval_check_auth_sync",
      "javolution.context.ObjectFactory$2",
      "javolution.context.ObjectFactory$1",
      "com.mysql.jdbc.SingleByteCharsetConverter",
      "com.thoughtworks.xstream.io.HierarchicalStreamReader",
      "com.mysql.jdbc.PingTarget",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.mysql.jdbc.SocketFactory",
      "javolution.context.PersistentContext",
      "com.thoughtworks.xstream.mapper.CannotResolveClassException",
      "javolution.lang.Immutable",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.mysql.jdbc.PacketTooBigException",
      "javolution.xml.XMLSerializable",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.AnnotationConfiguration",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyWriter",
      "com.thoughtworks.xstream.core.util.FastStack",
      "javolution.util.FastComparator$Lexical",
      "org.javathena.core.utiles.Constants$SUBTYPE",
      "com.thoughtworks.xstream.converters.ConversionException",
      "com.mysql.jdbc.log.Log",
      "com.thoughtworks.xstream.core.TreeMarshaller$CircularReferenceException",
      "org.javathena.core.utiles.Constants$MAPID",
      "com.mysql.jdbc.StringUtils",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "org.javathena.data.TXTDBManagement",
      "com.mysql.jdbc.ResultSetImpl",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "javolution.util.FastMap$ValueIterator$1",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "javolution.util.FastComparator$Rehash",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.UnmarshallingContext",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "javolution.text.Text",
      "com.mysql.jdbc.UpdatableResultSet",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "javolution.context.ConcurrentContext",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.mysql.jdbc.Statement",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.mysql.jdbc.Buffer",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.mysql.jdbc.ParameterBindings",
      "com.mysql.jdbc.BufferRow",
      "org.javathena.core.utiles.Constants$ITEM_GROUP",
      "com.thoughtworks.xstream.io.HierarchicalStreamWriter",
      "org.javathena.core.utiles.ACO",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.core.AbstractReferenceUnmarshaller",
      "com.mysql.jdbc.exceptions.MySQLTimeoutException",
      "com.mysql.jdbc.Util",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "javolution.util.FastMap$ValueIterator",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "javolution.lang.Configurable$Logic",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.mysql.jdbc.CommunicationsException",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper",
      "com.thoughtworks.xstream.core.BaseException",
      "javolution.lang.Realtime",
      "javolution.lang.Reflection$DefaultConstructor",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.TreeMarshaller",
      "com.thoughtworks.xstream.converters.ConverterRegistry",
      "javolution.context.Allocator",
      "com.thoughtworks.xstream.core.TreeUnmarshaller",
      "org.javathena.core.data.Excecutable",
      "com.mysql.jdbc.CompressedInputStream",
      "javolution.lang.Reusable",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshaller",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "javolution.context.Context$Root",
      "com.mysql.jdbc.ResultSetRow",
      "javolution.lang.Reflection$ReflectConstructor",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "javolution.util.FastCollection",
      "com.thoughtworks.xstream.InitializationException",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "javolution.util.FastCollection$Unmodifiable",
      "com.mysql.jdbc.JDBC4UpdatableResultSet",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.mysql.jdbc.JDBC4PreparedStatement",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller$ReferencedImplicitElementException",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$CustomGetField",
      "org.javathena.login.Login",
      "javolution.context.ObjectFactory",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.reflection.ObjectAccessException",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper$ImplicitCollectionMapperForClass",
      "org.javathena.login.parse.FromAdmin",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "javolution.util.FastComparator$Default",
      "javolution.context.AllocatorContext$1",
      "javolution.context.HeapContext$2",
      "com.thoughtworks.xstream.io.WriterWrapper",
      "javolution.context.HeapContext$1",
      "org.javathena.utiles.ConfigurationManagement",
      "javolution.util.FastTable$1",
      "org.javathena.login.parse.FromClient",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$WeakIdWrapper",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "com.mysql.jdbc.Messages",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.mapper.Mapper$ImplicitCollectionMapping",
      "javolution.util.FastComparator$Identity",
      "javolution.lang.Reflection",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$2",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$1",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "javolution.util.FastComparator$1",
      "com.mysql.jdbc.ByteArrayRow",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "javolution.context.ConcurrentContext$Default$1",
      "javolution.util.FastCollection$Record",
      "com.thoughtworks.xstream.io.xml.AbstractXmlWriter",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "javolution.context.AllocatorContext",
      "javolution.lang.Reflection$Constructor",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller",
      "com.mysql.jdbc.JDBC4ServerPreparedStatement",
      "javolution.util.FastMap$EntrySet",
      "javolution.context.HeapContext$HeapAllocator",
      "com.mysql.jdbc.Extension",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "org.javathena.core.utiles.Constants$BL",
      "javolution.context.LocalContext$Reference",
      "org.javathena.data.IDBManagementLogin",
      "javolution.util.FastMap$Values",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$CustomPutField",
      "javolution.util.FastComparator",
      "com.mysql.jdbc.StatementImpl",
      "org.javathena.core.data.Auth_data",
      "javolution.lang.Reflection$Method",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider$1",
      "com.mysql.jdbc.ServerPreparedStatement$BindValue",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "javolution.context.Context$1",
      "com.mysql.jdbc.OperationNotSupportedException",
      "org.javathena.core.data.Socket_data",
      "javolution.util.FastComparator$StringComparator",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.mysql.jdbc.StatementImpl$CancelTask$1",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.core.util.FastField",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "javolution.context.ObjectFactory$Generic",
      "org.javathena.core.utiles.Constants$ELEMENT",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.mysql.jdbc.StatementImpl$CancelTask",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.core.util.Pool$Factory",
      "javolution.util.FastMap$Unmodifiable",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.MapBackedDataHolder",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$1",
      "javolution.text.CharSet",
      "com.mysql.jdbc.exceptions.MySQLTransientException",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.io.StreamException",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "org.javathena.core.utiles.MultilanguageManagement",
      "com.mysql.jdbc.MySQLConnection",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper$ImplicitCollectionMappingImpl",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "javolution.context.ConcurrentContext$Default",
      "org.javathena.core.utiles.Constants$RACE",
      "javolution.util.FastMap$1",
      "com.thoughtworks.xstream.io.path.Path",
      "javolution.util.FastMap$2",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$IdWrapper",
      "javolution.util.FastMap$5",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "javolution.util.FastMap$6",
      "javolution.util.FastMap$3",
      "com.mysql.jdbc.JDBC4ResultSet",
      "javolution.util.FastMap$9",
      "javolution.util.FastMap$7",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "javolution.text.TextBuilder",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper$NamedItemType",
      "javolution.util.FastMap$EntryIterator",
      "javolution.lang.Reflection$ReflectMethod",
      "com.thoughtworks.xstream.alias.CannotResolveClassException",
      "org.javathena.core.utiles.Constants",
      "com.mysql.jdbc.Util$RandStructcture",
      "com.mysql.jdbc.exceptions.MySQLStatementCancelledException",
      "javolution.util.FastMap$EntryIterator$1",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.mysql.jdbc.PreparedStatement",
      "org.javathena.login.sql.data.Auth_data_SQL",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.mysql.jdbc.util.ReadAheadInputStream",
      "org.javathena.core.data.SessionType",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.ReferenceByXPathUnmarshaller",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "org.javathena.login.Login$End",
      "com.mysql.jdbc.MysqlDataTruncation",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.converters.DataHolder",
      "com.mysql.jdbc.Field",
      "com.mysql.jdbc.PreparedStatement$BatchVisitor",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "javolution.util.FastMap$Entry",
      "javolution.util.FastComparator$Direct",
      "javolution.io.UTF8StreamWriter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.core.util.QuickWriter",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "javolution.context.ConcurrentThread",
      "javolution.lang.ValueType",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.mysql.jdbc.ConnectionProperties",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "javolution.util.FastMap$KeyIterator",
      "javolution.context.ConcurrentContext$2",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "javolution.util.FastMap$KeyIterator$1",
      "javolution.JavolutionError",
      "com.mysql.jdbc.Driver",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "javolution.context.ConcurrentContext$1",
      "com.mysql.jdbc.ServerPreparedStatement",
      "javolution.util.FastTable",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "javolution.context.HeapContext",
      "javolution.context.LocalContext",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$Wrapper",
      "com.mysql.jdbc.exceptions.MySQLNonTransientException",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriter",
      "org.javathena.login.UserManagement",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "javolution.text.TextBuilder$1",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "javolution.lang.Configurable",
      "javolution.context.Context",
      "com.mysql.jdbc.RowData",
      "org.javathena.login.parse.FromChar",
      "org.javathena.data.MySQLDBManagement",
      "javolution.util.FastMap",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldKeySorter",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.mysql.jdbc.PreparedStatement$ParseInfo",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "javolution.context.ConcurrentException",
      "com.thoughtworks.xstream.io.path.PathTrackingWriter",
      "javolution.context.PersistentContext$Reference",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.core.util.Pool",
      "org.javathena.core.data.IParse",
      "com.mysql.jdbc.StreamingNotifiable",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "com.mysql.jdbc.ResultSetInternalMethods",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.io.xml.PrettyPrintWriter",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "javolution.text.Text$2",
      "javolution.text.Text$1",
      "com.thoughtworks.xstream.io.path.PathTracker",
      "javolution.text.Text$4",
      "com.mysql.jdbc.NonRegisteringDriver",
      "javolution.text.Text$3",
      "com.thoughtworks.xstream.io.xml.DomDriver",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.mysql.jdbc.ExceptionInterceptor",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.javathena.core.data.Auth_data", false, Login_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Login_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.javathena.login.Login",
      "org.javathena.login.Login$End",
      "org.javathena.login.Login$ConnectionListener",
      "org.javathena.login.Login$Timer_interval_check_auth_sync",
      "org.javathena.core.utiles.Constants$BL",
      "org.javathena.core.utiles.Constants",
      "org.javathena.core.utiles.MultilanguageManagement",
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.io.xml.DomDriver",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper$WeakHashSet",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "org.javathena.conf.LoginAthena",
      "javolution.util.FastCollection",
      "javolution.context.Allocator",
      "javolution.context.ObjectFactory$1",
      "javolution.context.ObjectFactory",
      "javolution.util.FastTable$1",
      "javolution.context.ObjectFactory$2",
      "javolution.util.FastTable",
      "javolution.lang.Configurable$Logic",
      "javolution.lang.Configurable$1",
      "javolution.lang.Configurable",
      "javolution.util.FastComparator$1",
      "javolution.util.FastComparator$Default",
      "javolution.util.FastComparator$Direct",
      "javolution.util.FastComparator$Rehash",
      "javolution.util.FastComparator$StringComparator",
      "javolution.util.FastComparator$Identity",
      "javolution.util.FastComparator$Lexical",
      "javolution.util.FastComparator",
      "org.javathena.utiles.ConfigurationManagement",
      "javolution.util.FastMap$9",
      "javolution.util.FastMap",
      "javolution.util.FastMap$Entry",
      "org.javathena.login.UserManagement",
      "org.javathena.core.utiles.ACO",
      "org.javathena.utiles.sql.MySQLConfig",
      "javolution.util.FastMap$7",
      "javolution.util.FastMap$KeySet",
      "org.javathena.data.MySQLDBManagement",
      "org.javathena.core.utiles.Functions",
      "org.javathena.login.parse.FromChar",
      "org.javathena.core.data.Socket_data",
      "javolution.context.PersistentContext$Reference",
      "javolution.util.FastMap$1",
      "javolution.context.Context$Root",
      "javolution.context.Context$1",
      "javolution.context.Context",
      "javolution.context.PersistentContext",
      "org.javathena.core.data.Auth_data",
      "javolution.util.FastMap$5",
      "javolution.util.FastMap$Values",
      "javolution.util.FastMap$ValueIterator$1",
      "javolution.util.FastMap$ValueIterator",
      "javolution.context.HeapContext$1",
      "javolution.context.HeapContext$2",
      "javolution.context.HeapContext",
      "javolution.context.AllocatorContext$1",
      "javolution.context.AllocatorContext",
      "javolution.context.HeapContext$HeapAllocator",
      "org.javathena.data.TXTDBManagement",
      "javolution.util.FastMap$KeyIterator$1",
      "javolution.util.FastMap$KeyIterator",
      "org.javathena.data.XMLDBManagementLogin",
      "com.thoughtworks.xstream.io.xml.AbstractXmlWriter",
      "com.thoughtworks.xstream.io.xml.PrettyPrintWriter",
      "com.thoughtworks.xstream.core.util.FastStack",
      "com.thoughtworks.xstream.core.util.QuickWriter",
      "com.thoughtworks.xstream.core.TreeMarshaller",
      "com.thoughtworks.xstream.core.AbstractReferenceMarshaller",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshaller",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary",
      "com.thoughtworks.xstream.io.path.PathTracker",
      "com.thoughtworks.xstream.io.WriterWrapper",
      "com.thoughtworks.xstream.io.path.PathTrackingWriter",
      "com.thoughtworks.xstream.io.ExtendedHierarchicalStreamWriterHelper",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "com.thoughtworks.xstream.io.path.Path",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$IdWrapper",
      "com.thoughtworks.xstream.core.util.ObjectIdDictionary$WeakIdWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$1",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "com.thoughtworks.xstream.core.MapBackedDataHolder",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$1",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter$2",
      "org.javathena.login.parse.FromAdmin",
      "com.thoughtworks.xstream.core.util.FastField",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.XStreamException",
      "com.thoughtworks.xstream.io.StreamException",
      "com.mysql.jdbc.NonRegisteringDriver",
      "com.mysql.jdbc.Driver",
      "com.mysql.jdbc.StringUtils",
      "com.mysql.jdbc.Messages",
      "com.mysql.jdbc.Util",
      "org.javathena.login.parse.FromClient",
      "javolution.util.FastMap$2",
      "javolution.util.FastMap$6",
      "javolution.util.FastMap$EntrySet",
      "javolution.util.FastMap$EntrySet$1",
      "javolution.util.FastMap$EntryIterator$1",
      "javolution.util.FastMap$EntryIterator",
      "javolution.text.Text$1",
      "javolution.text.Text$2",
      "javolution.io.UTF8StreamWriter",
      "javolution.text.Text$3",
      "javolution.text.Text$4",
      "javolution.text.Text",
      "com.thoughtworks.xstream.converters.ConversionException",
      "javolution.util.FastMap$3",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider$1"
    );
  }
}
