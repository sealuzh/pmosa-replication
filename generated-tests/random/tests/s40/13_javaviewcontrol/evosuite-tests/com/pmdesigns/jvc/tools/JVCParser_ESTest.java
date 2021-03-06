/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:56:31 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParser;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParser_ESTest extends JVCParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[");
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
  public void test01()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String string0 = "\"[[+\"";
      StringReader stringReader0 = new StringReader("\"[[+\"");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "\"[[+\"";
      stringArray0[1] = "\"[[+\"";
      stringArray0[2] = "\"[[+\"";
      stringArray0[3] = "\"[[+\"";
      stringArray0[4] = "\"[[+\"";
      stringArray0[5] = "\"[[+\"";
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
  public void test02()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      pipedOutputStream0.write(7);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JVCParser jVCParser0 = new JVCParser(pushbackInputStream0);
      StringReader stringReader0 = new StringReader("X5ok<\tmwZ");
      jVCParser0.ReInit((Reader) stringReader0);
      jVCParser0.ReInit((Reader) stringReader0);
      jVCParser0.parse();
      jVCParser0.enable_tracing();
      jVCParser0.getNextToken();
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
  public void test03()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "MxUCV`]Bi/+1D0");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      Token token0 = jVCParser0.getToken(52);
      jVCParser0.jj_nt = token0;
      Token token1 = jVCParser0.getNextToken();
      token1.specialToken = jVCParser0.token;
      jVCParser0.jj_nt = token1;
      // Undeclared exception!
      try { 
        stringReader0.read((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)81;
      byte byte0 = (byte) (-19);
      byteArray0[1] = (byte) (-19);
      byteArray0[2] = (byte)10;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[3] = (byte) (-110);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[4] = (byte)77;
      byteArray0[5] = (byte)32;
      byteArray0[6] = (byte)104;
      byteArray0[7] = (byte)58;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "5";
      stringArray0[1] = "-debug";
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
  public void test05()  throws Throwable  {
      int int0 = 45;
      PipedInputStream pipedInputStream0 = new PipedInputStream(45);
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      StringReader stringReader0 = new StringReader("\")");
      jVCParser0.ReInit((Reader) stringReader0);
      jVCParser0.parse();
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream(pipedInputStream0, "_sb.append(\"\")\");", 45, 45, 65);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("-debug");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "-debug");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-debug";
      stringArray0[1] = "-debug";
      jVCParser0.getToken(1329);
      stringArray0[2] = "-debug";
      stringArray0[3] = "-debug";
      stringArray0[4] = "";
      stringArray0[5] = "-debug";
      JVCParser.main(stringArray0);
      jVCParser0.parse();
      jVCParser0.enable_tracing();
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = ",+UE#4xVIS(d~";
      stringArray0[1] = "\")";
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)104;
      byteArray0[2] = (byte) (-62);
      byteArray0[3] = (byte)73;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte)13;
      byteArray0[6] = (byte)84;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      JVCParser jVCParser0 = new JVCParser(dataInputStream0);
      String string0 = jVCParser0.parse();
      assertEquals("_sb.append(\"ch\uFFFDI\u0002\\r\");\r_sb.append(\"T\");", string0);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JVCParser jVCParser0 = new JVCParser((Reader) null);
      jVCParser0.token = null;
      jVCParser0.disable_tracing();
      // Undeclared exception!
      try { 
        jVCParser0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "pp`28) M2uZ";
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
  public void test11()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "    ");
      StringReader stringReader0 = new StringReader("    ");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.getToken((-1419));
      jVCParser0.getNextToken();
      jVCParser0.enable_tracing();
      stringReader0.read();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "    ";
      stringArray0[1] = " ";
      stringArray0[2] = null;
      JVCParser.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      JVCParser jVCParser0 = null;
      try {
        jVCParser0 = new JVCParser("RsT5o9wgVZA,O'[2q", set0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = null;
      JVCParser jVCParser0 = new JVCParser((JVCParserTokenManager) null);
      InputStream inputStream0 = null;
      SimpleCharStream simpleCharStream0 = null;
      try {
        simpleCharStream0 = new SimpleCharStream((InputStream) null, 100, 17, 17);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte)80;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-13);
      byteArray0[4] = (byte)93;
      byteArray0[5] = (byte) (-77);
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)117;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.read(byteArray0);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-13);
      byteArray1[1] = (byte)93;
      byteArray1[2] = (byte) (-77);
      byteArray1[3] = (byte)85;
      byteArrayInputStream0.read(byteArray1);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParser0.ReInit(jVCParserTokenManager0);
      jVCParser0.getToken((byte)117);
      assertEquals(100, jVCParser0.debugColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("H;J");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 100);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 100. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("if (_cached == null) {\n");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.parse();
      Token token0 = jVCParser0.jj_nt;
      jVCParser0.token = null;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      String string0 = "<WS>";
      try { 
        MockURI.URI("<WS>", "Warn: nested cache block in ", "<WS>", "Missing include file in ");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: <WS>://[Warn: nested cache block in ]%3CWS%3E#Missing%20include%20file%20in%20
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[0] = (byte)61;
      byteArray0[1] = (byte)7;
      byteArray0[2] = (byte)95;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 97, 4);
      JVCParser jVCParser0 = new JVCParser(byteArrayInputStream0);
      byteArrayInputStream0.close();
      jVCParser0.getToken(84);
      jVCParser0.getToken((byte)7);
      byteArrayInputStream0.skip(0L);
      byteArrayInputStream0.mark(2);
      Reader reader0 = null;
      jVCParser0.ReInit((Reader) null);
      // Undeclared exception!
      try { 
        jVCParser0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "R");
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
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      pipedInputStream0.close();
      JVCParser jVCParser0 = new JVCParser(pipedInputStream0);
      pipedInputStream0.mark(99);
      Token token0 = new Token(100);
      jVCParser0.parse();
      jVCParser0.jj_nt = token0;
      Token.newToken(99, "\"<1huG\"uV,O");
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      jVCParser0.debugColumn = 0;
      jVCParser0.getNextToken();
      jVCParser0.ReInit((InputStream) pipedInputStream0);
      jVCParser0.jj_nt = null;
      jVCParser0.parse();
      jVCParser0.parse();
      token0.beginLine = (-1626);
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = ">a,}N@IzN~3tCfbI";
      stringArray0[1] = "l}y";
      stringArray0[2] = "\");";
      stringArray0[3] = "Was expecting one of:";
      stringArray0[4] = "Was expecting:";
      stringArray0[5] = ", column ";
      stringArray0[6] = "-debug";
      stringArray0[7] = "(L!ce.s";
      stringArray0[8] = "E";
      JVCParser.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InputStream inputStream0 = null;
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
  public void test22()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager0.input_stream = null;
      JVCParser jVCParser0 = new JVCParser(jVCParserTokenManager0);
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
  public void test23()  throws Throwable  {
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-413));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<EOL>");
      JVCParser jVCParser0 = new JVCParser(stringReader0);
      jVCParser0.ReInit((Reader) stringReader0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(100);
      pipedInputStream0.close();
      jVCParser0.ReInit((InputStream) pipedInputStream0, (String) null);
      String[] stringArray0 = new String[0];
      JVCParser.main(stringArray0);
      Token token0 = jVCParser0.getToken(49);
      token0.specialToken = null;
      jVCParser0.ReInit((Reader) stringReader0);
      jVCParser0.token = token0;
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
}
