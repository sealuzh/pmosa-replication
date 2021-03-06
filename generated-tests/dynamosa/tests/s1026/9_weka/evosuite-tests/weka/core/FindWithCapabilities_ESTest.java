/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 16:54:05 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Capabilities;
import weka.core.CapabilitiesHandler;
import weka.core.FindWithCapabilities;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FindWithCapabilities_ESTest extends FindWithCapabilities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      capabilities0.enable(capabilities_Capability0);
      findWithCapabilities0.setCapabilities(capabilities0);
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enable(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities0);
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertSame(capabilitiesHandler0, findWithCapabilities0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Filename = null;
      String string0 = findWithCapabilities0.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("%&n 2B");
      findWithCapabilities0.getFilename();
      assertEquals("%&n 2B", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      capabilities0.enableAll();
      findWithCapabilities0.setCapabilities(capabilities0);
      Capabilities capabilities1 = findWithCapabilities0.getCapabilities();
      assertTrue(capabilities1.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      try { 
        findWithCapabilities0.setOptions((String[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[0];
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      capabilities0.enableAll();
      findWithCapabilities0.setNotCapabilities(capabilities0);
      assertTrue(capabilities0.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FindWithCapabilities.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FindWithCapabilities.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      boolean boolean0 = findWithCapabilities0.isEnabledNot((Capabilities.Capability) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_ATTRIBUTES;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = Locale.getISOCountries();
      findWithCapabilities0.setOptions(stringArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "[4G,pf,`-?$I";
      stringArray0[1] = "j*?B";
      stringArray0[2] = "-";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "3HWl*J(Y?n|!~sQK";
      stringArray0[1] = "-num-instances";
      stringArray0[2] = "-num-instances";
      stringArray0[3] = "-num-instances";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-num-instances\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[3];
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "nominal-class";
      stringArray0[1] = "-t";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No value given for -t option.
         //
         verifyException("weka.core.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "8034";
      stringArray0[1] = "8034";
      stringArray0[2] = "-W";
      stringArray0[3] = "\tMust handle unray classes.";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setNotCapabilities((Capabilities) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setFilename((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setClassIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setCapabilities((Capabilities) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Capabilities = null;
      // Undeclared exception!
      try { 
        findWithCapabilities0.getOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Packages = null;
      // Undeclared exception!
      try { 
        findWithCapabilities0.find();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Capabilities = null;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      // Undeclared exception!
      try { 
        findWithCapabilities0.enable(capabilities_Capability0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("P~EdvoY?=zIL");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "D9";
      stringArray0[1] = "<q/\"a~wrgB$1F";
      stringArray0[2] = "e%YQ#: CIYGD4|";
      stringArray0[3] = "San Mateo, CA";
      stringArray0[4] = "|BRbU";
      stringArray0[5] = "$cie1";
      stringArray0[6] = "-1";
      stringArray0[7] = "-not-missing-att-values";
      stringArray0[8] = "";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "ypU@rb[;K!B8i--";
      stringArray0[1] = "\nFound ";
      stringArray0[2] = "-not-date-class";
      stringArray0[3] = "v8q";
      stringArray0[4] = "";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "YSo5R=D";
      stringArray0[1] = "-not-unary-class";
      stringArray0[2] = "G3g:(zxdUufY";
      stringArray0[3] = "G3g:(zxdUufY";
      stringArray0[4] = "G3g:(zxdUufY";
      stringArray0[5] = "-superclass";
      stringArray0[6] = "YSo5R=D";
      stringArray0[7] = "YSo5R=D";
      stringArray0[8] = "-superclass";
      findWithCapabilities0.setOptions(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.setCapabilities(capabilities0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "<vey";
      stringArray0[1] = "Cannot handle unknown attribute type '";
      stringArray0[2] = "-numeric-class";
      stringArray0[3] = "g%<5cgP*^LQhtDAz&";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-no-class";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "relational-nominal";
      stringArray0[1] = "-c";
      stringArray0[2] = "3,:PK~s";
      stringArray0[3] = "`";
      stringArray0[4] = "$Revision: 8034 $";
      stringArray0[5] = "G&%@8G+8NQkYO/e";
      stringArray0[6] = "- allowed: ";
      stringArray0[7] = "\t";
      stringArray0[8] = "0j>}gy@ciN}";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      assertFalse(capabilities0.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setHandler((CapabilitiesHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNull(capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "8vey";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.find();
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.getClassIndex();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No index set
         //
         verifyException("weka.core.SingleIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-1");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("last");
      findWithCapabilities0.getOptions();
      assertEquals("last", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_VALUES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-not-date-atts";
      FindWithCapabilities.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "$";
      stringArray0[1] = "G(gJfs0p<e6=aio-TSh";
      stringArray0[2] = "\tThe number of date attributes in a rel. attribute (default 0).";
      stringArray0[3] = "unary-class";
      stringArray0[4] = "@attribute";
      stringArray0[5] = "-not-string-atts";
      stringArray0[6] = "last";
      FindWithCapabilities.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = ",l";
      stringArray0[1] = "-not-relational-class";
      stringArray0[2] = "uw\"_~Edno_'>U#>";
      stringArray0[3] = "Au$`H#fc<'ZuO/SSrE";
      stringArray0[4] = "-date-atts";
      stringArray0[5] = ";?FvFGjH~t";
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_ATTRIBUTES;
      findWithCapabilities1.enable(capabilities_Capability0);
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      String[] stringArray0 = findWithCapabilities0.getOptions();
      try { 
        findWithCapabilities1.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "uc0";
      stringArray0[1] = "-not-numeric-atts";
      stringArray0[2] = "kmUbQ";
      stringArray0[3] = "]";
      stringArray0[4] = "[Weka] Skipping package ";
      stringArray0[5] = "-nominal-atts";
      FindWithCapabilities.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "weka.core.neighboursearch.PerformanceStats";
      stringArray0[1] = "-missing-class-values";
      FindWithCapabilities.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-nominal-class";
      stringArray0[1] = "QnST~i";
      FindWithCapabilities.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Tc+<8y";
      stringArray0[1] = "Policy";
      stringArray0[2] = "-string-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      capabilities0.enableAllClasses();
      findWithCapabilities0.setCapabilities(capabilities0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(18, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      assertTrue(vector0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "b(";
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      String[] stringArray0 = findWithCapabilities0.getOptions();
      try { 
        findWithCapabilities0.setOptions(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // A superclass has to be specified!
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_Capabilities;
      findWithCapabilities0.setNotCapabilities(capabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }
}
