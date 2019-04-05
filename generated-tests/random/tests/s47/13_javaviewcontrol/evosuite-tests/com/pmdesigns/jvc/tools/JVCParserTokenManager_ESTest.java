/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:08:45 GMT 2019
 */

package com.pmdesigns.jvc.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import com.pmdesigns.jvc.tools.Token;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JVCParserTokenManager_ESTest extends JVCParserTokenManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, 3201);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0, (String) null, (-1199), 10);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(10, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Error: Ignoring invalid lexical state : ");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<WS>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2, 2);
      simpleCharStream0.line = (-2078);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals((-2078), simpleCharStream0.getEndLine());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, 31, 2976, 2976);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(126);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 126. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 4);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals((-1), simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("DEFAULT");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (-1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginColumn);
      assertEquals(0, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endColumn);
      assertEquals("", token0.toString());
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0, 1289);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pushbackInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, (-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W<R");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
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
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W<R");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals(2, token0.beginColumn);
      assertEquals(2, token0.beginLine);
      assertEquals("W", token0.toString());
      assertEquals(2, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, 31, 2976, 2976);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      StringReader stringReader0 = new StringReader("hiy]}hJ");
      simpleCharStream0.inputStream = (Reader) stringReader0;
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(31, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<WS>");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, token0.endLine);
      assertEquals(2, token0.beginLine);
      assertEquals(2, token0.endColumn);
      assertEquals(16, token0.kind);
      assertEquals("<", token0.toString());
      assertEquals(2, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W<R");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals("W", token0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Error: Ignoring invalid lexical state : ");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 4);
      pipedOutputStream0.write(17);
      pipedOutputStream0.write((-2729));
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(16, token0.kind);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token1.endLine);
      assertEquals("W", token1.toString());
      assertEquals(1, token1.beginLine);
      assertEquals(2, token1.beginColumn);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 4);
      pipedOutputStream0.write(17);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 4);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-6);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 8, 32);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(32, simpleCharStream0.getBeginColumn());
      assertEquals(8, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("W<R");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 2, 2, 2);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[+\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.getBeginColumn());
      assertEquals(4, simpleCharStream0.getEndColumn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null, 4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }
}