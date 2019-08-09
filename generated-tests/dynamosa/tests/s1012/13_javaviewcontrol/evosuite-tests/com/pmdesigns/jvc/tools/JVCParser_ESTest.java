/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 16:18:51 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.ParseException;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
      StringReader stringReader0 = new StringReader("kQWfrf\"0fdC");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"kQWfrf\\\"0fdC\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String string0 = jVCParser0.parse();
      assertEquals("", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]E.qPR6kn nditC64ED");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.getToken(1087);
      ParseException parseException0 = jVCParser0.generateParseException();
      assertNotNull(parseException0);
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
      StringReader stringReader0 = new StringReader("kQWfrf\"0fdC");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken((-1183));
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(0, token0.beginColumn);
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      jVCParser0.ReInit((Reader) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      StringReader stringReader0 = new StringReader("@8|v7h>wYdmHP>:?M=");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) pipedInputStream0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: 
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      jVCParser0.ReInit((JVCParserTokenManager) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      JVCParser jVCParser0 = new JVCParser(dataInputStream0);
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = " Nl8- y{<kt{Q";
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
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      // Undeclared exception!
      try { 
        jVCParser0.getToken(100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("'A:");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (byte)7);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      simpleCharStream0.ReInit((InputStream) sequenceInputStream0, 1648, 100);
      // Undeclared exception!
      try { 
        jVCParser0.getToken(92);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 991, 5);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
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
  public void test13()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) dataInputStream0, " ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException:  
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader(")>r");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        jVCParser0.ReInit((InputStream) pipedInputStream0, "!WjEM3\b/#= Rd&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
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
  public void test16()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
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
  public void test17()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("0000", linkedHashSet0, true);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((String) null, set0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("'}}@?p:wN<)-Jg+{wO", set0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser(sequenceInputStream0, "lqHm7w>(;ifxtC");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.UnsupportedEncodingException: lqHm7w>(;ifxtC
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((InputStream) null, "VW'{)7Zv{!.cx+nU!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 4907, (-772));
      jVCParser0.ReInit((InputStream) byteArrayInputStream0, (String) null);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'}}@?p:wN<)-Jg+{w");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "^");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = new JVCParser("'}}@?p:wN<)-Jg+{w", set0);
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
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'}}@?p:wN<)-Jg+{w");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "^");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = new JVCParser("'}}@?p:wN<)-Jg+{w", set0);
      Token token0 = jVCParser0.getToken(95);
      assertEquals(0, token0.kind);
      
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"^\\n\");\n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      StringReader stringReader0 = new StringReader("t");
      jVCParser0.ReInit((Reader) stringReader0);
      Token token0 = jVCParser0.getToken(100);
      Token token1 = jVCParser0.getToken(1);
      assertNotSame(token1, token0);
      assertEquals(16, token1.kind);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotNull(token1);
      assertEquals(1, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      StringReader stringReader0 = new StringReader("t");
      jVCParser0.ReInit((Reader) stringReader0);
      Token token0 = jVCParser0.getToken(100);
      assertNotNull(token0);
      assertEquals(1, token0.endColumn);
      
      Token token1 = jVCParser0.getNextToken();
      assertEquals(16, token1.kind);
      assertEquals(100, jVCParser0.debugColumn);
      assertNotSame(token1, token0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'}}@?p:wN<)-Jg+{w");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "^");
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      JVCParser jVCParser0 = new JVCParser("'}}@?p:wN<)-Jg+{w", set0);
      Token token0 = jVCParser0.getNextToken();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals(1, token0.beginColumn);
      assertNotNull(token0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]E.qPR6kn nditC64ED");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit(jVCParser0.token_source);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)13);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals(100, jVCParser0.debugColumn);
      assertEquals("_sb.append(\"\\r\");\r_sb.append(\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\");", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      StringReader stringReader0 = new StringReader("\"[[=\"");
      jVCParser0.ReInit((Reader) stringReader0);
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
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        JVCParser.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JVCParser.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.ReInit((InputStream) bufferedInputStream0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      JVCParser jVCParser0 = new JVCParser(bufferedInputStream0);
      jVCParser0.enable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      jVCParser0.disable_tracing();
      assertEquals(100, jVCParser0.debugColumn);
  }
}
