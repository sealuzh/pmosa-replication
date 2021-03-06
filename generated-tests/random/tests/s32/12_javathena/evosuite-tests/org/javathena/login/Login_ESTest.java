/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 16:46:51 GMT 2019
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.data.IDBManagementLogin;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(1602);
      int int0 = login0.getAuth_num();
      assertEquals(1602, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.setAuth_max((-1059));
      assertEquals((-1059), login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login.setPASSWORDENC((-1010));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(640, "K#9:6");
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask((-1621318857), "status");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      login0.check_ip((InetAddress) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getByName("shutdown");
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.showTab((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console("h@_JGQt~7Z;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        Login.do_initSQL();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.check_auth_sync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
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
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
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
        Login.login_log("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[2];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("wh9!`t^3<)7LL@tm\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertEquals(0, login0.getAuth_max());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("ON");
      assertTrue(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("OFF");
      assertFalse(boolean0);
      assertEquals(0, login0.getAuth_max());
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
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum(172);
      ConfigurationManagement.setAccess_allownum(785);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1276);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
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
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = login0.parse_console("ANW DOIT ETRE EGALE A YES/NO/ON/OFF");
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      login0.parse_admin((byte)9, socket_data0, (Login) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addUserTXT("LOGIN_LOG_15", "LOGIN_LOG_15", "save/account.xml", '2');
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
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'd');
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
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      login_Timer_interval_check_auth_sync0.run();
      assertEquals(0L, login_Timer_interval_check_auth_sync0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      // Undeclared exception!
      try { 
        login0.do_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Content is not allowed in prolog.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Login.login_log("ON");
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
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
  public void test41()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
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
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Login.setPASSWORDENC(1602);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
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
  public void test45()  throws Throwable  {
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.version((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.logUnknownPackets(socket_data0);
      assertNull(socket_data0.getName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(0, "ON");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(30, intArray0.length);
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      Socket_data socket_data0 = new Socket_data(mockSocket0);
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
  public void test55()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }
}
