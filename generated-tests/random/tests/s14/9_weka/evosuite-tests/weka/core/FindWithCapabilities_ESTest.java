/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:22:53 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Enumeration;
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      capabilities0.enableAllClasses();
      findWithCapabilities0.setCapabilities(capabilities0);
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.enable(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_ATTRIBUTES;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.EMPTY_NOMINAL_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_NotCapabilities = null;
      // Undeclared exception!
      try { 
        findWithCapabilities0.getOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.find();
      assertEquals(10, vector0.capacity());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("\"position\" is relation-valued");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("weka/core/Capabilities.props");
      assertEquals("weka/core/Capabilities.props", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "?UnpM8O 0$v";
      stringArray0[1] = "-not-date-class";
      stringArray0[2] = "f8>Y#[nL$Dp2krncDKQ";
      stringArray0[3] = "d=jykeK";
      stringArray0[4] = "}n{\"B+I]qSj";
      stringArray0[5] = "missing-att-values";
      stringArray0[6] = "\"2a|x|'`dW?iC~Be3/+";
      stringArray0[7] = "_i;";
      stringArray0[8] = "INomx[E`d9wXx[";
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
  public void test19()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      assertEquals(1, capabilities0.getMinimumNumberInstances());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      assertEquals("[]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNull(capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "5.5 rounded: ";
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      capabilities0.enableAllClasses();
      findWithCapabilities0.m_Superclass = "\tMust handle unary attributes.";
      findWithCapabilities0.setCapabilities(capabilities0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(11, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-1");
      String string0 = findWithCapabilities0.getClassIndex();
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Filename = "#D";
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
  public void test28()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_VALUES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_Capabilities;
      capabilities0.enableAllAttributes();
      findWithCapabilities0.setNotCapabilities(capabilities0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(18, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_NotCapabilities;
      capabilities0.enableAllClasses();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(11, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_VALUES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "z";
      stringArray0[1] = "\"N(OMS7M\u0000Ck";
      stringArray0[2] = "}j+57ZaL K@5L";
      stringArray0[3] = "-only-multiinstance";
      stringArray0[4] = "\tMust handle date classes.";
      stringArray0[5] = "3'*s+|h`[WJlwj9sh<7";
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
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "seed";
      stringArray0[1] = "-not-missing-att-values";
      stringArray0[2] = "Minkowski distance";
      stringArray0[3] = "wFgQXm7B)<,";
      stringArray0[4] = "\tMust handle nominal attributes.";
      stringArray0[5] = "Jt1A";
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
  public void test37()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-not-relational-atts";
      stringArray0[1] = "N@.;hCQ4B7|l*zG_'";
      stringArray0[2] = ". instance";
      stringArray0[3] = "U?$ERL2V$H%Js ^M ";
      stringArray0[4] = "number of instances has changed";
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
  public void test38()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-not-date-atts";
      stringArray0[1] = "weka.core.WekaPackageManager";
      stringArray0[2] = "Class '";
      stringArray0[3] = "[DefaultPackageManager] Installing: ";
      stringArray0[4] = "isNewer? ";
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "8034";
      stringArray0[1] = "-not-string-atts";
      stringArray0[2] = "8034";
      stringArray0[3] = "-dir <dir>";
      stringArray0[4] = "-dir <dir>";
      stringArray0[5] = "mI!X}3";
      stringArray0[6] = "8034";
      FindWithCapabilities.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      capabilities0.enable(capabilities_Capability0);
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
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-missing-att-values";
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
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
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "5";
      stringArray0[1] = "-date-atts";
      stringArray0[2] = "ZF'O4%p\"Sc9<";
      FindWithCapabilities.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-string-atts";
      stringArray0[1] = "relation";
      stringArray0[2] = "9$1}^hP_";
      stringArray0[3] = "\"position\" is numeric";
      stringArray0[4] = "-1";
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "*PPJzI!rob_J";
      stringArray0[1] = "MNn0Q5Xlk'9Jh";
      stringArray0[2] = ").HMpW9";
      stringArray0[3] = "M$";
      stringArray0[4] = "d;B7;\">py<bd";
      stringArray0[5] = "first_value";
      stringArray0[6] = "Eq0AOvKAnv Z&w,zH";
      stringArray0[7] = "z,C (&OuK3";
      stringArray0[8] = "-numeric-atts";
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
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
  public void test48()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_CLASS_VALUES;
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
  public void test49()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "5\"G0=#!PrA.wI";
      stringArray0[1] = "Labels differ at position ";
      stringArray0[2] = "5\"G0=#!PrA.wI";
      stringArray0[3] = "-not-relational-class";
      stringArray0[4] = "-not-relational-class";
      stringArray0[5] = "ccY";
      stringArray0[6] = "#3gGp";
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
  public void test50()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "\tAlso prints the classname that didn't match the criteria.";
      stringArray0[2] = "V";
      stringArray0[3] = ": ";
      stringArray0[4] = "JAz&hk#Cx!t";
      stringArray0[5] = "I?b";
      stringArray0[6] = "relational-atts";
      stringArray0[7] = "-not-string-class";
      stringArray0[8] = "not-nominal-atts";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "byVzQ=%w*F&#6f";
      stringArray0[1] = "kZrn|wOu0M0>>qZ>]";
      stringArray0[2] = "^6K>hF]r6rpoS._";
      stringArray0[3] = "WO44m=|z7+";
      stringArray0[4] = "";
      stringArray0[5] = "EIai+B77~nM[C#w?dI";
      stringArray0[6] = ":)uM";
      stringArray0[7] = "5HPNJ}q@";
      stringArray0[8] = "-not-numeric-class";
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
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_CLASS;
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
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-not-binary-class";
      stringArray0[1] = ",\n   ";
      stringArray0[2] = "1}-*;qG@l5Ml";
      stringArray0[3] = "not-date-class";
      stringArray0[4] = "H%K7>obvDz!@kv#-H";
      stringArray0[5] = "0#EO ";
      FindWithCapabilities.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "71j\"L";
      stringArray0[1] = "K--Bmx5A|Qcr";
      stringArray0[2] = "file:";
      stringArray0[3] = "-not-nominal-class";
      stringArray0[4] = "O9ptc`;,s";
      stringArray0[5] = "?l,^T+wVkLK";
      stringArray0[6] = "sm^";
      stringArray0[7] = "YV:wQkT~N+";
      stringArray0[8] = "\n";
      FindWithCapabilities.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-missing-class-values";
      stringArray0[1] = "/hvaD=yg?I";
      stringArray0[2] = "nominal-class";
      FindWithCapabilities.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-no-class";
      stringArray0[1] = "U~qQZ/{Lae3?";
      stringArray0[2] = "`kQZ^w]?oXs";
      stringArray0[3] = "OC^\\8sZ,}V";
      stringArray0[4] = " packages are missing:";
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
  public void test58()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "^/Td:N[#]";
      stringArray0[1] = "-c";
      stringArray0[2] = "|emA,|Q#WHy;T}H^d";
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
  public void test59()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
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
  public void test60()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      assertEquals(0, vector0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = new Capabilities(findWithCapabilities0);
      findWithCapabilities0.setNotCapabilities(capabilities0);
      assertEquals("", findWithCapabilities0.getFilename());
  }
}
