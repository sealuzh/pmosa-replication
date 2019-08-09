/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 22 09:56:46 GMT 2019
 */

package org.jsecurity.web;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultWebSecurityManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsecurity.web.DefaultWebSecurityManager"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/14_jsecurity"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsecurity.web.attr.WebAttribute",
      "org.jsecurity.codec.CodecException",
      "org.jsecurity.authc.IncorrectCredentialsException",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeoutException",
      "org.jsecurity.cache.HashtableCache",
      "org.jsecurity.util.PermissionUtils",
      "net.sf.ehcache.config.ConfigurationHelper",
      "net.sf.ehcache.util.PropertyUtil",
      "org.jsecurity.session.mgt.eis.SessionDAO",
      "org.jsecurity.authc.AuthenticationToken",
      "org.jsecurity.authc.Account",
      "org.apache.log4j.Level",
      "org.jsecurity.authc.SimpleAuthenticationInfo",
      "org.jsecurity.authz.AuthorizingAccount",
      "org.jsecurity.authz.SimpleAuthorizationInfo",
      "org.apache.log4j.spi.Filter",
      "org.jsecurity.authc.MergableAuthenticationInfo",
      "edu.emory.mathcs.backport.java.util.concurrent.BlockingQueue",
      "org.jsecurity.cache.ehcache.EhCacheManager",
      "edu.emory.mathcs.backport.java.util.concurrent.RejectedExecutionException",
      "org.jsecurity.session.SessionListener",
      "org.apache.log4j.Layout",
      "org.jsecurity.authz.Authorizer",
      "net.sf.ehcache.Cache",
      "org.jsecurity.authz.permission.WildcardPermission",
      "org.jsecurity.util.Destroyable",
      "org.jsecurity.session.SessionException",
      "net.sf.ehcache.config.BeanHandler$ElementInfo",
      "org.jsecurity.web.attr.AbstractWebAttribute",
      "org.jsecurity.authc.AccountException",
      "org.jsecurity.subject.MutablePrincipalCollection",
      "net.sf.ehcache.distribution.CacheManagerPeerListener",
      "net.sf.ehcache.loader.CacheLoader",
      "org.jsecurity.crypto.BlowfishCipher",
      "org.jsecurity.session.ProxiedSession",
      "net.sf.ehcache.config.Configuration",
      "org.jsecurity.authz.SimpleAuthorizingAccount",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock",
      "org.jsecurity.io.Serializer",
      "org.apache.log4j.Hierarchy",
      "org.jsecurity.subject.AbstractRememberMeManager",
      "net.sf.ehcache.CacheException",
      "net.sf.ehcache.bootstrap.BootstrapCacheLoader",
      "org.jsecurity.session.StoppedSessionException",
      "org.jsecurity.authz.UnauthenticatedException",
      "org.jsecurity.authc.Authenticator",
      "org.jsecurity.authc.pam.ModularRealmAuthenticator",
      "net.sf.jsr107cache.CacheEntry",
      "edu.emory.mathcs.backport.java.util.concurrent.ThreadPoolExecutor$AbortPolicy",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.jsecurity.codec.Base64",
      "net.sf.jsr107cache.CacheStatistics",
      "org.apache.log4j.spi.OptionHandler",
      "net.sf.ehcache.config.CacheConfiguration$CacheExtensionFactoryConfiguration",
      "org.jsecurity.authc.credential.Md5CredentialsMatcher",
      "net.sf.ehcache.store.LruMemoryStore$SpoolingLinkedHashMap",
      "edu.emory.mathcs.backport.java.util.concurrent.helpers.FIFOWaitQueue",
      "org.jsecurity.authc.pam.FirstSuccessfulAuthenticationStrategy",
      "org.jsecurity.authz.SimpleRole",
      "org.jsecurity.authz.Permission",
      "org.jsecurity.web.session.WebSessionManager",
      "org.jsecurity.realm.text.TextConfigurationRealm",
      "org.jsecurity.session.mgt.eis.MemorySessionDAO",
      "org.jsecurity.mgt.AuthorizingSecurityManager",
      "org.apache.log4j.helpers.OptionConverter",
      "org.jsecurity.JSecurityException",
      "net.sf.ehcache.Ehcache",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$7",
      "net.sf.ehcache.Status",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$6",
      "org.jsecurity.authc.AuthenticationInfo",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$5",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$4",
      "org.jsecurity.session.mgt.SessionManager",
      "org.jsecurity.session.mgt.AbstractValidatingSessionManager",
      "org.jsecurity.cache.CacheException",
      "org.jsecurity.subject.DelegatingSubject$1",
      "org.apache.log4j.or.ObjectRenderer",
      "org.jsecurity.cache.Cache",
      "org.jsecurity.realm.AuthorizingRealm",
      "edu.emory.mathcs.backport.java.util.concurrent.ExecutionException",
      "org.jsecurity.subject.DelegatingSubject",
      "net.sf.ehcache.exceptionhandler.CacheExceptionHandler",
      "org.jsecurity.authc.pam.AtLeastOneSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.authc.credential.HashedCredentialsMatcher",
      "net.sf.ehcache.Statistics",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$3",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$2",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit$1",
      "org.apache.log4j.Category",
      "org.jsecurity.crypto.hash.Hash",
      "org.jsecurity.authc.LockedAccountException",
      "org.jsecurity.web.DefaultWebSecurityManager",
      "net.sf.ehcache.store.DiskStore$SpoolAndExpiryThread",
      "org.jsecurity.web.attr.RequestParamAttribute",
      "net.sf.ehcache.Element",
      "net.sf.ehcache.jcache.JCache",
      "edu.emory.mathcs.backport.java.util.concurrent.AbstractExecutorService",
      "org.jsecurity.realm.Realm",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.CondVar",
      "org.jsecurity.session.InvalidSessionException",
      "net.sf.ehcache.event.CacheManagerEventListenerRegistry",
      "org.jsecurity.util.CollectionUtils",
      "org.jsecurity.authc.LogoutAware",
      "net.sf.ehcache.ObjectExistsException",
      "net.sf.ehcache.event.CacheManagerEventListener",
      "org.jsecurity.mgt.CachingSecurityManager",
      "org.apache.log4j.spi.LocationInfo",
      "org.jsecurity.authz.ModularRealmAuthorizer",
      "org.apache.log4j.PropertyWatchdog",
      "org.jsecurity.realm.AuthenticatingRealm",
      "net.sf.jsr107cache.CacheLoader",
      "org.jsecurity.session.mgt.AbstractSessionManager",
      "org.jsecurity.util.Initializable",
      "org.jsecurity.cache.ehcache.EhCache",
      "net.sf.ehcache.store.LfuMemoryStore",
      "org.jsecurity.util.JavaEnvironment",
      "net.sf.ehcache.store.LfuPolicy$Metadata",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock$FairSync",
      "org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.util.InstantiationException",
      "org.jsecurity.authz.HostUnauthorizedException",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock$Sync",
      "org.jsecurity.web.SavedRequest",
      "org.jsecurity.util.StringUtils",
      "edu.emory.mathcs.backport.java.util.concurrent.ThreadPoolExecutor$Worker",
      "org.jsecurity.authc.UsernamePasswordToken",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.jsecurity.mgt.SessionsSecurityManager",
      "org.jsecurity.authz.AuthorizationInfo",
      "org.jsecurity.io.DefaultSerializer",
      "org.apache.log4j.Priority",
      "org.jsecurity.session.SessionFactory",
      "org.jsecurity.realm.SimpleAccountRealm",
      "org.jsecurity.authc.pam.AbstractAuthenticationStrategy",
      "org.apache.log4j.LogManager",
      "net.sf.ehcache.extension.CacheExtension",
      "edu.emory.mathcs.backport.java.util.Queue",
      "org.jsecurity.crypto.hash.Md5Hash",
      "edu.emory.mathcs.backport.java.util.concurrent.helpers.WaitQueue",
      "org.jsecurity.web.WebRememberMeManager",
      "edu.emory.mathcs.backport.java.util.concurrent.helpers.WaitQueue$WaitNode",
      "org.jsecurity.crypto.Cipher",
      "net.sf.ehcache.store.DiskStore$DiskElement",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.jsecurity.mgt.AuthenticatingSecurityManager",
      "org.jsecurity.cache.CacheManager",
      "org.jsecurity.subject.Subject",
      "org.jsecurity.authz.permission.PermissionResolverAware",
      "net.sf.ehcache.CacheManager$1",
      "net.sf.ehcache.config.CacheConfiguration$BootstrapCacheLoaderFactoryConfiguration",
      "org.apache.log4j.or.RendererMap",
      "org.jsecurity.authc.ExpiredCredentialsException",
      "org.jsecurity.subject.RememberMeManager",
      "org.jsecurity.util.LifecycleUtils",
      "org.jsecurity.authc.CredentialsException",
      "net.sf.ehcache.event.CacheEventListener",
      "net.sf.jsr107cache.Cache",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.Condition",
      "org.jsecurity.authc.pam.ModularAuthenticationStrategy",
      "net.sf.ehcache.config.DiskStoreConfiguration",
      "net.sf.ehcache.store.Store",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantLock$NonfairSync",
      "net.sf.jsr107cache.CacheException",
      "org.jsecurity.authz.permission.PermissionResolver",
      "edu.emory.mathcs.backport.java.util.concurrent.ExecutorService",
      "org.jsecurity.authc.RememberMeAuthenticationToken",
      "org.apache.log4j.CategoryKey",
      "net.sf.ehcache.store.LruMemoryStore",
      "org.jsecurity.cache.CacheManagerAware",
      "org.jsecurity.io.ResourceUtils",
      "org.jsecurity.authz.permission.AllPermission",
      "edu.emory.mathcs.backport.java.util.concurrent.RunnableFuture",
      "net.sf.ehcache.CacheManager",
      "net.sf.ehcache.config.CacheConfiguration$CacheEventListenerFactoryConfiguration",
      "org.jsecurity.util.ThreadContext",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler",
      "edu.emory.mathcs.backport.java.util.concurrent.ThreadFactory",
      "org.jsecurity.authz.permission.WildcardPermissionResolver",
      "net.sf.ehcache.store.DiskStore$1",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.jsecurity.cache.HashtableCacheManager",
      "org.jsecurity.session.UnknownSessionException",
      "org.jsecurity.subject.PrincipalCollection",
      "edu.emory.mathcs.backport.java.util.concurrent.Executor",
      "net.sf.ehcache.store.FifoMemoryStore",
      "edu.emory.mathcs.backport.java.util.concurrent.Future",
      "org.jsecurity.authz.UnauthorizedException",
      "org.jsecurity.mgt.RealmSecurityManager",
      "net.sf.ehcache.config.CacheConfiguration",
      "org.jsecurity.subject.DelegatingSubject$StoppingAwareProxiedSession",
      "org.apache.log4j.spi.RootLogger",
      "org.jsecurity.web.attr.CookieAttribute",
      "org.jsecurity.session.mgt.DelegatingSession",
      "org.apache.log4j.spi.ErrorHandler",
      "org.jsecurity.session.ExpiredSessionException",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.CondVar$ExclusiveLock",
      "org.apache.log4j.spi.RendererSupport",
      "org.jsecurity.util.UnknownClassException",
      "org.jsecurity.authc.pam.UnsupportedTokenException",
      "org.jsecurity.util.ThreadContext$1",
      "net.sf.ehcache.config.FactoryConfiguration",
      "net.sf.ehcache.distribution.CacheManagerPeerProvider",
      "org.jsecurity.codec.Hex",
      "org.jsecurity.realm.CachingRealm",
      "org.jsecurity.session.mgt.eis.CachingSessionDAO",
      "net.sf.ehcache.store.DiskStore$MemoryEfficientByteArrayOutputStream",
      "net.sf.ehcache.config.CacheConfiguration$CacheExceptionHandlerFactoryConfiguration",
      "org.jsecurity.authc.credential.SimpleCredentialsMatcher",
      "org.jsecurity.authc.AbstractAuthenticator",
      "net.sf.ehcache.event.RegisteredEventListeners",
      "org.jsecurity.util.ClassUtils",
      "org.jsecurity.mgt.DefaultSecurityManager",
      "org.jsecurity.session.mgt.SimpleSession",
      "org.apache.log4j.Logger",
      "net.sf.ehcache.store.MemoryStore",
      "org.jsecurity.authc.credential.CredentialsMatcher",
      "edu.emory.mathcs.backport.java.util.concurrent.ThreadPoolExecutor",
      "org.jsecurity.authc.AuthenticationListener",
      "org.apache.log4j.helpers.LogLog",
      "edu.emory.mathcs.backport.java.util.concurrent.CancellationException",
      "edu.emory.mathcs.backport.java.util.concurrent.RejectedExecutionHandler",
      "org.jsecurity.authc.DisabledAccountException",
      "org.jsecurity.session.mgt.SessionValidationScheduler",
      "org.jsecurity.mgt.SecurityManager",
      "org.jsecurity.authc.SimpleAccount",
      "edu.emory.mathcs.backport.java.util.concurrent.Callable",
      "org.apache.log4j.spi.RepositorySelector",
      "org.jsecurity.session.mgt.ValidatingSessionManager",
      "org.jsecurity.session.mgt.DefaultSessionManager",
      "org.jsecurity.authc.credential.Sha512CredentialsMatcher",
      "org.jsecurity.authz.AuthorizationException",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.FIFOCondVar",
      "org.jsecurity.authc.UnknownAccountException",
      "org.jsecurity.web.session.ServletContainerSessionManager",
      "org.jsecurity.crypto.hash.AbstractHash",
      "org.jsecurity.web.session.DefaultWebSessionManager",
      "org.apache.log4j.or.DefaultRenderer",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.FIFOCondVar$1",
      "org.jsecurity.subject.SimplePrincipalCollection",
      "org.jsecurity.session.mgt.ValidatingSession",
      "org.jsecurity.codec.CodecSupport",
      "edu.emory.mathcs.backport.java.util.concurrent.locks.Lock",
      "org.apache.log4j.PropertyConfigurator",
      "org.jsecurity.session.Session",
      "org.apache.commons.logging.impl.Log4JLogger",
      "edu.emory.mathcs.backport.java.util.concurrent.helpers.WaitQueue$QueuedSync",
      "org.jsecurity.authc.InetAuthenticationToken",
      "org.apache.log4j.Appender",
      "net.sf.ehcache.config.CacheConfiguration$CacheLoaderFactoryConfiguration",
      "net.sf.ehcache.store.DiskStore",
      "net.sf.ehcache.config.BeanHandler",
      "edu.emory.mathcs.backport.java.util.concurrent.TimeUnit",
      "net.sf.ehcache.config.ConfigurationFactory",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.jsecurity.authc.AuthenticationListenerRegistrar",
      "org.apache.log4j.spi.LoggingEvent",
      "org.jsecurity.crypto.hash.Sha512Hash",
      "net.sf.jsr107cache.CacheListener",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.jsecurity.authc.AuthenticationException",
      "org.jsecurity.session.SessionListenerRegistrar",
      "org.jsecurity.realm.text.PropertiesRealm",
      "org.jsecurity.web.WebUtils",
      "org.apache.log4j.spi.LoggerRepository",
      "org.jsecurity.io.SerializationException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.servlet.ServletRequest", false, DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.servlet.ServletResponse", false, DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultWebSecurityManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.jsecurity.mgt.CachingSecurityManager",
      "org.jsecurity.mgt.RealmSecurityManager",
      "org.jsecurity.mgt.AuthenticatingSecurityManager",
      "org.jsecurity.mgt.AuthorizingSecurityManager",
      "org.jsecurity.mgt.SessionsSecurityManager",
      "org.jsecurity.mgt.DefaultSecurityManager",
      "org.jsecurity.web.DefaultWebSecurityManager",
      "org.jsecurity.util.LifecycleUtils",
      "org.jsecurity.web.WebUtils",
      "org.jsecurity.util.ThreadContext$1",
      "org.jsecurity.util.ThreadContext",
      "org.jsecurity.cache.ehcache.EhCacheManager",
      "net.sf.ehcache.CacheManager",
      "org.jsecurity.io.ResourceUtils",
      "org.jsecurity.util.ClassUtils",
      "net.sf.ehcache.event.CacheManagerEventListenerRegistry",
      "net.sf.ehcache.Status",
      "net.sf.ehcache.config.ConfigurationFactory",
      "net.sf.ehcache.config.Configuration",
      "net.sf.ehcache.config.BeanHandler",
      "net.sf.ehcache.config.BeanHandler$ElementInfo",
      "net.sf.ehcache.config.DiskStoreConfiguration",
      "net.sf.ehcache.config.CacheConfiguration",
      "net.sf.ehcache.config.ConfigurationHelper",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "net.sf.ehcache.Cache",
      "net.sf.ehcache.event.RegisteredEventListeners",
      "net.sf.ehcache.util.PropertyUtil",
      "net.sf.ehcache.store.DiskStore",
      "net.sf.ehcache.store.DiskStore$SpoolAndExpiryThread",
      "net.sf.ehcache.store.MemoryStore",
      "net.sf.ehcache.store.LruMemoryStore",
      "net.sf.ehcache.store.LruMemoryStore$SpoolingLinkedHashMap",
      "org.jsecurity.authc.AbstractAuthenticator",
      "org.jsecurity.authc.pam.ModularRealmAuthenticator",
      "org.jsecurity.authc.pam.AbstractAuthenticationStrategy",
      "org.jsecurity.authc.pam.AllSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.authz.ModularRealmAuthorizer",
      "org.jsecurity.session.mgt.AbstractSessionManager",
      "org.jsecurity.web.session.ServletContainerSessionManager",
      "org.jsecurity.subject.AbstractRememberMeManager",
      "org.jsecurity.web.WebRememberMeManager",
      "org.jsecurity.io.DefaultSerializer",
      "org.jsecurity.codec.Base64",
      "org.jsecurity.codec.CodecSupport",
      "org.jsecurity.crypto.BlowfishCipher",
      "org.jsecurity.web.attr.AbstractWebAttribute",
      "org.jsecurity.web.attr.CookieAttribute",
      "org.jsecurity.realm.CachingRealm",
      "org.jsecurity.realm.AuthenticatingRealm",
      "org.jsecurity.realm.AuthorizingRealm",
      "org.jsecurity.realm.SimpleAccountRealm",
      "org.jsecurity.authc.credential.SimpleCredentialsMatcher",
      "org.jsecurity.authz.permission.WildcardPermissionResolver",
      "org.jsecurity.cache.ehcache.EhCache",
      "org.jsecurity.subject.SimplePrincipalCollection",
      "org.jsecurity.session.mgt.AbstractValidatingSessionManager",
      "org.jsecurity.session.mgt.DefaultSessionManager",
      "org.jsecurity.web.session.DefaultWebSessionManager",
      "org.jsecurity.session.mgt.eis.CachingSessionDAO",
      "org.jsecurity.session.mgt.eis.MemorySessionDAO",
      "org.jsecurity.cache.HashtableCacheManager",
      "org.jsecurity.web.attr.RequestParamAttribute",
      "org.jsecurity.authc.UsernamePasswordToken",
      "org.jsecurity.cache.HashtableCache",
      "org.jsecurity.JSecurityException",
      "org.jsecurity.session.SessionException",
      "org.jsecurity.session.InvalidSessionException",
      "org.jsecurity.session.UnknownSessionException",
      "org.jsecurity.authz.permission.WildcardPermission",
      "org.jsecurity.util.CollectionUtils",
      "org.jsecurity.session.mgt.ExecutorServiceSessionValidationScheduler",
      "org.jsecurity.realm.text.TextConfigurationRealm",
      "org.jsecurity.realm.text.PropertiesRealm",
      "org.jsecurity.util.StringUtils",
      "org.jsecurity.authz.SimpleRole",
      "org.jsecurity.util.PermissionUtils",
      "org.jsecurity.authc.SimpleAccount",
      "org.jsecurity.authc.SimpleAuthenticationInfo",
      "org.jsecurity.authz.SimpleAuthorizationInfo",
      "net.sf.ehcache.Element",
      "org.jsecurity.authc.AuthenticationException",
      "org.jsecurity.authz.SimpleAuthorizingAccount",
      "org.jsecurity.codec.Hex",
      "org.jsecurity.session.ProxiedSession",
      "org.jsecurity.authc.pam.AtLeastOneSuccessfulModularAuthenticationStrategy",
      "org.jsecurity.subject.DelegatingSubject",
      "org.jsecurity.authz.AuthorizationException",
      "org.jsecurity.authz.UnauthorizedException",
      "org.jsecurity.authz.permission.AllPermission",
      "org.jsecurity.session.mgt.SimpleSession",
      "org.jsecurity.util.JavaEnvironment",
      "org.jsecurity.session.mgt.DelegatingSession",
      "org.jsecurity.subject.DelegatingSubject$StoppingAwareProxiedSession",
      "org.jsecurity.authc.credential.HashedCredentialsMatcher",
      "org.jsecurity.authc.credential.Sha512CredentialsMatcher",
      "org.jsecurity.authc.credential.Md5CredentialsMatcher",
      "org.jsecurity.authz.UnauthenticatedException",
      "org.jsecurity.authc.pam.FirstSuccessfulAuthenticationStrategy"
    );
  }
}
