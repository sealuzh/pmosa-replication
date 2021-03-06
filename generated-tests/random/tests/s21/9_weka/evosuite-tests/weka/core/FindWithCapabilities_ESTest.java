/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:24:32 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
import java.util.HashSet;
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
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      HashSet<Capabilities.Capability> hashSet0 = capabilities0.m_Capabilities;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      hashSet0.add(capabilities_Capability0);
      findWithCapabilities0.setNotCapabilities(capabilities0);
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_NotCapabilities;
      findWithCapabilities0.m_Capabilities = capabilities0;
      capabilities0.enableAllClasses();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities0;
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertSame(findWithCapabilities0, capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("b)'LN%DJ");
      findWithCapabilities0.getFilename();
      assertEquals("b)'LN%DJ", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      Capabilities capabilities1 = capabilities0.getClassCapabilities();
      HashSet<Capabilities.Capability> hashSet0 = capabilities1.m_Capabilities;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      hashSet0.add(capabilities_Capability0);
      capabilities1.m_Dependencies = hashSet0;
      findWithCapabilities0.setNotCapabilities(capabilities1);
      Capabilities capabilities2 = findWithCapabilities0.getNotCapabilities();
      assertTrue(capabilities2.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_ATTRIBUTES;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setClassIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Capabilities = null;
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      // Undeclared exception!
      try { 
        findWithCapabilities0.handles(capabilities_Capability0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.FindWithCapabilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.find();
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("nP|M?^>tO");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNull(capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      findWithCapabilities0.m_Superclass = "YA-U't{0zRq";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.m_Superclass = "YA-U't{0zRq";
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_ClassIndex = null;
      String string0 = findWithCapabilities0.getClassIndex();
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-1");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Filename = " classes that matched the criteria:\n";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(" classes that matched the criteria:\n", findWithCapabilities0.getFilename());
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_NotCapabilities.enableAll();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(20, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      capabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      capabilities0.enableAll();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(20, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "http://en.wikipedia.org/wiki/Taxicab_geometry";
      stringArray0[1] = "[D1nH`TUWp&(";
      stringArray0[2] = "/@51K";
      stringArray0[3] = "-only-multiinstance";
      stringArray0[4] = ") - trying legacy routine...";
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
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Qz_&/c";
      stringArray0[1] = "L^;},-El3H";
      stringArray0[2] = "-not-missing-att-values";
      stringArray0[3] = "%vPD{:fcY\" U_:U@*";
      FindWithCapabilities.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Rgn9_[Yy9m+$})";
      stringArray0[1] = "&hw]$1 $g9Y}T#EaI";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "44";
      stringArray0[5] = "";
      stringArray0[6] = "-not-date-atts";
      stringArray0[7] = "?x CVj>F&X8u4";
      FindWithCapabilities.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "\tFull name of the class analysed.\n\teg: weka.classifiers.rules.ZeroR\n\t(default weka.classifiers.rules.ZeroR)";
      stringArray0[1] = "\tThe index of the class attribute, -1 for none.\n\t'first' and 'last' are also valid.\n\tOnly in conjunction with option '-t'.";
      stringArray0[2] = "-relational-nominal <num>";
      stringArray0[3] = "-not-string-atts";
      stringArray0[4] = "\tFull name of the class analysed.\n\teg: weka.classifiers.rules.ZeroR\n\t(default weka.classifiers.rules.ZeroR)";
      stringArray0[5] = "\tFull name of the class analysed.\n\teg: weka.classifiers.rules.ZeroR\n\t(default weka.classifiers.rules.ZeroR)";
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
  public void test39()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "0&J;";
      stringArray0[1] = "Unable to find Description file in package archive!";
      stringArray0[2] = "Q%v5fDN";
      stringArray0[3] = "Title";
      stringArray0[4] = "-not-numeric-atts";
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
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-not-binary-atts";
      stringArray0[1] = "My\"b?";
      FindWithCapabilities.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "eKFYnb)qQ[7";
      stringArray0[1] = "P:c'T";
      stringArray0[2] = "qCB";
      stringArray0[3] = "'M>yHkMF";
      stringArray0[4] = "no-class";
      stringArray0[5] = "/Q%Qo>#'sugos\"6N+s";
      stringArray0[6] = "-not-nominal-atts";
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "nG:|Zb1l";
      stringArray0[1] = "weka/core/Capabilities.props";
      stringArray0[2] = "nP|M?^>tO";
      stringArray0[3] = "-missing-att-values";
      stringArray0[4] = "";
      stringArray0[5] = "34-e~@W#m1GY";
      stringArray0[6] = "&13uzp) 2(P}qnJ";
      stringArray0[7] = "Second set: ";
      FindWithCapabilities.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "?(kjGzzk=";
      stringArray0[1] = "DaCZp6[3z(";
      stringArray0[2] = "/o%Xl4B)Su7";
      stringArray0[3] = "\tMust handle date classes.";
      stringArray0[4] = "' generates this exception:\n";
      stringArray0[5] = "WI9@Y=B;W]*u";
      stringArray0[6] = "-date-atts";
      FindWithCapabilities.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Copy is the same as original: ";
      stringArray0[1] = "-string-atts";
      stringArray0[2] = "Vk\"#Y`";
      stringArray0[3] = "PY*gNmKBX>n,";
      stringArray0[4] = "03oH9qy]9&Wes\"$Eho";
      stringArray0[5] = "<>](HYZ?N";
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-not-unary-atts";
      stringArray0[1] = "  - # Nominal: ";
      stringArray0[2] = "%zl!s3Vtu5:E.!VZK";
      stringArray0[3] = "";
      stringArray0[4] = "y}C";
      stringArray0[5] = "-numeric-atts";
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
      String[] stringArray0 = new String[3];
      stringArray0[0] = "b-";
      stringArray0[1] = "not-unary-class";
      stringArray0[2] = "-unary-atts";
      FindWithCapabilities.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-not-date-class";
      stringArray0[1] = "#'%:Wl";
      stringArray0[2] = "Q_+YpG[Q\\Nc{>!sC";
      stringArray0[3] = "b)'LN%DJ";
      stringArray0[4] = "-binary-atts";
      stringArray0[5] = "b)'LN%DJ";
      stringArray0[6] = ";";
      stringArray0[7] = "hn/%/y{_:";
      stringArray0[8] = "dl!0!4ha";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-nominal-atts";
      stringArray0[1] = "7WDdK,S!./@N5!$Z";
      stringArray0[2] = "";
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-not-relational-class";
      stringArray0[1] = "-not-relational-class";
      stringArray0[2] = " classes that matched the criteria:\n";
      stringArray0[3] = "-generic";
      stringArray0[4] = "-not-relational-class";
      stringArray0[5] = ">?R5*%:<l'-#";
      stringArray0[6] = "-not-relational-class";
      stringArray0[7] = "Jrdme7[?W4";
      stringArray0[8] = "-not-relational-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "s$Vlfek.>H3b|o+1";
      stringArray0[1] = "@Y'A{jS";
      stringArray0[2] = "the environment variable ";
      stringArray0[3] = "5`CtTzhSn*F";
      stringArray0[4] = "superclass";
      stringArray0[5] = "-not-string-class";
      stringArray0[6] = "-missing-class-values";
      stringArray0[7] = "`D#|z Wu\u0006!jmG^p&0'";
      FindWithCapabilities.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_NotCapabilities;
      findWithCapabilities0.m_Capabilities = capabilities0;
      capabilities0.enableAllClasses();
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
  public void test52()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "aw'}p6G#^F";
      stringArray0[1] = "-only-multi-instance";
      stringArray0[2] = "options differ in length";
      stringArray0[3] = "-not-no-class";
      stringArray0[4] = "+ou";
      stringArray0[5] = "-not-missing-class-values";
      stringArray0[6] = "missing-class-values";
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
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "5`CtTzhSn*F";
      stringArray0[1] = "-no-class";
      stringArray0[2] = "H7EZ";
      stringArray0[3] = "b)'LN%DJ";
      stringArray0[4] = "not-relational-atts";
      stringArray0[5] = "*S>cGBX|41wu/E";
      stringArray0[6] = "Efw^^3}WrEQfDf";
      stringArray0[7] = "Second set: ";
      stringArray0[8] = "-not-date-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-c";
      stringArray0[1] = "to%{";
      stringArray0[2] = "weka.core.AllJavadoc";
      stringArray0[3] = "g.8kvzg2";
      stringArray0[4] = "Efw^^3}WrEQfDf";
      stringArray0[5] = "\"n&O";
      stringArray0[6] = "@>3C?Y;B)CVhE:FC";
      FindWithCapabilities.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities0.m_Handler = (CapabilitiesHandler) findWithCapabilities1;
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(11, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      findWithCapabilities0.setCapabilities(capabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      findWithCapabilities0.m_Misses = vector0;
      vector0.add("-");
      Vector<String> vector1 = findWithCapabilities0.getMisses();
      assertTrue(vector1.contains("-"));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
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
  public void test65()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }
}
