/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:37:56 GMT 2019
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
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.io.PrintStream;
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
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (-1), 1478);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals((-1), token0.beginLine);
      assertEquals("\u0000", token0.toString());
      assertEquals(1478, token0.beginColumn);
      assertEquals(1478, token0.endColumn);
      assertEquals((-1), token0.endLine);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)3imb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.maxNextCharInd = 42;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals("\u0000", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)3imb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.maxNextCharInd = 42;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("rOmZePV=<u");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      simpleCharStream0.backup(4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(4092, simpleCharStream0.bufpos);
      assertEquals("\u0000", token0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("T@^$xDGiF_-_<95?Y<E");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.endColumn);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals("@", token1.toString());
      assertEquals(1, token1.endLine);
      assertEquals(2, token1.endColumn);
      assertEquals(1, token1.beginLine);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[=");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (-1), 2147450880);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(2147450882, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("rOmZePV=<u");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("r", token0.toString());
      
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token1 = jVCParserTokenManager1.getNextToken();
      assertEquals(2, token1.beginColumn);
      assertEquals(16, token1.kind);
      assertEquals(1, token1.beginLine);
      assertEquals(2, token1.endColumn);
      assertEquals(1, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)3imb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.jjFillToken();
      assertEquals(1, token0.beginColumn);
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\b");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\b");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0, 0);
      assertEquals(0, simpleCharStream0.getBeginLine());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(pipedInputStream0, 2593, (-2749), 246);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit((SimpleCharStream) null, (-2749));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2749. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, 13);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 13. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0, 1);
      assertFalse(SimpleCharStream.staticFlag);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)Jimb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, (byte) (-60), (byte) (-44));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.ReInit(simpleCharStream0, (int) (byte)31);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 31. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader(")&}\"'JPM");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager0.ReInit((SimpleCharStream) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)Jimb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      simpleCharStream0.bufpos = 34;
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(34, simpleCharStream0.bufpos);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)Jimb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(1, simpleCharStream0.getLine());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, (byte) (-60), (byte) (-60));
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.ReInit(simpleCharStream0);
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals((-60), simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager((SimpleCharStream) null);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.jjFillToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleCharStream simpleCharStream0 = new SimpleCharStream((Reader) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.pmdesigns.jvc.tools.SimpleCharStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 23, 1478);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = 21;
      jVCParserTokenManager0.jjmatchedKind = 2359;
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.getNextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(mockFileInputStream0, 23, 6);
      JVCParserTokenManager jVCParserTokenManager0 = null;
      try {
        jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 6);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 6. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 0, 0, 922);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo(922);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 922. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Z'p-z{ 1P");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0, 28, 0, 56);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      // Undeclared exception!
      try { 
        jVCParserTokenManager0.SwitchTo((-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.pmdesigns.jvc.tools.JVCParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[y[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("rOmZePV=<u");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 1);
      jVCParserTokenManager1.getNextToken();
      jVCParserTokenManager1.getNextToken();
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[y[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 23, (byte)0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = (int) (byte)11;
      jVCParserTokenManager0.jjmatchedKind = (int) (byte)11;
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(23, simpleCharStream0.bufpos);
      assertEquals(23, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("rOmZePV=<u");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token1 = jVCParserTokenManager1.getNextToken();
      assertEquals(1, token1.beginLine);
      assertEquals(2, token1.beginColumn);
      assertEquals("O", token1.toString());
      assertEquals(2, token1.endColumn);
      assertEquals(1, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      byteArray0[1] = (byte)126;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 1260, 1260);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1260, token0.beginLine);
      assertEquals(1260, token0.beginColumn);
      assertEquals(1260, token0.endColumn);
      assertEquals(6, token0.kind);
      assertEquals("\r", token0.toString());
      assertEquals(1260, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-60);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 34);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(bufferedInputStream0, (String) null);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals("\uFFFD", token0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 1260, 1260);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\r", token0.toString());
      assertEquals(1260, token0.endColumn);
      assertEquals(6, token0.kind);
      assertEquals(1260, token0.beginColumn);
      assertEquals(1260, token0.beginLine);
      assertEquals(1260, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)3imb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.curLexState = 0;
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(16, token0.kind);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.Token");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      JVCParserTokenManager jVCParserTokenManager1 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager1.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(".", token0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.Token");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 2);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals("c", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 1260, 1260);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 3);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(6, token0.kind);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-60);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals("\uFFFD", token0.toString());
      assertEquals(1, token0.endLine);
      assertEquals(1, token0.beginLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("/I");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]?;<(Z\"l-9");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0, 1);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(1, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[!");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      stringReader0.reset();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginLine());
      assertEquals(6, token0.endColumn);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\f");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(4);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals("\f", token0.toString());
      assertEquals(1, token0.beginColumn);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*{9D)3imb}*~");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.SwitchTo(4);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(7, token1.endColumn);
      assertEquals(1, token1.endLine);
      assertEquals("i", token1.toString());
      assertEquals(7, token1.beginColumn);
      assertEquals(1, token1.beginLine);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("_7J]|P$?@#Y <$ndN[m");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      stringReader0.read();
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginColumn);
      
      jVCParserTokenManager0.getNextToken();
      Token token1 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token1.beginLine);
      assertEquals("]", token1.toString());
      assertEquals(3, token1.endColumn);
      assertEquals(1, token1.endLine);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      byteArray0[1] = (byte)126;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 1260, 1260);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("\r", token0.toString());
      assertEquals(6, token0.kind);
      assertEquals(1260, token0.beginColumn);
      assertEquals(1260, token0.endColumn);
      assertEquals(1260, token0.endLine);
      assertEquals(1260, token0.beginLine);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-60);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(dataInputStream0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.beginColumn);
      assertEquals("\uFFFD", token0.toString());
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("]?;<(Z\"l-9");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals("]", token0.toString());
      assertEquals(1, token0.beginColumn);
      assertEquals(16, token0.kind);
      assertEquals(1, token0.beginLine);
      assertEquals(1, token0.endColumn);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(byteArrayInputStream0, 32, (byte)13);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(0, simpleCharStream0.bufpos);
      assertEquals(6, token0.kind);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[y[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      jVCParserTokenManager0.getNextToken();
      assertEquals(2, simpleCharStream0.bufpos);
      assertEquals(3, simpleCharStream0.getColumn());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"[[=\"");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.getNextToken();
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(3, simpleCharStream0.bufpos);
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[[+");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      Token token0 = jVCParserTokenManager0.getNextToken();
      assertEquals(1, simpleCharStream0.getBeginColumn());
      assertEquals(1, token0.endLine);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.pmdesigns.jvc.tools.SimpleCharStream");
      SimpleCharStream simpleCharStream0 = new SimpleCharStream(stringReader0);
      JVCParserTokenManager jVCParserTokenManager0 = new JVCParserTokenManager(simpleCharStream0);
      jVCParserTokenManager0.setDebugStream((PrintStream) null);
  }
}