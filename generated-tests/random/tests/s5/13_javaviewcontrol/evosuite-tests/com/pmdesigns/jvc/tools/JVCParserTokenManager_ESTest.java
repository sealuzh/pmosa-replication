/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 13:22:39 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_EXPR2");
      FileSystemHandling.shouldAllThrowIOExceptions();
      stringReader0.mark(1175);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.endColumn);
      
      jVCParserTokenManager0.defaultLexState = 3;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      Token token1 = jVCParserTokenManager0.jjFillToken();
      assertEquals(3, token1.beginColumn);
      
      Token token2 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token2.endLine);
      assertEquals(1, token2.beginLine);
      assertEquals("E", token2.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)3;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (String) null, (byte)3, 2155, 3292);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (byte)3);
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 2257);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 2257. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("zLmY}9{ERi6Qw-N_M");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1701, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      stringReader0.read();
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      simpleCharStream0.bufpos = (-1);
      jVCParserTokenManager0.input_stream.adjustBeginLineColumn(60, Integer.MIN_VALUE);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.curChar = 's';
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-2147483646));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2147483646. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-2119L));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[4];
      pipedInputStream0.markSupported();
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)13;
      pipedOutputStream0.write(byteArray0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(2, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte) (-79);
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte)13;
      byte byte0 = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)20;
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "[[==";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "[[==");
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte)13, (byte) (-103));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      SimpleCharStream simpleCharStream1 = new SimpleCharStream(byteArrayInputStream0);
      jVCParserTokenManager0.input_stream = simpleCharStream1;
      jVCParserTokenManager0.getNextToken();
      byteArrayInputStream0.markSupported();
      jVCParserTokenManager0.SwitchTo(1);
      jVCParserTokenManager0.ReInit(simpleCharStream1);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((byte) (-79));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -79. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("}]B3&v<z");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      stringReader0.read();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream("]", "}]B3&v<z");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // }]B3&v<z
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("D;]T=Q{bd,COKIAG#");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.maxNextCharInd = 29;
      int int0 = (-1737);
      char[] charArray0 = new char[8];
      charArray0[0] = 'R';
      jVCParserTokenManager0.jjround = 4096;
      charArray0[1] = '$';
      charArray0[2] = 'b';
      charArray0[3] = 'Z';
      charArray0[4] = ']';
      charArray0[5] = 'I';
      charArray0[6] = '^';
      charArray0[7] = 'Z';
      stringReader0.read(charArray0);
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      jVCParserTokenManager0.jjmatchedKind = (-1737);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjnewStateCnt = (-2843);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(8);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 8. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-106);
      byteArray0[1] = (byte)48;
      byteArray0[2] = (byte) (-120);
      byteArray0[3] = (byte)18;
      byteArray0[4] = (byte)33;
      byteArray0[5] = (byte)45;
      byteArray0[6] = (byte)32;
      byteArray0[7] = (byte)6;
      byteArray0[8] = (byte)35;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      stringReader0.mark(8);
      stringReader0.mark(8);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 25, 25, 25);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.jjround = 841;
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(25, simpleCharStream0.getBeginLine());
      assertEquals(27, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringReader stringReader0 = new StringReader("'");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 37, 37);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(37, token0.endLine);
      assertEquals(37, token0.beginColumn);
      assertEquals("'", token0.toString());
      assertEquals(37, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(37, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-2119L));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[4];
      pipedInputStream0.markSupported();
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)13;
      pipedOutputStream0.write(byteArray0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals("Z", token0.toString());
      
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      jVCParserTokenManager0.getNextToken();
      Token token1 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, token1.endLine);
      assertEquals(6, token1.kind);
      
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      Token token2 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token2.kind);
      assertEquals(2, token2.beginLine);
      assertEquals(1, token2.beginColumn);
      assertEquals(1, token2.endColumn);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("G[");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 597, 597, 597);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjmatchedKind = (-773);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      jVCParserTokenManager0.jjround = 16;
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte) (-83);
      byteArray0[2] = (byte) (-32);
      byteArray0[3] = (byte)21;
      byteArray0[4] = (byte) (-89);
      byteArray0[5] = (byte)14;
      byteArray0[6] = (byte)4;
      byteArray0[7] = (byte)26;
      byteArray0[8] = (byte)32;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.bufpos);
      
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(598, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("%3\"");
      char[] charArray0 = new char[0];
      stringReader0.read(charArray0);
      stringReader0.read();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)69;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 32, 32, 29);
      stringReader0.read();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = 32;
      jVCParserTokenManager0.defaultLexState = (-3630);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      stringReader0.read(charBuffer0);
      jVCParserTokenManager0.jjround = (-3630);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 32);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 32. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjmatchedPos = 25;
      MockPrintStream mockPrintStream0 = new MockPrintStream("[[!");
      char[] charArray0 = new char[2];
      charArray0[0] = '$';
      charArray0[1] = 'y';
      stringReader0.read(charArray0);
      mockPrintStream0.println(2);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
      int int0 = 6;
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 6);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 6. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<START_CACHE_BLOCK>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-2119L));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[4];
      pipedInputStream0.markSupported();
      byteArray0[0] = (byte)90;
      byteArray0[1] = (byte)13;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte) (-62);
      pipedOutputStream0.write(byteArray0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Reader reader0 = null;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      simpleCharStream0.line = 1055;
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 1055);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 1055. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Bwh-290KB^");
      int int0 = 93;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 93, 93);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      jVCParserTokenManager0.jjnewStateCnt = 93;
      stringReader0.ready();
      File file0 = MockFile.createTempFile(" OvB-TInEqX", "{");
      simpleCharStream0.available = (-2912);
      String string0 = "";
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream(file0, "");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      int int0 = 0;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 0);
      int int1 = 57;
      jVCParserTokenManager0.jjmatchedKind = 57;
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 57
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("zLmY}9{ERi6Qw-N_M");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 1701, 4);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 4);
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      stringReader0.read();
      jVCParserTokenManager0.input_stream = simpleCharStream0;
      simpleCharStream0.bufpos = 8;
      jVCParserTokenManager0.input_stream.adjustBeginLineColumn(60, Integer.MIN_VALUE);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.curChar = 's';
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-2147483646));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2147483646. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      String string0 = "\"[[\"";
      StringReader stringReader0 = new StringReader("\"[[\"");
      int int0 = 92;
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 91, 92, 91);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 26, 26, 105);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (-2434));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2434. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedInputStream0.skip((-2119L));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)90;
      byteArray0[0] = (byte)13;
      byteArray0[2] = (byte)90;
      byteArray0[3] = (byte)0;
      pipedOutputStream0.write(byteArray0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.jjFillToken();
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(2, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = null;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(58);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 58. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }
}
