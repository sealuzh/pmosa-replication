/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 18:13:20 GMT 2019
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
      findWithCapabilities0.m_Superclass = "]g8%jbEcDPo";
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities1.setHandler(findWithCapabilities0);
      String[] stringArray0 = findWithCapabilities1.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(11, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_ATTRIBUTES;
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.enable(capabilities_Capability0);
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.m_Misses;
      vector0.add("A@<mDK");
      Vector<String> vector1 = findWithCapabilities0.getMisses();
      assertTrue(vector1.contains("A@<mDK"));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.m_Matches;
      vector0.add("\tThe number of nominal attributes (default 2).");
      Vector<String> vector1 = findWithCapabilities0.getMatches();
      assertTrue(vector1.contains("\tThe number of nominal attributes (default 2)."));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Filename = null;
      String string0 = findWithCapabilities0.getFilename();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setFilename("B");
      findWithCapabilities0.getFilename();
      assertEquals("B", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      capabilities0.enableAll();
      Capabilities capabilities1 = findWithCapabilities0.getCapabilities();
      assertTrue(capabilities1.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      capabilities0.enableAllAttributeDependencies();
      findWithCapabilities0.setNotCapabilities(capabilities0);
      Capabilities capabilities1 = findWithCapabilities0.getNotCapabilities();
      assertTrue(capabilities1.hasDependencies());
      assertNotSame(capabilities1, capabilities0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      capabilities0.setMinimumNumberInstances(0);
      findWithCapabilities0.setNotCapabilities(capabilities0);
      Capabilities capabilities1 = findWithCapabilities0.getNotCapabilities();
      assertNotSame(capabilities1, capabilities0);
      assertEquals(0, capabilities1.getMinimumNumberInstances());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getNotCapabilities();
      capabilities0.enableAllClassDependencies();
      findWithCapabilities0.setCapabilities(capabilities0);
      assertTrue(capabilities0.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_NotCapabilities;
      capabilities0.m_MinimumNumberInstances = (-2751);
      findWithCapabilities0.setCapabilities(capabilities0);
      assertFalse(capabilities0.hasDependencies());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FindWithCapabilities.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      FindWithCapabilities.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.BINARY_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabledNot(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      boolean boolean0 = findWithCapabilities0.isEnabled((Capabilities.Capability) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_CLASS;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.isEnabled(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      boolean boolean0 = findWithCapabilities0.handles((Capabilities.Capability) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.UNARY_CLASS;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.enableNot((Capabilities.Capability) null);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.enable((Capabilities.Capability) null);
      boolean boolean0 = findWithCapabilities0.handles((Capabilities.Capability) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.disableNot(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.disable((Capabilities.Capability) null);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NOMINAL_CLASS;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = Locale.getISOLanguages();
      FindWithCapabilities.main(stringArray0);
      findWithCapabilities0.setOptions(stringArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[1];
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      // Undeclared exception!
      try { 
        findWithCapabilities0.setClassIndex((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.find();
      assertEquals("[]", vector0.toString());
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
      findWithCapabilities0.m_Superclass = "Date class";
      String[] stringArray0 = findWithCapabilities0.getOptions();
      findWithCapabilities0.setOptions(stringArray0);
      assertEquals(4, stringArray0.length);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "RN[.";
      stringArray0[1] = "0z\"q7=3Cq";
      stringArray0[2] = "W/U=2;-.MTJdq0Z";
      stringArray0[3] = "DenseInstance has accesss to a dataset!";
      stringArray0[4] = "F[8kXg }";
      stringArray0[5] = "ZA3G!(RZhZ43*)yk";
      stringArray0[6] = "-not-date-atts";
      stringArray0[7] = "N78SVT0";
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "n0hh-h3";
      stringArray0[1] = "' already in use at position #";
      stringArray0[2] = "-not-string-atts";
      stringArray0[3] = "n!!6.y:|&in6]";
      stringArray0[4] = "";
      stringArray0[5] = "]";
      stringArray0[6] = "File '";
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
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
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
  public void test45()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      FindWithCapabilities findWithCapabilities1 = new FindWithCapabilities();
      findWithCapabilities1.setHandler(findWithCapabilities0);
      String[] stringArray0 = findWithCapabilities1.getOptions();
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
  public void test47()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMatches();
      vector0.trimToSize();
      Vector<String> vector1 = findWithCapabilities0.getMatches();
      assertEquals(0, vector1.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertNull(capabilitiesHandler0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getFilename();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "]g8%jbEcDPo";
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_Superclass = "]g8%jbEcDPo";
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.m_ClassIndex = null;
      String string0 = findWithCapabilities0.getClassIndex();
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("-1");
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.ONLY_MULTIINSTANCE;
      findWithCapabilities0.enable(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.m_NotCapabilities;
      capabilities0.enableAll();
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(20, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NO_CLASS;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-only-multiinstance";
      stringArray0[1] = "-only-multiinstance";
      stringArray0[2] = "-only-multiinstance";
      stringArray0[3] = "-only-multiinstance";
      stringArray0[4] = "-only-multiinstance";
      stringArray0[5] = "-only-multiinstance";
      stringArray0[6] = "-only-multiinstance";
      stringArray0[7] = "-only-multiinstance";
      stringArray0[8] = "-only-multiinstance";
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.MISSING_VALUES;
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
  public void test60()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_ATTRIBUTES;
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
  public void test61()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Hi2d\"8R";
      stringArray0[1] = "GEe[I hPLS";
      stringArray0[2] = "-numeric-atts";
      stringArray0[3] = "-missing-att-values";
      stringArray0[4] = "-not-string-atts";
      stringArray0[5] = "5%,:u_q8bu";
      FindWithCapabilities.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_ATTRIBUTES;
      findWithCapabilities0.enableNot(capabilities_Capability0);
      String[] stringArray0 = findWithCapabilities0.getOptions();
      FindWithCapabilities.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "^%U$v";
      stringArray0[1] = "gT(CshjGA";
      stringArray0[2] = "a--";
      stringArray0[3] = "last";
      stringArray0[4] = "-not-unary-atts";
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
  public void test64()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-not-binary-atts";
      stringArray0[1] = "not-no-class";
      stringArray0[2] = "sFDQh:";
      stringArray0[3] = "1&}]gBz8.g";
      stringArray0[4] = "e@+Zl1fB\">R,C:@I/?";
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
  public void test65()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-not-nominal-atts";
      stringArray0[1] = "N78SVT0";
      stringArray0[2] = "8034";
      stringArray0[3] = "N78SVT0";
      stringArray0[4] = "F)`";
      stringArray0[5] = "8034";
      stringArray0[6] = "-string-class";
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
  public void test66()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities capabilities0 = findWithCapabilities0.getCapabilities();
      capabilities0.enableAll();
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
  public void test67()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.RELATIONAL_CLASS;
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
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_CLASS;
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
  public void test69()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.STRING_CLASS;
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
  public void test70()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.NUMERIC_CLASS;
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
  public void test71()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "'AZ&dX";
      stringArray0[1] = "NE)Z`oo,9L|3@wT|";
      stringArray0[2] = "{S&?8n|*_/|y";
      stringArray0[3] = "\tMust handle relational attributes.";
      stringArray0[4] = "-not-unary-class";
      stringArray0[5] = "IaEfv=u4Fkd'";
      stringArray0[6] = "re:g|M\u0001-m;6T";
      stringArray0[7] = "1*? !0.S`NqOF^=";
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
  public void test72()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "weka/core/Capabilities.props";
      stringArray0[1] = "-not-binary-class";
      stringArray0[2] = "B#*[B4 A";
      stringArray0[3] = "B";
      stringArray0[4] = "B#*[B4 A";
      stringArray0[5] = "B";
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
  public void test73()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "relational-numeric";
      stringArray0[1] = "N13_lWBJJm!3?:F&!%";
      stringArray0[2] = "-not-no-class";
      stringArray0[3] = "<2:w6Pi<sVKsZfDJm|6";
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
  public void test74()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setClassIndex("E<");
      findWithCapabilities0.setFilename("E<");
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
  public void test75()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      String string0 = findWithCapabilities0.getRevision();
      assertEquals("8034", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.disableNot((Capabilities.Capability) null);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      boolean boolean0 = findWithCapabilities0.handles(capabilities_Capability0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Capabilities.Capability capabilities_Capability0 = Capabilities.Capability.DATE_ATTRIBUTES;
      findWithCapabilities0.disable(capabilities_Capability0);
      assertEquals("", findWithCapabilities0.getFilename());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Vector<String> vector0 = findWithCapabilities0.getMisses();
      vector0.trimToSize();
      Vector<String> vector1 = findWithCapabilities0.getMisses();
      assertSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      findWithCapabilities0.setHandler(findWithCapabilities0);
      CapabilitiesHandler capabilitiesHandler0 = findWithCapabilities0.getHandler();
      assertSame(capabilitiesHandler0, findWithCapabilities0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      FindWithCapabilities findWithCapabilities0 = new FindWithCapabilities();
      Enumeration enumeration0 = findWithCapabilities0.listOptions();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
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
}
