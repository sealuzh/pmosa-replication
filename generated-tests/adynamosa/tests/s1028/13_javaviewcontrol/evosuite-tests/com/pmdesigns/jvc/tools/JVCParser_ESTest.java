/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 20:08:35 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("yO-<=+\"F\"$^q$ $St7");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"yO-<=+\\\"F\\\"$^q$ $St7\");", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0, (String) null);
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}\n");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(662);
      assertNotNull(token0);
      assertEquals(1, token0.beginLine);
      assertEquals(0, token0.kind);
      
      jVCParser0.generateParseException();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        JVCParser.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0, (String) null);
      Token token0 = jVCParser0.getToken(0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?uE5tkc~t0{UG&4o'<");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken((-3059));
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit((Reader) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2382), (-2382));
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) byteArrayInputStream0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: 
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0, (String) null);
      jVCParser0.ReInit((InputStream) sequenceInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?uE5tkc~t0{UG&4o'<");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit((JVCParserTokenManager) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((Reader) stringReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("yO-<=+\"F\"$^q$ $St7");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1095), 16);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) byteArrayInputStream0, "3XHDsuM4;1adyw(qe");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: 3XHDsuM4;1adyw(qe
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0, (String) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>(17, 17);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((String) null, linkedHashSet0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.US;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("9Prp{-[&e", set0, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2754);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser(pipedInputStream0, "s,qC4xytR3#:C");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: s,qC4xytR3#:C
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = new JVCParser(sequenceInputStream0, (String) null);
      jVCParser0.ReInit((InputStream) sequenceInputStream0, (String) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("9Prp{-[&e");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "m\"pT|i{[vzO5");
      Locale locale0 = Locale.KOREA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser("9Prp{-[&e", set0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      // Undeclared exception!
      try { 
        jVCParser0.generateParseException();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.ParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("?");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(1562);
      assertEquals(1, token0.beginLine);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"?\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2754);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 1571);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      Token token0 = jVCParser0.getToken(2741);
      Token token1 = jVCParser0.getToken(384);
      assertNotSame(token1, token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Unbalanced tag at end of ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(10);
      assertEquals(10, token0.beginColumn);
      
      Token token1 = jVCParser0.getNextToken();
      assertEquals(1, token1.beginColumn);
      assertEquals(1, token1.beginLine);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getNextToken();
      assertNotNull(token0);
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit(jVCParser0.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 51, 51);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[==");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/[[=");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("B;[[");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}\n");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"}\\n\");\n", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\r");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"\\r\");\r", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[!\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      try { 
        jVCParser0.parse();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unbalanced tag at end of null
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("9Prp{-[&e");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Locale locale0 = Locale.US;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = new JVCParser("9Prp{-[&e", set0, true);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JVCParser.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("9Prp{-[&e", set0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("9Prp{-[&e");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "O(,");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "9Prp{-[&e";
      JVCParser.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_sb");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}
