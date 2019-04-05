/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:45:44 GMT 2019
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.net.InetAddress;
import java.net.Socket;
import javolution.util.FastMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.javathena.core.data.Auth_data;
import org.javathena.core.data.IParse;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.data.IDBManagementLogin;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromAdmin;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(121);
      int int0 = login0.getAuth_num();
      assertEquals(121, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = 30;
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((byte) (-104));
      login0.do_initTXT();
      assertEquals((-104), login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.setListenPort((byte)8);
      Login.logUnknownPackets(socket_data0);
      assertNull(socket_data0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setUsers((-2029042903));
      // Undeclared exception!
      try { 
        Login.codingKey(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(1220703125, (String) null);
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask((-170), "login_log_12");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      login0.check_ip((InetAddress) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login login0 = new Login();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        login0.save_config_in_log();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console("d[<;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.do_init();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_allownum(100000000);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      login0.do_final();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        Login.login_log("E8z!6?");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login.setPASSWORDENC(30);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[5];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("OFF");
      assertFalse(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertFalse(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("UY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("YES");
      assertEquals(0, login0.getAuth_max());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_allownum(763);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(10);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      int int0 = login0.parse_console("javax.swing.LookAndFeel");
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      // Undeclared exception!
      try { 
        login0.parse_console("exit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      // Undeclared exception!
      try { 
        login0.parse_console("shutdown");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      login0.parse_admin(821, socket_data0, login0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.do_initSQL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.utiles.ConfigurationManagement", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      ConfigurationManagement.setAuth_before_save_file(2000000);
      login_Timer_interval_check_auth_sync0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Login.showTab(byteArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>();
      Integer integer0 = new Integer((-1932860750));
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null, (Integer) null).when(auth_data0).getAccount_id();
      doReturn((String) null).when(auth_data0).getUserid();
      fastMap0.put(integer0, auth_data0);
      UserManagement.setAuth_dats(fastMap0);
      assertFalse(fastMap0.isShared());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addUserTXT("(:|O^R3iC", "S+u9p", "S+u9p", 'U');
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "org.javathena.login.parse.FromClient", "", 'S');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addAccountIdCount((-610));
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("b4K@.Df[Oe", "MAX", "28`N^L</", 'i');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Content is not allowed in prolog.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Login.login_log("info_10");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromAdmin fromAdmin0 = new FromAdmin();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromAdmin0);
      Login.getMd5Data(socket_data0);
      // Undeclared exception!
      try { 
        Login.codingKey(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null, (IParse) null);
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      int int0 = login0.parse_console("status");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      // Undeclared exception!
      try { 
        Login.version(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.logUnknownPackets(socket_data0);
      assertEquals(0L, socket_data0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
      assertEquals(30, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Login login0 = new Login();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(122);
      BufferedWriter bufferedWriter0 = new BufferedWriter(charArrayWriter0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedWriter0);
      login0.setOut(mockPrintWriter0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Login login0 = new Login();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      // Undeclared exception!
      try { 
        login_Timer_interval_check_auth_sync0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }
}